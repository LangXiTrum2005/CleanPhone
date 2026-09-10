package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class RolloutsStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConfigCacheClient f20997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConfigCacheClient f20998b;

    public final RolloutsState a(ConfigContainer configContainer) throws FirebaseRemoteConfigClientException {
        String string;
        JSONArray jSONArray = configContainer.g;
        long j = configContainer.f;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                ConfigContainer configContainerC = this.f20997a.c();
                String string3 = null;
                if (configContainerC == null) {
                    string = null;
                } else {
                    try {
                        string = configContainerC.f20941b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    ConfigContainer configContainerC2 = this.f20998b.c();
                    if (configContainerC2 != null) {
                        try {
                            string3 = configContainerC2.f20941b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                RolloutAssignment.Builder builderA = RolloutAssignment.a();
                builderA.d(string2);
                builderA.f(jSONObject.getString("variantId"));
                builderA.b(strOptString);
                builderA.c(string);
                builderA.e(j);
                hashSet.add(builderA.a());
            } catch (JSONException e2) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e2);
            }
        }
        return RolloutsState.a(hashSet);
    }
}
