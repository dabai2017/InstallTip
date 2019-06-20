package com.dabai.installtip;

import android.app.*;
import android.os.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		
		//弹出提示
		new AlertDialog.Builder(this)
		.setTitle("软件介绍")
		.setMessage("会在你安装应用完成之后发出声音提示")
		.setCancelable(false)
			.setPositiveButton("知道了", new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface p1, int p2)
				{		
					finish();
				}	
		})
		.show();

		
		
		//隐藏界面
		setTheme(android.R.style.Theme_NoDisplay);
    }
}
