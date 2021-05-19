public class Car {
    private String code;
    private String title;
    private int kolvo;
    private float price;
    private String status;
    private String note;  
    
     public void set_code (String code){
        this.code = code;
    } 
    public void set_title (String title){
        this.title = title;
    }
    public void set_kolvo (int kolvo){
        this.kolvo = kolvo;
    }
    public void set_price (float price){
        this.price = price;
    }
    public void set_status (String status){
        this.status = status;
    }
    public void set_note (String note){
        this.note = note;
    }
    
    public String get_code() {
        return code;
    }
    public String get_title() {
        return title;
    }
    public int get_kolvo() {
        return kolvo;
    }
    public float get_price() {
        return price;
    }
    public String get_status() {
        return status;
    }
    public String get_note() {
        return note;
    }

    public Car (String code, String title, int kolvo, float price, String status, String note) {
        this.code = code;
        this.title = title;
        this.kolvo = kolvo;
        this.price = price;
        this.status = status;
        this.note = note;
    }
    void output () {
        System.out.println("Прокат автомобиля");
        System.out.println("");
        System.out.println("Идентификатор автомобиля - " + code);
        System.out.println("Марка и модель автомобиля - " + title);
        System.out.println("Срок аренды  - " + kolvo + " дня");
        System.out.println("Стоимость аренды. - " + price + " тысяч рублей");
        System.out.println("Статус - " + status);
        System.out.println("Тип кузова - " + note);
    }
}
