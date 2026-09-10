package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class aa implements m2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z3 f11951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o2 f11952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11953k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final st0 f11943a = new st0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final np0 f11945c = new np0(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f11944b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y9 f11946d = new y9(0);

    static {
        int i10 = pi1.R;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        h2 h2Var = (h2) n2Var;
        h2Var.m(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            h2Var.a(bArr[13] & 7, false);
            h2Var.m(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        long j12;
        st0 st0Var = this.f11943a;
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
        z3 z3Var = this.f11951i;
        if (z3Var != null) {
            z3Var.d(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f11944b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            z9 z9Var = (z9) sparseArray.valueAt(i10);
            z9Var.f22571f = false;
            z9Var.f22566a.zza();
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0226  */
    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) {
        int i10;
        long jC;
        j9 l9Var;
        long j10;
        o2 o2Var = this.f11952j;
        o2Var.getClass();
        long jZzo = n2Var.zzo();
        long j11 = C.TIME_UNSET;
        y9 y9Var = this.f11946d;
        if (jZzo != -1) {
            boolean z10 = y9Var.f22200c;
            np0 np0Var = y9Var.f22199b;
            if (!z10) {
                if (!y9Var.f22202e) {
                    long jZzo2 = n2Var.zzo();
                    int iMin = (int) Math.min(20000L, jZzo2);
                    long j12 = jZzo2 - ((long) iMin);
                    if (n2Var.zzn() != j12) {
                        q2Var.f18888a = j12;
                        return 1;
                    }
                    np0Var.y(iMin);
                    n2Var.zzl();
                    n2Var.v(np0Var.f17880a, 0, iMin);
                    int i11 = np0Var.f17881b;
                    for (int i12 = np0Var.f17882c - 4; i12 >= i11; i12--) {
                        if (y9.c(i12, np0Var.f17880a) == 442) {
                            np0Var.E(i12 + 4);
                            long jA = y9.a(np0Var);
                            if (jA != C.TIME_UNSET) {
                                j11 = jA;
                                break;
                            }
                        }
                    }
                    y9Var.f22204g = j11;
                    y9Var.f22202e = true;
                    return 0;
                }
                if (y9Var.f22204g == C.TIME_UNSET) {
                    byte[] bArr = uu0.f20902b;
                    int length = bArr.length;
                    np0Var.z(0, bArr);
                    y9Var.f22200c = true;
                    n2Var.zzl();
                    return 0;
                }
                if (y9Var.f22201d) {
                    long j13 = y9Var.f22203f;
                    if (j13 == C.TIME_UNSET) {
                        byte[] bArr2 = uu0.f20902b;
                        int length2 = bArr2.length;
                        np0Var.z(0, bArr2);
                        y9Var.f22200c = true;
                        n2Var.zzl();
                        return 0;
                    }
                    st0 st0Var = y9Var.f22198a;
                    y9Var.f22205h = st0Var.d(y9Var.f22204g) - st0Var.c(j13);
                    byte[] bArr3 = uu0.f20902b;
                    int length3 = bArr3.length;
                    np0Var.z(0, bArr3);
                    y9Var.f22200c = true;
                    n2Var.zzl();
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, n2Var.zzo());
                if (n2Var.zzn() != 0) {
                    q2Var.f18888a = 0L;
                    return 1;
                }
                np0Var.y(iMin2);
                n2Var.zzl();
                n2Var.v(np0Var.f17880a, 0, iMin2);
                int i13 = np0Var.f17882c;
                for (int i14 = np0Var.f17881b; i14 < i13 - 3; i14++) {
                    if (y9.c(i14, np0Var.f17880a) == 442) {
                        np0Var.E(i14 + 4);
                        long jA2 = y9.a(np0Var);
                        if (jA2 != C.TIME_UNSET) {
                            j10 = jA2;
                            y9Var.f22203f = j10;
                            y9Var.f22201d = true;
                            return 0;
                        }
                    }
                }
                j10 = -9223372036854775807L;
                y9Var.f22203f = j10;
                y9Var.f22201d = true;
                return 0;
            }
        }
        if (this.f11953k) {
            i10 = 442;
        } else {
            this.f11953k = true;
            long j14 = y9Var.f22205h;
            if (j14 != C.TIME_UNSET) {
                z3 z3Var = new z3(new s6(11), new md0(y9Var.f22198a), j14, j14 + 1, 0L, jZzo, 188L, 1000);
                this.f11951i = z3Var;
                this.f11952j.o((a2) z3Var.f14172b);
                i10 = 442;
            } else {
                i10 = 442;
                o2Var.o(new r2(j14, 0L));
            }
        }
        z3 z3Var2 = this.f11951i;
        if (z3Var2 != null && ((b2) z3Var2.f14174d) != null) {
            return z3Var2.e(n2Var, q2Var);
        }
        n2Var.zzl();
        long jZzm = jZzo != -1 ? jZzo - n2Var.zzm() : -1L;
        if (jZzm != -1 && jZzm < 4) {
            return -1;
        }
        np0 np0Var2 = this.f11945c;
        if (!n2Var.m(np0Var2.f17880a, 0, 4, true)) {
            return -1;
        }
        np0Var2.E(0);
        int iB = np0Var2.b();
        if (iB == 441) {
            return -1;
        }
        if (iB == i10) {
            n2Var.v(np0Var2.f17880a, 0, 10);
            np0Var2.E(9);
            n2Var.zzf((np0Var2.K() & 7) + 14);
            return 0;
        }
        if (iB == 443) {
            n2Var.v(np0Var2.f17880a, 0, 2);
            np0Var2.E(0);
            n2Var.zzf(np0Var2.L() + 6);
            return 0;
        }
        if ((iB >> 8) != 1) {
            n2Var.zzf(1);
            return 0;
        }
        int i15 = iB & 255;
        SparseArray sparseArray = this.f11944b;
        z9 z9Var = (z9) sparseArray.get(i15);
        if (!this.f11947e) {
            if (z9Var == null) {
                j9 j9Var = null;
                if (i15 == 189) {
                    l9Var = new c9(0, 0, null, "video/mp2p");
                    this.f11948f = true;
                    this.f11950h = n2Var.zzn();
                } else if ((iB & 224) == 192) {
                    l9Var = new u9(0, 0, null, "video/mp2p");
                    this.f11948f = true;
                    this.f11950h = n2Var.zzn();
                } else if ((iB & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    l9Var = new l9(null, "video/mp2p");
                    this.f11949g = true;
                    this.f11950h = n2Var.zzn();
                } else if (j9Var != null) {
                    j9Var.e(this.f11952j, new ga(Integer.MIN_VALUE, i15, NotificationCompat.FLAG_LOCAL_ONLY, 0));
                    z9Var = new z9(j9Var, this.f11943a);
                    sparseArray.put(i15, z9Var);
                }
                j9Var = l9Var;
                if (j9Var != null) {
                    j9Var.e(this.f11952j, new ga(Integer.MIN_VALUE, i15, NotificationCompat.FLAG_LOCAL_ONLY, 0));
                    z9Var = new z9(j9Var, this.f11943a);
                    sparseArray.put(i15, z9Var);
                }
            }
            long j15 = 1048576;
            if (this.f11948f && this.f11949g) {
                j15 = 8192 + this.f11950h;
            }
            if (n2Var.zzn() > j15) {
                this.f11947e = true;
                this.f11952j.zzv();
            }
        }
        n2Var.v(np0Var2.f17880a, 0, 2);
        np0Var2.E(0);
        int iL = np0Var2.L() + 6;
        if (z9Var == null) {
            n2Var.zzf(iL);
            return 0;
        }
        np0Var2.y(iL);
        n2Var.p(np0Var2.f17880a, 0, iL);
        np0Var2.E(6);
        st0 st0Var2 = z9Var.f22567b;
        gp0 gp0Var = z9Var.f22568c;
        np0Var2.H(gp0Var.f14921a, 0, 3);
        gp0Var.d(0);
        gp0Var.f(8);
        z9Var.f22569d = gp0Var.g();
        z9Var.f22570e = gp0Var.g();
        gp0Var.f(6);
        np0Var2.H(gp0Var.f14921a, 0, gp0Var.h(8));
        gp0Var.d(0);
        if (z9Var.f22569d) {
            gp0Var.f(4);
            long jH = gp0Var.h(3);
            gp0Var.f(1);
            int iH = gp0Var.h(15) << 15;
            gp0Var.f(1);
            long jH2 = gp0Var.h(15);
            gp0Var.f(1);
            if (!z9Var.f22571f && z9Var.f22570e) {
                gp0Var.f(4);
                long jH3 = ((long) gp0Var.h(3)) << 30;
                gp0Var.f(1);
                int iH2 = gp0Var.h(15) << 15;
                gp0Var.f(1);
                long jH4 = gp0Var.h(15);
                gp0Var.f(1);
                st0Var2.c(((long) iH2) | jH3 | jH4);
                z9Var.f22571f = true;
            }
            jC = st0Var2.c((jH << 30) | ((long) iH) | jH2);
        } else {
            jC = 0;
        }
        j9 j9Var2 = z9Var.f22566a;
        j9Var2.c(4, jC);
        j9Var2.f(np0Var2);
        j9Var2.a(false);
        np0Var2.C(np0Var2.f17880a.length);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f11952j = o2Var;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
