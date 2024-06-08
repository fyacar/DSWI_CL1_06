package pe.edu.cibertec.DSWI_CL1_06.repository;

import org.springframework.stereotype.Component;

@Component
public class EjerciciosRepository {

    public String puedeJubilarse(int edad, String sexo){

        if (sexo.equals("M") && edad >= 60) {
            return "Puede jubilarse.";
        } else if (sexo.equals("mujer") && edad > 54) {
            return "Puede jubilarse.";
        } else {
            return "No puede jubliarse.";
        }
    }

    public int calcularMenor(int num1, int num2, int num3, int num4) {
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        if (num4 < menor) {
            menor = num4;
        }
        return menor;
    }


    public double calcularUtilidades(double salarioMensual, int aniosTrabajados) {
        double porcentajeUtilidad;

        if (aniosTrabajados < 1) {
            porcentajeUtilidad = 0.05;
        } else if (aniosTrabajados < 2) {
            porcentajeUtilidad = 0.07;
        } else if (aniosTrabajados < 5) {
            porcentajeUtilidad = 0.10;
        } else if (aniosTrabajados < 10) {
            porcentajeUtilidad = 0.15;
        } else {
            porcentajeUtilidad = 0.20;
        }

        return salarioMensual * porcentajeUtilidad;
    }

    public int calcularSuma() {
        int suma = 0;
        for (int i = 9; i <= 45; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                suma += i;
            }
        }
        return suma;
    }


}
