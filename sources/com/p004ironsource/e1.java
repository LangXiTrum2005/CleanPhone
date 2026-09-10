package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.sdk.controller.f;
import com.smartdigimkt.y4.g;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0005\u0010\u0018R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b\u0014\u0010!¨\u0006%"}, d2 = {"Lcom/ironsource/e1;", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "e", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "a", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", f.b.AD_ID, "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "adUnitId", "Lcom/ironsource/mediationsdk/model/Placement;", "d", "Lcom/ironsource/mediationsdk/model/Placement;", com.smartdigimkt.h5.f.j, "()Lcom/ironsource/mediationsdk/model/Placement;", "(Lcom/ironsource/mediationsdk/model/Placement;)V", "placement", "Lcom/ironsource/jv;", "Lcom/ironsource/jv;", g.f40227p, "()Lcom/ironsource/jv;", "testSuiteLoadAdConfig", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "bidFloor", "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/UUID;Ljava/lang/String;Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/jv;Ljava/lang/Double;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IronSource.AD_UNIT adFormat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final UUID adId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String adUnitId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Placement placement;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final jv testSuiteLoadAdConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Double bidFloor;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24862a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f24862a = iArr;
        }
    }

    public e1(IronSource.AD_UNIT adFormat, UUID adId, String adUnitId, Placement placement, jv jvVar, Double d) {
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(adId, "adId");
        Intrinsics.f(adUnitId, "adUnitId");
        this.adFormat = adFormat;
        this.adId = adId;
        this.adUnitId = adUnitId;
        this.placement = placement;
        this.testSuiteLoadAdConfig = jvVar;
        this.bidFloor = d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IronSource.AD_UNIT getAdFormat() {
        return this.adFormat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getAdId() {
        return this.adId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getBidFloor() {
        return this.bidFloor;
    }

    public final LevelPlay.AdFormat e() {
        int i2 = a.f24862a[this.adFormat.ordinal()];
        if (i2 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i2 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i2 == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i2 == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Placement getPlacement() {
        return this.placement;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jv getTestSuiteLoadAdConfig() {
        return this.testSuiteLoadAdConfig;
    }

    public /* synthetic */ e1(IronSource.AD_UNIT ad_unit, UUID uuid, String str, Placement placement, jv jvVar, Double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, uuid, str, (i2 & 8) != 0 ? null : placement, (i2 & 16) != 0 ? null : jvVar, (i2 & 32) != 0 ? null : d);
    }

    public final void a(Placement placement) {
        this.placement = placement;
    }
}
