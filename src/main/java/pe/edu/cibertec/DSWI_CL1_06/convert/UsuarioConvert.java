package pe.edu.cibertec.DSWI_CL1_06.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWI_CL1_06.model.Usuario;
import pe.edu.cibertec.ws.objects.Usuariows;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioConvert {
    Usuario usuario = new Usuario();

    public Usuario convertirUsuariowsToUsuario(Usuariows usuariows){
        Usuario usuario = new Usuario();
        usuario.setIdusuario(usuariows.getIdusuario());
        usuario.setActivo(usuariows.isActivo());
        usuario.setApellidos(usuariows.getApellidos());
        usuario.setNombres(usuariows.getNombres());
        usuario.setPassword(usuariows.getPassword());
        usuario.setEmail(usuariows.getEmail());
        usuario.setNomusuario(usuariows.getNomusuario());
        return usuario;
    }

    public List<Usuario> convertirUsuarioswsToUsuarios(List<Usuariows> usuariows) {
        List<Usuario> usuarioList = new ArrayList<>();
        usuariows.forEach(user -> {
            usuarioList.add(convertirUsuariowsToUsuario(user));
        });
        return usuarioList;
    }

    public Usuariows convertirUsuarioToUsuariows(Usuario usuario){
        Usuariows usuariows = new Usuariows();
        usuariows.setIdusuario(usuario.getIdusuario());
        usuariows.setActivo(usuario.getActivo());
        usuariows.setApellidos(usuario.getApellidos());
        usuariows.setNombres(usuario.getNombres());
        usuariows.setPassword(usuario.getPassword());
        usuariows.setEmail(usuario.getEmail());
        usuariows.setNomusuario(usuario.getNomusuario());
        return usuariows;
    }

    public List<Usuariows> convertirUsuariosToUsuariosws(List<Usuario> usuario) {
        List<Usuariows> usuariowsList = new ArrayList<>();
        usuario.forEach(user -> {
            usuariowsList.add(convertirUsuarioToUsuariows(user));
        });
        return usuariowsList;
    }




}
