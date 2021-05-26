class TOleo extends Tanque {
    
    TOleo(double volume)
    {
        this.volume = volume;
    }
    
    public void abastecerOleo(double litros)
    {
        volume += litros;
    }
}