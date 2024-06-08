package pe.edu.cibertec.DSWI_CL1_06.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWI_CL1_06.repository.EjerciciosRepository;
import pe.edu.cibertec.ws.objects.*;

@AllArgsConstructor
@Endpoint
public class EjerciciosEndPoint {

    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";
    private EjerciciosRepository ejerciciosRepository;

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getPuedeJubilarseRequest")
    @ResponsePayload
    public GetPuedeJubilarseResponse getPuedeJubilarseRespuesta(@RequestPayload GetPuedeJubilarseRequest request){
        GetPuedeJubilarseResponse response = new GetPuedeJubilarseResponse();
        int edad = request.getEdad();
        String sexo = request.getSexo().toString();
        response.setPuedeJubilarseRespuesta(ejerciciosRepository.puedeJubilarse(edad,sexo));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getCalcularMenorRequest")
    @ResponsePayload
    public GetCalcularMenorResponse getNumeroMenorRespuesta(@RequestPayload GetCalcularMenorRequest request){
        GetCalcularMenorResponse response = new GetCalcularMenorResponse();
        response.setNumeroMenor(ejerciciosRepository.calcularMenor
                (request.getNum1(),request.getNum2(),request.getNum3(),
                        request.getNum4()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getCalcularUtilidadesRequest")
    @ResponsePayload
    public GetCalcularUtilidadesResponse getCalcularUtilidadesResponse(@RequestPayload GetCalcularUtilidadesRequest request){
        GetCalcularUtilidadesResponse response = new GetCalcularUtilidadesResponse();
        response.setUtilidades(ejerciciosRepository.calcularUtilidades(request.getSalarioMensual(),request.getAniosTrabajados()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getCalcularSumaRequest")
    @ResponsePayload
    public GetCalcularSumaResponse getCalcularSumaResponse(@RequestPayload GetCalcularSumaRequest request){
        GetCalcularSumaResponse response = new GetCalcularSumaResponse();
        response.setSuma(ejerciciosRepository.calcularSuma());
        return response;
    }




}
