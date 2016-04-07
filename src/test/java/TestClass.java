
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;


public class TestClass {

	@Test
	public void MultiMoneyTest() 
	 		{
	 			Money money = new Money(4);
	 			Money other = new Money(5);
	 			Assert.assertEquals(false, money.multiplyBy(2).equals(new Money(20)));
	 		}
}
