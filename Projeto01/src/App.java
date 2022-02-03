import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*
         * =============================================================================
         * ========
         */

        /* Main �um m�todo autoexecut�vel em java */

        /*
         * int numero = 0;
         * 
         * while (numero <= 100) { /*(Enquanto)Verifica e depois executa )
         */

        /*
         * System.out.println ("O numero atual é : " + numero);
         * numero++;
         * }
         * /*===========================================================================
         * ==========
         */
        /* ----------------- */

        /*
         * int numero2 = 0;
         * do {
         * System.out.println ("O numero atual é : " + numero2);
         * numero2++;
         * } while (numero2 <= 60);
         * 
         * }
         * /*===========================================================================
         * ==========
         */
        /* Estrutura de repetição for (Para ir de ...) */

        /*
         * for (int numero1 = 230; numero1 >= 0; numero1 --){
         * System.out.println("Contando os números : " + numero1);
         * 
         * }
         * /*===========================================================================
         * ==========
         */
        /* Estrutura de repetição for com Breack(Para ir de ...) */

        /*
         * for (int numero2 = 5; numero2>= 0; numero2 --){
         * if (numero2 == 3){
         * System.out.println("Opa encontrei o : " + numero2);
         * System.out.println("Parei de executar");
         * break;
         * }
         * /*===========================================================================
         * ==========
         */
        /* Estrutura de repetição For e Continue */

        /*
         * for (int numero3 = 7; numero3 >= 0; numero3 --){
         * if (numero3 == 4 || numero3 == 2) {
         * System.out.println("Opa encontrei o: " + numero3);
         * 
         * continue;
         * } System.out.println("Continue executando");
         * }
         * }
         * /*===========================================================================
         * ==========
         */

        /*
         * double n1 = 90;
         * double n2 = 50;
         * double n3 = 40;
         * double n4 = 50;
         * double media = 0;
         * double maior = 0;
         * 
         * media = (n1+n2+n3+n4) / 4;
         * 
         * /*Opera��es l�gicas aninhadas : opera��es dentro de opera��es
         */

        /*
         * if (media >= 50) {
         * if (media >= 70) {
         * System.out.println("Aluno est� aprovado direto");
         * 
         * }else {
         * System.out.println("Aluno est� em recupera��o: " + media);
         * }
         * 
         * 
         * 
         * }else {
         * System.out.println("Aluno reprovado direto: " + media);
         * }
         * 
         * }
         * }
         * 
         * 
         * 
         * /* Condi��es l�gicas com If e Else
         */

        /*
         * if (media >= 70) {
         * System.out.println("Aluno aprovado: " + media);
         * 
         * }
         * 
         * if (media >= 40 && media <= 69) {
         * System.out.println("Aluno em recupera��o:" + media);
         * }else
         * if (media <= 40 ) {
         * System.out.println("Aluno reprovado:" + media);
         * }else
         * 
         * if (media >= maior && maior >= media) {
         * System.out.println("A maior nota foi:" + maior);
         * }
         */
        /* Operadores tern�rios recomendados para microvalida��es */

        /*
         * String saidaResultado;
         * 
         * saidaResultado = media >= 70 ? "Aluno aprovado" : "Aluno reprovado";
         * System.out.println(saidaResultado);
         * 
         * 
         * }
         * }
         */
        /*
         * =============================================================================
         * ========
         */
        /* Modulo: Resto da divisão "%" */

        /*
         * double carro = 9;
         * double pessoa = 2;
         * double resto = carro % pessoa;
         * 
         * System.out.println ("Sobraram exatamente:"+ resto +"carros.");
         * }
         * }
         * /
         */
        /*
         * =============================================================================
         * ========
         */

        String carros = JOptionPane.showInputDialog("Entre com a quantidade de carros");
        String pessoas = JOptionPane.showInputDialog("Entre com a quantidade de pessoas");
        System.out.println(carros);
        System.out.println(pessoas);

        double carroNumero = Double.parseDouble(carros); /* Converte a linha acima que é texto em variável (carros) */
        double pessoasNumero = Double.parseDouble(pessoas); /*
                                                             * Converte a linha acima que é texto em variável (pessoas)
                                                             */

        int divisão = (int) (carroNumero / pessoasNumero);

        double resto = carroNumero % pessoasNumero;

        JOptionPane.showMessageDialog(null, "Cada pessoa receberá : " + divisão + " carros restando  : " + resto
                + " carros, que retornará ao estoque");


                /*teste de commit*/


                atualização 2

                atualização 3

    }
}