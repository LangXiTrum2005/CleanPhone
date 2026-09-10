package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ea implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np0 f13901b = new np0(new byte[9400], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f13902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g9 f13903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s6 f13904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f13905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f13906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f13907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y9 f13908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z3 f13909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o2 f13910k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13913o;

    static {
        int i10 = ps1.f18811t;
    }

    public ea(s6 s6Var, st0 st0Var, g9 g9Var) {
        this.f13903d = g9Var;
        this.f13904e = s6Var;
        this.f13900a = Collections.singletonList(st0Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f13906g = sparseBooleanArray;
        this.f13907h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f13905f = sparseArray;
        this.f13902c = new SparseIntArray();
        this.f13908i = new y9(1);
        this.f13910k = o2.Q8;
        this.f13913o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f13905f.put(sparseArray2.keyAt(i10), (ha) sparseArray2.valueAt(i10));
        }
        this.f13905f.put(0, new ca(new lj1(this)));
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f13901b.f17880a;
        h2 h2Var = (h2) n2Var;
        h2Var.m(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    h2Var.j(i10, false);
                    return true;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        z3 z3Var;
        long j12;
        List list = this.f13900a;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            st0 st0Var = (st0) list.get(i11);
            synchronized (st0Var) {
                j12 = st0Var.f20049b;
            }
            if (j12 != C.TIME_UNSET) {
                long jA = st0Var.a();
                if (jA != C.TIME_UNSET && jA != 0 && jA != j11) {
                    st0Var.b(j11);
                }
            } else {
                st0Var.b(j11);
            }
        }
        if (j11 != 0 && (z3Var = this.f13909j) != null) {
            z3Var.d(j11);
        }
        this.f13901b.y(0);
        this.f13902c.clear();
        while (true) {
            SparseArray sparseArray = this.f13905f;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((ha) sparseArray.valueAt(i10)).zzb();
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) {
        n2 n2Var2;
        int i10;
        long j10;
        long jN;
        long jZzo = n2Var.zzo();
        if (this.l) {
            long j11 = C.TIME_UNSET;
            y9 y9Var = this.f13908i;
            if (jZzo != -1 && !y9Var.f22200c) {
                int i11 = this.f13913o;
                np0 np0Var = y9Var.f22199b;
                if (i11 <= 0) {
                    y9Var.b(n2Var);
                    return 0;
                }
                if (y9Var.f22202e) {
                    if (y9Var.f22204g == C.TIME_UNSET) {
                        y9Var.b(n2Var);
                        return 0;
                    }
                    if (y9Var.f22201d) {
                        long j12 = y9Var.f22203f;
                        if (j12 == C.TIME_UNSET) {
                            y9Var.b(n2Var);
                            return 0;
                        }
                        st0 st0Var = y9Var.f22198a;
                        y9Var.f22205h = st0Var.d(y9Var.f22204g) - st0Var.c(j12);
                        y9Var.b(n2Var);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, n2Var.zzo());
                    if (n2Var.zzn() != 0) {
                        q2Var.f18888a = 0L;
                        return 1;
                    }
                    np0Var.y(iMin);
                    n2Var.zzl();
                    n2Var.v(np0Var.f17880a, 0, iMin);
                    int i12 = np0Var.f17882c;
                    for (int i13 = np0Var.f17881b; i13 < i12; i13++) {
                        if (np0Var.f17880a[i13] == 71) {
                            jN = dv.n(np0Var, i13, i11);
                            if (jN != C.TIME_UNSET) {
                                y9Var.f22203f = jN;
                                y9Var.f22201d = true;
                                return 0;
                            }
                        }
                    }
                    jN = -9223372036854775807L;
                    y9Var.f22203f = jN;
                    y9Var.f22201d = true;
                    return 0;
                }
                long jZzo2 = n2Var.zzo();
                int iMin2 = (int) Math.min(112800L, jZzo2);
                long j13 = jZzo2 - ((long) iMin2);
                if (n2Var.zzn() != j13) {
                    q2Var.f18888a = j13;
                    return 1;
                }
                np0Var.y(iMin2);
                n2Var.zzl();
                n2Var.v(np0Var.f17880a, 0, iMin2);
                int i14 = np0Var.f17881b;
                int i15 = np0Var.f17882c;
                for (int i16 = i15 - 188; i16 >= i14; i16--) {
                    byte[] bArr = np0Var.f17880a;
                    int i17 = 0;
                    for (int i18 = -4; i18 <= 4; i18++) {
                        int i19 = (i18 * 188) + i16;
                        if (i19 >= i14 && i19 < i15 && bArr[i19] == 71) {
                            i17++;
                            if (i17 == 5) {
                                long jN2 = dv.n(np0Var, i16, i11);
                                if (jN2 == C.TIME_UNSET) {
                                    break;
                                }
                                j11 = jN2;
                                break;
                            }
                        } else {
                            i17 = 0;
                        }
                    }
                }
                y9Var.f22204g = j11;
                y9Var.f22202e = true;
                return 0;
            }
            if (this.f13911m) {
                i10 = 1;
                j10 = 0;
            } else {
                this.f13911m = true;
                long j14 = y9Var.f22205h;
                if (j14 != C.TIME_UNSET) {
                    st0 st0Var2 = y9Var.f22198a;
                    int i20 = this.f13913o;
                    s6 s6Var = new s6(11);
                    pb pbVar = new pb();
                    pbVar.f18582a = i20;
                    pbVar.f18583b = st0Var2;
                    pbVar.f18584c = new np0();
                    i10 = 1;
                    j10 = 0;
                    z3 z3Var = new z3(s6Var, pbVar, j14, j14 + 1, 0L, jZzo, 188L, 940);
                    this.f13909j = z3Var;
                    this.f13910k.o((a2) z3Var.f14172b);
                } else {
                    i10 = 1;
                    j10 = 0;
                    this.f13910k.o(new r2(j14, 0L));
                }
            }
            if (this.f13912n) {
                this.f13912n = false;
                e(j10, j10);
                if (n2Var.zzn() != j10) {
                    q2Var.f18888a = j10;
                    return i10;
                }
            }
            z3 z3Var2 = this.f13909j;
            if (z3Var2 != null && ((b2) z3Var2.f14174d) != null) {
                return z3Var2.e(n2Var, q2Var);
            }
            n2Var2 = n2Var;
        } else {
            n2Var2 = n2Var;
            i10 = 1;
        }
        np0 np0Var2 = this.f13901b;
        byte[] bArr2 = np0Var2.f17880a;
        if (9400 - np0Var2.f17881b < 188) {
            int iB = np0Var2.B();
            if (iB > 0) {
                System.arraycopy(bArr2, np0Var2.f17881b, bArr2, 0, iB);
            }
            np0Var2.z(iB, bArr2);
        }
        while (true) {
            int iB2 = np0Var2.B();
            SparseArray sparseArray = this.f13905f;
            if (iB2 >= 188) {
                int i21 = np0Var2.f17881b;
                int i22 = np0Var2.f17882c;
                byte[] bArr3 = np0Var2.f17880a;
                while (i21 < i22 && bArr3[i21] != 71) {
                    i21++;
                }
                np0Var2.E(i21);
                int i23 = i21 + 188;
                int i24 = np0Var2.f17882c;
                if (i23 > i24) {
                    return 0;
                }
                int iB3 = np0Var2.b();
                if ((8388608 & iB3) != 0) {
                    np0Var2.E(i23);
                    return 0;
                }
                int i25 = (4194304 & iB3) != 0 ? 1 : 0;
                int i26 = iB3 & 32;
                int i27 = (iB3 >> 8) & 8191;
                ha haVar = (iB3 & 16) != 0 ? (ha) sparseArray.get(i27) : null;
                if (haVar == null) {
                    np0Var2.E(i23);
                    return 0;
                }
                int i28 = iB3 & 15;
                SparseIntArray sparseIntArray = this.f13902c;
                int i29 = sparseIntArray.get(i27, i28 - 1);
                sparseIntArray.put(i27, i28);
                if (i29 == i28) {
                    np0Var2.E(i23);
                    return 0;
                }
                if (i28 != ((i29 + 1) & 15)) {
                    haVar.zzb();
                }
                if (i26 != 0) {
                    int iK = np0Var2.K();
                    i25 |= (np0Var2.K() & 64) != 0 ? 2 : 0;
                    np0Var2.G(iK - 1);
                }
                boolean z10 = this.l;
                if (z10 || !this.f13907h.get(i27, false)) {
                    np0Var2.C(i23);
                    haVar.b(i25, np0Var2);
                    np0Var2.C(i24);
                }
                if (!z10 && this.l && jZzo != -1) {
                    this.f13912n = true;
                }
                np0Var2.E(i23);
                return 0;
            }
            int i30 = np0Var2.f17882c;
            int iT = n2Var2.t(bArr2, i30, 9400 - i30);
            if (iT == -1) {
                int i31 = 0;
                while (i31 < sparseArray.size()) {
                    ha haVar2 = (ha) sparseArray.valueAt(i31);
                    if (haVar2 instanceof x9) {
                        x9 x9Var = (x9) haVar2;
                        if (x9Var.f21787c == 3 && x9Var.f21794j == -1) {
                            x9Var.b(i10, new np0());
                        }
                    }
                    i31++;
                    i10 = 1;
                }
                return -1;
            }
            np0Var2.C(i30 + iT);
            i10 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f13910k = new bc.s(o2Var, this.f13904e);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
