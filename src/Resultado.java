public class Resultado {
    public static void main(String[] args) throws Exception {
        Operacoes operacoes = new Operacoes();
        int soma = operacoes.somar(10, 20);
        int subtracao = operacoes.subtrair(soma, 20);
        int multiplicacao = operacoes.multiplicar(subtracao, 20);
        int divisao = operacoes.dividir(multiplicacao, 20);
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + subtracao);
        System.out.println("Resultado da multiplicação: " + multiplicacao);
        System.out.println("Resultado da divisão: " + divisao);
    }
}


