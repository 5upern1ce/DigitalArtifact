public class CharFrequency {
    public static void main(String[] args){
        System.out.println("The letter appears " + frequency('l', "Hello World")+" time(s)!");
    }

    public static int frequency(char ch, String string){
        int freq = 0;
        
        for(char c: string.toCharArray()){
            if(c == ch){
                freq++;
            }
        }
        return freq;
    }
}
