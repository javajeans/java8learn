package com.lzh.common.test;

import com.lzh.model.Trader;
import com.lzh.model.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 描述
 *
 * @author zhiheng.li
 * @since 2017/4/13
 */

public class TraderTest {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        //输出2011年所有的交易额

        System.out.println("2011年所有交易额：" + findByYear(transactions,2011));

        // 输出交易员都在哪些城市工作过

        System.out.println("交易员工作过的地方：" + findByCites(transactions));
    }


    public static List<Transaction> findByYear(List<Transaction> transactions, int year) {
        /**
         * <p>根据年份查询所有的交易额，并按交易额排序</p>
         * @author zhiheng.li
         * @since 2017/4/13
         * @param [transactions, year]
         * @retrun java.util.List<com.lzh.model.Transaction>
         */

        return transactions.stream().filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public static Set<String> findByCites(List<Transaction> transactions) {
        /**
         * <p>交易員都在哪些不同的城市工作過</p>
         * @author zhiheng.li
         * @since 2017/4/13
         * @param [transactions]
         * @retrun java.util.List<java.lang.String>
         */
    // return transactions.stream().map(transaction -> transaction.getTrader().getCity()).distinct().collect(Collectors.toList());
     return transactions.stream().map(transaction -> transaction.getTrader().getCity()).collect(Collectors.toSet());
    }
}
