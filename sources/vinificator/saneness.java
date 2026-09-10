package vinificator;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.yoadx.ad.lib.bean.AdLoadReportInfo;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import complexometry.attabal;
import kotlin.Function0;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseReportLoadCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvinificator/saneness;", "Lcomplexometry/attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcomplexometry/wireman;", "", "adFormat", "Ldefrayment/attabal;", "admobAdReq", "<init>", "(Ljava/lang/String;Ldefrayment/attabal;)V", "ad", "", "attabal", "(Lcomplexometry/attabal;)V", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "adError", "onAdFailedToLoad", "(Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;)V", "Ljava/lang/String;", "saneness", "Ldefrayment/attabal;", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class saneness<T extends complexometry.attabal> implements complexometry.wireman<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public String adFormat;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public defrayment.attabal<T> admobAdReq;

    public saneness(String adFormat, defrayment.attabal<T> admobAdReq) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(admobAdReq, "admobAdReq");
        this.adFormat = adFormat;
        this.admobAdReq = admobAdReq;
    }

    public void attabal(T ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        super.onAdLoaded(ad);
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        String adReqScenes = this.admobAdReq.getAdReqScenes();
        String str = this.adFormat;
        String adUnitID = this.admobAdReq.getAdUnitConfig().getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        String adUnitName = this.admobAdReq.getAdUnitConfig().getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
        attabalVar.impromptu(adReqScenes, new AdUnitReportInfo(str, adUnitID, adUnitName, Function0.competently(ad), this.admobAdReq.getCom.ironsource.sdk.controller.f.b.c java.lang.String(), null, 32, null), new AdLoadReportInfo(System.currentTimeMillis() - this.admobAdReq.getStartRequestTime(), null, 2, null));
    }

    @Override // complexometry.wireman
    public void onAdFailedToLoad(LoadAdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        super.onAdFailedToLoad(adError);
        if (adError.getCode() == LoadAdError.ErrorCode.NO_FILL) {
            tower.attabal attabalVar = tower.attabal.f38900attabal;
            String adReqScenes = this.admobAdReq.getAdReqScenes();
            String str = this.adFormat;
            String adUnitID = this.admobAdReq.getAdUnitConfig().getAdUnitID();
            Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
            String adUnitName = this.admobAdReq.getAdUnitConfig().getAdUnitName();
            Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
            attabalVar.competently(adReqScenes, new AdUnitReportInfo(str, adUnitID, adUnitName, null, this.admobAdReq.getCom.ironsource.sdk.controller.f.b.c java.lang.String(), null, 40, null), new AdLoadReportInfo(System.currentTimeMillis() - this.admobAdReq.getStartRequestTime(), adError));
            return;
        }
        tower.attabal attabalVar2 = tower.attabal.f38900attabal;
        String adReqScenes2 = this.admobAdReq.getAdReqScenes();
        String str2 = this.adFormat;
        String adUnitID2 = this.admobAdReq.getAdUnitConfig().getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID2, "getAdUnitID(...)");
        String adUnitName2 = this.admobAdReq.getAdUnitConfig().getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName2, "getAdUnitName(...)");
        attabalVar2.beachfront(adReqScenes2, new AdUnitReportInfo(str2, adUnitID2, adUnitName2, null, this.admobAdReq.getCom.ironsource.sdk.controller.f.b.c java.lang.String(), null, 40, null), new AdLoadReportInfo(System.currentTimeMillis() - this.admobAdReq.getStartRequestTime(), adError));
    }
}
