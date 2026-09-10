package u5;

import android.net.Uri;
import com.adjust.sdk.AdjustEventSuccess;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.AdjustThirdPartySharingResult;
import com.adjust.sdk.Constants;
import com.adjust.sdk.OnDeferredDeeplinkResponseListener;
import com.adjust.sdk.OnEventTrackingSucceededListener;
import com.adjust.sdk.OnSessionTrackingSucceededListener;
import com.adjust.sdk.OnThirdPartySharingSettingsChangedListener;
import com.adjust.sdk.flutter.AdjustSdk;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements OnSessionTrackingSucceededListener, OnEventTrackingSucceededListener, OnDeferredDeeplinkResponseListener, OnThirdPartySharingSettingsChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f51907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustSdk f51908b;

    public /* synthetic */ d(AdjustSdk adjustSdk, String str) {
        this.f51908b = adjustSdk;
        this.f51907a = str;
    }

    @Override // com.adjust.sdk.OnDeferredDeeplinkResponseListener
    public boolean launchReceivedDeeplink(Uri uri) {
        HashMap map = new HashMap();
        map.put(Constants.DEEPLINK, uri.toString());
        AdjustSdk adjustSdk = this.f51908b;
        if (adjustSdk.channel != null) {
            adjustSdk.channel.a(this.f51907a, map, null);
        }
        return AdjustSdk.isDeferredDeeplinkOpeningEnabled;
    }

    @Override // com.adjust.sdk.OnEventTrackingSucceededListener
    public void onEventTrackingSucceeded(AdjustEventSuccess adjustEventSuccess) {
        HashMap map = new HashMap();
        map.put("message", adjustEventSuccess.message);
        map.put("timestamp", adjustEventSuccess.timestamp);
        map.put("adid", adjustEventSuccess.adid);
        map.put("eventToken", adjustEventSuccess.eventToken);
        map.put("callbackId", adjustEventSuccess.callbackId);
        JSONObject jSONObject = adjustEventSuccess.jsonResponse;
        if (jSONObject != null) {
            map.put("jsonResponse", jSONObject.toString());
        }
        AdjustSdk adjustSdk = this.f51908b;
        if (adjustSdk.channel != null) {
            adjustSdk.channel.a(this.f51907a, map, null);
        }
    }

    @Override // com.adjust.sdk.OnSessionTrackingSucceededListener
    public void onSessionTrackingSucceeded(AdjustSessionSuccess adjustSessionSuccess) {
        HashMap map = new HashMap();
        map.put("message", adjustSessionSuccess.message);
        map.put("timestamp", adjustSessionSuccess.timestamp);
        map.put("adid", adjustSessionSuccess.adid);
        JSONObject jSONObject = adjustSessionSuccess.jsonResponse;
        if (jSONObject != null) {
            map.put("jsonResponse", jSONObject.toString());
        }
        AdjustSdk adjustSdk = this.f51908b;
        if (adjustSdk.channel != null) {
            adjustSdk.channel.a(this.f51907a, map, null);
        }
    }

    @Override // com.adjust.sdk.OnThirdPartySharingSettingsChangedListener
    public void onThirdPartySharingSettingsChanged(AdjustThirdPartySharingResult adjustThirdPartySharingResult) {
        if (adjustThirdPartySharingResult == null) {
            return;
        }
        AdjustSdk adjustSdk = this.f51908b;
        if (adjustSdk.channel != null) {
            adjustSdk.channel.a(this.f51907a, adjustSdk.getThirdPartySharingResultMap(adjustThirdPartySharingResult), null);
        }
    }
}
