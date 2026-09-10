package vinificator;

import com.yoadx.ad.lib.bean.AdShowReportInfo;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import kotlin.Function0;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReportNativeShowCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lvinificator/beachfront;", "Lvinificator/attabal;", "Lacidy/dern;", "", "adFormat", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "Lcomplexometry/attabal;", "adObject", "<init>", "(Ljava/lang/String;Lcom/yoadx/ad/lib/bean/LoadedAdObject;)V", "", "dern", "()V", "marial", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class beachfront extends attabal implements acidy.dern {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beachfront(String adFormat, LoadedAdObject<? extends complexometry.attabal> adObject) {
        super(adFormat, adObject);
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
    }

    @Override // vinificator.attabal, complexometry.dern
    public void marial() {
        String strCompetently;
        super.marial();
        taiyuan().setAdShowTime(System.currentTimeMillis());
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        String showScenes = taiyuan().getShowScenes();
        Intrinsics.checkNotNullExpressionValue(showScenes, "getShowScenes(...)");
        String adFormat = getAdFormat();
        String adUnitID = taiyuan().getAdUnitID();
        Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        String adUnitName = taiyuan().getAdUnitName();
        Intrinsics.checkNotNullExpressionValue(adUnitName, "getAdUnitName(...)");
        complexometry.attabal loadedAdObject = taiyuan().getLoadedAdObject();
        if (loadedAdObject == null || (strCompetently = Function0.competently(loadedAdObject)) == null) {
            strCompetently = "Default";
        }
        String str = strCompetently;
        String adCacheId = taiyuan().getAdCacheId();
        Intrinsics.checkNotNullExpressionValue(adCacheId, "getAdCacheId(...)");
        attabalVar.impassible(showScenes, new AdUnitReportInfo(adFormat, adUnitID, adUnitName, str, adCacheId, null, 32, null), new AdShowReportInfo((int) ((System.currentTimeMillis() - taiyuan().getAdLoadedTime()) / ((long) 1000)), 0L, null, 0, null, 30, null));
    }

    @Override // vinificator.attabal, complexometry.dern
    public void dern() {
    }
}
