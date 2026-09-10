package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CU extends Exception implements InterfaceC2538Kb {
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2923a;
    public final long b;

    static {
        int i = Ug0.f3833a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
        f = Integer.toString(3, 36);
        g = Integer.toString(4, 36);
    }

    public CU(String str, Throwable th, int i, long j) {
        super(str, th);
        this.f2923a = i;
        this.b = j;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(c, this.f2923a);
        bundle.putLong(d, this.b);
        bundle.putString(e, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f, cause.getClass().getName());
            bundle.putString(g, cause.getMessage());
        }
        return bundle;
    }
}
