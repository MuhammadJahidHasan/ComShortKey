package com.jahid_hasan.positve.comkeyshort;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.R.attr.onClick;

public class FirstActivity extends AppCompatActivity  {

    ListView listView;

    private String[] keyItemName= {
            "Windows Basic",
            "Microsoft Word",
            "MS Excel",
            "Powerpoint",
            "Adobe Photoshop",
            "Illustrator",
            "Linux Command",
            "Chrome",
            "Facebook",
            "Notepad++"
    };

    private int[] keyItemImage = {
            R.drawable.item1,
            R.drawable.item2,
            R.drawable.item3,
            R.drawable.item4,
            R.drawable.item5,
            R.drawable.item6,
            R.drawable.item8,
            R.drawable.item7,
            R.drawable.item9,
            R.drawable.item10
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        listView = (ListView) findViewById(R.id.keyitemlistView);

        AdapterForByCycle adapterForByCycle = new AdapterForByCycle(this, keyItemName,  keyItemImage);
        listView.setAdapter(adapterForByCycle);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0){

                    Intent a=new Intent(getApplicationContext(),WindowsBasic.class);

                    startActivity(a);
               }

                else if(i==1){

                    Intent b=new Intent(FirstActivity.this,MsWord.class);

                    startActivity(b);
                }
                else if(i==2){

                    Intent c=new Intent(FirstActivity.this,MsExcel.class);

                    startActivity(c);
                }
                else if(i==3){

                    Intent d=new Intent(FirstActivity.this,Powerpoint.class);

                    startActivity(d);
                }
                else if(i==4){

                    Intent e=new Intent(FirstActivity.this,Photoshop.class);

                    startActivity(e);
                }
                else if(i==5){

                    Intent f=new Intent(FirstActivity.this,Illustrator.class);

                    startActivity(f);
                }
                else if(i==6){

                    Intent g=new Intent(FirstActivity.this,Linux.class);

                    startActivity(g);
                }
                else if(i==7){

                    Intent h=new Intent(FirstActivity.this,Chrome.class);

                    startActivity(h);
                }
                else if(i==8){

                    Intent m=new Intent(FirstActivity.this,Facebook.class);

                    startActivity(m);
                }
                else if(i==9){

                    Intent j=new Intent(FirstActivity.this,Notepad.class);

                    startActivity(j);
                }
            }
        });


    }
}


class AdapterForByCycle extends ArrayAdapter<String> {

    private Context c;
    private LayoutInflater inflater;
    private String[] keyItemName;
    private int[] keyItemImage;

    public AdapterForByCycle(Context context, String[] keyItemName, int[] keyItemImage) {
        super(context, R.layout.row_model_key, keyItemName);
        this.c = context;
        this.keyItemName = keyItemName;
        this.keyItemImage = keyItemImage;
    }

    // 'ViewHolder' class
    public class ViewHolder {
        TextView textView_keyItemName;
        ImageView imageView_keyItemImage;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_model_key, null);
        }

        // 'holder' object of 'ViewHolder' class
        ViewHolder holder = new ViewHolder();

        // initialize 'holder' object
        holder.textView_keyItemName = (TextView) convertView.findViewById(R.id.keyitem_name);
        holder.imageView_keyItemImage = (ImageView) convertView.findViewById(R.id.keyitem_image);

        // assigning data to the 'holder' object
        holder.textView_keyItemName.setText(keyItemName[position]);
        holder.imageView_keyItemImage.setImageResource(keyItemImage[position]);

        return convertView;
    }

}