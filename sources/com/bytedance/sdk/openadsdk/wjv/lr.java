package com.bytedance.sdk.openadsdk.wjv;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface lr {
    public static final ri<JSONObject> ri = new ri<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.wjv.lr.1
        @Override // com.bytedance.sdk.openadsdk.wjv.lr.ri
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public JSONObject lr(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception unused) {
                return null;
            }
        }
    };

    public interface ri<T> {
        T lr(String str);
    }
}
