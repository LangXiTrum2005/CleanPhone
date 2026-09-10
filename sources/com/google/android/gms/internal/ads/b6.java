package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b6 implements e3, n2.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12654d;

    public String toString() {
        switch (this.f12651a) {
            case 0:
                String strA = uu0.a(this.f12652b);
                int length = strA.length();
                long j10 = this.f12653c;
                int length2 = String.valueOf(j10).length();
                int i10 = this.f12654d;
                StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(length, 29, length2, 16, String.valueOf(i10).length()) + 1);
                wi.d.m(sb2, "AtomSizeTooSmall{type=", strA, ", size=");
                sb2.append(j10);
                sb2.append(", minHeaderSize=");
                sb2.append(i10);
                sb2.append("}");
                return sb2.toString();
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb3 = new StringBuilder("AtomSizeTooSmall{type=");
                sb3.append(l1.y.X(this.f12652b));
                sb3.append(", size=");
                sb3.append(this.f12653c);
                sb3.append(", minHeaderSize=");
                return l1.d.i(sb3, this.f12654d, "}");
        }
    }

    public /* synthetic */ b6(int i10, int i11, int i12, long j10) {
        this.f12651a = i12;
        this.f12652b = i10;
        this.f12653c = j10;
        this.f12654d = i11;
    }
}
