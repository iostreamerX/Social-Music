package x.anonymous.xbeat;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.shephertz.app42.paas.sdk.android.ServiceAPI;
import com.shephertz.app42.paas.sdk.android.storage.Storage;
import com.shephertz.app42.paas.sdk.android.storage.StorageService;


public class Signup extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);
		Log.d("dhdf","sdfdgfg");
		ActionBar a=getActionBar();
		Drawable d=getResources().getDrawable(R.drawable.actionbar);  
        a.setBackgroundDrawable(d);
        a.setTitle("XSIGNUP");   
    }
	public class sup extends AsyncTask<Void,Void,String>
	{

		@Override
		protected String doInBackground(Void... arg0) {
	
			EditText username=(EditText)findViewById(R.id.un);
		    String uname = username.getText().toString();
		    EditText email=(EditText)findViewById(R.id.em);
			EditText password=(EditText)findViewById(R.id.pw);
			String mail = email.getText().toString();
			String pass = password.getText().toString();
			String dbName = "test";    
			String collectionName = "foo";    
			String json = "{\"USERNAME\":"+uname+","+"\"EMAIL\":"+mail+","+"\"PASSWORD\":"+pass+"}";      
			ServiceAPI api = new ServiceAPI("df26c17d08cc54818b3c9e365188d57bf87bde4a615978c3a4ee30e76eadebd4","81b7662328e18e0d47f5257f298db2e70516c125af1da45bb9596810ec8e8a24");  
			StorageService storageService = api.buildStorageService();     
			Storage storage = storageService.insertJSONDocument(dbName,collectionName,json);   
			String jsonResponse = storage.toString();  
			Log.d("json",jsonResponse);
			return jsonResponse;
		}
		
	@Override
	protected void onPostExecute(String res)
	{
		 TextView t=(TextView)findViewById(R.id.result);
		 t.setText(res);
	}
	}
	public void signupi(View v)
	{   
	 sup bitch= new sup();
	 bitch.execute();
	}
}

