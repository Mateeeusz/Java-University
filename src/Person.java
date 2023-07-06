public abstract class Person implements IPerson{
    private String name;
    private String surrname;

    Person(){}

    public Person(String name, String surrname) {
        this.name = name;
        this.surrname = surrname;
    }

    public String getSurrname() {
        return surrname;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}