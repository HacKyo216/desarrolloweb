
package Modelo;

/**
 *
 * @author Andres
 */
public class Proveedor {
    int id_proveedor;
    String nom_proveedor;
    String ape_proveedor;
    String dir_proveedor;
    String ciudad_proveedor;
    String telf_proveedor;
    String Fnaci_proveedor;
    String Correo_proveedor;
    String Contraseñ_proveedor;

    public Proveedor() {
    }

    public Proveedor(int id_proveedor, String nom_proveedor, String ape_proveedor, String dir_proveedor, String ciudad_proveedor, String telf_proveedor, String Fnaci_proveedor, String Correo_proveedor, String Contraseñ_proveedor) {
        this.id_proveedor = id_proveedor;
        this.nom_proveedor = nom_proveedor;
        this.ape_proveedor = ape_proveedor;
        this.dir_proveedor = dir_proveedor;
        this.ciudad_proveedor = ciudad_proveedor;
        this.telf_proveedor = telf_proveedor;
        this.Fnaci_proveedor = Fnaci_proveedor;
        this.Correo_proveedor = Correo_proveedor;
        this.Contraseñ_proveedor = Contraseñ_proveedor;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNom_proveedor() {
        return nom_proveedor;
    }

    public void setNom_proveedor(String nom_proveedor) {
        this.nom_proveedor = nom_proveedor;
    }

    public String getApe_proveedor() {
        return ape_proveedor;
    }

    public void setApe_proveedor(String ape_proveedor) {
        this.ape_proveedor = ape_proveedor;
    }

    public String getDir_proveedor() {
        return dir_proveedor;
    }

    public void setDir_proveedor(String dir_proveedor) {
        this.dir_proveedor = dir_proveedor;
    }

    public String getCiudad_proveedor() {
        return ciudad_proveedor;
    }

    public void setCiudad_proveedor(String ciudad_proveedor) {
        this.ciudad_proveedor = ciudad_proveedor;
    }

    public String getTelf_proveedor() {
        return telf_proveedor;
    }

    public void setTelf_proveedor(String telf_proveedor) {
        this.telf_proveedor = telf_proveedor;
    }


    public String getFnaci_proveedor() {
        return Fnaci_proveedor;
    }

    public void setFnaci_proveedor(String Fnaci_proveedor) {
        this.Fnaci_proveedor = Fnaci_proveedor;
    }

    public String getCorreo_proveedor() {
        return Correo_proveedor;
    }

    public void setCorreo_proveedor(String Correo_proveedor) {
        this.Correo_proveedor = Correo_proveedor;
    }

    public String getContraseñ_proveedor() {
        return Contraseñ_proveedor;
    }

    public void setContraseñ_proveedor(String Contraseñ_proveedor) {
        this.Contraseñ_proveedor = Contraseñ_proveedor;
    }
    
    
}
