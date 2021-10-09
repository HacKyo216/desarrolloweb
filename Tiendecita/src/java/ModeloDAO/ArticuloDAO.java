/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD_cliente;

public class ArticuloDAO implements CRUD_cliente{
    Conexion cn;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cliente p=new Cliente();
    
    @Override
    public List listar() {
        ArrayList<Cliente>list=new ArrayList<>();
        String sql="select * from cliente";
    try {
        cn= new Conexion();
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            Cliente per=new Cliente();
            per.setId_cliente(rs.getInt("Id"));
            per.setNom_cliente(rs.getString("nombre"));
            per.setApe_cliente(rs.getString("apellido"));
            per.setFnaci_cliente(rs.getString("nacimiento"));
            per.setCiudad_cliente(rs.getString("ciudad"));
            per.setDir_cliente(rs.getString("direccion"));
            per.setTelf_cliente(rs.getString("telefono"));
            list.add(per);
        }
        cn.desconectar();
        } catch (Exception e) {
        }
            return list;
        }

    @Override
    public Cliente list(int id) {
    String sql="select * from cliente where idCliente="+id;
    try {
        cn= new Conexion();
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            p.setId_cliente(rs.getInt("Id"));
            p.setNom_cliente(rs.getString("nombre"));
            p.setApe_cliente(rs.getString("apellido"));
            p.setFnaci_cliente(rs.getString("nacimiento"));
            p.setCiudad_cliente(rs.getString("ciudad"));
            p.setDir_cliente(rs.getString("direccion"));
            p.setTelf_cliente(rs.getString("telefono"));
        }
        cn.desconectar();
        } catch (Exception e) {
        }
            return p;    
    }

    @Override
    public boolean add(Cliente per) {
    String sql="insert into cliente(idCliente, Nombre, Apellido, Direccion, Ciudad, Telefono, Fecha_nacimiento)values('"+per.getId_cliente()+"'"
            + ",'"+per.getNom_cliente()+"','"+per.getApe_cliente()+"','"+per.getDir_cliente()+"','"+per.getCiudad_cliente()+"','"+per.getTelf_cliente()+"',"
            + "'"+per.getFnaci_cliente()+"')";
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
    public boolean edit(Cliente per) {
        String sql="update datos set nombre='"+per.getNom_cliente()+"','"+per.getApe_cliente()+"','"+per.getDir_cliente()+"','"+per.getCiudad_cliente()+"','"+per.getTelf_cliente()+"',"
            + "'"+per.getFnaci_cliente()+"'where"
                + " Id="+per.getId_cliente();
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
    String sql="delete from datos where idCliente="+id;
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
