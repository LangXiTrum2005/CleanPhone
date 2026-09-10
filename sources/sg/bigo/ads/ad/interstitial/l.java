package sg.bigo.ads.ad.interstitial;

import android.os.SystemClock;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f46349a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f46350b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f46351c = 3;
    int d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f46352e = 5;
    int f = 6;
    int g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f46353h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f46354i = 1;
    int j = 2;
    long k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long f46355l = 0;
    long m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int[] f46356n = new int[10];
    long[] o = new long[10];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    long[] f46357p = new long[10];
    boolean[][] q;
    boolean[][] r;
    boolean s;

    public l() {
        Class cls = Boolean.TYPE;
        this.q = (boolean[][]) Array.newInstance((Class<?>) cls, 10, 10);
        this.r = (boolean[][]) Array.newInstance((Class<?>) cls, 10, 10);
        this.s = false;
    }

    private int a() {
        return (this.k == 0 || SystemClock.elapsedRealtime() - this.k > 5000) ? this.j : this.f46354i;
    }

    public final void a(int i2) {
        try {
            long[] jArr = this.o;
            if (jArr[i2] == 0) {
                jArr[i2] = SystemClock.elapsedRealtime();
            }
        } catch (Exception unused) {
        }
    }

    public final void a(sg.bigo.ads.api.core.c cVar, int i2) {
        try {
            long[] jArr = this.o;
            if (jArr[i2] == 0) {
                jArr[i2] = SystemClock.elapsedRealtime();
            }
            if (this.f46357p[i2] != 0) {
                int[] iArr = this.f46356n;
                int i3 = iArr[i2];
                iArr[i2] = 0;
                a(cVar, i2, i3);
            }
        } catch (Exception unused) {
        }
    }

    private void a(sg.bigo.ads.api.core.c cVar, int i2, int i3) {
        try {
            boolean[] zArr = this.r[i3];
            if (zArr[i2]) {
                return;
            }
            zArr[i2] = true;
            sg.bigo.ads.core.d.b.a(cVar, i2, i3, SystemClock.elapsedRealtime() - this.f46357p[i2]);
        } catch (Exception unused) {
        }
    }

    public final void a(sg.bigo.ads.api.core.c cVar, int i2, int i3, int i4, int i5, int i6) {
        try {
            this.f46357p[i2] = SystemClock.elapsedRealtime();
            this.f46356n[i2] = a();
            a(cVar, i2, this.f46356n[i2], i3, i4, i5, i6);
        } catch (Exception unused) {
        }
    }

    private void a(sg.bigo.ads.api.core.c cVar, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jElapsedRealtime;
        long j;
        try {
            if (this.s) {
                return;
            }
            boolean[] zArr = this.q[i3];
            if (zArr[i2]) {
                return;
            }
            zArr[i2] = true;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.o[i2];
            if (i2 == this.f46349a) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                j = this.o[i2];
            } else {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                j = this.f46355l;
            }
            sg.bigo.ads.core.d.b.a(cVar, i2, i3, jElapsedRealtime2, jElapsedRealtime - j, i4, i5, i6, i7);
        } catch (Exception unused) {
        }
    }
}
