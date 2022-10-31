// Call the dataTables jQuery plugin
$(document).ready(function() {

  loadEmployees();
  $('#dataTable').DataTable();
});


async function loadEmployees() {

    const request = await fetch('/employees',{
      method: 'GET',
      HEADERS: {
        'Accept': 'application/json',
        'Content-Type' : 'application/json'
      },
    });
    const employees = await request.json();
    console.log(employees);
    console.log(employees.length)
    for (let i =0; i < employees.length; i++){

        let tr = `<tr>
          <td>`+employees[i].id+`</td>
          <td>`+employees[i].name+`</td>
          <td>`+employees[i].email+`</td>
          <td>`+employees[i].role+`</td>
          <td>`+employees[i].enterprise+`</td>
          <td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td>
          </tr>`;

        $('#EmployeeTable').append(tr)

    }
}