public class Desafio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    	String T = leitor.nextLine();
        //TODO: Complete operador condicional (ternário) abaixo.
    	System.out.println(T.length() > 140 ? "MUTE" : "TWEET");
    }
    }
}
