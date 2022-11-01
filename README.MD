# :trident: Ordenamiento por Paridad :trident:
_Bienvenido  a nuestro repositorio :wave:_

:construction_worker:*Analisis y Diseño de Algoritmos*  :memo:

## Tabla de Contenido 
![alusion](https://s4.gifyu.com/images/Intro--Explicacion.gif)
- [Ordenamiento por Paridad](#ordenamiento)
    + [¿Que significa paridad?](#significado)
    + [Problema de Sort Array by Parity](#problema)
    + [Entrada del Problema](#entrada)
    + [Salida del Problema](#salida)
    + [Criterios de Aceptacion](#criterios)
    
- [Algoritmo de Ordenamiento por Paridad](#algoritmo)
    + [Descripcion de la Solucion](#explicacion)
    + [Analisis de la Complejidad](#analisis)
    
- [Pruebas del Algoritmo](#pruebas)
    + [herramientas de desarrollo](#herramientas)
    + [Net Beans IDE](#netbeans)
    + [Java JDK](#jdk)
    - [Estructura de las Pruebas](#estructura)
        + [Clase Main](#mainjava)
        + [Clase Prueba](#pruebajava)
        + [Clase Solucion](#solucionjava)
- [Autores](#autores)



# ordenamiento  
### significado
Ordenar por paridad, significa ordenar un conjunto de numero entre 2 conjunto, un conjunto entre numeros pares y impares como se visualiza:
![alusion](https://i.ibb.co/KxmxG9y/Captura2332.png)
> Ordenamiento por Paridad

### problema
Tanto en el  [enlace del problema](https://leetcode.com/problems/sort-array-by-parity/) como en la [Documentacion del Algoritmo](https://docs.google.com/document/d/1BqPzuK0j9PFyKI2hvA4-E8kaOvDNW383bzxna2t-JTc/edit?usp=sharing), se hace referencia al problema de ordenamiento por paridad, donde se envia como entrada un arreglo de enteros: **int nums[]** donde retornara dicho arreglo ordenado por pariedad, es decir,  ordenado primero los numeros  pares e consecuentemente los numeros impares 

#### entrada
Se envia como dato de entrada un arreglo tipo entero, por ejemplo:
```java
int [] nums = {1,4,7,10};
```
#### salida
Se retorna como salida el arreglo de enteros ordenados con Pariedad como se evidencia la siguiente imagen:
```java
return nums = {4,10,1,7};
```
> Nota: No importa el orden entre el conjunto de elementos pares e impares, lo importante es separar los elementos pares respecto a los impares, las siguiente salidas son validas para el caso de prueba anterior y que cumpla los *criterios de aceptacion*:

```java
return nums = {10,4,7,1};
```
```java
return nums = {4,10,7,1};
```
```java
return nums = {10,4,1,7};
```
#### criterios
Seran aceptados aquellas entradas que cumpla las siguientes restricciones definidas por el enunciado del problema
* El tamaño del arreglo debe ser **mayor o igual** a 0 y **menor o igual** a 5000
* El elemento del arreglo en la posicion nums[i] debe ser **mayor o igual** a 0 y **menor o igual** a 5000

# algoritmo
![algoritmo](https://i.ibb.co/nC09wcD/image.png)
> Algoritmo de Ordenamiento por Paridad
### explicacion
*" El algoritmo propuesto para el ejercicio se basa en hacer un intercambio de números pares por números impares, por lo que se decidió usar 2 variables. Ambas son variables de tipo “Integer”, donde una se llama aux, la cual tiene la función de apuntador, donde este siempre comenzará en el inicio del arreglo. La otra variable es llamada “tmp”, la cual servirá para poder almacenar el valor de la posición “i” del arreglo, para que de esta manera se pueda realizar el cambio de valores. 
Como se ha mencionado anteriormente, lo que busca el ejercicio es ordenar el arreglo 
donde los pares estén primeros que los impares, por lo que no importa si estos en sí están ordenados de menor a mayor  o viceversa. Por lo que no importa que el intercambio anteriormente mencionado sea entre un número par por otro número par, ya que de igual manera la variable auxiliar estará iterando el arreglo con ayuda del ciclo for.* 

### analisis
*Ahora bien, si hacemos un análisis del código, está señalizado en la imagen adjunta anterior, podemos darnos cuenta que la función matemática que la describe es:
8n+4, lo que significa que su complejidad algorítmica es O(n). 
Podemos decir que no tiene un costo algorítmico alto, debido a que es una función lineal, se puede decir que es una complejidad aceptable para este ejercicio.
*  
![complejidad](https://i.ibb.co/4fQn2PR/image.png)
> Analisis de la Complejidad, una complejidad lineal para el peor de los casos

# pruebas
Las pruebas del algoritmo se basa en la *escritura* y *lectura* de 2 ficheros especificos, **pruebas.txt** & **resultados.txt**, ademas, la aplicacion fue desarrollado en el lenguaje de Programacion Java, por ende, es necesario que tengas instalado las siguientes herramientas/frameworks o librerias:

<img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" width="74" height="64" >
> Algoritmo y Pruebas desarrollados en Lenguaje de Programacion java

## herramientas
### netbeans
* Descarga Net Beans desde la [pagina oficial](https://netbeans.apache.org/download/index.html) <img src="http://www.davidtan.org/wp-content/uploads/2009/12/netbeans-ide-logo-icon.png" width="74" height="64" >
### jdk
* Descarga Java JDK desde  [aqui](https://www.java.com/es/download/help/develop_es.html) <img src="https://miro.medium.com/max/785/1*7fDw5W4a5WxJY9wQIgzNLQ.jpeg" width="74" height="64" >

# estructura
Las pruebas se basan en **3 clases principales**: *Main*, *Prueba* y *Solucion.java*

![estructura](https://i.ibb.co/CvGvVrt/image.png)
> Estructura del Proyecto
### mainjava 
Esta clase principal, invoca los metodos de Pruebas.java, estos metodos consisten en la generacion, creacion e impresion de los casos de prueba

### pruebajava
Esta clase es el corazon de la aplicacion, posee 4 metodos que permite:
* Crear un archivo de texto vacio para almacenar el conjunto de casos de prueba
* Escribir sobre el fichero recien creado y almacenar con datos aleatorios
* Generar un conjunto de numero aleatorios a traves de una petcion o llamado al metodo Math.Random();
* Leer los casos d epruebas generados, imprimir en consola la respuesta y anexar dichas respuestas en un nuevo archivo de texto, llamado "respuestas.txt"
### solucionjava
Esta clase abarca unicamente el algoritmo de ordenamiento por paridad, usado solamente para la evaluacion de los casos de prueba

# autores

* Marlon Stiven 
* Orlando Beltran





