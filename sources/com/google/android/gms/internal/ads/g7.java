package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g7 implements n1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14781e;

    public g7(int i10) {
        switch (i10) {
            case 1:
                this.f14780d = new h7(1);
                this.f14781e = new l1.q(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
                this.f14777a = -1;
                break;
            case 2:
                this.f14780d = new m5.k(2);
                this.f14777a = 8000;
                this.f14778b = 8000;
                break;
            default:
                this.f14780d = new h7(0);
                this.f14781e = new np0(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
                this.f14777a = -1;
                break;
        }
    }

    public int a(int i10) {
        int i11;
        int i12 = 0;
        this.f14778b = 0;
        do {
            int i13 = this.f14778b;
            int i14 = i10 + i13;
            h7 h7Var = (h7) this.f14780d;
            if (i14 >= h7Var.f15189c) {
                break;
            }
            int[] iArr = h7Var.f15192f;
            this.f14778b = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public boolean b(n2.l lVar) {
        int i10;
        h7 h7Var = (h7) this.f14780d;
        l1.q qVar = (l1.q) this.f14781e;
        go.k.t(lVar != null);
        if (this.f14779c) {
            this.f14779c = false;
            qVar.J(0);
        }
        while (!this.f14779c) {
            if (this.f14777a < 0) {
                if (h7Var.b(lVar, -1L) && h7Var.a(lVar, true)) {
                    int iA = h7Var.f15190d;
                    if ((h7Var.f15187a & 1) == 1 && qVar.f44815c == 0) {
                        iA += a(0);
                        i10 = this.f14778b;
                    } else {
                        i10 = 0;
                    }
                    try {
                        lVar.skipFully(iA);
                        this.f14777a = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f14777a);
            int i11 = this.f14777a + this.f14778b;
            if (iA2 > 0) {
                qVar.c(qVar.f44815c + iA2);
                try {
                    lVar.readFully(qVar.f44813a, qVar.f44815c, iA2);
                    qVar.L(qVar.f44815c + iA2);
                    this.f14779c = h7Var.f15192f[i11 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i11 == h7Var.f15189c) {
                i11 = -1;
            }
            this.f14777a = i11;
        }
        return true;
    }

    public boolean c(n2 n2Var) {
        int i10;
        h7 h7Var = (h7) this.f14780d;
        np0 np0Var = (np0) this.f14781e;
        if (this.f14779c) {
            this.f14779c = false;
            np0Var.y(0);
        }
        while (true) {
            if (this.f14779c) {
                return true;
            }
            int i11 = this.f14777a;
            if (i11 < 0) {
                if (h7Var.c(n2Var, -1L) && h7Var.d(n2Var, true)) {
                    int iD = h7Var.f15190d;
                    if ((h7Var.f15187a & 1) == 1 && np0Var.f17882c == 0) {
                        iD += d(0);
                        i10 = this.f14778b;
                    } else {
                        i10 = 0;
                    }
                    try {
                        n2Var.zzf(iD);
                        this.f14777a = i10;
                        i11 = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iD2 = d(i11);
            int i12 = this.f14777a + this.f14778b;
            if (iD2 > 0) {
                np0Var.A(np0Var.f17882c + iD2);
                try {
                    n2Var.p(np0Var.f17880a, np0Var.f17882c, iD2);
                    np0Var.C(np0Var.f17882c + iD2);
                    this.f14779c = h7Var.f15192f[i12 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == h7Var.f15189c) {
                i12 = -1;
            }
            this.f14777a = i12;
        }
    }

    @Override // n1.g
    public n1.h createDataSource() {
        return new n1.o((String) this.f14781e, this.f14777a, this.f14778b, this.f14779c, (m5.k) this.f14780d);
    }

    public int d(int i10) {
        int i11;
        int i12 = 0;
        this.f14778b = 0;
        do {
            int i13 = this.f14778b;
            int i14 = i10 + i13;
            h7 h7Var = (h7) this.f14780d;
            if (i14 >= h7Var.f15189c) {
                break;
            }
            this.f14778b = i13 + 1;
            i11 = h7Var.f15192f[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }
}
