package animals;


public class Dog extends Animals {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name,String headForm) {
        this.name=name;
        super.setHeadForm(headForm);

    }
    private String murluk(){
        return "gav";
    }
    @Override
    protected void sayMyHeadFormAndWhatICan() {
        super.sayMyHeadFormAndWhatICan();
        System.out.println(murluk()+" So i cat and my name"+getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return !(name != null ? !name.equals(dog.name) : dog.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
