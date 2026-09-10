package com.thinkup.network.myoffer;

import android.content.Context;
import com.smartdigimkt.sdk.api.SDMSDK;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MyOfferAPI {
    public static boolean checkOffersOutOfCap(Context context, String str) {
        return SDMSDK.getInstance().getMyOfferAdManager().checkOffersOutOfCap(context, str);
    }

    public static String getDefaultOfferId(Context context, String str) {
        return SDMSDK.getInstance().getMyOfferAdManager().getDefaultOfferId(context, str);
    }

    public static String getOutOfCapOfferIds(Context context) {
        return SDMSDK.getInstance().getMyOfferAdManager().getOutOfCapOfferIds(context);
    }

    public static void preloadTopOnOffer(Context context, String str, JSONObject jSONObject) {
        SDMSDK.getInstance().getMyOfferAdManager().preloadTopOnOffer(context, str, jSONObject);
    }
}
