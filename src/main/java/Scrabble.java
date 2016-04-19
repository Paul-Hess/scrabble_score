import java.util.ArrayList;

public class Scrabble {

  // public static void main(String[] args) {}
  public static Integer calcScore(String inWord){

    Integer stringNum = 0;
    inWord = inWord.toLowerCase();
    for (Integer index = 0; index < inWord.length(); index++) {

      char currentChar = inWord.charAt(index);

      switch (currentChar) {
        case 'z': case 'q':
          stringNum+= 10;
          break;

        case 'j': case 'x':
          stringNum+= 8;
          break;

        case 'k':
          stringNum+= 5;
          break;

        case 'f': case 'h':
        case 'v': case 'w':
        case 'y':
          stringNum+= 4;
          break;

        case 'b': case 'c': case 'm':
        case 'p':
          stringNum+= 3;
          break;

        case 'd': case 'g':
          stringNum+= 2;
          break;

        case 'a': case 'e':
        case 'i': case 'o':
        case 'u': case 'l':
        case 'n': case 'r':
        case 's': case 't':
          stringNum+= 1;
          break;

        default:
          break;
      }

    }
    System.out.println(stringNum);
    System.err.println(stringNum);
    return stringNum;
  }
}
