class TOleo extends Tanque {
    double volumeAbastecido;

    TOleo(double volume)
    {
        this.volume = volume;
    }
    
    
    public void run(){
        try{
            System.out.println("TANQUE DE OLEO - status online");
            while(true){
                volumeAbastecido = abastecerOleo(Math.random() + 1);
                statusTOleo();
                Thread.sleep(10000); // TODO Verificar o tempo
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
        System.out.printf("=============== TANQUE DE OLEO ===============\nOLEO: %.2f L\n", getVolume());
        
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