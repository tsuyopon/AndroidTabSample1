package jp.co.yahoo.TestProject;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class ParentActivity extends TabActivity {               // TabActivity���p��(�����͂���́AActivityGroup���p�����Ă���)
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        
		//�摜���\�[�X���g�����߂̏���(/res/drawable�փA�N�Z�X�j
		Resources res = getResources();
		//tabHost�ւ̎Q�Ƃ��擾
		TabHost tabHost =getTabHost();
		//���ꂼ��̃^�u�̐ݒ�Ɏg��
		TabHost.TabSpec spec;
		//���ꂼ��̃C���e���g��n���̂Ɏg��
		Intent intent;
				
		//�C���e���g�̍쐬(FirstActivity���Ăяo���C���e���g)
		intent = new Intent().setClass(this,Child1Activity.class);
		//TabHost.TabSpec��"artists"�Ƃ����^�O���ō쐬
		spec = tabHost.newTabSpec("1stTab");
		//�^�u�Ƀe�L�X�g�ƃA�C�R�����̕\��(�A�C�R���́A�u2.�v�ō쐬�����t�@�C�������w�肷��΂����B�j
	    spec.setIndicator("1stTab",res.getDrawable(R.drawable.ic_launcher));
	    //�^�u�̓��e�ɃC���e���g��o�^
        spec.setContent(intent);
        //�V�����^�u�̍쐬(�ǉ�)
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

	    //�ǂ̃^�u��I����Ԃɂ��邩
	    tabHost.setCurrentTab(1);	
	    
    }
}