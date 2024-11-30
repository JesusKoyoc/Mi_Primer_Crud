// Funcion para la alerta eliminar
function mensajeEliminar(id) {
    swal({
        title: "¿Estás seguro de eliminar el registro?",
        text: "Esta acción no se puede deshacer.",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
    .then((OK) => { // si el usuario da a OK
        if (OK) {
            $.ajax({
                url: "/eliminar/" + id,
                method: "GET", // Asegura que usa el método correcto
                success: function(resp) {
                    swal("¡Registro eliminado!", {
                        icon: "success",
                    }).then(() => {
                        location.href = "/listar"; // Redirige solo si elimina exitosamente
                    });
                },
                error: function(err) {
                    swal("¡Error!", "No se pudo eliminar el registro.", "error");
                    console.error(err);
                }
            });
        } else {
            swal("El registro está seguro.");
        }
    });
}
