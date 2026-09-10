package com.adjust.sdk;

import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SdkClickHandler f7073a;

    public z0(SdkClickHandler sdkClickHandler) {
        this.f7073a = sdkClickHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SdkClickHandler sdkClickHandler = this.f7073a;
        IActivityHandler iActivityHandler = (IActivityHandler) sdkClickHandler.activityHandlerWeakRef.get();
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
        try {
            JSONArray rawReferrerArray = defaultInstance.getRawReferrerArray();
            boolean z10 = false;
            for (int i10 = 0; i10 < rawReferrerArray.length(); i10++) {
                JSONArray jSONArray = rawReferrerArray.getJSONArray(i10);
                if (jSONArray.optInt(2, -1) == 0) {
                    String strOptString = jSONArray.optString(0, null);
                    z10 = true;
                    long jOptLong = jSONArray.optLong(1, -1L);
                    jSONArray.put(2, 1);
                    sdkClickHandler.sendSdkClick(PackageFactory.buildReftagSdkClickPackage(strOptString, jOptLong, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager(), iActivityHandler.getInternalState()));
                }
            }
            if (z10) {
                defaultInstance.saveRawReferrerArray(rawReferrerArray);
            }
        } catch (JSONException e10) {
            sdkClickHandler.logger.error("Send saved raw referrers error (%s)", e10.getMessage());
        }
    }
}
