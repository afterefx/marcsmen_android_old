package org.marcsmen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    private Button chat;
    private Button music;
    private Button calendar;
    private Button tickets;
    private View.OnClickListener clickListener;
    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.tag(MainActivity.class.getSimpleName());
        setContentView(R.layout.activity_main);
        chat = ((Button) findViewById(R.id.chat));
        music = ((Button) findViewById(R.id.music));
        calendar = ((Button) findViewById(R.id.calendar));
        tickets = ((Button) findViewById(R.id.tickets));

        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v instanceof Button) {
                    Button b = ((Button) v);
                    Timber.i("clicked on the " + b.getText().toString() + " button");
                }
            }
        };

        chat.setOnClickListener(onClickListener);
        music.setOnClickListener(onClickListener);
        calendar.setOnClickListener(onClickListener);
        tickets.setOnClickListener(onClickListener);


    }

}
