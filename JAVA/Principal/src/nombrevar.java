import java.util.Scanner;
    public class nombrevar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double nota1;
            double n1por;
            double notadeseada;
            double deseadapor;
            double nota2;
            double n2por;
            System.out.println("Introduce tu primera nota: ");
            nota1 = sc.nextDouble();
            while (nota1 > 10 || nota1 < 0) {
                System.out.println("Porfavor introduzca una nota entre 0 y 10");
                System.out.println("Introduce tu primera nota: ");
                nota1 = sc.nextDouble();
            }
            System.out.println("Introduce la media que deseas obtener: ");
            notadeseada = sc.nextDouble();
            while (notadeseada > 10 || notadeseada < 0) {
                System.out.println("Porfavor introduzca una nota entre 0 y 10");
                System.out.println("Introduce tu primera nota: ");
                nota1 = sc.nextDouble();
            }


            n1por = (nota1 * 40) / 10;
            deseadapor = (notadeseada * 100) / 10;
            n2por = deseadapor - n1por;
            nota2 = (n2por * 10) / 60;
            if (nota2 > 10) {
                System.out.println("Te sera imposible alcanzar esta nota: " + String.format("%.2f", nota2));
                System.out.println("Mas suerte el proximo trimestre");
            } else {
                System.out.println("Para sacar " + notadeseada + " en el trimestre, necesitas un " + String.format("%.2f", nota2) + " en el segundo examen");
            }




        }
    }



/*
ej1
---
System.out.println("Jose Pablo Bolekia Sulu");

ej2
    System.out.println("Jose Pablo Bolekia Sulu");
        System.out.println("642 377 231");
        System.out.println("Calle Pere Cabanes");

ej3

    String nombre = "Jose Pablo Bolekia Sulu";
        System.out.println(nombre);

ej4

            String nombre = "Jose Pablo Bolekia Sulu";
            String telefono = "642 377 231";
            String direccion = "Calle de Pere Cabanes";
            System.out.println(nombre);
            System.out.println(telefono);
            System.out.println(direccion);

ej5

            int e = 144;
            int y = 999;
            int suma = e + y;
            int resta = e - y;
            int producto = e * y;
            System.out.println("Primer valor " + e);
            System.out.println("Segundo valor " + y);
            System.out.println("La suma es " + suma);
            System.out.println("La resta es " + resta);
            System.out.println("La multiplicacion es " + producto);

ej6

                    float euros;
        System.out.println("Introduce la cantidad de euros a cambiar");
        euros = sc.nextFloat();

        (1euro = 1.12 dolares ------ n euros = n * 1.12)

double totaldolares = euros * 1.12;
            System.out.println(euros + " euros = " + totaldolares + " dolares");
            System.out.printf("%nEl valor de la variable totaldolares es %.2f", totaldolares);

ej7

    Scanner sc = new Scanner(System.in);
            double dolares;
            System.out.println("Introduce la cantidad de dolares a cambiar");
            dolares = sc.nextDouble();

            (1dolar = .89 euros ------ n dolares = n * .89)



double totaldolares = dolares * .89;
            System.out.println(dolares + " dolares = " + totaldolares + " euros");
            System.out.printf("%nEl valor de la variable totaleuros es %.2f", totaldolares);

ej8

1
Scanner sc = new Scanner(System.in);
        double precio;
        int opcion;
        int IVA = 0;
        double total1 = 0;
        double total2 = 0;
        double total3 = 0;
        System.out.println("Introduzca el precio total de su factura");
        precio = sc.nextDouble();
        System.out.println("Introduzca el tipo de IVA segun lo que compro:");
        System.out.println("1 para IVA general (Productos de supermercado)");
        System.out.println("2 para IVA reducido (hosteleria, transporte, etc)");
        System.out.println("3 para IVA superreducido (productos de primera necesidad)");
        opcion = sc.nextInt();
        if (opcion == 1) {
            total1 = precio * 1.21;
            System.out.println("El total con IVA incluido es: " + String.format ("%.1f", total1) + " Euros");
        } else if (opcion == 2) {
            total2 = precio * 1.10;
            System.out.println("El total con IVA incluido es: " + String.format ("%.1f", total2) + " Euros");
        } else {
            total3 = precio * 1.04;
            System.out.println("El total con IVA incluido es: " + String.format ("%.1f", total3) + " Euros");
        }

2

                Scanner sc = new Scanner(System.in);
            double siniva;
            double total;
            double iva;
            System.out.println("Introduce la cantidad imponible: ");
            siniva = sc.nextDouble();
            total = siniva + (siniva * .21);
            iva = siniva * .21;
            System.out.println("A tu factura se le agregaran " + iva + " euros de IVA");
            System.out.println("El total con IVA es: " + total);

ej9
            Scanner sc = new Scanner(System.in);
            int num;
            int absopos;
            int absoneg;
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            if (num < 0){
               absopos = num * (-1);
                System.out.println("Su valor absoluto es: |" + absopos + "|");

            }
            else {
                absoneg = num;
                System.out.println("Su valor absoluto es: |" + absoneg + "|");
            }

ej10
            Scanner sc = new Scanner(System.in);
            double num1;
            double num2;
            System.out.println("Introduzca un numero");
            num1 = sc.nextDouble();
            System.out.println("Introduzca otro numero");
            num2 = sc.nextDouble();

            if (num1 < num2) {
                System.out.println(num1 + " es menor que " + num2);
            } else {
                System.out.println(num2 + " es menor que " + num1);
            }

ej11

 int edad;
            int nivelestudios;
            int ingresos;
            boolean resultado;
            System.out.println("Introduzca su edad: ");
            edad = sc.nextInt();
            System.out.println("Introduzca su nivel de estudios");
            nivelestudios = sc.nextInt();
            System.out.println("Introduzca sus ingresos anuales");
            ingresos = sc.nextInt();
            if ((edad <= 28 && nivelestudios == 3) || (edad < 30 && ingresos > 28000)) {
                resultado = true;
                System.out.println(resultado);
            }
            else {
                resultado = false;
                System.out.println(resultado);
            }

ej12, ej13

            Scanner sc = new Scanner(System.in);
            double euros;
            double dolares;
            double totaleuros;
            double totaldolares;
            int opcion;
            System.out.println("Selecciona el cambio que quiera hacer:");
            System.out.println("1: de euros a dolares");
            System.out.println("2: de dolares a euros");
            opcion = sc.nextInt();
            while (opcion != 1 && opcion != 2) {
                System.out.println("Opcion no valida. Porfavor introduzca 1 o 2 segun lo que desee hacer");
                System.out.println("Selecciona el cambio que quiera hacer:");
                System.out.println("1: de euros a dolares");
                System.out.println("2: de dolares a euros");
                opcion = sc.nextInt();
            }
        if (opcion == 1) {
                System.out.println("Introduzca la cantidad de euros a convertir: ");
                euros = sc.nextDouble();
                totaldolares = euros * 1.12;
                System.out.println(euros + " euros son " + String.format("%.2f", totaldolares) + " dolares");
        } else if (opcion == 2) {
                System.out.println("Introduzca la cantidad de dolares a convertir: ");
                dolares = sc.nextDouble();
                totaleuros = dolares * .89;
                System.out.println(dolares + " dolares son " + String.format("%.2f", totaleuros) + " euros");
        }

ej14

Scanner sc = new Scanner(System.in);
            double base;
            int opcioniva;
            int opcioncodigo;
            double generaliva;
            double reducidoiva;
            double codigo;
            double total1;
            double total;
            System.out.println("Introduczca su base imponible");
            base = sc.nextDouble();
            System.out.println("Que tipo de IVA se le aplicara?");
            System.out.println("1: para general");
            System.out.println("2: para reducido");
            opcioniva = sc.nextInt();
            while (opcioniva != 1 && opcioniva != 2) {
                System.out.println("Porfavor introduzca una opcion valida");
                System.out.println("Que tipo de IVA se le aplicara?");
                System.out.println("1: para general");
                System.out.println("2: para reducido");
                opcioniva = sc.nextInt();
            }

            System.out.println("Introduzca el tipo de codigo promocional que tenga");
            System.out.println("1: Para descuento a la mitad");
            System.out.println("2: Si no tienes descuento");
            opcioncodigo = sc.nextInt();
            while (opcioncodigo != 1 && opcioncodigo!= 2){
                System.out.println("Porfavor introduzca una opocion valida");
                System.out.println("Introduzca el tipo de codigo promocional que tenga");
                System.out.println("1: Para descuento a la mitad");
                System.out.println("2: Si no tienes descuento");
                opcioncodigo = sc.nextInt();
            }

            if (opcioncodigo == 1){
                if (opcioniva == 1){
                    generaliva = base * .21;
                    total1 = base + generaliva;
                    total = total1/2;
                    System.out.println("IVA (21%) = " + generaliva + " euros");
                    System.out.println("Precio con IVA = " + total1 + " euros");
                    System.out.println("Cod. promo (mitad) = -" + total + " euros");
                    System.out.println("TOTAL = " + total + " euros");
                }
                else if (opcioniva == 2) {
                    reducidoiva = base * .1;
                    total1 = base + reducidoiva;
                    total = total1/2;
                    System.out.println("IVA (10%) = " + reducidoiva + " euros");
                    System.out.println("Precio con IVA = " + total1 + " euros");
                    System.out.println("Cod. promo (mitad) = -" + total + " euros");
                    System.out.println("TOTAL = " + total + " euros");
                }

            } else if (opcioncodigo == 2) {
                if (opcioniva == 1){
                    generaliva = base * .21;
                    total1 = base + generaliva;
                    total = total1;
                    System.out.println("IVA (21%) = " + generaliva + " euros");
                    System.out.println("Precio con IVA = " + total1 + " euros");
                    System.out.println("Cod. promo = 0 euros" );
                    System.out.println("TOTAL = " + total + " euros");
                }
                else if (opcioniva == 2) {
                    reducidoiva = base * .1;
                    total1 = base + reducidoiva;
                    total = total1;
                    System.out.println("IVA (10%) = " + reducidoiva + " euros");
                    System.out.println("Precio con IVA = " + total1 + " euros");
                    System.out.println("Cod. promo = 0 euros");
                    System.out.println("TOTAL = " + total + " euros");
                }
            }

ej15

Scanner sc = new Scanner(System.in);
            double nota1;
            double n1por;
            double notadeseada;
            double deseadapor;
            double nota2;
            double n2por;
            System.out.println("Introduce tu primera nota: ");
            nota1 = sc.nextDouble();
            while (nota1 > 10 || nota1 < 0) {
                System.out.println("Porfavor introduzca una nota entre 0 y 10");
                System.out.println("Introduce tu primera nota: ");
                nota1 = sc.nextDouble();
            }
            System.out.println("Introduce la media que deseas obtener: ");
            notadeseada = sc.nextDouble();
            while (notadeseada > 10 || notadeseada < 0) {
                System.out.println("Porfavor introduzca una nota entre 0 y 10");
                System.out.println("Introduce tu primera nota: ");
                nota1 = sc.nextDouble();
            }


            n1por = (nota1 * 40) / 10;
            deseadapor = (notadeseada * 100) / 10;
            n2por = deseadapor - n1por;
            nota2 = (n2por * 10) / 60;
            if (nota2 > 10) {
                System.out.println("Te sera imposible alcanzar esta nota: " + String.format("%.2f", nota2));
                System.out.println("Mas suerte el proximo trimestre");
            } else {
                System.out.println("Para sacar " + notadeseada + " en el trimestre, necesitas un " + String.format("%.2f", nota2) + " en el segundo examen");
            }






 */





