package com.ironsource;

import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface H8 {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(String str);

        void b(String str);
    }

    void a(String str, String str2);

    void a(String str, String str2, String str3);

    void a(JSONObject jSONObject, String str, String str2);

    void b(JSONObject jSONObject, String str, String str2);

    void c(JSONObject jSONObject, String str, String str2) throws JSONException;

    WebView getPresentingView();
}
