package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ironsource.Aa;
import com.ironsource.C0638w7;
import com.ironsource.W2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import defpackage.e;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import wj.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Aa f38527a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Config {
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LevelPlayAdSize f38528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Double f38529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f38530c;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private LevelPlayAdSize f38531a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Double f38532b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f38533c;

            public final Config build() {
                return new Config(this.f38531a, this.f38532b, this.f38533c);
            }

            public final Builder setAdSize(LevelPlayAdSize adSize) {
                n.f(adSize, "adSize");
                this.f38531a = adSize;
                return this;
            }

            public final Builder setBidFloor(double d10) {
                this.f38532b = Double.valueOf(d10);
                return this;
            }

            public final Builder setPlacementName(String placementName) {
                n.f(placementName, "placementName");
                this.f38533c = placementName;
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final Config empty() {
                return new Config(null, null, null, 7, null);
            }

            private Companion() {
            }
        }

        public Config() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Config copy$default(Config config, LevelPlayAdSize levelPlayAdSize, Double d10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                levelPlayAdSize = config.f38528a;
            }
            if ((i10 & 2) != 0) {
                d10 = config.f38529b;
            }
            if ((i10 & 4) != 0) {
                str = config.f38530c;
            }
            return config.copy(levelPlayAdSize, d10, str);
        }

        public final LevelPlayAdSize component1() {
            return this.f38528a;
        }

        public final Double component2() {
            return this.f38529b;
        }

        public final String component3() {
            return this.f38530c;
        }

        public final Config copy(LevelPlayAdSize levelPlayAdSize, Double d10, String str) {
            return new Config(levelPlayAdSize, d10, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return n.a(this.f38528a, config.f38528a) && n.a(this.f38529b, config.f38529b) && n.a(this.f38530c, config.f38530c);
        }

        public final LevelPlayAdSize getAdSize() {
            return this.f38528a;
        }

        public final Double getBidFloor() {
            return this.f38529b;
        }

        public final String getPlacementName() {
            return this.f38530c;
        }

        public int hashCode() {
            LevelPlayAdSize levelPlayAdSize = this.f38528a;
            int iHashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            Double d10 = this.f38529b;
            int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str = this.f38530c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            LevelPlayAdSize levelPlayAdSize = this.f38528a;
            Double d10 = this.f38529b;
            String str = this.f38530c;
            StringBuilder sb2 = new StringBuilder("Config(adSize=");
            sb2.append(levelPlayAdSize);
            sb2.append(", bidFloor=");
            sb2.append(d10);
            sb2.append(", placementName=");
            return e.q(str, ")", sb2);
        }

        public Config(LevelPlayAdSize levelPlayAdSize, Double d10, String str) {
            this.f38528a = levelPlayAdSize;
            this.f38529b = d10;
            this.f38530c = str;
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d10, String str, int i10, g gVar) {
            this((i10 & 1) != 0 ? null : levelPlayAdSize, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context) {
        this(context, null, 0, 6, null);
        n.f(context, "context");
    }

    private final Aa a(String str, Config config) {
        Context context = getContext();
        n.e(context, "context");
        W2 w2A = a(context);
        addView(w2A);
        return new Aa(C0638w7.f30930a.a(), str, w2A, config, null, 16, null);
    }

    public final void destroy() {
        this.f38527a.b();
    }

    public final String getAdId() {
        String string = this.f38527a.c().toString();
        n.e(string, "bannerViewInternal.adId.toString()");
        return string;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f38527a.d();
    }

    public final String getAdUnitId() {
        return this.f38527a.e();
    }

    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.f38527a.f();
    }

    public final String getPlacementName() {
        return this.f38527a.g();
    }

    public final void loadAd() {
        this.f38527a.i();
    }

    public final void pauseAutoRefresh() {
        this.f38527a.j();
    }

    public final void resumeAutoRefresh() {
        this.f38527a.k();
    }

    public final void setBannerListener(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.f38527a.a(levelPlayBannerAdViewListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.f(context, "context");
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i10, int i11, g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.f(context, "context");
        IronLog.API.info("context: ".concat(context.getClass().getSimpleName()));
        f fVarA = Aa.f25626n.a(context, attributeSet);
        this.f38527a = a((String) fVarA.f53283a, (Config) fVarA.f53284b);
    }

    private final W2 a(Context context) {
        W2 w3 = new W2(context);
        w3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return w3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String adUnitId) {
        this(context, adUnitId, Config.Companion.empty());
        n.f(context, "context");
        n.f(adUnitId, "adUnitId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String adUnitId, Config config) {
        super(context);
        n.f(context, "context");
        n.f(adUnitId, "adUnitId");
        n.f(config, "config");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.f38527a = a(adUnitId, config);
    }
}
