package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3651a;
    public Map b;

    public RE(int i) {
        if (i == 1) {
            this.f3651a = new HashMap();
        } else {
            this.f3651a = new HashMap();
            this.b = new HashMap();
        }
    }

    public final synchronized Map a() {
        try {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.f3651a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
