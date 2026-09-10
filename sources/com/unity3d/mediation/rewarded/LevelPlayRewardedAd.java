package com.unity3d.mediation.rewarded;

import android.app.Activity;
import com.ironsource.C0333f6;
import com.ironsource.C0506p0;
import com.ironsource.C0517pb;
import com.ironsource.C0638w7;
import com.ironsource.F0;
import com.ironsource.InterfaceC0510p4;
import com.ironsource.Kb;
import com.ironsource.Ya;
import com.ironsource.Z0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayRewardedAd {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0517pb f38543b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final boolean isPlacementCapped(String placementName) {
            n.f(placementName, "placementName");
            return Ya.f28003o.a(placementName, LevelPlay.AdFormat.REWARDED);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Config implements Ya.b {
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Double f38544a;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Double f38545a;

            public final Config build() {
                return new Config(this.f38545a);
            }

            public final Builder setBidFloor(double d10) {
                this.f38545a = Double.valueOf(d10);
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final Config empty() {
                return new Config(null, 1, 0 == true ? 1 : 0);
            }

            private Companion() {
            }
        }

        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Config copy$default(Config config, Double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = config.f38544a;
            }
            return config.copy(d10);
        }

        public final Double component1() {
            return this.f38544a;
        }

        public final Config copy(Double d10) {
            return new Config(d10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && n.a(this.f38544a, ((Config) obj).f38544a);
        }

        @Override // com.ironsource.Ya.b
        public Double getBidFloor() {
            return this.f38544a;
        }

        public int hashCode() {
            Double d10 = this.f38544a;
            if (d10 == null) {
                return 0;
            }
            return d10.hashCode();
        }

        public String toString() {
            return "Config(bidFloor=" + this.f38544a + ")";
        }

        public Config(Double d10) {
            this.f38544a = d10;
        }

        public /* synthetic */ Config(Double d10, int i10, g gVar) {
            this((i10 & 1) != 0 ? null : d10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(String adUnitId) {
        this(adUnitId, Config.Companion.empty());
        n.f(adUnitId, "adUnitId");
    }

    public static /* synthetic */ LevelPlayReward getReward$default(LevelPlayRewardedAd levelPlayRewardedAd, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return levelPlayRewardedAd.getReward(str);
    }

    public static final boolean isPlacementCapped(String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayRewardedAd levelPlayRewardedAd, Activity activity, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        levelPlayRewardedAd.showAd(activity, str);
    }

    public final String getAdId() {
        return this.f38543b.a();
    }

    public final String getAdUnitId() {
        return this.f38542a;
    }

    public final LevelPlayReward getReward() {
        return getReward$default(this, null, 1, null);
    }

    public final boolean isAdReady() {
        return this.f38543b.b();
    }

    public final void loadAd() {
        this.f38543b.c();
    }

    public final void setListener(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        this.f38543b.a(levelPlayRewardedAdListener);
    }

    public final void showAd(Activity activity) {
        n.f(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(String adUnitId, Config config) {
        this(adUnitId, new Ya.c(new C0506p0(IronSource.a.REWARDED_VIDEO, F0.b.MEDIATION), new C0333f6(), Kb.f26413u.d(), new InterfaceC0510p4.a(), C0638w7.f30930a, config, new Z0()));
        n.f(adUnitId, "adUnitId");
        n.f(config, "config");
    }

    public final LevelPlayReward getReward(String str) {
        return this.f38543b.a(str);
    }

    public final void showAd(Activity activity, String str) {
        n.f(activity, "activity");
        this.f38543b.a(activity, str);
    }

    public LevelPlayRewardedAd(String adUnitId, Ya.c payload) {
        n.f(adUnitId, "adUnitId");
        n.f(payload, "payload");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + payload.d());
        this.f38542a = adUnitId;
        this.f38543b = new C0517pb(adUnitId, payload.d(), payload.b(), payload.a(), payload.g(), payload.e(), payload.f(), payload.c());
    }
}
