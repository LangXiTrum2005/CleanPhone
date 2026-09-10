package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogLikelyBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogC4476rI extends AbstractDialogC3851k9 {
    public final Activity b;
    public final LifecycleOwner c;
    public final Ma0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4476rI(BaseSyncActivity baseSyncActivity, BaseSyncActivity baseSyncActivity2, BaseSyncActivity baseSyncActivity3) {
        super(baseSyncActivity, R.style.SoundPlaySettingBottomSheetDialog);
        AbstractC2995aW.q(baseSyncActivity, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(baseSyncActivity2, "mActivity");
        this.b = baseSyncActivity2;
        this.c = baseSyncActivity3;
        this.d = AbstractC2340Cl.I(new C4691tk0(1, baseSyncActivity, this));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final ViewBinding b() {
        DialogLikelyBinding dialogLikelyBindingInflate = DialogLikelyBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(dialogLikelyBindingInflate, "inflate(...)");
        return dialogLikelyBindingInflate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final void c() {
        DialogLikelyBinding dialogLikelyBinding = (DialogLikelyBinding) a();
        TextView textView = dialogLikelyBinding.tvNotReally;
        AbstractC2995aW.p(textView, "tvNotReally");
        Oh0.a(textView, new C4389qI(this, 0));
        TextView textView2 = dialogLikelyBinding.tvLike;
        AbstractC2995aW.p(textView2, "tvLike");
        Oh0.a(textView2, new C4389qI(this, 1));
        ConstraintLayout constraintLayout = dialogLikelyBinding.rootBg;
        AbstractC2995aW.p(constraintLayout, "rootBg");
        Oh0.a(constraintLayout, new C4389qI(this, 2));
    }
}
