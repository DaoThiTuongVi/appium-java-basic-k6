package lesson_06;

public class Lab04 {
    public static void main(String[] args) {
        String url = "https://google.com";

        String[] urlArray = url.split("://");

        String protocol = urlArray[0];
        String domainName = urlArray[1];

        String[] domainNameArray = domainName.split("\\.");
        String name = domainNameArray[0];
        String extension = domainNameArray[1];

        System.out.println("Protocol: " + protocol);
        System.out.println("Name: " + name);
        System.out.println("Extension: " + extension);
    }
}
