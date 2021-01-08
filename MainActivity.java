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

public class MainActivity extends AppCompatActivity {
    private Integer numLow = 0;
    ArrayList<Integer> cards;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        cards = new ArrayList<>();
        cards.addAll(Arrays.asList(101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113));

        DEALIT();
    }

    public void assigncardvalues(int card, TextView text) {
        switch (card) {
            case 101:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.ace3, null), null, null);
                break;
            case 102:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.two3, null), null, null);
                break;
            case 103:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.three3, null), null, null);
                break;
            case 104:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.four3, null), null, null);
                break;
            case 105:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.five3, null), null, null);
                break;
            case 106:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.six3, null), null, null);
                break;
            case 107:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.seven3, null), null, null);
                break;
            case 108:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.eight3, null), null, null);
                break;
            case 109:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.nine3, null), null, null);
                break;
            case 110:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.ten3, null), null, null);
                break;
            case 111:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.jack3, null), null, null);
                break;
            case 112:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.queen3, null), null, null);
                break;
            case 113:
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(getResources(), R.drawable.king3, null), null, null);
                break;
        }
    }

    public void CardHLClick(View v) {
        int id = v.getId();
        if (id == R.id.Card1text) {
            ClickHL(activityMainBinding.Card1text);
        } else if (id == R.id.Card2text) {
            ClickHL(activityMainBinding.Card2text);
        } else if (id == R.id.Card3text) {
            ClickHL(activityMainBinding.Card3text);
        }else if (id == R.id.Card4text) {
            ClickHL(activityMainBinding.Card4text);
        }else if (id == R.id.Card5text) {
            ClickHL(activityMainBinding.Card5text);
        }else if (id == R.id.Card6text) {
            ClickHL(activityMainBinding.Card6text);
        }else if (id == R.id.Card7text) {
            ClickHL(activityMainBinding.Card7text);
        }
    }

    public void ClickHL(TextView text) {
        if (text.getText().equals("Low")) {
            text.setText(null);
            numLow = numLow - 1;
        }else if(numLow < 2){
            text.setText(R.string.lowtext);
            numLow = numLow + 1;
        }
    }

    public void DEALIT() {
        numLow = 0;
        Collections.shuffle(cards);
        assigncardvalues(cards.get(0), activityMainBinding.Card1text);
        assigncardvalues(cards.get(1), activityMainBinding.Card2text);
        assigncardvalues(cards.get(2), activityMainBinding.Card3text);
        assigncardvalues(cards.get(3), activityMainBinding.Card4text);
        assigncardvalues(cards.get(4), activityMainBinding.Card5text);
        assigncardvalues(cards.get(5), activityMainBinding.Card6text);
        assigncardvalues(cards.get(6), activityMainBinding.Card7text);
        activityMainBinding.Card1text.setText(null);
        activityMainBinding.Card2text.setText(null);
        activityMainBinding.Card3text.setText(null);
        activityMainBinding.Card4text.setText(null);
        activityMainBinding.Card5text.setText(null);
        activityMainBinding.Card6text.setText(null);
        activityMainBinding.Card7text.setText(null);
    }

    public void Draw(View v) {
        DEALIT();
    }

    public void Solve(View v) {

    }
}