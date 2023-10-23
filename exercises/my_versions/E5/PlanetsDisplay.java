public class PlanetsDisplay {
    public static void main(String[] args) {
        System.out.println("Orbital periods in our solar system (in years)");
        System.out.println();

        for (Planets planet : Planets.values()) {
            System.out.println(planet + ": " + planet.getOrbitalPeriod());
        }
    }
}
