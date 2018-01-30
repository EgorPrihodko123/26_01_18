package animals;


public class Animals {
    private String headForm;
    private String breath(){
        return "I am breath, ";
    }
    public String getHeadForm() {
        return headForm;
    }
    public void setHeadForm(String headForm) {
        this.headForm = headForm;
    }
    public Animals() {

    }
    protected void sayMyHeadFormAndWhatICan(){
        System.out.print("my head form "+this.headForm+" , "+this.breath());
    }
}
