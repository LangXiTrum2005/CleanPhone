package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.p004ironsource.d9;
import com.smartdigimkt.o1.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new AnonymousClass1();
    public LoginMethodHandler[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f16475Y;
    public LoginFragment Z;
    public OnCompletedListener e0;
    public LoginFragment.AnonymousClass2 f0;
    public boolean g0;
    public Request h0;
    public HashMap i0;
    public HashMap j0;
    public LoginLogger k0;
    public int l0;
    public int m0;

    /* JADX INFO: renamed from: com.facebook.login.LoginClient$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<LoginClient> {
        @Override // android.os.Parcelable.Creator
        public final LoginClient createFromParcel(Parcel parcel) {
            LoginClient loginClient = new LoginClient();
            loginClient.f16475Y = -1;
            loginClient.l0 = 0;
            loginClient.m0 = 0;
            Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
            loginClient.X = new LoginMethodHandler[parcelableArray.length];
            for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                LoginMethodHandler[] loginMethodHandlerArr = loginClient.X;
                LoginMethodHandler loginMethodHandler = (LoginMethodHandler) parcelableArray[i2];
                loginMethodHandlerArr[i2] = loginMethodHandler;
                if (loginMethodHandler.f16503Y != null) {
                    throw new FacebookException("Can't set LoginClient if it is already set.");
                }
                loginMethodHandler.f16503Y = loginClient;
            }
            loginClient.f16475Y = parcel.readInt();
            loginClient.h0 = (Request) parcel.readParcelable(Request.class.getClassLoader());
            loginClient.i0 = Utility.Q(parcel);
            loginClient.j0 = Utility.Q(parcel);
            return loginClient;
        }

        @Override // android.os.Parcelable.Creator
        public final LoginClient[] newArray(int i2) {
            return new LoginClient[i2];
        }
    }

    public interface BackgroundProcessingListener {
    }

    public interface OnCompletedListener {
    }

    public static String g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(d9.a.f, System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final void a(String str, String str2, boolean z2) {
        if (this.i0 == null) {
            this.i0 = new HashMap();
        }
        if (this.i0.containsKey(str) && z2) {
            str2 = a.s(new StringBuilder(), (String) this.i0.get(str), ",", str2);
        }
        this.i0.put(str, str2);
    }

    public final boolean b() {
        if (this.g0) {
            return true;
        }
        if (this.Z.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            this.g0 = true;
            return true;
        }
        FragmentActivity activity = this.Z.getActivity();
        c(Result.b(this.h0, activity.getString(com.charging.screenshow.battery.animations.themes.R.string.com_facebook_internet_permission_error_title), activity.getString(com.charging.screenshow.battery.animations.themes.R.string.com_facebook_internet_permission_error_message), null));
        return false;
    }

    public final void c(Result result) {
        LoginClient loginClient;
        LoginMethodHandler loginMethodHandlerF = f();
        if (loginMethodHandlerF != null) {
            loginClient = this;
            loginClient.k(loginMethodHandlerF.j(), result.X.X, result.e0, result.f0, loginMethodHandlerF.X);
        } else {
            loginClient = this;
        }
        HashMap map = loginClient.i0;
        if (map != null) {
            result.h0 = map;
        }
        HashMap map2 = loginClient.j0;
        if (map2 != null) {
            result.i0 = map2;
        }
        loginClient.X = null;
        loginClient.f16475Y = -1;
        loginClient.h0 = null;
        loginClient.i0 = null;
        loginClient.l0 = 0;
        loginClient.m0 = 0;
        OnCompletedListener onCompletedListener = loginClient.e0;
        if (onCompletedListener != null) {
            LoginFragment loginFragment = LoginFragment.this;
            loginFragment.Z = null;
            int i2 = result.X == Result.Code.CANCEL ? 0 : -1;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", result);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            if (loginFragment.isAdded()) {
                loginFragment.getActivity().setResult(i2, intent);
                loginFragment.getActivity().finish();
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x0017, B:12:0x0021, B:16:0x003a, B:15:0x0032), top: B:24:0x0017 }] */
    public final void e(Result result) {
        Result result2;
        if (result.f16477Y != null) {
            Date date = AccessToken.m0;
            if (AccessToken.Companion.c()) {
                AccessToken accessToken = result.f16477Y;
                if (accessToken == null) {
                    throw new FacebookException("Can't validate without a token");
                }
                AccessToken accessTokenB = AccessToken.Companion.b();
                if (accessTokenB != null) {
                    try {
                        if (accessTokenB.j0.equals(accessToken.j0)) {
                            result2 = new Result(this.h0, Result.Code.SUCCESS, accessToken, result.Z, null, null);
                        } else {
                            result2 = Result.b(this.h0, "User logged in as different Facebook user.", null, null);
                        }
                    } catch (Exception e2) {
                        c(Result.b(this.h0, "Caught exception", e2.getMessage(), null));
                        return;
                    }
                } else {
                    result2 = Result.b(this.h0, "User logged in as different Facebook user.", null, null);
                }
                c(result2);
                return;
            }
        }
        c(result);
    }

    public final LoginMethodHandler f() {
        int i2 = this.f16475Y;
        if (i2 >= 0) {
            return this.X[i2];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    public final LoginLogger j() {
        LoginLogger loginLogger = this.k0;
        if (loginLogger != null) {
            String str = null;
            if (!CrashShieldHandler.b(loginLogger)) {
                try {
                    str = loginLogger.f16485b;
                } catch (Throwable th) {
                    CrashShieldHandler.a(loginLogger, th);
                }
            }
            if (!str.equals(this.h0.e0)) {
                this.k0 = new LoginLogger(this.Z.getActivity(), this.h0.e0);
            }
        } else {
            this.k0 = new LoginLogger(this.Z.getActivity(), this.h0.e0);
        }
        return this.k0;
    }

    public final void k(String str, String str2, String str3, String str4, HashMap map) {
        if (this.h0 == null) {
            j().a("fb_mobile_login_method_complete", str);
            return;
        }
        LoginLogger loginLoggerJ = j();
        Request request = this.h0;
        String str5 = request.f0;
        String str6 = request.n0 ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        loginLoggerJ.getClass();
        if (CrashShieldHandler.b(loginLoggerJ)) {
            return;
        }
        try {
            Bundle bundleB = LoginLogger.b(str5);
            bundleB.putString("2_result", str2);
            if (str3 != null) {
                bundleB.putString("5_error_message", str3);
            }
            if (str4 != null) {
                bundleB.putString("4_error_code", str4);
            }
            if (map != null && !map.isEmpty()) {
                bundleB.putString("6_extras", new JSONObject(map).toString());
            }
            bundleB.putString("3_method", str);
            loginLoggerJ.f16484a.d(bundleB, str6);
        } catch (Throwable th) {
            CrashShieldHandler.a(loginLoggerJ, th);
        }
    }

    public final void m() {
        LoginClient loginClient;
        int i2;
        if (this.f16475Y >= 0) {
            loginClient = this;
            loginClient.k(f().j(), "skipped", null, null, f().X);
        } else {
            loginClient = this;
        }
        while (true) {
            LoginMethodHandler[] loginMethodHandlerArr = loginClient.X;
            if (loginMethodHandlerArr == null || (i2 = loginClient.f16475Y) >= loginMethodHandlerArr.length - 1) {
                break;
            }
            loginClient.f16475Y = i2 + 1;
            LoginMethodHandler loginMethodHandlerF = f();
            loginMethodHandlerF.getClass();
            if (!(loginMethodHandlerF instanceof WebViewLoginMethodHandler) || b()) {
                int iR = loginMethodHandlerF.r(loginClient.h0);
                loginClient.l0 = 0;
                if (iR > 0) {
                    LoginLogger loginLoggerJ = j();
                    String str = loginClient.h0.f0;
                    String strJ = loginMethodHandlerF.j();
                    String str2 = loginClient.h0.n0 ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                    loginLoggerJ.getClass();
                    if (!CrashShieldHandler.b(loginLoggerJ)) {
                        try {
                            Bundle bundleB = LoginLogger.b(str);
                            bundleB.putString("3_method", strJ);
                            loginLoggerJ.f16484a.d(bundleB, str2);
                        } catch (Throwable th) {
                            CrashShieldHandler.a(loginLoggerJ, th);
                        }
                    }
                    loginClient.m0 = iR;
                } else {
                    LoginLogger loginLoggerJ2 = j();
                    String str3 = loginClient.h0.f0;
                    String strJ2 = loginMethodHandlerF.j();
                    String str4 = loginClient.h0.n0 ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                    loginLoggerJ2.getClass();
                    if (!CrashShieldHandler.b(loginLoggerJ2)) {
                        try {
                            Bundle bundleB2 = LoginLogger.b(str3);
                            bundleB2.putString("3_method", strJ2);
                            loginLoggerJ2.f16484a.d(bundleB2, str4);
                        } catch (Throwable th2) {
                            CrashShieldHandler.a(loginLoggerJ2, th2);
                        }
                    }
                    a("not_tried", loginMethodHandlerF.j(), true);
                }
                if (iR > 0) {
                    return;
                }
            } else {
                a("no_internet_permission", "1", false);
            }
        }
        Request request = loginClient.h0;
        if (request != null) {
            c(Result.b(request, "Login attempt failed.", null, null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelableArray(this.X, i2);
        parcel.writeInt(this.f16475Y);
        parcel.writeParcelable(this.h0, i2);
        Utility.T(parcel, this.i0);
        Utility.T(parcel, this.j0);
    }

    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new AnonymousClass1();
        public final Code X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final AccessToken f16477Y;
        public final AuthenticationToken Z;
        public final String e0;
        public final String f0;
        public final Request g0;
        public HashMap h0;
        public HashMap i0;

        /* JADX INFO: renamed from: com.facebook.login.LoginClient$Result$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                return new Result(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i2) {
                return new Result[i2];
            }
        }

        public enum Code {
            SUCCESS("success"),
            CANCEL(b.P3),
            ERROR("error");

            public final String X;

            Code(String str) {
                this.X = str;
            }
        }

        public Result(Request request, Code code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            this.g0 = request;
            this.f16477Y = accessToken;
            this.Z = authenticationToken;
            this.e0 = str;
            this.X = code;
            this.f0 = str2;
        }

        public static Result a(Request request, String str) {
            return new Result(request, Code.CANCEL, null, null, str, null);
        }

        public static Result b(Request request, String str, String str2, String str3) {
            String[] strArr = {str, str2};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str4 = strArr[i2];
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            return new Result(request, Code.ERROR, null, null, TextUtils.join(": ", arrayList), str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.X.name());
            parcel.writeParcelable(this.f16477Y, i2);
            parcel.writeParcelable(this.Z, i2);
            parcel.writeString(this.e0);
            parcel.writeString(this.f0);
            parcel.writeParcelable(this.g0, i2);
            Utility.T(parcel, this.h0);
            Utility.T(parcel, this.i0);
        }

        public Result(Parcel parcel) {
            this.X = Code.valueOf(parcel.readString());
            this.f16477Y = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.Z = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.e0 = parcel.readString();
            this.f0 = parcel.readString();
            this.g0 = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.h0 = Utility.Q(parcel);
            this.i0 = Utility.Q(parcel);
        }
    }

    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new AnonymousClass1();
        public final LoginBehavior X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Set f16476Y;
        public final DefaultAudience Z;
        public final String e0;
        public String f0;
        public boolean g0;
        public final String h0;
        public final String i0;
        public final String j0;
        public String k0;
        public boolean l0;
        public final LoginTargetApp m0;
        public boolean n0;
        public boolean o0;
        public final String p0;

        /* JADX INFO: renamed from: com.facebook.login.LoginClient$Request$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<Request> {
            @Override // android.os.Parcelable.Creator
            public final Request createFromParcel(Parcel parcel) {
                return new Request(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Request[] newArray(int i2) {
                return new Request[i2];
            }
        }

        public Request(LoginBehavior loginBehavior, Set set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4) {
            this.g0 = false;
            this.n0 = false;
            this.o0 = false;
            this.X = loginBehavior;
            this.f16476Y = set == null ? new HashSet() : set;
            this.Z = defaultAudience;
            this.i0 = str;
            this.e0 = str2;
            this.f0 = str3;
            this.m0 = loginTargetApp;
            this.p0 = str4;
        }

        public final boolean a() {
            for (String str : this.f16476Y) {
                Set set = LoginManager.f16488i;
                if (str != null && (str.startsWith("publish") || str.startsWith("manage") || LoginManager.f16488i.contains(str))) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            LoginBehavior loginBehavior = this.X;
            parcel.writeString(loginBehavior != null ? loginBehavior.name() : null);
            parcel.writeStringList(new ArrayList(this.f16476Y));
            DefaultAudience defaultAudience = this.Z;
            parcel.writeString(defaultAudience != null ? defaultAudience.name() : null);
            parcel.writeString(this.e0);
            parcel.writeString(this.f0);
            parcel.writeByte(this.g0 ? (byte) 1 : (byte) 0);
            parcel.writeString(this.h0);
            parcel.writeString(this.i0);
            parcel.writeString(this.j0);
            parcel.writeString(this.k0);
            parcel.writeByte(this.l0 ? (byte) 1 : (byte) 0);
            LoginTargetApp loginTargetApp = this.m0;
            parcel.writeString(loginTargetApp != null ? loginTargetApp.name() : null);
            parcel.writeByte(this.n0 ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.o0 ? (byte) 1 : (byte) 0);
            parcel.writeString(this.p0);
        }

        public Request(Parcel parcel) {
            this.g0 = false;
            this.n0 = false;
            this.o0 = false;
            String string = parcel.readString();
            this.X = string != null ? LoginBehavior.valueOf(string) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f16476Y = new HashSet(arrayList);
            String string2 = parcel.readString();
            this.Z = string2 != null ? DefaultAudience.valueOf(string2) : null;
            this.e0 = parcel.readString();
            this.f0 = parcel.readString();
            this.g0 = parcel.readByte() != 0;
            this.h0 = parcel.readString();
            this.i0 = parcel.readString();
            this.j0 = parcel.readString();
            this.k0 = parcel.readString();
            this.l0 = parcel.readByte() != 0;
            String string3 = parcel.readString();
            this.m0 = string3 != null ? LoginTargetApp.valueOf(string3) : null;
            this.n0 = parcel.readByte() != 0;
            this.o0 = parcel.readByte() != 0;
            this.p0 = parcel.readString();
        }
    }
}
