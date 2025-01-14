fun main() {

//    5 - Faça um algoritmo que leia o valor do salário mínimo e o
//            valor do salário de um usuário, calcule quantos salários mínimos esse
//
//    usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.412,00).


    println("Digite qual seu salario atual \n")
    val salary = readln().toFloat()

    val qtdMinSalary = salary / 1_412.00

    println("Voce ganha com o salario $salary o equivalente a $qtdMinSalary salarios minimos")


}