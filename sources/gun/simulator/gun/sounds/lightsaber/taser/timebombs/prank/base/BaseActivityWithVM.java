package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseActivityWithVM<VB extends ViewBinding, VM extends ViewModel> extends BaseActivity<VB> {
    public abstract Class h();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC2995aW.q(new ViewModelProvider(this).get(h()), "<set-?>");
        super.onCreate(bundle);
    }
}
