public class Lutador{
    /**
     *
     */
    private String nome, nacionalidade, categoria;
    private int idade,vitorias,derrotas,empates;
    private float altura,peso;
    public void apresentar(){
        System.out.println("----------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador "+ this.getNome());
        System.out.println("Diretamente da(o) "+ this.getNacionalidade());
        System.out.println("Com "+ this.getIdade()+" anos e "+this.getAltura()+"de altura");
        System.out.println("Pesando "+this.getPeso()+"KG");
        System.out.println("Com um curriculo de "+this.getVitorias()+" vitorias"+", "+this.getEmpates()+" empates"+" e "+this.getDerrotas()+" derrotas");
        
    }
    public void status(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Vitorias: "+this.getVitorias());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("----------------------");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
            this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
            this.setEmpates(this.getEmpates()+1);
    }
    public Lutador(String no, String na, int id, int vi, int de,
            int em, float al, float pe) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.altura = al;
        this.setPeso(pe);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (peso<52.2) {
            categoria="Invalido";
        }
        else if(peso<=70.3){
            categoria="Leve";
        }
        else if(peso<=83.9){
            categoria="Médio";
        }
        else if(peso<=120.2){
            categoria="Pesado";
        }
        else{
            categoria="Inválido";
        }
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    public float getPeso() {
        return peso;
        
    }
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    
}
