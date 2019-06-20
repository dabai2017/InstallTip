package com.dabai.installtip;
import android.content.*;
import android.widget.*;

public class BootReceiver extends BroadcastReceiver 
{

	@Override
	public void onReceive(Context p1, Intent p2)
	{

		Toast.makeText(p1, "安装完成提示 - 已自启动", Toast.LENGTH_LONG).show();

	}

	
}

