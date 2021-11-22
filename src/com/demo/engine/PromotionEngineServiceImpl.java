package com.demo.engine;

import java.math.BigDecimal;
import java.util.List;

public class PromotionEngineServiceImpl  implements  ProductInterface{

   @Override
    public int GetPriceUnderPromotion(List<Product> products)
    {
        int countA = 0;
        int priceOfA = 50;
        int countB = 0;
        int priceOfB = 30;
        int countC = 0;
        int priceOfC = 20;
        int countD = 0;
        int priceOfD = 15;

        for (Product prd : products)
        {
            switch (prd.SKUID)
            {
                case "A":
                    countA += 1;
                    break;
                case "B":
                    countB += 1;
                    break;
                case "C":
                    countC += 1;
                    break;
                case "D":
                    countD += 1;
                    break;
            }
        }
        int totalPriceA = (countA / 3) * 130 + (countA % 3 * priceOfA);
        int totalPriceB = (countB / 2) * 45 + (countB % 2 * priceOfB);
        int totalPriceCD = 0;
        if(countC > 0 && countD > 0){
            if(countC == countD || (countC%countD) == 0){
                totalPriceCD= countC*30;
            }
            if(countC-countD > 0){
                totalPriceCD = (countC - countD) * priceOfC + countD * 30;
            }else if(countC-countD < 0){
                totalPriceCD = (countD-countC)*priceOfD + countC*30;
            }
        }else{
            if(countC > 0){
                totalPriceCD = countC * priceOfC;
            }else if(countD > 0){
                totalPriceCD = countD * priceOfD;
            }
        }

        return totalPriceA + totalPriceB + totalPriceCD;
    }
}
