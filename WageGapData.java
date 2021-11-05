import java.io.*;
import java.util.*;


public class WageGapData{

  public static void main (String[] args) throws FileNotFoundException{
    //System.out.println(organizeData("Test.csv"));
    genderBonus("GenderPayGapData2122Mod.csv");

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
    //made array variable
    String[] temp = new String[4];
    sc.nextLine();
    while(sc.hasNextLine()){
      String company = sc.nextLine();

      //then use split on that line
      temp = company.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
      //then add line to arraylist
      currLine = new ArrayList<>(Arrays.asList(temp));
      allDataList.add(currLine);

    }
    return allDataList;
  }


  //method to look through bonus by gender and see which gender has greater bonus
  public static void genderBonus (String pathname) throws FileNotFoundException{
    ArrayList<ArrayList<String>> dataList = organizeData(pathname);
    //avg bonus percent for men
    //loop to add bonus percents
    double maleBonus =0.0;
    double femaleBonus =0.0;
    int count =0;

    for(int i=0; i<dataList.size(); i++){
      maleBonus += Double.parseDouble(dataList.get(i).get(0));
      count++;
    }

    for(int i=0; i<dataList.size(); i++){
      femaleBonus += Double.parseDouble(dataList.get(i).get(1));
    }

    maleBonus = maleBonus/count;
    femaleBonus =femaleBonus/count;
    if(femaleBonus >  maleBonus ){
      System.out.println("In the year of 2021-2022 female average bonus (" + femaleBonus + "%) is greater than male average bonus");
    }
    else if(maleBonus > femaleBonus ){
      System.out.println("In the year of 2021-2022 male average bonus (" + maleBonus + "%) is greater than female average bonus");
    }
    else{
      System.out.println("In the year of 2021-2022 female bonus and male bonus percentages are equal");
    }
  }

  //public static String topMedian (){
    
  //}

}
