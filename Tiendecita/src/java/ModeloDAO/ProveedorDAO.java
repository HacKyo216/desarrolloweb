/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Modelo.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD_proveedor;

public class ProveedorDAO implements CRUD_proveedor{
    Conexion cn;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Proveedor p=new Proveedor();
    
    @Override
    public List listar() {
        ArrayList<Proveedor>list=new ArrayList<>();
        String sql="select * from proveedor";
    try {
        cn= new Conexion();
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            Proveedor per=new Proveedor();
            per.setId_proveedor(rs.getInt("idproveedor"));
            per.setNom_proveedor(rs.getString("nombre"));
            per.setApe_proveedor(rs.getString("apellido"));
            per.setFnaci_proveedor(rs.getString("fecha_nacimiento"));
            per.setCiudad_proveedor(rs.getString("ciudad"));
            per.setDir_proveedor(rs.getString("direccion"));
            per.setTelf_proveedor(rs.getString("telefono"));
            list.add(per);
        }
        cn.desconectar();
        } catch (Exception e) {
        }
            return list;
        }

    @Override
    public Proveedor list(int id) {
    String sql="select * from proveedor where idProveedor="+id;
    try {
        cn= new Conexion();
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            p.setId_proveedor(rs.getInt("idProveedor"));
            p.setNom_proveedor(rs.getString("nombre"));
            p.setApe_proveedor(rs.getString("apellido"));
            p.setFnaci_proveedor(rs.getString("fecha_nacimiento"));
            p.setCiudad_proveedor(rs.getString("ciudad"));
            p.setDir_proveedor(rs.getString("direccion"));
            p.setTelf_proveedor(rs.getString("telefono"));
        }
        cn.desconectar();
        } catch (Exception e) {
        }
            return p;    
    }

    @Override
    public boolean add(Proveedor per) {
    String sql="insert into proveedor(idProveedor, Nombre, Apellido, Direccion, Ciudad, Telefono, Fecha_nacimiento)values('"+per.getId_proveedor()+"'"
            + ",'"+per.getNom_proveedor()+"','"+per.getApe_proveedor()+"','"+per.getDir_proveedor()+"','"+per.getCiudad_proveedor()+"','"+per.getTelf_proveedor()+"',"
            + "'"+per.getFnaci_proveedor()+"')";
        try {
            cn= new Conexion();
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            cn.desconectar();
        } 
        catch (Exception e) {
        }
        return false;  
    }

    @Override
    public boolean edit(Proveedor per) {
        String sql="update proveedor set nombre='"+per.getNom_proveedor()+"',apellido='"+per.getApe_proveedor()+"',direccion='"+per.getDir_proveedor()+"',ciudad='"+per.getCiudad_proveedor()+"',telefono='"+per.getTelf_proveedor()+"',fecha_nacimiento="
            + "'"+per.getFnaci_proveedor()+"' where"
                + " idProveedor="+per.getId_proveedor();
        try {
            cn= new Conexion();
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            cn.desconectar();
        } catch (Exception e) {
        }
        return false; 
    }

    @Override
    public boolean eliminar(int id) {
    String sql="delete from proveedor where idProveedor="+id;
    try {
        cn= new Conexion();
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
        cn.desconectar();
    } catch (Exception e) {    
    }
        return false;
    }
    }
