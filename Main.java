class Main {
  public static void main(String[] args) {
    // Instanciando tanques
    // TODO Implementar tempo para capturar 1h de execução
    TOleo t1 = new TOleo(0);
    TBiodiesel t2 = new TBiodiesel(300);
    Reator r = new Reator(t1);
    
    Simulador processo_biodisiel = new Simulador(t1, t2, r);
    processo_biodisiel.ligar();
    
    
  }
}