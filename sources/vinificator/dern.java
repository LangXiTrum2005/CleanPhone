package vinificator;

import acidy.impromptu;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.yoadx.ad.lib.bean.AdLoadReportInfo;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import kotlin.Function0;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseReportNativeLoadCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvinificator/dern;", "Lacidy/impromptu;", "", "adFormat", "Ldefrayment/attabal;", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;", "admobAdReq", "<init>", "(Ljava/lang/String;Ldefrayment/attabal;)V", "nativeAd", "", "attabal", "(Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;)V", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "adError", "onAdFailedToLoad", "(Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;)V", "Ljava/lang/String;", "saneness", "Ldefrayment/attabal;", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class dern implements impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public String adFormat;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public defrayment.attabal<NativeAd> admobAdReq;

    public dern(String adFormat, defrayment.attabal<NativeAd> admobAdReq) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(admobAdReq, "admobAdReq");
        this.adFormat = adFormat;
        this.admobAdReq = admobAdReq;
    }

    @Override // acidy.impromptu
    public void attabal(NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        super.attabal(nativeAd);
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        String adReqScenes = this.admobAdReq.getAdReqScenes();
        String str = this.adFormat;
        String adUnitID = this.admobAdReq.getAdUnitConfig().getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        String adUnitName = this.admobAdReq.getAdUnitConfig().getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
        attabalVar.impromptu(adReqScenes, new AdUnitReportInfo(str, adUnitID, adUnitName, Function0.competently(nativeAd), this.admobAdReq.getCom.ironsource.sdk.controller.f.b.c java.lang.String(), null, 32, null), new AdLoadReportInfo(System.currentTimeMillis() - this.admobAdReq.getStartRequestTime(), null, 2, null));
    }

    @Override // acidy.impromptu
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
