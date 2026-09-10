package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFi1zSDK {
    public final AFh1aSDK getCurrencyIso4217Code;
    public AFi1xSDK getMediationNetwork;
    public final AFi1uSDK getMonetizationNetwork;

    public AFi1zSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getMediationNetwork = AFAdRevenueData(jSONObject);
        this.getCurrencyIso4217Code = getMediationNetwork(jSONObject);
        this.getMonetizationNetwork = getCurrencyIso4217Code(jSONObject);
    }

    private static AFi1xSDK AFAdRevenueData(JSONObject jSONObject) {
        Object objM3351constructorimpl;
        AFi1xSDK aFi1xSDK;
        List listFormularize;
        try {
            Result.Companion attabalVar = Result.INSTANCE;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (jSONObjectAFAdRevenueData != null) {
                long j = jSONObjectAFAdRevenueData.getLong("ttl");
                int i = jSONObjectAFAdRevenueData.getInt("counter");
                String strOptString = jSONObjectAFAdRevenueData.optString("app_ver", "");
                String strOptString2 = jSONObjectAFAdRevenueData.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectAFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectAFAdRevenueData.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                    listFormularize = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArrayOptJSONArray.getString(i2);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        listFormularize.add(string);
                    }
                } else {
                    listFormularize = p002kotlin.collections.adultoid.formularize();
                }
                List list = listFormularize;
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                aFi1xSDK = new AFi1xSDK(j, fOptDouble, list, i, strOptString, strOptString2);
            } else {
                aFi1xSDK = null;
            }
            objM3351constructorimpl = Result.m3351constructorimpl(aFi1xSDK);
        } catch (Throwable th) {
            Result.Companion attabalVar2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        return (AFi1xSDK) (Result.m3356isFailureimpl(objM3351constructorimpl) ? null : objM3351constructorimpl);
    }

    private static AFi1uSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object objM3351constructorimpl;
        try {
            Result.Companion attabalVar = Result.INSTANCE;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            objM3351constructorimpl = Result.m3351constructorimpl(jSONObjectAFAdRevenueData != null ? new AFi1uSDK(jSONObjectAFAdRevenueData.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            Result.Companion attabalVar2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        return (AFi1uSDK) (Result.m3356isFailureimpl(objM3351constructorimpl) ? null : objM3351constructorimpl);
    }

    private static AFh1aSDK getMediationNetwork(JSONObject jSONObject) {
        Object objM3351constructorimpl;
        try {
            Result.Companion attabalVar = Result.INSTANCE;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            objM3351constructorimpl = Result.m3351constructorimpl(jSONObjectAFAdRevenueData != null ? new AFh1aSDK(jSONObjectAFAdRevenueData.getString("sdk_ver"), jSONObjectAFAdRevenueData.optInt("min", -1), jSONObjectAFAdRevenueData.optInt("expire", -1), jSONObjectAFAdRevenueData.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            Result.Companion attabalVar2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        return (AFh1aSDK) (Result.m3356isFailureimpl(objM3351constructorimpl) ? null : objM3351constructorimpl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.wireman(AFi1zSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.competently(obj, "");
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return Intrinsics.wireman(this.getCurrencyIso4217Code, aFi1zSDK.getCurrencyIso4217Code) && Intrinsics.wireman(this.getMonetizationNetwork, aFi1zSDK.getMonetizationNetwork) && Intrinsics.wireman(this.getMediationNetwork, aFi1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        AFh1aSDK aFh1aSDK = this.getCurrencyIso4217Code;
        int iHashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
        AFi1uSDK aFi1uSDK = this.getMonetizationNetwork;
        int iHashCode2 = (iHashCode + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0)) * 31;
        AFi1xSDK aFi1xSDK = this.getMediationNetwork;
        return iHashCode2 + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
