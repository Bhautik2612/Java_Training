package planets;

public class PlanetsMain {

	public static void main(String[] args) {
		
		Planets earth = new Planets("Earth", 149.6, 1.0);
        Planets mars = new Planets("Mars", 227.9, 0.38);

        System.out.println(earth);
        System.out.println(mars);

	}

}
