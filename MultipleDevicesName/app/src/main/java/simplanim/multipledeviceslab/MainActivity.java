package simplanim.multipledeviceslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;
    Button mButton;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.click_me_button);
        mButton.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.want_to_know);
        mImageView = (ImageView) findViewById(R.id.image);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.click_me_button:

                mTextView.setText(R.string.answer);

                TextView textView = new TextView(this);

                mImageView.setImageResource(R.drawable.ic_insert_emoticon_black_24dp);
        }
    }
}

