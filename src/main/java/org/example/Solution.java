//A software development team for an e-commerce company is working on billing software. They are given some product prices, followed by discounts and the number of items purchased by a user.
//
//
//
//Given a list of unique items with their prices, a list of unique items with their discounts, and a list of items purchased by the user, generate the final invoice. The format for each item is item, price, total_price (total_price is calculated as sum_of_quantity * price_of_item, and if a discount exists, it's subtracted from it). There might be duplicates in the list of purchases.
//
//
//
//This invoice list should be sorted in ascending order of product name.
//
//
//
//GroceryReceipt class:
//
//Create the 'GroceryReceipt' class that extends GroceryReceiptBase
//These properties will be passed.
//Prices - the list of items and their prices
//Discounts - the list of discounts for each item
//
//
//
//
//Example
//
//It is given that Bananas, Apples, and Oranges are priced at 10, 20, and 5, respectively. The discount on an Orange is 10%. The customer shopping list is as follows.
//
//
//
//item	quantity
//Banana
//
//5
//Orange
//
//2
//Orange	1
//
//
//The final invoice is:
//
//item	price	total_price
//Banana	10	50
//Orange	5	13.5
//
//
//Normally, an Orange costs 5 per unit, but there is a 10% discount. For 3 units of Orange, the gross price is 15, less 10% is 13.5.
//
//
//
//
//Function Description
//
//Create GroceryReceipt class by extending the GroceryReceiptBase abstract class. Implement a Calculate function to create invoices. The function should return the item, quantity, and the total price after the discount for every item in the grocery receipt.
//
//
//
//Input Format For Custom Testing
//The first line contains an integer n, the number of fruits.
//
//Each of the next n lines contains two space-separated values, (fruit (String), price per unit (Double)).
//
//The next line contains an integer m, the number of discount items.
//
//Each of the next m lines contains two space-separated values, (fruit (String), percentage discount (Integer)).
//
//The next line contains an integer k, the number of items purchased.
//
//Each of the next k lines contains two space-separated values, (fruit (String), units purchased (Integer)).
//
//Sample Case 0
//Sample Input
//
//STDIN            FUNCTION
//-----            --------
//3            →   n = 3
//Apple 34     →   [fruit,price per unit] = [["Apple", 34],
//Banana 14                                ["Banana", 14],
//Orange 4                                 ["Orange", 4]]
//1            →   m = 1
//Orange 10    →   [fruit,percentage discount] = [["Orange", 10]]
//2            →   k = 2
//Apple 2      →   [fruit, units] = [["Apple", 2], ["Apple", 5]]
//Apple 5
//Sample Output
//
//Apple 34.0 238.0
//Explanation
//
//The shopping list is 2 units Apple and 5 units Apple. 7 units of Apple cost 7 * 34 = 238 and there is no discount.
//
//Sample Case 1
//Sample Input
//
//STDIN             FUNCTION
//-----             --------
//3            →    n = 3
//Apple 31     →    [fruit,price per unit] = [["Apple", 31],
//Banana 39                                 ["Banana", 39],
//Orange 47                                 ["Orange", 47]]
//3            →    m = 3
//Apple 40     →    [fruit,percentage discount] = [["Apple", 40],
//Banana 40                                        ["Banana", 40],
//Orange 50                                        ["Orange", 50]]
//2            →    k = 2
//Banana 4     →    [fruit, units] = [["Banana", 4], ["Apple", 3]]
//Apple 3
//Sample Output
//
//Apple 31.0 55.8
//Banana 39.0 93.6
//Explanation
//
//3 units of Apples and 4 units of Bananas are purchased. There is a 40% discount on both items.
//
//
//
//Apple: 3 * 31 = 93, less 40% is 55.8
//
//Banana: 4 * 39 = 156, less 40% is 93.6


package org.example;
import java.util.*;
import java.io.*;

class Grocery {
    String fruit;
    double price, total;
    Grocery(String fruit, double price, double total) {
        this.fruit = fruit;
        this.price = price;
        this.total = total;
    }
}
class Node{
    String fruit;
    int count;
    Node(String fruit, int count){
        this.fruit = fruit;
        this.count = count;
    }
}
abstract class GroceryReceiptBase {
    private Map<String, Double> prices;
    private Map<String, Integer> discounts;

    public GroceryReceiptBase(Map<String, Double> prices, Map<String, Integer> discounts) {
        this.prices = prices;
        this.discounts = discounts;
    }
    public abstract List<Grocery> Calculate(List<Node> shoppingList);

    public Map<String, Double> getPrices() {
        return prices;
    }
    public Map<String, Integer> getDiscounts() {
        return discounts;
    }
}
//Create the 'GroceryReceipt' class that extends GroceryReceiptBase above.

class GroceryReceipt extends GroceryReceiptBase {
    public GroceryReceipt(Map<String, Double> prices, Map<String, Integer> discounts) {
        super(prices, discounts);
    }

    @Override
    public List<Grocery> Calculate(List<Node> shoppingList) {
        List<Grocery> invoice = new ArrayList<>();
        Map<String, Double> prices = getPrices();
        Map<String, Integer> discounts = getDiscounts();
        Map<String, Integer> quantityMap = new HashMap<>(); // Map to store total quantity of each fruit

        // Aggregate total quantity of each fruit
        for (Node item : shoppingList) {
            String fruit = item.fruit;
            int quantity = item.count;
            quantityMap.put(fruit, quantityMap.getOrDefault(fruit, 0) + quantity);
        }

        // Generate invoice based on aggregated quantities
        for (Map.Entry<String, Integer> entry : quantityMap.entrySet()) {
            String fruit = entry.getKey();
            int quantity = entry.getValue();
            double price = prices.get(fruit);
            double total = price * quantity;

            // Apply discount if available
            if (discounts.containsKey(fruit)) {
                int discountPercentage = discounts.get(fruit);
                double discountAmount = (discountPercentage / 100.0) * total;
                total -= discountAmount; // Deduct discount from total
            }

            invoice.add(new Grocery(fruit, price, total));
        }

        // Sort invoice by fruit name
        Collections.sort(invoice, Comparator.comparing(g -> g.fruit));

        return invoice;
    }
}
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.getenv("OUTPUT_PATH"), "UTF-8");

        List<Node> boughtItems = new ArrayList<>();
        Map<String, Double> prices = new HashMap<>();
        Map<String, Integer> discounts = new HashMap<>();

        int n = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < n; i++)
        {
            String[] a = reader.readLine().trim().split(" ");
            prices.put(a[0], Double.parseDouble(a[1]));
        }
        int m = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < m; i++)
        {
            String[] a = reader.readLine().trim().split(" ");
            discounts.put(a[0], Integer.parseInt(a[1]));
        }
        int b = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < b; i++)
        {
            String[] a = reader.readLine().trim().split(" ");
            boughtItems.add(new Node(a[0], Integer.parseInt(a[1])));
        }
        GroceryReceipt g = new GroceryReceipt(prices, discounts);
        List<Grocery> result = g.Calculate(boughtItems);
        for (Grocery x : result)
        {
            writer.printf("%s %.1f %.1f\n", x.fruit, x.price, x.total);
        }
        writer.flush();
        writer.close();
    }
}