package com.smartdigimkt.sdk.api.format;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface IMyOfferAdManager {
    boolean checkOffersOutOfCap(Context context, String str);

    String getDefaultOfferId(Context context, String str);

    String getOutOfCapOfferIds(Context context);

    void preloadTopOnOffer(Context context, String str, JSONObject jSONObject);
}
