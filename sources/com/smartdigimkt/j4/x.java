package com.smartdigimkt.j4;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class x implements com.smartdigimkt.b4.m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f36054p = -1;
    private static final int q = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.smartdigimkt.n4.b f36055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f36057c;
    private final w.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.smartdigimkt.p4.s f36058e;
    private a f;
    private a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f36059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.smartdigimkt.w3.m f36060i;
    private boolean j;
    private com.smartdigimkt.w3.m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f36061l;
    private long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36062n;
    private b o;

    public interface b {
        void a(com.smartdigimkt.w3.m mVar);
    }

    public x(com.smartdigimkt.n4.b bVar) {
        this.f36055a = bVar;
        int iD = bVar.d();
        this.f36056b = iD;
        this.f36057c = new w();
        this.d = new w.a();
        this.f36058e = new com.smartdigimkt.p4.s(32);
        a aVar = new a(0L, iD);
        this.f = aVar;
        this.g = aVar;
        this.f36059h = aVar;
    }

    public void a(boolean z2) {
        this.f36057c.a(z2);
        a(this.f);
        a aVar = new a(0L, this.f36056b);
        this.f = aVar;
        this.g = aVar;
        this.f36059h = aVar;
        this.m = 0L;
        this.f36055a.a();
    }

    public void b(long j, boolean z2, boolean z3) {
        b(this.f36057c.b(j, z2, z3));
    }

    public void c() {
        b(this.f36057c.c());
    }

    public int d() {
        return this.f36057c.d();
    }

    public void e(int i2) {
        this.f36057c.f(i2);
    }

    public long f() {
        return this.f36057c.f();
    }

    public int g() {
        return this.f36057c.g();
    }

    public com.smartdigimkt.w3.m h() {
        return this.f36057c.h();
    }

    public int i() {
        return this.f36057c.i();
    }

    public boolean j() {
        return this.f36057c.j();
    }

    public int k() {
        return this.f36057c.k();
    }

    public void l() {
        a(false);
    }

    public void m() {
        this.f36057c.l();
        this.g = this.f;
    }

    public void n() {
        this.f36062n = true;
    }

    public void b() {
        b(this.f36057c.b());
    }

    public void c(long j) {
        if (this.f36061l != j) {
            this.f36061l = j;
            this.j = true;
        }
    }

    public boolean d(int i2) {
        return this.f36057c.e(i2);
    }

    public long e() {
        return this.f36057c.e();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f36063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f36064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f36065c;
        public com.smartdigimkt.n4.a d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f36066e;

        public a(long j, int i2) {
            this.f36063a = j;
            this.f36064b = j + ((long) i2);
        }

        public void a(com.smartdigimkt.n4.a aVar, a aVar2) {
            this.d = aVar;
            this.f36066e = aVar2;
            this.f36065c = true;
        }

        public int a(long j) {
            return ((int) (j - this.f36063a)) + this.d.f36985b;
        }

        public a a() {
            this.d = null;
            a aVar = this.f36066e;
            this.f36066e = null;
            return aVar;
        }
    }

    private void b(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.f;
            if (j < aVar.f36064b) {
                break;
            }
            this.f36055a.a(aVar.d);
            this.f = this.f.a();
        }
        if (this.g.f36063a < aVar.f36063a) {
            this.g = aVar;
        }
    }

    private int c(int i2) {
        a aVar = this.f36059h;
        if (!aVar.f36065c) {
            aVar.a(this.f36055a.c(), new a(this.f36059h.f36064b, this.f36056b));
        }
        return Math.min(i2, (int) (this.f36059h.f36064b - this.m));
    }

    private void b(int i2) {
        long j = this.m + ((long) i2);
        this.m = j;
        a aVar = this.f36059h;
        if (j == aVar.f36064b) {
            this.f36059h = aVar.f36066e;
        }
    }

    public void a(int i2) {
        long jB = this.f36057c.b(i2);
        this.m = jB;
        if (jB != 0) {
            a aVar = this.f;
            if (jB != aVar.f36063a) {
                while (this.m > aVar.f36064b) {
                    aVar = aVar.f36066e;
                }
                a aVar2 = aVar.f36066e;
                a(aVar2);
                a aVar3 = new a(aVar.f36064b, this.f36056b);
                aVar.f36066e = aVar3;
                if (this.m == aVar.f36064b) {
                    aVar = aVar3;
                }
                this.f36059h = aVar;
                if (this.g == aVar2) {
                    this.g = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f);
        a aVar4 = new a(this.m, this.f36056b);
        this.f = aVar4;
        this.g = aVar4;
        this.f36059h = aVar4;
    }

    public int a() {
        return this.f36057c.a();
    }

    public int a(long j, boolean z2, boolean z3) {
        return this.f36057c.a(j, z2, z3);
    }

    public int a(com.smartdigimkt.w3.n nVar, com.smartdigimkt.z3.e eVar, boolean z2, boolean z3, long j) {
        int iA = this.f36057c.a(nVar, eVar, z2, z3, this.f36060i, this.d);
        if (iA == -5) {
            this.f36060i = nVar.f39343a;
            return -5;
        }
        if (iA != -4) {
            if (iA == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!eVar.c()) {
            if (eVar.d < j) {
                eVar.a(Integer.MIN_VALUE);
            }
            if (eVar.f()) {
                a(eVar, this.d);
            }
            eVar.f(this.d.f36051a);
            w.a aVar = this.d;
            a(aVar.f36052b, eVar.f40353c, aVar.f36051a);
        }
        return -4;
    }

    private void a(com.smartdigimkt.z3.e eVar, w.a aVar) {
        long j = aVar.f36052b;
        int iD = 1;
        this.f36058e.c(1);
        a(j, this.f36058e.f37616a, 1);
        long j2 = j + 1;
        byte b2 = this.f36058e.f37616a[0];
        boolean z2 = (b2 & 128) != 0;
        int i2 = b2 & AbstractJsonLexerKt.TC_INVALID;
        com.smartdigimkt.z3.b bVar = eVar.f40352b;
        if (bVar.f40337a == null) {
            bVar.f40337a = new byte[16];
        }
        a(j2, bVar.f40337a, i2);
        long j3 = j2 + ((long) i2);
        if (z2) {
            this.f36058e.c(2);
            a(j3, this.f36058e.f37616a, 2);
            j3 += 2;
            iD = this.f36058e.D();
        }
        int i3 = iD;
        com.smartdigimkt.z3.b bVar2 = eVar.f40352b;
        int[] iArr = bVar2.d;
        if (iArr == null || iArr.length < i3) {
            iArr = new int[i3];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar2.f40340e;
        if (iArr3 == null || iArr3.length < i3) {
            iArr3 = new int[i3];
        }
        int[] iArr4 = iArr3;
        if (z2) {
            int i4 = i3 * 6;
            this.f36058e.c(i4);
            a(j3, this.f36058e.f37616a, i4);
            j3 += (long) i4;
            this.f36058e.e(0);
            for (int i5 = 0; i5 < i3; i5++) {
                iArr2[i5] = this.f36058e.D();
                iArr4[i5] = this.f36058e.B();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.f36051a - ((int) (j3 - aVar.f36052b));
        }
        com.smartdigimkt.b4.m.a aVar2 = aVar.f36053c;
        com.smartdigimkt.z3.b bVar3 = eVar.f40352b;
        bVar3.a(i3, iArr2, iArr4, aVar2.f33929b, bVar3.f40337a, aVar2.f33928a, aVar2.f33930c, aVar2.d);
        long j4 = aVar.f36052b;
        int i6 = (int) (j3 - j4);
        aVar.f36052b = j4 + ((long) i6);
        aVar.f36051a -= i6;
    }

    private void a(long j, ByteBuffer byteBuffer, int i2) {
        a(j);
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (this.g.f36064b - j));
            a aVar = this.g;
            byteBuffer.put(aVar.d.f36984a, aVar.a(j), iMin);
            i2 -= iMin;
            j += (long) iMin;
            a aVar2 = this.g;
            if (j == aVar2.f36064b) {
                this.g = aVar2.f36066e;
            }
        }
    }

    private void a(long j, byte[] bArr, int i2) {
        a(j);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (this.g.f36064b - j));
            a aVar = this.g;
            System.arraycopy(aVar.d.f36984a, aVar.a(j), bArr, i2 - i3, iMin);
            i3 -= iMin;
            j += (long) iMin;
            a aVar2 = this.g;
            if (j == aVar2.f36064b) {
                this.g = aVar2.f36066e;
            }
        }
    }

    private void a(long j) {
        while (true) {
            a aVar = this.g;
            if (j < aVar.f36064b) {
                return;
            } else {
                this.g = aVar.f36066e;
            }
        }
    }

    public void a(b bVar) {
        this.o = bVar;
    }

    @Override // com.smartdigimkt.b4.m
    public void a(com.smartdigimkt.w3.m mVar) {
        com.smartdigimkt.w3.m mVarA = a(mVar, this.f36061l);
        boolean zA = this.f36057c.a(mVarA);
        this.k = mVar;
        this.j = false;
        b bVar = this.o;
        if (bVar == null || !zA) {
            return;
        }
        bVar.a(mVarA);
    }

    @Override // com.smartdigimkt.b4.m
    public int a(com.smartdigimkt.b4.f fVar, int i2, boolean z2) throws InterruptedException, IOException {
        int iC = c(i2);
        a aVar = this.f36059h;
        int iA = fVar.a(aVar.d.f36984a, aVar.a(this.m), iC);
        if (iA != -1) {
            b(iA);
            return iA;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.smartdigimkt.b4.m
    public void a(com.smartdigimkt.p4.s sVar, int i2) {
        while (i2 > 0) {
            int iC = c(i2);
            a aVar = this.f36059h;
            sVar.a(aVar.d.f36984a, aVar.a(this.m), iC);
            i2 -= iC;
            b(iC);
        }
    }

    @Override // com.smartdigimkt.b4.m
    public void a(long j, int i2, int i3, int i4, com.smartdigimkt.b4.m.a aVar) {
        if (this.j) {
            a(this.k);
        }
        if (this.f36062n) {
            if ((i2 & 1) == 0 || !this.f36057c.a(j)) {
                return;
            } else {
                this.f36062n = false;
            }
        }
        this.f36057c.a(j + this.f36061l, i2, (this.m - ((long) i3)) - ((long) i4), i3, aVar);
    }

    private void a(a aVar) {
        if (aVar.f36065c) {
            a aVar2 = this.f36059h;
            int i2 = (((int) (aVar2.f36063a - aVar.f36063a)) / this.f36056b) + (aVar2.f36065c ? 1 : 0);
            com.smartdigimkt.n4.a[] aVarArr = new com.smartdigimkt.n4.a[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                aVarArr[i3] = aVar.d;
                aVar = aVar.a();
            }
            this.f36055a.a(aVarArr);
        }
    }

    private static com.smartdigimkt.w3.m a(com.smartdigimkt.w3.m mVar, long j) {
        if (mVar == null) {
            return null;
        }
        if (j == 0) {
            return mVar;
        }
        long j2 = mVar.j;
        return j2 != Long.MAX_VALUE ? mVar.a(j2 + j) : mVar;
    }
}
