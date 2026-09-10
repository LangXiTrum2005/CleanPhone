package com.facebook.gamingservices.cloudgaming;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DaemonReceiver {

    public static class DaemonBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            try {
                new JSONObject(intent.getStringExtra("returnPayload")).getString("requestID");
                throw null;
            } catch (JSONException unused) {
            }
        }
    }

    public static GraphResponse a(String str, JSONObject jSONObject) {
        if (jSONObject.isNull("success")) {
            if (jSONObject.isNull("error")) {
                return b(new FacebookRequestError(20, "UNSUPPORTED_FORMAT", "The response format is invalid."), str);
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("error");
            return jSONObjectOptJSONObject != null ? b(new FacebookRequestError(jSONObjectOptJSONObject.optInt("code"), jSONObjectOptJSONObject.optString("type"), jSONObjectOptJSONObject.optString(PglCryptUtils.KEY_MESSAGE)), str) : b(new FacebookRequestError(20, "UNSUPPORTED_FORMAT", "The response format is invalid."), str);
        }
        if (jSONObject.optJSONObject("success") != null) {
            throw null;
        }
        if (jSONObject.optJSONArray("success") == null) {
            return b(new FacebookRequestError(20, "UNSUPPORTED_FORMAT", "The response format is invalid."), str);
        }
        throw null;
    }

    public static GraphResponse b(FacebookRequestError facebookRequestError, String str) {
        throw null;
    }
}
