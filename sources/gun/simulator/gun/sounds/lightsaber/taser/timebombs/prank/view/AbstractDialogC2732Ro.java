package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC2732Ro extends Dialog implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MDRootLayout f3681a;
    public DialogInterface.OnShowListener b;

    public final void a() {
        super.setOnShowListener(this);
    }

    public final void b(MDRootLayout mDRootLayout) {
        super.setContentView(mDRootLayout);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return this.f3681a.findViewById(i);
    }

    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.b;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.b = onShowListener;
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}
