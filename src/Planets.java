public enum Planets {
    MARS("The only planet where maybe we can live in the future instead of Earth"),
    PLUTO("Pluto is a complex and mysterious world with mountains, valleys, plains, craters, and maybe glaciers."),
    SATURN("Saturn is the sixth planet from the Sun and the second-largest planet in our solar system"),
    EARTH("The only planet where we can breathe"),
    VENUS("Venus is the second planet from the Sun, and is Earth's closest neighbor in the solar system"),
    JUPITER("Jupiter is the fifth planet from our Sun and is, by far, the largest planet in the solar system – more than twice as massive as all the other planets combined"),
    NEPTUNE("Neptune, like Uranus, is an ice giant"),
    URANUS("Uranus is one of two ice giants in the outer solar system"),
    MERCURY("Mercury is a rocky planet, also known as a terrestrial planet");


private String description;
    Planets(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
