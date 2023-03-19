package OODesign.Creational.Builder;

public class Client {
    public static void main(String[] args) {
        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("https://").hostName("www.google.com/").portNumber("8080/").path("search");
        URLBuilder build = builder.build();


        System.out.print(build.protocol);
        System.out.print(build.hostName);
        System.out.print(build.path);
    }
}
