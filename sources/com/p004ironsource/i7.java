package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00042\u00020\u0001:\u0003\f\u0010\u0004B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H\u0004J\b\u0010\n\u001a\u00020\tH\u0004R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/i7;", "", "", f.j, "c", "e", g.f40227p, "", i.f37957c, "", "d", "Lcom/ironsource/i7$b;", "a", "Lcom/ironsource/i7$b;", com.smartdigimkt.q0.b.i0, "Lcom/ironsource/j6;", "b", "Lcom/ironsource/j6;", "bannerAdProperties", "<init>", "(Lcom/ironsource/i7$b;Lcom/ironsource/j6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class i7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j6 bannerAdProperties;

    /* JADX INFO: renamed from: com.ironsource.i7$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/i7$a;", "", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/w6;", "bannerContainer", "Lcom/ironsource/i7$b;", com.smartdigimkt.q0.b.i0, "Lcom/ironsource/j6;", "bannerAdProperties", "Lcom/ironsource/l7;", "bannerStrategyListener", "Lcom/ironsource/n6;", "createBannerAdUnitFactory", "Lcom/ironsource/i7;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.ironsource.i7$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0280a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25324a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.TIMED_LOAD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.TIMED_SHOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f25324a = iArr;
            }
        }

        private Companion() {
        }

        public final i7 a(m1 adTools, w6 bannerContainer, b config, j6 bannerAdProperties, l7 bannerStrategyListener, n6 createBannerAdUnitFactory) {
            Intrinsics.f(adTools, "adTools");
            Intrinsics.f(bannerContainer, "bannerContainer");
            Intrinsics.f(config, "config");
            Intrinsics.f(bannerAdProperties, "bannerAdProperties");
            Intrinsics.f(bannerStrategyListener, "bannerStrategyListener");
            Intrinsics.f(createBannerAdUnitFactory, "createBannerAdUnitFactory");
            int i2 = C0280a.f25324a[config.e().ordinal()];
            if (i2 == 1) {
                return new bw(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
            }
            if (i2 == 2) {
                return new cw(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/ironsource/i7$b;", "", "Lcom/ironsource/i7$c;", "a", "", "b", "", "c", "strategyType", v6.d, "isAutoRefreshEnabled", "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "Lcom/ironsource/i7$c;", "e", "()Lcom/ironsource/i7$c;", "J", "d", "()J", "Z", f.j, "()Z", "<init>", "(Lcom/ironsource/i7$c;JZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c strategyType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long refreshInterval;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isAutoRefreshEnabled;

        public b(c strategyType, long j, boolean z2) {
            Intrinsics.f(strategyType, "strategyType");
            this.strategyType = strategyType;
            this.refreshInterval = j;
            this.isAutoRefreshEnabled = z2;
        }

        public static /* synthetic */ b a(b bVar, c cVar, long j, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cVar = bVar.strategyType;
            }
            if ((i2 & 2) != 0) {
                j = bVar.refreshInterval;
            }
            if ((i2 & 4) != 0) {
                z2 = bVar.isAutoRefreshEnabled;
            }
            return bVar.a(cVar, j, z2);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getRefreshInterval() {
            return this.refreshInterval;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsAutoRefreshEnabled() {
            return this.isAutoRefreshEnabled;
        }

        public final long d() {
            return this.refreshInterval;
        }

        public final c e() {
            return this.strategyType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.strategyType == bVar.strategyType && this.refreshInterval == bVar.refreshInterval && this.isAutoRefreshEnabled == bVar.isAutoRefreshEnabled;
        }

        public final boolean f() {
            return this.isAutoRefreshEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int iB = a.b(this.strategyType.hashCode() * 31, 31, this.refreshInterval);
            boolean z2 = this.isAutoRefreshEnabled;
            ?? r1 = z2;
            if (z2) {
                r1 = 1;
            }
            return iB + r1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Config(strategyType=");
            sb.append(this.strategyType);
            sb.append(", refreshInterval=");
            sb.append(this.refreshInterval);
            sb.append(", isAutoRefreshEnabled=");
            return a.r(sb, this.isAutoRefreshEnabled, ')');
        }

        public final b a(c strategyType, long refreshInterval, boolean isAutoRefreshEnabled) {
            Intrinsics.f(strategyType, "strategyType");
            return new b(strategyType, refreshInterval, isAutoRefreshEnabled);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getStrategyType() {
            return this.strategyType;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ironsource/i7$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public enum c {
        TIMED_LOAD,
        TIMED_SHOW
    }

    public i7(b config, j6 bannerAdProperties) {
        Intrinsics.f(config, "config");
        Intrinsics.f(bannerAdProperties, "bannerAdProperties");
        this.config = config;
        this.bannerAdProperties = bannerAdProperties;
    }

    public abstract void c();

    public final boolean d() {
        Boolean autoRefresh = this.bannerAdProperties.getAutoRefresh();
        return autoRefresh != null ? autoRefresh.booleanValue() : this.config.f();
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public final long i() {
        Long refreshInterval = this.bannerAdProperties.getRefreshInterval();
        return refreshInterval != null ? refreshInterval.longValue() : this.config.d();
    }
}
