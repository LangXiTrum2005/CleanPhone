package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivitySplashBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2498In;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D80;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3766jB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class SplashActivity extends BaseSyncActivity<ActivitySplashBinding> implements InterfaceC3766jB {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public QL f2780a;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity
    public final ViewBinding getViewBinding() {
        ActivitySplashBinding activitySplashBindingInflate = ActivitySplashBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(activitySplashBindingInflate, "inflate(...)");
        return activitySplashBindingInflate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public final void initView() {
        App.q = false;
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new B8(this, null), 2);
        View decorView = getWindow().getDecorView();
        AbstractC2995aW.p(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(4866);
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), null, 0, new D80(this, null), 3);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.f2780a = null;
        ((ActivitySplashBinding) getMBinding()).conNativeAdPlacement.removeAllViews();
        VQ.a().j(((ActivitySplashBinding) getMBinding()).conNativeAdPlacement);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        VQ.a().b(((ActivitySplashBinding) getMBinding()).conNativeAdPlacement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        VQ.a().c(((ActivitySplashBinding) getMBinding()).conNativeAdPlacement);
    }
}
