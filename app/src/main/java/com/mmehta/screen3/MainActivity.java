package com.mmehta.screen3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    WebView myView;
    TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView = findViewById(R.id.webView);
        myText = findViewById(R.id.textView);
    }

    public void website1(View view) {
        myView.loadUrl("https://www.linkedin.com/");
        Toast.makeText(getApplicationContext(),"Good Job!!",Toast.LENGTH_SHORT).show();
        myText.setText("LinkedIn is an American business and employment-oriented service that operates via websites and mobile apps. It is mainly used for professional networking, including employers posting jobs and job seekers posting their CVs");
    }

    public void website2(View view) {
        myView.loadUrl("https://www.netflix.com/");
        Toast.makeText(getApplicationContext(),"Good Job!!",Toast.LENGTH_SHORT).show();
        myText.setText("Netflix, Inc. is an American media-services provider and production company headquartered in Los Gatos, California, founded in 1997 by Reed Hastings and Marc Randolph in Scotts Valley, California.");
    }

    public void website3(View view) {
        myView.loadUrl("https://www.apple.com/");
        Toast.makeText(getApplicationContext(),"Good Job!!",Toast.LENGTH_SHORT).show();
        myText.setText("Apple Inc. is an American multinational technology company headquartered in Cupertino, California, that designs, develops, and sells consumer electronics, computer software, and online services. ");
    }
}
