package x.anonymous.xbeat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ProgressBar;

@SuppressWarnings("deprecation")
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ProgressBar p= (ProgressBar)findViewById(R.id.pro);
        final Intent i= new Intent(this,Login.class);
        new Thread()
        {
        	@Override
        	public void run()
        	{
        		for(int i=0;i<=300;i++)
        		{
        			p.setProgress(i);
        			try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        		}
        		startActivity(i);
        		finish();
        	}
        }.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
