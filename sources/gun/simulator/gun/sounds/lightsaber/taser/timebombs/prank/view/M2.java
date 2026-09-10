package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class M2 {
    public static Jm0 a(Y60 y60, TN tn) {
        if (AbstractC2340Cl.e.b()) {
            return new Jm0(y60, tn);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void b();

    public abstract void c(View view);

    public abstract void d();
}
