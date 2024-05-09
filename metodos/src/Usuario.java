public class Usuario {
    
    public static void main(String[] args) throws Exception {
        SmartTV sTV = new SmartTV();

        sTV.diminuirVolume();
        sTV.diminuirVolume();
        sTV.diminuirVolume();
        sTV.diminuirVolume();
        sTV.diminuirVolume();
        sTV.diminuirVolume();
        sTV.aumentarVolume();

        sTV.mudarCanal(13);
        System.out.println("Canal Atual : " + sTV.canal);
        sTV.mudarCanal(22);
  

        System.out.println("TV ligada ? " + sTV.ligada);
        System.out.println("Canal Atual : " + sTV.canal);
       
        System.out.println("Volume Atual : " + sTV.volume);

        sTV.ligar();
        System.out.println("Status : TV Ligada = " + sTV.ligada);

        sTV.desligar();
        System.out.println("Status : TV Ligada = " + sTV.ligada);


    }

}
