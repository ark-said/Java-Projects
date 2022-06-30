package guessGameProject;

public class MainClass {

    /*
        Main methodunda
     ilk olarak randomGenerator method undan random sayilari alin...
     Sonra LetsGuess method unu olusturun.
     randomGenerator num LetsGuess method unun parametresidir

     */


    public static void main(String[] args) {



        Projects_05.GameGuess_.GuessGame obj = new Projects_05.GameGuess_.GuessGame();//4. adim

        obj.LetsGuess(obj.randomGenerator());//5.adim

    }

}