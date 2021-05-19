import java.sql.Date;

public class Postavshik {
    
    String name;
    int number;
    String phoneNumber;
    Date dateOfDelivery;
    int countOfTovars;
    String infoOfLocation;

    public void getInfo() {
        //Получение необходимой информации
    }

    public void deliveryOrganisation() {
        //Организация доставок
    }

    public void getInfoAboutDelivery() {
        //Получение информации о поставке
    }

    public Postavshik(String name1, int number1, String phoneNumber1, Date dateOfDelivery1, int countOfTovars1, String infoOfLocation1) {
        name = name1;
        number = number1;
        phoneNumber = phoneNumber1;
        dateOfDelivery = dateOfDelivery1;
        countOfTovars = countOfTovars1;
        infoOfLocation = infoOfLocation1;
    }

    public Postavshik() {
        
    }

}
