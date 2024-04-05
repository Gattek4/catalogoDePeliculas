public class Decisiciones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String plan = "Plus";

        if (fechaDeLanzamiento > 2022){
            System.out.println("Peliculas mas populares");
        } else {
            System.out.println("Peliculas retro que aun vale la pena ver Xd");
        }

        if (incluidoEnElPlan && plan.equals("Plus")){
            System.out.println("Disfrute de su pelicula");
        }   else {
            System.out.println("Pelicula no disponible para su plan actual Xd");
        }
    }
}
