package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.sdk.controller.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\t\b\u0010¢\u0006\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ironsource/j6;", "Lcom/ironsource/e1;", "Lcom/unity3d/mediation/LevelPlayAdSize;", g.f40227p, "Lcom/unity3d/mediation/LevelPlayAdSize;", h.f36614b, "()Lcom/unity3d/mediation/LevelPlayAdSize;", d9.h.O, "", "Ljava/lang/Boolean;", i.f37957c, "()Ljava/lang/Boolean;", "autoRefresh", "", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", v6.d, "Ljava/util/UUID;", f.b.AD_ID, "", "adUnitId", "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "Lcom/ironsource/jv;", "testSuiteLoadAdConfig", "", "bidFloor", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/ironsource/mediationsdk/model/Placement;Lcom/unity3d/mediation/LevelPlayAdSize;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/ironsource/jv;Ljava/lang/Double;)V", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class j6 extends e1 {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final LevelPlayAdSize adSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Boolean autoRefresh;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Long refreshInterval;

    public j6() {
        this(tf.f27296a.a(), "", null, null, null, null, null, null, 252, null);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final LevelPlayAdSize getAdSize() {
        return this.adSize;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getAutoRefresh() {
        return this.autoRefresh;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getRefreshInterval() {
        return this.refreshInterval;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(UUID adId, String adUnitId, Placement placement, LevelPlayAdSize adSize, Boolean bool, Long l2, jv jvVar, Double d) {
        super(IronSource.AD_UNIT.BANNER, adId, adUnitId, placement, jvVar, d);
        Intrinsics.f(adId, "adId");
        Intrinsics.f(adUnitId, "adUnitId");
        Intrinsics.f(adSize, "adSize");
        this.adSize = adSize;
        this.autoRefresh = bool;
        this.refreshInterval = l2;
    }

    public /* synthetic */ j6(UUID uuid, String str, Placement placement, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l2, jv jvVar, Double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i2 & 4) != 0 ? null : placement, (i2 & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : l2, (i2 & 64) != 0 ? null : jvVar, (i2 & 128) != 0 ? null : d);
    }
}
