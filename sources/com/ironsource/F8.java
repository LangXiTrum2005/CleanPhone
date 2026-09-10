package com.ironsource;

import android.app.Activity;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface F8 {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(String str);

        void onNativeAdLoadSuccess(D8 d10);

        void onNativeAdShown();
    }

    void a();

    void a(Activity activity, JSONObject jSONObject);

    void a(a aVar);

    void a(G8 g10);

    a b();

    D8 c();
}
