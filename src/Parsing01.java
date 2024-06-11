public class Parsing01 {
    public static void main(String[] args) {
       String shirtPrice = "15";
       String taxRate = "0.05";
       String gibberish = "887ds7nds87dsfs";
       
       int price = Integer.parseInt(shirtPrice);
       double rate = Double.parseDouble(taxRate);
       System.out.println("O valor do imposto é: "+(price*rate));
       
       //int rate = Integer.parseInt(taxRate); foi tranformado como cometário pq o código está errado
       int gib = Integer.parseInt(gibberish);// o exercício não pede para arrumar o erro
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        
        
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
        
    }
    
}
