/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Andres
 */
public class Tendero {
    int id_tendero;
    String nom_tendero;
    String ape_tendero;
    String dir_tendero;
    String ciudad_tendero;
    String telf_tendero;
    String Fnaci_tendero;
    String Correo_tendero;
    String Contraseña_tendero;

    public Tendero() {
    }

    public Tendero(int id_tendero, String nom_tendero, String ape_tendero, String dir_tendero, String ciudad_tendero, String telf_tendero, String Fnaci_tendero, String Correo_tendero, String Contraseña_tendero) {
        this.id_tendero = id_tendero;
        this.nom_tendero = nom_tendero;
        this.ape_tendero = ape_tendero;
        this.dir_tendero = dir_tendero;
        this.ciudad_tendero = ciudad_tendero;
        this.telf_tendero = telf_tendero;
        this.Fnaci_tendero = Fnaci_tendero;
        this.Correo_tendero = Correo_tendero;
        this.Contraseña_tendero = Contraseña_tendero;
    }

    public int getId_tendero() {
        return id_tendero;
    }

    public void setId_tendero(int id_tendero) {
        this.id_tendero = id_tendero;
    }

    public String getNom_tendero() {
        return nom_tendero;
    }

    public void setNom_tendero(String nom_tendero) {
        this.nom_tendero = nom_tendero;
    }

    public String getApe_tendero() {
        return ape_tendero;
    }

    public void setApe_tendero(String ape_tendero) {
        this.ape_tendero = ape_tendero;
    }

    public String getDir_tendero() {
        return dir_tendero;
    }

    public void setDir_tendero(String dir_tendero) {
        this.dir_tendero = dir_tendero;
    }

    public String getCiudad_tendero() {
        return ciudad_tendero;
    }

    public void setCiudad_tendero(String ciudad_tendero) {
        this.ciudad_tendero = ciudad_tendero;
    }

    public String getTelf_tendero() {
        return telf_tendero;
    }

    public void setTelf_tendero(String telf_tendero) {
        this.telf_tendero = telf_tendero;
    }

    public String getFnaci_tendero() {
        return Fnaci_tendero;
    }

    public void setFnaci_tendero(String Fnaci_tendero) {
        this.Fnaci_tendero = Fnaci_tendero;
    }

    public String getCorreo_tendero() {
        return Correo_tendero;
    }

    public void setCorreo_tendero(String Correo_tendero) {
        this.Correo_tendero = Correo_tendero;
    }

    public String getContraseña_tendero() {
        return Contraseña_tendero;
    }

    public void setContraseña_tendero(String Contraseña_tendero) {
        this.Contraseña_tendero = Contraseña_tendero;
    }
    
}
