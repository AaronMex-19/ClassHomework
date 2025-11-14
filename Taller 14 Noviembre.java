import java.util.Random;

public class ExploradorTesoro {

    public static abstract class Entidad {
        protected int x;
        protected int y;

        public Entidad(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() { return x; }
        public int getY() { return y; }

        public void setPosicion(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

   
    public static class Explorador extends Entidad {

        public Explorador(int x, int y) {
            super(x, y);
        }

       
        public void moverHacia(Tesoro tesoro, int tamaño) {

            if (x < tesoro.getX()) x++;
            else if (x > tesoro.getX()) x--;

            if (y < tesoro.getY()) y++;
            else if (y > tesoro.getY()) y--;

         
            if (x < 0) x = 0;
            if (y < 0) y = 0;
            if (x >= tamaño) x = tamaño - 1;
            if (y >= tamaño) y = tamaño - 1;
        }
    }

   
    public static class Tesoro extends Entidad {
        public Tesoro(int x, int y) {
            super(x, y);
        }
    }


    public static class Mapa {
        private int tamaño;

        public Mapa(int tamaño) {
            this.tamaño = tamaño;
        }

        public void mostrarMapa(Explorador e, Tesoro t) {
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {

                    if (i == e.getX() && j == e.getY()) {
                        System.out.print(" E ");
                    } else if (i == t.getX() && j == t.getY()) {
                        System.out.print(" T ");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int tamaño = 10;
        Mapa mapa = new Mapa(tamaño);

        Random rand = new Random();

        Explorador explorador = new Explorador(rand.nextInt(tamaño), rand.nextInt(tamaño));
        Tesoro tesoro = new Tesoro(rand.nextInt(tamaño), rand.nextInt(tamaño));

        int pasos = 0;

        System.out.println("Mapa inicial:");
        mapa.mostrarMapa(explorador, tesoro);

        while (explorador.getX() != tesoro.getX() ||
               explorador.getY() != tesoro.getY()) {

            explorador.moverHacia(tesoro, tamaño);
            pasos++;

            System.out.println("Paso " + pasos + ":");
            mapa.mostrarMapa(explorador, tesoro);
        }

        System.out.println("¡Tesoro encontrado!");
        System.out.println("Total de pasos: " + pasos);
    }
}