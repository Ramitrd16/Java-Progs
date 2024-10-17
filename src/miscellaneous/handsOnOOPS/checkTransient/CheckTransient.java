package miscellaneous.handsOnOOPS.checkTransient;

public class CheckTransient {
    public static void main(String[] args) {

        TransientDto transientDto = new TransientDto("Rudra","Pass");
        System.out.println(transientDto);
    }
}

class TransientDto{
    String name;
    transient String pass;
    public TransientDto(){}
    public TransientDto(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "TransientDto{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
