package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ua f27313a = new Ua();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f27314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f27315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f27316c;

        public a(boolean z10, long j10, long j11) {
            this.f27314a = z10;
            this.f27315b = j10;
            this.f27316c = j11;
        }

        public final boolean a() {
            return this.f27314a;
        }

        public final long b() {
            return this.f27315b;
        }

        public final long c() {
            return this.f27316c;
        }

        public final long d() {
            return this.f27315b;
        }

        public final long e() {
            return this.f27316c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27314a == aVar.f27314a && this.f27315b == aVar.f27315b && this.f27316c == aVar.f27316c;
        }

        public final boolean f() {
            return this.f27314a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.f27314a;
            ?? r0 = z10;
            if (z10) {
                r0 = 1;
            }
            return Long.hashCode(this.f27316c) + com.applovin.impl.ca.j(this.f27315b, r0 * 31, 31);
        }

        public String toString() {
            return "BannerStrategyConfig(isAutoRefreshEnabled=" + this.f27314a + ", refreshInterval=" + this.f27315b + ", visibilityCheckerInterval=" + this.f27316c + ")";
        }

        public final a a(boolean z10, long j10, long j11) {
            return new a(z10, j10, j11);
        }

        public static /* synthetic */ a a(a aVar, boolean z10, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f27314a;
            }
            if ((i10 & 2) != 0) {
                j10 = aVar.f27315b;
            }
            if ((i10 & 4) != 0) {
                j11 = aVar.f27316c;
            }
            return aVar.a(z10, j10, j11);
        }
    }

    private Ua() {
    }

    public final InterfaceC0677ya a(C0506p0 adTools, W2 bannerContainer, a config, J2 bannerAdProperties, InterfaceC0695za strategyListener, N2 bannerAdUnitFactory, InterfaceC0510p4 timeProvider) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.n.f(strategyListener, "strategyListener");
        kotlin.jvm.internal.n.f(bannerAdUnitFactory, "bannerAdUnitFactory");
        kotlin.jvm.internal.n.f(timeProvider, "timeProvider");
        IronLog.INTERNAL.verbose("Creating banner strategy, isAutoRefreshEnabled: " + config.f() + ", refreshInterval: " + config.d());
        if (config.f()) {
            return new Ca(adTools, bannerContainer, config.d(), config.e(), bannerAdProperties, strategyListener, bannerAdUnitFactory, null, timeProvider, Kb.f26413u.d().h().y(), 128, null);
        }
        Oa oa2 = new Oa(adTools, bannerContainer, bannerAdUnitFactory);
        oa2.a(strategyListener);
        return oa2;
    }
}
