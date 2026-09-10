package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base;

import android.os.Bundle;
import android.view.View;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4808v4;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseAsyncActivity<VB extends ViewBinding> extends BaseActivity<VB> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2788a = 0;

    public abstract ViewBinding h();

    public abstract int i();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public void initContentView(View view) {
        if (view == null) {
            return;
        }
        setContentView(view);
        setMBinding(h());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new AsyncLayoutInflater(this).inflate(i(), null, new C4808v4(this));
    }
}
