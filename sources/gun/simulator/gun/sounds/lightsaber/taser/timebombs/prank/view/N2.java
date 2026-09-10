package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class N2 {
    public static C3203cn0 b(Y60 y60, TN tn) {
        if (AbstractC2845Vx.d.b()) {
            return new C3203cn0(y60, tn);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a(View view, EnumC2584Lw enumC2584Lw);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();

    public abstract void f();
}
