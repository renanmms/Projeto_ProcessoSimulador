class TOleo extends Tanque {
    double volumeAbastecido;
    //private int tempo;

    TOleo(double volume)
    {
        this.volume = volume;
        //this.tempo = tempo;
    }
    
    
    public void run(){
        try{
            while(true){
                volumeAbastecido = abastecerOleo(Math.random() + 1);
                System.out.println("=================== TANQUE DE OLEO ===================");
                System.out.printf("OLEO: %.2f L", getVolume());
                System.out.println("");
                Thread.sleep(10000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    // TODO precisa zerar o volumeAbastecido quando mandar para o reator
    private double abastecerOleo(double litros)
    {
        volume += litros;
        return litros;
    }

    public double getVolumeAbastecido(){
        return volumeAbastecido;
    }

    public double getVolume(){
        return volume;
    }
}