# Escribir un algoritmo que realice la suma
# de todos los números pares entre 2 y 1000

suma = 0

def tipo(num):
    if (num % 2 == 0) :
        return "par"
    else:
        return "impar"

for i in range(2, 1001, 1):
    if tipo(i) == "par":
        print("sumando a", suma, "el número par", i)
        suma = suma + i

print("La suma de todos los números pares entre 2 y 1000 es:", suma)

# Nótese que hubiera sido más sencillo configurar el step del range como 2, iniciando en 2 este. 