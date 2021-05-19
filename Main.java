public class Main
{
	public static void main(String[] args) {
		Ceilor cl = new Ceilor("Беликова М.С.", "Маркорян Р.Ю.", "+7 926 885-65-48", "Ул. Центральная 2");
	    cl.take();
	    Car car_1 = new Car("1545-9678-8485", "Volkswagen Polo", 4, 40.0f, "Свободна", "Седан");
	    car_1.output();
	}
} 