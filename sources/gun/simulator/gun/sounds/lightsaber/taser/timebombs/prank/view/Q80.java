package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Q80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3592a;
    public final String b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final C4619sw[] j;
    public final int k;
    public final String l;
    public final String m;
    public final List n;
    public final long[] o;
    public final long p;

    public Q80(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C4619sw[] c4619swArr, List list, long[] jArr, long j2) {
        this.l = str;
        this.m = str2;
        this.f3592a = i;
        this.b = str3;
        this.c = j;
        this.d = str4;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = str5;
        this.j = c4619swArr;
        this.n = list;
        this.o = jArr;
        this.p = j2;
        this.k = list.size();
    }

    public final Q80 a(C4619sw[] c4619swArr) {
        return new Q80(this.l, this.m, this.f3592a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, c4619swArr, this.n, this.o, this.p);
    }

    public final long b(int i) {
        if (i == this.k - 1) {
            return this.p;
        }
        long[] jArr = this.o;
        return jArr[i + 1] - jArr[i];
    }
}
