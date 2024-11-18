public class MadLibs {

    // constructor
    public MadLibs() {
        System.out.println("BREAKING NEWS:");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    // word arrays
    String[] pluralNouns = {"humans", "other animals"};
    String[] adjectives = {"hungry", "lazy", "fierce", "tired", "grumpy", "playful", "weird", "generous", "fine", "safe"};
    String[] timesOfDay = {"morning", "afternoon", "evening", "night", "day"};
    String[] cityNames = {"Crocodileville", "Humanville", "Lizard Town", "Reptilian City", "Scalyville"};
    String[] cityDescriptions = {
            "a city where crocs and humans live side by side",
            "a foggy city where humans and crocs try to coexist",
            "a city where humans and crocs mix but don't trust each other",
            "a coastal town with crocs hiding in the shadows",
            "a rundown city where both humans and crocs struggle",
            "a city overrun by crocs, where humans live in fear",
            "a city by the marsh, where crocs are always hungry",
            "a tropical city ruled by crocs, with humans as guests",
            "a quiet town now threatened by crocs",
            "a high-tech city where crocs’ instincts still dominate"
    };
    String[] rulingFigures = {"Mr.Hales", "the Mayor", "the principal", "the King", "Dad"};

    // city data
    String cityDescription;
    int crocodilePopulation;
    int humanPopulation;

    // meal data
    String mealChoice = "humans";  // Crocs will always feast on humans
    int meatInCity = 1500;

    // decision data
    boolean isHungry = true;
    boolean cityHasAdequateSecurity = (Math.random() < 0.5);

    // time data
    String timeOfDay = getRandomTimeOfDay();
    int hoursSinceLastMeal = (int)(Math.random() * 4) + 3;  // Now always between 3 and 6 hours

    // random factor
    int randomFactor = (int)(Math.random() * 10);

    // random words
    String pluralNoun = getRandomPluralNoun();
    String cityName = getRandomCityName();
    String randomRulingFigure = getRandomRulingFigure();

    // get random plural noun
    public String getRandomPluralNoun() {
        return pluralNouns[(int)(Math.random() * pluralNouns.length)];
    }

    // get random adjective
    public String getRandomAdjective() {
        return adjectives[(int)(Math.random() * adjectives.length)];
    }

    // get random time of day
    public String getRandomTimeOfDay() {
        return timesOfDay[(int)(Math.random() * timesOfDay.length)];
    }

    // get random city name
    public String getRandomCityName() {
        return cityNames[(int)(Math.random() * cityNames.length)];
    }

    // get random ruling figure
    public String getRandomRulingFigure() {
        return rulingFigures[(int)(Math.random() * rulingFigures.length)];
    }

    // generate random population
    public int generateRandomPopulation(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    // generate random meal portions (make the number of meals higher!)
    public int generateRandomMealPortions() {
        return (int)(Math.random() * 50000) + 1000;  //  range for meal portions
    }

    // generate the story
    public void generateStory() {
        // random city data
        cityDescription = cityDescriptions[(int)(Math.random() * cityDescriptions.length)];
        crocodilePopulation = generateRandomPopulation(5000, 15000);
        humanPopulation = generateRandomPopulation(1000, 5000);

        // random meal portions
        int mealPortionsNeeded = generateRandomMealPortions();

        // format story
        String story = "THE CROCS ARE COMING!\n\n" +
                "location: " + cityName + "\n" +
                "time: " + timeOfDay + "\n\n" +
                "in a shocking announcement, the citizens of " + cityName + ", " + cityDescription + ", are dealing with a terrifying situation.\n" +
                "reports confirm that the " + crocodilePopulation + " crocs in the city are hungry, having not eaten in the last " + hoursSinceLastMeal + " hours.\n\n" +
                "local authorities are now on high alert as the crocs have expressed interest in feasting on the humans tonight.\n\n" +
                "the police of " + cityName + " strongly suspect that the crocs need " + mealPortionsNeeded + " (non-human) meals to satisfy their hunger and avoid chaos.\n" +
                "officials estimate that there is a " + (randomFactor * 10) + "% chance the crocs will succeed in wiping out the humans of " + cityName + ". \n\n";

        // security update
        if (cityHasAdequateSecurity) {
            story += "security update: the city is reported to have strong security in place, with checkpoints and barriers protecting the humans.\n" +
                    "However, the crocs have made it clear that they are determined and may find a way through these defenses to reach their meal.\n\n";
        } else {
            story += "security update: the city's security system is weak, and humans are now more vulnerable than ever to the hungry crocs.\n" +
                    "sources say that with no strong defenses, the crocs have even more motive to eat all the humans they desire \n\n" ;
        }

        // croc meal decision (they will feast on humans)
        story += "UPDATE: " + randomRulingFigure + " has been eaten RIP.2024.\n\n" +

                "citizens are urged to stay " + getRandomAdjective() + " and prepare for the worst.\n";

        // print the story
        System.out.println(story);
    }


}
