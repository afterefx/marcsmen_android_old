package org.marcsmen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import org.marcsmen.chat.ChatActivity;
import org.marcsmen.music.MusicActivity;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    private Button chat;
    private Button music;
    private Button calendar;
    private Button tickets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.tag(MainActivity.class.getSimpleName());
        setContentView(R.layout.activity_main);

        chat = ((Button) findViewById(R.id.chat));
        music = ((Button) findViewById(R.id.music));
        calendar = ((Button) findViewById(R.id.calendar));
        tickets = ((Button) findViewById(R.id.tickets));

        setClickListener(chat, ChatActivity.class);
        setClickListener(music, MusicActivity.class);
        setClickListener(calendar, MusicActivity.class);
        setClickListener(tickets, MusicActivity.class);

    }

    private void setClickListener(View v, final Class c) {

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, c);
                startActivity(i);
            }
        });
    }

}
