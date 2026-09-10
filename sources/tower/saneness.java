package tower;

import android.content.Context;
import android.os.Bundle;
import com.yoadx.ad.lib.bean.AdLtvReportInfo;
import com.yoadx.ad.lib.core.YoadAdSdk;
import complexometry.taiyuan;
import kotlin.Function0;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdLtvReport.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltower/saneness;", "", "<init>", "()V", "", "adScenes", "Lcomplexometry/taiyuan;", "adValue", "Lcom/yoadx/ad/lib/bean/AdLtvReportInfo;", "adInfo", "", "attabal", "(Ljava/lang/String;Lcomplexometry/taiyuan;Lcom/yoadx/ad/lib/bean/AdLtvReportInfo;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f38904attabal = new saneness();

    public final void attabal(String adScenes, taiyuan adValue, AdLtvReportInfo adInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Context contextDern = YoadAdSdk.f23874attabal.dern();
        if (contextDern == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("ad_platform", "yoadx");
        bundle.putString("ad_source", adInfo.getAdSource());
        bundle.putString("ad_id", adInfo.getAdId());
        bundle.putString("ad_format", adInfo.getAdFormat());
        bundle.putString("ad_unit_name", adInfo.getAdUnitName());
        bundle.putString("ad_unit_id", adInfo.getAdUnitId());
        bundle.putString("ad_country", com.yolo.networklibrary.common.util.dern.taiyuan(contextDern));
        bundle.putString("ad_scenes", adScenes);
        if (adInfo.getResponseMediationAdapterClassName().length() > 0) {
            bundle.putString("ad_adapter", adInfo.getResponseMediationAdapterClassName());
        }
        bundle.putString("precision", adValue.getPrecisionType().name());
        bundle.putString("currency", "USD");
        bundle.putDouble("value", Function0.taiyuan(adValue));
        marial.f38903attabal.wireman(contextDern, adValue, bundle);
        wireman.f38905attabal.wireman(contextDern, adValue, bundle);
    }
}
