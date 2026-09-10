package u5;

import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionReadListener;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.HashMap;
import xi.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements OnAttributionReadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f51904b;

    public /* synthetic */ b(int i10, o oVar) {
        this.f51903a = i10;
        this.f51904b = oVar;
    }

    @Override // com.adjust.sdk.OnAttributionReadListener
    public final void onAttributionRead(AdjustAttribution adjustAttribution) {
        switch (this.f51903a) {
            case 0:
                HashMap map = new HashMap();
                map.put("trackerToken", adjustAttribution.trackerToken);
                map.put("trackerName", adjustAttribution.trackerName);
                map.put("network", adjustAttribution.network);
                map.put(MBInterstitialActivity.INTENT_CAMAPIGN, adjustAttribution.campaign);
                map.put("adgroup", adjustAttribution.adgroup);
                map.put("creative", adjustAttribution.creative);
                map.put("clickLabel", adjustAttribution.clickLabel);
                map.put("costType", adjustAttribution.costType);
                Double d10 = adjustAttribution.costAmount;
                map.put("costAmount", d10 != null ? d10.toString() : "");
                map.put("costCurrency", adjustAttribution.costCurrency);
                map.put("fbInstallReferrer", adjustAttribution.fbInstallReferrer);
                String str = adjustAttribution.jsonResponse;
                if (str != null) {
                    map.put("jsonResponse", str);
                }
                this.f51904b.a(map);
                break;
            default:
                o oVar = this.f51904b;
                if (adjustAttribution != null) {
                    HashMap map2 = new HashMap();
                    map2.put("trackerToken", adjustAttribution.trackerToken);
                    map2.put("trackerName", adjustAttribution.trackerName);
                    map2.put("network", adjustAttribution.network);
                    map2.put(MBInterstitialActivity.INTENT_CAMAPIGN, adjustAttribution.campaign);
                    map2.put("adgroup", adjustAttribution.adgroup);
                    map2.put("creative", adjustAttribution.creative);
                    map2.put("clickLabel", adjustAttribution.clickLabel);
                    map2.put("costType", adjustAttribution.costType);
                    Double d11 = adjustAttribution.costAmount;
                    map2.put("costAmount", d11 != null ? d11.toString() : "");
                    map2.put("costCurrency", adjustAttribution.costCurrency);
                    map2.put("fbInstallReferrer", adjustAttribution.fbInstallReferrer);
                    String str2 = adjustAttribution.jsonResponse;
                    if (str2 != null) {
                        map2.put("jsonResponse", str2);
                    }
                    oVar.a(map2);
                } else {
                    oVar.a(null);
                }
                break;
        }
    }
}
