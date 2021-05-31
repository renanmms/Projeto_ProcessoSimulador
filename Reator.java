class Reator extends Tanque
{
    TOleo t1;

    protected double litrosSodio;//1,25l
    protected double litrosEtanol;//2,50l
    protected double litrosOleo;//1,25l

    Reator(TOleo t1){
        this.t1 = t1;
        litrosSodio = 0;
        litrosEtanol = 0;
        litrosOleo = 0;
    }

    
    public void Acionar(){
        litrosOleo += t1.getVolumeAbastecido();
        // TODO Abastecer o reator com sodio e etanol
        
    }

    // Método run onde vai ser rodado a thread
    public void run()
    {
        // TODO Adicionar a condição para acionar o reator
        try{

            while(true){
                Acionar();
                System.out.println("=================== REATOR ===================");
                System.out.printf("EtOH (ETANOL): %.2f L \n", getLitrosEtanol());
                System.out.printf("OLEO: %.2f L \n", getLitrosOleo());
                System.out.printf("NaOH (HIDROXIDO DE SODIO): %.2f L \n", getLitrosSodio());
                Thread.sleep(5000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
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