public class Operacoes {

        public int somar(int a, int b)
        {
            return a + b;
        }
        public int subtrair(int a, int b)
        {
            return a - b;
        }
        public int multiplicar(int a, int b)
        {
            return a * b;
        }
        public int dividir(int a, int b) throws Exception {
            if (b == 0) {
                throw new Exception("Não é possível dividir por 0.");
            }
            return a / b;}



}
