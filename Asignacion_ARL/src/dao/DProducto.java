/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

/**
 *
 * @author User
 */
public class DProducto {
    private ArrayList<Producto> listProducto = new ArrayList<>();

    public DProducto() {
    }
    
    public ArrayList<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }
    
    public int agregarProducto(int id, String nombre, double precio, double existencia) {
        int b = 0;
        Producto prod = new Producto(id, nombre, precio, existencia);
        listProducto.add(prod);
        b = 1;
        return b;
    }
    
    public DefaultTableModel getListProd() {
        DefaultTableModel dtm = new DefaultTableModel();
        String Titulo[] = {"ID", "Nombre", "Precio", "Existencia"};
        
        dtm.setColumnIdentifiers(Titulo);
        
        for (Producto prod : listProducto) {
            String reg[] = new String[4];
            reg[0] = ""+prod.getId();
            reg[1] = prod.getNombre();
            reg[2] = ""+prod.getPrecio();
            reg[3] = ""+prod.getExistencia();
            dtm.addRow(reg);
        }
        
        return dtm;
        
    }
}
