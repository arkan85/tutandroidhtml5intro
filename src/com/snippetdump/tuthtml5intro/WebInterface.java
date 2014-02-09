package com.snippetdump.tuthtml5intro;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebInterface {
	
	private Context mContext;
	
	WebInterface(Context inputContext){
		mContext = inputContext;
	}

	@JavascriptInterface
	public void showToast(String toast){
		Toast.makeText(mContext, toast, Toast.LENGTH_LONG).show();
	}
	
}
