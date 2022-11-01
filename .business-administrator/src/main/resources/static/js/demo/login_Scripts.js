$(document).on("click", "#submit", function() {

    let InputUserName = $('#InputUserName').val();
    let InputPassword = $("#InputPassword").val();

    if (!InputUserName || !InputPassword ) {
        alert('No debe haber campos vacíos')
    }else {
        if (InputUserName == "Admin@user" && InputPassword == "Admin2022") {


            let url = "http://localhost:8080/Dashboard.html"
            var close = window.close();
            abrirNuevoTab(url);

        } else {
            alert('Usuario o Contraseña incorrecta')
        }
    }
});

function abrirNuevoTab(url) {
    // Abrir nuevo tab
    var close = window.close();
    var win = window.open(url, '_blank');
    // Cambiar el foco al nuevo tab (punto opcional)
    win.focus();
}
$('#open').click(function(){
    abrirNuevoTab('https://programacionextrema.com')
})