package homeWorkOne;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product("C# + Engular Kampi", 1, "Engin Demirog");
		Product product2 = new Product("Java + React", 42, "Engin Demirog");

		Product[] products = { product1, product2 };
		
		for (Product product : products) {
			System.out.println("Kurs ismi = " + product.name);
			System.out.println("Tamamlanan = %" +product.percent);
			System.out.println("Sunan = " + product.speaking);
			System.out.println("-------------------------");
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCourse(product1);
		productManager.addToCourse(product2);
	}

}
