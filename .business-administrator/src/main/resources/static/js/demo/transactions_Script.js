// Call the dataTables jQuery plugin
$(document).ready(function() {

    loadEmployees();
    $('#dataTable').DataTable();
});


async function loadEmployees() {

    const request = await fetch('/transactions',{
        method: 'GET',
        HEADERS: {
            'Accept': 'application/json',
            'Content-Type' : 'application/json'
        },
    });
    const transactions = await request.json();

    console.log(transactions);
    console.log(transactions.length)
    let Total = 0;
    for (let i =0; i < transactions.length; i++){

        let tr = `<tr>
          <td>`+transactions[i].id+`</td>
          <td>`+transactions[i].concept+`</td>
          <td>`+transactions[i].amount+`</td>
          <td>`+transactions[i].date+`</td>
          <td>`+transactions[i].user+`</td>
          <td><button id="remove" transactionID=`
            +transactions[i].id+
            `"href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></button></td>          
        </tr>`;

        Total += transactions[i].amount;
        $('#TransactionTable').append(tr)
        }
    $('#Total').append(Total)
    console.log(Total)
}