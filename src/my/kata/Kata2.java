package my.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata2 {
	
	private String formatSheet (String sheet) {		//change ',' on ' '
		String formatedSheet = sheet.replace(",", " ");
		return formatedSheet;
	}

	public List<Integer> getScore (String resultSheet) {		// return list with teams score
		List<Integer> listOfScore = new ArrayList<Integer>();
		String tempArray[] = formatSheet(resultSheet).split(" ");
		for (int i = 0; i < tempArray.length; i++) {
			try {
				listOfScore.add(Integer.parseInt(tempArray[i]));
			} catch (Exception e) {

			}
		}
		return listOfScore;
	}
	
	private List <String> formatScore (List <Integer> scoreList) {  //return score in String type + " "
		List <String> listOfScoreStr = new ArrayList<String>();
		for (int i = 0; i < scoreList.size(); i++) {
			listOfScoreStr.add(String.valueOf(scoreList.get(i) + " "));
		}
		return listOfScoreStr;
	}
	
	public List <String> getTeamName (String sheet) {		//get list of team name
		List <String> teamList = new ArrayList <String>();
		List <String> tempList = new ArrayList <String>();
		tempList = formatScore(getScore(sheet));
		String teamArray[] = {formatSheet(sheet)};
		for (int i = 0; i < tempList.size(); i++) {
			String tempArray[] = Arrays.toString(teamArray).substring(1, Arrays.toString(teamArray).length()-1).split(tempList.get(i)); 		//get array without score and cut brackets from every new array 
			teamArray = tempArray;
		}
		String [] taemArrayFormated = Arrays.toString(teamArray).substring(1, Arrays.toString(teamArray).length()-5).split(" , ");		//split one element array on array with elements and cut off tail  
		for (int i = 0; i < taemArrayFormated.length; i++) {
			System.out.println(taemArrayFormated[i]);
		}
		return teamList;
	}
	
	
}
