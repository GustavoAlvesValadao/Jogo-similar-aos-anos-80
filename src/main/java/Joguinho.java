
public class Joguinho {

    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem(10,0,10, "Roberto");
        Personagem soneca = new Personagem(2,6,4, "Felipe");
        
        soneca.informa();
        soneca.setEnergia(2);
        soneca.setFome(0);
        soneca.setSono(9);
        soneca.cacar();
        soneca.comer();
        soneca.dormir();
        
        Thread.sleep(2000);
        
    }
}
