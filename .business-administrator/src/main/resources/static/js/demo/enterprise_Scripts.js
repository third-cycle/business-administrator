// Call the dataTables jQuery plugin
$(document).ready(function() {

    loadEmployees();
    $('#dataTable').DataTable();
});


async function loadEmployees() {

    const request = await fetch('/enterprises',{
        method: 'GET',
        HEADERS: {
            'Accept': 'application/json',
            'Content-Type' : 'application/json'
        },
    });
    const enterprises = await request.json();

    console.log(enterprises);
    console.log(enterprises.length)
    for (let i =0; i < enterprises.length; i++){

        let tr = `<tr>
          <td>`+enterprises[i].id+`</td>
          <td>`+enterprises[i].name+`</td>
          <td>`+enterprises[i].address+`</td>
          <td>`+enterprises[i].phone+`</td>
          <td>`+enterprises[i].nit+`</td>
          <td><button id="remove" enterpriseID=`
            +enterprises[i].id+
            `"href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></button></td>          
        </tr>`;

        $('#EnterpriseTable').append(tr)

    }
}