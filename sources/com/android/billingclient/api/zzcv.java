package com.android.billingclient.api;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcv {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f16556attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ProductDetails.PricingPhase f16557beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f16558dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f16559marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f16560saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f16561wireman;

    public zzcv(JSONObject jSONObject) throws JSONException {
        this.f16556attabal = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f16560saneness = jSONObject.optString("title");
        this.f16558dern = jSONObject.optString("name");
        this.f16561wireman = jSONObject.optString(InMobiNetworkValues.DESCRIPTION);
        this.f16559marial = jSONObject.optString("basePlanId");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.f16557beachfront = jSONObjectOptJSONObject == null ? null : new ProductDetails.PricingPhase(jSONObjectOptJSONObject);
    }
}
