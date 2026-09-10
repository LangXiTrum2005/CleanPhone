package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;

/* JADX INFO: loaded from: classes3.dex */
abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    @Override // com.facebook.login.LoginMethodHandler
    public final boolean n(int i2, int i3, Intent intent) {
        String string;
        LoginClient.Request request = this.f16503Y.h0;
        if (intent == null) {
            s(LoginClient.Result.a(request, "Operation canceled"));
            return true;
        }
        if (i3 == 0) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                string = null;
            } else {
                string = extras.getString("error");
                if (string == null) {
                    string = extras.getString("error_type");
                }
            }
            String string2 = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
            if (ServerProtocol.f16372c.equals(string2)) {
                String string3 = extras.getString("error_message");
                if (string3 == null) {
                    string3 = extras.getString("error_description");
                }
                s(LoginClient.Result.b(request, string, string3, string2));
            }
            s(LoginClient.Result.a(request, string));
            return true;
        }
        if (i3 != -1) {
            s(LoginClient.Result.b(request, "Unexpected resultCode from authorization.", null, null));
            return true;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 == null) {
            s(LoginClient.Result.b(request, "Unexpected null from returned authorization data.", null, null));
            return true;
        }
        String string4 = extras2.getString("error");
        if (string4 == null) {
            string4 = extras2.getString("error_type");
        }
        String string5 = extras2.get("error_code") != null ? extras2.get("error_code").toString() : null;
        String string6 = extras2.getString("error_message");
        if (string6 == null) {
            string6 = extras2.getString("error_description");
        }
        String string7 = extras2.getString("e2e");
        if (!Utility.C(string7)) {
            m(string7);
        }
        if (string4 == null && string5 == null && string6 == null) {
            try {
                s(new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, LoginMethodHandler.e(request.f16476Y, extras2, t(), request.e0), LoginMethodHandler.f(extras2, request.p0), null, null));
            } catch (FacebookException e2) {
                s(LoginClient.Result.b(request, null, e2.getMessage(), null));
            }
            return true;
        }
        if (string4 != null && string4.equals("logged_out")) {
            CustomTabLoginMethodHandler.h0 = true;
            s(null);
            return true;
        }
        if (ServerProtocol.f16370a.contains(string4)) {
            s(null);
            return true;
        }
        if (ServerProtocol.f16371b.contains(string4)) {
            s(LoginClient.Result.a(request, null));
            return true;
        }
        s(LoginClient.Result.b(request, string4, string6, string5));
        return true;
    }

    public final void s(LoginClient.Result result) {
        if (result != null) {
            this.f16503Y.e(result);
        } else {
            this.f16503Y.m();
        }
    }

    public AccessTokenSource t() {
        return AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    public final boolean u(int i2, Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            this.f16503Y.Z.startActivityForResult(intent, i2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
