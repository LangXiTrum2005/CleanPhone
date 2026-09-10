package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class EG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C5101yR f3017a;
    public static volatile C4661tR b;

    public static C4661tR a(Context context) {
        Context applicationContext = context.getApplicationContext();
        C4661tR c4661tR = b;
        if (c4661tR == null) {
            synchronized (C4661tR.class) {
                try {
                    c4661tR = b;
                    if (c4661tR == null) {
                        c4661tR = new C4661tR(new Md0(applicationContext, 2));
                        b = c4661tR;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c4661tR;
    }
}
