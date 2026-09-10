package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base;

import android.os.Bundle;
import android.view.View;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseSyncActivity<VB extends ViewBinding> extends BaseActivity<VB> {
    public abstract VB getViewBinding();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public void initContentView(View view) {
        ViewBinding viewBinding = getViewBinding();
        setMBinding(viewBinding);
        setContentView(viewBinding.getRoot());
        initView();
        initData();
        initListener();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initContentView(null);
    }
}
