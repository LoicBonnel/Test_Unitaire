import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTests {

	@Test
	void testCar() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		assertEquals("Peugeot", mycar1.getMarque());
	}

	@Test
	void testGetMarque() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		assertEquals("Peugeot", mycar1.getMarque());
	}

	@Test
	void testGetModele() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		assertEquals("407 HDI", mycar1.getModele());
	}

	@Test
	void testGetPrixAchat() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		assertEquals(0, mycar1.getPrixAchat());
	}

	@Test
	void testGetPrixVente() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		assertEquals(0, mycar1.getPrixVente());
	}

	@Test
	void testGetNbportes() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		assertEquals(0, mycar1.getNbportes());
	}

	@Test
	void testGetQteStock() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		assertEquals(0, mycar1.getQteStock());
	}

	@Test
	void testGetPuissanceCv() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		assertEquals(0, mycar1.getPuissanceCv());
	}

	@Test
	void testGetKilometrage() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		assertEquals(0, mycar1.getKilometrage());
	}

	@Test
	void testGetNeuve() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		assertEquals(true, mycar1.getNeuve());
	}

	@Test
	void testSetMarque() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setMarque("renault");
		assertEquals("renault", mycar1.getMarque());
	}

	@Test
	void testSetModele() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setModele("Zoé");
		assertEquals("Zoé", mycar1.getModele());
	}

	@Test
	void testSetPrixAchat() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setPrixAchat(5800);
		assertEquals(5800, mycar1.getPrixAchat());
	}

	@Test
	void testSetPrixVente() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setPrixVente(4000);
		assertEquals(4000, mycar1.getPrixVente());
	}

	@Test
	void testSetNbportes() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setNbportes(5);
		assertEquals(5, mycar1.getNbportes());
	}

	@Test
	void testSetQteStock() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setQteStock(6);
		assertEquals(6, mycar1.getQteStock());
	}

	@Test
	void testSetPuissanceCv() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setPuissanceCv(120);
		assertEquals(120, mycar1.getPuissanceCv());
	}

	@Test
	void testSetKilometrage() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setKilometrage(150000);
		assertEquals(150000, mycar1.getKilometrage());
	}

	@Test
	void testSetNeuve() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setNeuve(false);
		assertEquals(false, mycar1.getNeuve());
	}

	@Test
	void testSetQteStockplus() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setQteStock(3);
		mycar1.setQteStockplus(7);
		assertEquals(10, mycar1.getQteStock());
	}

	@Test
	void testVerifStocksuffisant() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setQteStock(3);
		assertEquals(false, mycar1.verifStocksuffisant(11));
		// 3 en stock et savoir si ont peut sortir 11
		
		Car mycar2;
		mycar2 = new Car("Peugeot", "407 HDI");
		mycar2.setQteStock(11);
		assertEquals(true, mycar2.verifStocksuffisant(9));
	}

	@Test
	void testSetQteStockMoins() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		mycar1.setQteStock(3);
		assertEquals(true, mycar1.setQteStockMoins(11));
		
		Car mycar2;
		mycar2 = new Car("Peugeot", "407 HDI");
		mycar2.setQteStock(3);
		assertEquals(false, mycar2.setQteStockMoins(1));
	}

	@Test
	void testCarEnChaine() {
		//fail("Not yet implemented");
		Car mycar1;
		mycar1 = new Car("Peugeot", "407 HDI");
		assertEquals("\n Marque :Peugeot"+"\n Modele :407 HDI"+"\n Prix d'achat :0.0"+"\n Prix de vente :0.0"+"\n nombre de portes :0"+"\n Quantité en stock :0"+"\n puissance en chevaux :0"+"\n Kilometrage :0"+"\n etat Neuf :true", mycar1.CarEnChaine());

	}

}