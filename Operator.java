/* Baharnur Türkoğlu / 21050111079
 * Fatma Betül Özdemir / 21050111006
 * İlknur Nazlı Koşar / 21050111018
 * Efe Şahin / 21050111023
 */
import java.awt.Color;

//Operator is an abstract class because we will extend it for the String and Integers below.
public abstract class Operator {
	
	// This abstract method will concatenate Strings and sum up the Integers mathematically.
	abstract Operator add(Operator operator);
	
	// This abstract method will add the given character to the String's each character and multiply Integers mathematically.
	abstract Operator multiply(Operator operator);
	
	// This abstract method remove character from the String and subtract Integers mathematically.
	abstract Operator subtract(Operator operator);
	
	// This abstract method will determine the distance between Strings and between Integers mathematically(absolute value).
	abstract double distance(Operator operator);
	
}

class IntegerOperator extends Operator{

	final public int value;
	
	IntegerOperator(int value){
		this.value = value;
	}
	
	@Override
	// This method sums the values of two integer operators and returns a new operator.
	Operator add(Operator operator) {
		// converting given Operator object to Integer Operator
		IntegerOperator integerOperator = (IntegerOperator) operator;
		return new IntegerOperator(value + integerOperator.value);
	}
	
	@Override
	// This method multiplies the values of two integer operators and returns a new operator.
	Operator multiply(Operator operator) {
		// converting given Operator object to Integer Operator
		IntegerOperator integerOperator = (IntegerOperator) operator;
		return new IntegerOperator(value * integerOperator.value);
	}

	@Override
	// This method subtract the values of two integer operators and returns a new operator.
	Operator subtract(Operator operator) {
		// converting given Operator object to Integer Operator
		IntegerOperator integerOperator = (IntegerOperator) operator;
		return new IntegerOperator(value - integerOperator.value);
	}
	
	@Override
	// This method calculates the absolute difference between the values of two integer operators.
	double distance(Operator operator) {
		IntegerOperator integerOperator = (IntegerOperator) operator;
	    return Math.abs(value - integerOperator.value);
	}
	
	public String toString() {
        return String.valueOf(value);
    }
}


class StringOperator extends Operator{
	
	String value;
	
	// Constructor of the IntegerOperator class.
	StringOperator(String value){
		this.value = value;
	}

	
	@Override
	// This method concatenates two strings and returns to a new string.
	Operator add(Operator operator) {
		// converting given Operator object to String Operator
		 StringOperator stringOperator = (StringOperator) operator;
	        return new StringOperator(value + stringOperator.value);
	}

	@Override
	// This method takes the given value and add the given value after each character.
	Operator multiply(Operator operator) {
		// converting given Operator object to String Operator
		 StringOperator stringOperator = (StringOperator) operator;
		 	// We used StringBuilder because it is mutable.
	        StringBuilder result = new StringBuilder();
	        
	        for (int i = 0; i < value.length(); i++) {
	            result.append(value.charAt(i));
	            result.append(stringOperator.value);
	        }
	        return new StringOperator(result.toString());
	}
	



	@Override
	Operator subtract(Operator operator) {
		// converting given Operator object to String Operator
		StringOperator stringOperator = (StringOperator) operator;
        StringBuilder result = new StringBuilder(value);
        
        for (int i = stringOperator.value.length() - 1; i >= 0; i--) {
            char ch = stringOperator.value.charAt(i);
            int lastIndex = result.lastIndexOf(String.valueOf(ch));
            
            if (lastIndex != -1) {
                result.deleteCharAt(lastIndex);
            }
        }
        return new StringOperator(result.toString());
	}

	@Override
	double distance(Operator operator) {
		// converting given Operator object to String Operator
		// we used distance function for strings that is provided
		 StringOperator stringOperator = (StringOperator) operator;
		    int maxLength = Math.max(value.length(), stringOperator.value.length());
		    
		    int distance = 0;
		    for (int i = 0; i < maxLength; i++) {
		        char diff1 = (i < value.length() ? value.charAt(i) : ' ') ;
		        char diff2 = (i < stringOperator.value.length() ? stringOperator.value.charAt(i) : ' ');
		        distance += Math.abs(diff1 - diff2);
		    }
		    
		    return distance;
	}
	
	public String toString() {
		return value;
	}
	
}
// This class take the colors' RGB values and goes to the target. Since there is limited colors in Java, We used Google to determine RGB's of colors when output is generated.
//When the targetValue is reached, it will display the steps to go to the target.
class ColorOperator extends Operator{
	
	Color value;
	
	ColorOperator(Color value){
		this.value = value;
	}
	
	ColorOperator(Color red, Color green, Color blue){
		    this.value = new Color(red.getRed() % 256, green.getGreen() % 256, blue.getBlue() % 256);
	}
	

	@Override
	Operator add(Operator operator) {
		ColorOperator colorOperator = (ColorOperator) operator;
		Color res = new Color(((value.getRed() + colorOperator.value.getRed()) % 256), ((value.getGreen() + colorOperator.value.getGreen()) % 256), ((value.getBlue() + colorOperator.value.getBlue()) % 256) );
        return new ColorOperator(res);
	}

	@Override
	Operator multiply(Operator operator) {
		ColorOperator colorOperator = (ColorOperator) operator;
		Color res = new Color(((value.getRed() * colorOperator.value.getRed()) % 256), ((value.getGreen() * colorOperator.value.getGreen()) % 256), ((value.getBlue() * colorOperator.value.getBlue()) % 256) );
		return new ColorOperator(res);
	}

	@Override
	Operator subtract(Operator operator) {
		ColorOperator colorOperator = (ColorOperator) operator;
		Color res = new Color(Math.abs(value.getRed() - colorOperator.value.getRed()), Math.abs(value.getGreen() - colorOperator.value.getGreen()), Math.abs(value.getBlue() - colorOperator.value.getBlue() ) );
		return new ColorOperator(res);

	}

	@Override
	double distance(Operator operator) {
		ColorOperator colorOperator = (ColorOperator) operator;
		int redDiff = value.getRed() - colorOperator.value.getRed();
		int greenDiff = value.getGreen() - colorOperator.value.getGreen();
		int blueDiff = value.getBlue() - colorOperator.value.getBlue();
		double distanceSquared = redDiff * redDiff + greenDiff * greenDiff + blueDiff * blueDiff;
		return Math.sqrt(distanceSquared);

	}
	
	public String toString() {
		return value.getRed() + "," + value.getGreen() + "," + value.getBlue();
	}
}













