package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3743iz {
    public static final boolean e;
    public static final boolean f;
    public static final File g;
    public static volatile C3743iz h;
    public int b;
    public boolean c = true;
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4528a = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        e = i < 29;
        f = i >= 28;
        g = new File("/proc/self/fd");
    }

    public static C3743iz a() {
        if (h == null) {
            synchronized (C3743iz.class) {
                try {
                    if (h == null) {
                        h = new C3743iz();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f4528a;
    }

    public final boolean c(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (!z || !f) {
            return false;
        }
        if ((e && !this.d.get()) || z2 || i < 0 || i2 < 0) {
            return false;
        }
        synchronized (this) {
            try {
                int i3 = this.b + 1;
                this.b = i3;
                if (i3 >= 50) {
                    this.b = 0;
                    this.c = ((long) g.list().length) < ((long) b());
                }
                z3 = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }
}
