package com.dabai.installtip;
import android.app.*;
import android.os.*;
import android.content.*;
import android.media.*;

public class RingtoneService extends Service
{

	@Override
	public IBinder onBind(Intent p1)
	{
		// TODO: Implement this method
		return null;
	}

	MediaPlayer mediaPlayer;

	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		
		/**
		 * 打开raw目录下的音乐mp3文件
		 */
	 	
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tip);
        //用prepare方法，会报错误java.lang.IllegalStateExceptio
        //mediaPlayer.prepare();
        mediaPlayer.start();

		return super.onStartCommand(intent, flags, startId);

	}

}
