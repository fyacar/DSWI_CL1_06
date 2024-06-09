package pe.edu.cibertec.DSWI_CL1_06.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWI_CL1_06.convert.UsuarioConvert;
import pe.edu.cibertec.DSWI_CL1_06.model.Usuario;
import pe.edu.cibertec.DSWI_CL1_06.repository.UsuarioRepository;
import pe.edu.cibertec.ws.objects.Usuariows;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService {

    private UsuarioRepository usuarioRepository;
    private UsuarioConvert usuarioConvert;

    @Override
    public List<Usuariows> listarUsuarios() {
        return usuarioConvert.convertirUsuariosToUsuariosws(
                usuarioRepository.findAll());
    }

    @Override
    public Usuariows obtenerUsuarioxId(int id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.map(value ->
                        usuarioConvert.convertirUsuarioToUsuariows(value))
                .orElse(null);
    }

    @Override
    public Usuariows registrarActualizarUsuario(Usuariows usuariows) {
        Usuario nuevoUsuario = usuarioRepository.save(
                usuarioConvert.convertirUsuariowsToUsuario(usuariows));
        if(nuevoUsuario == null)
            return  null;
        return usuarioConvert.convertirUsuarioToUsuariows(nuevoUsuario);
    }
}
