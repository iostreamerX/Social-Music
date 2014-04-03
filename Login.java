package x.anonymous.xbeat;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import com.shephertz.app42.paas.sdk.android.ServiceAPI;
import com.shephertz.app42.paas.sdk.android.user.User;
import com.shephertz.app42.paas.sdk.android.user.UserService;


public class Login extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		Log.e("dhdf","sdfdgfg");
		ActionBar a=getActionBar();
		Drawable d=getResources().getDrawable(R.drawable.actionbar);  
        a.setBackgroundDrawable(d);
        a.setTitle("XLOGIN");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
public void signup(View v)
{
Intent i=new Intent(this,Signup.class);
startActivity(i);
}

public void login(View v)
{

}
}