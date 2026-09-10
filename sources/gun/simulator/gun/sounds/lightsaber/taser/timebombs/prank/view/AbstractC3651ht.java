package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Dialog;
import android.view.Window;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3651ht {
    public static final void a(InterfaceC4514rk interfaceC4514rk, InterfaceC3567gx interfaceC3567gx) {
        AbstractC2995aW.q(interfaceC4514rk, "<this>");
        AbstractC3920l c3819jo = new C3819jo(WD.H(interfaceC4514rk, AbstractC4437qp.b), true);
        c3819jo.f0(1, c3819jo, interfaceC3567gx);
    }

    public static final void b(Dialog dialog) {
        if (dialog == null || !dialog.isShowing() || dialog.getWindow() == null) {
            return;
        }
        Window window = dialog.getWindow();
        AbstractC2995aW.n(window);
        if (window.getDecorView().isAttachedToWindow()) {
            try {
                dialog.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final C3678i90 c(InterfaceC4514rk interfaceC4514rk, InterfaceC3567gx interfaceC3567gx) {
        AbstractC2995aW.q(interfaceC4514rk, "<this>");
        return WD.C(interfaceC4514rk, AbstractC4437qp.b, 1, interfaceC3567gx);
    }

    public static final Object d(InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        return WD.X(interfaceC3567gx, TL.f3768a, interfaceC2857Wj);
    }
}
