package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface oth<T> {

    public interface qdl {
        void qdl(int i2, String str);

        void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar);
    }

    public interface ud {
        void qdl(int i2, String str);

        void qdl(ljh.ud udVar);
    }

    com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdl();

    com.bytedance.sdk.openadsdk.mml.mzz qdl(JSONObject jSONObject, String str, boolean z2);

    JSONObject qdl(JSONObject jSONObject);

    void qdl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar, int i2, aaj aajVar);

    void qdl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar, int i2, qdl qdlVar);

    void qdl(String str);

    void qdl(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    void qdl(JSONObject jSONObject, ud udVar);

    void qdl(JSONObject jSONObject, String str);

    com.bytedance.sdk.openadsdk.mml.mzz ud(JSONObject jSONObject);
}
