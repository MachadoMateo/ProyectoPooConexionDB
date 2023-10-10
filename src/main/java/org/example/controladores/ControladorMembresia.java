package org.example.controladores;

import org.example.entidades.UsuarioMembresia;
import org.example.servicios.ServicioAfiliado;

public class ControladorMembresia {

    //llamar a la clase que valida
    UsuarioMembresia usuarioMembresia = new UsuarioMembresia();

    //llamar al servicio
    ServicioAfiliado servicioAfiliado = new ServicioAfiliado();

    public void registrarAfiliado(String nombre, String documento, String correo, Integer ubicacion){
        //utilizar los set del usuariomembresia para validar los datos
        this.usuarioMembresia.setNombre(nombre);
        this.usuarioMembresia.setDocumento(documento);
        this.usuarioMembresia.setCorreo(correo);
        this.usuarioMembresia.setUbicacion(ubicacion);


        //TAREA: SI TODOS LOS DATOS DEL USUARIO SE CARGARON CON EL SET Y NO HUBO ERRORES
        //llamo al servicio para guardar los datos
        this.servicioAfiliado.registrarAfiliado(usuarioMembresia);

    }
}
