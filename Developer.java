public class Developer {
    // attributes
    private String name;
    private int age;
    private String language;
    private int experience; // In years
    private boolean isFreelancer;

    // Constructor
    public Developer(String name, int age, String language, int experience, boolean isFreelancer) {
        setName(name);
        setAge(age);
        setLanguage(language);
        setExperience(experience);
        this.isFreelancer = isFreelancer;
    }

    // --- Setters with Integrity Checks ---

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 120) { // Practical range check
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 18 and 120.");
        }
    }

    public void setLanguage(String language) {
        if (language != null && !language.trim().isEmpty()) {
            this.language = language;
        } else {
            throw new IllegalArgumentException("Programming language must be specified.");
        }
    }

    public void setExperience(int experience) {
        if (experience >= 0) {
            this.experience = experience;
        } else {
            throw new IllegalArgumentException("Experience cannot be negative.");
        }
    }

    public void setFreelancer(boolean freelancer) {
        this.isFreelancer = freelancer;
    }

    // --- Getters ---

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getLanguage() { return language; }
    public int getExperience() { return experience; }
    public boolean isFreelancer() { return isFreelancer; }

    // --- Methods (Actions) ---

    public void code() {
        System.out.println(name + " is writing code in " + language + ".");
    }

    public void attendMeeting() {
        System.out.println(name + " is attending a sprint planning meeting.");
    }

    public void takeBreak() {
        System.out.println(name + " is taking a coffee break.");
    }

    // Main method to demonstrate the Object Diagram instance
    public static void main(String[] args) {
        try {
            // Creating the object with Phillip
            Developer dev = new Developer("Phillip", 10, "german", 3, false);
            
            // Calling methods
            dev.code();
            dev.takeBreak();
            
        } catch (IllegalArgumentException e) {
            System.err.println("Validation Error: " + e.getMessage());
        }
    }
}