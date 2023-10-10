package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String hundred = "" + (number/100);
        String ten = "" + (number%100/10);
        String one = "" + (number%100%10);
        System.out.println(one+ ten + hundred);
    }
}
