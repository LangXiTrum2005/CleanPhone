package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    private List<String> lr;
    private String ri;

    public qt(String str) {
        this.ri = "";
        this.lr = new ArrayList();
        HashMap<String, Object> map = TextUtils.isEmpty(str) ? new HashMap<>() : ri(str);
        try {
            this.ri = (String) map.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) map.get("auto_test_hosts"));
            this.lr = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.lr.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ik("AutoTestModel", e.getMessage());
        }
    }

    public List<String> lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    private static final HashMap<String, Object> ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                map.put(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("value"));
            }
            return map;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
