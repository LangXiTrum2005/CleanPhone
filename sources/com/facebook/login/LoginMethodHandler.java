package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.media3.extractor.text.ttml.a;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Utility;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
abstract class LoginMethodHandler implements Parcelable {
    public HashMap X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LoginClient f16503Y;

    public LoginMethodHandler(LoginClient loginClient) {
        this.f16503Y = loginClient;
    }

    public static AccessToken c(Bundle bundle, String str) {
        AccessTokenSource accessTokenSource = AccessTokenSource.FACEBOOK_APPLICATION_SERVICE;
        Date dateO = Utility.o(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date dateO2 = Utility.o(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (Utility.C(string)) {
            return null;
        }
        return new AccessToken(string, str, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, accessTokenSource, dateO, new Date(), dateO2, bundle.getString("graph_domain"));
    }

    public static AccessToken e(Collection collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        Date dateO = Utility.o(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date dateO2 = Utility.o(bundle, "data_access_expiration_time", new Date(0L));
        String string2 = bundle.getString("granted_scopes");
        if (!Utility.C(string2)) {
            collection = new ArrayList(Arrays.asList(string2.split(",")));
        }
        Collection collection2 = collection;
        String string3 = bundle.getString("denied_scopes");
        ArrayList arrayList = !Utility.C(string3) ? new ArrayList(Arrays.asList(string3.split(","))) : null;
        String string4 = bundle.getString("expired_scopes");
        ArrayList arrayList2 = !Utility.C(string4) ? new ArrayList(Arrays.asList(string4.split(","))) : null;
        if (Utility.C(string)) {
            return null;
        }
        return new AccessToken(string, str, k(bundle.getString("signed_request")), collection2, arrayList, arrayList2, accessTokenSource, dateO, new Date(), dateO2, bundle.getString("graph_domain"));
    }

    public static AuthenticationToken f(Bundle bundle, String str) {
        String string = bundle.getString("id_token");
        if (Utility.C(string) || Utility.C(str)) {
            return null;
        }
        try {
            return new AuthenticationToken(string, str);
        } catch (Exception e2) {
            throw new FacebookException(e2.getMessage(), e2);
        }
    }

    public static String k(String str) {
        if (str == null || str.isEmpty()) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 2) {
                return new JSONObject(new String(Base64.decode(strArrSplit[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    public final void a(String str, String str2) {
        if (this.X == null) {
            this.X = new HashMap();
        }
        this.X.put(str, str2 == null ? null : str2.toString());
    }

    public void b() {
    }

    public final String g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", j());
            p(jSONObject);
        } catch (JSONException e2) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e2.getMessage());
        }
        return jSONObject.toString();
    }

    public abstract String j();

    public final void m(String str) {
        LoginClient loginClient = this.f16503Y;
        String str2 = loginClient.h0.e0;
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(loginClient.Z.getActivity(), str2);
        Bundle bundleD = a.d("fb_web_login_e2e", str);
        bundleD.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundleD.putString("app_id", str2);
        internalAppEventsLogger.c(bundleD, "fb_dialogs_web_login_dialog_complete");
    }

    public boolean n(int i2, int i3, Intent intent) {
        return false;
    }

    public void p(JSONObject jSONObject) {
    }

    public boolean q() {
        return this instanceof KatanaProxyLoginMethodHandler;
    }

    public abstract int r(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Utility.T(parcel, this.X);
    }

    public LoginMethodHandler(Parcel parcel) {
        this.X = Utility.Q(parcel);
    }
}
