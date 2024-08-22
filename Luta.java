import java.util.Random;

public class Luta{
        private Lutador desafiante, desafiado;
        private int rounds;
        private boolean aprovada;

        Random aleatorio= new Random();
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
            this.aprovada=true;
            this.desafiado=l1;
            this.desafiante=l2;
        }else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }

    }
    
    public void lutar(){
        if (this.aprovada) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            int vencedor=aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("=================");
                    System.out.println("R E S U L TA D O");
                        System.out.println("Empate!!");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                    break;
                case 1:
                System.out.println("=================");
                    System.out.println("R E S U L TA D O");
                        System.out.println(this.desafiado.getNome()+" Ganhou a luta");
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                case 2:
                System.out.println("=================");
                    System.out.println("R E S U L TA D O");
                        System.out.println(this.desafiante.getNome()+" Ganhou a luta");
                        this.desafiante.ganharLuta();
                        this.desafiado.perderLuta();
                        break;
                default:
                    break;
            }

        }else{
            System.out.println("A luta não pode acontecer");
        }
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador de) {
        this.desafiante = de;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}