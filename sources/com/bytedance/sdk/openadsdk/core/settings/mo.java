package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mo {
    public static final mo qdl = new mo(null);
    public static String ud = "";
    public String lnr;
    public boolean mml;
    public boolean mo;
    public boolean mzz;

    public mo(String str) {
        this.lnr = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.mml = true;
        this.mzz = true;
        this.mo = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.lnr = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i2));
            }
            this.mml = arrayList.contains("load_finish");
            this.mo = arrayList.contains("load_fail");
            this.mzz = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
