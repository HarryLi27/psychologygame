package com.example.yl34.psychologygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {
    private static AtomicInteger score = new AtomicInteger(0);

    private static final String TAG = "weather:MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button start = findViewById(R.id.start);
        final Button blue1 = findViewById(R.id.blue1);
        final Button blue2 = findViewById(R.id.blue2);
        final Button blue3 = findViewById(R.id.blue3);
        final Button blue4 = findViewById(R.id.blue4);
        final Button blue5 = findViewById(R.id.blue5);
        final Button blue6 = findViewById(R.id.blue6);
        final Button blue7 = findViewById(R.id.blue7);
        final Button blue8 = findViewById(R.id.blue8);
        final Button blue9 = findViewById(R.id.blue9);
        final Button blue10 = findViewById(R.id.blue10);
        final Button black1 = findViewById(R.id.black1);
        final Button black2 = findViewById(R.id.black2);
        final Button black3 = findViewById(R.id.black3);
        final Button black4 = findViewById(R.id.black4);
        final Button black5 = findViewById(R.id.black5);
        final Button black6 = findViewById(R.id.black6);
        final Button black7 = findViewById(R.id.black7);
        final Button black8 = findViewById(R.id.black8);
        final Button black9 = findViewById(R.id.black9);
        final Button black10 = findViewById(R.id.black10);
        final Button red1 = findViewById(R.id.red1);
        final Button red2 = findViewById(R.id.red2);
        final Button red3 = findViewById(R.id.red3);
        final Button red4 = findViewById(R.id.red4);
        final Button red5 = findViewById(R.id.red5);
        final Button red6 = findViewById(R.id.red6);
        final Button red7 = findViewById(R.id.red7);
        final Button red8 = findViewById(R.id.red8);
        final Button red9 = findViewById(R.id.red9);
        final Button red10 = findViewById(R.id.red10);
        final Button begin = findViewById(R.id.begin);
        final TextView instruction = findViewById(R.id.Instruction);
        final TextView one = findViewById(R.id.one);
        final TextView two = findViewById(R.id.two);
        final TextView three = findViewById(R.id.three);
        final TextView four = findViewById(R.id.four);
        final TextView five = findViewById(R.id.five);
        final TextView six = findViewById(R.id.six);
        final TextView scorecount = findViewById(R.id.score);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game start");
                start.setVisibility(View.INVISIBLE);
                instruction.setVisibility(View.VISIBLE);
                begin.setVisibility(View.VISIBLE);
            }
        });
        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin");
                begin.setVisibility(View.INVISIBLE);
                blue1.setVisibility(View.VISIBLE);
                black1.setVisibility(View.VISIBLE);
                instruction.setVisibility(View.INVISIBLE);
                red1.setVisibility(View.VISIBLE);
                one.setVisibility(View.VISIBLE);
            }
        });
        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin1");
                blue1.setVisibility(View.INVISIBLE);
                black1.setVisibility(View.INVISIBLE);
                red1.setVisibility(View.INVISIBLE);
                one.setVisibility(View.INVISIBLE);
                blue2.setVisibility(View.VISIBLE);
                black2.setVisibility(View.VISIBLE);
                red2.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
            }
        });
        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                score.incrementAndGet();
                Log.d(TAG, "score");
                blue1.setVisibility(View.INVISIBLE);
                black1.setVisibility(View.INVISIBLE);
                red1.setVisibility(View.INVISIBLE);
                one.setVisibility(View.INVISIBLE);
                blue2.setVisibility(View.VISIBLE);
                black2.setVisibility(View.VISIBLE);
                red2.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
            }
        });
        black1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin1");
                blue1.setVisibility(View.INVISIBLE);
                black1.setVisibility(View.INVISIBLE);
                red1.setVisibility(View.INVISIBLE);
                one.setVisibility(View.INVISIBLE);
                blue2.setVisibility(View.VISIBLE);
                black2.setVisibility(View.VISIBLE);
                red2.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
            }
        });
        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin2");
                blue2.setVisibility(View.INVISIBLE);
                black2.setVisibility(View.INVISIBLE);
                red2.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                blue3.setVisibility(View.VISIBLE);
                black3.setVisibility(View.VISIBLE);
                red3.setVisibility(View.VISIBLE);
                three.setVisibility(View.VISIBLE);
            }
        });
        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin2");
                blue2.setVisibility(View.INVISIBLE);
                black2.setVisibility(View.INVISIBLE);
                red2.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                blue3.setVisibility(View.VISIBLE);
                black3.setVisibility(View.VISIBLE);
                red3.setVisibility(View.VISIBLE);
                three.setVisibility(View.VISIBLE);
            }
        });
        black2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin2");
                score.incrementAndGet();
                blue2.setVisibility(View.INVISIBLE);
                black2.setVisibility(View.INVISIBLE);
                red2.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                blue3.setVisibility(View.VISIBLE);
                black3.setVisibility(View.VISIBLE);
                red3.setVisibility(View.VISIBLE);
                three.setVisibility(View.VISIBLE);
            }
        });
        red3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin3");
                score.incrementAndGet();
                blue3.setVisibility(View.INVISIBLE);
                black3.setVisibility(View.INVISIBLE);
                red3.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                blue4.setVisibility(View.VISIBLE);
                black4.setVisibility(View.VISIBLE);
                red4.setVisibility(View.VISIBLE);
                four.setVisibility(View.VISIBLE);
            }
        });
        blue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin3");
                blue3.setVisibility(View.INVISIBLE);
                black3.setVisibility(View.INVISIBLE);
                red3.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                blue4.setVisibility(View.VISIBLE);
                black4.setVisibility(View.VISIBLE);
                red4.setVisibility(View.VISIBLE);
                four.setVisibility(View.VISIBLE);
            }
        });
        black3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin3");
                blue3.setVisibility(View.INVISIBLE);
                black3.setVisibility(View.INVISIBLE);
                red3.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                blue4.setVisibility(View.VISIBLE);
                black4.setVisibility(View.VISIBLE);
                red4.setVisibility(View.VISIBLE);
                four.setVisibility(View.VISIBLE);
            }
        });
        red4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin4");
                blue4.setVisibility(View.INVISIBLE);
                black4.setVisibility(View.INVISIBLE);
                red4.setVisibility(View.INVISIBLE);
                four.setVisibility(View.INVISIBLE);
                blue5.setVisibility(View.VISIBLE);
                black5.setVisibility(View.VISIBLE);
                red5.setVisibility(View.VISIBLE);
                five.setVisibility(View.VISIBLE);
            }
        });
        blue4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin4");
                blue4.setVisibility(View.INVISIBLE);
                black4.setVisibility(View.INVISIBLE);
                red4.setVisibility(View.INVISIBLE);
                four.setVisibility(View.INVISIBLE);
                blue5.setVisibility(View.VISIBLE);
                black5.setVisibility(View.VISIBLE);
                red5.setVisibility(View.VISIBLE);
                five.setVisibility(View.VISIBLE);
            }
        });
        black4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                score.incrementAndGet();
                Log.d(TAG, "the game begin4");
                blue4.setVisibility(View.INVISIBLE);
                black4.setVisibility(View.INVISIBLE);
                red4.setVisibility(View.INVISIBLE);
                four.setVisibility(View.INVISIBLE);
                blue5.setVisibility(View.VISIBLE);
                black5.setVisibility(View.VISIBLE);
                red5.setVisibility(View.VISIBLE);
                five.setVisibility(View.VISIBLE);
            }
        });
        red5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin5");
                score.incrementAndGet();
                blue5.setVisibility(View.INVISIBLE);
                black5.setVisibility(View.INVISIBLE);
                red5.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                blue6.setVisibility(View.VISIBLE);
                black6.setVisibility(View.VISIBLE);
                red6.setVisibility(View.VISIBLE);
                six.setVisibility(View.VISIBLE);
            }
        });
        blue5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin5");
                blue5.setVisibility(View.INVISIBLE);
                black5.setVisibility(View.INVISIBLE);
                red5.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                blue6.setVisibility(View.VISIBLE);
                black6.setVisibility(View.VISIBLE);
                red6.setVisibility(View.VISIBLE);
                six.setVisibility(View.VISIBLE);
            }
        });
        black5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin5");
                blue5.setVisibility(View.INVISIBLE);
                black5.setVisibility(View.INVISIBLE);
                red5.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                blue6.setVisibility(View.VISIBLE);
                black6.setVisibility(View.VISIBLE);
                red6.setVisibility(View.VISIBLE);
                six.setVisibility(View.VISIBLE);
            }
        });
        red6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin6");
                blue6.setVisibility(View.INVISIBLE);
                black6.setVisibility(View.INVISIBLE);
                red6.setVisibility(View.INVISIBLE);
                six.setVisibility(View.INVISIBLE);
                blue7.setVisibility(View.VISIBLE);
                black7.setVisibility(View.VISIBLE);
                red7.setVisibility(View.VISIBLE);
                three.setVisibility(View.VISIBLE);
            }
        });
        blue6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin6");
                score.incrementAndGet();
                blue6.setVisibility(View.INVISIBLE);
                black6.setVisibility(View.INVISIBLE);
                red6.setVisibility(View.INVISIBLE);
                six.setVisibility(View.INVISIBLE);
                blue7.setVisibility(View.VISIBLE);
                black7.setVisibility(View.VISIBLE);
                red7.setVisibility(View.VISIBLE);
                three.setVisibility(View.VISIBLE);
            }
        });
        black6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin6");
                blue6.setVisibility(View.INVISIBLE);
                black6.setVisibility(View.INVISIBLE);
                red6.setVisibility(View.INVISIBLE);
                six.setVisibility(View.INVISIBLE);
                blue7.setVisibility(View.VISIBLE);
                black7.setVisibility(View.VISIBLE);
                red7.setVisibility(View.VISIBLE);
                three.setVisibility(View.VISIBLE);
            }
        });
        red7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin7");
                score.incrementAndGet();
                blue7.setVisibility(View.INVISIBLE);
                black7.setVisibility(View.INVISIBLE);
                red7.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                blue8.setVisibility(View.VISIBLE);
                black8.setVisibility(View.VISIBLE);
                red8.setVisibility(View.VISIBLE);
                five.setVisibility(View.VISIBLE);
            }
        });
        blue7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin7");
                blue7.setVisibility(View.INVISIBLE);
                black7.setVisibility(View.INVISIBLE);
                red7.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                blue8.setVisibility(View.VISIBLE);
                black8.setVisibility(View.VISIBLE);
                red8.setVisibility(View.VISIBLE);
                five.setVisibility(View.VISIBLE);
            }
        });
        black7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin7");
                blue7.setVisibility(View.INVISIBLE);
                black7.setVisibility(View.INVISIBLE);
                red7.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                blue8.setVisibility(View.VISIBLE);
                black8.setVisibility(View.VISIBLE);
                red8.setVisibility(View.VISIBLE);
                five.setVisibility(View.VISIBLE);
            }
        });
        red8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin8");
                score.incrementAndGet();
                blue8.setVisibility(View.INVISIBLE);
                black8.setVisibility(View.INVISIBLE);
                red8.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                blue9.setVisibility(View.VISIBLE);
                black9.setVisibility(View.VISIBLE);
                red9.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
            }
        });
        blue8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin8");
                blue8.setVisibility(View.INVISIBLE);
                black8.setVisibility(View.INVISIBLE);
                red8.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                blue9.setVisibility(View.VISIBLE);
                black9.setVisibility(View.VISIBLE);
                red9.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
            }
        });
        black8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin8");
                blue8.setVisibility(View.INVISIBLE);
                black8.setVisibility(View.INVISIBLE);
                red8.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                blue9.setVisibility(View.VISIBLE);
                black9.setVisibility(View.VISIBLE);
                red9.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
            }
        });
        black9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin9");
                score.incrementAndGet();
                blue9.setVisibility(View.INVISIBLE);
                black9.setVisibility(View.INVISIBLE);
                red9.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                blue10.setVisibility(View.VISIBLE);
                black10.setVisibility(View.VISIBLE);
                red10.setVisibility(View.VISIBLE);
                one.setVisibility(View.VISIBLE);
            }
        });
        red9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin9");
                blue9.setVisibility(View.INVISIBLE);
                black9.setVisibility(View.INVISIBLE);
                red9.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                blue10.setVisibility(View.VISIBLE);
                black10.setVisibility(View.VISIBLE);
                red10.setVisibility(View.VISIBLE);
                one.setVisibility(View.VISIBLE);
            }
        });
        blue9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin9");
                blue9.setVisibility(View.INVISIBLE);
                black9.setVisibility(View.INVISIBLE);
                red9.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                blue10.setVisibility(View.VISIBLE);
                black10.setVisibility(View.VISIBLE);
                red10.setVisibility(View.VISIBLE);
                one.setVisibility(View.VISIBLE);
                String scorestring = "your score" + score.get();
                scorecount.setText(scorestring);
            }
        });
        blue10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin10");
                score.incrementAndGet();
                blue10.setVisibility(View.INVISIBLE);
                black10.setVisibility(View.INVISIBLE);
                red10.setVisibility(View.INVISIBLE);
                one.setVisibility(View.INVISIBLE);
                scorecount.setVisibility(View.VISIBLE);
                String scorestring = "your score" + score.get();
                scorecount.setText(scorestring);
            }
        });
        red10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin10");
                blue10.setVisibility(View.INVISIBLE);
                black10.setVisibility(View.INVISIBLE);
                red10.setVisibility(View.INVISIBLE);
                one.setVisibility(View.INVISIBLE);
                scorecount.setVisibility(View.VISIBLE);
            }
        });
        black10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "the game begin10" + score.get());
                blue10.setVisibility(View.INVISIBLE);
                black10.setVisibility(View.INVISIBLE);
                red10.setVisibility(View.INVISIBLE);
                one.setVisibility(View.INVISIBLE);
                scorecount.setVisibility(View.VISIBLE);
                String scorestring = "Your score" + score.get();
                scorecount.setText(scorestring);
            }
        });

    }
}
