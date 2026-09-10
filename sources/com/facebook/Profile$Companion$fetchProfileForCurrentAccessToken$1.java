package com.facebook;

import android.net.Uri;
import android.util.Log;
import com.facebook.internal.Utility;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/Profile$Companion$fetchProfileForCurrentAccessToken$1", "Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class Profile$Companion$fetchProfileForCurrentAccessToken$1 implements Utility.GraphMeRequestWithCacheCallback {
    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
    public final void a(JSONObject jSONObject) {
        String strOptString = jSONObject != null ? jSONObject.optString("id") : null;
        if (strOptString == null) {
            Log.w("Profile", "No user ID returned on Me request");
            return;
        }
        String strOptString2 = jSONObject.optString("link");
        String strOptString3 = jSONObject.optString("profile_picture", null);
        ProfileManager.f15957e.a().a(new Profile(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null), true);
    }

    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
    public final void b(FacebookException facebookException) {
        Log.e("Profile", "Got unexpected exception: " + facebookException);
    }
}
