class Simulador
{
    
    // Atributos
    private TOleo t_oleo;
    private TBiodiesel t_biodiesiel;
    private Reator reator;
    private TEtNa t_etna;
    private Decantador decant;
    
    
    // Construtor
    Simulador(TOleo t_oleo, TBiodiesel t_biodiesiel, TEtNa t_etna, Reator reator, Decantador decant)
    {
        this.t_oleo = t_oleo;
        this.t_biodiesiel = t_biodiesiel;
        this.reator = reator;
        this.t_etna = t_etna;
        this.decant = decant;
    }

    public void ligar(){
        t_oleo.start(); // qtd que variam de 1 a 2 litros de oleo
        reator.start();
        t_etna.start();
        decant.start();

    }

    // GETTERS/SETTERS
    public Simulador getSimulador(){
        return this;
    }
    
    public TOleo getTOleo(){
        return t_oleo;
    }

    public TBiodiesel getTBiodiesel(){
        return t_biodiesiel;
    }

    public TEtNa getTEtNa(){
        return t_etna;
    }

    public Reator getReator(){
        return reator;
    }

    public Decantador getDecantador(){
        return decant;
    }

    public void setTOleo(TOleo t_oleo){
        this.t_oleo = t_oleo;
    }

    public void setTBiodiesel(TOleo t_biodisiel){
        this.t_biodiesiel = t_biodiesiel;
    }

    public void setReator(Reator reator){
        this.reator = reator;
    }

}