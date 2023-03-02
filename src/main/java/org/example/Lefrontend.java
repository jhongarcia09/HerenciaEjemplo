package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lefrontend {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite la cantidad de producto: ");
        Integer cantidadProducto = entrada.nextInt();
        System.out.println("la cantidad fur: "+cantidadProducto);


        //como obtener una fecha del sistema
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        //como adignar una fecha en especifico
        LocalDate fecha2 = LocalDate.of(2023,2,24);
        System.out.println(fecha2);

        //encontrar la diferencia entre 2 fechas
        Long diferenciasEntreFechas = ChronoUnit.DAYS.between(fecha,fecha2);
        System.out.println(diferenciasEntreFechas);
    }
}

