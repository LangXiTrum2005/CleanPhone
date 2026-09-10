package com.p004ironsource;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceBannerLayout;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.p004ironsource.mediationsdk.c;
import com.p004ironsource.mediationsdk.l;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000bJ\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014J\u0016\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0006\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0012J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u0016\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u0012J\u0006\u0010 \u001a\u00020\u000eJ\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!J\u0006\u0010#\u001a\u00020\u0012J\u0006\u0010$\u001a\u00020\u000eJ\u0010\u0010\t\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!J \u0010\t\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0019J \u0010\u0006\u001a\u00020)2\b\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0019J\u0016\u0010\u0006\u001a\u00020+2\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)J\u0010\u0010\t\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+J\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+J\u000e\u0010\t\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0002¨\u00064"}, d2 = {"Lcom/ironsource/qv;", "", "", gv.f25175b, "sdkVersion", "Lorg/json/JSONObject;", "a", "Landroid/content/Context;", "context", "b", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "", "d", "", "isDemandOnlyMode", "Lcom/ironsource/mediationsdk/sdk/LevelPlayInterstitialListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoBaseListener;", "Lcom/ironsource/mediationsdk/sdk/LevelPlayBannerListener;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "Lcom/ironsource/jv;", "loadAdConfig", "", i.f37957c, "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "networkSettings", g.f40227p, "e", "Landroid/app/Activity;", "activity", h.f36614b, f.j, "description", "width", "height", "Lcom/unity3d/mediation/LevelPlayAdSize;", "Lcom/ironsource/mediationsdk/ISBannerSize;", "size", "Lcom/ironsource/mediationsdk/IronSourceBannerLayout;", "banner", PglCryptUtils.KEY_MESSAGE, "Lcom/ironsource/ac;", "event", "data", "key", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qv f26644a = new qv();

    private qv() {
    }

    public final int a() {
        return on.INSTANCE.d().f().k();
    }

    public final LevelPlayAdSize b(String description, int width, int height) {
        if (description == null || description.length() == 0 || Intrinsics.a(description, l.f)) {
            return LevelPlayAdSize.INSTANCE.createCustomSize(width, height);
        }
        return Intrinsics.a(description, l.f25926c) ? LevelPlayAdSize.MEDIUM_RECTANGLE : LevelPlayAdSize.INSTANCE.createAdSize$mediationsdk_release(description);
    }

    public final String c(Context context) {
        Intrinsics.f(context, "context");
        return b4.g(context);
    }

    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(c.b().d());
        concurrentHashMap.putAll(xk.b().c());
        return concurrentHashMap;
    }

    public final boolean e() {
        return IronSource.isInterstitialReady();
    }

    public final boolean f() {
        return IronSource.isRewardedVideoAvailable();
    }

    public final void g() {
        IronSource.loadInterstitial();
    }

    public final void h() {
        IronSource.loadRewardedVideo();
    }

    public final void i() {
        p.j().P();
    }

    public final ISBannerSize a(String description, int width, int height) {
        return new ISBannerSize(description, width, height);
    }

    public final String b(Context context) {
        Intrinsics.f(context, "context");
        return b4.b(context, c(context));
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = c.b().e();
            Intrinsics.e(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    qv qvVar = f26644a;
                    String key = entry.getKey();
                    Intrinsics.e(key, "entry.key");
                    String strA = qvVar.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    Intrinsics.e(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    Intrinsics.e(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(strA, qvVar.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e2) {
            q9.d().a(e2);
        }
        return jSONObject;
    }

    public final IronSourceBannerLayout a(Activity activity, ISBannerSize size) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(size, "size");
        IronSourceBannerLayout ironSourceBannerLayoutB = p.j().b(activity, size);
        Intrinsics.e(ironSourceBannerLayoutB, "getInstance().createBanner(activity, size)");
        return ironSourceBannerLayoutB;
    }

    public final JSONObject b() {
        JSONObject jSONObjectB = ke.a().b();
        Intrinsics.e(jSONObjectB, "getProperties().toJSON()");
        return jSONObjectB;
    }

    public final String a(Context context) {
        Intrinsics.f(context, "context");
        return b4.a(context, c(context));
    }

    public final void b(Activity activity) {
        if (activity != null) {
            IronSource.showRewardedVideo(activity);
        } else {
            IronSource.showRewardedVideo();
        }
    }

    public final String a(NetworkSettings networkSettings) {
        Intrinsics.f(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final void b(IronSourceBannerLayout banner) {
        IronSource.loadBanner(banner);
    }

    public final String a(Placement placement) {
        String placementName;
        return (placement == null || (placementName = placement.getPlacementName()) == null) ? new String() : placementName;
    }

    public final void b(String message) {
        Intrinsics.f(message, "message");
        IronLog.INTERNAL.error(message);
    }

    public final JSONObject a(boolean isDemandOnlyMode) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(isDemandOnlyMode);
        Intrinsics.e(mediationAdditionalData, "getMediationAdditionalData(isDemandOnlyMode)");
        return mediationAdditionalData;
    }

    public final void a(Activity activity) {
        if (activity != null) {
            IronSource.showInterstitial(activity);
        } else {
            IronSource.showInterstitial();
        }
    }

    public final void a(ac event, JSONObject data) {
        Intrinsics.f(event, "event");
        Intrinsics.f(data, "data");
        ds.i().a(new zb(event, data));
    }

    public final void a(IronSource.AD_UNIT adUnit, jv loadAdConfig) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(loadAdConfig, "loadAdConfig");
        p.j().a(adUnit, loadAdConfig);
    }

    public final void a(IronSourceBannerLayout banner) {
        IronSource.destroyBanner(banner);
    }

    public final void a(LevelPlayBannerListener listener) {
        t5.a().b(listener);
    }

    public final void a(LevelPlayInterstitialListener listener) {
        ah.a().b(listener);
    }

    public final void a(LevelPlayRewardedVideoBaseListener listener) {
        fr.a().b(listener);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.AD_UNIT adUnit) {
        Intrinsics.f(networkSettings, "networkSettings");
        Intrinsics.f(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    private final JSONObject a(String adapterVersion, String sdkVersion) {
        return new JSONObject(MapsKt.j(new Pair(gv.f25175b, adapterVersion), new Pair("sdkVersion", sdkVersion)));
    }

    public final String a(String key) {
        List listJ;
        Intrinsics.f(key, "key");
        try {
            if (!StringsKt.l(key, TokenBuilder.TOKEN_DELIMITER, false)) {
                if (!StringsKt.l(key, "_", false)) {
                    return key;
                }
                listJ = StringsKt.J(key, 0, 6, new String[]{"_"});
            } else {
                String str = (String) CollectionsKt.F(StringsKt.J(key, 0, 6, new String[]{TokenBuilder.TOKEN_DELIMITER}));
                if (!StringsKt.l(str, "_", false)) {
                    return str;
                }
                listJ = StringsKt.J(str, 0, 6, new String[]{"_"});
            }
            return (String) CollectionsKt.w(listJ);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.getMessage());
            return key;
        }
    }
}
