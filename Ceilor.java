public class Ceilor extends Client{
    public String name1;
    
     public void set_name1 (String name1){
        this.name1 = name1;
    } 
    
    public String get_name1() {
        return name1;
    }

    public Ceilor (String name1) {
        this.name1 = name1;
    }
    
    void ceilor_name () {
        System.out.println("Сотрудник проката - " + name1);
    }

    public Ceilor (String name1, String name, String telephone, String address) {
        this.name1 = name1;
        super.name = name;
        super.telephone = telephone;
        super.address = address;
    }
    void take () {
     System.out.println("Клиент - " + super.name);
         System.out.println("");
         System.out.println("Обращение к сотруднику проката");
         System.out.println("");
        System.out.println("сотрудник проката - " + name1);
        System.out.println("");
        System.out.println("Получение персональных данных о клиенте");
        System.out.println("");
        System.out.println("Персональные данные арендатора:");
        System.out.println("ФИО - " + super.name);
        System.out.println("Телефон - " + super.telephone);
        System.out.println("Адрес - " + super.address);
          System.out.println("");
            System.out.println("Внесение данных в систему");
            System.out.println("");
    }
}