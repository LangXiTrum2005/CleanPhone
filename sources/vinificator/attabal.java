package vinificator;

import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.ironsource.If;
import com.yoadx.ad.lib.bean.AdLtvReportInfo;
import com.yoadx.ad.lib.bean.AdShowReportInfo;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import complexometry.ResponseInfo;
import complexometry.taiyuan;
import kotlin.Function0;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseReportAdShowCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lvinificator/attabal;", "Lcomplexometry/dern;", "", "adFormat", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "Lcomplexometry/attabal;", "adObject", "<init>", "(Ljava/lang/String;Lcom/yoadx/ad/lib/bean/LoadedAdObject;)V", "", "dern", "()V", "Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;", "fullScreenContentError", "competently", "(Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;)V", "wireman", "marial", If.f, "Lcomplexometry/taiyuan;", "value", "attabal", "(Lcomplexometry/taiyuan;)V", "Ljava/lang/String;", "impromptu", "()Ljava/lang/String;", "setAdFormat", "(Ljava/lang/String;)V", "saneness", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "taiyuan", "()Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "setAdObject", "(Lcom/yoadx/ad/lib/bean/LoadedAdObject;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class attabal implements complexometry.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public String adFormat;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public LoadedAdObject<? extends complexometry.attabal> adObject;

    public attabal(String adFormat, LoadedAdObject<? extends complexometry.attabal> adObject) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.adFormat = adFormat;
        this.adObject = adObject;
    }

    @Override // complexometry.dern
    public void attabal(taiyuan value) {
        String strCompetently;
        String adapterClassName;
        ResponseInfo responseInfo;
        Intrinsics.checkNotNullParameter(value, "value");
        super.attabal(value);
        String str = this.adFormat;
        String adUnitID = this.adObject.getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        String adUnitName = this.adObject.getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
        complexometry.attabal loadedAdObject = this.adObject.getLoadedAdObject();
        if (loadedAdObject == null || (strCompetently = Function0.competently(loadedAdObject)) == null) {
            strCompetently = "Default";
        }
        String str2 = strCompetently;
        String adCacheId = this.adObject.getAdCacheId();
        Intrinsics.checkNotNullExpressionValue(adCacheId, "getAdCacheId(...)");
        String loadScenes = this.adObject.getLoadScenes();
        Intrinsics.checkNotNullExpressionValue(loadScenes, "getLoadScenes(...)");
        complexometry.attabal loadedAdObject2 = this.adObject.getLoadedAdObject();
        if (loadedAdObject2 == null || (responseInfo = loadedAdObject2.getResponseInfo()) == null || (adapterClassName = responseInfo.getAdapterClassName()) == null) {
            adapterClassName = "";
        }
        AdLtvReportInfo adLtvReportInfo = new AdLtvReportInfo(str, adUnitID, adUnitName, str2, adCacheId, loadScenes, adapterClassName);
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        String showScenes = this.adObject.getShowScenes();
        Intrinsics.checkNotNullExpressionValue(showScenes, "getShowScenes(...)");
        attabalVar.dern(showScenes, adLtvReportInfo, new AdShowReportInfo((int) ((this.adObject.getAdShowTime() - this.adObject.getAdLoadedTime()) / ((long) 1000)), this.adObject.getAdCloseTime() - this.adObject.getAdShowTime(), null, 0, null, 28, null));
        tower.saneness sanenessVar = tower.saneness.f38904attabal;
        String showScenes2 = this.adObject.getShowScenes();
        Intrinsics.checkNotNullExpressionValue(showScenes2, "getShowScenes(...)");
        sanenessVar.attabal(showScenes2, value, adLtvReportInfo);
        tower.dern dernVar = tower.dern.f38901attabal;
        dernVar.wireman(value, adLtvReportInfo);
        dernVar.dern(value, adLtvReportInfo);
    }

    @Override // complexometry.dern
    public void competently(FullScreenContentError fullScreenContentError) {
        String strCompetently;
        Intrinsics.checkNotNullParameter(fullScreenContentError, "fullScreenContentError");
        super.competently(fullScreenContentError);
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        String showScenes = this.adObject.getShowScenes();
        Intrinsics.checkNotNullExpressionValue(showScenes, "getShowScenes(...)");
        String str = this.adFormat;
        String adUnitID = this.adObject.getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        String adUnitName = this.adObject.getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
        complexometry.attabal loadedAdObject = this.adObject.getLoadedAdObject();
        if (loadedAdObject == null || (strCompetently = Function0.competently(loadedAdObject)) == null) {
            strCompetently = "Default";
        }
        String str2 = strCompetently;
        String adCacheId = this.adObject.getAdCacheId();
        Intrinsics.checkNotNullExpressionValue(adCacheId, "getAdCacheId(...)");
        String loadScenes = this.adObject.getLoadScenes();
        Intrinsics.checkNotNullExpressionValue(loadScenes, "getLoadScenes(...)");
        attabalVar.taiyuan(showScenes, new AdUnitReportInfo(str, adUnitID, adUnitName, str2, adCacheId, loadScenes), new AdShowReportInfo((int) ((this.adObject.getAdShowTime() - this.adObject.getAdLoadedTime()) / ((long) 1000)), this.adObject.getAdCloseTime() - this.adObject.getAdShowTime(), fullScreenContentError, 0, null, 24, null));
    }

    @Override // complexometry.dern
    public void dern() {
        String strCompetently;
        super.dern();
        this.adObject.setAdShowTime(System.currentTimeMillis());
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        String showScenes = this.adObject.getShowScenes();
        Intrinsics.checkNotNullExpressionValue(showScenes, "getShowScenes(...)");
        String str = this.adFormat;
        String adUnitID = this.adObject.getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        String adUnitName = this.adObject.getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
        complexometry.attabal loadedAdObject = this.adObject.getLoadedAdObject();
        if (loadedAdObject == null || (strCompetently = Function0.competently(loadedAdObject)) == null) {
            strCompetently = "Default";
        }
        String str2 = strCompetently;
        String adCacheId = this.adObject.getAdCacheId();
        Intrinsics.checkNotNullExpressionValue(adCacheId, "getAdCacheId(...)");
        String loadScenes = this.adObject.getLoadScenes();
        Intrinsics.checkNotNullExpressionValue(loadScenes, "getLoadScenes(...)");
        attabalVar.impassible(showScenes, new AdUnitReportInfo(str, adUnitID, adUnitName, str2, adCacheId, loadScenes), new AdShowReportInfo((int) ((System.currentTimeMillis() - this.adObject.getAdLoadedTime()) / ((long) 1000)), 0L, null, 0, null, 30, null));
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final String getAdFormat() {
        return this.adFormat;
    }

    @Override // complexometry.dern
    public void marial() {
        super.marial();
    }

    @Override // complexometry.dern
    public void onAdClicked() {
        String strCompetently;
        super.onAdClicked();
        this.adObject.setAdClickTime(System.currentTimeMillis());
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        String showScenes = this.adObject.getShowScenes();
        Intrinsics.checkNotNullExpressionValue(showScenes, "getShowScenes(...)");
        String str = this.adFormat;
        String adUnitID = this.adObject.getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        String adUnitName = this.adObject.getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
        complexometry.attabal loadedAdObject = this.adObject.getLoadedAdObject();
        if (loadedAdObject == null || (strCompetently = Function0.competently(loadedAdObject)) == null) {
            strCompetently = "Default";
        }
        String str2 = strCompetently;
        String adCacheId = this.adObject.getAdCacheId();
        Intrinsics.checkNotNullExpressionValue(adCacheId, "getAdCacheId(...)");
        String loadScenes = this.adObject.getLoadScenes();
        Intrinsics.checkNotNullExpressionValue(loadScenes, "getLoadScenes(...)");
        attabalVar.attabal(showScenes, new AdUnitReportInfo(str, adUnitID, adUnitName, str2, adCacheId, loadScenes), new AdShowReportInfo((int) ((this.adObject.getAdShowTime() - this.adObject.getAdLoadedTime()) / ((long) 1000)), this.adObject.getAdCloseTime() - this.adObject.getAdShowTime(), null, 0, null, 28, null));
    }

    public final LoadedAdObject<? extends complexometry.attabal> taiyuan() {
        return this.adObject;
    }

    @Override // complexometry.dern
    public void wireman() {
        String strCompetently;
        super.wireman();
        this.adObject.setAdCloseTime(System.currentTimeMillis());
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        String showScenes = this.adObject.getShowScenes();
        Intrinsics.checkNotNullExpressionValue(showScenes, "getShowScenes(...)");
        String str = this.adFormat;
        String adUnitID = this.adObject.getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        String adUnitName = this.adObject.getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
        complexometry.attabal loadedAdObject = this.adObject.getLoadedAdObject();
        if (loadedAdObject == null || (strCompetently = Function0.competently(loadedAdObject)) == null) {
            strCompetently = "Default";
        }
        String str2 = strCompetently;
        String adCacheId = this.adObject.getAdCacheId();
        Intrinsics.checkNotNullExpressionValue(adCacheId, "getAdCacheId(...)");
        String loadScenes = this.adObject.getLoadScenes();
        Intrinsics.checkNotNullExpressionValue(loadScenes, "getLoadScenes(...)");
        attabalVar.saneness(showScenes, new AdUnitReportInfo(str, adUnitID, adUnitName, str2, adCacheId, loadScenes), new AdShowReportInfo((int) ((this.adObject.getAdShowTime() - this.adObject.getAdLoadedTime()) / ((long) 1000)), this.adObject.getAdCloseTime() - this.adObject.getAdShowTime(), null, 0, null, 28, null));
    }
}
