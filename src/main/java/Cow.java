public class Cow extends Animal {

    public Cow(String say, int teeth) {
        setTeath(teeth);
        setSay(say);
    }

    public String getSay () {
        String say = super.getSay();
        return say + "New ! ";
    }

     void my () {
        System.out.println(getSay() + "Во все" + getTeath() + " Зуба");
    }
}
