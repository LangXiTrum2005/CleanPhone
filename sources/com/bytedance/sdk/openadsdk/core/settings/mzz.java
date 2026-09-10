package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.aaj;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface mzz {
    public static final ud<JSONObject> qdl = new ud<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.mzz.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.ud
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public JSONObject ud(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e2) {
                aaj.qdl("ISettingsDataRepository", "", e2);
                return null;
            }
        }
    };
    public static final ud<Set<String>> ud = new ud<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.mzz.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.ud
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public Set<String> ud(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    hashSet.add(jSONArray.getString(i2));
                }
            } catch (Exception e2) {
                aaj.qdl("ISettingsDataRepository", "", e2);
            }
            return hashSet;
        }
    };

    public interface qdl {
        qdl qdl(String str);

        qdl qdl(String str, float f);

        qdl qdl(String str, int i2);

        qdl qdl(String str, long j);

        qdl qdl(String str, String str2);

        qdl qdl(String str, boolean z2);

        void qdl();
    }

    public interface ud<T> {
        T ud(String str);
    }

    void qdl(JSONObject jSONObject);
}
