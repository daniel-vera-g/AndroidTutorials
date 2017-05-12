/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 * <p>
 * package com.example.android.justjava;
 */
package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method is called when the increment button is clicked.
     */
    public void increment(View view) {
        if (quantity == 100) {
            Toast.makeText(this, "You can not get more than 100 coffees !",
                    Toast.LENGTH_LONG).show();
        } else quantity += 1;
        display(quantity);

    }

    /**
     * This method is called when the decreament button is clicked.
     */
    public void decrement(View view) {
        if (quantity <= 1) {
            Toast.makeText(this, "You can not get less than 1 coffees !",
                    Toast.LENGTH_LONG).show();
        } else quantity -= 1;

        display(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
//        Name of Customer
        EditText customer = (EditText) findViewById(R.id.name);
        String name = customer.getText().toString();

//        Whipped Creame or Chocolate
        boolean haswhippedCreame = ((CheckBox) findViewById(R.id.whipped_cream)).isChecked();
        boolean hasChocolate = ((CheckBox) findViewById(R.id.chocolate)).isChecked();

//        Calculation of the final Price
        int price = calculatePrice(quantity, haswhippedCreame, hasChocolate);

//        Creation of the order summary
        String text = createOrderSummary(price, quantity, haswhippedCreame, hasChocolate, name);

//        Create the subject for the email
        String subject = createSubjectText();

//        Intend for email
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

//        Mehod to display Message on screen instead of send to Email
//        displayMessage(text);
    }

    /**
    * Makes the subject for the email
     * @return subject Text
     * */
    private String createSubjectText() {
        EditText name = (EditText) findViewById(R.id.name);
        String CustomerName = name.getText().toString();
        String subjectText = getString(R.string.order_summary_email_subject, CustomerName   );
        return subjectText;
    }

    /**
     * Calculates the total price
     * @param chocolate
     * @param whippedCream
     * @param quantity
     * @return totalCoffeePrice
     */
    private int calculatePrice(int quantity, boolean whippedCream, boolean chocolate) {
        //Variables
        int priceSimpleCoffee = 5;
        int priceWhippedCreame = 1;
        int priceChocolate = 2;
        int priceOneCoffee;
        int totalCoffeePrice;

//          Calculation of the Coffee Price for one Coffee
        if (whippedCream && !chocolate) {
            priceOneCoffee = priceSimpleCoffee + priceWhippedCreame;
        } else if (chocolate && !whippedCream) {
            priceOneCoffee = priceSimpleCoffee + priceChocolate;
        } else if (whippedCream && chocolate) {
            priceOneCoffee = priceSimpleCoffee + priceChocolate + priceWhippedCreame;
        } else {
            priceOneCoffee = priceSimpleCoffee;
        }

//         calculation total coffee price
        totalCoffeePrice = priceOneCoffee * quantity;
        return totalCoffeePrice;
    }

    /**
     * @param priceCoffee
     * @param quantity
     * @param hasWhippedcream
     * @return endMessage
     */
    private String createOrderSummary(int priceCoffee, int quantity, boolean hasWhippedcream, boolean hasChocolate, String name) {
        String Ordername = getString(R.string.order_summary_name, name);
        String message = "\n" + getString(R.string.thank_you);
        String whippedCream = "\n" + getString(R.string.order_summary_whipped_cream, hasWhippedcream);
        String chocolate = "\n" + getString(R.string.order_summary_chocolate, hasChocolate);
        String orderSummaryQuantity = "\n" + getString(R.string.order_summary_quantity, quantity);
        String total = "\n" + getString(R.string.order_summary_price, priceCoffee);
                String endMessage =  Ordername + whippedCream  + chocolate + orderSummaryQuantity + total + message;
        return endMessage;
    }

}
    /**
     * This method displays the given text on the screen.
     */
    /*private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.price_text_view);
        orderSummaryTextView.setText(message);
    }*/
