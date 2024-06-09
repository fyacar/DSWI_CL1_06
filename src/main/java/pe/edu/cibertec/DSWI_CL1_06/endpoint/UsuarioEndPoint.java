package pe.edu.cibertec.DSWI_CL1_06.endpoint;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWI_CL1_06.exception.NotFoundException;
import pe.edu.cibertec.DSWI_CL1_06.service.UsuarioService;
import pe.edu.cibertec.ws.objects.*;

@AllArgsConstructor
@Endpoint
public class UsuarioEndPoint {
    private UsuarioService usuarioService;
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getUsuariosRequest")
    @ResponsePayload
    public GetUsuariosResponse getUsuarios(@RequestPayload GetUsuariosRequest request){
        GetUsuariosResponse response = new GetUsuariosResponse();
        response.getUsuario().addAll(usuarioService.listarUsuarios());
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getUsuarioRequest")
    @ResponsePayload
    public GetUsuarioResponse getUsuario(@RequestPayload GetUsuarioRequest request) {
        GetUsuarioResponse response = new GetUsuarioResponse();
        Usuariows usuariows = usuarioService.obtenerUsuarioxId(request.getId());
        if (usuariows == null)
            throw new NotFoundException("El ususario con el ID: " + request.getId() + " No existe");
        response.setUsuario(usuariows);
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "postCrearUsuarioRequest")
    @ResponsePayload
    public PostCrearUsuarioResponse saveUsuario(@RequestPayload PostCrearUsuarioRequest request){
        PostCrearUsuarioResponse response = new PostCrearUsuarioResponse();
        response.setUsuario(usuarioService.registrarActualizarUsuario(request.getUsuario()));
        return response;
    }

}
