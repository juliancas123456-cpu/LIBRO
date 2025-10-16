public class librofisico extends Libro {
    private static int serie = 1;
    private double peso;

    public librofisico(String t, String a, double p, int s, double peso) {
        super(t, a, p, s, "LF" + serie++);
        this.peso = peso;
    }

    public double mostrarLibro() {
        System.out.println("Libro Físico");
        super.mostrarLibro();
        System.out.println("Peso: " + peso + " kg");
        return 0;
    }

    public void prestar(int n) {
        if (n > 0 && n <= stock) {
            stock -= n;
            System.out.println("Prestados " + n);
        } else System.out.println("No disponible");
    }

    public void devolver(int n) {
        if (n > 0 && n <= 2) {
            stock += n;
            System.out.println("Devueltos " + n);
        } else System.out.println("Límite de devolución");}
}