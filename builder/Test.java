package partten.builder;

public class Test {

    public static void main(String[] args){
        Director director = new Director();
        director.builderPeople(new BuilderFatPeople());
    }
}
