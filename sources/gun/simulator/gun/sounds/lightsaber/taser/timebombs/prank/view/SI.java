package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.Key;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogLoadingRewardAdsBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class SI extends AbstractDialogC3851k9 {
    public static final /* synthetic */ int l = 0;
    public final AppCompatActivity b;
    public final String c;
    public final Weapon d;
    public ObjectAnimator e;
    public int f;
    public final Ma0 g;
    public final TY h;
    public C5055xs i;
    public long j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SI(BaseSyncActivity baseSyncActivity, String str, Weapon weapon) {
        super(baseSyncActivity, R.style.FullScreenDimEnabledStyle);
        AbstractC2995aW.q(baseSyncActivity, "mActivity");
        this.b = baseSyncActivity;
        this.c = str;
        this.d = weapon;
        this.g = AbstractC2340Cl.I(new X9(this, 4));
        this.h = new TY(this, 13);
    }

    public static void e(SI si, InterfaceC2714Qw interfaceC2714Qw) {
        si.i = new C5055xs(interfaceC2714Qw, null, null, 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final ViewBinding b() {
        DialogLoadingRewardAdsBinding dialogLoadingRewardAdsBindingInflate = DialogLoadingRewardAdsBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(dialogLoadingRewardAdsBindingInflate, "inflate(...)");
        return dialogLoadingRewardAdsBindingInflate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final void c() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((DialogLoadingRewardAdsBinding) a()).ivLoading, Key.ROTATION, 0.0f, 360.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.start();
        this.e = objectAnimatorOfFloat;
        ((DialogLoadingRewardAdsBinding) a()).btTryAgain.setOnClickListener(new ViewOnClickListenerC3176ca(this, 6));
    }

    public final Handler d() {
        return (Handler) this.g.getValue();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        d().removeCallbacks(this.h);
        super.dismiss();
    }

    public final void f() {
        WZ.b().i(this.b, AbstractC3485g1.d, new RI(this));
        this.j = System.currentTimeMillis();
        d().post(this.h);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        f();
    }
}
