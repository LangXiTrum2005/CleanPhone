package com.kochava.tracker.events;

import android.net.Uri;
import android.os.Bundle;
import java.util.Date;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface EventApi {
    JSONObject getData();

    String getEventName();

    EventApi mergeCustomDictionary(Bundle bundle);

    EventApi mergeCustomDictionary(Map<String, Object> map);

    EventApi mergeCustomDictionary(JSONObject jSONObject);

    void send();

    EventApi setAction(String str);

    EventApi setAdCampaignId(String str);

    EventApi setAdCampaignName(String str);

    EventApi setAdDeviceType(String str);

    EventApi setAdGroupId(String str);

    EventApi setAdGroupName(String str);

    EventApi setAdMediationName(String str);

    EventApi setAdNetworkName(String str);

    EventApi setAdPlacement(String str);

    EventApi setAdSize(String str);

    EventApi setAdType(String str);

    EventApi setBackground(boolean z2);

    EventApi setCheckoutAsGuest(String str);

    EventApi setCompleted(boolean z2);

    EventApi setContentId(String str);

    EventApi setContentType(String str);

    EventApi setCurrency(String str);

    EventApi setCustomBoolValue(String str, boolean z2);

    EventApi setCustomDateValue(String str, Date date);

    EventApi setCustomNumberValue(String str, double d);

    EventApi setCustomStringValue(String str, String str2);

    EventApi setDate(String str);

    EventApi setDateNative(Date date);

    EventApi setDescription(String str);

    EventApi setDestination(String str);

    EventApi setDuration(double d);

    EventApi setEndDate(String str);

    EventApi setEndDateNative(Date date);

    EventApi setGooglePlayReceipt(String str, String str2);

    EventApi setItemAddedFrom(String str);

    EventApi setLevel(String str);

    EventApi setMaxRatingValue(double d);

    EventApi setName(String str);

    EventApi setOrderId(String str);

    EventApi setOrigin(String str);

    EventApi setPayload(Bundle bundle);

    EventApi setPayload(Map<String, Object> map);

    EventApi setPayload(JSONObject jSONObject);

    EventApi setPrice(double d);

    EventApi setQuantity(double d);

    EventApi setRatingValue(double d);

    EventApi setReceiptId(String str);

    EventApi setReferralFrom(String str);

    EventApi setRegistrationMethod(String str);

    EventApi setResults(String str);

    EventApi setScore(String str);

    EventApi setSearchTerm(String str);

    EventApi setSource(String str);

    EventApi setSpatialX(double d);

    EventApi setSpatialY(double d);

    EventApi setSpatialZ(double d);

    EventApi setStartDate(String str);

    EventApi setStartDateNative(Date date);

    EventApi setSuccess(String str);

    EventApi setUri(String str);

    EventApi setUriNative(Uri uri);

    EventApi setUserId(String str);

    EventApi setUserName(String str);

    EventApi setValidated(String str);
}
