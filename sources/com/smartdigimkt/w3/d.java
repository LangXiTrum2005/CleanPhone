package com.smartdigimkt.w3;

import com.smartdigimkt.j4.f0;

/* JADX INFO: loaded from: classes6.dex */
public class d implements p {
    public static final int k = 15000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f39234l = 50000;
    public static final int m = 2500;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f39235n = 5000;
    public static final int o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f39236p = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.smartdigimkt.n4.l f39237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f39238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f39239c;
    private final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f39240e;
    private final int f;
    private final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.smartdigimkt.p4.v f39241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39242i;
    private boolean j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.smartdigimkt.n4.l f39243a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f39244b = 15000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f39245c = 50000;
        private int d = 2500;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f39246e = 5000;
        private int f = -1;
        private boolean g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.smartdigimkt.p4.v f39247h = null;

        public a a(com.smartdigimkt.n4.l lVar) {
            this.f39243a = lVar;
            return this;
        }

        public a a(int i2, int i3, int i4, int i5) {
            this.f39244b = i2;
            this.f39245c = i3;
            this.d = i4;
            this.f39246e = i5;
            return this;
        }

        public a a(int i2) {
            this.f = i2;
            return this;
        }

        public a a(boolean z2) {
            this.g = z2;
            return this;
        }

        public a a(com.smartdigimkt.p4.v vVar) {
            this.f39247h = vVar;
            return this;
        }

        public d a() {
            if (this.f39243a == null) {
                this.f39243a = new com.smartdigimkt.n4.l(true, 65536);
            }
            return new d(this.f39243a, this.f39244b, this.f39245c, this.d, this.f39246e, this.f, this.g, this.f39247h);
        }
    }

    public d() {
        this(new com.smartdigimkt.n4.l(true, 65536));
    }

    @Override // com.smartdigimkt.w3.p
    public boolean a() {
        return false;
    }

    @Override // com.smartdigimkt.w3.p
    public void b() {
        a(true);
    }

    @Override // com.smartdigimkt.w3.p
    public com.smartdigimkt.n4.b c() {
        return this.f39237a;
    }

    @Override // com.smartdigimkt.w3.p
    public void d() {
        a(true);
    }

    @Override // com.smartdigimkt.w3.p
    public long e() {
        return 0L;
    }

    @Override // com.smartdigimkt.w3.p
    public void f() {
        a(false);
    }

    @Deprecated
    public d(com.smartdigimkt.n4.l lVar) {
        this(lVar, 15000, 50000, 2500, 5000, -1, true);
    }

    @Override // com.smartdigimkt.w3.p
    public void a(y[] yVarArr, f0 f0Var, com.smartdigimkt.m4.g gVar) {
        int iA = this.f;
        if (iA == -1) {
            iA = a(yVarArr, gVar);
        }
        this.f39242i = iA;
        this.f39237a.a(iA);
    }

    @Deprecated
    public d(com.smartdigimkt.n4.l lVar, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        this(lVar, i2, i3, i4, i5, i6, z2, null);
    }

    @Deprecated
    public d(com.smartdigimkt.n4.l lVar, int i2, int i3, int i4, int i5, int i6, boolean z2, com.smartdigimkt.p4.v vVar) {
        a(i4, 0, "bufferForPlaybackMs", "0");
        a(i5, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i2, i4, "minBufferMs", "bufferForPlaybackMs");
        a(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i3, i2, "maxBufferMs", "minBufferMs");
        this.f39237a = lVar;
        this.f39238b = ((long) i2) * 1000;
        this.f39239c = ((long) i3) * 1000;
        this.d = ((long) i4) * 1000;
        this.f39240e = ((long) i5) * 1000;
        this.f = i6;
        this.g = z2;
        this.f39241h = vVar;
    }

    @Override // com.smartdigimkt.w3.p
    public boolean a(long j, float f) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = this.f39237a.b() >= this.f39242i;
        boolean z5 = this.j;
        long jMin = this.f39238b;
        if (f > 1.0f) {
            jMin = Math.min(com.smartdigimkt.p4.f0.a(jMin, f), this.f39239c);
        }
        if (j < jMin) {
            if (!this.g && z4) {
                z3 = false;
            }
            this.j = z3;
        } else if (j > this.f39239c || z4) {
            this.j = false;
        }
        com.smartdigimkt.p4.v vVar = this.f39241h;
        if (vVar != null && (z2 = this.j) != z5) {
            if (z2) {
                vVar.a(0);
            } else {
                vVar.e(0);
            }
        }
        return this.j;
    }

    @Override // com.smartdigimkt.w3.p
    public boolean a(long j, float f, boolean z2) {
        long jB = com.smartdigimkt.p4.f0.b(j, f);
        long j2 = z2 ? this.f39240e : this.d;
        if (j2 <= 0 || jB >= j2) {
            return true;
        }
        return !this.g && this.f39237a.b() >= this.f39242i;
    }

    public int a(y[] yVarArr, com.smartdigimkt.m4.g gVar) {
        int iC = 0;
        for (int i2 = 0; i2 < yVarArr.length; i2++) {
            if (gVar.a(i2) != null) {
                iC = com.smartdigimkt.p4.f0.c(yVarArr[i2].e()) + iC;
            }
        }
        return iC;
    }

    private void a(boolean z2) {
        this.f39242i = 0;
        com.smartdigimkt.p4.v vVar = this.f39241h;
        if (vVar != null && this.j) {
            vVar.e(0);
        }
        this.j = false;
        if (z2) {
            this.f39237a.e();
        }
    }

    private static void a(int i2, int i3, String str, String str2) {
        com.smartdigimkt.p4.a.a(i2 >= i3, str + " cannot be less than " + str2);
    }
}
