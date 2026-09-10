package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Pair;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.browser.customtabs.CustomTabsClient;
import com.facebook.AccessToken;
import com.facebook.AccessTokenManager;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile$Companion$fetchProfileForCurrentAccessToken$1;
import com.facebook.ProfileManager;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class LoginManager {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set f16488i;
    public static volatile LoginManager j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f16491c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16492e;
    public boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LoginBehavior f16489a = LoginBehavior.NATIVE_WITH_FALLBACK;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DefaultAudience f16490b = DefaultAudience.FRIENDS;
    public String d = "rerequest";
    public LoginTargetApp g = LoginTargetApp.FACEBOOK;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16493h = false;

    /* JADX INFO: renamed from: com.facebook.login.LoginManager$1, reason: invalid class name */
    class AnonymousClass1 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginManager$2, reason: invalid class name */
    final class AnonymousClass2 extends HashSet<String> {
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginManager$4, reason: invalid class name */
    class AnonymousClass4 implements PlatformServiceClient.CompletedListener {
        @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
        public final void a(Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            String string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            if (string != null) {
                Set set = LoginManager.f16488i;
                new FacebookException(a.D(string, ": ", string2));
                throw null;
            }
            String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date dateO = Utility.o(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string4 = bundle.getString("signed request");
            String string5 = bundle.getString("graph_domain");
            Date dateO2 = Utility.o(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            String strK = !Utility.C(string4) ? LoginMethodHandler.k(string4) : null;
            if (Utility.C(string3) || stringArrayList == null || stringArrayList.isEmpty() || Utility.C(strK)) {
                throw null;
            }
            AccessTokenManager.g.a().c(new AccessToken(string3, null, strK, stringArrayList, null, null, null, dateO, null, dateO2, string5), true);
            AccessToken accessTokenB = AccessToken.Companion.b();
            if (accessTokenB == null) {
                throw null;
            }
            if (AccessToken.Companion.c()) {
                Utility.q(new Profile$Companion$fetchProfileForCurrentAccessToken$1(), accessTokenB.f0);
                throw null;
            }
            ProfileManager.f15957e.a().a(null, true);
            throw null;
        }
    }

    public static class ActivityStartActivityDelegate implements StartActivityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f16495a;

        public ActivityStartActivityDelegate(Activity activity) {
            Validate.f(activity, "activity");
            this.f16495a = activity;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public final Activity a() {
            return this.f16495a;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public final void startActivityForResult(Intent intent, int i2) {
            this.f16495a.startActivityForResult(intent, i2);
        }
    }

    public static class AndroidxActivityResultRegistryOwnerStartActivityDelegate implements StartActivityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ActivityResultRegistryOwner f16496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CallbackManagerImpl f16497b;

        /* JADX INFO: renamed from: com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$1, reason: invalid class name */
        class AnonymousClass1 extends ActivityResultContract<Intent, Pair<Integer, Intent>> {
            @Override // androidx.activity.result.contract.ActivityResultContract
            public final Intent a(Context context, Object obj) {
                return (Intent) obj;
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            public final Object c(int i2, Intent intent) {
                return Pair.create(Integer.valueOf(i2), intent);
            }
        }

        /* JADX INFO: renamed from: com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$1LauncherHolder, reason: invalid class name */
        class C1LauncherHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ActivityResultLauncher f16498a;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public final Activity a() {
            Object obj = this.f16496a;
            if (obj instanceof Activity) {
                return (Activity) obj;
            }
            return null;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public final void startActivityForResult(Intent intent, int i2) {
            final C1LauncherHolder c1LauncherHolder = new C1LauncherHolder();
            c1LauncherHolder.f16498a = null;
            ActivityResultLauncher activityResultLauncherD = this.f16496a.getActivityResultRegistry().d("facebook-login", new AnonymousClass1(), new ActivityResultCallback<Pair<Integer, Intent>>() { // from class: com.facebook.login.LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate.2
                @Override // androidx.activity.result.ActivityResultCallback
                public final void a(Object obj) {
                    Pair pair = (Pair) obj;
                    AndroidxActivityResultRegistryOwnerStartActivityDelegate.this.f16497b.onActivityResult(CallbackManagerImpl.RequestCodeOffset.Login.d(), ((Integer) pair.first).intValue(), (Intent) pair.second);
                    C1LauncherHolder c1LauncherHolder2 = c1LauncherHolder;
                    ActivityResultLauncher activityResultLauncher = c1LauncherHolder2.f16498a;
                    if (activityResultLauncher != null) {
                        activityResultLauncher.b();
                        c1LauncherHolder2.f16498a = null;
                    }
                }
            });
            c1LauncherHolder.f16498a = activityResultLauncherD;
            activityResultLauncherD.a(intent);
        }
    }

    public static class FragmentStartActivityDelegate implements StartActivityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FragmentWrapper f16501a;

        public FragmentStartActivityDelegate(FragmentWrapper fragmentWrapper) {
            this.f16501a = fragmentWrapper;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public final Activity a() {
            return this.f16501a.a();
        }

        @Override // com.facebook.login.StartActivityDelegate
        public final void startActivityForResult(Intent intent, int i2) {
            this.f16501a.b(intent, i2);
        }
    }

    public static class LoginLoggerHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static LoginLogger f16502a;

        public static LoginLogger a(Activity activity) {
            Context contextB = activity;
            synchronized (LoginLoggerHolder.class) {
                if (activity == null) {
                    try {
                        contextB = FacebookSdk.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (contextB == null) {
                    return null;
                }
                if (f16502a == null) {
                    f16502a = new LoginLogger(contextB, FacebookSdk.c());
                }
                return f16502a;
            }
        }
    }

    static {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.add("ads_management");
        anonymousClass2.add("create_event");
        anonymousClass2.add("rsvp_event");
        f16488i = Collections.unmodifiableSet(anonymousClass2);
        LoginManager.class.toString();
    }

    public LoginManager() {
        Validate.h();
        this.f16491c = FacebookSdk.b().getSharedPreferences("com.facebook.loginManager", 0);
        if (!FacebookSdk.m || CustomTabUtils.a() == null) {
            return;
        }
        CustomTabsClient.a(FacebookSdk.b(), "com.android.chrome", new CustomTabPrefetchHelper());
        CustomTabsClient.b(FacebookSdk.b(), FacebookSdk.b().getPackageName());
    }

    public static LoginManager b() {
        if (j == null) {
            synchronized (LoginManager.class) {
                try {
                    if (j == null) {
                        j = new LoginManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public static void c(Activity activity, LoginClient.Result.Code code, Map map, FacebookException facebookException, boolean z2, LoginClient.Request request) {
        LoginLogger loginLoggerA = LoginLoggerHolder.a(activity);
        if (loginLoggerA == null) {
            return;
        }
        if (request == null) {
            if (CrashShieldHandler.b(loginLoggerA)) {
                return;
            }
            try {
                loginLoggerA.a("fb_mobile_login_complete", "");
                return;
            } catch (Throwable th) {
                CrashShieldHandler.a(loginLoggerA, th);
                return;
            }
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z2 ? "1" : "0");
        String str = request.f0;
        String str2 = request.n0 ? "foa_mobile_login_complete" : "fb_mobile_login_complete";
        if (CrashShieldHandler.b(loginLoggerA)) {
            return;
        }
        try {
            Bundle bundleB = LoginLogger.b(str);
            if (code != null) {
                bundleB.putString("2_result", code.X);
            }
            if (facebookException != null && facebookException.getMessage() != null) {
                bundleB.putString("5_error_message", facebookException.getMessage());
            }
            JSONObject jSONObject = !map2.isEmpty() ? new JSONObject(map2) : null;
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleB.putString("6_extras", jSONObject.toString());
            }
            loginLoggerA.f16484a.d(bundleB, str2);
            if (code != LoginClient.Result.Code.SUCCESS || CrashShieldHandler.b(loginLoggerA)) {
                return;
            }
            try {
                LoginLogger.d.schedule(new Runnable() { // from class: com.facebook.login.LoginLogger.1
                    public final /* synthetic */ Bundle X;

                    public AnonymousClass1() {
                        bundle = bundle;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (CrashShieldHandler.b(this)) {
                            return;
                        }
                        try {
                            LoginLogger loginLogger = LoginLogger.this;
                            ScheduledExecutorService scheduledExecutorService = LoginLogger.d;
                            InternalAppEventsLogger internalAppEventsLogger = null;
                            if (!CrashShieldHandler.b(LoginLogger.class)) {
                                try {
                                    internalAppEventsLogger = loginLogger.f16484a;
                                } catch (Throwable th2) {
                                    CrashShieldHandler.a(LoginLogger.class, th2);
                                }
                            }
                            internalAppEventsLogger.d(bundle, "fb_mobile_login_heartbeat");
                        } catch (Throwable th3) {
                            CrashShieldHandler.a(this, th3);
                        }
                    }
                }, 5L, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                CrashShieldHandler.a(loginLoggerA, th2);
            }
        } catch (Throwable th3) {
            CrashShieldHandler.a(loginLoggerA, th3);
        }
    }

    public final LoginClient.Request a(LoginConfiguration loginConfiguration) {
        LoginBehavior loginBehavior = this.f16489a;
        Set set = loginConfiguration.f16479a;
        LoginClient.Request request = new LoginClient.Request(loginBehavior, Collections.unmodifiableSet(set != null ? new HashSet(set) : new HashSet()), this.f16490b, this.d, FacebookSdk.c(), UUID.randomUUID().toString(), this.g, loginConfiguration.f16480b);
        Date date = AccessToken.m0;
        request.g0 = AccessToken.Companion.c();
        request.k0 = this.f16492e;
        request.l0 = this.f;
        request.n0 = false;
        request.o0 = this.f16493h;
        return request;
    }

    public final void d(Activity activity, Collection collection, String str) {
        LoginClient.Request requestA = a(new LoginConfiguration(collection));
        requestA.f0 = str;
        g(new ActivityStartActivityDelegate(activity), requestA);
    }

    public final void e(ActivityResultRegistryOwner activityResultRegistryOwner, CallbackManagerImpl callbackManagerImpl, Collection collection, String str) {
        LoginClient.Request requestA = a(new LoginConfiguration(collection));
        requestA.f0 = str;
        AndroidxActivityResultRegistryOwnerStartActivityDelegate androidxActivityResultRegistryOwnerStartActivityDelegate = new AndroidxActivityResultRegistryOwnerStartActivityDelegate();
        androidxActivityResultRegistryOwnerStartActivityDelegate.f16496a = activityResultRegistryOwner;
        androidxActivityResultRegistryOwnerStartActivityDelegate.f16497b = callbackManagerImpl;
        g(androidxActivityResultRegistryOwnerStartActivityDelegate, requestA);
    }

    public final void f(FragmentWrapper fragmentWrapper, Collection collection, String str) {
        LoginClient.Request requestA = a(new LoginConfiguration(collection));
        requestA.f0 = str;
        g(new FragmentStartActivityDelegate(fragmentWrapper), requestA);
    }

    public final void g(StartActivityDelegate startActivityDelegate, LoginClient.Request request) {
        LoginLogger loginLoggerA = LoginLoggerHolder.a(startActivityDelegate.a());
        CallbackManagerImpl.RequestCodeOffset requestCodeOffset = CallbackManagerImpl.RequestCodeOffset.Login;
        LoginBehavior loginBehavior = request.X;
        if (loginLoggerA != null) {
            String str = request.n0 ? "foa_mobile_login_start" : "fb_mobile_login_start";
            if (!CrashShieldHandler.b(loginLoggerA)) {
                try {
                    Bundle bundleB = LoginLogger.b(request.f0);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("login_behavior", loginBehavior.toString());
                        jSONObject.put("request_code", requestCodeOffset.d());
                        jSONObject.put("permissions", TextUtils.join(",", request.f16476Y));
                        jSONObject.put("default_audience", request.Z.toString());
                        jSONObject.put("isReauthorize", request.g0);
                        String str2 = loginLoggerA.f16486c;
                        if (str2 != null) {
                            jSONObject.put("facebookVersion", str2);
                        }
                        LoginTargetApp loginTargetApp = request.m0;
                        if (loginTargetApp != null) {
                            jSONObject.put("target_app", loginTargetApp.X);
                        }
                        bundleB.putString("6_extras", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                    loginLoggerA.f16484a.c(bundleB, str);
                } catch (Throwable th) {
                    CrashShieldHandler.a(loginLoggerA, th);
                }
            }
        }
        CallbackManagerImpl.a(requestCodeOffset.d(), new CallbackManagerImpl.Callback() { // from class: com.facebook.login.LoginManager.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean a(int i2, Intent intent) {
                LoginClient.Result.Code code;
                FacebookException facebookException;
                AuthenticationToken authenticationToken;
                AccessToken accessToken;
                HashMap map;
                LoginClient.Request request2;
                LoginClient.Request request3;
                Object obj;
                HashMap map2;
                boolean z2;
                Object obj2;
                LoginManager.this.getClass();
                LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
                boolean z3 = false;
                if (intent != null) {
                    LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
                    if (result != null) {
                        code = result.X;
                        if (i2 == -1) {
                            if (code == LoginClient.Result.Code.SUCCESS) {
                                AccessToken accessToken2 = result.f16477Y;
                                z2 = false;
                                obj2 = result.Z;
                                accessToken = accessToken2;
                                facebookException = null;
                            } else {
                                facebookException = new FacebookAuthorizationException(result.e0);
                                accessToken = null;
                            }
                            map2 = result.h0;
                            request3 = result.g0;
                            boolean z4 = z2;
                            obj = obj2;
                            z3 = z4;
                        } else {
                            if (i2 == 0) {
                                z2 = true;
                                facebookException = null;
                                accessToken = null;
                            } else {
                                facebookException = null;
                                accessToken = null;
                            }
                            obj2 = accessToken;
                            map2 = result.h0;
                            request3 = result.g0;
                            boolean z5 = z2;
                            obj = obj2;
                            z3 = z5;
                        }
                        z2 = false;
                        obj2 = accessToken;
                        map2 = result.h0;
                        request3 = result.g0;
                        boolean z6 = z2;
                        obj = obj2;
                        z3 = z6;
                    } else {
                        code = code2;
                        facebookException = null;
                        request3 = null;
                        accessToken = null;
                        obj = null;
                        map2 = null;
                    }
                    request2 = request3;
                    authenticationToken = obj;
                    map = map2;
                } else {
                    if (i2 == 0) {
                        code = LoginClient.Result.Code.CANCEL;
                        z3 = true;
                    } else {
                        code = code2;
                    }
                    facebookException = null;
                    authenticationToken = 0;
                    accessToken = null;
                    map = null;
                    request2 = null;
                }
                if (facebookException == null && accessToken == null && !z3) {
                    facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
                }
                LoginManager.c(null, code, map, facebookException, true, request2);
                if (accessToken != null) {
                    Date date = AccessToken.m0;
                    AccessTokenManager.g.a().c(accessToken, true);
                    AccessToken accessTokenB = AccessToken.Companion.b();
                    if (accessTokenB != null) {
                        if (AccessToken.Companion.c()) {
                            Utility.q(new Profile$Companion$fetchProfileForCurrentAccessToken$1(), accessTokenB.f0);
                        } else {
                            ProfileManager.f15957e.a().a(null, true);
                        }
                    }
                }
                if (authenticationToken != 0) {
                    AuthenticationToken.a(authenticationToken);
                }
                return true;
            }
        });
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.b(), FacebookActivity.class);
        intent.setAction(loginBehavior.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (FacebookSdk.b().getPackageManager().resolveActivity(intent, 0) != null) {
            try {
                startActivityDelegate.startActivityForResult(intent, requestCodeOffset.d());
                return;
            } catch (ActivityNotFoundException unused2) {
            }
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        c(startActivityDelegate.a(), LoginClient.Result.Code.ERROR, null, facebookException, false, request);
        throw facebookException;
    }
}
