import java.util.Scanner; 
// Se Importa para permitir la entrada de datos por teclado

// Clase que contiene la lógica de la primera librería, que tiene como objetivo cumplir 3 funciones especificos.
class Libreria1{

   // Atributos de la clase
   private Object Menu; // Menú de opciones para el usuario.
   private boolean flag; // variable booleana para controlar el bucle de selección
   Scanner sc; // Objeto Scanner para leer la entrada del usuario.
    DESARROLLOUNO_JHONFREDMARTINEZUTRIA volver; //Instancia de la clsae principal para volver al ciclo inicial.

    public Libreria1(){
        this.Menu= "\n¿QUE QUIERE HACER?\n 1. Tabla de Multiplicar\n 2. Tipo de Triangulo\n 3. Promedio De Materia\n 4. Salir";
        this.sc=new Scanner(System.in);
        this.flag= true;
        // Se inicializan los atributos
    } // Constructor de la clase Libreria1

    public void Seleccion1(){
        do{
            System.out.println(Menu);
            int opcion= sc.nextInt();
            switch (opcion) {
                case 1:
                TabladeMultiplicar();
                 // Llama al método para generar una tabla de multiplicar
                    break;
                 
                case 2: 
                Triangulos();
                 // Llama al método para determinar el tipo de triángulo
                 break;

                case 3: 
                Promediomateria();
                // Llama al método para calcular el promedio de alguna materia
                break;

                case 4: 
                volver= new DESARROLLOUNO_JHONFREDMARTINEZUTRIA();
                //Se instancia la clase principal para salir del bucle de la Libreria1
                volver.SeleccionLibreria();
                flag=false;
                // Cambia el estado de la variable booleana para salir del bucle
                break;

                default:
                System.out.println("\nNo es una opcion valida\n");
                Seleccion1();
                 // Vuelve a solicitar la selección si la opción no es válida
                    break;
            }
        }while(flag);
       
    } // Método para que el usuario seleccione una opción del menú

private void TabladeMultiplicar(){

    System.out.print("\nIngrese el número para la tabla de multiplicar: ");
        int numero = sc.nextInt();
        System.out.print("\nIngrese la cantidad de multiplicaciones: ");
        int cantidad = sc.nextInt();

        System.out.println("\nTABLA DE MULTIPLICAR DEL " + numero + ":");
        for (int i = 1; i <= cantidad; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        Seleccion1();
        // Vuelve al menú de selección después de completar la operación
}// Función para generar una tabla de multiplicar

private void Triangulos(){

    System.out.print("\nIngrese la longitud del lado 1: ");
    double lado1 = sc.nextDouble();
    System.out.print("\nIngrese la longitud del lado 2: ");
    double lado2 = sc.nextDouble();
    System.out.print("\nIngrese la longitud del lado 3: ");
    double lado3 = sc.nextDouble();

    if (lado1 == lado2 && lado2 == lado3) {
        System.out.println("\nEL TRIANGULO ES EQUILATERO.");
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        System.out.println("\nEL TRIANGULO ES ISOCELES.");
    } else {
        System.out.println("\nEL TRIANGULO ES ESCALENO.");
    }
    Seleccion1();
      // Vuelve al menú de selección después de completar la operación
}// Función para determinar el tipo de triángulo

private void Promediomateria(){
    System.out.print("\nIngrese la cantidad de notas: ");
        int cantidadNotas = sc.nextInt();

        double suma = 0;
        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.print("\nIngrese la nota " + i + ": ");
            suma += sc.nextDouble();
        }

        double promedio = suma / cantidadNotas;
        System.out.println("\nEL PROMEDIO DE LAS NOTAS ES: " + promedio+"\n");

        Seleccion1();
        // Vuelve al menú de selección después de completar la operación
    }// Función para calcular el promedio de alguna materia

}


// Clase que contiene la lógica de la segunda librería, que tiene como objetivo operar un trinomio cudrado perfecto.
class Libreria2{

    Scanner sc; //Se crea un objeto Scanner. Las demas variables son inicializadas en los metodos, puesto que solo se usaran alli

    public Libreria2(){
        sc= new Scanner(System.in);
    }//Constructo de la clase Libreria2

    public void Recibir(){
        System.out.println("Ingrese el coeficiente 'a': ");
        double a = sc.nextDouble();

        System.out.println("Ingrese el coeficiente 'b': ");
        double b = sc.nextDouble();
   
        OperarTrinomio(a,b);
    
    } // Método para recibir los coeficientes del usuario y operar con un trinomio cuadrado perfecto

    public void OperarTrinomio(double a, double b){
        System.out.println("\nEste es el Binomio: ( "+a+"x + "+ b + ")^2");
        //Se muestra el binomio digitado.

        double Aelevado2= a*a;  // Calcula el primer término del trinomio cuadrado perfecto: a^2
        double DosAB= 2*a*b; // Calcula el segundo término del trinomio cuadrado perfecto: 2ab
        double Belevado2= b*b; // Calcula el tercer término del trinomio cuadrado perfecto: b^2

        //Muestra el trinomio cuadrado perfecto 
        System.out.println("\nEste es el Trinomio Cuadrado Perfecto: ("+ Aelevado2 + "x + " + DosAB + "x + " + Belevado2+")");
        
        //Se muestra el trinomio factorizado por factor comun.
        System.out.println("\nEste es el trinomio Factorizado: (" + a + "x + " + b + ")(" + a + "x + " + b + ")");
        
        
        double Verticex = -b / (2 * a); // Calcula la coordenada x del vértice del trinomio (vértice de la parábola)
        double Verticey = Verticex* Verticex; // Calcula la coordenada y del vértice del trinomio

        // Muestra las coordenadas del vértice del trinomio
        System.out.println("\nEste es el vertice del Trinomio: ("+ Verticex + ", " + Verticey + ")\n");

    }
}

// Clase principal que contiene el menú principal y las llamadas a las librerías
public class DESARROLLOUNO_JHONFREDMARTINEZUTRIA {

     // Atributos de la clase
    private boolean flag;
    Scanner sc;
    private Object Menu;
    Libreria1 ejecucion;
    Libreria2 ejecucionTrinomio;
    
// Constructor de la clase principal
    public DESARROLLOUNO_JHONFREDMARTINEZUTRIA(){
        sc= new Scanner(System.in);
        this.Menu= "\n¿A Que Libreria Desea Acceder?\n 1. Libreria Con 3 Funciones Especificas\n 2. Libreria Para Operar un Trinomio Cuadrado Perfecto\n 3. Salir\n";
        this.ejecucion= new Libreria1();
        this.ejecucionTrinomio= new Libreria2();
         // Se inicializan los atributos
    }



    public void SeleccionLibreria(){

     do{
        System.out.println(Menu);
        int opcion= sc.nextInt();
         switch (opcion) {

             case 1:
             ejecucion.Seleccion1();

                 break;
              
             case 2: 
            ejecucionTrinomio.Recibir();
              break;

             case 3: 
             flag= false;
             break;

             default:
             System.out.println("\nNo es una opcion valida\n");
             
                 break;
         }
     }while(flag);

    }
    // Método para que el usuario seleccione una opción del menú


    public static void main(String[]args){
      DESARROLLOUNO_JHONFREDMARTINEZUTRIA ejecutar = new DESARROLLOUNO_JHONFREDMARTINEZUTRIA();
      ejecutar.SeleccionLibreria();
    }//Metodo Principal de la clase, solo se crea una instancia de la clase principal y se llama al metodo de dicha clase.
    //Lo que resulta en que el main no este tan saturado.
}