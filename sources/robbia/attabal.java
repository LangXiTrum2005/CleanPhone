package robbia;

import com.yoadx.ad.lib.bean.AdGroupConfig;
import com.yoadx.ad.lib.bean.AdUnitConfig;
import com.yoadx.ad.lib.cloud.AdConfigCloudManager;
import com.yoadx.ad.lib.core.beachfront;
import java.util.ArrayList;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AdAppOpenCommonManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lrobbia/attabal;", "Lcom/yoadx/ad/lib/core/beachfront;", "Lextensimeter/attabal;", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface attabal extends beachfront<extensimeter.attabal> {

    /* JADX INFO: renamed from: robbia.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdAppOpenCommonManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C0789attabal {
        public static void attabal(attabal attabalVar) {
            AdGroupConfig adGroupConfigDern = AdConfigCloudManager.f23864attabal.dern();
            if (adGroupConfigDern == null) {
                dustman.attabal.f25384attabal.saneness("Yoadx_ad_appopen", " AdConfigResponse is null");
                return;
            }
            ArrayList<AdUnitConfig> commonAppOpenAdCloud = adGroupConfigDern.getCommonAppOpenAdCloud();
            if (commonAppOpenAdCloud == null || commonAppOpenAdCloud.isEmpty()) {
                dustman.attabal.f25384attabal.saneness("Yoadx_ad_appopen", " AdConfigResponse no ad unit config");
            } else {
                attabalVar.attabal(commonAppOpenAdCloud);
            }
        }
    }
}
