package darpa;

import android.text.TextUtils;
import com.appsflyer.AFInAppEventParameterName;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.Map;

/* JADX INFO: compiled from: AdwordsAppsflyerAttributionAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {
    public static kaoline.wireman attabal(Map<String, Object> map) {
        try {
            Object obj = map.get("media_source");
            Object obj2 = map.get("campaign_id");
            Object obj3 = map.get(MBInterstitialActivity.INTENT_CAMAPIGN);
            Object obj4 = map.get("af_adset_id");
            Object obj5 = map.get("af_adset");
            Object obj6 = map.get(AFInAppEventParameterName.AF_CHANNEL);
            Object obj7 = map.get(AFInAppEventParameterName.AF_CHANNEL);
            String str = "attribution=" + map.toString();
            kaoline.wireman wiremanVar = new kaoline.wireman();
            String string = "";
            wiremanVar.kattegat(obj == null ? "" : obj.toString());
            wiremanVar.cord(obj2 == null ? "" : obj2.toString());
            wiremanVar.cuirassed(obj3 == null ? "" : obj3.toString());
            wiremanVar.yemenite(obj4 == null ? "" : obj4.toString());
            wiremanVar.sealless(obj5 == null ? "" : obj5.toString());
            wiremanVar.preprohormone(str);
            wiremanVar.graveside(str);
            wiremanVar.rotuma("appsflyer");
            wiremanVar.adultoid(obj == null ? "" : obj.toString());
            wiremanVar.trm(obj6 == null ? "" : obj6.toString());
            if (obj7 != null) {
                string = obj7.toString();
            }
            wiremanVar.oilcan(string);
            return wiremanVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return new kaoline.wireman();
        }
    }

    public static boolean saneness(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get("media_source")) == null || TextUtils.isEmpty(obj.toString())) {
            return false;
        }
        String lowerCase = obj.toString().toLowerCase();
        return lowerCase.toLowerCase().contains(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE) || lowerCase.contains("adwords") || lowerCase.contains("uac");
    }
}
