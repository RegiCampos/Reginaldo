soma = 1
cont = 0
numero = 2
while(cont < 10):
    for i in range(2,numero):
        # print("Divisor: ",i)
        # print("Valor: ",numero%i==0)
        if (numero%i==0):
            soma = soma + i
    if (soma==numero):
        print(numero)
        cont = cont+1
    numero = numero + 1
    soma = 1