package se.co2p.week;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private String[] weekColours = {"#193996", "#51173A", "#F8970C", "#8B1C62", "#175032", "#d80a3a",
            "#820000", "#001063", "#af0000", "#000000", "#87008c", "#115aad", "#a0ad11", "#00bfaf",
            "#e00000", "#4f4f4f", "#3ca035", "#0e637c", "#ed0273", "#b7247f", "#4924b7", "#1f1882",
            "#188234", "#3d7dcc", "#e89900", "#470719", "#dd7c04", "#6904dd", "#8fbf00", "#00bf3c",
            "#347887", "#270949", "#2f606d", "#382f6d", "#105e1b", "#898989", "#037715", "#77035a",
            "#032077", "#bc185f", "#601b1e", "#1b6034", "#5c9112", "#123f91", "#2e777c", "#567c2e",
            "#3a248c", "#d60c2b", "#550cb5", "#0cb59e", "#9e940b", "#9e190b", "#ff00bf"};
    private TextView textView;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.weeknumber);
        relativeLayout = (RelativeLayout) findViewById(R.id.main_layout);
    }

    private int getWeekNumber() {
        Calendar c = Calendar.getInstance();
        int week = c.get(Calendar.WEEK_OF_YEAR);
        return week;
    }

    @Override
    protected void onResume() {
        super.onResume();
        int week = getWeekNumber();
        try {
            textView.setText(String.valueOf(week));
            relativeLayout.setBackgroundColor(Color.parseColor(weekColours[week - 1]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
