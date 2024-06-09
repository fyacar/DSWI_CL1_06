package pe.edu.cibertec.DSWI_CL1_06.service;

import pe.edu.cibertec.ws.objects.Usuariows;

import java.util.List;

public interface IUsuarioService {
    List<Usuariows> listarUsuarios();
    Usuariows obtenerUsuarioxId(int id);
    Usuariows registrarActualizarUsuario(Usuariows usuario);
}
