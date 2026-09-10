package com.facebook;

import com.facebook.internal.Utility;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/AccessToken$Companion$createFromNativeLinkingIntent$1", "Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AccessToken$Companion$createFromNativeLinkingIntent$1 implements Utility.GraphMeRequestWithCacheCallback {
    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
    public final void a(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("id");
            } catch (Exception unused) {
                new FacebookException("Unable to generate access token due to missing user id");
                throw null;
            }
        } else {
            string = null;
        }
        if (string != null) {
            throw null;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
    public final void b(FacebookException facebookException) {
        throw null;
    }
}
