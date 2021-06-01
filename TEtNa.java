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
                Thread.sleep(1000);
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
    private void statusTEtNa(){
        System.out.printf("=============== TANQUE DE ETANOL E SODIO ===============\nEtanol: %.2f L\nSodio: %.2f L\n", getVolumeEtanol(), getVolumeSodio());
    }
    
    public void esvaziarTEtNa(double litros){
        volume -= litros;
    }


    public double getEtanolAbastecido(){
       return volumeAbastecidoEtanol;
    }

    public double getSodioAbastecido(){
        return volumeAbastecidoSodio;
    }

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