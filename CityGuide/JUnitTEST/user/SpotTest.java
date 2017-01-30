package user;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpotTest {

	@Test
	public void test() {
		Spot spot = new Spot();
		spot.SetId(1);
		spot.SetAddress("address");
		spot.SetDecription("description");
		spot.SetX(10);
		spot.SetY(10);
		spot.SetCategory("Metro");
	}

}
