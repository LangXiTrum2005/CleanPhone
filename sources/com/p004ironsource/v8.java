package com.p004ironsource;

import com.smartdigimkt.h5.f;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\n\u0010\u0019R#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0006\u0010\u001f¨\u0006#"}, d2 = {"Lcom/ironsource/v8;", "", "Lorg/json/JSONObject;", "configurations", "", "adFormatKey", "a", "Lcom/ironsource/s;", "Lcom/ironsource/s;", "rewardedConfigurations", "b", "interstitialConfigurations", "Lcom/ironsource/t6;", "c", "Lcom/ironsource/t6;", "()Lcom/ironsource/t6;", "bannerConfigurations", "Lcom/ironsource/un;", "d", "Lcom/ironsource/un;", "()Lcom/ironsource/un;", "nativeAdConfigurations", "Lcom/ironsource/y3;", "e", "Lcom/ironsource/y3;", "()Lcom/ironsource/y3;", "applicationConfigurations", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", f.j, "Ljava/util/Map;", "()Ljava/util/Map;", "adFormatsConfigurations", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C3381s rewardedConfigurations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C3381s interstitialConfigurations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t6 bannerConfigurations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final un nativeAdConfigurations;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y3 applicationConfigurations;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Map<LevelPlay.AdFormat, C3381s> adFormatsConfigurations;

    public v8(JSONObject configurations) {
        Intrinsics.f(configurations, "configurations");
        C3381s c3381s = new C3381s(a(configurations, "rewarded"));
        this.rewardedConfigurations = c3381s;
        C3381s c3381s2 = new C3381s(a(configurations, "interstitial"));
        this.interstitialConfigurations = c3381s2;
        this.bannerConfigurations = new t6(a(configurations, "banner"));
        this.nativeAdConfigurations = new un(a(configurations, "nativeAd"));
        JSONObject jSONObjectOptJSONObject = configurations.optJSONObject("application");
        this.applicationConfigurations = new y3(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.adFormatsConfigurations = MapsKt.j(new Pair(LevelPlay.AdFormat.INTERSTITIAL, c3381s2), new Pair(LevelPlay.AdFormat.REWARDED, c3381s));
    }

    public final Map<LevelPlay.AdFormat, C3381s> a() {
        return this.adFormatsConfigurations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final y3 getApplicationConfigurations() {
        return this.applicationConfigurations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t6 getBannerConfigurations() {
        return this.bannerConfigurations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final un getNativeAdConfigurations() {
        return this.nativeAdConfigurations;
    }

    private final JSONObject a(JSONObject configurations, String adFormatKey) {
        JSONObject jSONObjectOptJSONObject = configurations.optJSONObject("adFormats");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(adFormatKey) : null;
        return jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2;
    }
}
