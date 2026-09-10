package neanderthalian;

import com.google.android.gms.ads.RequestConfiguration;
import com.yoadx.ad.lib.bean.AdGroupConfig;
import com.yoadx.ad.lib.bean.AdUnitConfig;
import com.yoadx.ad.lib.cloud.AdConfigCloudManager;
import com.yoadx.ad.lib.core.beachfront;
import java.util.ArrayList;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AdNativeCommonManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lneanderthalian/attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/yoadx/ad/lib/core/beachfront;", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface attabal<T> extends beachfront<T> {

    /* JADX INFO: renamed from: neanderthalian.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdNativeCommonManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C0753attabal {
        public static <T> void attabal(attabal<T> attabalVar) {
            AdGroupConfig adGroupConfigDern = AdConfigCloudManager.f23864attabal.dern();
            if (adGroupConfigDern == null) {
                dustman.attabal.f25384attabal.saneness("Yoadx_ad_native", " AdConfigResponse is null");
                return;
            }
            ArrayList<AdUnitConfig> commonNativeAdCloud = adGroupConfigDern.getCommonNativeAdCloud();
            if (commonNativeAdCloud == null || commonNativeAdCloud.isEmpty()) {
                dustman.attabal.f25384attabal.saneness("Yoadx_ad_native", " AdConfigResponse no ad unit config");
            } else {
                attabalVar.attabal(commonNativeAdCloud);
            }
        }
    }
}
