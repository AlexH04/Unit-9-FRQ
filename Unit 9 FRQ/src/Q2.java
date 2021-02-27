public class Q2 {
    public static class Animal {
        private String ch, species, name;

        public Animal(String CH, String SPECIES, String NAME) {
            ch = CH;
            species = SPECIES;
            name = NAME;
        }

        public String toString() {
            return name + " the " + species + " is a " + ch;
        }
    }

    public static class Herbivore extends Animal {
        public Herbivore(String SPECIES, String NAME) {
            super("herbivore", SPECIES, NAME);
        }
    }

    public class Elephant extends Herbivore {
        private double tusk;

        public Elephant(String NAME, double len) {
            super("elephant", NAME);
            tusk = len;
        }
    }
}
