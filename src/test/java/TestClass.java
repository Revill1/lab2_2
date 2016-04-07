
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;


public class TestClass {

	@Test
	public void multiMoneyTest() 
	 		{
	 			Money money = new Money(4);
	 			
	 			Assert.assertEquals(true, money.multiplyBy(5).equals(new Money(20)));
	 		}
	
	@Test
	public void addMoneyTest() 
	 		{
	 			Money money = new Money(4);
	 			Money other = new Money(5);
	 			Money other2 = new Money(10);
	 			Money other3 = new Money (20);
	 			
	 			Assert.assertEquals(true, money.add(other).add(other3).add(other2).equals(new Money(39)));
	 		}
	
	@Test
	public void subtractMoneyTest() 
	 		{
	 			Money money = new Money(59);
	 			Money other = new Money(14);
	 			
	 			
	 			Assert.assertEquals(true, money.subtract(other).equals(new Money(45)));
	 		}
	
	@Test
	public void equalMoneyTest() 
	 		{
	 			Money money = new Money(59);
	 			Money other = new Money(14);
	 			
	 			
	 			Assert.assertEquals(false, money.equals(other));
	 		}
}
