package Parcial1;

import Parcial1.entities.Recomendacion;
import Parcial1.entities.Usuario;
import Parcial1.entities.Vino;
import Parcial1.exceptions.EntidadNoExiste;
import Parcial1.exceptions.EntidadYaExiste;
import StackQueue.src.linkedlist.MyLinkedListImpl;
import StackQueue.src.linkedlist.MyList;
import StackQueue.src.queue.EmptyQueueException;

public class TuVinoImpl implements TuVinoMgt {
    private MyList<Vino> vinosRegistrados = new MyLinkedListImpl<>();

    private MyList<Usuario> usuariosRegistrados = new MyLinkedListImpl<>();
    public MyList<Vino> getVinosRegistrados() {
        return vinosRegistrados;
    }
    public MyList<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    @Override
    public void crearVino(String nombre, String variedad, String pais, int cosecha) throws EntidadYaExiste {
        Vino newVino = new Vino(nombre, variedad, pais, cosecha);
        if(vinosRegistrados.contains(newVino)){
            throw new EntidadYaExiste("Entidad ya Existe");
        }
        vinosRegistrados.add(newVino);
    }

    @Override
    public void agregarVinoQueGusta(int cedula, String nombreVino) throws EntidadNoExiste, EntidadYaExiste {
        try {
            agregarPersona(cedula);
        }catch (EntidadYaExiste e){

        }
        Vino vinoQueLeGusta = obtenerVino(nombreVino);
        Usuario usuarioAgregarLike = obtenerUsuario(cedula);

        if (vinoQueLeGusta == null){
            throw new EntidadNoExiste("Este Vino no existe");
        }
        if (usuarioAgregarLike.getMeGusta().contains(vinoQueLeGusta)) {
            throw new EntidadYaExiste("Este Vino ya fue agregado");
        }
        usuarioAgregarLike.getMeGusta().add(vinoQueLeGusta);
    }

    public void agregarPersona(int cedula) throws EntidadYaExiste {
        Usuario newUsuario = new Usuario(cedula);
        if (usuariosRegistrados.contains(newUsuario)){
            throw new EntidadYaExiste("Usuario ya existe");
        }
        usuariosRegistrados.add(newUsuario);
    }

    @Override
    public void agregarRecomendación(int cedula, int cedulaARecomendar, String nombreVino) throws EntidadNoExiste, EntidadYaExiste {
        Usuario usuarioRecomienda = obtenerUsuario(cedula);
        Usuario usuarioRecomendado = obtenerUsuario(cedulaARecomendar);
        Vino vinoRecomendado = obtenerVino(nombreVino);

        if (usuarioRecomendado == null || usuarioRecomienda == null){
            throw new EntidadNoExiste("uno de los dos usuarios no existe");
        }
        if (vinoRecomendado == null){
            throw new EntidadNoExiste("El vino no existe");
        }
        if (!usuarioRecomienda.getMeGusta().contains(vinoRecomendado)){
            throw new EntidadNoExiste("El vino no esta en tu lista de me gusta");
        }
        //Verifico que exista los usuarios y el vino y extraigo los datos

        Recomendacion newRecomendacion = new Recomendacion(vinoRecomendado, usuarioRecomienda);
        if (usuarioRecomendado.getRecomendaciones().contains(newRecomendacion)){
            throw new EntidadYaExiste("Esta recomendacion ya existe");
        }
        usuarioRecomendado.getRecomendaciones().enqueue(newRecomendacion);
    }

    @Override
    public Vino obtenerProximaRecomendación(int cedula) throws EmptyQueueException {
        Usuario usuario = obtenerUsuario(cedula);
        try {
            return usuario.getRecomendaciones().dequeue().getVinoARecomendar();
        }catch (EmptyQueueException e){
            return null;
        }
    }

    public Usuario obtenerUsuario (int cedula){
        Usuario usuario = null;
        for (int c = 0; c<usuariosRegistrados.size(); c++){
            if (usuariosRegistrados.get(c).getCedula() == cedula){
                usuario = usuariosRegistrados.get(c);
            }
        }
        return usuario;
    }

    public Vino obtenerVino (String nombreVino){
        Vino vino = null;
        for (int c = 0; c<vinosRegistrados.size(); c++){
            if (vinosRegistrados.get(c).getNombre() == nombreVino){
                vino = vinosRegistrados.get(c);
            }
        }
        return vino;
    }

    @Override
    public void intercambiarVinos(int cedula, String nombreVino1, String nombreVino2) throws EntidadNoExiste {

    }

    @Override
    public void eliminarOcurrenciasRepetidasVino(int cedula, String nombreVino) throws EntidadNoExiste {

    }
}
