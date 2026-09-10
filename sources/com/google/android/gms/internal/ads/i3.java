package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15554g;

    public i3(int i10) {
        switch (i10) {
            case 1:
                this.f15548a = new byte[10];
                break;
            default:
                this.f15548a = new byte[10];
                break;
        }
    }

    public void a(n2.a0 a0Var, n2.z zVar) {
        if (this.f15550c > 0) {
            a0Var.a(this.f15551d, this.f15552e, this.f15553f, this.f15554g, zVar);
            this.f15550c = 0;
        }
    }

    public void b(n2.a0 a0Var, long j10, int i10, int i11, int i12, n2.z zVar) {
        go.k.s("TrueHD chunk samples must be contiguous in the sample queue.", this.f15554g <= i11 + i12);
        if (this.f15549b) {
            int i13 = this.f15550c;
            int i14 = i13 + 1;
            this.f15550c = i14;
            if (i13 == 0) {
                this.f15551d = j10;
                this.f15552e = i10;
                this.f15553f = 0;
            }
            this.f15553f += i11;
            this.f15554g = i12;
            if (i14 >= 16) {
                a(a0Var, zVar);
            }
        }
    }

    public void c(n2.l lVar) {
        if (this.f15549b) {
            return;
        }
        byte[] bArr = this.f15548a;
        int i10 = 0;
        lVar.peekFully(bArr, 0, 10);
        lVar.resetPeekPosition();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                i10 = 40 << ((bArr[((b10 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i10 == 0) {
            return;
        }
        this.f15549b = true;
    }

    public void d(n2 n2Var) {
        if (this.f15549b) {
            return;
        }
        byte[] bArr = this.f15548a;
        n2Var.v(bArr, 0, 10);
        n2Var.zzl();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f15549b = true;
        }
    }

    public void e(h3 h3Var, long j10, int i10, int i11, int i12, g3 g3Var) {
        ps1.d0("TrueHD chunk samples must be contiguous in the sample queue.", this.f15554g <= i11 + i12);
        if (this.f15549b) {
            int i13 = this.f15550c;
            int i14 = i13 + 1;
            this.f15550c = i14;
            if (i13 == 0) {
                this.f15551d = j10;
                this.f15552e = i10;
                this.f15553f = 0;
            }
            this.f15553f += i11;
            this.f15554g = i12;
            if (i14 >= 16) {
                f(h3Var, g3Var);
            }
        }
    }

    public void f(h3 h3Var, g3 g3Var) {
        if (this.f15550c > 0) {
            h3Var.c(this.f15551d, this.f15552e, this.f15553f, this.f15554g, g3Var);
            this.f15550c = 0;
        }
    }
}
