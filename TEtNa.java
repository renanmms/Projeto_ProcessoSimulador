class TEtNa extends Tanque
{

    double volumeAbastecidoSodio;
    double volumeAbastecidoEtanol;

    double volumeSodio;
    double volumeEtanol;

    TEtNa(double volume)
    {
        this.volume = volume;
    }
    
    
    public void run(){
        try{
            System.out.println("TANQUE DE ETANOL E SODIO - status online");
            while(true){
                volumeAbastecidoSodio = abastecerSodio((Math.random())/4);
                volumeAbastecidoEtanol = abastecerEtanol((Math.random())/8);
                statusTEtNa();
                Thread.sleep(10000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    // Abastece o tanque de oleo com oleo que variam entre 1 a 2 L
    private double abastecerSodio(double litros)
    {
        volumeSodio += litros;
        volume += volumeSodio;
        return litros;
    }

    private double abastecerEtanol(double litros)
    {
        volumeEtanol += litros;
        volume += volumeEtanol;
        return litros;
    }
    
    // Imprime a qtd de oleo no Tanque de Oleo
    private void statusEtNa(){
        System.out.println("=============== TANQUE DE ETANOL E SODIO ===============");
        System.out.printf("Etanol: %.2f L", getVolumeEtanol());
        System.out.println("");
        System.out.printf("Sodio: %.2f L", getVolumeSodio());
    }
    
    public void esvaziarTEtNa(double litros){
        volume -= litros;
    }


    //public double getOleoAbastecido(){
    //    return volumeAbastecido;
    //}

    public double getVolume(){
        return volume;
    }

    public void setVolumeEtanol(double _volumeEtanol)
    {   
        volumeEtanol = _volumeEtanol;
    }
    
    public double getVolumeEtanol()
    {
        return volumeEtanol;
    }

    public void setVolumeSodio(double _volumeSodio)
    {   
        volumeSodio = _volumeSodio;
    }
    
    public double getVolumeSodio()
    {
        return volumeSodio;
    }

}