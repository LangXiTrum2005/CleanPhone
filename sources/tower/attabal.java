package tower;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.yoadx.ad.lib.bean.AdLoadReportInfo;
import com.yoadx.ad.lib.bean.AdShowReportInfo;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import com.yoadx.ad.lib.core.YoadAdSdk;
import com.yolo.networklibrary.common.util.impromptu;
import java.util.UUID;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdActionReport.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ%\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\nJ%\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\nJ%\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0016J%\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0016J%\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u0016J/\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Ltower/attabal;", "", "<init>", "()V", "", "adScenes", "Lcom/yoadx/ad/lib/bean/AdUnitReportInfo;", "adInfo", "", "triweekly", "(Ljava/lang/String;Lcom/yoadx/ad/lib/bean/AdUnitReportInfo;)V", "Lcom/yoadx/ad/lib/bean/AdLoadReportInfo;", "adLoadInfo", "impromptu", "(Ljava/lang/String;Lcom/yoadx/ad/lib/bean/AdUnitReportInfo;Lcom/yoadx/ad/lib/bean/AdLoadReportInfo;)V", "beachfront", "competently", "formularize", "cutely", "Lcom/yoadx/ad/lib/bean/AdShowReportInfo;", "adShowInfo", "impassible", "(Ljava/lang/String;Lcom/yoadx/ad/lib/bean/AdUnitReportInfo;Lcom/yoadx/ad/lib/bean/AdShowReportInfo;)V", "taiyuan", "apical", "attabal", "saneness", "dern", "", "adAction", "marial", "(ILjava/lang/String;Lcom/yoadx/ad/lib/bean/AdUnitReportInfo;Lcom/yoadx/ad/lib/bean/AdLoadReportInfo;)V", "wireman", "(ILjava/lang/String;Lcom/yoadx/ad/lib/bean/AdUnitReportInfo;Lcom/yoadx/ad/lib/bean/AdShowReportInfo;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f38900attabal = new attabal();

    public final void apical(String adScenes, AdUnitReportInfo adInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        wireman(34, adScenes, adInfo, new AdShowReportInfo(0, 0L, null, 0, null, 31, null));
    }

    public final void attabal(String adScenes, AdUnitReportInfo adInfo, AdShowReportInfo adShowInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(adShowInfo, "adShowInfo");
        wireman(41, adScenes, adInfo, adShowInfo);
    }

    public final void beachfront(String adScenes, AdUnitReportInfo adInfo, AdLoadReportInfo adLoadInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(adLoadInfo, "adLoadInfo");
        marial(12, adScenes, adInfo, adLoadInfo);
    }

    public final void competently(String adScenes, AdUnitReportInfo adInfo, AdLoadReportInfo adLoadInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(adLoadInfo, "adLoadInfo");
        marial(13, adScenes, adInfo, adLoadInfo);
    }

    public final void cutely(String adScenes, AdUnitReportInfo adInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        wireman(35, adScenes, adInfo, new AdShowReportInfo(0, 0L, null, 0, null, 31, null));
    }

    public final void dern(String adScenes, AdUnitReportInfo adInfo, AdShowReportInfo adShowInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(adShowInfo, "adShowInfo");
        wireman(33, adScenes, adInfo, adShowInfo);
    }

    public final void formularize(String adScenes, AdUnitReportInfo adInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        wireman(30, adScenes, adInfo, new AdShowReportInfo(0, 0L, null, 0, null, 31, null));
    }

    public final void impassible(String adScenes, AdUnitReportInfo adInfo, AdShowReportInfo adShowInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(adShowInfo, "adShowInfo");
        wireman(31, adScenes, adInfo, adShowInfo);
    }

    public final void impromptu(String adScenes, AdUnitReportInfo adInfo, AdLoadReportInfo adLoadInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(adLoadInfo, "adLoadInfo");
        marial(11, adScenes, adInfo, adLoadInfo);
    }

    public final void marial(int adAction, String adScenes, AdUnitReportInfo adInfo, AdLoadReportInfo adLoadInfo) {
        Context contextDern = YoadAdSdk.f23874attabal.dern();
        if (contextDern == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("ad_action", adAction);
        bundle.putString("ad_platform", "yoadx");
        bundle.putString("ad_source", adInfo.getAdSource());
        bundle.putString("ad_format", adInfo.getAdFormat());
        bundle.putString("ad_load_scenes", adScenes);
        bundle.putString("ad_unit_id", adInfo.getAdUnitId());
        bundle.putString("ad_unit_name", adInfo.getAdUnitName());
        bundle.putString("ad_country", com.yolo.networklibrary.common.util.dern.taiyuan(contextDern));
        String adId = adInfo.getAdId();
        if (adId.length() == 0) {
            adId = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(adId, "toString(...)");
        }
        bundle.putString("ad_id", adId);
        bundle.putInt("net_status", impromptu.dern(contextDern));
        if (adAction != 10) {
            bundle.putLong("ad_response_time_ms", adLoadInfo.getAdResponseTimeMS());
        }
        LoadAdError adError = adLoadInfo.getAdError();
        if (adError != null) {
            bundle.putInt("ad_error_code", adError.getCode().getValue());
            bundle.putString("ad_error_msg", com.yoadx.ad.lib.utils.attabal.f23897attabal.saneness(adError.getMessage()));
        }
        marial.f38903attabal.dern(contextDern, "ud_ad_action_request", bundle);
        wireman.f38905attabal.dern(contextDern, bundle);
    }

    public final void saneness(String adScenes, AdUnitReportInfo adInfo, AdShowReportInfo adShowInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(adShowInfo, "adShowInfo");
        wireman(51, adScenes, adInfo, adShowInfo);
    }

    public final void taiyuan(String adScenes, AdUnitReportInfo adInfo, AdShowReportInfo adShowInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(adShowInfo, "adShowInfo");
        wireman(32, adScenes, adInfo, adShowInfo);
    }

    public final void triweekly(String adScenes, AdUnitReportInfo adInfo) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        marial(10, adScenes, adInfo, new AdLoadReportInfo(0L, null, 3, null));
    }

    public final void wireman(int adAction, String adScenes, AdUnitReportInfo adInfo, AdShowReportInfo adShowInfo) {
        Context contextDern = YoadAdSdk.f23874attabal.dern();
        if (contextDern == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("ad_action", adAction);
        bundle.putString("ad_platform", "yoadx");
        bundle.putString("ad_source", adInfo.getAdSource());
        bundle.putString("ad_format", adInfo.getAdFormat());
        bundle.putString("ad_scenes", adScenes);
        bundle.putString("ad_load_scenes", adInfo.getAdLoadScenes());
        bundle.putString("ad_unit_id", adInfo.getAdUnitId());
        bundle.putString("ad_unit_name", adInfo.getAdUnitName());
        bundle.putString("ad_country", com.yolo.networklibrary.common.util.dern.taiyuan(contextDern));
        String adId = adInfo.getAdId();
        if (adId.length() == 0) {
            adId = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(adId, "toString(...)");
        }
        bundle.putString("ad_id", adId);
        if (adShowInfo.getAdCacheTimeInSec() > 0) {
            bundle.putString("ad_cache_time", String.valueOf(adShowInfo.getAdCacheTimeInSec()));
        }
        if (adShowInfo.getAdShowDurationInMs() > 0) {
            bundle.putLong("ad_show_duration_time", adShowInfo.getAdShowDurationInMs());
        }
        FullScreenContentError showError = adShowInfo.getShowError();
        if (showError != null) {
            bundle.putInt("ad_error_code", showError.getCode().getValue());
            bundle.putString("ad_error_msg", com.yoadx.ad.lib.utils.attabal.f23897attabal.saneness(showError.getMessage()));
        }
        if (adShowInfo.getShowErrorCode() > 0) {
            bundle.putInt("ad_error_code", adShowInfo.getShowErrorCode());
        }
        if (adShowInfo.getShowErrorMsg().length() > 0) {
            bundle.putString("ad_error_msg", com.yoadx.ad.lib.utils.attabal.f23897attabal.saneness(adShowInfo.getShowErrorMsg()));
        }
        marial.f38903attabal.dern(contextDern, "ud_ad_action_impression", bundle);
        wireman.f38905attabal.dern(contextDern, bundle);
    }
}
