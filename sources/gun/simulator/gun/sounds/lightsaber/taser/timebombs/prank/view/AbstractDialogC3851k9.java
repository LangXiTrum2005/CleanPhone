package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractDialogC3851k9 extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewBinding f4590a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialogC3851k9(MainActivity mainActivity, int i) {
        super(mainActivity, i);
        AbstractC2995aW.q(mainActivity, com.umeng.analytics.pro.f.X);
    }

    public final ViewBinding a() {
        ViewBinding viewBinding = this.f4590a;
        if (viewBinding != null) {
            return viewBinding;
        }
        AbstractC2995aW.x0("mBinding");
        throw null;
    }

    public abstract ViewBinding b();

    public abstract void c();

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 17;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setGravity(17);
            window.setBackgroundDrawableResource(R.color.transparent);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 4610);
            window.addFlags(201326848);
        }
        super.onCreate(bundle);
        ViewBinding viewBindingB = b();
        this.f4590a = viewBindingB;
        setContentView(viewBindingB.getRoot());
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        c();
    }
}
