package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    public boolean JXs;
    public boolean ZU;
    public boolean lc;
    public String lk;
    public static final ebl Lxb = new ebl(null);
    public static String LD = "";

    public ebl(String str) {
        this.lk = "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js";
        this.ZU = true;
        this.JXs = true;
        this.lc = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.lk = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            this.ZU = arrayList.contains("load_finish");
            this.lc = arrayList.contains("load_fail");
            this.JXs = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
