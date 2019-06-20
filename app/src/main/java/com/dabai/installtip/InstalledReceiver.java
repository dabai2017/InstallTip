package com.dabai.installtip;
import android.content.*;
import android.widget.*;

public class InstalledReceiver extends BroadcastReceiver 
{

	@Override
	public void onReceive(Context p1, Intent p2)
	{
		p1.startService(new Intent(p1,RingtoneService.class));
		//Toast.makeText(p1,"安装完成",1).show();
	}	
}
