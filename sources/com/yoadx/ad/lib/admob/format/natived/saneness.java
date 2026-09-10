package com.yoadx.ad.lib.admob.format.natived;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.yoadx.ad.lib.bean.AdState;
import com.yoadx.ad.lib.bean.AdUnitConfig;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import complexometry.dovishness;
import java.util.UUID;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import vinificator.dern;

/* JADX INFO: compiled from: AdmobNativeReq.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\r2\u001a\u0010\u000e\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/yoadx/ad/lib/admob/format/natived/saneness;", "Ldefrayment/attabal;", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;", "Lcom/yoadx/ad/lib/bean/AdUnitConfig;", "adUnitConfig", "", "adReqScenes", "Lartsy/attabal;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/yoadx/ad/lib/bean/AdUnitConfig;Ljava/lang/String;Lartsy/attabal;)V", "Lkotlin/Function1;", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "", "callback", "taiyuan", "(Lkotlin/jvm/functions/Function1;)V", "marial", "Ljava/lang/String;", "TAG", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness extends defrayment.attabal<NativeAd> {

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final String TAG;

    /* JADX INFO: compiled from: AdmobNativeReq.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/yoadx/ad/lib/admob/format/natived/saneness$attabal", "Lvinificator/dern;", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;", "ad", "", "attabal", "(Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;)V", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "adError", "onAdFailedToLoad", "(Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal extends dern {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ Function1<LoadedAdObject<NativeAd>, Unit> f23854wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public attabal(Function1<? super LoadedAdObject<NativeAd>, Unit> function1) {
            super("native", saneness.this);
            this.f23854wireman = function1;
        }

        @Override // vinificator.dern, acidy.impromptu
        public void attabal(NativeAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            super.attabal(ad);
            saneness.this.getAdUnitConfig().setAdLastReqState(AdState.LOADED);
            dustman.attabal.f25384attabal.attabal(saneness.this.TAG, "loadAd successful, UnitAd: " + saneness.this.getAdUnitConfig().getAdUnitID() + ", UnitName: " + saneness.this.getAdUnitConfig().getAdUnitName() + ",adReqScenes: " + saneness.this.getAdReqScenes());
            this.f23854wireman.invoke(new LoadedAdObject<>(ad, saneness.this.getAdUnitConfig().getAdUnitID(), saneness.this.getAdUnitConfig().getAdUnitName(), saneness.this.getAdUnitConfig().getWeight(), saneness.this.getCom.ironsource.sdk.controller.f.b.c java.lang.String(), saneness.this.getAdReqScenes()));
            saneness.this.wireman();
        }

        @Override // vinificator.dern, acidy.impromptu
        public void onAdFailedToLoad(LoadAdError adError) {
            Intrinsics.checkNotNullParameter(adError, "adError");
            super.onAdFailedToLoad(adError);
            saneness.this.getAdUnitConfig().setAdLastReqState(AdState.FAILED);
            dustman.attabal.f25384attabal.attabal(saneness.this.TAG, "loadAd onAdFailedToLoad, UnitAd: " + saneness.this.getAdUnitConfig().getAdUnitID() + ", UnitName: " + saneness.this.getAdUnitConfig().getAdUnitName() + ",error: " + adError.getCode() + ", " + adError.getMessage());
            this.f23854wireman.invoke(null);
            saneness.this.wireman();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saneness(AdUnitConfig adUnitConfig, String adReqScenes, artsy.attabal attabalVar) {
        super(adUnitConfig, adReqScenes, attabalVar);
        Intrinsics.checkNotNullParameter(adUnitConfig, "adUnitConfig");
        Intrinsics.checkNotNullParameter(adReqScenes, "adReqScenes");
        this.TAG = "Yoadx_ad_native";
    }

    public void taiyuan(Function1<? super LoadedAdObject<NativeAd>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        dustman.attabal.f25384attabal.attabal(this.TAG, "requestAd UnitAd: " + getAdUnitConfig().getAdUnitID() + ", UnitName: " + getAdUnitConfig().getAdUnitName() + ",adReqScenes: " + getAdReqScenes());
        beachfront(UUID.randomUUID().toString());
        competently(System.currentTimeMillis());
        getAdUnitConfig().setAdLastReqState(AdState.LOADING);
        getAdUnitConfig().setAdLastReqTime(getStartRequestTime());
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        String adReqScenes = getAdReqScenes();
        String adUnitID = getAdUnitConfig().getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        String adUnitName = getAdUnitConfig().getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
        attabalVar.triweekly(adReqScenes, new AdUnitReportInfo("native", adUnitID, adUnitName, null, getCom.ironsource.sdk.controller.f.b.c java.lang.String(), null, 40, null));
        String adUnitID2 = getAdUnitConfig().getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID2, "getAdUnitID(...)");
        com.google.android.libraries.ads.mobile.sdk.nativead.attabal.INSTANCE.dern(new com.google.android.libraries.ads.mobile.sdk.nativead.saneness.attabal(adUnitID2, graveside.marial(NativeAd.NativeAdType.NATIVE)).cuirassed(new dovishness.attabal().wireman(true).attabal()).adultoid(), new attabal(callback));
    }
}
