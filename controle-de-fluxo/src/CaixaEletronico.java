
//Estruturas condicionais
// CaixaEletronico.java - Condicionais Simples
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 17.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}

/*  Condicionais encadeadas
 *  ResultadoEscolar.java
    public class ResultadoEscolar {
        public static void main(String[] args) {
        int nota = 6;

	        if (nota >= 7)
		        System.out.println("Aprovado");
	        else if (nota >= 5 && nota < 7)
		        System.out.println("Recuperação");
	        else
		        System.out.println("Reprovado");
    }
}
 */