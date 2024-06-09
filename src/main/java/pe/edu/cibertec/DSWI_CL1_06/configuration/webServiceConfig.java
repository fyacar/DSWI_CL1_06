package pe.edu.cibertec.DSWI_CL1_06.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class webServiceConfig extends WsConfigurerAdapter{
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet
            (ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    @Bean(name = "ejercicios")
    public DefaultWsdl11Definition ejerciciosWsdl11Definition(XsdSchema ejercicioSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("EjerciciosPort");
        wsdl11Definition.setLocationUri("/ws/ejercicios");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(ejercicioSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema ejercicioSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/ejercicios.xsd"));
    }

    @Bean(name = "usuario")
    public DefaultWsdl11Definition usuarioWsdl11Definition(XsdSchema usuarioSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("UsuariosPort");
        wsdl11Definition.setLocationUri("/ws/usario");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(usuarioSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema usuarioSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/usuario.xsd"));
    }


}
