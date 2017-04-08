package braulio.ramirez.paybook1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.JSONException;
import org.json.JSONObject;

public class BankAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);

        /*

                //String YOUR_API_KEY = "d87a77ad8b5de1bff86e9c72b7eeec5b";
                JSONObject body = new JSONObject();
                //body.put("Braulio", 121212);

                String YOUR_API_KEY = "d87a77ad8b5de1bff86e9c72b7eeec5b";
                //JSONObject body = new JSONObject();

                try {
                    body.put("name", "Braulio Demo");
                } catch (JSONException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();}


                HttpResponse<JsonNode> jsonResponse = null;
                Object user = null;
                try {
                    jsonResponse = Unirest.post("https://sync.paybook.com/v1/users")
                            .header("accept", "application/json")
                            .header("Content-Type", "application/json")
                            .header("Authorization", "api_key api_key=" + YOUR_API_KEY)
                            .body(String.valueOf(body))
                            .asJson();
                    JSONObject jsonObject = jsonResponse.getBody().getObject();
                    ObjectMapper mapper = new ObjectMapper();
                    user = mapper.readValue(jsonObject.get("response").toString(), Object.class);
                    System.out.println(user.toString());
                } catch (Exception e) {
                    System.out.println("Something went wrong!");
                }
                */


            }
}
