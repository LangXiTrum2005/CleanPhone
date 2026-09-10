package com.facebook.gamingservices.cloudgaming;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
class MediaUploadCallback implements GraphRequest.Callback {
    @Override // com.facebook.GraphRequest.Callback
    public final void a(GraphResponse graphResponse) {
        FacebookRequestError facebookRequestError = graphResponse.d;
        if (facebookRequestError != null) {
            throw new FacebookException(facebookRequestError.a());
        }
        String strOptString = graphResponse.f15952c.optString("id");
        Date date = AccessToken.m0;
        AccessToken accessTokenB = AccessToken.Companion.b();
        Bundle bundle = new Bundle();
        bundle.putString("title", null);
        bundle.putString("body", null);
        bundle.putInt("time_interval", 0);
        bundle.putString("media_id", strOptString);
        new GraphRequest(accessTokenB, "me/schedule_gaming_app_to_user_update", bundle, HttpMethod.f15953Y, null).d();
    }
}
