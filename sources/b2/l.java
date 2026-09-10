package b2;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.Locale;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5320d;

    public l(n.j jVar) {
        k5.g gVar = new k5.g(jVar, "flutter/lifecycle", xi.w.f53833b, (Object) null);
        this.f5317a = 0;
        this.f5318b = 0;
        this.f5319c = true;
        this.f5320d = gVar;
    }

    public static int b(int i10, int i11) {
        int iMin;
        int i12 = i10 - i11;
        if (Math.abs(i12) <= 1000 || (iMin = (Math.min(i10, i11) - Math.max(i10, i11)) + Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 1000) {
            return i12;
        }
        return i10 < i11 ? iMin : -iMin;
    }

    public synchronized void a(k kVar) {
        this.f5317a = kVar.f5311a.f5296c;
        ((TreeSet) this.f5320d).add(kVar);
    }

    public synchronized i c(long j10) {
        if (((TreeSet) this.f5320d).isEmpty()) {
            return null;
        }
        k kVar = (k) ((TreeSet) this.f5320d).first();
        int i10 = kVar.f5311a.f5296c;
        if (i10 != i.a(this.f5318b) && j10 < kVar.f5312b) {
            return null;
        }
        ((TreeSet) this.f5320d).pollFirst();
        this.f5318b = i10;
        return kVar.f5311a;
    }

    public synchronized void d() {
        ((TreeSet) this.f5320d).clear();
        this.f5319c = false;
        this.f5318b = -1;
        this.f5317a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0029  */
    public void e(int i10, boolean z10) {
        int i11;
        String str;
        int i12 = this.f5317a;
        if (i12 == i10 && z10 == this.f5319c) {
            return;
        }
        if (i10 == 0 && i12 == 0) {
            this.f5319c = z10;
            return;
        }
        int iC = v0.i.c(i10);
        if (iC != 0) {
            if (iC == 1) {
                i11 = z10 ? 2 : 3;
            } else if (iC == 2 || iC == 3 || iC == 4) {
                i11 = i10;
            } else {
                i11 = 0;
            }
        } else {
            i11 = i10;
        }
        this.f5317a = i10;
        this.f5319c = z10;
        if (i11 == this.f5318b) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("AppLifecycleState.");
        if (i11 == 1) {
            str = "DETACHED";
        } else if (i11 == 2) {
            str = "RESUMED";
        } else if (i11 == 3) {
            str = "INACTIVE";
        } else if (i11 == 4) {
            str = "HIDDEN";
        } else {
            if (i11 != 5) {
                throw null;
            }
            str = "PAUSED";
        }
        sb2.append(str.toLowerCase(Locale.ROOT));
        ((k5.g) this.f5320d).y(sb2.toString(), null);
        this.f5318b = i11;
    }

    public l() {
        this.f5320d = new TreeSet(new j(0));
        d();
    }
}
