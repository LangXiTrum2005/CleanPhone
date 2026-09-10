package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.dialog;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseDialogFragment;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogLockHintBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.dialog.LockHintDialog;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4967ws;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ma0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S3;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X9;

/* JADX INFO: loaded from: classes4.dex */
public final class LockHintDialog extends BaseDialogFragment<DialogLockHintBinding> {
    public static final /* synthetic */ int g = 0;
    public AnimatorSet b;
    public boolean d;
    public int c = 120;
    public final Ma0 e = AbstractC2340Cl.I(new X9(this, 5));
    public final TY f = new TY(this, 14);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseDialogFragment
    public final void b() {
        S3.a("unlock_tips_display");
        ((DialogLockHintBinding) a()).tvWeapon.setText("");
        final int i = 0;
        ((DialogLockHintBinding) a()).tvWeapon.setVisibility(0);
        ((DialogLockHintBinding) a()).tvExit.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hJ
            public final /* synthetic */ LockHintDialog b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                LockHintDialog lockHintDialog = this.b;
                switch (i2) {
                    case 0:
                        int i3 = LockHintDialog.g;
                        AbstractC2995aW.q(lockHintDialog, "this$0");
                        S3.b("unlock_tips_click", "no");
                        Context context = lockHintDialog.getContext();
                        if (context != null) {
                            C2498In c2498In = App.n;
                            WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        }
                        break;
                    default:
                        int i4 = LockHintDialog.g;
                        AbstractC2995aW.q(lockHintDialog, "this$0");
                        S3.b("unlock_tips_click", "close");
                        break;
                }
            }
        });
        final int i2 = 1;
        ((DialogLockHintBinding) a()).ivClose.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hJ
            public final /* synthetic */ LockHintDialog b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                LockHintDialog lockHintDialog = this.b;
                switch (i3) {
                    case 0:
                        int i4 = LockHintDialog.g;
                        AbstractC2995aW.q(lockHintDialog, "this$0");
                        S3.b("unlock_tips_click", "no");
                        Context context = lockHintDialog.getContext();
                        if (context != null) {
                            C2498In c2498In = App.n;
                            WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        }
                        break;
                    default:
                        int i5 = LockHintDialog.g;
                        AbstractC2995aW.q(lockHintDialog, "this$0");
                        S3.b("unlock_tips_click", "close");
                        break;
                }
            }
        });
        ((DialogLockHintBinding) a()).lavWeapon.a(new C4967ws(this, 1));
        Handler handlerD = d();
        if (handlerD != null) {
            handlerD.post(this.f);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseDialogFragment
    public final DialogLockHintBinding c(LayoutInflater layoutInflater) {
        AbstractC2995aW.q(layoutInflater, "inflater");
        DialogLockHintBinding dialogLockHintBindingInflate = DialogLockHintBinding.inflate(layoutInflater);
        AbstractC2995aW.p(dialogLockHintBindingInflate, "inflate(...)");
        return dialogLockHintBindingInflate;
    }

    public final Handler d() {
        return (Handler) this.e.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.d = true;
        Handler handlerD = d();
        if (handlerD != null) {
            handlerD.removeCallbacks(this.f);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.d) {
            this.d = false;
            Handler handlerD = d();
            if (handlerD != null) {
                handlerD.post(this.f);
            }
        }
    }
}
