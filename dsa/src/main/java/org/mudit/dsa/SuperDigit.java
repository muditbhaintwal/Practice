package org.mudit.dsa;

/*
We define super digit of an integer x  using the following rules:

Given an integer, we need to find the super digit of the integer.

If x has only 1 digit, then its super digit is x .
Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
For example, the super digit of 9875 will be calculated as:

	super_digit(9875)   	9+8+7+5 = 29
	super_digit(29) 	2 + 9 = 11
	super_digit(11)		1 + 1 = 2
	super_digit(2)		= 2


Given a number and it k repetitions

Example
n=9875
k=4

The number p is created by concatenating the string n, k  times so the initial p=9875987598759875.

    superDigit(p) = superDigit(9875987598759875)
                  9+8+7+5+9+8+7+5+9+8+7+5+9+8+7+5 = 116
    superDigit(p) = superDigit(116)
                  1+1+6 = 8
    superDigit(p) = superDigit(8)
All of the digits of  sum to . The digits of  sum to .  is only one digit, so it is the super digit.

https://www.hackerrank.com/challenges/recursive-digit-sum/problem

 */
public class SuperDigit {
    public static void main(String[] args) {
        //String num = "861568688536788";
        String num = "7404954009694227446246375747227852213692570890717884174001587537145838723390362624487926131161112710589127423098959327020544003395792482625191721603328307774998124389641069884634086849138515079220750462317357487762780480576640689175346956135668451835480490089962406773267569650663927778867764315211280625033388271518264961090111547480467065229843613873499846390257375933040086863430523668050046930387013897062106309406874425001127890574986610018093859693455518413268914361859000614904461902442822577552997680098389183082654625098817411306985010658756762152160904278169491634807464356130877526392725432086439934006728914411061861235300979536190100734360684054557448454640750198466877185875290011114667186730452681943043971812380628117527172389889545776779555664826488520325234792648448625225364535053605515386730925070072896004645416713682004600636574389040662827182696337187610904694029221880801372864040345567230941110986028568372710970460116491983700312243090679537497139499778923997433720159174153";
        int repetitions = 100000;
        System.out.println(getSuperDigit(num, repetitions));
    }

    private static int getSuperDigit(String num, int repetitions) {
        StringBuffer number = new StringBuffer();
        number.append(String.valueOf(num).repeat(Math.max(0, repetitions)));
        return Integer.parseInt(superDigit(number));
    }

    private static String superDigit(StringBuffer number) {
        if (number.length() == 1) {
            return number.toString();
        }
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum = sum + Integer.parseInt("" + number.charAt(i));
        }
        return superDigit(new StringBuffer(String.valueOf(sum)));
    }

}
