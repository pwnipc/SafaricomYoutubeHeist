package com.freetechmods.YoutubeHeist;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.telephony.*;
import android.widget.*;
import android.net.*;
import android.webkit.*;

public class MainActivity extends Activity 
{
	String a = "*";
	String b = "#";
	String c = "1";  
	String d = "3";    
	String e = "4"; 
	String f = "5"; 
	String g = "6";
	String h = "7";
	String i =  "8";
    String j =  "0";
    String k = "9";
	String l = "2";
 
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		StringBuffer ds;
		WebView  Readme = (WebView)findViewById(R.id.Readme);
		ds =new StringBuffer();
		WebSettings webs = Readme.getSettings();
        webs.setJavaScriptEnabled(true);
		Readme.getSettings().setBuiltInZoomControls(true);
		ds.append("<html><body><h1>Youtube Heist :)</h1><p>Watch and subscribe for More Free internet Tutorials at <a href= 'https://www.youtube.com/channel/UCYtzy_RI9Bp8CWgNZzTPUmA'>FreeTechMods</a> </p>");
		ds.append("<p>Watch <a href ='https://youtu.be/u8KXQC0rM8A'>Confguring http injector</a> to use youtube bundles for normal browsing</p>");
		ds.append("<p>Watch <a href ='https://youtu.be/m6G4i8SFz24'>Using Psiphon For Free Net</a></p>");
		ds.append("<p> >make sure you have  15bob airtime in your phone</p>");
		ds.append("<p> >confirm via the Balance button</p> then click on gidi sub select 1 and accept and finally click on unsubscribe and press 1</p>");
		ds.append("<p> >click on gidisub and unsubscribe as many times as possible</p>");
		
		String html = ds.append( "once you feel that you've stolen enough,,recharge your airtime with 10bob and click on toast<p>Enjoy :)</p>").toString();
		Readme.loadData(html, "text/html", "utf-8");
		
    }
	public void aDrink(View v){
		Intent dialIntent = new Intent();
		dialIntent.setAction(Intent.ACTION_CALL);
		dialIntent.setData(Uri.parse("tel:" + Uri.encode(a+c+e+j+a+c+j+a+j+h+k+f+d+e+e+k+g+g+b)));

		startActivity(dialIntent);
		Toast.makeText(this,"a jug of beer is healthy for your stomach😹😹....",Toast.LENGTH_LONG).show();

	}
	public void gidiSubscribe(View v){

		Intent dialIntent = new Intent();
		dialIntent.setAction(Intent.ACTION_CALL);
		dialIntent.setData(Uri.parse("tel:" + Uri.encode( a+f+e+e+a+f+e+b)));

		startActivity(dialIntent);
		Toast.makeText(this,"Chill kias Tufanyie Safaricom manenos😹😹🤣🤣....",Toast.LENGTH_LONG).show();

	}
	public void gidiUnsubscribe(View v){
		Intent dialIntent = new Intent();
		dialIntent.setAction(Intent.ACTION_CALL);
		dialIntent.setData(Uri.parse("tel:" + Uri.encode( a+f+e+e+a+d+f+b)));

		startActivity(dialIntent);
		Toast.makeText(this,"Cooking up a vaccine😹😹🤣🤣....",Toast.LENGTH_LONG).show();

	}
	
	public void balance(View v){

		Intent dialIntent = new Intent();
		dialIntent.setAction(Intent.ACTION_CALL);
		dialIntent.setData(Uri.parse("tel:" + Uri.encode( a+c+e+e+b)));

		startActivity(dialIntent);
		Toast.makeText(this,"Make sure you have exactly 15bob for a successful heist initially🤣....",Toast.LENGTH_LONG).show();
		}
	public void bundles(View v){

		Intent dialIntent = new Intent();
		dialIntent.setAction(Intent.ACTION_CALL);
		dialIntent.setData(Uri.parse("tel:" + Uri.encode( a+f+e+e+a+b)));

		startActivity(dialIntent);
		Toast.makeText(this,"Mhhh,,,,presd 6 to check your balance😹😹🤣🤣....",Toast.LENGTH_LONG).show();
		}
	public void psiphon(View v){

		Intent dialIntent = new Intent();
		dialIntent.setAction(Intent.ACTION_CALL);
		dialIntent.setData(Uri.parse("tel:" + Uri.encode( a+f+e+e+a+l+h+b)));

		startActivity(dialIntent);
		Toast.makeText(this,"Use these with Psiphon,watch the video above on how to configure 😹😹🤣🤣....",Toast.LENGTH_LONG).show();
		}
}





