class TOleo extends Tanque {
    
    TOleo(double volume)
    {
        this.volume = volume;
    }
    
    public void abastecerOleo(double litros)
    {
        volume += litros;
    }

    public void run(){
        abastecerOleo(Math.random() + 1);
        System.out.printf("Tanque de Oleo\n %6.2f L", getVolume());
    }
}