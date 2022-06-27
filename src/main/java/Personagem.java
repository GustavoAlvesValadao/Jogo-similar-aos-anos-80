/*REGRAS
- variaveis energia fome e sono recebem valores de 1 a 10
começa com 10 energia
começa com 0 sono 
0 fome
quando ele caça, gasta 2 pontos de energia e só pode caçar caso tenha pelo menos 2 pontos de energia
em qualquer caso, seus niveis de fome e sono sobem 1 ponto
quando o personagem come, ele reduz 1 ponto do seu nivel de fome
Alem disso, seu nivel de energia aumenta um ponto.
Ele só come se o seu nivel de fome for maior ou igual a 1.

quando o personagem dorme, ele reduz 1 ponto do seu nivel de sono. Alem disso, seu nivel de energia aumenta 1 ponto
ele só dorme quando tiver 1
 */
public class Personagem {
    
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    public Personagem(int energia, int fome, int sono, String nome) {
        if (energia >= 0 && energia <= 10) {
            this.energia = energia;
        }
        if (fome >= 0 && fome <= 10) {
            this.fome = fome;
        }
        if (sono >= 0 && sono <= 0) {
            this.sono = sono;
        }
        this.nome = nome;
    }
    
    public void informa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível de Energia: " + this.energia);
        System.out.println("Nível de Fome: " + this.fome);
        System.out.println("Nível de sono: " + this.sono);
    }

    void cacar() {
        if (getEnergia() >= 2) {
            System.out.println(getNome() + " está caçando");
            setEnergia(getEnergia() - 2);
            setFome(getFome() + 1);
            setSono(getSono() + 1);

        } else {
            System.out.println(getNome() + " está sem energia para caçar");
        }

    }

    void comer() {
        //energia = Math.min(1,10); 
        if (getFome() >= 1) {
            System.out.println(getNome() + " está comendo");
            setEnergia(getEnergia() + 1);
            setFome(getFome() - 1);
        } else {
            System.out.println(getNome() + " está sem fome");
        }
    }

    void dormir() {
        if (getSono() >= 1) {
            System.out.println(getNome() + " está dormindo");
            setSono(getSono() - 1);
            setEnergia(getEnergia() + 1);
        } else {
            System.out.println(getNome() + " está sem sono");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSono() {
        return sono;
    }

    public void setSono(int sono) {
        this.sono = sono;
    }
}
