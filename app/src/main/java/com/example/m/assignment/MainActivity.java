package com.example.m.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox kg2pound,dollar2tk,foot2cm,far2cel,deg2rad,atm2hg;
    EditText numInput,result,resultFar,resultFoot,resultDollar,resultRad,resultatm;
    Button convert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kg2pound= (CheckBox) findViewById(R.id.kg2pound);
        dollar2tk=(CheckBox) findViewById(R.id.dollar2tk);
        foot2cm= (CheckBox) findViewById(R.id.foot2cm);
        far2cel=(CheckBox) findViewById(R.id.far2cel);
        deg2rad=(CheckBox) findViewById(R.id.deg2rad);
        atm2hg=(CheckBox) findViewById(R.id.atm2hg);
        numInput= (EditText) findViewById(R.id.numInput);
        convert= (Button) findViewById(R.id.convert);
        result= (EditText) findViewById(R.id.result);
        resultFar=(EditText) findViewById(R.id.resultFar);
        resultFoot=(EditText) findViewById(R.id.resultFoot);
        resultDollar=(EditText) findViewById(R.id.resultDollar);
        resultRad=(EditText) findViewById(R.id.resultRad);
        resultatm=(EditText)findViewById(R.id.resultatm);
    }

    public  void  convert_m(View v){

           double num= Double.parseDouble(numInput.getText().toString());

             if (numInput.getText()== null) {
                 Toast.makeText(this, "ENTER THE VALUE", Toast.LENGTH_SHORT).show();

             }
           if (!kg2pound.isChecked() && !dollar2tk.isChecked() && !foot2cm.isChecked() && !far2cel.isChecked() && !deg2rad.isChecked() && !atm2hg.isChecked()) {
                 Toast.makeText(this, "PLEASE CHECK AN OPTION", Toast.LENGTH_SHORT).show();

             }
             else {


                 if (kg2pound.isChecked()) {
                     double kg = k2p(num);
                     result.setText(new Double(kg).toString());
                 }
                 if (dollar2tk.isChecked()) {
                     double dollar = d2t(num);
                     resultDollar.setText(new Double(dollar).toString());
                 }
                 if (foot2cm.isChecked()) {
                     double ft = ft2cm(num);
                     resultFoot.setText(new Double(ft).toString());
                 }
                 if (far2cel.isChecked()) {
                     double far = f2c(num);
                     resultFar.setText(new Double(far).toString());
                 }
                 if (deg2rad.isChecked()) {
                     double rad = d2r(num);
                     resultRad.setText(new Double(rad).toString());
                 }
                 if(atm2hg.isChecked()){
                     double atm=a2hg(num);
                     resultatm.setText(new Double(atm).toString());

                 }
                 if(!deg2rad.isChecked()){
                     resultRad.setText(null);
                 }
                 if(!kg2pound.isChecked()){
                     result.setText(null);
                 }
                 if(!dollar2tk.isChecked()){
                     resultDollar.setText(null);
                 }
                 if(!foot2cm.isChecked()){
                     resultFoot.setText(null);
                 }
                 if(!far2cel.isChecked()){
                     resultFar.setText(null);
                 }
                 if(!atm2hg.isChecked()){
                     resultatm.setText(null);
                 }

             }


    }
    public double f2c(double d){
       // return d;
      return  ((d-32.0)*(5.00/9.00));
    }
    public  double d2t(double d){
        return  (d*83.46);
       //return d;
    }
    public double k2p(double d){
        return (d*2.20462);

    }
    public double ft2cm(double d){
        return (d*30.48);
       // return d;
    }
    public double d2r(double d){
        return (d*0.01745);
       // return d;
    }

    public double a2hg(double d){
        return (d*760.1);
    }
}
