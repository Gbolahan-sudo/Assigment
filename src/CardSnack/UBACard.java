package CardSnack;

import java.util.Objects;

public class UBACard {
    int cardNum = 16;
    public String validateCardNumberLength(String cardNumber){
        String[] cardNumbers = cardNumber.split("");
        if (cardNumbers.length < 13 || cardNumbers.length > 16){
            return "Invalid Card Number";
        }
        return "Card Number Correct";
    }

    public String checkCardType(String cardNumber){
        String[] cardNumbers = cardNumber.split("");
        if (Objects.equals(cardNumbers[0], "4")) {
            return "Visa Card";
        }
        if (Objects.equals(cardNumbers[0], "5")){
            return "Master Card";
        }
        if (Objects.equals(cardNumbers[0], "3") && Objects.equals(cardNumbers[1], "7")){
            return "American Express";
        }
        if (Objects.equals(cardNumbers[0], "6")){
            return "Discover Card";
        }
        return "Invalid Card Type";
    }

    public String returnCardNumber(String cardNumber){
        return cardNumber;
    }

    public String cardValidityStatus(String cardNumber){
        String[] cardNumbers = cardNumber.split("");
        int sum = 0;
        for (int i = cardNumber.length()-2; i >= 0; i-=2) {
            if ((Integer.parseInt( cardNumbers[i]) * 2) > 9) {
                sum += ((Integer.parseInt(cardNumbers[i]) * 2) % 10) + 1;
            }
            else
                sum += Integer.parseInt(cardNumbers[i]) * 2;
        }
        int secondSum = 0;
        for (int i = cardNumbers.length-1; i >= 0; i-=2) {
            secondSum+= Integer.parseInt(cardNumbers[i]);
        }
        System.out.println(secondSum);
        System.out.println(sum);
        int totalSum = secondSum+sum;
        System.out.println(totalSum);
        if (totalSum%10 == 0){
            return "Valid";
        }
        return "Invalid";
    }

    public int cardLenght(String cardDigitLength){

        return cardNum;
    }
}