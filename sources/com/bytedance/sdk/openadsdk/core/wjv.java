package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface wjv<T> {

    public interface lr {
        void ri(int i, String str);

        void ri(ay.lr lrVar);
    }

    public interface ri {
        void ri(int i, String str);

        void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar);
    }

    com.bytedance.sdk.openadsdk.ka.fi lr(JSONObject jSONObject);

    com.bytedance.sdk.component.adexpress.ri.ik.ri ri();

    com.bytedance.sdk.openadsdk.ka.fi ri(JSONObject jSONObject, String str, List<String> list);

    JSONObject ri(JSONObject jSONObject);

    void ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar, int i, ihz ihzVar);

    void ri(String str);

    void ri(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    void ri(JSONObject jSONObject, lr lrVar);

    void ri(JSONObject jSONObject, String str);
}
