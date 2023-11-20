public class p {
    public static void main(String[] args){
        String text = "kotok";
        char [] symbols = text.toCharArray();
        for (int i = 0; i < symbols.length / 2; i++) {
            if(symbols[i] != symbols[symbols.length - 1 - i]){
                System.out.println(text + " не является полиндромом");
                return;
            }
        }
        System.out.println(text + " является полиндромом");
    }
}
