package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.WebDialog;
import com.p004ironsource.mediationsdk.metadata.a;

/* JADX INFO: loaded from: classes3.dex */
class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new AnonymousClass2();
    public WebDialog e0;
    public String f0;

    /* JADX INFO: renamed from: com.facebook.login.WebViewLoginMethodHandler$2, reason: invalid class name */
    public static class AnonymousClass2 implements Parcelable.Creator<WebViewLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public final WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            WebViewLoginMethodHandler webViewLoginMethodHandler = new WebViewLoginMethodHandler(parcel);
            webViewLoginMethodHandler.f0 = parcel.readString();
            return webViewLoginMethodHandler;
        }

        @Override // android.os.Parcelable.Creator
        public final WebViewLoginMethodHandler[] newArray(int i2) {
            return new WebViewLoginMethodHandler[i2];
        }
    }

    public static class AuthDialogBuilder extends WebDialog.Builder {
        public String g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f16507h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f16508i;
        public LoginBehavior j;
        public LoginTargetApp k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f16509l;
        public boolean m;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void b() {
        WebDialog webDialog = this.e0;
        if (webDialog != null) {
            webDialog.cancel();
            this.e0 = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String j() {
        return "web_view";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int r(final LoginClient.Request request) {
        Bundle bundleS = s(request);
        WebDialog.OnCompleteListener onCompleteListener = new WebDialog.OnCompleteListener() { // from class: com.facebook.login.WebViewLoginMethodHandler.1
            @Override // com.facebook.internal.WebDialog.OnCompleteListener
            public final void a(Bundle bundle, FacebookException facebookException) {
                WebViewLoginMethodHandler.this.u(request, bundle, facebookException);
            }
        };
        String strG = LoginClient.g();
        this.f0 = strG;
        a("e2e", strG);
        FragmentActivity activity = this.f16503Y.Z.getActivity();
        boolean zA = Utility.A(activity);
        AuthDialogBuilder authDialogBuilder = new AuthDialogBuilder();
        String strC = request.e0;
        if (strC == null) {
            Validate.f(activity, "context");
            strC = FacebookSdk.c();
        }
        Validate.g(strC, "applicationId");
        authDialogBuilder.f16389b = strC;
        authDialogBuilder.f16388a = activity;
        authDialogBuilder.f16390c = "oauth";
        authDialogBuilder.f16391e = bundleS;
        authDialogBuilder.f16508i = "fbconnect://success";
        authDialogBuilder.j = LoginBehavior.NATIVE_WITH_FALLBACK;
        authDialogBuilder.k = LoginTargetApp.FACEBOOK;
        authDialogBuilder.f16509l = false;
        authDialogBuilder.m = false;
        authDialogBuilder.g = this.f0;
        authDialogBuilder.f16508i = zA ? "fbconnect://chrome_os_success" : "fbconnect://success";
        authDialogBuilder.f16507h = request.i0;
        authDialogBuilder.j = request.X;
        authDialogBuilder.k = request.m0;
        authDialogBuilder.f16509l = request.n0;
        authDialogBuilder.m = request.o0;
        authDialogBuilder.d = onCompleteListener;
        Bundle bundle = authDialogBuilder.f16391e;
        bundle.putString("redirect_uri", authDialogBuilder.f16508i);
        bundle.putString("client_id", authDialogBuilder.f16389b);
        bundle.putString("e2e", authDialogBuilder.g);
        bundle.putString("response_type", authDialogBuilder.k == LoginTargetApp.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
        bundle.putString("return_scopes", a.g);
        bundle.putString("auth_type", authDialogBuilder.f16507h);
        bundle.putString("login_behavior", authDialogBuilder.j.name());
        if (authDialogBuilder.f16509l) {
            bundle.putString("fx_app", authDialogBuilder.k.X);
        }
        if (authDialogBuilder.m) {
            bundle.putString("skip_dedupe", a.g);
        }
        FragmentActivity fragmentActivity = authDialogBuilder.f16388a;
        LoginTargetApp loginTargetApp = authDialogBuilder.k;
        WebDialog.OnCompleteListener onCompleteListener2 = authDialogBuilder.d;
        WebDialog.b(fragmentActivity);
        this.e0 = new WebDialog(fragmentActivity, "oauth", bundle, loginTargetApp, onCompleteListener2);
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.X = this.e0;
        facebookDialogFragment.show(activity.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public final AccessTokenSource t() {
        return AccessTokenSource.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f0);
    }
}
