$(document).on("click", "#saveEmployee", async function() {

    let nombre = $("#nombre").val();
    let correo = $("#correo").val();
    let rol = $("#rol").val();
    let request = {
        "name" : nombre,
        "email" : correo,
        "role" : rol
    }
    console.log(request);
    fetch('/saveUser',{
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

    alert( "Usuario creado satisfactoriamente")
});