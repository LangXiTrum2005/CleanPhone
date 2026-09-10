package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogC3665i3 extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4486a;
    public final /* synthetic */ C3751j3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogC3665i3(C3751j3 c3751j3, Context context, int i, int i2) {
        super(context, i);
        this.f4486a = i2;
        this.b = c3751j3;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Window window;
        Window window2;
        int i = this.f4486a;
        C3751j3 c3751j3 = this.b;
        switch (i) {
            case 0:
                ((C3927l3) c3751j3.b).getClass();
                X0 x0 = X0.j;
                if (x0.r().l == -1 && (window = getWindow()) != null) {
                    requestWindowFeature(1);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = -1;
                    attributes.height = -1;
                    attributes.gravity = 17;
                    window.setAttributes(attributes);
                    window.setGravity(17);
                    window.getDecorView().setSystemUiVisibility(3334);
                    window.addFlags(-2080374784);
                    if (Build.VERSION.SDK_INT >= 30) {
                        window.setDecorFitsSystemWindows(true);
                    }
                    window.setStatusBarColor(0);
                }
                super.onCreate(bundle);
                ((C3927l3) c3751j3.b).getClass();
                setContentView(x0.r().j);
                setCanceledOnTouchOutside(false);
                setCancelable(false);
                break;
            default:
                ((C3927l3) c3751j3.b).getClass();
                X0 x1 = X0.j;
                if (x1.r().l == -1 && (window2 = getWindow()) != null) {
                    requestWindowFeature(1);
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    attributes2.width = -1;
                    attributes2.height = -1;
                    attributes2.gravity = 17;
                    window2.setAttributes(attributes2);
                    window2.setGravity(17);
                    window2.getDecorView().setSystemUiVisibility(3334);
                    window2.addFlags(-2080374784);
                    if (Build.VERSION.SDK_INT >= 30) {
                        window2.setDecorFitsSystemWindows(true);
                    }
                    window2.setStatusBarColor(0);
                }
                super.onCreate(bundle);
                ((C3927l3) c3751j3.b).getClass();
                setContentView(x1.r().k);
                setCanceledOnTouchOutside(true);
                setCancelable(true);
                break;
        }
    }
}
