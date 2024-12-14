package planets;

public class Planets {
	
	private String PlanetName;
	private double distanceFromSun,gravityRelativeToEarth;
	
	 public Planets(String name, double distanceFromSun, double gravityRelativeToEarth) {
	        this.PlanetName = name;
	        this.distanceFromSun = distanceFromSun;
	        this.gravityRelativeToEarth = gravityRelativeToEarth;
	    }
	 

	    public String getName() {
	        return PlanetName;
	    }

	    public double getDistanceFromSun() {
	        return distanceFromSun;
	    }

	    public double getGravityRelativeToEarth() {
	        return gravityRelativeToEarth;
	    }

	    @Override
	    public String toString() {
	        return "Planet{" +
	                "PlanetName='" + PlanetName + '\'' +
	                ", distanceFromSun=" + distanceFromSun +
	                ", gravityRelativeToEarth=" + gravityRelativeToEarth +
	                '}';
	    }
}			
	

	
	

