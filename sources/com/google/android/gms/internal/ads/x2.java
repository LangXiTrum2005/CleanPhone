package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl0 f21712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bl0 f21713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21714c;

    public x2(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        ps1.v(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f21712a = new bl0(length2, 0);
            this.f21713b = new bl0(length2, 0);
        } else {
            int i10 = length2 + 1;
            bl0 bl0Var = new bl0(i10, 0);
            this.f21712a = bl0Var;
            bl0 bl0Var2 = new bl0(i10, 0);
            this.f21713b = bl0Var2;
            bl0Var.d();
            bl0Var2.d();
        }
        this.f21712a.e(jArr);
        this.f21713b.e(jArr2);
        this.f21714c = j10;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        bl0 bl0Var = this.f21713b;
        int i10 = bl0Var.f12818a;
        if (i10 == 0) {
            b3 b3Var = b3.f12618c;
            return new z2(b3Var, b3Var);
        }
        String str = uu0.f20901a;
        int i11 = i10 - 1;
        int i12 = 0;
        int i13 = 0;
        while (i13 <= i11) {
            int i14 = (i13 + i11) >>> 1;
            if (bl0Var.f(i14) < j10) {
                i13 = i14 + 1;
            } else {
                i11 = i14 - 1;
            }
        }
        int i15 = i11 + 1;
        if (i15 < bl0Var.f12818a && bl0Var.f(i15) == j10) {
            i12 = i15;
        } else if (i11 != -1) {
            i12 = i11;
        }
        long jF = bl0Var.f(i12);
        bl0 bl0Var2 = this.f21712a;
        b3 b3Var2 = new b3(jF, bl0Var2.f(i12));
        if (jF == j10 || i12 == bl0Var.f12818a - 1) {
            return new z2(b3Var2, b3Var2);
        }
        int i16 = i12 + 1;
        return new z2(b3Var2, new b3(bl0Var.f(i16), bl0Var2.f(i16)));
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f21714c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return this.f21713b.f12818a > 0;
    }
}
