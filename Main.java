class Main {
  public static void main(String[] args) {
    // Instanciando tanques
    // TODO Implementar tempo para capturar 1h de execução
    TOleo t1 = new TOleo(0);
    TEtNa t2 = new TEtNa(0);
    TBiodiesel t3 = new TBiodiesel(300);
    Reator r = new Reator(t1);
    
    Simulador processo_biodisiel = new Simulador(t1, t2, t3, r);
    processo_biodisiel.ligar();
    
    
  }
}