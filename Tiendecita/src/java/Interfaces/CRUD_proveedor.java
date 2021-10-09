/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Proveedor;
import java.util.List;
public interface CRUD_proveedor {
    public List listar();
    public Proveedor list(int id);
    public boolean add(Proveedor per);
    public boolean edit(Proveedor per);
    public boolean eliminar(int id);
}
