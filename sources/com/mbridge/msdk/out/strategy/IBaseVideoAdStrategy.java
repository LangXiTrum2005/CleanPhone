package com.mbridge.msdk.out.strategy;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface IBaseVideoAdStrategy {
    void clearVideoCache();

    String getCreativeIdWithUnitId();

    String getRequestId();

    void loadFormSelfFilling();

    void playVideoMute(int i10);

    void setAlertDialogText(String str, String str2, String str3, String str4);

    void setExtraInfo(JSONObject jSONObject);

    void setRewardPlus(boolean z10);
}
