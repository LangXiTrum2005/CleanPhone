package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f15192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f15193g;

    public h7(int i10) {
        switch (i10) {
            case 1:
                this.f15192f = new int[255];
                this.f15193g = new l1.q(255);
                break;
            default:
                this.f15192f = new int[255];
                this.f15193g = new np0(255);
                break;
        }
    }

    public boolean a(n2.l lVar, boolean z10) throws EOFException, i1.e0 {
        boolean zPeekFully;
        boolean zPeekFully2;
        this.f15187a = 0;
        this.f15188b = 0L;
        this.f15189c = 0;
        this.f15190d = 0;
        this.f15191e = 0;
        l1.q qVar = (l1.q) this.f15193g;
        qVar.J(27);
        try {
            zPeekFully = lVar.peekFully(qVar.f44813a, 0, 27, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            zPeekFully = false;
        }
        if (zPeekFully && qVar.B() == 1332176723) {
            if (qVar.z() == 0) {
                this.f15187a = qVar.z();
                this.f15188b = qVar.p();
                qVar.q();
                qVar.q();
                qVar.q();
                int iZ = qVar.z();
                this.f15189c = iZ;
                this.f15190d = iZ + 27;
                qVar.J(iZ);
                try {
                    zPeekFully2 = lVar.peekFully(qVar.f44813a, 0, this.f15189c, z10);
                } catch (EOFException e11) {
                    if (!z10) {
                        throw e11;
                    }
                    zPeekFully2 = false;
                }
                if (zPeekFully2) {
                    for (int i10 = 0; i10 < this.f15189c; i10++) {
                        int iZ2 = qVar.z();
                        this.f15192f[i10] = iZ2;
                        this.f15191e += iZ2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw i1.e0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public boolean b(n2.l lVar, long j10) {
        boolean zPeekFully;
        l1.q qVar = (l1.q) this.f15193g;
        go.k.i(lVar.getPosition() == lVar.getPeekPosition());
        qVar.J(4);
        while (true) {
            if (j10 != -1 && lVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                zPeekFully = lVar.peekFully(qVar.f44813a, 0, 4, true);
            } catch (EOFException unused) {
                zPeekFully = false;
            }
            if (!zPeekFully) {
                break;
            }
            qVar.M(0);
            if (qVar.B() == 1332176723) {
                lVar.resetPeekPosition();
                return true;
            }
            lVar.skipFully(1);
        }
        do {
            if (j10 != -1 && lVar.getPosition() >= j10) {
                break;
            }
        } while (lVar.skip(1) != -1);
        return false;
    }

    public boolean c(n2 n2Var, long j10) {
        boolean zM;
        ps1.v(n2Var.zzn() == n2Var.zzm());
        np0 np0Var = (np0) this.f15193g;
        np0Var.y(4);
        while (true) {
            if (j10 != -1 && n2Var.zzn() + 4 >= j10) {
                break;
            }
            try {
                zM = n2Var.m(np0Var.f17880a, 0, 4, true);
            } catch (EOFException unused) {
                zM = false;
            }
            if (!zM) {
                break;
            }
            np0Var.E(0);
            if (np0Var.P() == 1332176723) {
                n2Var.zzl();
                return true;
            }
            n2Var.zzf(1);
        }
        do {
            if (j10 != -1 && n2Var.zzn() >= j10) {
                break;
            }
        } while (n2Var.zzd() != -1);
        return false;
    }

    public boolean d(n2 n2Var, boolean z10) throws ab, EOFException {
        boolean zM;
        boolean zM2;
        this.f15187a = 0;
        this.f15188b = 0L;
        this.f15189c = 0;
        this.f15190d = 0;
        this.f15191e = 0;
        np0 np0Var = (np0) this.f15193g;
        np0Var.y(27);
        try {
            zM = n2Var.m(np0Var.f17880a, 0, 27, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            zM = false;
        }
        if (zM && np0Var.P() == 1332176723) {
            if (np0Var.K() == 0) {
                this.f15187a = np0Var.K();
                this.f15188b = np0Var.e();
                np0Var.a();
                np0Var.a();
                np0Var.a();
                int iK = np0Var.K();
                this.f15189c = iK;
                this.f15190d = iK + 27;
                np0Var.y(iK);
                try {
                    zM2 = n2Var.m(np0Var.f17880a, 0, this.f15189c, z10);
                } catch (EOFException e11) {
                    if (!z10) {
                        throw e11;
                    }
                    zM2 = false;
                }
                if (zM2) {
                    for (int i10 = 0; i10 < this.f15189c; i10++) {
                        int iK2 = np0Var.K();
                        this.f15192f[i10] = iK2;
                        this.f15191e += iK2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw ab.b("unsupported bit stream revision");
            }
        }
        return false;
    }
}
