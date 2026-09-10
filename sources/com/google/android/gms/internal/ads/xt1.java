package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rr1 f22001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f22003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22004d;

    public xt1(rr1 rr1Var, String str, Object[] objArr) {
        this.f22001a = rr1Var;
        this.f22002b = str;
        this.f22003c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f22004d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f22004d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.f22004d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
