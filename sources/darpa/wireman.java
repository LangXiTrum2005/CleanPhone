package darpa;

import android.text.TextUtils;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.Map;

/* JADX INFO: compiled from: FacebookAppsflyerAttributionAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman {
    public static kaoline.wireman attabal(Map<String, Object> map) {
        try {
            Object obj = map.get("campaign_id");
            Object obj2 = map.get(MBInterstitialActivity.INTENT_CAMAPIGN);
            Object obj3 = map.get("adset_id");
            Object obj4 = map.get("adset");
            Object obj5 = map.get("adgroup_id");
            Object obj6 = map.get("adgroup");
            String str = "attribution=" + map.toString();
            kaoline.wireman wiremanVar = new kaoline.wireman();
            wiremanVar.adultoid("Facebook");
            wiremanVar.kattegat("Facebook");
            String string = "";
            wiremanVar.cord(obj == null ? "" : obj.toString());
            wiremanVar.cuirassed(obj2 == null ? "" : obj2.toString());
            wiremanVar.yemenite(obj3 == null ? "" : obj3.toString());
            wiremanVar.sealless(obj4 == null ? "" : obj4.toString());
            wiremanVar.rotuma("appsflyer");
            wiremanVar.preprohormone(str);
            wiremanVar.graveside(str);
            wiremanVar.trm(obj5 == null ? "" : obj5.toString());
            if (obj6 != null) {
                string = obj6.toString();
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
        return lowerCase.contains("facebook") || lowerCase.contains("fb") || lowerCase.contains("face") || lowerCase.contains("instagram") || lowerCase.contains("audience") || lowerCase.contains("messenger");
    }
}
