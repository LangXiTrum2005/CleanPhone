package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3830jy {
    public static volatile C3830jy b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f4577a;

    public C3830jy(int i) {
        if (i != 1) {
            this.f4577a = new HashSet();
        } else {
            this.f4577a = new LinkedHashSet();
        }
    }

    public final synchronized void a(C3834k00 c3834k00) {
        AbstractC2995aW.q(c3834k00, "route");
        this.f4577a.remove(c3834k00);
    }

    public final Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f4577a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f4577a);
        }
        return setUnmodifiableSet;
    }
}
