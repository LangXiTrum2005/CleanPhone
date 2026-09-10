package v3;

import com.google.android.gms.internal.ads.a0;
import d5.u;
import i1.e0;
import l1.q;
import n2.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f52473a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f52474b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(l lVar) {
        q qVar = new q(8);
        int i10 = a0.b(lVar, qVar).f11791a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        lVar.peekFully(qVar.f44813a, 0, 4);
        qVar.M(0);
        int iM = qVar.m();
        if (iM == 1463899717) {
            return true;
        }
        l1.a.e("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    public static a0 b(int i10, l lVar, q qVar) throws e0 {
        a0 a0VarB = a0.b(lVar, qVar);
        while (true) {
            int i11 = a0VarB.f11791a;
            if (i11 == i10) {
                return a0VarB;
            }
            u.v(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j10 = a0VarB.f11792b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw e0.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            lVar.skipFully((int) j11);
            a0VarB = a0.b(lVar, qVar);
        }
    }
}
