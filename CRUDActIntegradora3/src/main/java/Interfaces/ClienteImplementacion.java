package Interfaces;

import Main.Main;
import java.sql.*;
import Personas.Cliente;
import javax.swing.table.DefaultTableModel;

public class ClienteImplementacion implements DAOCliente {
    
    Main main = new Main();

    @Override
    public void registrar(Cliente cliente) {
        try {
            Connection conectar = main.establecerConeccion();
            PreparedStatement insertar = conectar.prepareStatement("INSERT INTO clientes (nombre, apellido) VALUES (?, ?)");
            insertar.setString(1, cliente.getNombre());
            insertar.setString(2, cliente.getApellido());
            insertar.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void modificar(Cliente cliente) {
        try {
            Connection conectar = main.establecerConeccion();
            PreparedStatement modificar = conectar.prepareStatement("UPDATE clientes SET nombre = ?, apellido = ? WHERE id = ?");
            modificar.setString(1, cliente.getNombre());
            modificar.setString(2, cliente.getApellido());
            modificar.setInt(3, cliente.getId());
            modificar.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void eliminar(Cliente cliente) {
        try {
            Connection conectar = main.establecerConeccion();
            PreparedStatement eliminar = conectar.prepareStatement("DELETE FROM clientes WHERE id = ?");
            eliminar.setInt(1, cliente.getId());
            eliminar.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void buscar(Cliente cliente) {
        try {
            Connection conectar = main.establecerConeccion();
            PreparedStatement buscar = conectar.prepareStatement("SELECT * FROM clientes WHERE id = ?");
            buscar.setInt(1, cliente.getId());
            ResultSet consulta = buscar.executeQuery();
            if (consulta.next()) {
                cliente.setId(Integer.parseInt(consulta.getString("id")));
                cliente.setNombre(consulta.getString("nombre"));
                cliente.setApellido(consulta.getString("apellido"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
      public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"codigo", "nombre", "apellido"};
        String[] registro = new String[3];

        modelo = new DefaultTableModel(null, titulos);

        try {
            Connection conectar = main.establecerConeccion();
            String sSQL = "SELECT * FROM clientes WHERE nombre LIKE '%" + buscar + "%' ORDER BY id";
            PreparedStatement ps = conectar.prepareStatement(sSQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return modelo;
    }

}
