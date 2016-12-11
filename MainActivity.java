package wovilon.buttonhello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private Button mCrowsCounterButton;
    private int mCount=0;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton=(Button)findViewById(R.id.btCrowsCounter);
        mInfoTextView=(TextView) findViewById(R.id.textView2);


        mCrowsCounterButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mCount++;
                mInfoTextView.setText("Я насчитал "+mCount+" ворон.");
            }

        });
    }

    public void onClick(View view) {
        TextView HelloTextView=(TextView)findViewById(R.id.textView);
        HelloTextView.setText("HelloKitty!");
    }
}
