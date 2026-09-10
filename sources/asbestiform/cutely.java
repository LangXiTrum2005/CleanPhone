package asbestiform;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.yoadx.ad.lib.bean.AdState;
import com.yoadx.ad.lib.bean.AdUnitConfig;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import java.util.UUID;
import kotlin.Function0;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdmobAppOpenReq.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\r2\u001a\u0010\u000e\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lasbestiform/cutely;", "Ldefrayment/attabal;", "Lextensimeter/attabal;", "Lcom/yoadx/ad/lib/bean/AdUnitConfig;", "adUnitConfig", "", "adReqScenes", "Lartsy/attabal;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/yoadx/ad/lib/bean/AdUnitConfig;Ljava/lang/String;Lartsy/attabal;)V", "Lkotlin/Function1;", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "", "callback", "taiyuan", "(Lkotlin/jvm/functions/Function1;)V", "marial", "Ljava/lang/String;", "TAG", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cutely extends defrayment.attabal<extensimeter.attabal> {

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final String TAG;

    /* JADX INFO: compiled from: AdmobAppOpenReq.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"asbestiform/cutely$attabal", "Lvinificator/saneness;", "Lextensimeter/attabal;", "ad", "", "marial", "(Lextensimeter/attabal;)V", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "adError", "onAdFailedToLoad", "(Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal extends vinificator.saneness<extensimeter.attabal> {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ Function1<LoadedAdObject<extensimeter.attabal>, Unit> f14446wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public attabal(Function1<? super LoadedAdObject<extensimeter.attabal>, Unit> function1) {
            super("app_open", cutely.this);
            this.f14446wireman = function1;
        }

        public static final Unit beachfront(cutely cutelyVar) {
            cutelyVar.wireman();
            return Unit.f29295attabal;
        }

        public static final Unit wireman(cutely cutelyVar, LoadAdError loadAdError) {
            cutelyVar.wireman();
            return Unit.f29295attabal;
        }

        @Override // complexometry.wireman
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(extensimeter.attabal ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            super.attabal(ad);
            cutely.this.getAdUnitConfig().setAdLastReqState(AdState.LOADED);
            dustman.attabal.f25384attabal.attabal(cutely.this.TAG, "loadAd successful, UnitAd: " + cutely.this.getAdUnitConfig().getAdUnitID() + ", UnitName: " + cutely.this.getAdUnitConfig().getAdUnitName() + ",adReqScenes: " + cutely.this.getAdReqScenes());
            this.f14446wireman.invoke(new LoadedAdObject<>(ad, cutely.this.getAdUnitConfig().getAdUnitID(), cutely.this.getAdUnitConfig().getAdUnitName(), cutely.this.getAdUnitConfig().getWeight(), cutely.this.getCom.ironsource.sdk.controller.f.b.c java.lang.String(), cutely.this.getAdReqScenes()));
            final cutely cutelyVar = cutely.this;
            Function0.wireman(new p002kotlin.jvm.functions.Function0() { // from class: asbestiform.taiyuan
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return cutely.attabal.beachfront(cutelyVar);
                }
            });
        }

        @Override // vinificator.saneness, complexometry.wireman
        public void onAdFailedToLoad(final LoadAdError adError) {
            Intrinsics.checkNotNullParameter(adError, "adError");
            super.onAdFailedToLoad(adError);
            if (adError.getCode() == LoadAdError.ErrorCode.NO_FILL) {
                cutely.this.getAdUnitConfig().setAdLastReqState(AdState.NO_FILL);
                cutely.this.getAdUnitConfig().setNoFillTime(System.currentTimeMillis());
            } else {
                cutely.this.getAdUnitConfig().setAdLastReqState(AdState.FAILED);
            }
            dustman.attabal.f25384attabal.attabal(cutely.this.TAG, "loadAd onAdFailedToLoad, UnitAd: " + cutely.this.getAdUnitConfig().getAdUnitID() + ", UnitName: " + cutely.this.getAdUnitConfig().getAdUnitName() + ",error: " + adError.getCode() + ", " + adError.getMessage());
            this.f14446wireman.invoke(null);
            final cutely cutelyVar = cutely.this;
            Function0.wireman(new p002kotlin.jvm.functions.Function0() { // from class: asbestiform.impromptu
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return cutely.attabal.wireman(cutelyVar, adError);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutely(AdUnitConfig adUnitConfig, String adReqScenes, artsy.attabal attabalVar) {
        super(adUnitConfig, adReqScenes, attabalVar);
        Intrinsics.checkNotNullParameter(adUnitConfig, "adUnitConfig");
        Intrinsics.checkNotNullParameter(adReqScenes, "adReqScenes");
        this.TAG = "Yoadx_ad_appopen";
    }

    public void taiyuan(Function1<? super LoadedAdObject<extensimeter.attabal>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        beachfront(UUID.randomUUID().toString());
        competently(System.currentTimeMillis());
        getAdUnitConfig().setAdLastReqState(AdState.LOADING);
        getAdUnitConfig().setAdLastReqTime(getStartRequestTime());
        getAdUnitConfig().setNoFillTime(0L);
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        String adReqScenes = getAdReqScenes();
        String adUnitID = getAdUnitConfig().getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        String adUnitName = getAdUnitConfig().getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
        attabalVar.triweekly(adReqScenes, new AdUnitReportInfo("app_open", adUnitID, adUnitName, null, getCom.ironsource.sdk.controller.f.b.c java.lang.String(), null, 40, null));
        attabal attabalVar2 = new attabal(callback);
        String adUnitID2 = getAdUnitConfig().getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID2, "getAdUnitID(...)");
        extensimeter.attabal.INSTANCE.attabal(new complexometry.competently.attabal(adUnitID2).graveside(), attabalVar2);
    }
}
