package com.InterPixel.LiCapSa;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ToggleButton;

import com.InterPixel.LiCapSa.GameMain.Suits;

import java.util.List;


public class GameActivity extends Activity {

    public slotClass[] slot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game);

        init();

        slot = new slotClass[14];

        slot[1].id = findViewById(R.id.slot1).getId();
        slot[2].id = findViewById(R.id.slot2).getId();
        slot[3].id = findViewById(R.id.slot3).getId();
        slot[4].id = findViewById(R.id.slot4).getId();
        slot[5].id = findViewById(R.id.slot5).getId();
        slot[6].id= findViewById(R.id.slot6).getId();
        slot[7].id= findViewById(R.id.slot7).getId();
        slot[8].id= findViewById(R.id.slot8).getId();
        slot[9].id= findViewById(R.id.slot9).getId();
        slot[10].id = findViewById(R.id.slot10).getId();
        slot[11].id = findViewById(R.id.slot11).getId();
        slot[12].id = findViewById(R.id.slot12).getId();
        slot[13].id = findViewById(R.id.slot13).getId();
    }

    void init(){

    }

    private class slotClass {
        public int id;
        public boolean haveCard;
        public Suits suit;
        public byte number;
    }

    public void onSlotClicked(View slot){

        int currentslot = slot.getId();

        if(((ToggleButton) slot).isChecked()) {
            // handle toggle on
            slot.setBackgroundResource(whatCardShouldBeHere(currentslot));
        } else {
            // handle toggle off

        }
    }


    private int whatCardShouldBeHere(int slotNumber){

        switch (slot[slotNumber].suit){
            case Diamonds:
                switch (slot[slotNumber].number){
                    case 1:
                        return R.drawable.ace_of_diamonds;
                    case 2:
                        return R.drawable.two_of_diamonds;
                    case 3:
                        return R.drawable.three_of_diamonds;
                    case 4:
                        return R.drawable.four_of_diamonds;
                    case 5:
                        return R.drawable.five_of_diamonds;
                    case 6:
                        return R.drawable.six_of_diamonds;
                    case 7:
                        return R.drawable.seven_of_diamonds;
                    case 8:
                        return R.drawable.eight_of_diamonds;
                    case 9:
                        return R.drawable.nine_of_diamonds;
                    case 10:
                        return R.drawable.ten_of_diamonds;
                    case 11:
                        return R.drawable.jack_of_diamonds2;
                    case 12:
                        return R.drawable.queen_of_diamonds2;
                    case 13:
                        return R.drawable.king_of_diamonds2;
                }
                break;
            case Clubs:
                switch (slot[slotNumber].number){
                    case 1:
                        return R.drawable.ace_of_clubs;
                    case 2:
                        return R.drawable.two_of_clubs;
                    case 3:
                        return R.drawable.three_of_clubs;
                    case 4:
                        return R.drawable.four_of_clubs;
                    case 5:
                        return R.drawable.five_of_clubs;
                    case 6:
                        return R.drawable.six_of_clubs;
                    case 7:
                        return R.drawable.seven_of_clubs;
                    case 8:
                        return R.drawable.eight_of_clubs;
                    case 9:
                        return R.drawable.nine_of_clubs;
                    case 10:
                        return R.drawable.ten_of_clubs;
                    case 11:
                        return R.drawable.jack_of_clubs2;
                    case 12:
                        return R.drawable.queen_of_clubs2;
                    case 13:
                        return R.drawable.king_of_clubs2;
                }
                break;
            case Hearts:
                switch (slot[slotNumber].number){
                    case 1:
                        return R.drawable.ace_of_hearts;
                    case 2:
                        return R.drawable.two_of_hearts;
                    case 3:
                        return R.drawable.three_of_hearts;
                    case 4:
                        return R.drawable.four_of_hearts;
                    case 5:
                        return R.drawable.five_of_hearts;
                    case 6:
                        return R.drawable.six_of_hearts;
                    case 7:
                        return R.drawable.seven_of_hearts;
                    case 8:
                        return R.drawable.eight_of_hearts;
                    case 9:
                        return R.drawable.nine_of_hearts;
                    case 10:
                        return R.drawable.ten_of_hearts;
                    case 11:
                        return R.drawable.jack_of_hearts2;
                    case 12:
                        return R.drawable.queen_of_hearts2;
                    case 13:
                        return R.drawable.king_of_hearts2;
                }
                break;
            case Spades:
                switch (slot[slotNumber].number){
                    case 1:
                        return R.drawable.ace_of_spades;
                    case 2:
                        return R.drawable.two_of_spades;
                    case 3:
                        return R.drawable.three_of_spades;
                    case 4:
                        return R.drawable.four_of_spades;
                    case 5:
                        return R.drawable.five_of_spades;
                    case 6:
                        return R.drawable.six_of_spades;
                    case 7:
                        return R.drawable.seven_of_spades;
                    case 8:
                        return R.drawable.eight_of_spades;
                    case 9:
                        return R.drawable.niine_of_spades;
                    case 10:
                        return R.drawable.ten_of_spades;
                    case 11:
                        return R.drawable.jack_of_spades2;
                    case 12:
                        return R.drawable.queen_of_spades2;
                    case 13:
                        return R.drawable.king_of_spades2;
                }
                break;
        }
        return R.drawable.red_joker;
    }

    public void assignCard(List<GameMain.Cards> cardsInHand){

    }

}
