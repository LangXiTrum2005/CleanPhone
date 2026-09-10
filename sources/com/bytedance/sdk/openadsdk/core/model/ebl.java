package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    private List<String> LD;
    private String Lxb;

    public ebl(String str) {
        this.Lxb = "";
        this.LD = new ArrayList();
        HashMap<String, Object> map = TextUtils.isEmpty(str) ? new HashMap<>() : Lxb(str);
        try {
            this.Lxb = (String) map.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) map.get("auto_test_hosts"));
            this.LD = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.LD.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("AutoTestModel", e.getMessage());
        }
    }

    public List<String> LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    private static final HashMap<String, Object> Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                map.put(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            }
            return map;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
