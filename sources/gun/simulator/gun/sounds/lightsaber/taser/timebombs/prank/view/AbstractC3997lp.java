package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3997lp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4669a = 262144000;
    public final C3692iN b;

    public AbstractC3997lp(C3692iN c3692iN) {
        this.b = c3692iN;
    }

    public final C3647hp a() {
        C3692iN c3692iN = this.b;
        File cacheDir = ((Context) c3692iN.b).getCacheDir();
        if (cacheDir == null) {
            cacheDir = null;
        } else if (((String) c3692iN.c) != null) {
            cacheDir = new File(cacheDir, (String) c3692iN.c);
        }
        if (cacheDir == null) {
            return null;
        }
        if (!cacheDir.isDirectory() && !cacheDir.mkdirs()) {
            return null;
        }
        C3647hp c3647hp = new C3647hp();
        c3647hp.e = new C3692iN(9);
        c3647hp.d = cacheDir;
        c3647hp.f4473a = this.f4669a;
        c3647hp.c = new M20();
        return c3647hp;
    }
}
