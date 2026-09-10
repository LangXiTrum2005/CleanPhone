package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ca implements ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba f13114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np0 f13115b = new np0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13119f;

    public ca(ba baVar) {
        this.f13114a = baVar;
    }

    @Override // com.google.android.gms.internal.ads.ha
    public final void a(st0 st0Var, o2 o2Var, ga gaVar) {
        this.f13114a.a(st0Var, o2Var, gaVar);
        this.f13119f = true;
    }

    @Override // com.google.android.gms.internal.ads.ha
    public final void b(int i10, np0 np0Var) {
        int iK;
        int i11 = i10 & 1;
        if (i11 != 0) {
            iK = np0Var.f17881b + np0Var.K();
        } else {
            iK = -1;
        }
        if (this.f13119f) {
            if (i11 == 0) {
                return;
            }
            this.f13119f = false;
            np0Var.E(iK);
            this.f13117d = 0;
        }
        while (np0Var.B() > 0) {
            int i12 = this.f13117d;
            np0 np0Var2 = this.f13115b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iK2 = np0Var.K();
                    np0Var.E(np0Var.f17881b - 1);
                    if (iK2 == 255) {
                        this.f13119f = true;
                        return;
                    }
                }
                int iMin = Math.min(np0Var.B(), 3 - this.f13117d);
                np0Var.H(np0Var2.f17880a, this.f13117d, iMin);
                int i13 = this.f13117d + iMin;
                this.f13117d = i13;
                if (i13 == 3) {
                    np0Var2.E(0);
                    np0Var2.C(3);
                    np0Var2.G(1);
                    int iK3 = np0Var2.K();
                    boolean z10 = (iK3 & 128) != 0;
                    int iK4 = np0Var2.K();
                    this.f13118e = z10;
                    int i14 = (((iK3 & 15) << 8) | iK4) + 3;
                    this.f13116c = i14;
                    byte[] bArr = np0Var2.f17880a;
                    if (bArr.length < i14) {
                        int length = bArr.length;
                        np0Var2.A(Math.min(4098, Math.max(i14, length + length)));
                    }
                }
            } else {
                int iMin2 = Math.min(np0Var.B(), this.f13116c - this.f13117d);
                np0Var.H(np0Var2.f17880a, this.f13117d, iMin2);
                int i15 = this.f13117d + iMin2;
                this.f13117d = i15;
                int i16 = this.f13116c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f13118e) {
                        np0Var2.C(i16);
                    } else {
                        if (uu0.h(0, i16, -1, np0Var2.f17880a) != 0) {
                            this.f13119f = true;
                            return;
                        }
                        np0Var2.C(this.f13116c - 4);
                    }
                    np0Var2.E(0);
                    this.f13114a.g(np0Var2);
                    this.f13117d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ha
    public final void zzb() {
        this.f13119f = true;
    }
}
