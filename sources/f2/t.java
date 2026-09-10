package f2;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements n1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.h f40456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f40458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f40459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40460e;

    public t(n1.h hVar, int i10, s0 s0Var) {
        go.k.i(i10 > 0);
        this.f40456a = hVar;
        this.f40457b = i10;
        this.f40458c = s0Var;
        this.f40459d = new byte[1];
        this.f40460e = i10;
    }

    @Override // n1.h
    public final long C(n1.k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // n1.h
    public final void c(n1.z zVar) {
        zVar.getClass();
        this.f40456a.c(zVar);
    }

    @Override // n1.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // n1.h
    public final Map getResponseHeaders() {
        return this.f40456a.getResponseHeaders();
    }

    @Override // n1.h
    public final Uri getUri() {
        return this.f40456a.getUri();
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f40460e;
        n1.h hVar = this.f40456a;
        if (i12 == 0) {
            byte[] bArr2 = this.f40459d;
            int i13 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int i16 = hVar.read(bArr3, i13, i15);
                        if (i16 != -1) {
                            i13 += i16;
                            i15 -= i16;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        l1.q qVar = new l1.q(bArr3, i14);
                        s0 s0Var = this.f40458c;
                        long jMax = !s0Var.l ? s0Var.f40452i : Math.max(s0Var.f40455m.l(true), s0Var.f40452i);
                        int iA = qVar.a();
                        n2.a0 a0Var = s0Var.f40454k;
                        a0Var.getClass();
                        a0Var.g(iA, qVar);
                        a0Var.a(jMax, 1, iA, 0, null);
                        s0Var.l = true;
                    }
                }
                this.f40460e = this.f40457b;
            }
            return -1;
        }
        int i17 = hVar.read(bArr, i10, Math.min(this.f40460e, i11));
        if (i17 != -1) {
            this.f40460e -= i17;
        }
        return i17;
    }
}
