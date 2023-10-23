    public enum Planets {
        MERCURY (0.2408),
        VENUS (0.6152),
        EARTH (1.0),
        MARS (1.8809),
        JUPITER (11.862),
        SATURN (29.458),
        URANUS (84.01),
        NEPTUNE (164.79);

        private Planets(double orbitalPeriod) {
            this.orbitalPeriod = orbitalPeriod;
        }

        private final double orbitalPeriod;

        public double getOrbitalPeriod() {
            return orbitalPeriod;
        }
    }