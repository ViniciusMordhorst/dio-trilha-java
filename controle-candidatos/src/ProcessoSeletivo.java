import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
       String [] candidatos = {"Felipe","Vinicius","Isabela","Levi","Marco"};
        for(String candidato : candidatos) {
    entrandoEmContato(candidato);
            
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1; 
        boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}


    

    static boolean atender(){
        return new Random().nextInt(3)==1;

    }

    static void imprimirSelecionados(){

        String [] candidatos = {"Felipe","Vinicius","Isabela","Levi","Marco"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de numero " + (i+1) + " é " + candidatos[i]);

        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }


    }

    public static void selecaoCandidatos(){

        String [] candidatos = {"Felipe","Vinicius","Isabela","Levi","Marco","Jean","Mikasa"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse valor: " + salarioPretendido);
            if (salarioBase >=salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;

            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1000,2200);

    }

    public static void analisarCanditado(double salarioPretendido){    
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)  {
            System.out.println("Ligar para o candidato");
        } else if(salarioBase==salarioPretendido)
        System.out.println("Ligar para o candidato com contra proposta");

        else {System.out.println("Aguardando demais candidatos");
    }

    }

}