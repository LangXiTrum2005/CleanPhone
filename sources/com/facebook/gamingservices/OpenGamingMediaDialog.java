package com.facebook.gamingservices;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.media.a;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class OpenGamingMediaDialog implements GraphRequest.OnProgressCallback {
    @Override // com.facebook.GraphRequest.Callback
    public final void a(GraphResponse graphResponse) {
        if (graphResponse.d != null) {
            return;
        }
        JSONObject jSONObject = graphResponse.f15952c;
        String strOptString = jSONObject.optString("id", null);
        String strOptString2 = jSONObject.optString("video_id", null);
        if (strOptString == null && strOptString2 == null) {
            return;
        }
        if (strOptString == null) {
            strOptString = strOptString2;
        }
        new Intent("android.intent.action.VIEW", Uri.parse(a.C("https://fb.gg/me/media_asset/", strOptString)));
        throw null;
    }
}
