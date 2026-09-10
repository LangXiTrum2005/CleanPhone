package l7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.InternalAppEventsLogger;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f45190a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f45191b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f45192c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0 f45193d = new l0(true, "com.facebook.sdk.AutoInitEnabled");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f45194e = new l0(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l0 f45195f = new l0(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l0 f45196g = new l0(false, "auto_event_setup_enabled");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l0 f45197h = new l0(true, "com.facebook.sdk.MonitorEnabled");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static SharedPreferences f45198i;

    public static final boolean b() {
        if (v7.a.b(m0.class)) {
            return false;
        }
        try {
            f45190a.e();
            return f45195f.a();
        } catch (Throwable th2) {
            v7.a.a(m0.class, th2);
            return false;
        }
    }

    public static final boolean c() {
        if (v7.a.b(m0.class)) {
            return false;
        }
        try {
            m0 m0Var = f45190a;
            m0Var.e();
            return m0Var.a();
        } catch (Throwable th2) {
            v7.a.a(m0.class, th2);
            return false;
        }
    }

    public static final Boolean j() {
        String str = "";
        if (!v7.a.b(m0.class)) {
            try {
                f45190a.l();
                try {
                    SharedPreferences sharedPreferences = f45198i;
                    if (sharedPreferences == null) {
                        kotlin.jvm.internal.n.l("userSettingPref");
                        throw null;
                    }
                    String string = sharedPreferences.getString((String) f45194e.f45186c, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        return Boolean.valueOf(new JSONObject(str).getBoolean(X3.i.X));
                    }
                } catch (JSONException e10) {
                    q7.e0.A("l7.m0", e10);
                }
            } catch (Throwable th2) {
                v7.a.a(m0.class, th2);
                return null;
            }
        }
        return null;
    }

    public final boolean a() {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            HashMap mapC = q7.u.c();
            if (mapC != null && !mapC.isEmpty()) {
                Boolean bool = (Boolean) mapC.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) mapC.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean bool3 = null;
                if (!v7.a.b(this)) {
                    try {
                        Boolean boolJ = j();
                        if (boolJ != null || (boolJ = f()) != null) {
                            bool3 = boolJ;
                        }
                    } catch (Throwable th2) {
                        v7.a.a(this, th2);
                    }
                }
                if (bool3 != null) {
                    return bool3.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return f45194e.a();
        } catch (Throwable th3) {
            v7.a.a(this, th3);
            return false;
        }
    }

    public final void d() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            l0 l0Var = f45196g;
            k(l0Var);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (((Boolean) l0Var.f45187d) == null || jCurrentTimeMillis - l0Var.f45185b >= 604800000) {
                l0Var.f45187d = null;
                l0Var.f45185b = 0L;
                if (f45192c.compareAndSet(false, true)) {
                    s.d().execute(new Runnable() { // from class: l7.k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            q7.r rVarK;
                            long j10 = jCurrentTimeMillis;
                            if (v7.a.b(m0.class)) {
                                return;
                            }
                            try {
                                if (m0.f45195f.a() && (rVarK = q7.u.k(s.c(), false)) != null && rVarK.f48763g) {
                                    q7.b bVarB = q7.f.b(s.b());
                                    String strA = (bVarB == null || bVarB.a() == null) ? null : bVarB.a();
                                    if (strA != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", strA);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str = b0.f45085j;
                                        b0 b0VarZ = j2.n.z(null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, null);
                                        b0VarZ.f45090d = bundle;
                                        JSONObject jSONObject = b0VarZ.c().f45110b;
                                        if (jSONObject != null) {
                                            l0 l0Var2 = m0.f45196g;
                                            l0Var2.f45187d = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            l0Var2.f45185b = j10;
                                            m0.f45190a.m(l0Var2);
                                        }
                                    }
                                }
                                m0.f45192c.set(false);
                            } catch (Throwable th2) {
                                v7.a.a(m0.class, th2);
                            }
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void e() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (s.f45226p.get()) {
                if (f45191b.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = s.b().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    kotlin.jvm.internal.n.e(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
                    f45198i = sharedPreferences;
                    l0[] l0VarArr = {f45194e, f45195f, f45193d};
                    if (!v7.a.b(this)) {
                        for (int i10 = 0; i10 < 3; i10++) {
                            try {
                                l0 l0Var = l0VarArr[i10];
                                if (l0Var == f45196g) {
                                    d();
                                } else if (((Boolean) l0Var.f45187d) == null) {
                                    k(l0Var);
                                    if (((Boolean) l0Var.f45187d) == null) {
                                        g(l0Var);
                                    }
                                } else {
                                    m(l0Var);
                                }
                            } catch (Throwable th2) {
                                v7.a.a(this, th2);
                                d();
                                i();
                                h();
                            }
                        }
                    }
                    d();
                    i();
                    h();
                }
            }
        } catch (Throwable th3) {
            v7.a.a(this, th3);
        }
    }

    public final Boolean f() {
        if (!v7.a.b(this)) {
            try {
                l();
                try {
                    Context contextB = s.b();
                    ApplicationInfo applicationInfo = contextB.getPackageManager().getApplicationInfo(contextB.getPackageName(), 128);
                    kotlin.jvm.internal.n.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null) {
                        l0 l0Var = f45194e;
                        if (bundle.containsKey((String) l0Var.f45186c)) {
                            return Boolean.valueOf(applicationInfo.metaData.getBoolean((String) l0Var.f45186c));
                        }
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    q7.e0.A("l7.m0", e10);
                }
            } catch (Throwable th2) {
                v7.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final void g(l0 l0Var) {
        String str = (String) l0Var.f45186c;
        if (v7.a.b(this)) {
            return;
        }
        try {
            l();
            try {
                Context contextB = s.b();
                ApplicationInfo applicationInfo = contextB.getPackageManager().getApplicationInfo(contextB.getPackageName(), 128);
                kotlin.jvm.internal.n.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(str)) {
                    return;
                }
                l0Var.f45187d = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, l0Var.f45184a));
                return;
            } catch (PackageManager.NameNotFoundException e10) {
                q7.e0.A("l7.m0", e10);
                return;
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
        v7.a.a(this, th2);
    }

    public final void h() {
        int i10;
        int i11;
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (f45191b.get() && s.f45226p.get()) {
                Context contextB = s.b();
                int i12 = (f45193d.a() ? 1 : 0) | ((f45194e.a() ? 1 : 0) << 1) | ((f45195f.a() ? 1 : 0) << 2) | ((f45197h.a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f45198i;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.n.l("userSettingPref");
                    throw null;
                }
                int i13 = 0;
                int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i14 != i12) {
                    SharedPreferences sharedPreferences2 = f45198i;
                    if (sharedPreferences2 == null) {
                        kotlin.jvm.internal.n.l("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i12).apply();
                    try {
                        ApplicationInfo applicationInfo = contextB.getPackageManager().getApplicationInfo(contextB.getPackageName(), 128);
                        kotlin.jvm.internal.n.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i11 = 0;
                            i10 = 0;
                            while (i13 < 4) {
                                try {
                                    i10 |= (applicationInfo.metaData.containsKey(strArr[i13]) ? 1 : 0) << i13;
                                    i11 |= (applicationInfo.metaData.getBoolean(strArr[i13], zArr[i13]) ? 1 : 0) << i13;
                                    i13++;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    i13 = i11;
                                    i11 = i13;
                                    i13 = i10;
                                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(contextB);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("usage", i13);
                                    bundle.putInt("initial", i11);
                                    bundle.putInt("previous", i14);
                                    bundle.putInt("current", i12);
                                    internalAppEventsLogger.logChangedSettingsEvent(bundle);
                                }
                            }
                            i13 = i10;
                        } else {
                            i11 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i10 = 0;
                    }
                    InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(contextB);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i13);
                    bundle2.putInt("initial", i11);
                    bundle2.putInt("previous", i14);
                    bundle2.putInt("current", i12);
                    internalAppEventsLogger2.logChangedSettingsEvent(bundle2);
                }
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void i() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            Context contextB = s.b();
            ApplicationInfo applicationInfo = contextB.getPackageManager().getApplicationInfo(contextB.getPackageName(), 128);
            kotlin.jvm.internal.n.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w("l7.m0", "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (b()) {
                    return;
                }
                Log.w("l7.m0", "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void k(l0 l0Var) {
        String str = "";
        if (v7.a.b(this)) {
            return;
        }
        try {
            l();
            try {
                SharedPreferences sharedPreferences = f45198i;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.n.l("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString((String) l0Var.f45186c, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    l0Var.f45187d = Boolean.valueOf(jSONObject.getBoolean(X3.i.X));
                    l0Var.f45185b = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException e10) {
                q7.e0.A("l7.m0", e10);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void l() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (f45191b.get()) {
            } else {
                throw new t("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void m(l0 l0Var) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            l();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(X3.i.X, (Boolean) l0Var.f45187d);
                jSONObject.put("last_timestamp", l0Var.f45185b);
                SharedPreferences sharedPreferences = f45198i;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.n.l("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString((String) l0Var.f45186c, jSONObject.toString()).apply();
                h();
            } catch (Exception e10) {
                q7.e0.A("l7.m0", e10);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }
}
