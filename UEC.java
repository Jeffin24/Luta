public class UEC {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        Lutador l[]=new Lutador[4];
        l[0]=new Lutador("Jeff", "Brasil", 18, 11, 5, 7, 1.73f, 70.5f);
        l[1]=new Lutador("Vakero", "India", 16, 20, 2, 5, 1.65f, 63.4f);
        l[2]=new Lutador("Junior", "Australia", 18, 15, 1, 7, 1.72f, 70.0f);
        l[3]=new Lutador("Leo", "Russia", 18, 21, 3, 4, 1.93f, 75.0f);
        l[0].apresentar();
        l[0].status();
        l[1].apresentar();
        l[1].status();
        l[2].apresentar();
        l[2].status();
        l[3].apresentar();
        l[3].status();
}   
}