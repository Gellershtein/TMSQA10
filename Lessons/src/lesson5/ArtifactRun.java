package lesson5;

public class ArtifactRun {
    public static void main(String[] args) {
        Artifact art1 = new Artifact(100500);
        Artifact art2 = new Artifact(10, "Agest Scorpion");
        Artifact art3 = new Artifact(1, "Faraon", 1000);

        art1.printInfo();
        System.out.println();
        art2.printInfo();
        System.out.println();
        art3.printInfo();
        System.out.println();


        art3.setAge(10);
        System.out.println();
        art3.printInfo();
    }
}
