package mx.edu.cetys.alejandroh.mcpapito;

import android.app.DownloadManager;
import android.permission.INTERNET;
/**
 * Created by PC on 30/10/2017.
 */

public class RequestQueue {
    final TextView mTextView = (TextView) findViewById(R.id.text);
    RequestQueue queue = Volley.newRequestQueue(this);
    String url ="http://http://107.170.247.123:2403/snakes-ladders";

    // Request a string response from the provided URL.
    StringRequest stringRequest = new StringRequest(DownloadManager.Request.Method.GET, url,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    // Display the first 500 characters of the response string.
                    mTextView.setText("Response is: "+ response.substring(0,500));
                }
            }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            mTextView.setText("That didn't work!");
        }
    });
// Add the request to the RequestQueue.
queue.add(stringRequest);
}
