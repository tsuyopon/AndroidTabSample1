package jp.co.yahoo.TestProject;

import android.app.Activity;
import android.os.Bundle;

public class Child1Activity extends Activity {             // ActivityGroupを継承しています。
    
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.child1);
        
    }
}