package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.thinkup.core.oo.m0;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/UserSettingsManager;", "", "UserSetting", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class UserSettingsManager {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static SharedPreferences f15972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final UserSettingsManager f15973i = new UserSettingsManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f15968a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f15969b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UserSetting f15970c = new UserSetting(true, "com.facebook.sdk.AutoInitEnabled");
    public static final UserSetting d = new UserSetting(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final UserSetting f15971e = new UserSetting(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    public static final UserSetting f = new UserSetting(false, "auto_event_setup_enabled");
    public static final UserSetting g = new UserSetting(true, "com.facebook.sdk.MonitorEnabled");

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/UserSettingsManager$UserSetting;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class UserSetting {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Boolean f15974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f15975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f15976c;
        public final String d;

        public UserSetting(boolean z2, String str) {
            this.f15976c = z2;
            this.d = str;
        }

        public final boolean a() {
            Boolean bool = this.f15974a;
            return bool != null ? bool.booleanValue() : this.f15976c;
        }
    }

    public static final /* synthetic */ UserSetting a() {
        if (CrashShieldHandler.b(UserSettingsManager.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            CrashShieldHandler.a(UserSettingsManager.class, th);
            return null;
        }
    }

    public static final boolean b() {
        if (CrashShieldHandler.b(UserSettingsManager.class)) {
            return false;
        }
        try {
            f15973i.e();
            return f15971e.a();
        } catch (Throwable th) {
            CrashShieldHandler.a(UserSettingsManager.class, th);
            return false;
        }
    }

    public static final boolean c() {
        if (CrashShieldHandler.b(UserSettingsManager.class)) {
            return false;
        }
        try {
            f15973i.e();
            return d.a();
        } catch (Throwable th) {
            CrashShieldHandler.a(UserSettingsManager.class, th);
            return false;
        }
    }

    public final void d() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            UserSetting userSetting = f;
            i(userSetting);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (userSetting.f15974a == null || jCurrentTimeMillis - userSetting.f15975b >= m0.om) {
                userSetting.f15974a = null;
                userSetting.f15975b = 0L;
                if (f15969b.compareAndSet(false, true)) {
                    FacebookSdk.e().execute(new Runnable() { // from class: com.facebook.UserSettingsManager$initializeCodelessSetupEnabledAsync$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserSettingsManager.UserSetting userSetting2;
                            FetchedAppSettings fetchedAppSettingsF;
                            if (CrashShieldHandler.b(this)) {
                                return;
                            }
                            try {
                                AtomicBoolean atomicBoolean = UserSettingsManager.f15968a;
                                AtomicBoolean atomicBoolean2 = null;
                                if (CrashShieldHandler.b(UserSettingsManager.class)) {
                                    userSetting2 = null;
                                } else {
                                    try {
                                        userSetting2 = UserSettingsManager.f15971e;
                                    } catch (Throwable th) {
                                        CrashShieldHandler.a(UserSettingsManager.class, th);
                                        userSetting2 = null;
                                    }
                                }
                                if (userSetting2.a() && (fetchedAppSettingsF = FetchedAppSettingsManager.f(FacebookSdk.c(), false)) != null && fetchedAppSettingsF.j) {
                                    AttributionIdentifiers attributionIdentifiersA = AttributionIdentifiers.Companion.a(FacebookSdk.b());
                                    String strA = (attributionIdentifiersA == null || attributionIdentifiersA.a() == null) ? null : attributionIdentifiersA.a();
                                    if (strA != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", strA);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str = GraphRequest.j;
                                        GraphRequest graphRequest = new GraphRequest(null, FacebookSdk.c(), null, null, null, 32);
                                        graphRequest.f15937h = true;
                                        graphRequest.d = bundle;
                                        JSONObject jSONObject = graphRequest.c().f15952c;
                                        if (jSONObject != null) {
                                            UserSettingsManager userSettingsManager = UserSettingsManager.f15973i;
                                            UserSettingsManager.a().f15974a = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            UserSettingsManager.a().f15975b = jCurrentTimeMillis;
                                            UserSettingsManager.UserSetting userSettingA = UserSettingsManager.a();
                                            if (!CrashShieldHandler.b(UserSettingsManager.class)) {
                                                try {
                                                    userSettingsManager.k(userSettingA);
                                                } catch (Throwable th2) {
                                                    CrashShieldHandler.a(UserSettingsManager.class, th2);
                                                }
                                            }
                                        }
                                    }
                                }
                                AtomicBoolean atomicBoolean3 = UserSettingsManager.f15968a;
                                if (!CrashShieldHandler.b(UserSettingsManager.class)) {
                                    try {
                                        atomicBoolean2 = UserSettingsManager.f15969b;
                                    } catch (Throwable th3) {
                                        CrashShieldHandler.a(UserSettingsManager.class, th3);
                                    }
                                }
                                atomicBoolean2.set(false);
                            } catch (Throwable th4) {
                                CrashShieldHandler.a(this, th4);
                            }
                        }
                    });
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public final void e() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            if (FacebookSdk.f15923p.get()) {
                if (f15968a.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = FacebookSdk.b().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    Intrinsics.e(sharedPreferences, "FacebookSdk.getApplicati…GS, Context.MODE_PRIVATE)");
                    f15972h = sharedPreferences;
                    UserSetting[] userSettingArr = {d, f15971e, f15970c};
                    if (!CrashShieldHandler.b(this)) {
                        for (int i2 = 0; i2 < 3; i2++) {
                            try {
                                UserSetting userSetting = userSettingArr[i2];
                                if (userSetting == f) {
                                    d();
                                } else if (userSetting.f15974a == null) {
                                    i(userSetting);
                                    if (userSetting.f15974a == null) {
                                        f(userSetting);
                                    }
                                } else {
                                    k(userSetting);
                                }
                            } catch (Throwable th) {
                                CrashShieldHandler.a(this, th);
                                d();
                                h();
                                g();
                            }
                        }
                    }
                    d();
                    h();
                    g();
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.a(this, th2);
        }
    }

    public final void f(UserSetting userSetting) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            j();
            try {
                Context contextB = FacebookSdk.b();
                ApplicationInfo applicationInfo = contextB.getPackageManager().getApplicationInfo(contextB.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) == null || !applicationInfo.metaData.containsKey(userSetting.d)) {
                    return;
                }
                userSetting.f15974a = Boolean.valueOf(applicationInfo.metaData.getBoolean(userSetting.d, userSetting.f15976c));
            } catch (PackageManager.NameNotFoundException unused) {
                HashSet hashSet = FacebookSdk.f15915a;
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:5:0x000d, B:8:0x0017, B:11:0x0021, B:15:0x004e, B:17:0x0054, B:19:0x0058, B:20:0x0063, B:22:0x0073, B:27:0x007d, B:30:0x0092, B:36:0x00b3, B:41:0x00e0, B:39:0x00d8, B:42:0x00e8, B:43:0x00eb, B:45:0x00ed, B:46:0x00f0), top: B:51:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void g() {
        int i2;
        int i3;
        Bundle bundle;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            if (f15968a.get() && FacebookSdk.f15923p.get()) {
                Context contextB = FacebookSdk.b();
                int i4 = (f15970c.a() ? 1 : 0) | ((d.a() ? 1 : 0) << 1) | ((f15971e.a() ? 1 : 0) << 2) | ((g.a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f15972h;
                if (sharedPreferences == null) {
                    Intrinsics.m("userSettingPref");
                    throw null;
                }
                int i5 = 0;
                int i6 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i6 != i4) {
                    SharedPreferences sharedPreferences2 = f15972h;
                    if (sharedPreferences2 == null) {
                        Intrinsics.m("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i4).apply();
                    try {
                        ApplicationInfo applicationInfo = contextB.getPackageManager().getApplicationInfo(contextB.getPackageName(), 128);
                        if ((applicationInfo != null ? applicationInfo.metaData : null) != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i3 = 0;
                            i2 = 0;
                            while (i5 < 4) {
                                try {
                                    i2 |= (applicationInfo.metaData.containsKey(strArr[i5]) ? 1 : 0) << i5;
                                    i3 |= (applicationInfo.metaData.getBoolean(strArr[i5], zArr[i5]) ? 1 : 0) << i5;
                                    i5++;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    i5 = i3;
                                    i3 = i5;
                                    i5 = i2;
                                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(contextB);
                                    bundle = new Bundle();
                                    bundle.putInt("usage", i5);
                                    bundle.putInt("initial", i3);
                                    bundle.putInt("previous", i6);
                                    bundle.putInt("current", i4);
                                    if ((bundle.getInt("previous") & 2) != 0) {
                                        HashSet hashSet = FacebookSdk.f15915a;
                                        if (!c()) {
                                            return;
                                        }
                                    }
                                    internalAppEventsLogger.f16027a.f(bundle, "fb_sdk_settings_changed");
                                }
                            }
                            i5 = i2;
                        } else {
                            i3 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i2 = 0;
                    }
                    InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(contextB);
                    bundle = new Bundle();
                    bundle.putInt("usage", i5);
                    bundle.putInt("initial", i3);
                    bundle.putInt("previous", i6);
                    bundle.putInt("current", i4);
                    if ((bundle.getInt("previous") & 2) != 0) {
                        HashSet hashSet2 = FacebookSdk.f15915a;
                        if (!c()) {
                            return;
                        }
                    }
                    internalAppEventsLogger2.f16027a.f(bundle, "fb_sdk_settings_changed");
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public final void h() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            Context contextB = FacebookSdk.b();
            ApplicationInfo applicationInfo = contextB.getPackageManager().getApplicationInfo(contextB.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null) {
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w("com.facebook.UserSettingsManager", "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w("com.facebook.UserSettingsManager", "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (b()) {
                    return;
                }
                Log.w("com.facebook.UserSettingsManager", "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public final void i(UserSetting userSetting) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            j();
            try {
                SharedPreferences sharedPreferences = f15972h;
                if (sharedPreferences == null) {
                    Intrinsics.m("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(userSetting.d, "");
                String str = string != null ? string : "";
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    userSetting.f15974a = Boolean.valueOf(jSONObject.getBoolean("value"));
                    userSetting.f15975b = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException unused) {
                HashSet hashSet = FacebookSdk.f15915a;
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public final void j() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            if (f15968a.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public final void k(UserSetting userSetting) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            j();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", userSetting.f15974a);
                jSONObject.put("last_timestamp", userSetting.f15975b);
                SharedPreferences sharedPreferences = f15972h;
                if (sharedPreferences == null) {
                    Intrinsics.m("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(userSetting.d, jSONObject.toString()).apply();
                g();
            } catch (Exception unused) {
                HashSet hashSet = FacebookSdk.f15915a;
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
