package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.Utility;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new AnonymousClass3();
    public GetTokenClient Z;

    /* JADX INFO: renamed from: com.facebook.login.GetTokenLoginMethodHandler$3, reason: invalid class name */
    public static class AnonymousClass3 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i2) {
            return new GetTokenLoginMethodHandler[i2];
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void b() {
        GetTokenClient getTokenClient = this.Z;
        if (getTokenClient != null) {
            getTokenClient.e0 = false;
            getTokenClient.Z = null;
            this.Z = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String j() {
        return "get_token";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int r(final LoginClient.Request request) {
        GetTokenClient getTokenClient = new GetTokenClient(this.f16503Y.Z.getActivity(), 65536, 65537, 20121101, request.e0, request.p0);
        this.Z = getTokenClient;
        if (!getTokenClient.c()) {
            return 0;
        }
        LoginFragment.AnonymousClass2 anonymousClass2 = this.f16503Y.f0;
        if (anonymousClass2 != null) {
            anonymousClass2.f16483a.setVisibility(0);
        }
        this.Z.Z = new PlatformServiceClient.CompletedListener() { // from class: com.facebook.login.GetTokenLoginMethodHandler.1
            @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
            public final void a(final Bundle bundle) {
                final GetTokenLoginMethodHandler getTokenLoginMethodHandler = GetTokenLoginMethodHandler.this;
                GetTokenClient getTokenClient2 = getTokenLoginMethodHandler.Z;
                if (getTokenClient2 != null) {
                    getTokenClient2.Z = null;
                }
                getTokenLoginMethodHandler.Z = null;
                LoginFragment.AnonymousClass2 anonymousClass3 = getTokenLoginMethodHandler.f16503Y.f0;
                if (anonymousClass3 != null) {
                    anonymousClass3.f16483a.setVisibility(8);
                }
                if (bundle != null) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    final LoginClient.Request request2 = request;
                    Set<String> set = request2.f16476Y;
                    String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (set.contains(Scopes.OPEN_ID) && (string == null || string.isEmpty())) {
                        getTokenLoginMethodHandler.f16503Y.m();
                        return;
                    }
                    if (stringArrayList != null && stringArrayList.containsAll(set)) {
                        String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 != null && !string2.isEmpty()) {
                            getTokenLoginMethodHandler.s(request2, bundle);
                            return;
                        }
                        LoginFragment.AnonymousClass2 anonymousClass4 = getTokenLoginMethodHandler.f16503Y.f0;
                        if (anonymousClass4 != null) {
                            anonymousClass4.f16483a.setVisibility(0);
                        }
                        Utility.q(new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.login.GetTokenLoginMethodHandler.2
                            @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                            public final void a(JSONObject jSONObject) {
                                GetTokenLoginMethodHandler getTokenLoginMethodHandler2 = GetTokenLoginMethodHandler.this;
                                Bundle bundle2 = bundle;
                                try {
                                    bundle2.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                                    getTokenLoginMethodHandler2.s(request2, bundle2);
                                } catch (JSONException e2) {
                                    LoginClient loginClient = getTokenLoginMethodHandler2.f16503Y;
                                    loginClient.c(LoginClient.Result.b(loginClient.h0, "Caught exception", e2.getMessage(), null));
                                }
                            }

                            @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                            public final void b(FacebookException facebookException) {
                                LoginClient loginClient = GetTokenLoginMethodHandler.this.f16503Y;
                                loginClient.c(LoginClient.Result.b(loginClient.h0, "Caught exception", facebookException.getMessage(), null));
                            }
                        }, bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"));
                        return;
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        getTokenLoginMethodHandler.a("new_permissions", TextUtils.join(",", hashSet));
                    }
                    request2.f16476Y = hashSet;
                }
                getTokenLoginMethodHandler.f16503Y.m();
            }
        };
        return 1;
    }

    public final void s(LoginClient.Request request, Bundle bundle) {
        LoginClient.Result resultB;
        AuthenticationToken authenticationToken;
        try {
            AccessToken accessTokenC = LoginMethodHandler.c(bundle, request.e0);
            String str = request.p0;
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (Utility.C(string)) {
                authenticationToken = null;
            } else {
                try {
                    authenticationToken = new AuthenticationToken(string, str);
                } catch (Exception e2) {
                    throw new FacebookException(e2.getMessage());
                }
            }
            resultB = new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, accessTokenC, authenticationToken, null, null);
        } catch (FacebookException e3) {
            resultB = LoginClient.Result.b(this.f16503Y.h0, null, e3.getMessage(), null);
        }
        this.f16503Y.e(resultB);
    }
}
