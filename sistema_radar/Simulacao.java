package sistema_radar;

public class Simulacao {
   public static void main(String[] args) {
        Carro Impala = new Carro();
        Impala.ano = 67;
        Impala.modelo = "Sedan";
        Impala.placa = "FLU1902";
        Impala.velocidade = 0;

        Radar radar = new Radar();
        radar.Localizacao = "MNorte";
        radar.LimiteVelocidade = 30;
        radar.AvaliarVelocidade(Impala);

        Impala.acelerar();
        Impala.acelerar();
        Impala.acelerar();
        Impala.acelerar();

        radar.AvaliarVelocidade(Impala);

    
   } 
}
