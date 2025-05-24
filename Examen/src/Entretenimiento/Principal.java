package Entretenimiento;

public class Principal {
	
	 public static void main(String[] args) {

	        Serie[] series = new Serie[5];
	        Videojuego[] videojuegos = new Videojuego[5];

	        
	        series[0] = new Serie("La Casa de Papel", 4, "Acción");
	        series[1] = new Serie("Dark", 3, "Ciencia Ficción");
	        series[2] = new Serie("The Office", 9, "Comedia");
	        series[3] = new Serie("The Crown", 6, "Drama");
	        series[4] = new Serie("Friends", 10, "Comedia");


	        videojuegos[0] = new Videojuego("God of War", 15, "Acción", "Santa Monica");
	        videojuegos[1] = new Videojuego("Zelda", 50, "Aventura", "Nintendo");
	        videojuegos[2] = new Videojuego("Minecraft", 100, "Sandbox", "Mojang");
	        videojuegos[3] = new Videojuego("FIFA", 20, "Deporte", "EA Sports");
	        videojuegos[4] = new Videojuego("Call of Duty", 30, "Shooter", "Activision");

	        // Metodo de entregar
	        series[1].entregar();
	        series[3].entregar();
	        videojuegos[0].entregar();
	        videojuegos[2].entregar();
	        videojuegos[4].entregar();

	        // Contar y devolver los entregados
	        int seriesEntregadas = 0;
	        int videojuegosEntregados = 0;

	        for (Serie s : series) {
	            if (s.isEntregado()) {
	                seriesEntregadas++;
	                s.devolver();
	            }
	        }

	        for (Videojuego v : videojuegos) {
	            if (v.isEntregado()) {
	                videojuegosEntregados++;
	                v.devolver();
	            }
	        }

	        System.out.println("Series entregadas: " + seriesEntregadas);
	        System.out.println("Videojuegos entregados: " + videojuegosEntregados);

	        // el videojuego con más horas estimadas
	        Videojuego videojuegoMayor = videojuegos[0];
	        for (int i = 1; i < videojuegos.length; i++) {
	            if (videojuegos[i].compareTo(videojuegoMayor) > 0) {
	                videojuegoMayor = videojuegos[i];
	            }
	        }

	        // la serie con más temporadas
	        Serie serieMayor = series[0];
	        for (int i = 1; i < series.length; i++) {
	            if (series[i].compareTo(serieMayor) > 0) {
	                serieMayor = series[i];
	            }
	        }

	        System.out.println("\nVideojuego con más horas estimadas:");
	        System.out.println(videojuegoMayor);

	        System.out.println("\nSerie con más temporadas:");
	        System.out.println(serieMayor);
	    }
	

}
