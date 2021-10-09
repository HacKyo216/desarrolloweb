/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Modelo.Tendero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD_tendero;

public class TenderoDAO implements CRUD_tendero{
    Conexion cn;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Tendero p=new Tendero();
    
    @Override
    public List listar() {
        ArrayList<Tendero>list=new ArrayList<>();
        String sql="select * from tendero";
    try {
        cn= new Conexion();
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            Tendero per=new Tendero();
            per.setId_tendero(rs.getInt("id_Tendero"));
            per.setNom_tendero(rs.getString("nombre"));
            per.setApe_tendero(rs.getString("apellido"));
            per.setFnaci_tendero(rs.getString("fecha_nacimiento"));
            per.setCiudad_tendero(rs.getString("ciudad"));
            per.setDir_tendero(rs.getString("direccion"));
            per.setTelf_tendero(rs.getString("telefono"));
            list.add(per);
        }
        cn.desconectar();
        } catch (Exception e) {
        }
            return list;
        }

    @Override
    public Tendero list(int id) {
    String sql="select * from tendero where id_tendero="+id;
    try {
        cn= new Conexion();
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            p.setId_tendero(rs.getInt("id_tendero"));
            p.setNom_tendero(rs.getString("nombre"));
            p.setApe_tendero(rs.getString("apellido"));
            p.setFnaci_tendero(rs.getString("fecha_nacimiento"));
            p.setCiudad_tendero(rs.getString("ciudad"));
            p.setDir_tendero(rs.getString("direccion"));
            p.setTelf_tendero(rs.getString("telefono"));
        }
        cn.desconectar();
        } catch (Exception e) {
        }
            return p;    
    }

    @Override
    public boolean add(Tendero per) {
    String sql="insert into tendero(id_tendero, Nombre, Apellido, Direccion, Ciudad, Telefono, Fecha_nacimiento)values('"+per.getId_tendero()+"'"
            + ",'"+per.getNom_tendero()+"','"+per.getApe_tendero()+"','"+per.getDir_tendero()+"','"+per.getCiudad_tendero()+"','"+per.getTelf_tendero()+"',"
            + "'"+per.getFnaci_tendero()+"')";
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
    public boolean edit(Tendero per) {
        String sql="update tendero set nombre='"+per.getNom_tendero()+"',apellido='"+per.getApe_tendero()+"',direccion='"+per.getDir_tendero()+"',ciudad='"+per.getCiudad_tendero()+"',telefono='"+per.getTelf_tendero()+"',fecha_nacimiento="
            + "'"+per.getFnaci_tendero()+"' where"
                + " id_tendero="+per.getId_tendero();
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
    String sql="delete from tendero where id_tendero="+id;
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
