package com.example.cal;

import android.app.Activity;


import android.app.AlertDialog;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Cal extends Activity implements OnClickListener {
	
	private EditText input1;
	private EditText input2;
	private EditText solution;
	private TextView operator;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    input1 = (EditText) findViewById(R.id.input1);
    input2=(EditText) findViewById(R.id.input2);
    solution=(EditText)findViewById(R.id.solution);
    operator =(TextView) findViewById(R.id.operator);
    
    Button addButton=(Button) findViewById(R.id.addButton);
    addButton.setOnClickListener(this);
    Button subButton=(Button) findViewById(R.id.subButton);
    subButton.setOnClickListener(this);
    Button divButton=(Button) findViewById(R.id.divButton);
    divButton.setOnClickListener(this);
    Button mulButton=(Button) findViewById(R.id.mulButton);
    mulButton.setOnClickListener(this);
    Button equalsButton=(Button) findViewById(R.id.equalsButton);
    equalsButton.setOnClickListener(this);
    }
   
    public void onClick(View v)
    {
    	switch (v.getId())
    	{
    	case R.id.addButton:
    		operator.setText("+");
    		break;

    	case R.id.subButton:
    		operator.setText("-");
    		break;
    	case R.id.divButton:
    		 operator.setText("/");
    		 break;
    	case R.id.mulButton:
    		operator.setText("*");
    		break;
    	case R.id.equalsButton:
    		if (operator.getText().equals("+")) {

    			double result = new Double(input1.getText().toString())+ new Double(input2.getText().toString());

    			solution.setText(Double.toString(result));
    		}
    		else if(operator.getText().equals("-"))
    		{
    			double result = new Double(input1.getText().toString())- new Double(input2.getText().toString());

    			solution.setText(Double.toString(result));	
    		}
    		else if(operator.getText().equals("/"))
    		{
    			double result = new Double(input1.getText().toString())/ new Double(input2.getText().toString());

    			solution.setText(Double.toString(result));	
    		}
    		else if(operator.getText().equals("*"))
    		{
    			double result = new Double(input1.getText().toString())* new Double(input2.getText().toString());

    			solution.setText(Double.toString(result));	
    		}
    	     break;	
    		}

    			
    	
    	}
    	
    
    
}
