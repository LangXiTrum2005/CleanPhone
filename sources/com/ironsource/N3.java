package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class N3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0323ee f26628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E9 f26629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U2 f26630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Qb f26631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1 f26632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0253ag f26633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.ironsource.mediationsdk.adquality.a f26634g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C0323ee f26635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private E9 f26636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private U2 f26637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Qb f26638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private C1 f26639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C0253ag f26640f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.ironsource.mediationsdk.adquality.a f26641g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final a a(C0323ee c0323ee, E9 e10, U2 u6, Qb qb2, C1 c4, C0253ag c0253ag, com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(c0323ee, e10, u6, qb2, c4, c0253ag, aVar);
        }

        public final C0323ee b() {
            return this.f26635a;
        }

        public final E9 c() {
            return this.f26636b;
        }

        public final U2 d() {
            return this.f26637c;
        }

        public final Qb e() {
            return this.f26638d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.n.a(this.f26635a, aVar.f26635a) && kotlin.jvm.internal.n.a(this.f26636b, aVar.f26636b) && kotlin.jvm.internal.n.a(this.f26637c, aVar.f26637c) && kotlin.jvm.internal.n.a(this.f26638d, aVar.f26638d) && kotlin.jvm.internal.n.a(this.f26639e, aVar.f26639e) && kotlin.jvm.internal.n.a(this.f26640f, aVar.f26640f) && kotlin.jvm.internal.n.a(this.f26641g, aVar.f26641g);
        }

        public final C1 f() {
            return this.f26639e;
        }

        public final C0253ag g() {
            return this.f26640f;
        }

        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.f26641g;
        }

        public int hashCode() {
            C0323ee c0323ee = this.f26635a;
            int iHashCode = (c0323ee == null ? 0 : c0323ee.hashCode()) * 31;
            E9 e10 = this.f26636b;
            int iHashCode2 = (iHashCode + (e10 == null ? 0 : e10.hashCode())) * 31;
            U2 u6 = this.f26637c;
            int iHashCode3 = (iHashCode2 + (u6 == null ? 0 : u6.hashCode())) * 31;
            Qb qb2 = this.f26638d;
            int iHashCode4 = (iHashCode3 + (qb2 == null ? 0 : qb2.hashCode())) * 31;
            C1 c4 = this.f26639e;
            int iHashCode5 = (iHashCode4 + (c4 == null ? 0 : c4.hashCode())) * 31;
            C0253ag c0253ag = this.f26640f;
            int iHashCode6 = (iHashCode5 + (c0253ag == null ? 0 : c0253ag.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.f26641g;
            return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.f26641g;
        }

        public final C1 j() {
            return this.f26639e;
        }

        public final U2 k() {
            return this.f26637c;
        }

        public final E9 l() {
            return this.f26636b;
        }

        public final Qb m() {
            return this.f26638d;
        }

        public final C0323ee n() {
            return this.f26635a;
        }

        public final C0253ag o() {
            return this.f26640f;
        }

        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f26635a + ", interstitialConfigurations=" + this.f26636b + ", bannerConfigurations=" + this.f26637c + ", nativeAdConfigurations=" + this.f26638d + ", applicationConfigurations=" + this.f26639e + ", testSuiteSettings=" + this.f26640f + ", adQualityConfigurations=" + this.f26641g + ")";
        }

        public a(C0323ee c0323ee, E9 e10, U2 u6, Qb qb2, C1 c4, C0253ag c0253ag, com.ironsource.mediationsdk.adquality.a aVar) {
            this.f26635a = c0323ee;
            this.f26636b = e10;
            this.f26637c = u6;
            this.f26638d = qb2;
            this.f26639e = c4;
            this.f26640f = c0253ag;
            this.f26641g = aVar;
        }

        public static /* synthetic */ a a(a aVar, C0323ee c0323ee, E9 e10, U2 u6, Qb qb2, C1 c4, C0253ag c0253ag, com.ironsource.mediationsdk.adquality.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c0323ee = aVar.f26635a;
            }
            if ((i10 & 2) != 0) {
                e10 = aVar.f26636b;
            }
            if ((i10 & 4) != 0) {
                u6 = aVar.f26637c;
            }
            if ((i10 & 8) != 0) {
                qb2 = aVar.f26638d;
            }
            if ((i10 & 16) != 0) {
                c4 = aVar.f26639e;
            }
            if ((i10 & 32) != 0) {
                c0253ag = aVar.f26640f;
            }
            if ((i10 & 64) != 0) {
                aVar2 = aVar.f26641g;
            }
            C0253ag c0253ag2 = c0253ag;
            com.ironsource.mediationsdk.adquality.a aVar3 = aVar2;
            C1 c5 = c4;
            U2 u10 = u6;
            return aVar.a(c0323ee, e10, u10, qb2, c5, c0253ag2, aVar3);
        }

        public final void b(C0323ee c0323ee) {
            this.f26635a = c0323ee;
        }

        public final void a(C0253ag c0253ag) {
            this.f26640f = c0253ag;
        }

        public final void b(E9 e10) {
            this.f26636b = e10;
        }

        public final a a(C0323ee c0323ee) {
            this.f26635a = c0323ee;
            return this;
        }

        public final void b(U2 u6) {
            this.f26637c = u6;
        }

        public final a a(E9 e10) {
            this.f26636b = e10;
            return this;
        }

        public final void b(Qb qb2) {
            this.f26638d = qb2;
        }

        public final a a(U2 u6) {
            this.f26637c = u6;
            return this;
        }

        public final void b(C1 c4) {
            this.f26639e = c4;
        }

        public final a a(Qb qb2) {
            this.f26638d = qb2;
            return this;
        }

        public final void b(com.ironsource.mediationsdk.adquality.a aVar) {
            this.f26641g = aVar;
        }

        public final a a(C1 c4) {
            this.f26639e = c4;
            return this;
        }

        public final a b(C0253ag c0253ag) {
            this.f26640f = c0253ag;
            return this;
        }

        public final a a(com.ironsource.mediationsdk.adquality.a aVar) {
            this.f26641g = aVar;
            return this;
        }

        public /* synthetic */ a(C0323ee c0323ee, E9 e10, U2 u6, Qb qb2, C1 c4, C0253ag c0253ag, com.ironsource.mediationsdk.adquality.a aVar, int i10, kotlin.jvm.internal.g gVar) {
            this((i10 & 1) != 0 ? null : c0323ee, (i10 & 2) != 0 ? null : e10, (i10 & 4) != 0 ? null : u6, (i10 & 8) != 0 ? null : qb2, (i10 & 16) != 0 ? null : c4, (i10 & 32) != 0 ? null : c0253ag, (i10 & 64) != 0 ? null : aVar);
        }

        public final N3 a() {
            return new N3(this.f26635a, this.f26636b, this.f26637c, this.f26638d, this.f26639e, this.f26640f, this.f26641g, null);
        }
    }

    public /* synthetic */ N3(C0323ee c0323ee, E9 e10, U2 u6, Qb qb2, C1 c4, C0253ag c0253ag, com.ironsource.mediationsdk.adquality.a aVar, kotlin.jvm.internal.g gVar) {
        this(c0323ee, e10, u6, qb2, c4, c0253ag, aVar);
    }

    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.f26634g;
    }

    public final C1 b() {
        return this.f26632e;
    }

    public final U2 c() {
        return this.f26630c;
    }

    public final E9 d() {
        return this.f26629b;
    }

    public final Qb e() {
        return this.f26631d;
    }

    public final C0323ee f() {
        return this.f26628a;
    }

    public final C0253ag g() {
        return this.f26633f;
    }

    public String toString() {
        return "configurations(\n" + this.f26628a + "\n" + this.f26629b + "\n" + this.f26630c + "\n" + this.f26631d + ")";
    }

    private N3(C0323ee c0323ee, E9 e10, U2 u6, Qb qb2, C1 c4, C0253ag c0253ag, com.ironsource.mediationsdk.adquality.a aVar) {
        this.f26628a = c0323ee;
        this.f26629b = e10;
        this.f26630c = u6;
        this.f26631d = qb2;
        this.f26632e = c4;
        this.f26633f = c0253ag;
        this.f26634g = aVar;
    }
}
