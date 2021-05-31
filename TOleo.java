class TOleo extends Tanque {
    double volumeAbastecido;

    TOleo(double volume)
    {
        this.volume = volume;
    }
    
    
    public void run(){
        try{
            while(true){
                volumeAbastecido = abastecerOleo(Math.random() + 1);
                statusTOleo();
                Thread.sleep(10000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    // Abastece o tanque de oleo com oleo que variam entre 1 a 2 L
    private double abastecerOleo(double litros)
    {
        volume += litros;
        return litros;
    }
    
    // Imprime a qtd de oleo no Tanque de Oleo
    private void statusTOleo(){
        System.out.println("=============== TANQUE DE OLEO ===============");
        System.out.printf("OLEO: %.2f L", getVolume());
        System.out.println("");
    }
    
    public void esvaziarTOleo(double litros){
        volume -= litros;
    }


    public double getOleoAbastecido(){
        return volumeAbastecido;
    }

    public double getVolume(){
        return volume;
    }
}