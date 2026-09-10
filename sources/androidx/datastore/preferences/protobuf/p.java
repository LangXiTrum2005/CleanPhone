package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends j1.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f4144g = Logger.getLogger(p.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f4145h = q1.f4159e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n0 f4146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s0.h1 f4150f;

    public p(s0.h1 h1Var, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f4147c = new byte[iMax];
        this.f4148d = iMax;
        this.f4150f = h1Var;
    }

    public static int R(int i10, j jVar) {
        int iT = T(i10);
        int size = jVar.size();
        return U(size) + size + iT;
    }

    public static int S(String str) {
        int length;
        try {
            length = t1.a(str);
        } catch (s1 unused) {
            length = str.getBytes(e0.f4067a).length;
        }
        return U(length) + length;
    }

    public static int T(int i10) {
        return U(i10 << 3);
    }

    public static int U(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int V(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Override // j1.f
    public final void K(byte[] bArr, int i10, int i11) throws IOException {
        Z(bArr, i10, i11);
    }

    public final void M(int i10) {
        int i11 = this.f4149e;
        int i12 = i11 + 1;
        this.f4149e = i12;
        byte[] bArr = this.f4147c;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f4149e = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f4149e = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f4149e = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void N(long j10) {
        int i10 = this.f4149e;
        int i11 = i10 + 1;
        this.f4149e = i11;
        byte[] bArr = this.f4147c;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i10 + 2;
        this.f4149e = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i10 + 3;
        this.f4149e = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i10 + 4;
        this.f4149e = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i10 + 5;
        this.f4149e = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f4149e = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f4149e = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f4149e = i10 + 8;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
    }

    public final void O(int i10, int i11) {
        P((i10 << 3) | i11);
    }

    public final void P(int i10) {
        boolean z10 = f4145h;
        byte[] bArr = this.f4147c;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f4149e;
                this.f4149e = i11 + 1;
                q1.j(bArr, i11, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            int i12 = this.f4149e;
            this.f4149e = i12 + 1;
            q1.j(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f4149e;
            this.f4149e = i13 + 1;
            bArr[i13] = (byte) ((i10 | 128) & 255);
            i10 >>>= 7;
        }
        int i14 = this.f4149e;
        this.f4149e = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void Q(long j10) {
        boolean z10 = f4145h;
        byte[] bArr = this.f4147c;
        if (z10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f4149e;
                this.f4149e = i10 + 1;
                q1.j(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            int i11 = this.f4149e;
            this.f4149e = i11 + 1;
            q1.j(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i12 = this.f4149e;
            this.f4149e = i12 + 1;
            bArr[i12] = (byte) ((((int) j10) | 128) & 255);
            j10 >>>= 7;
        }
        int i13 = this.f4149e;
        this.f4149e = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    public final void W() throws IOException {
        this.f4150f.write(this.f4147c, 0, this.f4149e);
        this.f4149e = 0;
    }

    public final void X(int i10) throws IOException {
        if (this.f4148d - this.f4149e < i10) {
            W();
        }
    }

    public final void Y(byte b10) throws IOException {
        if (this.f4149e == this.f4148d) {
            W();
        }
        int i10 = this.f4149e;
        this.f4149e = i10 + 1;
        this.f4147c[i10] = b10;
    }

    public final void Z(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f4149e;
        int i13 = this.f4148d;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f4147c;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f4149e += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f4149e = i13;
        W();
        if (i16 > i13) {
            this.f4150f.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f4149e = i16;
        }
    }

    public final void a0(int i10, boolean z10) throws IOException {
        X(11);
        O(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f4149e;
        this.f4149e = i11 + 1;
        this.f4147c[i11] = b10;
    }

    public final void b0(int i10, j jVar) {
        m0(i10, 2);
        c0(jVar);
    }

    public final void c0(j jVar) throws IOException {
        o0(jVar.size());
        i iVar = (i) jVar;
        K(iVar.f4101d, iVar.q(), iVar.size());
    }

    public final void d0(int i10, int i11) {
        X(14);
        O(i10, 5);
        M(i11);
    }

    public final void e0(int i10) throws IOException {
        X(4);
        M(i10);
    }

    public final void f0(int i10, long j10) {
        X(18);
        O(i10, 1);
        N(j10);
    }

    public final void g0(long j10) throws IOException {
        X(8);
        N(j10);
    }

    public final void h0(int i10, int i11) throws IOException {
        X(20);
        O(i10, 0);
        if (i11 >= 0) {
            P(i11);
        } else {
            Q(i11);
        }
    }

    public final void i0(int i10) throws IOException {
        if (i10 >= 0) {
            o0(i10);
        } else {
            q0(i10);
        }
    }

    public final void j0(int i10, a aVar, d1 d1Var) throws IOException {
        m0(i10, 2);
        o0(aVar.a(d1Var));
        d1Var.e(aVar, this.f4146b);
    }

    public final void k0(int i10, String str) throws IOException {
        m0(i10, 2);
        l0(str);
    }

    public final void l0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iU = U(length);
            int i10 = iU + length;
            int i11 = this.f4148d;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iH = t1.f4168a.h(bArr, 0, length, str);
                o0(iH);
                Z(bArr, 0, iH);
                return;
            }
            if (i10 > i11 - this.f4149e) {
                W();
            }
            int iU2 = U(str.length());
            int i12 = this.f4149e;
            byte[] bArr2 = this.f4147c;
            try {
                try {
                    if (iU2 == iU) {
                        int i13 = i12 + iU2;
                        this.f4149e = i13;
                        int iH2 = t1.f4168a.h(bArr2, i13, i11 - i13, str);
                        this.f4149e = i12;
                        P((iH2 - i12) - iU2);
                        this.f4149e = iH2;
                    } else {
                        int iA = t1.a(str);
                        P(iA);
                        this.f4149e = t1.f4168a.h(bArr2, this.f4149e, iA, str);
                    }
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new o(e10);
                }
            } catch (s1 e11) {
                this.f4149e = i12;
                throw e11;
            }
        } catch (s1 e12) {
            f4144g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(e0.f4067a);
            try {
                o0(bytes.length);
                K(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e13) {
                throw new o(e13);
            }
        }
    }

    public final void m0(int i10, int i11) {
        o0((i10 << 3) | i11);
    }

    public final void n0(int i10, int i11) throws IOException {
        X(20);
        O(i10, 0);
        P(i11);
    }

    public final void o0(int i10) throws IOException {
        X(5);
        P(i10);
    }

    public final void p0(int i10, long j10) {
        X(20);
        O(i10, 0);
        Q(j10);
    }

    public final void q0(long j10) throws IOException {
        X(10);
        Q(j10);
    }
}
