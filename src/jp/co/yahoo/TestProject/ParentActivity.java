package jp.co.yahoo.TestProject;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class ParentActivity extends TabActivity {               // TabActivityを継承(※実はこれは、ActivityGroupを継承している)
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        
		//画像リソースを使うための準備(/res/drawableへアクセス）
		Resources res = getResources();
		//tabHostへの参照を取得
		TabHost tabHost =getTabHost();
		//それぞれのタブの設定に使う
		TabHost.TabSpec spec;
		//それぞれのインテントを渡すのに使う
		Intent intent;
				
		//インテントの作成(FirstActivityを呼び出すインテント)
		intent = new Intent().setClass(this,Child1Activity.class);
		//TabHost.TabSpecを"artists"というタグ名で作成
		spec = tabHost.newTabSpec("1stTab");
		//タブにテキストとアイコンをの表示(アイコンは、「2.」で作成したファイル名を指定すればいい。）
	    spec.setIndicator("1stTab",res.getDrawable(R.drawable.ic_launcher));
	    //タブの内容にインテントを登録
        spec.setContent(intent);
        //新しくタブの作成(追加)
	    tabHost.addTab(spec);
		
	    intent = new Intent().setClass(this, Child2Activity.class);
	    spec = tabHost.newTabSpec("2ndTab");
	    spec.setIndicator("2ndTab",res.getDrawable(R.drawable.ic_launcher));
	    spec.setContent(intent);
	    tabHost.addTab(spec);
	    
	    intent = new Intent().setClass(this, Child3Activity.class);
	    spec = tabHost.newTabSpec("3rdTab");
	    spec.setIndicator("3rdTab",res.getDrawable(R.drawable.ic_launcher));
	    spec.setContent(intent);
	    tabHost.addTab(spec);

	    //どのタブを選択状態にするか
	    tabHost.setCurrentTab(1);	
	    
    }
}