class Main {
  public static void main(String[] args) {
    // Instanciando tanques
    // TODO Implementar tempo para capturar 1h de execução
    TOleo t_oleo = new TOleo(0);
    TEtNa t_etna = new TEtNa(0);
    TBiodiesel t_biodiesiel = new TBiodiesel(300);
    Reator r = new Reator(t_oleo, t_etna);
    
    // Passando os tanques para o construtor do simulador
    Simulador processo_biodisiel = new Simulador(t_oleo, t_biodiesiel, t_etna, r);
    processo_biodisiel.ligar();
    
    
  }
}