package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import defpackage.e;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBridgeRevenueParamsEntityForIronSource extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForIronSource(String str, String str2) {
        super(str, str2);
        setMediationName("IronSource");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    public void setIronSourceImpressionDataString(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setMediationUnitId(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strO = e.o("{", str2, "}");
        try {
            setSourceData(strO, strO);
            JSONObject jSONObject = new JSONObject(strO);
            setNetworkName(jSONObject.optString("adNetwork", ""));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceName", jSONObject.optString("instanceName", ""));
            jSONObject2.put("instanceId", jSONObject.optString("instanceId", ""));
            setNetworkInfo(jSONObject2);
            setAdType(jSONObject.optString("adUnit", ""));
            setRevenue(jSONObject.optString("revenue", ""));
            setPrecision(jSONObject.optString("precision", ""));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
