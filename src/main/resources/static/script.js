const API_URL = "http://localhost:8080/applications";

function addApplication() {
    const companyEl = document.getElementById("company");
    const roleEl = document.getElementById("role");
    const statusEl = document.getElementById("status");
    const notesEl = document.getElementById("notes");

    if (!companyEl || !roleEl || !statusEl || !notesEl) {
        console.error("Input element not found");
        return;
    }

    fetch(API_URL, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            companyName: companyEl.value,
            role: roleEl.value,
            status: statusEl.value,
            notes: notesEl.value
        })
    })
    .then(() => loadApplications())
    .catch(err => console.error(err));
}

function loadApplications() {
    fetch(API_URL)
        .then(res => res.json())
        .then(data => {
            const list = document.getElementById("list");
            list.innerHTML = "";
            data.forEach(app => {
                list.innerHTML += `
                    <div class="card">
                        <b>${app.companyName}</b><br/>
                        Role: ${app.role}<br/>
                        Status: ${app.status}<br/>
                        Notes: ${app.notes}
                    </div>
                `;
            });
        });
}

document.getElementById("addBtn")
    .addEventListener("click", addApplication);

loadApplications();
