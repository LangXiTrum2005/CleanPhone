package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogShakeSensitivityBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class Z50 extends AbstractDialogC3851k9 {
    public static final /* synthetic */ int e = 0;
    public final LifecycleOwner b;
    public final WeaponUseActivity c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z50(Context context, WeaponUseActivity weaponUseActivity, WeaponUseActivity weaponUseActivity2) {
        super(context, R.style.FullScreenDimEnabledStyle);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.b = weaponUseActivity;
        this.c = weaponUseActivity2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final ViewBinding b() {
        DialogShakeSensitivityBinding dialogShakeSensitivityBindingInflate = DialogShakeSensitivityBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(dialogShakeSensitivityBindingInflate, "inflate(...)");
        return dialogShakeSensitivityBindingInflate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final void c() {
        LifecycleCoroutineScope lifecycleScope;
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.AlphaAnimStyle);
        }
        this.d = ((DialogShakeSensitivityBinding) a()).ivShakeSensitivitySeekbar.getProgress();
        final int i = 0;
        ((DialogShakeSensitivityBinding) a()).ivCloseDialog.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S50
            public final /* synthetic */ Z50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                Z50 z50 = this.b;
                switch (i2) {
                    case 0:
                        AbstractC2995aW.q(z50, "this$0");
                        Context context = z50.getContext();
                        AbstractC2995aW.p(context, "getContext(...)");
                        C2498In c2498In = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        AbstractC3651ht.b(z50);
                        break;
                    default:
                        AbstractC2995aW.q(z50, "this$0");
                        AbstractC3651ht.b(z50);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((DialogShakeSensitivityBinding) a()).rootBg.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S50
            public final /* synthetic */ Z50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                Z50 z50 = this.b;
                switch (i3) {
                    case 0:
                        AbstractC2995aW.q(z50, "this$0");
                        Context context = z50.getContext();
                        AbstractC2995aW.p(context, "getContext(...)");
                        C2498In c2498In = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        AbstractC3651ht.b(z50);
                        break;
                    default:
                        AbstractC2995aW.q(z50, "this$0");
                        AbstractC3651ht.b(z50);
                        break;
                }
            }
        });
        LifecycleOwner lifecycleOwner = this.b;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            WD.D(lifecycleScope, null, 0, new V50(this, null), 3);
        }
        ((DialogShakeSensitivityBinding) a()).ivShakeSensitivitySeekbar.setOnProgressChangeListener(new Y50(this));
    }
}
