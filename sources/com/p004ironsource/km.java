package com.p004ironsource;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.sdk.controller.f;
import com.smartdigimkt.q0.b;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015¨\u0006$"}, d2 = {"Lcom/ironsource/km;", "", "Lcom/ironsource/v1;", "a", "", "d", "Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAdListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/app/Activity;", "activity", "", "placementName", "", "c", "Lcom/ironsource/fg;", "Lcom/ironsource/fg;", IronSourceConstants.EVENTS_PROVIDER, "Lcom/ironsource/hm;", "b", "Lcom/ironsource/hm;", "fullScreenAdInternal", "()Ljava/lang/String;", f.b.AD_ID, "adUnitId", "Lcom/ironsource/hm$b;", b.i0, "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/fd;", "adControllerFactory", "Lcom/ironsource/s9;", "currentTimeProvider", "Lcom/ironsource/tf;", "idFactory", "<init>", "(Ljava/lang/String;Lcom/ironsource/hm$b;Lcom/ironsource/m1;Lcom/ironsource/fd;Lcom/ironsource/fg;Lcom/ironsource/s9;Lcom/ironsource/tf;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class km {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fg provider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hm fullScreenAdInternal;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/ironsource/km$a", "Lcom/ironsource/v1;", "", "isPublisherLoad", "Lcom/ironsource/e1;", "adProperties", "Lcom/ironsource/u1;", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements v1 {
        public a() {
        }

        @Override // com.p004ironsource.v1
        public u1 a(boolean isPublisherLoad, e1 adProperties) {
            Intrinsics.f(adProperties, "adProperties");
            return sj.INSTANCE.a(adProperties, km.this.provider.t().a(), isPublisherLoad);
        }
    }

    public km(String adUnitId, hm.b config, m1 adTools, fd adControllerFactory, fg provider, s9 currentTimeProvider, tf idFactory) {
        Intrinsics.f(adUnitId, "adUnitId");
        Intrinsics.f(config, "config");
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(adControllerFactory, "adControllerFactory");
        Intrinsics.f(provider, "provider");
        Intrinsics.f(currentTimeProvider, "currentTimeProvider");
        Intrinsics.f(idFactory, "idFactory");
        this.provider = provider;
        this.fullScreenAdInternal = new hm(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, config, adTools, adControllerFactory, a(), provider, currentTimeProvider, idFactory);
    }

    public final String b() {
        String string = this.fullScreenAdInternal.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.fullScreenAdInternal.n();
    }

    public final void d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.fullScreenAdInternal.o();
    }

    private final v1 a() {
        return new a();
    }

    public final void a(Activity activity, String placementName) {
        Intrinsics.f(activity, "activity");
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + placementName);
        this.fullScreenAdInternal.a(activity, placementName);
    }

    public final void a(LevelPlayInterstitialAdListener listener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.fullScreenAdInternal.a(listener != null ? lm.b(listener) : null);
    }
}
