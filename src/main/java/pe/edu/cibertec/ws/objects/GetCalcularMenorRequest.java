//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 04:07:08 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="num2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="num3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="num4" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "num1",
    "num2",
    "num3",
    "num4"
})
@XmlRootElement(name = "getCalcularMenorRequest")
public class GetCalcularMenorRequest {

    protected int num1;
    protected int num2;
    protected int num3;
    protected int num4;

    /**
     * Obtiene el valor de la propiedad num1.
     * 
     */
    public int getNum1() {
        return num1;
    }

    /**
     * Define el valor de la propiedad num1.
     * 
     */
    public void setNum1(int value) {
        this.num1 = value;
    }

    /**
     * Obtiene el valor de la propiedad num2.
     * 
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Define el valor de la propiedad num2.
     * 
     */
    public void setNum2(int value) {
        this.num2 = value;
    }

    /**
     * Obtiene el valor de la propiedad num3.
     * 
     */
    public int getNum3() {
        return num3;
    }

    /**
     * Define el valor de la propiedad num3.
     * 
     */
    public void setNum3(int value) {
        this.num3 = value;
    }

    /**
     * Obtiene el valor de la propiedad num4.
     * 
     */
    public int getNum4() {
        return num4;
    }

    /**
     * Define el valor de la propiedad num4.
     * 
     */
    public void setNum4(int value) {
        this.num4 = value;
    }

}
