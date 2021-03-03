package lesson5;

public class Artifact {
    private int id;
    private String artifactName;
    private int age;

    public Artifact(int new_id) {
        this.id = new_id;
    }

    public Artifact(int new_id, String newArtifactName) {
        this.id = new_id;
        this.artifactName = newArtifactName;
    }

    public Artifact(int new_id, String newArtifactName, int newAge) {
        this.id = new_id;
        this.artifactName = newArtifactName;
        if (newAge<=20) {
            this.age = newAge;
        }

    }

    public void printInfo() {
        System.out.println("-----------------------------------------------------");
        System.out.print("Index " + id + "\nName " + artifactName + "\nAge " + age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtifactName() {
        return artifactName;
    }

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 20) {
            this.age = age;
        }
    }
}
