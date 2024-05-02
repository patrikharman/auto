
package main;


public class AutosProgram {

    
    public static void main(String[] args) {
        new AutosProgram().bemutato_0();
        
        AutosProgram prg = new AutosProgram();
        prg.bemutato_1();
        prg.bemutato_2();
       
    }

    private void bemutato_0() {
        //System.out.println("1 bemutato:"); 
        Auto auto = new Auto();
        auto.megy();
        auto.setBeinditva(true);
        auto.megy();
        auto.megy();
        auto.tankol();
        auto.setBeinditva(false);
        auto.tankol();
        auto.setBeinditva(true);
        auto.megy();
        auto.megy();
    }
    private void bemutato_1() {
        //System.out.println("2 bemutato:");
        Auto auto = new Auto(true);
    }

    private void bemutato_2() {
        //System.out.println("3 bemutato:");
        Auto auto = new Auto(true,true);
    }
    
}
