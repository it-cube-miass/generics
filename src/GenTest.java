public class GenTest {
    public static void main(String[] args) {
        Gen<Integer> genI = new Gen<>(77);
        genI.showType();

        System.out.println();

        Gen<String> genS = new Gen<>("some string");
        genS.showType();
    }
}
