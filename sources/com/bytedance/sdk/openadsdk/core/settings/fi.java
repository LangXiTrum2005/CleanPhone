package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.ac;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface fi {
    public static final lr<JSONObject> ri = new lr<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.fi.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.fi.lr
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public JSONObject lr(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                ac.ri("ISettingsDataRepository", "", e);
                return null;
            }
        }
    };
    public static final lr<Set<String>> lr = new lr<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.fi.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.fi.lr
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public Set<String> lr(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                return hashSet;
            } catch (Exception e) {
                ac.ri("ISettingsDataRepository", "", e);
                return hashSet;
            }
        }
    };

    public interface lr<T> {
        T lr(String str);
    }

    public interface ri {
        ri ri(String str);

        ri ri(String str, float f);

        ri ri(String str, int i);

        ri ri(String str, long j);

        ri ri(String str, String str2);

        ri ri(String str, boolean z);

        void ri();
    }

    void ri(JSONObject jSONObject);
}
