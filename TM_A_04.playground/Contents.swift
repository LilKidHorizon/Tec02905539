import UIKit
/*:
# Playground - Actividad 4
* Condicionales y Ciclos
* Funciones
* Enumareción
*/
//IGNACIO LANDÍN LÓPEZ - 02905539
//Github: https://github.com/LilKidHorizon/Tec02905539.git

/*:
### Condicionales y Ciclos
A) Declarar la variable "datos" con los valores [3,6,9,2,4,1]
*/
var datos = [3,6,9,2,4,1]

print("Valores:", datos)
//: B) realizar el recorrido de la variable "datos" con la instrucción "for"
for i in datos {
print(i)
}

//: C) Encontrar los valores menores a 5

/*:
### Funciones
A) Crea la función "suma" que reciba dos parámetros de tipo entero regresando la suma de ambos números.
*/
func suma(a:Int , b:Int) -> Int {
    return a + b
}
print("Resultado: ", suma(a:3 , b: 6))
//: B) Crear la función "potencia" que reciba dos parámetros de tipo entero, el primer parámetro para el numero base y el segundo la potencia a elevar, regresando el resultado de la potencia.
func potencia(base a:Int, exponente b:Int) -> Int {
    return a * b
}

print("La potencia es:", potencia(base: 7, exponente: 2))
/*:
### Enumeraciones
A) Crea la enumaración "meses" para definir tipos de datos basados en los meses del año.
*/
enum Meses{
    case Enero
    case Febrero
    case Marzo
    case Abril
    case Mayo
    case Junio
    case Julio
    case Agosto
    case Septiembre
    case Octubre
    case Noviembre
    case Diciembre
}
//: B) Crear la función "numeroMes" que reciba el tipo de dato "meses" y regrese el numero del mes correspondiente
var numeroMes:Meses
numeroMes = .Enero


//: C) Para regresar el numero de mes correspondiente utilizar la "switch"
switch numeroMes{
case .Enero:
    print("Es el Mes N.1")
case .Febrero:
    print("Es el Mes N.2")
case .Marzo:
    print("Es el Mes N.3")
case .Abril:
    print("Es el Mes N.4")
case .Mayo:
    print("Es el Mes N.5")
case .Junio:
    print("Es el Mes N.6")
case .Julio:
    print("Es el Mes N.7")
case .Agosto:
    print("Es el Mes N.8")
case .Septiembre:
    print("Es el Mes N.9")
case .Octubre:
    print("Es el Mes N.10")
case .Noviembre:
    print("Es el Mes N.11")
case .Diciembre:
    print("Es el Mes N.12")
}
