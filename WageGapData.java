import java.io.*;
import java.util.*;


public class WageGapData{

  public static void main (String[] args) throws FileNotFoundException{
    System.out.println(organizeData("GenderPayGapData2122.csv"));
  }

  //which gender has the greater bonus?
  // method to go through data and make array list of it
  public static ArrayList<ArrayList<String>> organizeData (String pathname) throws FileNotFoundException{
    File f = new File(pathname);
    Scanner sc = new Scanner(f);
    //final ArrayList
    ArrayList<ArrayList<String>> allDataList = new ArrayList<ArrayList<String>>();
    //ArrayList for each line
    ArrayList<String> currLine;
    String[] temp = new String[23];
    while(sc.hasNextLine()){
      String company = sc.next();
      //then use split on that line
      temp = company.split(",");
      //then add line to arraylist
      currLine = new ArrayList<>(Arrays.asList(temp));
      allDataList.add(currLine);
    }
    return allDataList;
  }

  //public static String topMedian (){

  //}
  //method to look through bonus by gender and see which gender has greater bonus
  //public static String genderBonus (){
    //avg bonus percent for men
    //avg bonus percent for women

  }

}
