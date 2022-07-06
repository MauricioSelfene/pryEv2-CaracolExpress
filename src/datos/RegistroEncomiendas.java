package datos;
/**
 *
 * @author mselfene
 */
import java.util.ArrayList;
import javax.swing.JTextField;
import modelos.Encomienda;


public class RegistroEncomiendas {
    
    public static ArrayList<Encomienda> coleccion = new ArrayList<Encomienda>();
    
    public static boolean agregar (Encomienda nueva) {
        int indice = buscarId(nueva.getId());
        if(indice == -1){
            coleccion.add(nueva);
            return true;
        } else {
            return false;   
        }
    }
    
    public static boolean modificar (Encomienda encomienda) {
        int indice = buscarId(encomienda.getId());
        if (indice == -1){
            return false;
        }else{
            //coleccion.get(indice).setId(encomienda.getId());
            coleccion.get(indice).setDestinatario(encomienda.getDestinatario());
            coleccion.get(indice).setDireccion(encomienda.getDireccion());
            coleccion.get(indice).setEntregaDomicilio(encomienda.isEntregaDomicilio());
            coleccion.get(indice).setRemitente(encomienda.getRemitente());
            coleccion.get(indice).setTipoEncomienda(encomienda.getTipoEncomienda());
            coleccion.get(indice).setTamanoEncomienda(encomienda.getTamanoEncomienda());
            
            return true;
        }
    }
    
    public static int buscarId(int idbuscado) {
        int indice = -1;
        for (int i = 0; i<coleccion.size(); i++) {
            if(coleccion.get(i).getId() == idbuscado) {
                return i;
            }     
        }
        return indice;
    }
    public static ArrayList<Encomienda> listarId (int id){
        ArrayList<Encomienda> lista = new ArrayList<>();
        for (int i = 0; i <coleccion.size(); i++) {
            if(coleccion.get(i).getId() == id) {
                lista.add(coleccion.get(i));
                break;
            }
        }
        return lista;
    }
            
            
    public static ArrayList<Encomienda> listarTodas(){
        ArrayList<Encomienda> lista = new ArrayList<>();
        for (Encomienda encomienda : coleccion) {
            lista.add(encomienda);
        }
        return lista;
    }
    
    public static boolean eliminar(int idEliminar) {
        int indice = buscarId(idEliminar);
        if(indice == -1) {
            System.out.println("ID "+ idEliminar + "No Existe en la Coleccion");
            return false;
        }else{
            System.out.println(coleccion.get(indice).getId() + "Ha Sido Removida");
            coleccion.remove(indice);
            return true;
        }
    }

    public static Encomienda listarId(JTextField txt_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
