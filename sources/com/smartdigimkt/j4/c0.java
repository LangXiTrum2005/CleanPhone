package com.smartdigimkt.j4;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class c0 implements r, com.smartdigimkt.n4.t.a<c> {
    private static final int r0 = 1024;
    private final com.smartdigimkt.n4.k X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final com.smartdigimkt.n4.h.a f35946Y;
    private final int Z;
    private final t.a e0;
    private final f0 f0;
    private final long h0;
    final com.smartdigimkt.w3.m j0;
    final boolean k0;
    boolean l0;
    boolean m0;
    boolean n0;
    byte[] o0;
    int p0;
    private int q0;
    private final ArrayList<b> g0 = new ArrayList<>();
    final com.smartdigimkt.n4.t i0 = new com.smartdigimkt.n4.t("Loader:SingleSampleMediaPeriod");

    public static final class c implements com.smartdigimkt.n4.t.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.smartdigimkt.n4.k f35948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.smartdigimkt.n4.h f35949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35950c;
        private byte[] d;

        public c(com.smartdigimkt.n4.k kVar, com.smartdigimkt.n4.h hVar) {
            this.f35948a = kVar;
            this.f35949b = hVar;
        }

        @Override // com.smartdigimkt.n4.t.c
        public void b() {
        }

        @Override // com.smartdigimkt.n4.t.c
        public void a() throws InterruptedException, IOException {
            int iA = 0;
            this.f35950c = 0;
            try {
                this.f35949b.a(this.f35948a);
                while (iA != -1) {
                    int i2 = this.f35950c + iA;
                    this.f35950c = i2;
                    byte[] bArr = this.d;
                    if (bArr == null) {
                        this.d = new byte[1024];
                    } else if (i2 == bArr.length) {
                        this.d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    com.smartdigimkt.n4.h hVar = this.f35949b;
                    byte[] bArr2 = this.d;
                    int i3 = this.f35950c;
                    iA = hVar.a(bArr2, i3, bArr2.length - i3);
                }
            } finally {
                com.smartdigimkt.p4.f0.a(this.f35949b);
            }
        }
    }

    public c0(com.smartdigimkt.n4.k kVar, com.smartdigimkt.n4.h.a aVar, com.smartdigimkt.w3.m mVar, long j, int i2, t.a aVar2, boolean z2) {
        this.X = kVar;
        this.f35946Y = aVar;
        this.j0 = mVar;
        this.h0 = j;
        this.Z = i2;
        this.e0 = aVar2;
        this.k0 = z2;
        this.f0 = new f0(new e0(mVar));
        aVar2.a();
    }

    @Override // com.smartdigimkt.j4.r
    public long a(long j, com.smartdigimkt.w3.c0 c0Var) {
        return j;
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public void b(long j) {
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public long c() {
        return this.m0 ? Long.MIN_VALUE : 0L;
    }

    @Override // com.smartdigimkt.j4.r
    public long e() {
        if (this.l0) {
            return -9223372036854775807L;
        }
        this.e0.c();
        this.l0 = true;
        return -9223372036854775807L;
    }

    @Override // com.smartdigimkt.j4.r
    public f0 f() {
        return this.f0;
    }

    @Override // com.smartdigimkt.j4.r
    public void g() throws IOException {
    }

    public final class b implements y {
        private static final int e0 = 0;
        private static final int f0 = 1;
        private static final int g0 = 2;
        private int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private boolean f35947Y;

        private b() {
        }

        private void c() {
            if (this.f35947Y) {
                return;
            }
            c0.this.e0.a(com.smartdigimkt.p4.o.f(c0.this.j0.f), c0.this.j0, 0, (Object) null, 0L);
            this.f35947Y = true;
        }

        @Override // com.smartdigimkt.j4.y
        public void a() throws IOException {
            c0 c0Var = c0.this;
            if (c0Var.k0) {
                return;
            }
            c0Var.i0.a();
        }

        public void b() {
            if (this.X == 2) {
                this.X = 1;
            }
        }

        @Override // com.smartdigimkt.j4.y
        public int d(long j) {
            if (j <= 0 || this.X == 2) {
                return 0;
            }
            this.X = 2;
            c();
            return 1;
        }

        @Override // com.smartdigimkt.j4.y
        public boolean isReady() {
            return c0.this.m0;
        }

        @Override // com.smartdigimkt.j4.y
        public int a(com.smartdigimkt.w3.n nVar, com.smartdigimkt.z3.e eVar, boolean z2) {
            int i2 = this.X;
            if (i2 == 2) {
                eVar.a(4);
                return -4;
            }
            if (!z2 && i2 != 0) {
                c0 c0Var = c0.this;
                if (!c0Var.m0) {
                    return -3;
                }
                if (c0Var.n0) {
                    eVar.d = 0L;
                    eVar.a(1);
                    eVar.f(c0.this.p0);
                    ByteBuffer byteBuffer = eVar.f40353c;
                    c0 c0Var2 = c0.this;
                    byteBuffer.put(c0Var2.o0, 0, c0Var2.p0);
                    c();
                } else {
                    eVar.a(4);
                }
                this.X = 2;
                return -4;
            }
            nVar.f39343a = c0.this.j0;
            this.X = 1;
            return -5;
        }
    }

    @Override // com.smartdigimkt.j4.r
    public void a(long j, boolean z2) {
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public long b() {
        return (this.m0 || this.i0.c()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.smartdigimkt.j4.r
    public long c(long j) {
        for (int i2 = 0; i2 < this.g0.size(); i2++) {
            this.g0.get(i2).b();
        }
        return j;
    }

    public void a() {
        this.i0.d();
        this.e0.b();
    }

    @Override // com.smartdigimkt.j4.r
    public void a(r.a aVar, long j) {
        aVar.a((r) this);
    }

    @Override // com.smartdigimkt.j4.r
    public long a(com.smartdigimkt.m4.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j) {
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            y yVar = yVarArr[i2];
            if (yVar != null && (fVarArr[i2] == null || !zArr[i2])) {
                this.g0.remove(yVar);
                yVarArr[i2] = null;
            }
            if (yVarArr[i2] == null && fVarArr[i2] != null) {
                b bVar = new b();
                this.g0.add(bVar);
                yVarArr[i2] = bVar;
                zArr2[i2] = true;
            }
        }
        return j;
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public boolean a(long j) {
        if (this.m0 || this.i0.c()) {
            return false;
        }
        this.e0.a(this.X, 1, -1, this.j0, 0, null, 0L, this.h0, this.i0.a(new c(this.X, this.f35946Y.a()), this, this.Z));
        return true;
    }

    @Override // com.smartdigimkt.n4.t.a
    public void a(c cVar, long j, long j2) {
        this.e0.b(cVar.f35948a, 1, -1, this.j0, 0, null, 0L, this.h0, j, j2, cVar.f35950c);
        this.p0 = cVar.f35950c;
        this.o0 = cVar.d;
        this.m0 = true;
        this.n0 = true;
    }

    @Override // com.smartdigimkt.n4.t.a
    public void a(c cVar, long j, long j2, boolean z2) {
        this.e0.a(cVar.f35948a, 1, -1, null, 0, null, 0L, this.h0, j, j2, cVar.f35950c);
    }

    @Override // com.smartdigimkt.n4.t.a
    public int a(c cVar, long j, long j2, IOException iOException) {
        int i2 = this.q0 + 1;
        this.q0 = i2;
        boolean z2 = this.k0 && i2 >= this.Z;
        this.e0.a(cVar.f35948a, 1, -1, this.j0, 0, null, 0L, this.h0, j, j2, cVar.f35950c, iOException, z2);
        if (!z2) {
            return 0;
        }
        this.m0 = true;
        return 2;
    }
}
