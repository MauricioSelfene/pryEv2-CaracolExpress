package modelos;
/**
 *
 * @author mselfene
 */
public class Encomienda {
    private int id;
    private String destinatario;
    private String direccion;
    private String tipoEncomienda;
    private boolean entregaDomicilio;
    private String tamanoEncomienda;
    private String remitente;

    public Encomienda() {
    }

    public Encomienda(int id, String destinatario, String direccion, String tipoEncomienda, boolean entregaDomicilio, String tamanoEncomienda, String remitente) {
        this.id = id;
        this.destinatario = destinatario;
        this.direccion = direccion;
        this.tipoEncomienda = tipoEncomienda;
        this.entregaDomicilio = entregaDomicilio;
        this.tamanoEncomienda = tamanoEncomienda;
        this.remitente = remitente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoEncomienda() {
        return tipoEncomienda;
    }

    public void setTipoEncomienda(String tipoEncomienda) {
        this.tipoEncomienda = tipoEncomienda;
    }

    public boolean isEntregaDomicilio() {
        return entregaDomicilio;
    }

    public void setEntregaDomicilio(boolean entregaDomicilio) {
        this.entregaDomicilio = entregaDomicilio;
    }

    public String getTamanoEncomienda() {
        return tamanoEncomienda;
        
    }

    public void setTamanoEncomienda(String tamanoEncomienda) {
        this.tamanoEncomienda = tamanoEncomienda;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    @Override
    public String toString() {
        return "Encomienda{" + "id=" + id + ", destinatario=" + destinatario + ", direccion=" + direccion + ", tipoEncomienda=" + tipoEncomienda + ", entregaDomicilio=" + entregaDomicilio + ", tamanoEncomienda=" + tamanoEncomienda + ", remitente=" + remitente + '}';
    }
    
    
    
    
}
