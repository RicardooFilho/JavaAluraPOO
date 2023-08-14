public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int releaseYear = 2022;
        boolean includesPlan = true;
        double movieRating = 8.1;
        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento: 
                """ + releaseYear;

        double media = (9.8 + 6.3 + 8.0) / 3;

        int classificacao = (int) (media / 2);

        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println(media);
        System.out.println(sinopse);
        System.out.println(classificacao);




    }
}