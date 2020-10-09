class Developer extends Employee {

    public Developer (String name) {
        super(name, "Software Development");
    }
    public String work() {
        return "writing code";
    }
}