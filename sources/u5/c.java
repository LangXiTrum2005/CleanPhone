package u5;

import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustEventFailure;
import com.adjust.sdk.AdjustRemoteTrigger;
import com.adjust.sdk.AdjustSessionFailure;
import com.adjust.sdk.OnAttributionChangedListener;
import com.adjust.sdk.OnEventTrackingFailedListener;
import com.adjust.sdk.OnRemoteTriggerListener;
import com.adjust.sdk.OnSessionTrackingFailedListener;
import com.adjust.sdk.flutter.AdjustSdk;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements OnAttributionChangedListener, OnSessionTrackingFailedListener, OnEventTrackingFailedListener, OnRemoteTriggerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f51905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustSdk f51906b;

    public /* synthetic */ c(AdjustSdk adjustSdk, String str) {
        this.f51906b = adjustSdk;
        this.f51905a = str;
    }

    @Override // com.adjust.sdk.OnAttributionChangedListener
    public void onAttributionChanged(AdjustAttribution adjustAttribution) {
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
        AdjustSdk adjustSdk = this.f51906b;
        if (adjustSdk.channel != null) {
            adjustSdk.channel.a(this.f51905a, map, null);
        }
    }

    @Override // com.adjust.sdk.OnEventTrackingFailedListener
    public void onEventTrackingFailed(AdjustEventFailure adjustEventFailure) {
        HashMap map = new HashMap();
        map.put("message", adjustEventFailure.message);
        map.put("timestamp", adjustEventFailure.timestamp);
        map.put("adid", adjustEventFailure.adid);
        map.put("eventToken", adjustEventFailure.eventToken);
        map.put("callbackId", adjustEventFailure.callbackId);
        map.put("willRetry", Boolean.toString(adjustEventFailure.willRetry));
        JSONObject jSONObject = adjustEventFailure.jsonResponse;
        if (jSONObject != null) {
            map.put("jsonResponse", jSONObject.toString());
        }
        AdjustSdk adjustSdk = this.f51906b;
        if (adjustSdk.channel != null) {
            adjustSdk.channel.a(this.f51905a, map, null);
        }
    }

    @Override // com.adjust.sdk.OnRemoteTriggerListener
    public void onRemoteTrigger(AdjustRemoteTrigger adjustRemoteTrigger) {
        AdjustSdk adjustSdk = this.f51906b;
        if (adjustSdk.channel != null) {
            adjustSdk.channel.a(this.f51905a, adjustSdk.getRemoteTriggerMap(adjustRemoteTrigger), null);
        }
    }

    @Override // com.adjust.sdk.OnSessionTrackingFailedListener
    public void onSessionTrackingFailed(AdjustSessionFailure adjustSessionFailure) {
        HashMap map = new HashMap();
        map.put("message", adjustSessionFailure.message);
        map.put("timestamp", adjustSessionFailure.timestamp);
        map.put("adid", adjustSessionFailure.adid);
        map.put("willRetry", Boolean.toString(adjustSessionFailure.willRetry));
        JSONObject jSONObject = adjustSessionFailure.jsonResponse;
        if (jSONObject != null) {
            map.put("jsonResponse", jSONObject.toString());
        }
        AdjustSdk adjustSdk = this.f51906b;
        if (adjustSdk.channel != null) {
            adjustSdk.channel.a(this.f51905a, map, null);
        }
    }
}
