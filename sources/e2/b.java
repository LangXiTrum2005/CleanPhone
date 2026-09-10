package e2;

import i1.p;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f39029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f39030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f39031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p[] f39032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f39033k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f39034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f39035n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long[] f39036o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f39037p;

    public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, p[] pVarArr, List list, long[] jArr, long j11) {
        this.l = str;
        this.f39034m = str2;
        this.f39023a = i10;
        this.f39024b = str3;
        this.f39025c = j10;
        this.f39026d = str4;
        this.f39027e = i11;
        this.f39028f = i12;
        this.f39029g = i13;
        this.f39030h = i14;
        this.f39031i = str5;
        this.f39032j = pVarArr;
        this.f39035n = list;
        this.f39036o = jArr;
        this.f39037p = j11;
        this.f39033k = list.size();
    }

    public final b a(p[] pVarArr) {
        return new b(this.l, this.f39034m, this.f39023a, this.f39024b, this.f39025c, this.f39026d, this.f39027e, this.f39028f, this.f39029g, this.f39030h, this.f39031i, pVarArr, this.f39035n, this.f39036o, this.f39037p);
    }

    public final long b(int i10) {
        if (i10 == this.f39033k - 1) {
            return this.f39037p;
        }
        long[] jArr = this.f39036o;
        return jArr[i10 + 1] - jArr[i10];
    }
}
