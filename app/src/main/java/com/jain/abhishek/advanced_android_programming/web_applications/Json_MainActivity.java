package com.jain.abhishek.advanced_android_programming.web_applications;

/**
 * Created by abhishekkumarsarkar on 20/07/17.
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.jain.abhishek.advanced_android_programming.R;

public class Json_MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_json);

        TextView output = (TextView) findViewById(R.id.textView1);

        String strJson="{ \"Employee\" :[{\"id\":\"101\"," +
                                          "\"name\":\"ABC\"," +
                                           "\"salary\":\"50000\"}," +

                                        "{\"id\":\"102\"," +
                                          "\"name\":\"xyz\"," +
                                         "  \"salary\":\"60000\"}] " +
                        "}";

        String data = "";
        try {
            // Create the root JSONObject from the JSON string.
            JSONObject  jsonRootObject = new JSONObject(strJson);

            //Get the instance of JSONArray that contains JSONObjects
            JSONArray jsonArray = jsonRootObject.optJSONArray("Employee");

            //Iterate the jsonArray and print the info of JSONObjects
            for(int i=0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                int id = Integer.parseInt(jsonObject.optString("id").toString());
                String name = jsonObject.optString("name").toString();
                float salary = Float.parseFloat(jsonObject.optString("salary").toString());

                data += "Node"+i+" : \n id= "+ id +" \n Name= "+ name +" \n Salary= "+ salary +" \n ";
            }
            output.setText(data);
        } catch (JSONException e) {e.printStackTrace();}
    }
}