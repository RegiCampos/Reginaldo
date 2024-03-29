numero = int(input("Digite um número: "))
soma = 1
for i in range(2,numero):
    print("Valor: ",numero%i==0)
    print("I: ",i)
    if (numero%i==0):
        soma = soma + i 
if (soma==numero):
    print("Perfeito")
else:
    print("Procure um cirurgião plástico")