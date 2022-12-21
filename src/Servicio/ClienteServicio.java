package Servicio;

import Dao.ClienteDao;
import Entity.Cliente;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteServicio {

    private ClienteDao Cdao = new ClienteDao();

    public int InsertarCliente(String nombre, String apellido_p, String apellido_m, Date fecha, String telefono, String celular, String email,String curp, String rfc, String municipio, String residencia, String nombre_calle,String referencia, int mzn, int lt, String status) {
        Cliente cl = new Cliente(nombre, apellido_p, apellido_m, fecha, telefono, celular, email, curp, rfc, municipio, residencia, nombre_calle, referencia, mzn, lt, status);
        int ret = this.Cdao.InsertarCliente(cl);
        
        return ret;
    }

    public int ActualizarCliente(Integer folio, String nombre, String apellido_p, String apellido_m, Date fecha, String telefono,String celular,String email,String curp, String rfc, String municipio, String colonia, String nombre_calle, String referencia, int mzn, int lt) {
        int ret = 0;
        Cliente cl = new Cliente(folio, nombre, apellido_p, apellido_m, fecha, telefono,celular,email, curp,rfc, municipio, colonia, nombre_calle, referencia, mzn, lt);
        ret = this.Cdao.ActualizarCliente(cl);
        if (ret == 1) {
            JOptionPane.showMessageDialog(null, "Se actualizo con exito", "Exito", 1);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar", "Aviso", 1);
        }
        return ret;
    }

    public List<Cliente> MostrarClientes() {
        return this.Cdao.MostrarClientes();
    }

    public void EliminarClientes(int folio) {
        int ret = 0;
        ret = this.Cdao.DarDeBajaCliente(folio);
        if (ret == 1) {
            JOptionPane.showMessageDialog(null, "Se dio de baja con exito", "Exito", 1);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo dar de baja", "Aviso", 1);
        }
    }

    public List<Cliente> SearchClientes(int folio) {
        return this.Cdao.SearchClientes(folio);
    }
    public List<Cliente> ClientesC(int folio){
        return this.Cdao.ClientesC(folio);
    }
    public List<Cliente> PagoCl_contrato(int folio){
        return this.Cdao.Pagocl_contrato(folio);
    }
    public List<Cliente> PagoCl_cte(int folio){
        return this.Cdao.Pagocl_cte(folio);
    }
    public List<Cliente> PagoCl_num(String numero){
        return this.Cdao.Pagocl_num(numero);
    }
    
    public List<Cliente> PagoCl_numT(String numero){
        return this.Cdao.Pagocl_numT(numero);
    }
}
