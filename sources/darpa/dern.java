package darpa;

import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.Map;

/* JADX INFO: compiled from: DefaultAppsflyerAttributionAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern {
    public static kaoline.wireman attabal(Map<String, Object> map, String str) {
        try {
            Object obj = map.get("media_source");
            Object obj2 = ((obj == null || obj.toString().equals("restricted")) && !hawkthorn.attabal.f27589attabal.marial(str)) ? str : obj;
            Object obj3 = map.get("campaign_id");
            Object obj4 = map.get(MBInterstitialActivity.INTENT_CAMAPIGN);
            Object obj5 = map.get("af_siteid");
            Object obj6 = map.get("af_ad_id");
            Object obj7 = map.get("af_ad");
            String str2 = "attribution=" + map.toString();
            kaoline.wireman wiremanVar = new kaoline.wireman();
            String string = "";
            wiremanVar.kattegat(obj2 == null ? "" : obj2.toString());
            wiremanVar.cord(obj3 == null ? "" : obj3.toString());
            wiremanVar.cuirassed(obj4 == null ? "" : obj4.toString());
            wiremanVar.yemenite(obj5 == null ? "" : obj5.toString());
            wiremanVar.preprohormone(str2);
            wiremanVar.graveside(str2);
            wiremanVar.rotuma("appsflyer");
            wiremanVar.adultoid(obj2 == null ? "" : obj2.toString());
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
}
