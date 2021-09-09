package com.example.arduinolock;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
TextView tname1;
TextView tname2;
TextView tname3;
String user="Admin";
String pass="123456789";
Button b1,b5;
TextView tname4;



    String fname;
    String pass1;
    String pass3="";
    String cap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tname1 = (EditText) findViewById(R.id.t1);
        tname2 = (EditText) findViewById(R.id.t2);
        tname4 = (EditText) findViewById(R.id.t4);

        tname3 = (TextView) findViewById(R.id.t3);
b5=findViewById(R.id.b5);
        b1 = findViewById(R.id.button);
        fname = tname1.getText().toString();
        pass1 = tname2.getText().toString();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fname= tname1.getText().toString();
                pass1= tname2.getText().toString();
                cap=tname4.getText().toString();


                if((user.equals(fname)) && (pass.equals(pass1)) &&( cap.equals(pass3)) )
                {
                    Toast.makeText(MainActivity.this,"Authoried",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(MainActivity.this,"UnAuthorised",Toast.LENGTH_LONG).show();
                    tname1.setText("");
                    tname2.setText("");
                    tname3.setText("");
                    tname4.setText(null);

;
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                String s1,s2,s3,s4,s5,s6,s7,s8,s9,s0;
                s1="yftWD!4ciH$hV*&p%d&5E%1z9g9ymza3tMblFgAr368iOgk!JZgNWbc$K4of1Iw9@#GrWS?uXkz&!CB%qE51cld2S?zn@VW4Qe!u";
                s2="?IGwS4Szc@p05lh0w@KYXoZCmwtRxXRsTT18@K^vv9Ocmv8CN@U9W2RUQJPKGIOpdAjXm%KqXXVty@tr!tgRFKQ9dNZB$HLdt2ho";
                s3="n@FN7y$JBBJcA29NmXkNoCIIAR2HaexFVMZVUzhtJexJ21Lln5^Y6al%$$EjSqZccPiN9MU5k!&Ud**9hvaw2dJA3V&5o3IGn4^H";
                s4="kw1XoXq4dn%b8MrnZVPNu8FThzPMFTSza@jI9bY6ruCxLjVHmeg4esf3RuP%7rEQ3nQJlZ%RxO!J43S3t*xOvstCfVO9GQJSutju";
                s5="GsglUTvXhZKkCb!h0le8%zqC$R1nqQFYnZcxn1ad02XdzxUOPhH6pB3GRMlUHCtFi%2*cKID!om@l#0e%N*Zpf@r3B!v#Bo1T%q3";
                s6="B*xX^u@H!u9QERT?W6K?jBc!PETm*QukyNgb%FMT4zC5$35540%o2@8j^uHnNh@ugsWXN$O6@tN62@ks?o*qBTbYakG%@76DF2Hm";
                s7="#U$oTPp%r$tB5QeYje@Bqfp?914%Hj*@Ajhd@ObHtWZUXuz@FTUpLCFjibRRBayLbC#K8WyfWpc^%17GN&I6niUzr6QJZPYCz^BO";
                s8="jQM5yZjw08ilfPui2$vN9UaPROkI@!n#0MzDxhOZ@1O*5dtQHcgR$Rw8Ugx?ZrOwP1HrA4BTYwNiXZ#i02YK$z0klgehfpF5%lsL";
                s9="tyKVKje1i?mUmv3BThtrBgf&JOMQddbtT?T5G$kK#&NTS22w67G$q%zlPq^mn^aNyZvC&3CV5gbmKcWH9hxUxNnZ6%Y4EtoDbcLa";
                s0="wsschwLW1!roAsXnwf^iYAllBl?5yHl3vB^ukZ*#@b9r$Y5OVdVstbMc3?ojf@Zk#SsKuWneR#$9WwMcAlQj!kderN?IlE$hecak";
                String s[]= {s0,s1,s3,s4,s5,s6,s7,s8,s9,s2};

                while(pass3.length()<7)
                {
                    String m =String.valueOf(Math.random());
                    String n =String.valueOf(m.charAt(2));
                    int nn=Integer.parseInt(n);
                    m=m.substring(4, 6);
                    int mm = Integer.parseInt(m);
                    pass3+=s[nn].charAt(mm);
                    tname4.setText(pass);


                }

            }
        });
    }




public void clearr(View view)
    {



    }

}
