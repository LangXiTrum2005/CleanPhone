package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class DP {
    public static final ArrayDeque d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2969a;
    public int b;
    public Object c;

    static {
        char[] cArr = Tg0.f3783a;
        d = new ArrayDeque(0);
    }

    public static DP a(Object obj) {
        DP dp;
        ArrayDeque arrayDeque = d;
        synchronized (arrayDeque) {
            dp = (DP) arrayDeque.poll();
        }
        if (dp == null) {
            dp = new DP();
        }
        dp.c = obj;
        dp.b = 0;
        dp.f2969a = 0;
        return dp;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DP)) {
            return false;
        }
        DP dp = (DP) obj;
        return this.b == dp.b && this.f2969a == dp.f2969a && this.c.equals(dp.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f2969a * 31) + this.b) * 31);
    }
}
