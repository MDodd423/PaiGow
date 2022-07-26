package tech.dodd.paigow;

/*
 * Created by dodd.tech on 7/19/2018.
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import tech.dodd.paigow.databinding.ActivityMainBinding;

public class MainJavaActivity extends AppCompatActivity {
    private Integer numLow = 0;
    ArrayList<Integer> cards;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //activityMainBinding.setHandlers(this);
        cards = new ArrayList<>();
        cards.addAll(Arrays.asList(101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113));

        deal();
    }

    public void assignCardValues(int card, TextView text) {
        switch (card) {
            case 101:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.ace, null), null, null);
                break;
            case 102:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.two, null), null, null);
                break;
            case 103:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.three, null), null, null);
                break;
            case 104:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.four, null), null, null);
                break;
            case 105:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.five, null), null, null);
                break;
            case 106:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.six, null), null, null);
                break;
            case 107:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.seven, null), null, null);
                break;
            case 108:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.eight, null), null, null);
                break;
            case 109:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.nine, null), null, null);
                break;
            case 110:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.ten, null), null, null);
                break;
            case 111:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.jack, null), null, null);
                break;
            case 112:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.queen, null), null, null);
                break;
            case 113:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.king, null), null, null);
                break;
        }
    }

    public void doClick(View v) {
        if (v.getId() == R.id.Card1text) {
            clickHL(activityMainBinding.Card1text);
        } else if (v.getId() == R.id.Card2text) {
            clickHL(activityMainBinding.Card2text);
        } else if (v.getId() == R.id.Card3text) {
            clickHL(activityMainBinding.Card3text);
        }else if (v.getId() == R.id.Card4text) {
            clickHL(activityMainBinding.Card4text);
        }else if (v.getId() == R.id.Card5text) {
            clickHL(activityMainBinding.Card5text);
        }else if (v.getId() == R.id.Card6text) {
            clickHL(activityMainBinding.Card6text);
        }else if (v.getId() == R.id.Card7text) {
            clickHL(activityMainBinding.Card7text);
        }else if (v.getId() == R.id.iSolveButton) {
            solve();
        }else if (v.getId() == R.id.uSolveButton) {
            solve();
        }else if (v.getId() == R.id.NextButton) {
            deal();
        }
    }

    public void clickHL(TextView text) {
        if (text.getText().equals("Low")) {
            text.setText(null);
            numLow = numLow - 1;
        }else if(numLow < 2){
            text.setText(R.string.lowtext);
            numLow = numLow + 1;
        }
    }

    public void deal() {
        numLow = 0;
        Collections.shuffle(cards);
        assignCardValues(cards.get(0), activityMainBinding.Card1text);
        assignCardValues(cards.get(1), activityMainBinding.Card2text);
        assignCardValues(cards.get(2), activityMainBinding.Card3text);
        assignCardValues(cards.get(3), activityMainBinding.Card4text);
        assignCardValues(cards.get(4), activityMainBinding.Card5text);
        assignCardValues(cards.get(5), activityMainBinding.Card6text);
        assignCardValues(cards.get(6), activityMainBinding.Card7text);
        activityMainBinding.Card1text.setText(null);
        activityMainBinding.Card2text.setText(null);
        activityMainBinding.Card3text.setText(null);
        activityMainBinding.Card4text.setText(null);
        activityMainBinding.Card5text.setText(null);
        activityMainBinding.Card6text.setText(null);
        activityMainBinding.Card7text.setText(null);
    }

    public void solve() {    }
}
