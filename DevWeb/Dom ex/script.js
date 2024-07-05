const squadForm = document.getElementById("squadForm");
const squadButton = document.getElementsById("squadSave").value;

    if(squadButton.textContent == "Salvar Alterações"){
        alert("Update");
        return;
    }
    
squadForm.addEventListener("submit", function(event) {
    event.preventDefault();

    const squadName = document.getElementById("squadName").value;
    const squadLeader = document.getElementById("squadLeader").value;
    const squadMembers = document.getElementById("squadMembers").value;
    

    const newRow = document.createElement("tr");

    const tdName = document.createElement("td");
    const tdLeader = document.createElement("td");
    const tdMembers = document.createElement("td");

    tdName.appendChild(document.createTextNode(squadName));
    tdLeader.appendChild(document.createTextNode(squadLeader));
    tdMembers.appendChild(document.createTextNode(squadMembers));

    newRow.appendChild(tdName);
    newRow.appendChild(tdLeader);
    newRow.appendChild(tdMembers);

    const tdAction = document.createElement("td");

    const btEdit = document.createElement("button")
    btEdit.textContent = "Editar";
    btEdit.addEventListener("click", function () {
        const row = this.closest("tr").rowIndex;
        const squadName = squadTable.rows[row].cells[0].textContent;
        const squadLeader = squadTable.rows[row].cells[1].textContent;
        const squadMembers= squadTable.rows[row].cells[2].textContent;
      
        document.getElementById("squadName").value = squadName;
        document.getElementById("squadLeader").value = squadLeader;
        document.getElementById("squadMembers").value = squadMembers;

        document.getElementsById("squadRow").value = row;
        document.getElementsById("squadSave").textContent = "Salvar Alterações";
    })
    
        //document.getElementsById("squadCancel").remove();

    const btDelete = document.createElement("button")
    btDelete.textContent = "Remover";
    btDelete.addEventListener("click", function () {
        if (confirm("Confirma a exclusão do cadastro desta SQUAD?")) {
            document.getElementById("squadTable")
                .deleteRow(this.closest("tr").rowIndex);
        }
    });

    tdAction.appendChild(btEdit);
    tdAction.appendChild(btDelete);

    newRow.appendChild(tdAction);

    document.getElementById("squadTable").appendChild(newRow);

    squadForm.reset();
})