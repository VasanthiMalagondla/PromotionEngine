package test;


import com.demo.engine.Product;
import com.demo.engine.PromotionEngineServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ProductEngineServiceImplTest {
    ArrayList<Product> list = new ArrayList<>();
    PromotionEngineServiceImpl service = new PromotionEngineServiceImpl();
    @Test
    public void testGetPriceUnderPromotion() {
        Product prd1 = new Product("A");
        assertEquals(new BigDecimal("50"), prd1.getPrice());
        Product prd2 = new Product("B");
        assertEquals(new BigDecimal("30"), prd2.getPrice());
        Product prd3 = new Product("C");
        assertEquals(new BigDecimal("20"), prd3.getPrice());
        Product prd4 = new Product("D");
        assertEquals(new BigDecimal("15"), prd4.getPrice());
        list.add(prd1);
        list.add(prd2);
        list.add(prd3);
        list.add(prd4);
        int i = service.GetPriceUnderPromotion(list);
        assertEquals(110, i);
        Product prd5 = new Product("B");
        list.add(prd5);
        assertEquals(125, service.GetPriceUnderPromotion(list));
        Product prd1A = new Product("A");
        Product prd2A = new Product("A");
        Product prd3A= new Product("A");
        Product prd4A = new Product("A");
        Product prd5A = new Product("A");
        Product prd1B = new Product("B");
        Product prd2B = new Product("B");
        Product prd3B= new Product("B");
        Product prd4B = new Product("B");
        Product prd5B = new Product("B");
        Product prdC = new Product("C");
        ArrayList<Product> list2 = new ArrayList<>();
        list2.add(prd1A);
        list2.add(prd2A);
        list2.add(prd3A);
        list2.add(prd4A);
        list2.add(prd5A);
        list2.add(prd1B);
        list2.add(prd2B);
        list2.add(prd3B);
        list2.add(prd4B);
        list2.add(prd5B);
        list2.add(prdC);
        assertEquals(370, service.GetPriceUnderPromotion(list2));



    }

}
