public class Usuario {
    
    public static void main(String[] args) throws Exception {
        SmartTV sTV = new SmartTV();

        System.out.println("TV ligada ? " + sTV.ligada);
        System.out.println("Canal Atual : " + sTV.canal);
        System.out.println("Volume Atual : " + sTV.volume);

        sTV.ligar();
        System.out.println("Status : TV Ligada = " + sTV.ligada);

        sTV.desligar();
        System.out.println("Status : TV Ligada = " + sTV.ligada);
    }

}
