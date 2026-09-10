package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3775jK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4549a;
    public final Throwable b;

    public C3775jK(MJ mj) {
        this.f4549a = mj;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3775jK)) {
            return false;
        }
        C3775jK c3775jK = (C3775jK) obj;
        Object obj2 = this.f4549a;
        if (obj2 != null && obj2.equals(c3775jK.f4549a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || c3775jK.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4549a, this.b});
    }

    public C3775jK(Throwable th) {
        this.b = th;
        this.f4549a = null;
    }
}
