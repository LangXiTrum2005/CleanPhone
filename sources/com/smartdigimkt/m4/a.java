package com.smartdigimkt.m4;

import com.smartdigimkt.j4.e0;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.w3.m;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a extends b {
    public static final int s = 10000;
    public static final int t = 25000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f36630u = 25000;
    public static final float v = 0.75f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f36631w = 0.75f;
    public static final long x = 2000;
    private final com.smartdigimkt.n4.d g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f36632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f36633i;
    private final long j;
    private final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f36634l;
    private final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.smartdigimkt.p4.c f36635n;
    private float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f36636p;
    private int q;
    private long r;

    /* JADX INFO: renamed from: com.smartdigimkt.m4.a$a, reason: collision with other inner class name */
    public static final class C0539a implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.smartdigimkt.n4.d f36637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f36639c;
        private final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f36640e;
        private final float f;
        private final long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final com.smartdigimkt.p4.c f36641h;

        public C0539a(com.smartdigimkt.n4.d dVar) {
            this(dVar, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, com.smartdigimkt.p4.c.f37520a);
        }

        @Override // com.smartdigimkt.m4.f.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(e0 e0Var, int... iArr) {
            return new a(e0Var, iArr, this.f36637a, this.f36638b, this.f36639c, this.d, this.f36640e, this.f, this.g, this.f36641h);
        }

        public C0539a(com.smartdigimkt.n4.d dVar, int i2, int i3, int i4, float f) {
            this(dVar, i2, i3, i4, f, 0.75f, 2000L, com.smartdigimkt.p4.c.f37520a);
        }

        public C0539a(com.smartdigimkt.n4.d dVar, int i2, int i3, int i4, float f, float f2, long j, com.smartdigimkt.p4.c cVar) {
            this.f36637a = dVar;
            this.f36638b = i2;
            this.f36639c = i3;
            this.d = i4;
            this.f36640e = f;
            this.f = f2;
            this.g = j;
            this.f36641h = cVar;
        }
    }

    public a(e0 e0Var, int[] iArr, com.smartdigimkt.n4.d dVar) {
        this(e0Var, iArr, dVar, 10000L, 25000L, 25000L, 0.75f, 0.75f, 2000L, com.smartdigimkt.p4.c.f37520a);
    }

    private long b(long j) {
        return (j == -9223372036854775807L || j > this.f36632h) ? this.f36632h : (long) (j * this.f36634l);
    }

    @Override // com.smartdigimkt.m4.b, com.smartdigimkt.m4.f
    public void a(float f) {
        this.o = f;
    }

    @Override // com.smartdigimkt.m4.b, com.smartdigimkt.m4.f
    public void d() {
        this.r = -9223372036854775807L;
    }

    @Override // com.smartdigimkt.m4.f
    public int h() {
        return this.q;
    }

    @Override // com.smartdigimkt.m4.f
    public int i() {
        return this.f36636p;
    }

    @Override // com.smartdigimkt.m4.f
    public Object k() {
        return null;
    }

    public a(e0 e0Var, int[] iArr, com.smartdigimkt.n4.d dVar, long j, long j2, long j3, float f, float f2, long j4, com.smartdigimkt.p4.c cVar) {
        super(e0Var, iArr);
        this.g = dVar;
        this.f36632h = j * 1000;
        this.f36633i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = f;
        this.f36634l = f2;
        this.m = j4;
        this.f36635n = cVar;
        this.o = 1.0f;
        this.q = 1;
        this.r = -9223372036854775807L;
        this.f36636p = a(Long.MIN_VALUE);
    }

    @Override // com.smartdigimkt.m4.f
    public void a(long j, long j2, long j3) {
        long jB = this.f36635n.b();
        int i2 = this.f36636p;
        int iA = a(jB);
        this.f36636p = iA;
        if (iA == i2) {
            return;
        }
        if (!b(i2, jB)) {
            m mVarA = a(i2);
            m mVarA2 = a(this.f36636p);
            if (mVarA2.f39332b > mVarA.f39332b && j2 < b(j3)) {
                this.f36636p = i2;
            } else if (mVarA2.f39332b < mVarA.f39332b && j2 >= this.f36633i) {
                this.f36636p = i2;
            }
        }
        if (this.f36636p != i2) {
            this.q = 3;
        }
    }

    @Override // com.smartdigimkt.m4.b, com.smartdigimkt.m4.f
    public int a(long j, List<? extends com.smartdigimkt.l4.i> list) {
        int i2;
        int i3;
        long jB = this.f36635n.b();
        long j2 = this.r;
        if (j2 != -9223372036854775807L && jB - j2 < this.m) {
            return list.size();
        }
        this.r = jB;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (f0.b(list.get(size - 1).f - j, this.o) >= this.j) {
            m mVarA = a(a(jB));
            for (int i4 = 0; i4 < size; i4++) {
                com.smartdigimkt.l4.i iVar = list.get(i4);
                m mVar = iVar.f36342c;
                if (f0.b(iVar.f - j, this.o) >= this.j && mVar.f39332b < mVarA.f39332b && (i2 = mVar.f39337l) != -1 && i2 < 720 && (i3 = mVar.k) != -1 && i3 < 1280 && i2 < mVarA.f39337l) {
                    return i4;
                }
            }
        }
        return size;
    }

    private int a(long j) {
        long jA = (long) (this.g.a() * this.k);
        int i2 = 0;
        for (int i3 = 0; i3 < this.f36643b; i3++) {
            if (j == Long.MIN_VALUE || !b(i3, j)) {
                if (Math.round(a(i3).f39332b * this.o) <= jA) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
