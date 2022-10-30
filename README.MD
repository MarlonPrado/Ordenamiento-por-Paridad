# :trident: Ordenamiento por Paridad :trident:
_Bienvenido  a nuestro repositorio :wave:_

:construction_worker:*Analisis y Diseño de Algoritmos*  :memo:

## Tabla de Contenido 

- [Ordenamiento por Paridad](#ordenamiento)
    + [¿Que significa paridad?](#significado)
    + [Problema de Sort Array by Parity](#problema)
    + [Entrada del Problema](#entrada)
    + [Salida del Problema](#salida)
    + [Criterios de Aceptacion](#criterios)
+ Item B
    + Item B 1
    + Item B 2
    + Item B 3
+ Item C
    * Item C 1
    * Item C 2
    * Item C 3


## ordenamiento
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
