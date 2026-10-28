
import java.util.Scanner;
public class java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        }

        }






























/*
ej2

        int hora;
        System.out.println("Porfavor introduzca la hora (No incluya minutos ni segundos)");
        hora = sc.nextInt();
        while (hora > 23 || hora < 0){
            System.out.println("Porfavor introduzca un numero valido");
            System.out.println("Porfavor introduzca la hora (No incluya minutos ni segundos");
            hora = sc.nextInt();
        }

        if (hora>=6 && hora <=12){
            System.out.println("Buenos dias");
        } if (hora>=13 && hora <=20){
            System.out.println("Buenas tardes");
        } if (hora>=20 && hora <= 23 || hora>=0 && hora<=5){
            System.out.println("Buenos noches");
        }

ej3

        double nota1;
        double nota2;
        double media;
        int recuperacion;
        System.out.println("Dame la nota del primer examen");
        nota1 = sc.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota no valida. Introduzca notas entre 0 y 10");
            System.out.println("Dame la nota del primer examen");
            nota1 = sc.nextDouble();
        }
        System.out.println("Dame la nota del segundo examen");
        nota2 = sc.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota no valida. Introduzca notas entre 0 y 10");
            System.out.println("Dame la nota del segundo examen");
            nota2 = sc.nextDouble();

            media = (nota1 + nota2) / 2;
            if (media >= 5 && media <= 10) {
                System.out.println("Has aprobado. Tu nota de Programacion es: " + media);
            }
            if (media < 5 && media >= 0) {
                System.out.println("Cual ha sido tu resultado de recuperacion?");
                System.out.println("Introduce 1: para apto 2: No apto");
                recuperacion = sc.nextInt();
                if (recuperacion == 1) {
                    System.out.println("Tu nota de Programacion 5");
                }
                if (recuperacion == 2) {
                    System.out.println("Tu nota de programacion es: " + media);
                }
            }


        }

ej4

int cantidad;
        int primer;
        int segundo;
        int tercer;
        int cuarto;
        int quinto;
        System.out.println("Introduzca la cantidad de digitos que llevara su numero");
        System.out.println("su numero debe tener entre 1 y 5 digitos");
        cantidad = sc.nextInt();
        while (cantidad > 5 || cantidad < 1) {
            System.out.println("Pruebe de nuevo");
            System.out.println("Introduzca la cantidad de digitos que llevara su numero");
            System.out.println("su numero debe tener entre 1 y 5 digitos");
            cantidad = sc.nextInt();
        }
        switch (cantidad){
            case 1: System.out.println("Introduzca el digito");
            primer = sc.nextInt();
            while (primer > 10){
                System.out.println("Introduzca un numero de una sola cifra");
                primer = sc.nextInt();
            }
            System.out.println(primer + " es capicua");

            case 2: System.out.println("Introduzca el primer digito");
            primer = sc.nextInt();
                while (primer > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    primer = sc.nextInt();
                }
                while (primer == 0){
                    System.out.println("Introduzca un numero distinto de 0");
                    primer = sc.nextInt();
                }
                while (primer < 0){
                    System.out.println("Introduzca un numero positivo");
                    primer = sc.nextInt();
                }
                System.out.println("Introduzca el segundo digito");
                segundo = sc.nextInt();
                while (segundo < 0){
                    System.out.println("Introduzca un numero positivo");
                    segundo = sc.nextInt();
                }
                while (segundo > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    segundo = sc.nextInt();
                }
                if (primer == segundo){
                    System.out.println("" + primer + segundo + " es capicua");
                } else {
                    System.out.println("" + primer + segundo + " no es capicua");
                }
            case 3: System.out.println("Introduzca el primer digito");
                primer = sc.nextInt();
                while (primer > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    primer = sc.nextInt();
                }
                while (primer < 0){
                    System.out.println("Introduzca un numero positivo");
                    primer = sc.nextInt();
                }
                while (primer == 0){
                    System.out.println("Introduzca un numero distinto de 0");
                    primer = sc.nextInt();
                }
                System.out.println("Introduzca el segundo digito");
                segundo = sc.nextInt();
                while (segundo > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    segundo = sc.nextInt();
                }
                while (segundo < 0){
                    System.out.println("Introduzca un numero positivo");
                    segundo = sc.nextInt();
                }
                System.out.println("Introduzca el tercer digito");
                tercer = sc.nextInt();
                while (tercer > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    tercer = sc.nextInt();
                }
                while (tercer < 0){
                    System.out.println("Introduzca un numero positivo");
                    tercer = sc.nextInt();
                }
                if (primer == tercer){
                    System.out.println("" + primer + segundo + tercer + " es capicua");
                } else {
                    System.out.println("" + primer + segundo + tercer + " no es capicua");
                }
            case 4: System.out.println("Introduzca el primer digito");
                primer = sc.nextInt();
                while (primer > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    primer = sc.nextInt();
                }
                while (primer == 0){
                    System.out.println("Introduzca un numero distinto de 0");
                    primer = sc.nextInt();
                }
                while (primer < 0){
                    System.out.println("Introduzca un numero positivo");
                    primer = sc.nextInt();
                }
                System.out.println("Introduzca el segundo digito");
                segundo = sc.nextInt();
                while (segundo > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    segundo = sc.nextInt();
                }
                while (segundo < 0){
                    System.out.println("Introduzca un numero positivo");
                    segundo = sc.nextInt();
                }
                System.out.println("Introduzca el tercer digito");
                tercer = sc.nextInt();
                while (tercer > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    tercer = sc.nextInt();
                }
                while (tercer < 0){
                    System.out.println("Introduzca un numero positivo");
                    tercer = sc.nextInt();
                }
                System.out.println("Introduzca el cuarto digito");
                cuarto = sc.nextInt();
                while (cuarto > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    cuarto = sc.nextInt();
                }
                while (cuarto < 0){
                    System.out.println("Introduzca un numero positivo");
                    cuarto = sc.nextInt();
                }
                if (primer == cuarto && segundo == tercer ){
                    System.out.println("" + primer + segundo + tercer + cuarto + " es capicua");
                } else {
                    System.out.println("" + primer + segundo + tercer + cuarto + " no es capicua");
                }
            case 5: System.out.println("Introduzca el primer digito");
                primer = sc.nextInt();
                while (primer > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    primer = sc.nextInt();
                }
                while (primer == 0){
                    System.out.println("Introduzca un numero distinto de 0");
                    primer = sc.nextInt();
                }
                while (primer < 0){
                    System.out.println("Introduzca un numero positivo");
                    primer = sc.nextInt();
                }
                System.out.println("Introduzca el segundo digito");
                segundo = sc.nextInt();
                while (segundo > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    segundo = sc.nextInt();
                }
                while (segundo < 0){
                    System.out.println("Introduzca un numero positivo");
                    segundo = sc.nextInt();
                }
                System.out.println("Introduzca el tercer digito");
                tercer = sc.nextInt();
                while (tercer > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    tercer = sc.nextInt();
                }
                while (tercer < 0){
                    System.out.println("Introduzca un numero positivo");
                    tercer = sc.nextInt();
                }
                System.out.println("Introduzca el cuarto digito");
                cuarto = sc.nextInt();
                while (cuarto > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    cuarto = sc.nextInt();
                }
                while (cuarto < 0){
                    System.out.println("Introduzca un numero positivo");
                    cuarto = sc.nextInt();
                }
                System.out.println("Introduzca el quinto digito");
                quinto = sc.nextInt();
                while (quinto > 10){
                    System.out.println("Introduzca un numero de una sola cifra");
                    quinto = sc.nextInt();
                }
                while (quinto < 0){
                    System.out.println("Introduzca un numero positivo");
                    quinto = sc.nextInt();
                }
                if (primer == quinto && segundo == cuarto) {
                    System.out.println("" + primer + segundo + tercer + cuarto + quinto + " es capicua");
                } else {
                    System.out.println("" + primer + segundo + tercer + cuarto + quinto + " no es capicua");
                }

ej5
        int i = 0;
        for (; i < 100;){
            i = i + 5;
            System.out.println(i);
        }

ej6

        int i = 0;
        while ( i < 100){
            i = i + 5;
            System.out.println(i);
        }

ej7
        int i = 0;
        do {
            i = i + 5;
            System.out.println(i);
        }
        while (i<100);

ej8

        int i = 340;
        for(;i > 120;){
            i = i - 20;
            System.out.println(i);

        }

ej9

        int i = 340;
        while (i > 120){
            i = i - 20;
            System.out.println(i);

        }

ej10

        int i = 340;
        do {
            i = i - 20;
            System.out.println(i);
        }
        while (i > 120);
        }

ej11

        int intentos = 1;
        int combinacion;
        System.out.println("Introduzca la combinacion");
        combinacion = sc.nextInt();
        while (combinacion != 1234){
        while (intentos < 4) {
            intentos = intentos + 1;
            System.out.println("Lo siento! Esa no es la combinacion");
            System.out.println("Introduzca de nuevo la combinacion");
            combinacion = sc.nextInt();
            if (intentos == 4) {
                System.out.println("La caja fuerte ha sido bloqueada");
                break;
            }
            if (combinacion == 1234) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }
        }
    }


ej12


*/