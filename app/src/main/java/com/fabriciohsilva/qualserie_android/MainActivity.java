package com.fabriciohsilva.qualserie_android;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.resultado = (ImageView) findViewById(R.id.imgResultado);
        this.mViewHolder.seekbar   = (SeekBar) findViewById(R.id.seekBar);

        this.mViewHolder.seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                if ( progress == 1 )
                    mViewHolder.resultado.setImageResource(R.drawable.pouco);
                else if ( progress ==2 )
                    mViewHolder.resultado.setImageResource(R.drawable.medio);
                else if ( progress == 3 )
                    mViewHolder.resultado.setImageResource(R.drawable.muito);
                else if ( progress == seekBar.getMax() )
                    mViewHolder.resultado.setImageResource(R.drawable.susto);

            }//end public void onProgressChanged

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }//end protected void onCreate(Bundle savedInstanceState)

    private static class ViewHolder {
        ImageView resultado;
        SeekBar   seekbar;
    }//end private static class mviewHolder

}//end public class MainActivity extends Activity
