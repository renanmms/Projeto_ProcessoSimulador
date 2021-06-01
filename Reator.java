class Reator extends Tanque
{
    TOleo t1;
    TEtNa t2;
    Decantador d;

    protected double litrosSodio;//1,25l
    protected double litrosEtanol;//2,50l
    protected double litrosOleo;//1,25l

    Reator(TOleo t1, TEtNa t2, Decantador d){
        this.t1 = t1;
        this.t2 = t2;
        this.d = d;
        litrosSodio = 0;
        litrosEtanol = 0;
        litrosOleo = 0;
        // Reator processa 5 litros por segundo
        capacidade = 5;
    }

    
    public void Acionar(){
        // TODO Lançar a saída para o Decantador
        
    }
    
    // Método run onde vai ser rodado a thread
    public void run()
    {
        // Contador com a quantidade de ciclos do reator
        int i = 0;
        try{
            
            while(true){
                abastecerReator();
                
                verificaVolume(litrosSodio, litrosEtanol, litrosOleo);
                
                // Imprime elementos no reator
                statusReator();
                
                i++;
                System.out.println("\nQuantidade de ciclos executados: " + i);
                System.out.println("===========================================");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    // GETTERS / SETTERS
    private void statusReator(){
        System.out.printf("=================== REATOR ===================\nEtOH (ETANOL): %.2f L \nOLEO: %.2f L \nNaOH (HIDROXIDO DE SODIO): %.2f L \n", getLitrosEtanol(), getLitrosOleo(),getLitrosSodio());
        
    }
    
    private void verificaVolume(double litrosSodio, double litrosEtanol, double litrosOleo){
        // Se o reator atingir 1 parte de NaOH, 1 parte de Oleo e 2 partes de etanol
        if(litrosSodio >= 1 && litrosEtanol >= 2 && litrosOleo >= 1){
            // O reator é acionado e lança a saída para o decantador
            System.out.println("Acionando o Reator");
            Acionar();
        }
    }
    
    // TODO Abastecer o reator com sodio e etanol
    private void abastecerReator(){

        if(volume >= capacidade){
            System.out.println("Reator cheio");
            
        }else{
            litrosOleo += t1.getOleoAbastecido(); 
            litrosEtanol += t2.getEtanolAbastecido();
            litrosSodio += t2.getSodioAbastecido();
            // Após abastecer, deve-se esvaziar o volume abastecido no tanque de oleo
            if(t1.getVolume() >= 0)
            {
                //System.out.printf("\nTanque de Oleo: %.2f\n", getVolume());
                t1.esvaziarTOleo(t1.getOleoAbastecido()); 
                t2.esvaziarTEtNa(t2.getEtanolAbastecido());
                t2.esvaziarTEtNa(t2.getSodioAbastecido());
            }
            
            volume = litrosEtanol + litrosSodio + litrosOleo;
        }
        //System.out.printf("Volume Total: %.2f \n", volume);
    }


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