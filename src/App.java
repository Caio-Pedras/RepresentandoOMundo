public class App {
    public static void main(String[] args) throws Exception {
        Theme theme = new Theme();
        theme.setThemeTitle("Cálculo");

        theme.topic.setTitle("Derivada");
        theme.topic.setResume("A derivada é a taxa de variação de uma função!");

        System.out.println(theme.getThemeTitle());
        System.out.println(theme.topic.getTitle());
        System.out.println(theme.topic.getresume());
    }
}
