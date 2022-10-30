/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * * * *        Clase de Creacion y ejecucion de pruebas aleatorias      * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
import java.io.*;

public class Prueba {
    //Creacion de objeto de la clase Solucion
    Solution s = new Solution();
    
    //Creacion de objeto tipo Fichero de la clase File denominado "Pruebas.txt" 
    File Pruebas = new File("Pruebas.txt");
    
    //Creacion de objeto tipo Fichero de la clase File denominado "Resultados.txt" 
    File Resultado = new File("Resultados.txt");

    
    
    //Crear el archivo de  texto "Pruebas.txt", se debe trabajar usando excepciones -  try-catch
    public void crearArchivo() {
        try {
            System.out.println("Creando archivo de texto denominado 'Pruebas'...");

            if (Pruebas.createNewFile()) { //Creacion del archivo de texto  "Pruebas.txt"
                System.out.println("¡Archivo creado con exito!"); //Creacion del archivo por primera vez
            } else {
                System.out.println("El Archivo Pruebas.txt ya esta creado, revisa en el directorio principal"); // El archivo ya fue creado anteriormente
            }

        } catch (IOException Exception) {
            System.out.println("Error Grave en Ejecucion del Metodo");
        }
    }

    //Metodo que genera un numero aleatorio a traves de un rango (Maximo - Minimo)
    public static int generaNumeroAleatorio( int maximo, int minimo) {

        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num; //Retorna un numero entero aleatorio dentro del rango
    }

    //Metodo que genera, escribe  y almacena el conjunto de casos de pruebas en el archivo "Pruebas.txt"
    public void generarPruebas() {

        
        
        //Contadores de bucles  para cada una de las diferentes casos de prueba
        int pc = 1; //-> Primer Caso
        int sc = 1; //-> Segundo Caso
        int tc = 1; //-> Tercer Caso
        int cc = 1; //-> Cuarto Caso
        int qc = 1; //-> Quinto Caso

        
        try {
            
            // La Clase FileWriter permite la escritura de un archivo, se debe trabajar usando try-catch
            FileWriter escritura = new FileWriter(Pruebas);
            
            /* Primer Caso de Prueba - 20 pruebas de arreglos ordenados */
            while (pc <= 20) {
                
                
                /* 5 Variables de Numeros Aleatorios entre rangos*/
                //Rango entre 1 - 50
                int a = generaNumeroAleatorio(50, 1);
                //Rango entre 51 - 100
                int b = generaNumeroAleatorio(100, 51);
                //Rango entre 101 - 1000
                int c = generaNumeroAleatorio(101, 1000);
                //Rango entre 1001 - 2500
                int d = generaNumeroAleatorio(1001, 2500);
                //Rango entre 2501 - 5000
                int e = generaNumeroAleatorio(2501, 5000);
                
                //Escribiendo sobre el archivo dicho caso de prueba en String con espaciado y aplicando salto de linea
                escritura.write(a + " " + b + " " + c + " " + d + " " + e + "\r\n");
                pc++; //Incrementa iterador hasta cumplir con 20 lineas de casos de pruebas
            }
            /* Segundo Caso de Prueba - 20 pruebas de arreglos invertidos */
            
            while (sc <= 20) {
                int a = generaNumeroAleatorio(50, 1);
                
                int b = generaNumeroAleatorio(100, 51);
                
                int c = generaNumeroAleatorio(101, 1000);
                
                int d = generaNumeroAleatorio(1001, 2500);
                
                int e = generaNumeroAleatorio(2501, 5000);

                escritura.write(e + " " + d + " " + c + " " + b + " " + a + "\r\n");
                sc++;
            }
            /* Tercer Caso de Prueba - 20 pruebas de arreglos semiordenados */
            while (tc <= 20) {
                int a = generaNumeroAleatorio(50, 1);
                
                int b = generaNumeroAleatorio(100, 51);
                
                int c = generaNumeroAleatorio(101, 1000);
                
                int d = generaNumeroAleatorio(1001, 2500);
                
                int e = generaNumeroAleatorio(2501, 5000);

                escritura.write(a + " " + b + " " + c + " " + e + " " + d + "\r\n");
                tc++;
            }
            
            /* Cuarto Caso de Prueba - 20 pruebas de arreglos desordenados */
            while (cc <= 20) {
                int a = generaNumeroAleatorio(50, 1);
                
                int b = generaNumeroAleatorio(100, 51);
                
                int c = generaNumeroAleatorio(101, 1000);
                
                int d = generaNumeroAleatorio(1001, 2500);
                
                int e = generaNumeroAleatorio(2501, 5000);

                escritura.write(a + " " + d + " " + c + " " + b + " " + e + "\r\n");
                cc++;
            }
             /* Quinto Caso de Prueba - 20 pruebas de arreglos con posibilidad de obtener datos invalidos (Entradas erroneas) */
            while (qc <= 20) {
                int a = generaNumeroAleatorio(50, -50);
                
                int b = generaNumeroAleatorio(100, 51);
                
                int c = generaNumeroAleatorio(101, 1000);
                
                int d = generaNumeroAleatorio(1001, 2500);
                
                int e = generaNumeroAleatorio(2501, 10000);

                escritura.write(a + " " + d + " " + c + " " + b + " " + e + "\r\n");
                qc++;
            }

            escritura.close();
        } catch (IOException Exception) {

        }

    }

    public void ejecutarPruebas() {
        
        //Creacion del archivo de texto  "Resultado.txt"
        try {
            System.out.println("Creando archivo de texto denominado 'Resultado'...");

            if (Resultado.createNewFile()) {
                System.out.println("¡Archivo creado con exito!"); //Creacion del archivo por primera vez
            } else {
                System.out.println("El Archivo Resultado.txt ya esta creado, revisa en el directorio principal");// El archivo ya fue creado anteriormente
            }
            
            //Clase FileReader, lectura de un archivo (para este caso, lectura del archibo de texto: "Pruebas.txt"
            FileReader lector = new FileReader(Pruebas);
            BufferedReader lectura = new BufferedReader(lector);
            
            //Se lee cada linea completa del archivo de pruebas, se almacena en casodeprueba
            String casodeprueba = lectura.readLine();
            
            //Contador que ayudara a iterar los 100 casos de pruebas
            int iterador = 1;
            
            //Escritura del Archibo "Resultados.txt"
            FileWriter escritura = new FileWriter(Resultado);
            
            
            //Mientras iterador, realiza en bucle 100 iteracciones de los casos de prueba
            while (iterador <= 100) {
                
                //Leemos la cadena completa y convertimos la cadena en un arreglo de String arraynumerica [] separado por su espacio " " usando split()
                String[] arraynumerica = casodeprueba.split(" ");
                
                //Creacion de un arreglo de enteros int [], donde almacenara por cada linea, sus numeros
                int[] nums = new int[arraynumerica.length];
                
                //Bucle for que iterra cada uno de los elementos del arreglo de String
                for (int i = 0; i < arraynumerica.length; i++) {
                    //COnvierte cada String en un valor numerico y lo almacena en el arreglo int nums[]
                    nums[i] = Integer.parseInt(arraynumerica[i]);
                }
                
                //Una vez convertido la linea en un string en un arreglo de enteros , procederemos a llamar el metodo de ordenamiento por paridad
                s.sortArrayByParity(nums);
                
                //Imprime en consola la respuesta (Cada caso de prueba valido, cumple el siguiente formato "[numero par, numero impar]")
                
                System.out.print("["); //<--- Imprime en salida en consola
                String resultado= "["; //<--- Esta variable resultado se ira concatenando con mas datos, almacenando en el archivo "Resultado.txt"
                for (int i = 0; i < nums.length; i++) {

                    if (i != nums.length - 1) {

                        System.out.print(nums[i] + ","); //<--- Imprime en salida en consola cada uno de los elementos del arreglo ordenado separado por ","
                        resultado=(resultado + nums[i] + ","); //<--- resultado se concatena con el arreglo ordenado
                    } else {
                        System.out.println(nums[i] + "]"); //<--- Imprime en salida en consola, el ultimo elemento + cierre de llave
                        resultado = resultado + nums[i] + "]"; //<--- resultado se concatena con el ultimo elemento del arreglo ordenado  + cierre de llave
                    }
                    
                    
                } 
                
                //Escribe en el archivo de texto de resultados, la respuesta recibida y genera salto de linea
                escritura.write(resultado + "\r\n");
                casodeprueba = lectura.readLine();  //asigna el valor de casos de prueba, la siguiente linea del texto
                iterador++; //El iterador va incrementado!
            }
            //Finalizacion de las 100 iteracciones y cierre del escritura del archivo de "Resultados.txt"
            escritura.close();

        } catch (IOException Exception) {

        }
    }
}
