$(document).on("click", "#saveEnterprise", async function() {

    let name = $("#name").val();
    let address = $("#address").val();
    let phone = $("#phone").val();
    let nit = $("#nit").val();
    let request = {
        "name" : name,
        "address" : address,
        "phone" : phone,
        "nit" : nit,
    }
    console.log(request);
    fetch('/saveEnterprise',{
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

    alert( "Empresa creada satisfactoriamente")
});