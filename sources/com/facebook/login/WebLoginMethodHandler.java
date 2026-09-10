package com.facebook.login;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.UserSettingsManager;
import com.facebook.internal.Utility;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
abstract class WebLoginMethodHandler extends LoginMethodHandler {
    public String Z;

    public final Bundle s(LoginClient.Request request) {
        Bundle bundle = new Bundle();
        if (!Utility.D(request.f16476Y)) {
            String strJoin = TextUtils.join(",", request.f16476Y);
            bundle.putString("scope", strJoin);
            a("scope", strJoin);
        }
        bundle.putString("default_audience", request.Z.X);
        bundle.putString("state", g(request.f0));
        Date date = AccessToken.m0;
        AccessToken accessTokenB = AccessToken.Companion.b();
        String str = accessTokenB != null ? accessTokenB.f0 : null;
        if (str == null || !str.equals(this.f16503Y.Z.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
            Utility.d(this.f16503Y.Z.getActivity());
            a("access_token", "0");
        } else {
            bundle.putString("access_token", str);
            a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        HashSet hashSet = FacebookSdk.f15915a;
        bundle.putString("ies", UserSettingsManager.c() ? "1" : "0");
        return bundle;
    }

    public abstract AccessTokenSource t();

    public final void u(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        String string;
        LoginClient.Result resultB;
        this.Z = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.Z = bundle.getString("e2e");
            }
            try {
                AccessToken accessTokenE = LoginMethodHandler.e(request.f16476Y, bundle, t(), request.e0);
                AuthenticationToken authenticationTokenF = LoginMethodHandler.f(bundle, request.p0);
                LoginClient loginClient = this.f16503Y;
                resultB = new LoginClient.Result(loginClient.h0, LoginClient.Result.Code.SUCCESS, accessTokenE, authenticationTokenF, null, null);
                CookieSyncManager.createInstance(loginClient.Z.getActivity()).sync();
                this.f16503Y.Z.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", accessTokenE.f0).apply();
            } catch (FacebookException e2) {
                resultB = LoginClient.Result.b(this.f16503Y.h0, null, e2.getMessage(), null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            resultB = LoginClient.Result.a(this.f16503Y.h0, "User canceled log in.");
        } else {
            this.Z = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                Locale locale = Locale.ROOT;
                FacebookRequestError facebookRequestError = ((FacebookServiceException) facebookException).X;
                int i2 = facebookRequestError.e0;
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                string = sb.toString();
                message = facebookRequestError.toString();
            } else {
                string = null;
            }
            resultB = LoginClient.Result.b(this.f16503Y.h0, null, message, string);
        }
        if (!Utility.C(this.Z)) {
            m(this.Z);
        }
        this.f16503Y.e(resultB);
    }
}
