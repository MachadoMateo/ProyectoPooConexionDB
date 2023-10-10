package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entidades.UsuarioMembresia;
import org.example.modelosdatos.ModeloUsuario;
import org.example.modelosdatos.ModeloUsuarioMembresia;

import java.util.List;

public class ServicioAfiliado {

    public void registrarAfiliado(UsuarioMembresia usuarioMembresia){
        //name of translate for to do persistence
        String configuracionPersistencia="conexionbd";

        // we crate  variable for a conexion and create a variable for controle the app
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(configuracionPersistencia);
            entityManager = entityManagerFactory.createEntityManager();

            // to create a model of dates and i'll a charge with information
            ModeloUsuarioMembresia modeloUsuarioMembresia=new ModeloUsuarioMembresia();
            modeloUsuarioMembresia.setNombre(modeloUsuarioMembresia.getNombre());
            modeloUsuarioMembresia.setNombre(modeloUsuarioMembresia.getDocumento());


            //begin a produciton
            entityManager.getTransaction();

            //activar persistencia
            entityManager.persist(modeloUsuarioMembresia);
            //registro de la operacion
            entityManager.getTransaction().commit();

            System.out.println("Exito en la transacción, Usuario registrado con exito");


        } catch (Exception error){
            System.out.println("Fallamos "+error.getMessage());

        }finally {
            if (entityManager != null){
                entityManager.clear();

            }if (entityManagerFactory != null){
                entityManagerFactory.close();
            }
        }
    }

    public List<ModeloUsuarioMembresia> buscarUsuarioMembresia(){
        return null;
    }
}
