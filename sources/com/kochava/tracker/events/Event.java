package com.kochava.tracker.events;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventTypes;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.core.util.internal.TimeUtil;
import com.smartdigimkt.q0.b;
import java.util.Date;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Event implements EventApi {
    private static final ClassLoggerApi d = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "Event");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JsonObjectApi f28162b = JsonObject.w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonObjectApi f28163c = JsonObject.w();

    private Event(String str) {
        this.f28161a = str;
    }

    private EventApi a(JsonObjectApi jsonObjectApi) {
        if (jsonObjectApi == null || jsonObjectApi.length() == 0) {
            d.c("mergeCustomDictionary failed, invalid input");
            return this;
        }
        this.f28162b.b(jsonObjectApi);
        return this;
    }

    public static EventApi buildWithEventName(String str) {
        String strN = ObjectUtil.n(str);
        if (strN == null) {
            strN = "";
        }
        return new Event(strN);
    }

    public static EventApi buildWithEventType(EventTypeApi eventTypeApi) {
        return eventTypeApi == null ? new Event("") : new Event(eventTypeApi.getEventName());
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized JSONObject getData() {
        JsonObject jsonObjectW;
        try {
            jsonObjectW = JsonObject.w();
            jsonObjectW.g(b.S0, this.f28161a);
            if (this.f28162b.length() > 0) {
                jsonObjectW.r("event_data", this.f28162b.c());
            }
            if (this.f28163c.length() > 0) {
                jsonObjectW.r("receipt", this.f28163c.c());
            }
        } catch (Throwable th) {
            throw th;
        }
        return jsonObjectW.m();
    }

    @Override // com.kochava.tracker.events.EventApi
    public String getEventName() {
        return this.f28161a;
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi mergeCustomDictionary(Map<String, Object> map) {
        return a(ObjectUtil.l(map, true));
    }

    @Override // com.kochava.tracker.events.EventApi
    public void send() {
        Events.getInstance().sendWithEvent(this);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setAction(String str) {
        return setCustomStringValue("action", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setAdCampaignId(String str) {
        return setCustomStringValue("ad_campaign_id", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setAdCampaignName(String str) {
        return setCustomStringValue("ad_campaign_name", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setAdDeviceType(String str) {
        return setCustomStringValue("device_type", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setAdGroupId(String str) {
        return setCustomStringValue("ad_group_id", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setAdGroupName(String str) {
        return setCustomStringValue("ad_group_name", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setAdMediationName(String str) {
        return setCustomStringValue("ad_mediation_name", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setAdNetworkName(String str) {
        return setCustomStringValue("ad_network_name", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setAdPlacement(String str) {
        return setCustomStringValue("placement", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setAdSize(String str) {
        return setCustomStringValue("ad_size", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setAdType(String str) {
        return setCustomStringValue("ad_type", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setBackground(boolean z2) {
        return setCustomBoolValue("background", z2);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setCheckoutAsGuest(String str) {
        return setCustomStringValue("checkout_as_guest", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setCompleted(boolean z2) {
        return setCustomBoolValue("completed", z2);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setContentId(String str) {
        return setCustomStringValue("content_id", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setContentType(String str) {
        return setCustomStringValue("content_type", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setCurrency(String str) {
        return setCustomStringValue("currency", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setCustomBoolValue(String str, boolean z2) {
        if (!TextUtil.b(str)) {
            this.f28162b.o(str, z2);
            return this;
        }
        d.c("setCustomBoolValue for key " + str + " failed, invalid input");
        return this;
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setCustomDateValue(String str, Date date) {
        if (!TextUtil.b(str) && date != null) {
            this.f28162b.g(str, TimeUtil.a(date));
            return this;
        }
        d.c("setCustomDateValue for key " + str + " failed, invalid input");
        return this;
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setCustomNumberValue(String str, double d2) {
        if (!TextUtil.b(str)) {
            this.f28162b.q(d2, str);
            return this;
        }
        d.c("setCustomNumberValue for key " + str + " failed, invalid input");
        return this;
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setCustomStringValue(String str, String str2) {
        if (!TextUtil.b(str) && !TextUtil.b(str2)) {
            this.f28162b.g(str, str2);
            return this;
        }
        d.c("setCustomStringValue for key " + str + " failed, invalid input");
        return this;
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setDate(String str) {
        return setCustomStringValue("date", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setDateNative(Date date) {
        return setCustomDateValue("date", date);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setDescription(String str) {
        return setCustomStringValue("description", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setDestination(String str) {
        return setCustomStringValue("destination", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setDuration(double d2) {
        return setCustomNumberValue("duration", d2);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setEndDate(String str) {
        return setCustomStringValue(AppLovinEventParameters.RESERVATION_END_TIMESTAMP, str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setEndDateNative(Date date) {
        return setCustomDateValue(AppLovinEventParameters.RESERVATION_END_TIMESTAMP, date);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setGooglePlayReceipt(String str, String str2) {
        if (!TextUtil.b(str) && !TextUtil.b(str2)) {
            this.f28163c.g("purchaseData", str);
            this.f28163c.g("dataSignature", str2);
            return this;
        }
        d.c("setGooglePlayReceipt failed, invalid input");
        return this;
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setItemAddedFrom(String str) {
        return setCustomStringValue("item_added_from", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setLevel(String str) {
        return setCustomStringValue(AppLovinEventTypes.USER_COMPLETED_LEVEL, str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setMaxRatingValue(double d2) {
        return setCustomNumberValue("max_rating_value", d2);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setName(String str) {
        return setCustomStringValue("name", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setOrderId(String str) {
        return setCustomStringValue("order_id", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setOrigin(String str) {
        return setCustomStringValue("origin", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setPayload(Map<String, Object> map) {
        return a("payload", ObjectUtil.l(map, true));
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setPrice(double d2) {
        return setCustomNumberValue("price", d2);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setQuantity(double d2) {
        return setCustomNumberValue("quantity", d2);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setRatingValue(double d2) {
        return setCustomNumberValue("rating_value", d2);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setReceiptId(String str) {
        return setCustomStringValue("receipt_id", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setReferralFrom(String str) {
        return setCustomStringValue("referral_from", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setRegistrationMethod(String str) {
        return setCustomStringValue("registration_method", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setResults(String str) {
        return setCustomStringValue("results", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setScore(String str) {
        return setCustomStringValue("score", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setSearchTerm(String str) {
        return setCustomStringValue("search_term", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setSource(String str) {
        return setCustomStringValue("source", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setSpatialX(double d2) {
        return setCustomNumberValue("spatial_x", d2);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setSpatialY(double d2) {
        return setCustomNumberValue("spatial_y", d2);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setSpatialZ(double d2) {
        return setCustomNumberValue("spatial_z", d2);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setStartDate(String str) {
        return setCustomStringValue(AppLovinEventParameters.RESERVATION_START_TIMESTAMP, str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setStartDateNative(Date date) {
        return setCustomDateValue(AppLovinEventParameters.RESERVATION_START_TIMESTAMP, date);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setSuccess(String str) {
        return setCustomStringValue("success", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setUri(String str) {
        return setCustomStringValue("uri", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setUriNative(Uri uri) {
        return a("uri", uri);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setUserId(String str) {
        return setCustomStringValue("user_id", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setUserName(String str) {
        return setCustomStringValue("user_name", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setValidated(String str) {
        return setCustomStringValue("validated", str);
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi mergeCustomDictionary(JSONObject jSONObject) {
        return a(ObjectUtil.l(jSONObject, true));
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setPayload(JSONObject jSONObject) {
        return a("payload", ObjectUtil.l(jSONObject, true));
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi mergeCustomDictionary(Bundle bundle) {
        return a(ObjectUtil.l(bundle, true));
    }

    @Override // com.kochava.tracker.events.EventApi
    public synchronized EventApi setPayload(Bundle bundle) {
        return a("payload", ObjectUtil.l(bundle, true));
    }

    private EventApi a(String str, JsonObjectApi jsonObjectApi) {
        if (!TextUtil.b(str) && jsonObjectApi != null && jsonObjectApi.length() != 0) {
            this.f28162b.r("payload", jsonObjectApi);
            return this;
        }
        d.c("setCustomDictionary for key " + str + " failed, invalid input");
        return this;
    }

    private EventApi a(String str, Uri uri) {
        if (!TextUtil.b(str) && uri != null) {
            this.f28162b.g(str, uri.toString());
            return this;
        }
        d.c("setCustomUri for key " + str + " failed, invalid input");
        return this;
    }
}
