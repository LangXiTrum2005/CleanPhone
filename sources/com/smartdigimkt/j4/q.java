package com.smartdigimkt.j4;

/* JADX INFO: loaded from: classes.dex */
public final class q extends f<Void> {
    private final s j0;
    private final int k0;
    private int l0;

    public static final class a extends p {
        public a(com.smartdigimkt.w3.e0 e0Var) {
            super(e0Var);
        }

        @Override // com.smartdigimkt.j4.p, com.smartdigimkt.w3.e0
        public int a(int i2, int i3, boolean z2) {
            int iA = this.f36012b.a(i2, i3, z2);
            return iA == -1 ? a(z2) : iA;
        }

        @Override // com.smartdigimkt.j4.p, com.smartdigimkt.w3.e0
        public int b(int i2, int i3, boolean z2) {
            int iB = this.f36012b.b(i2, i3, z2);
            return iB == -1 ? b(z2) : iB;
        }
    }

    public static final class b extends com.smartdigimkt.j4.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.smartdigimkt.w3.e0 f36013e;
        private final int f;
        private final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f36014h;

        public b(com.smartdigimkt.w3.e0 e0Var, int i2) {
            super(false, new a0.b(i2));
            this.f36013e = e0Var;
            int iA = e0Var.a();
            this.f = iA;
            this.g = e0Var.b();
            this.f36014h = i2;
            if (iA > 0) {
                com.smartdigimkt.p4.a.b(i2 <= Integer.MAX_VALUE / iA, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.smartdigimkt.w3.e0
        public int a() {
            return this.f * this.f36014h;
        }

        @Override // com.smartdigimkt.w3.e0
        public int b() {
            return this.g * this.f36014h;
        }

        @Override // com.smartdigimkt.j4.a
        public Object c(int i2) {
            return Integer.valueOf(i2);
        }

        @Override // com.smartdigimkt.j4.a
        public int d(int i2) {
            return i2 * this.f;
        }

        @Override // com.smartdigimkt.j4.a
        public int e(int i2) {
            return i2 * this.g;
        }

        @Override // com.smartdigimkt.j4.a
        public com.smartdigimkt.w3.e0 f(int i2) {
            return this.f36013e;
        }

        @Override // com.smartdigimkt.j4.a
        public int a(int i2) {
            return i2 / this.f;
        }

        @Override // com.smartdigimkt.j4.a
        public int b(int i2) {
            return i2 / this.g;
        }

        @Override // com.smartdigimkt.j4.a
        public int b(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }
    }

    public q(s sVar) {
        this(sVar, Integer.MAX_VALUE);
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.c
    public void g() {
        super.g();
        this.l0 = 0;
    }

    public q(s sVar, int i2) {
        com.smartdigimkt.p4.a.a(i2 > 0);
        this.j0 = sVar;
        this.k0 = i2;
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.c
    public void a(com.smartdigimkt.w3.h hVar, boolean z2) {
        super.a(hVar, z2);
        a((Object) null, this.j0);
    }

    @Override // com.smartdigimkt.j4.s
    public r a(s.a aVar, com.smartdigimkt.n4.b bVar) {
        if (this.k0 != Integer.MAX_VALUE) {
            return this.j0.a(aVar.a(aVar.f36015a % this.l0), bVar);
        }
        return this.j0.a(aVar, bVar);
    }

    @Override // com.smartdigimkt.j4.s
    public void a(r rVar) {
        this.j0.a(rVar);
    }

    @Override // com.smartdigimkt.j4.f
    public void a(Void r1, s sVar, com.smartdigimkt.w3.e0 e0Var, Object obj) {
        com.smartdigimkt.w3.e0 aVar;
        this.l0 = e0Var.a();
        if (this.k0 != Integer.MAX_VALUE) {
            aVar = new b(e0Var, this.k0);
        } else {
            aVar = new a(e0Var);
        }
        a(aVar, obj);
    }
}
