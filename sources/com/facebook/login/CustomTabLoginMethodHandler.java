package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.CustomTab;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.Utility;
import com.google.android.gms.common.Scopes;
import com.p004ironsource.mediationsdk.metadata.a;
import com.smartdigimkt.x.n;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new AnonymousClass1();
    public static boolean h0 = false;
    public String e0;
    public String f0;
    public String g0;

    /* JADX INFO: renamed from: com.facebook.login.CustomTabLoginMethodHandler$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            CustomTabLoginMethodHandler customTabLoginMethodHandler = new CustomTabLoginMethodHandler(parcel);
            customTabLoginMethodHandler.g0 = "";
            customTabLoginMethodHandler.f0 = parcel.readString();
            return customTabLoginMethodHandler;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i2) {
            return new CustomTabLoginMethodHandler[i2];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String j() {
        return "custom_tab";
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069 A[Catch: JSONException -> 0x007a, TRY_LEAVE, TryCatch #1 {JSONException -> 0x007a, blocks: (B:19:0x0060, B:22:0x0069), top: B:61:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX WARN: Instruction removed from duplicated block: B:16:0x002c, please report this as an issue */
    @Override // com.facebook.login.LoginMethodHandler
    public final boolean n(int i2, int i3, Intent intent) {
        LoginClient.Request request;
        String stringExtra;
        Bundle bundleL;
        String string;
        String string2;
        String string3;
        int i4;
        String string4;
        boolean zEquals = false;
        if (intent != null) {
            int i5 = CustomTabMainActivity.Z;
            if (!intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                if (i2 == 1) {
                    request = this.f16503Y.h0;
                    if (i3 == -1) {
                        u(request, null, new FacebookOperationCanceledException());
                        return false;
                    }
                    int i6 = CustomTabMainActivity.Z;
                    stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
                    if (stringExtra != null) {
                        if (stringExtra.startsWith("fbconnect://cct.")) {
                            Uri uri = Uri.parse(stringExtra);
                            bundleL = Utility.L(uri.getQuery());
                            bundleL.putAll(Utility.L(uri.getFragment()));
                            string4 = bundleL.getString("state");
                            if (string4 == null) {
                                zEquals = new JSONObject(string4).getString("7_challenge").equals(this.f0);
                            }
                            if (zEquals) {
                                string = bundleL.getString("error");
                                if (string == null) {
                                    string = bundleL.getString("error_type");
                                }
                                string2 = bundleL.getString("error_msg");
                                if (string2 == null) {
                                    string2 = bundleL.getString("error_message");
                                }
                                if (string2 == null) {
                                    string2 = bundleL.getString("error_description");
                                }
                                string3 = bundleL.getString("error_code");
                                if (Utility.C(string3)) {
                                    i4 = -1;
                                } else {
                                    i4 = Integer.parseInt(string3);
                                }
                                if (!Utility.C(string)) {
                                    if (string == null) {
                                        u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                                    } else {
                                        u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                                    }
                                } else if (string == null) {
                                    u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                                } else {
                                    u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                                }
                            } else {
                                u(request, null, new FacebookException("Invalid state parameter"));
                            }
                        } else {
                            if (stringExtra.startsWith(n.f39791p + FacebookSdk.c() + "://authorize")) {
                                Uri uri2 = Uri.parse(stringExtra);
                                bundleL = Utility.L(uri2.getQuery());
                                bundleL.putAll(Utility.L(uri2.getFragment()));
                                try {
                                    string4 = bundleL.getString("state");
                                    if (string4 == null) {
                                        zEquals = new JSONObject(string4).getString("7_challenge").equals(this.f0);
                                    }
                                } catch (JSONException unused) {
                                }
                                if (zEquals) {
                                    u(request, null, new FacebookException("Invalid state parameter"));
                                } else {
                                    string = bundleL.getString("error");
                                    if (string == null) {
                                        string = bundleL.getString("error_type");
                                    }
                                    string2 = bundleL.getString("error_msg");
                                    if (string2 == null) {
                                        string2 = bundleL.getString("error_message");
                                    }
                                    if (string2 == null) {
                                        string2 = bundleL.getString("error_description");
                                    }
                                    string3 = bundleL.getString("error_code");
                                    if (Utility.C(string3)) {
                                        try {
                                            i4 = Integer.parseInt(string3);
                                        } catch (NumberFormatException unused2) {
                                            i4 = -1;
                                        }
                                    } else {
                                        i4 = -1;
                                    }
                                    if (!Utility.C(string) && Utility.C(string2) && i4 == -1) {
                                        u(request, bundleL, null);
                                    } else if ((string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) || i4 == 4201) {
                                        u(request, null, new FacebookOperationCanceledException());
                                    } else {
                                        u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        } else if (i2 == 1) {
            request = this.f16503Y.h0;
            if (i3 == -1) {
                u(request, null, new FacebookOperationCanceledException());
                return false;
            }
            int i7 = CustomTabMainActivity.Z;
            stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                if (stringExtra.startsWith("fbconnect://cct.")) {
                    if (stringExtra.startsWith(n.f39791p + FacebookSdk.c() + "://authorize")) {
                        Uri uri3 = Uri.parse(stringExtra);
                        bundleL = Utility.L(uri3.getQuery());
                        bundleL.putAll(Utility.L(uri3.getFragment()));
                        string4 = bundleL.getString("state");
                        if (string4 == null) {
                            zEquals = new JSONObject(string4).getString("7_challenge").equals(this.f0);
                        }
                        if (zEquals) {
                            u(request, null, new FacebookException("Invalid state parameter"));
                        } else {
                            string = bundleL.getString("error");
                            if (string == null) {
                                string = bundleL.getString("error_type");
                            }
                            string2 = bundleL.getString("error_msg");
                            if (string2 == null) {
                                string2 = bundleL.getString("error_message");
                            }
                            if (string2 == null) {
                                string2 = bundleL.getString("error_description");
                            }
                            string3 = bundleL.getString("error_code");
                            if (Utility.C(string3)) {
                                i4 = Integer.parseInt(string3);
                            } else {
                                i4 = -1;
                            }
                            if (!Utility.C(string)) {
                                if (string == null) {
                                    u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                                } else {
                                    u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                                }
                            } else if (string == null) {
                                u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                            } else {
                                u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                            }
                        }
                    }
                } else {
                    Uri uri4 = Uri.parse(stringExtra);
                    bundleL = Utility.L(uri4.getQuery());
                    bundleL.putAll(Utility.L(uri4.getFragment()));
                    string4 = bundleL.getString("state");
                    if (string4 == null) {
                        zEquals = new JSONObject(string4).getString("7_challenge").equals(this.f0);
                    }
                    if (zEquals) {
                        u(request, null, new FacebookException("Invalid state parameter"));
                    } else {
                        string = bundleL.getString("error");
                        if (string == null) {
                            string = bundleL.getString("error_type");
                        }
                        string2 = bundleL.getString("error_msg");
                        if (string2 == null) {
                            string2 = bundleL.getString("error_message");
                        }
                        if (string2 == null) {
                            string2 = bundleL.getString("error_description");
                        }
                        string3 = bundleL.getString("error_code");
                        if (Utility.C(string3)) {
                            i4 = Integer.parseInt(string3);
                        } else {
                            i4 = -1;
                        }
                        if (!Utility.C(string)) {
                            if (string == null) {
                                u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                            } else {
                                u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                            }
                        } else if (string == null) {
                            u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                        } else {
                            u(request, null, new FacebookServiceException(new FacebookRequestError(i4, string, string2), string2));
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void p(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f0);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final boolean q() {
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int r(LoginClient.Request request) {
        CustomTabsClient customTabsClient;
        CustomTabsClient customTabsClient2;
        if (this.g0.isEmpty()) {
            return 0;
        }
        Bundle bundleS = s(request);
        bundleS.putString("redirect_uri", this.g0);
        LoginTargetApp loginTargetApp = LoginTargetApp.INSTAGRAM;
        LoginTargetApp loginTargetApp2 = request.m0;
        boolean z2 = loginTargetApp2 == loginTargetApp;
        String str = request.e0;
        if (z2) {
            bundleS.putString("app_id", str);
        } else {
            bundleS.putString("client_id", str);
        }
        bundleS.putString("e2e", LoginClient.g());
        if (loginTargetApp2 == loginTargetApp) {
            bundleS.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else if (request.f16476Y.contains(Scopes.OPEN_ID)) {
            bundleS.putString("response_type", "id_token,token,signed_request,graph_domain");
            bundleS.putString("nonce", request.p0);
        } else {
            bundleS.putString("response_type", "token,signed_request,graph_domain");
        }
        bundleS.putString("return_scopes", a.g);
        bundleS.putString("auth_type", request.i0);
        bundleS.putString("login_behavior", request.X.name());
        Locale locale = Locale.ROOT;
        HashSet hashSet = FacebookSdk.f15915a;
        bundleS.putString("sdk", "android-12.1.0");
        bundleS.putString("sso", "chrome_custom_tab");
        bundleS.putString("cct_prefetching", FacebookSdk.m ? "1" : "0");
        if (request.n0) {
            bundleS.putString("fx_app", loginTargetApp2.X);
        }
        if (request.o0) {
            bundleS.putString("skip_dedupe", a.g);
        }
        String str2 = request.k0;
        if (str2 != null) {
            bundleS.putString("messenger_page_id", str2);
            bundleS.putString("reset_messenger_state", request.l0 ? "1" : "0");
        }
        if (h0) {
            bundleS.putString("cct_over_app_switch", "1");
        }
        if (FacebookSdk.m) {
            if (loginTargetApp2 == loginTargetApp) {
                Uri uriA = CustomTab.a(bundleS, "oauth");
                CustomTabsSession customTabsSession = CustomTabPrefetchHelper.f16459Y;
                if (customTabsSession == null && customTabsSession == null && (customTabsClient2 = CustomTabPrefetchHelper.X) != null) {
                    CustomTabPrefetchHelper.f16459Y = customTabsClient2.d(null);
                }
                CustomTabsSession customTabsSession2 = CustomTabPrefetchHelper.f16459Y;
                if (customTabsSession2 != null) {
                    customTabsSession2.c(uriA, null);
                }
            } else {
                Uri uriA2 = CustomTab.a(bundleS, "oauth");
                CustomTabsSession customTabsSession3 = CustomTabPrefetchHelper.f16459Y;
                if (customTabsSession3 == null && customTabsSession3 == null && (customTabsClient = CustomTabPrefetchHelper.X) != null) {
                    CustomTabPrefetchHelper.f16459Y = customTabsClient.d(null);
                }
                CustomTabsSession customTabsSession4 = CustomTabPrefetchHelper.f16459Y;
                if (customTabsSession4 != null) {
                    customTabsSession4.c(uriA2, null);
                }
            }
        }
        Intent intent = new Intent(this.f16503Y.Z.getActivity(), (Class<?>) CustomTabMainActivity.class);
        int i2 = CustomTabMainActivity.Z;
        intent.putExtra("CustomTabMainActivity.extra_action", "oauth");
        intent.putExtra("CustomTabMainActivity.extra_params", bundleS);
        String strA = this.e0;
        if (strA == null) {
            strA = CustomTabUtils.a();
            this.e0 = strA;
        }
        intent.putExtra("CustomTabMainActivity.extra_chromePackage", strA);
        intent.putExtra("CustomTabMainActivity.extra_targetApp", loginTargetApp2.X);
        this.f16503Y.Z.startActivityForResult(intent, 1);
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public final AccessTokenSource t() {
        return AccessTokenSource.CHROME_CUSTOM_TAB;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f0);
    }
}
