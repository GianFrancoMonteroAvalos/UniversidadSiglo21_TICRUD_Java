Por empezar el trabajo lo realice en maven, agregue las dependencias, conecte la base de datos
utilizando workbench, en la clase main lo conecte a la BD. En el package Interfaces cree la lógica
del CRUD conectandola a workbench y que haga las consultas de registrar, modificar, eliminar, mostrar clientes,
en DAOCliente realice las interfaces para que se pueda realizar un codigo mas legile y escalable con el tiempo. 
Luego en Personas realice la clase cliente para instanciarlo y ponerle los getters and setters. 
Ya generando lo realizado pude continuar con el diseño y darle la lógica
a cada boton de registrar, guardar, modificar, eliminar, mostrar a los clientes que interactuen con la plataforma. 
Cree dos métodos de habilitar e inhabilitar para que el usuario no pueda tocar los botones
cualquier otro boton que no sea para registrarse o para salir, tambien hice el metodo mostrar 
implementandolo de la clase ClienteImplementacion para que traiga al metodo y se pueda ver el listado de usuarios registrados en la BD. 
A continuacion cada vez que un cliente se registra, se habilita el boton guardar para que el cliente se cargue a la base de datos,
a su ves hace la validación para que los campos no esten vacios y del caso contrario se suben. 
Tambien le agregue una funcionalidad para que cuando se presione un nombre en la tabla de usuarios 
puedas modificarlo asi cambiando de nombre el boton guardar por editar y que te de un mensaje cuando lo modifiques correctamente. 
Luego al boton eliminar le da una validación que en caso de que hayas seleccionado un cliente te de la opción de eliminarlo de la lista.


