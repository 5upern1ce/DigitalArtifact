public class Arrays {

    static void helloPlanets(){
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        for(String planet: planets){
            System.out.println("Hello "+planet);
        }
    }


    static void timesTableArray(int requiredSize, int number){
        for(int i = 1; i<=requiredSize; i++){
            System.out.println(number*i);
        }
    }
    public static void main(String[] args){
        helloPlanets();
        System.out.println();
        timesTableArray(15, 5);
    }
}