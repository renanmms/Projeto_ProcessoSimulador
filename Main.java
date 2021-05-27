class Main {
  public static void main(String[] args) {
    // Instanciando tanques
    TOleo t1 = new TOleo(0);
    TBiodiesel t2 = new TBiodiesel(300);

    
    Simulador processo_biodisiel = new Simulador(t1, t2);
    processo_biodisiel.ligar();
    
    
  }
}