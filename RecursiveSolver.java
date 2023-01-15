/* Baharnur Türkoğlu / 21050111079
 * Fatma Betül Özdemir / 21050111006
 * İlknur Nazlı Koşar / 21050111018
 * Efe Şahin / 21050111023
 */

import java.awt.Color;
import java.util.*;

public class RecursiveSolver {
	public static void main(String[] args) {
		
		List<Operator> colorValues1 = new ArrayList<>();
		colorValues1.add(new ColorOperator(new Color(10,3,200)));
		colorValues1.add(new ColorOperator(new Color(100,90,20)));
		colorValues1.add(new ColorOperator(new Color(230,200,100)));
		Operator colorTargetValue1 = new ColorOperator(Color.WHITE);
		Operator colorClosestValue1 = findClosestValue(colorValues1, colorTargetValue1);
		System.out.println("Closest color: " + colorClosestValue1);
		System.out.println();
		
		List<Operator> colorValues2 = new ArrayList<>();
		colorValues2.add(new ColorOperator(Color.MAGENTA));
		colorValues2.add(new ColorOperator(Color.BLACK));
		colorValues2.add(new ColorOperator(Color.CYAN));
		Operator colorTargetValue2 = new ColorOperator(Color.WHITE);
		Operator colorClosestValue2 = findClosestValue(colorValues2, colorTargetValue2);
		System.out.println("Closest color: " + colorClosestValue2);
		System.out.println();
		
		List<Operator> colorValues3 = new ArrayList<>();
		colorValues3.add(new ColorOperator(Color.MAGENTA));
		colorValues3.add(new ColorOperator(Color.BLACK));
		colorValues3.add(new ColorOperator(Color.CYAN));
		Operator colorTargetValue3 = new ColorOperator(Color.BLUE);
		Operator colorClosestValue3 = findClosestValue(colorValues3, colorTargetValue3);
		System.out.println("Closest color: " + colorClosestValue3);
		System.out.println();
		
		
		List<Operator> colorValues4 = new ArrayList<>();
		colorValues4.add(new ColorOperator(new Color(5,5,5)));
		colorValues4.add(new ColorOperator(new Color(2,2,2)));
		colorValues4.add(new ColorOperator(new Color(230,200,100)));
		Operator colorTargetValue4 = new ColorOperator(Color.BLUE);
		Operator colorClosestValue4 = findClosestValue(colorValues4, colorTargetValue4);
		System.out.println("Closest color: " + colorClosestValue4);
		System.out.println();
		
		List<Operator> colorValues5 = new ArrayList<>();
		colorValues5.add(new ColorOperator(Color.BLUE));
		colorValues5.add(new ColorOperator(Color.BLUE));
		colorValues5.add(new ColorOperator(Color.BLUE));
		Operator colorTargetValue5 = new ColorOperator(Color.BLUE);
		Operator colorClosestValue5 = findClosestValue(colorValues5, colorTargetValue5);
		System.out.println("Closest color: " + colorClosestValue5);
		System.out.println();
		
		List<Operator> values = new ArrayList<>();
		values.add(new StringOperator("N"));
		values.add(new StringOperator("A"));
		values.add(new StringOperator("A"));
		Operator targetValue = new StringOperator("NAR");
		Operator closestValue = findClosestValue(values, targetValue);
		System.out.println("Closest value: " + closestValue);
		System.out.println();

		List<Operator> stringValues = new ArrayList<>();
		stringValues.add(new StringOperator("N"));
		stringValues.add(new StringOperator("A"));
		stringValues.add(new StringOperator("R"));
		stringValues.add(new StringOperator("A"));
		Operator targetStringValue = new StringOperator("NAR");
		Operator closestStringValue = findClosestValue(stringValues, targetStringValue);
		System.out.println("Closest value: " + closestStringValue);
		System.out.println();

		List<Operator> stringValues2 = new ArrayList<>();
		stringValues2.add(new StringOperator("CE"));
		stringValues2.add(new StringOperator("A"));
		stringValues2.add(new StringOperator("N"));
		stringValues2.add(new StringOperator("A"));
		Operator targetStringValue2 = new StringOperator("CEM");
		Operator closestStringValue2 = findClosestValue(stringValues2, targetStringValue2);
		System.out.println("Closest value: " + closestStringValue2);
		System.out.println();

		List<Operator> stringValues3 = new ArrayList<>();
		stringValues3.add(new StringOperator("BH"));
		stringValues3.add(new StringOperator("A"));
		stringValues3.add(new StringOperator("R"));
		stringValues3.add(new StringOperator("A"));
		Operator targetStringValue3 = new StringOperator("BAHAR");
		Operator closestStringValue3 = findClosestValue(stringValues3, targetStringValue3);
		System.out.println("Closest value: " + closestStringValue3);
		System.out.println();

		List<Operator> stringValues4 = new ArrayList<>();
		stringValues4.add(new StringOperator("B"));
		stringValues4.add(new StringOperator("H"));
		stringValues4.add(new StringOperator("R"));
		stringValues4.add(new StringOperator("A"));
		Operator targetStringValue4 = new StringOperator("BAHAR");
		Operator closestStringValue4 = findClosestValue(stringValues4, targetStringValue4);
		System.out.println("Closest value: " + closestStringValue4);
		System.out.println();

		List<Operator> stringValues5 = new ArrayList<>();
		stringValues5.add(new StringOperator("C"));
		stringValues5.add(new StringOperator("A"));
		stringValues5.add(new StringOperator("N"));
		Operator targetStringValue5 = new StringOperator("CANAN");
		Operator closestStringValue5 = findClosestValue(stringValues5, targetStringValue5);
		System.out.println("Closest value: " + closestStringValue5);
		System.out.println();

		List<Operator> stringValues6 = new ArrayList<>();
		stringValues6.add(new StringOperator("B"));
		stringValues6.add(new StringOperator("H"));
		stringValues6.add(new StringOperator("A"));
		stringValues6.add(new StringOperator("R"));
		stringValues6.add(new StringOperator("I"));
		Operator targetStringValue6 = new StringOperator("BAHAR");
		Operator closestStringValue6 = findClosestValue(stringValues6, targetStringValue6);
		System.out.println("Closest value: " + closestStringValue6);
		System.out.println();

		List<Operator> stringValues7 = new ArrayList<>();
		stringValues7.add(new StringOperator("B"));
		stringValues7.add(new StringOperator("T"));
		stringValues7.add(new StringOperator("L"));
		Operator targetStringValue7 = new StringOperator("BETÜL");
		Operator closestStringValue7 = findClosestValue(stringValues7, targetStringValue7);
		System.out.println("Closest value: " + closestStringValue7);
		System.out.println();

		List<Operator> stringValues8 = new ArrayList<>();
		stringValues8.add(new StringOperator("I"));
		stringValues8.add(new StringOperator("N"));
		stringValues8.add(new StringOperator("R"));
		stringValues8.add(new StringOperator("A"));
		Operator targetStringValue8 = new StringOperator("ILKNUR");
		Operator closestStringValue8 = findClosestValue(stringValues8, targetStringValue8);
		System.out.println("Closest value: " + closestStringValue8);
		System.out.println();

		List<Operator> stringValues9 = new ArrayList<>();
		stringValues9.add(new StringOperator("A"));
		stringValues9.add(new StringOperator("RD"));
		Operator targetStringValue9 = new StringOperator("ARDA");
		Operator closestStringValue9 = findClosestValue(stringValues9, targetStringValue9);
		System.out.println("Closest value: " + closestStringValue9);
		System.out.println();

		List<Operator> stringValues10 = new ArrayList<>();
		stringValues10.add(new StringOperator("A"));
		stringValues10.add(new StringOperator("R"));
		stringValues10.add(new StringOperator("D"));
		Operator targetStringValue10 = new StringOperator("ARDA");
		Operator closestStringValue10 = findClosestValue(stringValues10, targetStringValue10);
		System.out.println("Closest value: " + closestStringValue10);
		System.out.println();

		List<Operator> stringValues11 = new ArrayList<>();
		stringValues11.add(new StringOperator("A"));
		stringValues11.add(new StringOperator("R"));
		stringValues11.add(new StringOperator("A"));
		Operator targetStringValue11 = new StringOperator("ARDA");
		Operator closestStringValue11 = findClosestValue(stringValues11, targetStringValue11);
		System.out.println("Closest value: " + closestStringValue11);
		System.out.println();

		List<Operator> stringValues12 = new ArrayList<>();
		stringValues12.add(new StringOperator("A"));
		stringValues12.add(new StringOperator("RC"));
		stringValues12.add(new StringOperator("E"));
		Operator targetStringValue12 = new StringOperator("ARDA");
		Operator closestStringValue12 = findClosestValue(stringValues12, targetStringValue12);
		System.out.println("Closest value: " + closestStringValue12);
		System.out.println();

		List<Operator> stringValues13 = new ArrayList<>();
		stringValues13.add(new StringOperator("A"));
		stringValues13.add(new StringOperator("D"));
		stringValues13.add(new StringOperator("A"));
		Operator targetStringValue13 = new StringOperator("ARDA");
		Operator closestStringValue13 = findClosestValue(stringValues13, targetStringValue13);
		System.out.println("Closest value: " + closestStringValue13);
		System.out.println();

		List<Operator> stringValues14 = new ArrayList<>();
		stringValues14.add(new StringOperator("E"));
		stringValues14.add(new StringOperator("R"));
		stringValues14.add(new StringOperator("L"));
		stringValues14.add(new StringOperator("I"));
		Operator targetStringValue14 = new StringOperator("ERIKLI");
		Operator closestStringValue14 = findClosestValue(stringValues14, targetStringValue14);
		System.out.println("Closest value: " + closestStringValue14);
		System.out.println();

		List<Operator> stringValues15 = new ArrayList<>();
		stringValues15.add(new StringOperator("E"));
		stringValues15.add(new StringOperator("R"));
		stringValues15.add(new StringOperator("L"));
		stringValues15.add(new StringOperator("I"));
		stringValues15.add(new StringOperator("K"));
		Operator targetStringValue15 = new StringOperator("ERIKLI");
		Operator closestStringValue15 = findClosestValue(stringValues15, targetStringValue15);
		System.out.println("Closest value: " + closestStringValue15);
		System.out.println();

		List<Operator> stringValues16 = new ArrayList<>();
		stringValues16.add(new StringOperator("E"));
		stringValues16.add(new StringOperator("R"));
		stringValues16.add(new StringOperator("L"));
		stringValues16.add(new StringOperator("I"));
		stringValues16.add(new StringOperator("I"));
		Operator targetStringValue16 = new StringOperator("ERIKLI");
		Operator closestStringValue16 = findClosestValue(stringValues16, targetStringValue16);
		System.out.println("Closest value: " + closestStringValue16);
		System.out.println();

		List<Operator> stringValues17 = new ArrayList<>();
		stringValues17.add(new StringOperator("A"));
		stringValues17.add(new StringOperator("G"));
		stringValues17.add(new StringOperator("L"));
		stringValues17.add(new StringOperator("T"));
		stringValues17.add(new StringOperator("SR"));
		stringValues17.add(new StringOperator("Y"));
		Operator targetStringValue17 = new StringOperator("GALATASARAY");
		Operator closestStringValue17 = findClosestValue(stringValues17, targetStringValue17);
		System.out.println("Closest value: " + closestStringValue17);
		System.out.println();

		List<Operator> stringValues18 = new ArrayList<>();
		stringValues18.add(new StringOperator("GL"));
		stringValues18.add(new StringOperator("T"));
		stringValues18.add(new StringOperator("A"));
		stringValues18.add(new StringOperator("SR"));
		stringValues18.add(new StringOperator("Y"));
		Operator targetStringValue18 = new StringOperator("GALATASARAY");
		Operator closestStringValue18 = findClosestValue(stringValues18, targetStringValue18);
		System.out.println("Closest value: " + closestStringValue18);
		System.out.println();

		List<Operator> stringValues19 = new ArrayList<>();
		stringValues19.add(new StringOperator("GLTSRY"));
		stringValues19.add(new StringOperator("A"));
		Operator targetStringValue19 = new StringOperator("GALATASARAY");
		Operator closestStringValue19 = findClosestValue(stringValues19, targetStringValue19);
		System.out.println("Closest value: " + closestStringValue19);
		System.out.println();

		List<Operator> stringValues20 = new ArrayList<>();
		stringValues20.add(new StringOperator("GLTSRY"));
		stringValues20.add(new StringOperator("Y"));
		Operator targetStringValue20 = new StringOperator("GLTSR");
		Operator closestStringValue20 = findClosestValue(stringValues20, targetStringValue20);
		System.out.println("Closest value: " + closestStringValue20);
		System.out.println();

		List<Operator> stringValues21 = new ArrayList<>();
		stringValues21.add(new StringOperator("GLTSRY"));
		stringValues21.add(new StringOperator("A"));
		stringValues21.add(new StringOperator("A"));
		Operator targetStringValue21 = new StringOperator("GALATASARAY");
		Operator closestStringValue21 = findClosestValue(stringValues21, targetStringValue21);
		System.out.println("Closest value: " + closestStringValue21);
		System.out.println();

		List<Operator> stringValues22 = new ArrayList<>();
		stringValues22.add(new StringOperator("KAB"));
		stringValues22.add(new StringOperator("A"));
		Operator targetStringValue22 = new StringOperator("KABA");
		Operator closestStringValue22 = findClosestValue(stringValues22, targetStringValue22);
		System.out.println("Closest value: " + closestStringValue22);
		System.out.println();

		List<Operator> stringValues23 = new ArrayList<>();
		stringValues23.add(new StringOperator("KB"));
		stringValues23.add(new StringOperator("A"));
		Operator targetStringValue23 = new StringOperator("KABA");
		Operator closestStringValue23 = findClosestValue(stringValues23, targetStringValue23);
		System.out.println("Closest value: " + closestStringValue23);
		System.out.println();

		List<Operator> integerValues1 = new ArrayList<>();
		integerValues1.add(new IntegerOperator(12));
		integerValues1.add(new IntegerOperator(7));
		integerValues1.add(new IntegerOperator(6));
		integerValues1.add(new IntegerOperator(11));
		Operator integerTargetValue1 = new IntegerOperator(41);
		Operator integerClosestValue1 = findClosestValue(integerValues1, integerTargetValue1);
		System.out.println("Closest value: " + integerClosestValue1);
		System.out.println();

		List<Operator> integerValues2 = new ArrayList<>();
		integerValues2.add(new IntegerOperator(7));
		integerValues2.add(new IntegerOperator(4));
		integerValues2.add(new IntegerOperator(19));
		integerValues2.add(new IntegerOperator(2));
		Operator integerTargetValue2 = new IntegerOperator(1298);
		Operator integerClosestValue2 = findClosestValue(integerValues2, integerTargetValue2);
		System.out.println("Closest value: " + integerClosestValue2);
		System.out.println();

		List<Operator> integerValues3 = new ArrayList<>();
		integerValues3.add(new IntegerOperator(8));
		integerValues3.add(new IntegerOperator(5));
		integerValues3.add(new IntegerOperator(2));
		Operator integerTargetValue3 = new IntegerOperator(18);
		Operator integerClosestValue3 = findClosestValue(integerValues3, integerTargetValue3);
		System.out.println("Closest value: " + integerClosestValue3);
		System.out.println();

		List<Operator> integerValues4 = new ArrayList<>();
		integerValues4.add(new IntegerOperator(7));
		integerValues4.add(new IntegerOperator(11));
		integerValues4.add(new IntegerOperator(3));
		Operator integerTargetValue4 = new IntegerOperator(19);
		Operator integerClosestValue4 = findClosestValue(integerValues4, integerTargetValue4);
		System.out.println("Closest value: " + integerClosestValue4);
		System.out.println();

		List<Operator> integerValues5 = new ArrayList<>();
		integerValues5.add(new IntegerOperator(9));
		integerValues5.add(new IntegerOperator(5));
		integerValues5.add(new IntegerOperator(8));
		integerValues5.add(new IntegerOperator(4));
		Operator targetValue5 = new IntegerOperator(68);
		Operator closestValue5 = findClosestValue(integerValues5, targetValue5);
		System.out.println("Closest value: " + closestValue5);
		System.out.println();

		List<Operator> integerValues6 = new ArrayList<>();
		integerValues6.add(new IntegerOperator(6));
		integerValues6.add(new IntegerOperator(9));
		integerValues6.add(new IntegerOperator(10));
		integerValues6.add(new IntegerOperator(6));
		Operator targetValue6 = new IntegerOperator(3245);
		Operator closestValue6 = findClosestValue(integerValues6, targetValue6);
		System.out.println("Closest value: " + closestValue6);
		System.out.println();

		List<Operator> integerValues7 = new ArrayList<>();
		integerValues7.add(new IntegerOperator(9));
		integerValues7.add(new IntegerOperator(8));
		integerValues7.add(new IntegerOperator(7));
		integerValues7.add(new IntegerOperator(5));
		integerValues7.add(new IntegerOperator(2));
		Operator targetValue7 = new IntegerOperator(2002);
		Operator closestValue7 = findClosestValue(integerValues7, targetValue7);
		System.out.println("Closest value: " + closestValue7);
		System.out.println();

		List<Operator> inetegerValues8 = new ArrayList<>();
		inetegerValues8.add(new IntegerOperator(1));
		inetegerValues8.add(new IntegerOperator(5));
		inetegerValues8.add(new IntegerOperator(17));
		inetegerValues8.add(new IntegerOperator(35));
		Operator targetValue8 = new IntegerOperator(89);
		Operator closestValue8 = findClosestValue(inetegerValues8, targetValue8);
		System.out.println("Closest value: " + closestValue8);
		System.out.println();

		List<Operator> integerValues9 = new ArrayList<>();
		integerValues9.add(new IntegerOperator(8));
		integerValues9.add(new IntegerOperator(5));
		integerValues9.add(new IntegerOperator(20));
		integerValues9.add(new IntegerOperator(378));
		integerValues9.add(new IntegerOperator(15));
		Operator targetValue9 = new IntegerOperator(26);
		Operator closestValue9 = findClosestValue(integerValues9, targetValue9);
		System.out.println("Closest value: " + closestValue9);
		System.out.println();

		List<Operator> integerValues10 = new ArrayList<>();
		integerValues10.add(new IntegerOperator(2607));
		integerValues10.add(new IntegerOperator(5));
		integerValues10.add(new IntegerOperator(9));
		Operator targetValue10 = new IntegerOperator(2607);
		Operator closestValue10 = findClosestValue(integerValues10, targetValue10);
		System.out.println("Closest value: " + closestValue10);
		System.out.println();
		
		
		

	}

	public static Operator findClosestValue(List<Operator> values, Operator targetValue) {
		// Stores the closestValue found so far,  it is set to null initially since there is no closestValue yet
		Operator closestValue = null;
		// Used HashSet because repeated expressions won't be saved, it will keep track of expressions
		Set<String> evaluatedExpressions = new HashSet<>();
		// We created a found variable to check whether the exact target is found.
		boolean found = false; 
		
		// Iterate through each value in the list
		for (Operator value : values) {
			List<Operator> remainingValues = removeElement(values, value); // Removes the current value from the values since I can't use same value again
			String expression = value.toString(); // evaluates expressions
			Operator result = evaluateExpression(value, remainingValues, targetValue, expression, evaluatedExpressions,
					found); // recursive side

			// If the target is found (distance is zero) return the result and print the expression
			if (result.distance(targetValue) == 0) {
				System.out.print(expression + " < ");
				return result;
			}
			
			// Updates the closestValue if a closer value is found
			if (closestValue == null || result.distance(targetValue) < closestValue.distance(targetValue)) {
				closestValue = result;
			}

			if (found) {
				break; // If the target is found, finish the recursive call
			}
		}

		return closestValue;
	}

	private static Operator evaluateExpression(Operator value, List<Operator> remainingValues, Operator targetValue,
			String expression, Set<String> evaluatedExpressions, boolean found) {
		// If the current value equals to targetValue, return the value
		if (value.distance(targetValue) == 0) {
			return value;
		}
		
		// If there are no more values to evaluate then return the current value.
		if (remainingValues.isEmpty()) {
			return value;
		}

		Operator closestValue = null; // Stores the closestValue found, it is set to null initially since no closestValue has been found yet

		for (Operator remainingValue : remainingValues) {
			List<Operator> newRemainingValues = removeElement(remainingValues, remainingValue);

			Operator leftValue = value;
			Operator rightValue = remainingValue;
			//Evaluates the addition operation
			Operator result = leftValue.add(rightValue);
			String addExpression = "(" + expression + " + " + remainingValue.toString() + ")"; 
																								
			Operator closestResult = evaluateExpression(result, newRemainingValues, targetValue, addExpression,
					evaluatedExpressions, found);
			if (closestResult.distance(targetValue) == 0) {
				System.out.print(addExpression + " < ");
				found = true; 
				return closestResult;
			}
			if (closestValue == null || closestResult.distance(targetValue) < closestValue.distance(targetValue)) {
				closestValue = closestResult;
			}
			//Evaluates the subtraction operation
			result = leftValue.subtract(rightValue);
			String subtractExpression = "(" + expression + " - " + remainingValue.toString() + ")"; 
																									
			closestResult = evaluateExpression(result, newRemainingValues, targetValue, subtractExpression,
					evaluatedExpressions, found);
			if (closestResult.distance(targetValue) == 0) {
				System.out.print(subtractExpression + " < ");
				found = true; // If the target value is found, set found to true
				return closestResult;
			}
			if (closestResult.distance(targetValue) < closestValue.distance(targetValue)) {
				closestValue = closestResult;
			}
			//Evaluates the multiplication operation
			result = leftValue.multiply(rightValue);
			String multiplyExpression = "(" + expression + " * " + remainingValue.toString() + ")"; 
																									
			closestResult = evaluateExpression(result, newRemainingValues, targetValue, multiplyExpression,
					evaluatedExpressions, found);
			if (closestResult.distance(targetValue) == 0) {
				System.out.print(multiplyExpression + " < ");
				found = true; 
				return closestResult;
			}
			if (closestResult.distance(targetValue) < closestValue.distance(targetValue)) {
				closestValue = closestResult;
			}
		}

		return closestValue;
	}
	
	// Removes the element from the list and return the new list without the specified element
	private static List<Operator> removeElement(List<Operator> list, Operator element) {
		List<Operator> newList = new ArrayList<>(list);
		newList.remove(element);
		return newList;
	}
}
