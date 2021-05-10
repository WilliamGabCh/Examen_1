import java.util.Scanner;
public class Examen {
    static Scanner tc = new Scanner(System.in);
    
    static void Ejercicio1(){
        //variables
        double primeraUni, segundaUni, terceraUni, trabajoFin, notaFinal;
        //ingreso de datos a las variables
        System.out.print("Nota PRIMERA UNIDAD: ");
        primeraUni=tc.nextInt();
        System.out.print("Nota SEGUNDA UNIDAD: ");
        segundaUni=tc.nextInt();
        System.out.print("Nota TERCERA UNIDAD: ");
        terceraUni=tc.nextInt();
        System.out.print("Nota TRABAJO FINAL: ");
        trabajoFin=tc.nextInt();
        //operación
        notaFinal=(primeraUni*0.2)+(segundaUni*0.15)+(terceraUni*0.15)+(trabajoFin*0.5);
        //resultado
        System.out.println("Su promedio final es: "+notaFinal);
    }
    
    static void Ejercicio2(){
        //variables
        double sueldo, bono=0;
        int puntos;
        //ingreso de datos a las variable
        System.out.print("Ingrese sueldo: S/.");
        sueldo=tc.nextDouble();
        System.out.print("Ingrese sus  puntos: ");
        puntos=tc.nextInt();
        //proceso  
        if(puntos>=50 && puntos<=100){
            bono=sueldo*0.1;
        } else{
            if(puntos>=101 && puntos<=150){
                bono=sueldo*0.4;
            } else{
                if(puntos>=151){
                    bono=sueldo*0.7;
                }
            }
        }
        //resultado
        System.out.println("Su bono que le corresponde es: S/."+bono);   
    }
       
    static void Ejercicio3(){
        //variables
        int edad;
        char sexo,vacuna=' ';
        //ingreso de datos a las variable
        System.out.print("Ingrese EDAD: ");
        edad= tc.nextInt();
        System.out.print("Ingrese H si es hombre y M si es mujer: ");
        sexo= tc.next().charAt(0);
        //proceso
        if(edad>70){
            switch(sexo){
                case 'H':
                    vacuna='C';
                    break;
                case 'M':
                    vacuna='C';
                    break;
            } 
        } else if(edad>=16&&edad<=69){
            switch(sexo){
                case 'H':
                    vacuna='A';
                    break;
                case 'M':
                    vacuna='B';
                    break;
            }     
        } else if(edad<16){
            switch(sexo){
                case 'H':
                    vacuna='A';
                    break;
                case 'M':
                    vacuna='A';
                    break;
            }     
        } 
        //resultado
        System.out.println("La vacuna que le corresponde es: "+vacuna);        
    }
    
    static void Ejercicio4(){
        //variabels
        double var1=0, var2=0, resultado=0;
        char signo=' ';
        String operacion="";
        //ingreso de datos a las variables
        System.out.print("Número 1: "); 
        var1=tc.nextDouble();
        System.out.print("Número 2: "); 
        var2=tc.nextDouble();
        System.out.print("Ingrese el signo. \n suma + , resta - , multiplicación *, división / , potenciación ^ : "); 
        signo=tc.next().charAt(0);   
        //proceso
        switch (signo){
            case '+':
                operacion="Suma";
                resultado=var1+var2;
                break;
            case '-':
                operacion="Resta";
                resultado=var1-var2;
                break;
            case '*':
                operacion="Multiplicación";
                resultado=var1*var2;
                break;
            case '/':
                operacion="División";
                resultado=var1/var2;
                break;
            case '^':
                operacion="Potenciación";
                resultado = Math.pow(var1, var2);
                break;
        }
        //resultado
        if (signo=='+'||signo=='-'||signo=='*'||signo=='/'||signo=='^') {
            System.out.println("La " +operacion+" de "+var1+" y "+var2+" es = "+resultado);
        }
        else{
            System.out.println("Escriba bien el signo + , - , * , / , ^");
        }
    }
    
    static void Ejercicio5(){
        //variables
        int numEjercicio;
       //ingreso de datos a las variables
        System.out.print("NUMERO De EJERCICIO que desea ejecutar, del  1 al 4: ");
        numEjercicio=tc.nextInt();
        //proceso y resultado
        switch (numEjercicio){
            case 1:
                System.out.println("--------------Ejercicio 1--------------");
                Ejercicio1();
                break;
            case 2:
                System.out.println("--------------Ejercicio 2--------------");
                Ejercicio2();
                break;
            case 3:
                System.out.println("--------------Ejercicio 3--------------");
                Ejercicio3();
                break;
            case 4:
                System.out.println("--------------Ejercicio 4--------------");
                Ejercicio4();
                break;
            default:System.out.println("el ejercicio ingresado no existe");
        } 
    }
    
    public static void main(String[]arg){
        Ejercicio5();
    }
   
}
