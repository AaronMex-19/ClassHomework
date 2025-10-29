import math
import random

def edad():
    edad_usuario = input("Ingresa tu edad: ")
    print(f"Tu edad es: {edad_usuario} años")

def suma():
    num1 = float(input("Ingresa el primer número: "))
    num2 = float(input("Ingresa el segundo número: "))
    print(f"La suma de {num1} + {num2} es: {num1 + num2}")

def num_aleatorio():
    numero_secreto = random.randint(1, 100)
    while True:
        intento = int(input("Adivina el número entre 1 y 100: "))
        if intento < numero_secreto:
            print("El número es mayor.")
        elif intento > numero_secreto:
            print("El número es menor.")
        else:
            print("¡Felicitaciones, adivinaste el número!")
            break

def contador_vocales():
    cadena = input("Ingresa una cadena: ").lower()
    contador = sum(1 for c in cadena if c in "aeiou")
    print(f"La cadena tiene {contador} vocales.")


def palindromo():
    palabra = input("Ingresa una palabra: ")
    palabra_limpia = palabra.lower().replace(" ", "")
    es_palindromo = palabra_limpia == palabra_limpia[::-1]
    print(f"¿'{palabra}' es palíndromo?: {es_palindromo}")

def calcular_potencia():
    base = float(input("Ingresa la base: "))
    exponente = float(input("Ingresa el exponente: "))
    resultado = base ** exponente
    print(f"{base} elevado a la {exponente} es {resultado}")

def calcular_media():
    datos = input("Ingresa una lista de números separados por comas: ")
    lista = [float(x) for x in datos.split(",")]
    if len(lista) == 0:
        print("La lista está vacía.")
    else:
        media = sum(lista) / len(lista)
        print(f"La media es: {media}")

def invertir_cadena():
    cadena = input("Ingresa una cadena: ")
    print("Cadena invertida:", cadena[::-1])

def mayor_de_tres_numeros():
    n1 = float(input("Número 1: "))
    n2 = float(input("Número 2: "))
    n3 = float(input("Número 3: "))
    print("El número mayor es:", max(n1, n2, n3))

def calcular_area():
    radio = float(input("Ingresa el radio del cilindro: "))
    altura = float(input("Ingresa la altura del cilindro: "))
    area = 2 * math.pi * radio * altura + 2 * math.pi * radio**2
    print(f"El área del cilindro es: {area}")

def buscar_palabra():
    cadena = input("Ingresa una cadena: ")
    palabra = input("Ingresa la palabra que deseas buscar: ")
    print("¿La palabra está en la cadena?:", palabra.lower() in cadena.lower())

def promedio():
    numeros = [float(x) for x in input("Ingresa varios números separados por comas: ").split(",")]
    if len(numeros) == 0:
        print("No se ingresaron números.")
    else:
        print("El promedio es:", sum(numeros) / len(numeros))

def multiplicar_lista():
    lista = [float(x) for x in input("Ingresa una lista de números separados por comas: ").split(",")]
    numero = float(input("Ingresa el número multiplicador: "))
    nueva_lista = [x * numero for x in lista]
    print("Nueva lista:", nueva_lista)

def mayor_de_varios_numeros():
    numeros = [float(x) for x in input("Ingresa varios números separados por comas: ").split(",")]
    print("El número mayor es:", max(numeros))

def calcular_mediana():
    numeros = sorted([float(x) for x in input("Ingresa varios números separados por comas: ").split(",")])
    n = len(numeros)
    if n == 0:
        print("No se ingresaron números.")
        return
    if n % 2 == 0:
        mediana = (numeros[n//2 - 1] + numeros[n//2]) / 2
    else:
        mediana = numeros[n//2]
    print("La mediana es:", mediana)

def contar_ocurrencias():
    cadena = input("Ingresa una cadena: ").lower()
    palabra = input("Ingresa la palabra a contar: ").lower()
    print(f"La palabra '{palabra}' aparece {cadena.count(palabra)} veces.")

def menu():
    while True:
        print("\n=== TALLER DE FUNCIONES EN PYTHON ===")
        print("1. Nivel 1 ")
        print("2. Nivel 2 ")
        print("3. Nivel 3 ")
        print("4. Nivel 4 ")
        print("5. Salir")

        opcion = input("Selecciona una opción: ")

        if opcion == "1":
            menu_nivel1()
        elif opcion == "2":
            menu_nivel2()
        elif opcion == "3":
            menu_nivel3()
        elif opcion == "4":
            menu_nivel4()
        elif opcion == "5":
            print("¡Hasta luego!")
            break
        else:
            print("Opción no válida. Intenta de nuevo.")


def menu_nivel1():
    print("\n--- Nivel 1 ---")
    print("1. edad")
    print("2. suma")
    print("3. num aleatorio")
    print("4. contador_vocales")
    opcion = input("Elige una función: ")

    if opcion == "1": edad()
    elif opcion == "2": suma()
    elif opcion == "3": num_aleatorio()
    elif opcion == "4": contador_vocales()
    else: print("Opción inválida.")

def menu_nivel2():
    print("\n--- Nivel 2 ---")
    print("1. palindromo()")
    print("2. calcular potencia()")
    print("3. calcular media()")
    opcion = input("Elige una función: ")

    if opcion == "1": palindromo()
    elif opcion == "2": calcular_potencia()
    elif opcion == "3": calcular_media()
    else: print("Opción inválida.")

def menu_nivel3():
    print("\n--- Nivel 3 ---")
    print("1. invertir cadena()")
    print("2. mayor de tres numeros()")
    print("3. calcular area()")
    print("4. buscar palabra()")
    opcion = input("Elige una función: ")

    if opcion == "1": invertir_cadena()
    elif opcion == "2": mayor_de_tres_numeros()
    elif opcion == "3": calcular_area()
    elif opcion == "4": buscar_palabra()
    else: print("Opción inválida.")

def menu_nivel4():
    print("\n--- Nivel 4 ---")
    print("1. promedio()")
    print("2. multiplicar_lista()")
    print("3. mayor de varios numeros()")
    print("4. calcular mediana()")
    print("5. contar ocurrencias()")
    opcion = input("Elige una función: ")

    if opcion == "1": promedio()
    elif opcion == "2": multiplicar_lista()
    elif opcion == "3": mayor_de_varios_numeros()
    elif opcion == "4": calcular_mediana()
    elif opcion == "5": contar_ocurrencias()
    else: print("Opción inválida.")

if __name__ == "main":
    menu()

