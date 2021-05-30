class Reator extends Tanque
{

    protected double litrosSodio;//1,25l
    protected double litrosEtanol;//2,50l
    protected double litrosOleo;//1,25l

    public void Acionar(){

    }

    // GETTERS / SETTERS
    public void setLitrosSodio(double _litrosSodio)
    {   
        litrosSodio = _litrosSodio;
    }

    public double getLitrosSodio()
    {
        return litrosSodio;
    }

    public void setLitrosEtanol(double _litrosEtanol)
    {   
        litrosEtanol = _litrosEtanol;
    }

    public double getLitrosEtanol()
    {
        return litrosEtanol;
    }

    public void setLitrosOleo(double _litrosOleo)
    {   
        litrosOleo = _litrosOleo;
    }

    public double getLitrosOleo()
    {
        return litrosOleo;
    }

}