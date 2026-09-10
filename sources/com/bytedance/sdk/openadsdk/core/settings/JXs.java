package com.bytedance.sdk.openadsdk.core.settings;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface JXs {
    public static final LD<JSONObject> Lxb = new LD<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.JXs.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.LD
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public JSONObject LD(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("ISettingsDataRepository", "", e);
                return null;
            }
        }
    };
    public static final LD<Set<String>> LD = new LD<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.JXs.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.LD
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public Set<String> LD(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("ISettingsDataRepository", "", e);
            }
            return hashSet;
        }
    };

    public interface LD<T> {
        T LD(String str);
    }

    public interface Lxb {
        Lxb Lxb(String str);

        Lxb Lxb(String str, float f);

        Lxb Lxb(String str, int i);

        Lxb Lxb(String str, long j);

        Lxb Lxb(String str, String str2);

        Lxb Lxb(String str, boolean z);

        void Lxb();
    }

    void Lxb(JSONObject jSONObject);
}
