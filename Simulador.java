class Simulador
{
    // Atributos
    private TOleo t_oleo;
    private TBiodiesel t_biodiesiel;

    // Construtor
    Simulador(TOleo t_oleo, TBiodiesel t_biodiesiel)
    {
        this.t_oleo = t_oleo;
        this.t_biodiesiel = t_biodiesiel;
    }

    public void ligar(){
        t_oleo.start(); // qtd que variam de 1 a 2 litros de oleo
    }

    // GETTERS/SETTERS
    public TOleo getTOleo(){
        return t_oleo;
    }

    public TBiodiesel getTBiodiesel(){
        return t_biodiesiel;
    }

    public void setTOleo(){
        this.t_oleo = t_oleo;
    }

    public void setTBiodiesel(){
        this.t_biodiesiel = t_biodiesiel;
    }

}