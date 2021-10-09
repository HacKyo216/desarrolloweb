/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Tendero;
import java.util.List;
public interface CRUD_tendero {
    public List listar();
    public Tendero list(int id);
    public boolean add(Tendero per);
    public boolean edit(Tendero per);
    public boolean eliminar(int id);
}
