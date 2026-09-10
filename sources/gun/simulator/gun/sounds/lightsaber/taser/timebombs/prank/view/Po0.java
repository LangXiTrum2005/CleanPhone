package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Po0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f3574a = new ConcurrentHashMap();

    public static synchronized void a(Uo0 uo0) {
        if (Build.VERSION.SDK_INT >= 23) {
            MG mg = (MG) f3574a.remove(uo0.STP());
            if (mg != null) {
                mg.c = true;
            }
            uo0.lk();
            uo0.STP();
        }
    }
}
