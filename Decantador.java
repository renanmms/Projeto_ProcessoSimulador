class Decantador extends Tanque
{
    private Reator reator;
    private double litrosGlicerina;
    private double litrosOleo;
    private double volumeAbastecidoEtanol;
    private double volumeAbastecidoSodio;
    private double volumeAbastecidoOleo;
    private double volumeEtanol;
    private double volumeSodio;
    private double volumeLavagem;
    private double volumeGlicerina;
    private double volumeOleo;

    Decantador(){

        capacidade = 10;
    }


    public void run()
    {
        // TODO Em construção
        processarElementos();
    }
    // Litros ====> Total
    // litrosGlicerina = litros - litrosEtanol - litrosSodio - litrosOleo
    // litros = litrosGlicerina + litrosEtanol + litrosSodio + litrosOleo
    public void processarElementos(){
        // Abastecendo decantador
        volumeEtanol += volumeAbastecidoEtanol;
        volumeSodio += volumeAbastecidoSodio;
        volumeOleo += volumeAbastecidoOleo;

        // Processamento do decantador
        volume = volumeEtanol + volumeOleo + volumeSodio;
        volumeGlicerina = volume * 0.02;
        volumeEtanol = volume * 0.09;
        volumeLavagem = volume * 0.89;
        System.out.printf("=============== Decantador ===============\nEtanol: %.2f L\nLavagem: %.2f L\nGlicerina: %.2f L\n", getVolumeEtanol(), getVolumeLavagem(), getVolumeGlicerina());

    }

    public void abastecerDecantador(){
        
    }

    public void setVolumeEtanol(double volumeAbastecidoEtanol){
        this.volumeAbastecidoEtanol = volumeAbastecidoEtanol;
    }


    public void setVolumeSodio(double volumeAbastecidoSodio){
        this.volumeAbastecidoSodio = volumeAbastecidoSodio;
    }

    public void setVolumeOleo(double volumeAbastecidoOleo){
        this.volumeAbastecidoOleo = volumeAbastecidoOleo;
    }

    public double getVolumeEtanol(){
        return volumeEtanol;
    }

    public double getVolumeSodio(){
        return volumeSodio;
    }

    public double getVolumeGlicerina(){
        return volumeGlicerina;
    }

    public double getVolumeOleo(){
        return volumeOleo;
    }

    public double getVolumeLavagem(){
        return volumeLavagem;
    }

}