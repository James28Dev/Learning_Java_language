package chap3;
public class PassByRef {
    static void changeGirl(Girl g){
        g.phone = "099999999";
    }
    public static void main(String[] args) {
        Girl gl = new Girl("Ney", "0826591281");
        gl.print();
        
        changeGirl(gl);
        gl.print();
    }
}//end
