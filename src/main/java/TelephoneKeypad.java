import java.util.*;

public class TelephoneKeypad {
    
    static Character[][] numToChars;
    public static void numbersToCharacters()
{
  numToChars = new Character[10][3];
  numToChars[0] = new Character[]{'0'};
  numToChars[1] = new Character[]{'1'};
  numToChars[2] = new Character[]{'A','B','C'};
  numToChars[3] = new Character[]{'D','E','F'};
  numToChars[4] = new Character[]{'G','H','I'};
  numToChars[5] = new Character[]{'J','K','L'};
  numToChars[6] = new Character[]{'M','N','O'};
  numToChars[7] = new Character[]{'P','R','S'};
  numToChars[8] = new Character[]{'T','U','V'};
  numToChars[9] = new Character[]{'W','X','Y'};
}
    
public static List <String> phoneNum (int[] numbers, int length, int indexNum, String letter)
{
   if(length == indexNum)
   {
      return new ArrayList<>(Collections.singleton(letter));
   }
      List<String> stringList = new ArrayList<>();
   for(int i = 0; i < numToChars[numbers[indexNum]].length; i++)
   {
    String copy = String.copyValueOf(letter.toCharArray());
    copy = copy.concat(numToChars[numbers[indexNum]][i].toString());
    stringList.addAll(phoneNum(numbers, length, indexNum + 1,copy));
   }
      return stringList;
}
    
public static void phoneNum(int[] numbers)
{
  numbersToCharacters();
  List<String> stringList = phoneNum(numbers, numbers.length, 0, "");
  stringList.stream().forEach(System.out :: println);
}

public static void main(String[] args) 
{
  int number[] = {5,4,8};
  phoneNum(number);
}
    
   
        }
        
    

