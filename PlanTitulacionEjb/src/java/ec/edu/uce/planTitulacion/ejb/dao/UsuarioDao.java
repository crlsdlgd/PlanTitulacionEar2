package ec.edu.uce.planTitulacion.ejb.dao;


import ec.edu.uce.planTitulacion.ejb.dto.Plan;
import ec.edu.uce.planTitulacion.ejb.dto.Usuario;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

@Local
public interface UsuarioDao {
    public boolean registrar(Usuario usuario) throws Exception;
    public List<Usuario> listarUsuario() throws Exception;
    public List<Usuario> listarUserByPlan(Plan plan) throws Exception;
    Usuario buscarUsuarioLogin(String nick, String pass)throws Exception;

    public List<String> autoCompletarEstudiante(String query) throws Exception;

    public boolean existeEstudiante(String txtEstudiante) throws Exception;

    public Usuario buscarUsuarioPrecursor(Plan plan)throws Exception;

    public boolean existeIdentificacion(String prsIdentificacion);

    
}
