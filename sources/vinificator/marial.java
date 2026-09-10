package vinificator;

import com.yoadx.ad.lib.bean.AdLtvReportInfo;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import complexometry.ResponseInfo;
import complexometry.taiyuan;
import kotlin.Function0;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReportInterstitialShowCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvinificator/marial;", "Lvinificator/attabal;", "Lgargoyle/saneness;", "", "adFormat", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "Lcomplexometry/attabal;", "adObject", "<init>", "(Ljava/lang/String;Lcom/yoadx/ad/lib/bean/LoadedAdObject;)V", "Lcomplexometry/taiyuan;", "value", "", "attabal", "(Lcomplexometry/taiyuan;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class marial extends attabal implements gargoyle.saneness {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public marial(String adFormat, LoadedAdObject<? extends complexometry.attabal> adObject) {
        super(adFormat, adObject);
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
    }

    @Override // vinificator.attabal, complexometry.dern
    public void attabal(taiyuan value) {
        String strCompetently;
        String adapterClassName;
        ResponseInfo responseInfo;
        Intrinsics.checkNotNullParameter(value, "value");
        super.attabal(value);
        tower.dern dernVar = tower.dern.f38901attabal;
        String adFormat = getAdFormat();
        String adUnitID = taiyuan().getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        String adUnitName = taiyuan().getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
        complexometry.attabal loadedAdObject = taiyuan().getLoadedAdObject();
        if (loadedAdObject == null || (strCompetently = Function0.competently(loadedAdObject)) == null) {
            strCompetently = "Default";
        }
        String adCacheId = taiyuan().getAdCacheId();
        Intrinsics.checkNotNullExpressionValue(adCacheId, "getAdCacheId(...)");
        String loadScenes = taiyuan().getLoadScenes();
        Intrinsics.checkNotNullExpressionValue(loadScenes, "getLoadScenes(...)");
        complexometry.attabal loadedAdObject2 = taiyuan().getLoadedAdObject();
        if (loadedAdObject2 == null || (responseInfo = loadedAdObject2.getResponseInfo()) == null || (adapterClassName = responseInfo.getAdapterClassName()) == null) {
            adapterClassName = "";
        }
        dernVar.marial(value, new AdLtvReportInfo(adFormat, adUnitID, adUnitName, strCompetently, adCacheId, loadScenes, adapterClassName));
    }
}
