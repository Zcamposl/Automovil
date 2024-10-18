package segundoejercicio;

public class SegundoEjercicio {

    public static void main(String[] args) {
         Automovil carro1 = new Automovil("llama", 2004, 30, 
                 TipoCombustible.BIODIESEL, TipoCarro.COMPACTO, 6, 6, 250, 
                 TipoColor.BLANCO,100);
          carro1.imprimir();
          carro1.acelerar(20);
          carro1.desacelerar(50);
          carro1.frenar();
          
          System.out.println("");
          
         Automovil carro2 = new Automovil("Ford", 2018, 3, 
                 TipoCombustible.DIESEL,
                 TipoCarro.EJECUTIVO, 5, 6, 250, 
                 TipoColor.NEGRO,100);
            
          carro2.imprimir();
          carro2.acelerar(20);
          carro2.desacelerar(50);
          carro2.frenar();
        
    }
    
}
