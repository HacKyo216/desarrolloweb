
package Modelo;

/**
 *
 * @author Andres
 */
public class Cliente {
    int id_cliente;
    String nom_cliente;
    String ape_cliente;
    String dir_cliente;
    String ciudad_cliente;
    String telf_cliente;
    String Fnaci_cliente;
    String Correo_cliente;
    String Contrasena_cliente;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nom_cliente, String ape_cliente, String dir_cliente, String ciudad_cliente, String telf_cliente, String Fnaci_cliente, String Correo_cliente, String Contrasena_cliente) {
        this.id_cliente = id_cliente;
        this.nom_cliente = nom_cliente;
        this.ape_cliente = ape_cliente;
        this.dir_cliente = dir_cliente;
        this.ciudad_cliente = ciudad_cliente;
        this.telf_cliente = telf_cliente;
        this.Fnaci_cliente = Fnaci_cliente;
        this.Correo_cliente = Correo_cliente;
        this.Contrasena_cliente = Contrasena_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getApe_cliente() {
        return ape_cliente;
    }

    public void setApe_cliente(String ape_cliente) {
        this.ape_cliente = ape_cliente;
    }

    public String getDir_cliente() {
        return dir_cliente;
    }

    public void setDir_cliente(String dir_cliente) {
        this.dir_cliente = dir_cliente;
    }

    public String getCiudad_cliente() {
        return ciudad_cliente;
    }

    public void setCiudad_cliente(String ciudad_cliente) {
        this.ciudad_cliente = ciudad_cliente;
    }

    public String getTelf_cliente() {
        return telf_cliente;
    }

    public void setTelf_cliente(String telf_cliente) {
        this.telf_cliente = telf_cliente;
    }

    public String getFnaci_cliente() {
        return Fnaci_cliente;
    }

    public void setFnaci_cliente(String Fnaci_cliente) {
        this.Fnaci_cliente = Fnaci_cliente;
    }

    public String getCorreo_cliente() {
        return Correo_cliente;
    }

    public void setCorreo_cliente(String Correo_cliente) {
        this.Correo_cliente = Correo_cliente;
    }

    public String getContrasena_cliente() {
        return Contrasena_cliente;
    }

    public void setContrasena_cliente(String Contrasena_cliente) {
        this.Contrasena_cliente = Contrasena_cliente;
    }

}