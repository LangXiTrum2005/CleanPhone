package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface tD<T> {

    public interface LD {
        void Lxb(int i, String str);

        void Lxb(DY.LD ld);
    }

    public interface Lxb {
        void Lxb(int i, String str);

        void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb, com.bytedance.sdk.openadsdk.core.model.LD ld);
    }

    com.bytedance.sdk.openadsdk.ZU.JXs LD(JSONObject jSONObject);

    com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb Lxb();

    com.bytedance.sdk.openadsdk.ZU.JXs Lxb(JSONObject jSONObject, String str, boolean z);

    JSONObject Lxb(JSONObject jSONObject);

    void Lxb(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Sfi sfi, int i, Lxb lxb);

    void Lxb(String str);

    void Lxb(String str, List<FilterWord> list, String str2, String str3, String str4);

    void Lxb(JSONObject jSONObject, LD ld);

    void Lxb(JSONObject jSONObject, String str);
}
