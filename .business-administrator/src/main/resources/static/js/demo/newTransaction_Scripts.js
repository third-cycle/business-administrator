$(document).on("click", "#saveTransaction", async function() {

    let monto = $("#monto").val();
    let concepto = $("#concepto").val();
    let fecha = $("#fecha").val();
    let request = {
        "amount" : monto,
        "concept" : concepto,
        "date" : fecha
    }
    console.log(request);
    fetch('/saveTransactions',{
        method: 'POST',
        body: JSON.stringify(request),
        headers: {
            "Content-type": "application/json"
        }
    })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
        })
        .catch((error) => {
            console.error('Error:', error);
        });

    alert( "Movimiento de dinero guardado satisfactoriamente")
});