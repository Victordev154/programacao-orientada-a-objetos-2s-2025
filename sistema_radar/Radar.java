package sistema_radar;

public class Radar {
    public String Localizacao;
    public Integer LimiteVelocidade;

    public void emitirNotificacao(String Placa, Integer VelocidadeObservada) {
        System.out.println("placa: "+ Placa);
        System.out.println("velocidade observada: "+ VelocidadeObservada);
        System.out.println("Velocidade da via: "+ this.LimiteVelocidade);
    }
    
    public void AvaliarVelocidade(Carro carro) {
         if(carro.velocidade > LimiteVelocidade) {
            emitirNotificacao(carro.placa, carro.velocidade);
         }
    }
       
}
