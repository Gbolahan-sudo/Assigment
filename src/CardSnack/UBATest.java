package CardSnack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UBATest {

    @Test
    public void validateCardNumberLengthTest() {
        UBACard ubaCard = new UBACard();
        Assertions.assertEquals("Invalid Card Number", ubaCard.validateCardNumberLength("7827878257782574422442"));
        Assertions.assertEquals("Card Number Correct", ubaCard.validateCardNumberLength("46343774636463"));
    }

    @Test
    public void ValidateCardTypeTest() {
        UBACard ubaCard = new UBACard();
        Assertions.assertEquals(ubaCard.checkCardType("5396881614951403"), "Master Card");
        Assertions.assertEquals(ubaCard.checkCardType("6399831619161495"), "Discover Card");
        Assertions.assertEquals(ubaCard.checkCardType("4399901619690403"), "Visa Card");
        Assertions.assertEquals(ubaCard.checkCardType("3799834399901619"), "American Express");
    }
    @Test
    public void returnCardNumberTest(){
        UBACard ubaCard = new UBACard();
        Assertions.assertEquals(ubaCard.returnCardNumber("5399831619690403"), "cardNumber");
    }
    @Test
    public void cardValidityStatusTest(){
        UBACard ubaCard = new UBACard();
        Assertions.assertEquals(ubaCard.cardValidityStatus("5399831619690404"), "Invalid");
        Assertions.assertEquals(ubaCard.cardValidityStatus("5399831619690403"), "Valid");
    }
    @Test
    public void cardLengthTest(){
        UBACard  ubaCard = new UBACard();
        Assertions.assertEquals(ubaCard.cardLenght("15"), "cardNumberLength");
    }
}

