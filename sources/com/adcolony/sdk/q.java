package com.adcolony.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
class q {
    private boolean d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f9319a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f9320b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9321c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9322e = "";
    private f1 f = c0.b();
    private String g = "";

    public class a implements j0 {

        /* JADX INFO: renamed from: com.adcolony.sdk.q$a$a, reason: collision with other inner class name */
        public class RunnableC0017a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9323a;

            /* JADX INFO: renamed from: com.adcolony.sdk.q$a$a$a, reason: collision with other inner class name */
            public class RunnableC0018a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f1 f9324a;

                public RunnableC0018a(f1 f1Var) {
                    this.f9324a = f1Var;
                }

                @Override // java.lang.Runnable
                public void run() {
                    RunnableC0017a.this.f9323a.a(this.f9324a).c();
                }
            }

            public RunnableC0017a(a aVar, h0 h0Var) {
                this.f9323a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                z0.b(new RunnableC0018a(com.adcolony.sdk.a.b().n().c(2000L)));
            }
        }

        public a(q qVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (z0.a(new RunnableC0017a(this, h0Var))) {
                return;
            }
            new e0.a().a("Error retrieving device info, disabling AdColony.").a(e0.f9132i);
            AdColony.disable();
        }
    }

    public class b implements Callable<f1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f9326a;

        public b(long j) {
            this.f9326a = j;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f1 call() {
            if (!q.this.N() && this.f9326a > 0) {
                q.this.f9319a.a(this.f9326a);
            }
            return q.this.b();
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f9328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f9329b;

        public c(Context context, y yVar) {
            this.f9328a = context;
            this.f9329b = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strG;
            boolean zH;
            if (com.adcolony.sdk.a.f8953e) {
                strG = "00000000-0000-0000-0000-000000000000";
                zH = true;
            } else {
                strG = null;
                zH = false;
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f9328a);
                    strG = advertisingIdInfo.getId();
                    zH = advertisingIdInfo.isLimitAdTrackingEnabled();
                } catch (Exception e2) {
                    new e0.a().a("Query Advertising ID failed with: ").a(Log.getStackTraceString(e2)).a(e0.g);
                } catch (NoClassDefFoundError unused) {
                    new e0.a().a("Google Play Services Ads dependencies are missing.").a(e0.f);
                } catch (NoSuchMethodError unused2) {
                    new e0.a().a("Google Play Services is out of date, please update to GPS 4.0+.").a(e0.f);
                }
                if (strG == null && Build.MANUFACTURER.equals("Amazon")) {
                    strG = q.this.g();
                    zH = q.this.h();
                }
            }
            if (strG == null) {
                new e0.a().a("Advertising ID is not available. ").a("Collecting Android ID instead of Advertising ID.").a(e0.f);
                y yVar = this.f9329b;
                if (yVar != null) {
                    yVar.a(new Throwable("Advertising ID is not available."));
                }
            } else {
                q.this.a(strG);
                s0 s0VarA = com.adcolony.sdk.a.b().q().a();
                if (s0VarA != null) {
                    s0VarA.d.put("advertisingId", q.this.f());
                }
                q.this.c(zH);
                y yVar2 = this.f9329b;
                if (yVar2 != null) {
                    yVar2.a(q.this.f());
                }
            }
            q.this.a(true);
        }
    }

    public class d implements Callable<f1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f9331a;

        public d(long j) {
            this.f9331a = j;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f1 call() {
            if (!q.this.O() && this.f9331a > 0) {
                q.this.f9320b.a(this.f9331a);
            }
            return q.this.c();
        }
    }

    public class e implements OnCompleteListener<AppSetIdInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f9333a;

        public e(y yVar) {
            this.f9333a = yVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(Task<AppSetIdInfo> task) {
            if (task.isSuccessful()) {
                q.this.b(task.getResult().getId());
                y yVar = this.f9333a;
                if (yVar != null) {
                    yVar.a(q.this.k());
                }
            } else {
                Throwable exception = task.getException() != null ? task.getException() : new Throwable("Task failed with unknown exception.");
                new e0.a().a("App Set ID is not available. Unexpected exception occurred: ").a(Log.getStackTraceString(exception)).a(e0.g);
                y yVar2 = this.f9333a;
                if (yVar2 != null) {
                    yVar2.a(exception);
                }
            }
            q.this.b(true);
        }
    }

    public boolean A() {
        return this.d;
    }

    public String B() {
        return "";
    }

    public String C() {
        return Build.MANUFACTURER;
    }

    public int D() {
        ActivityManager activityManager;
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null || (activityManager = (ActivityManager) contextA.getSystemService("activity")) == null) {
            return 0;
        }
        return activityManager.getMemoryClass();
    }

    public long E() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / ((long) 1048576);
    }

    public String F() {
        return Build.MODEL;
    }

    public int G() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return 2;
        }
        int i2 = contextA.getResources().getConfiguration().orientation;
        if (i2 != 1) {
            return i2 != 2 ? 2 : 1;
        }
        return 0;
    }

    public String H() {
        return Build.VERSION.RELEASE;
    }

    public String I() {
        return "4.8.0";
    }

    public String J() {
        TelephonyManager telephonyManager;
        Context contextA = com.adcolony.sdk.a.a();
        return (contextA == null || (telephonyManager = (TelephonyManager) contextA.getSystemService("phone")) == null) ? "" : telephonyManager.getSimCountryIso();
    }

    public int K() {
        return TimeZone.getDefault().getOffset(15L) / 60000;
    }

    public String L() {
        return TimeZone.getDefault().getID();
    }

    public void M() {
        a(false);
        b(false);
        com.adcolony.sdk.a.a("Device.get_info", new a(this));
    }

    public boolean N() {
        return this.f9319a.a();
    }

    public boolean O() {
        return this.f9320b.a();
    }

    public boolean P() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return false;
        }
        DisplayMetrics displayMetrics = contextA.getResources().getDisplayMetrics();
        float f = displayMetrics.widthPixels / displayMetrics.xdpi;
        float f2 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return Math.sqrt((double) ((f2 * f2) + (f * f))) >= 6.0d;
    }

    public void c(boolean z2) {
        this.d = z2;
    }

    public f1 d() {
        f1 f1VarB = c0.b();
        k kVarB = com.adcolony.sdk.a.b();
        c0.a(f1VarB, "carrier_name", m());
        c0.a(f1VarB, "data_path", kVarB.z().b());
        c0.b(f1VarB, "device_api", j());
        Rect rectW = w();
        c0.b(f1VarB, "screen_width", rectW.width());
        c0.b(f1VarB, "screen_height", rectW.height());
        c0.b(f1VarB, "display_dpi", v());
        c0.a(f1VarB, "device_type", u());
        c0.a(f1VarB, "locale_language_code", y());
        c0.a(f1VarB, BidResponsed.KEY_LN, y());
        c0.a(f1VarB, "locale_country_code", p());
        c0.a(f1VarB, "locale", p());
        c0.a(f1VarB, "mac_address", B());
        c0.a(f1VarB, "manufacturer", C());
        c0.a(f1VarB, "device_brand", C());
        c0.a(f1VarB, "media_path", kVarB.z().c());
        c0.a(f1VarB, "temp_storage_path", kVarB.z().d());
        c0.b(f1VarB, "memory_class", D());
        c0.b(f1VarB, "memory_used_mb", E());
        c0.a(f1VarB, "model", F());
        c0.a(f1VarB, "device_model", F());
        c0.a(f1VarB, "sdk_type", "android_native");
        c0.a(f1VarB, com.smartdigimkt.b0.a.s1, I());
        c0.a(f1VarB, "network_type", kVarB.s().e());
        c0.a(f1VarB, com.smartdigimkt.b0.a.h1, H());
        c0.a(f1VarB, "os_name", "android");
        c0.a(f1VarB, "platform", "android");
        c0.a(f1VarB, "arch", a());
        c0.a(f1VarB, "user_id", c0.h(kVarB.u().b(), "user_id"));
        c0.a(f1VarB, "app_id", kVarB.u().a());
        c0.a(f1VarB, "app_bundle_name", z0.b());
        c0.a(f1VarB, "app_bundle_version", z0.c());
        c0.a(f1VarB, "battery_level", l());
        c0.a(f1VarB, "cell_service_country_code", J());
        c0.a(f1VarB, "timezone_ietf", L());
        c0.b(f1VarB, "timezone_gmt_m", K());
        c0.b(f1VarB, "timezone_dst_m", q());
        c0.a(f1VarB, "launch_metadata", z());
        c0.a(f1VarB, "controller_version", kVarB.f());
        c0.b(f1VarB, "current_orientation", G());
        c0.b(f1VarB, "cleartext_permitted", n());
        c0.a(f1VarB, "density", s());
        c0.b(f1VarB, "dark_mode", r());
        c0.a(f1VarB, "adc_alt_id", e());
        e1 e1VarA = c0.a();
        if (z0.c("com.android.vending")) {
            e1VarA.b(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
        }
        if (z0.c("com.amazon.venezia")) {
            e1VarA.b("amazon");
        }
        if (z0.c("com.huawei.appmarket")) {
            e1VarA.b("huawei");
        }
        if (z0.c("com.sec.android.app.samsungapps")) {
            e1VarA.b("samsung");
        }
        c0.a(f1VarB, "available_stores", e1VarA);
        return f1VarB;
    }

    public String e() {
        return z0.a(com.adcolony.sdk.a.b().z());
    }

    public String f() {
        return this.f9321c;
    }

    public String g() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return null;
        }
        return Settings.Secure.getString(contextA.getContentResolver(), "advertising_id");
    }

    public boolean h() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return false;
        }
        try {
            return Settings.Secure.getInt(contextA.getContentResolver(), "limit_ad_tracking") != 0;
        } catch (Settings.SettingNotFoundException unused) {
        }
    }

    public String i() {
        Context contextA = com.adcolony.sdk.a.a();
        return contextA == null ? "" : Settings.Secure.getString(contextA.getContentResolver(), "android_id");
    }

    public int j() {
        return Build.VERSION.SDK_INT;
    }

    public String k() {
        return this.f9322e;
    }

    public double l() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return 0.0d;
        }
        try {
            Intent intentRegisterReceiver = contextA.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver == null) {
                return 0.0d;
            }
            int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return 0.0d;
            }
            return ((double) intExtra) / ((double) intExtra2);
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    public String m() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) contextA.getSystemService("phone");
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
        return networkOperatorName.length() == 0 ? "unknown" : networkOperatorName;
    }

    public boolean n() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public String o() {
        return this.g;
    }

    public String p() {
        return Locale.getDefault().getCountry();
    }

    public int q() {
        TimeZone timeZone = TimeZone.getDefault();
        if (timeZone.inDaylightTime(new Date())) {
            return timeZone.getDSTSavings() / 60000;
        }
        return 0;
    }

    public boolean r() {
        int i2;
        Context contextA = com.adcolony.sdk.a.a();
        return contextA != null && Build.VERSION.SDK_INT >= 29 && (i2 = contextA.getResources().getConfiguration().uiMode & 48) != 16 && i2 == 32;
    }

    public float s() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return 0.0f;
        }
        return contextA.getResources().getDisplayMetrics().density;
    }

    public f1 t() {
        if (!N()) {
            try {
                return z0.b(c0.a(d(), a(2000L).call()));
            } catch (Exception unused) {
            }
        }
        return z0.b(c0.a(d(), b()));
    }

    public String u() {
        return P() ? "tablet" : "phone";
    }

    public int v() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA != null) {
            return contextA.getResources().getConfiguration().densityDpi;
        }
        return 0;
    }

    public Rect w() {
        Rect rect = new Rect();
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA != null) {
            try {
                WindowManager windowManager = (WindowManager) contextA.getSystemService("window");
                if (windowManager != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
            } catch (RuntimeException unused) {
            }
        }
        return rect;
    }

    public Rect x() {
        Rect rect = new Rect();
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return rect;
        }
        try {
            WindowManager windowManager = (WindowManager) contextA.getSystemService("window");
            if (windowManager == null) {
                return rect;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                try {
                    Point point = new Point();
                    Point point2 = new Point();
                    contextA.getDisplay().getCurrentSizeRange(point, point2);
                    Point point3 = currentWindowMetrics.getBounds().width() > currentWindowMetrics.getBounds().height() ? new Point(point2.x, point.y) : new Point(point.x, point2.y);
                    return new Rect(0, 0, point3.x, point3.y);
                } catch (UnsupportedOperationException unused) {
                    Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.statusBars());
                    return new Rect(0, 0, currentWindowMetrics.getBounds().width() - (insetsIgnoringVisibility.right + insetsIgnoringVisibility.left), currentWindowMetrics.getBounds().height() - (insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom));
                }
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            Display defaultDisplay = windowManager.getDefaultDisplay();
            defaultDisplay.getMetrics(displayMetrics);
            defaultDisplay.getRealMetrics(displayMetrics2);
            int iF = z0.f(contextA);
            int iB = z0.b(contextA);
            int i2 = displayMetrics2.heightPixels - displayMetrics.heightPixels;
            if (i2 <= 0) {
                return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels - iF);
            }
            if (iB > 0 && (i2 > iF || iB <= iF)) {
                return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics2.heightPixels - (iB + iF));
            }
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics2.heightPixels - iF);
        } catch (RuntimeException unused2) {
            return rect;
        }
    }

    public String y() {
        return Locale.getDefault().getLanguage();
    }

    public f1 z() {
        return this.f;
    }

    public void a(f1 f1Var) {
        this.f = f1Var;
    }

    public void b(String str) {
        this.f9322e = str;
    }

    public void c(String str) {
        this.g = str;
    }

    public void a(String str) {
        this.f9321c = str;
    }

    public void b(boolean z2) {
        this.f9320b.a(z2);
    }

    public f1 c(long j) {
        if (j <= 0) {
            return c0.a(d(), b(), c());
        }
        ArrayList arrayList = new ArrayList(Collections.singletonList(d()));
        q0 q0Var = new q0();
        if (N()) {
            arrayList.add(b());
        } else {
            q0Var.a(a(j));
        }
        if (O()) {
            arrayList.add(c());
        } else {
            q0Var.a(b(j));
        }
        if (!q0Var.b()) {
            arrayList.addAll(q0Var.a());
        }
        return c0.a((f1[]) arrayList.toArray(new f1[0]));
    }

    public void a(boolean z2) {
        this.f9319a.a(z2);
    }

    public f1 b() {
        f1 f1VarB = c0.b();
        String strF = f();
        c0.a(f1VarB, "advertiser_id", strF);
        c0.b(f1VarB, "limit_tracking", A());
        if (strF != null && !strF.isEmpty()) {
            return f1VarB;
        }
        c0.a(f1VarB, "android_id_sha1", z0.b(i()));
        return f1VarB;
    }

    public String a() {
        return System.getProperty("os.arch").toLowerCase(Locale.ENGLISH);
    }

    public Callable<f1> a(long j) {
        return new b(j);
    }

    public void a(Context context) {
        a(context, null);
    }

    public void a(Context context, y<String> yVar) {
        if (context != null) {
            if (f().isEmpty()) {
                a(false);
            }
            if (z0.a(new c(context, yVar))) {
                return;
            }
            new e0.a().a("Executing Query Advertising ID failed.").a(e0.f9132i);
            if (yVar != null) {
                yVar.a(new Throwable("Query Advertising ID failed on execute."));
            }
        } else if (yVar != null) {
            yVar.a(new Throwable("Context cannot be null."));
        }
        a(true);
    }

    public Callable<f1> b(long j) {
        return new d(j);
    }

    public void b(Context context) {
        b(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    public void b(Context context, y<String> yVar) {
        if (context == null) {
            if (yVar != null) {
                yVar.a(new Throwable("Context cannot be null."));
            }
        } else {
            if (k().isEmpty()) {
                b(false);
                try {
                    AppSet.getClient(context.getApplicationContext()).getAppSetIdInfo().addOnCompleteListener(new e(yVar));
                    return;
                } catch (Exception e2) {
                    new e0.a().a("Query App Set ID failed with: ").a(Log.getStackTraceString(e2)).a(e0.g);
                    new e0.a().a("App Set ID is not available.").a(e0.f);
                    if (yVar != null) {
                        yVar.a(new Throwable("App Set ID is not available."));
                    }
                    b(true);
                } catch (NoClassDefFoundError | NoSuchMethodError unused) {
                    new e0.a().a("Google Play Services App Set dependency is missing.").a(e0.f);
                    new e0.a().a("App Set ID is not available.").a(e0.f);
                    if (yVar != null) {
                        yVar.a(new Throwable("App Set ID is not available."));
                    }
                    b(true);
                }
            }
            if (yVar != null) {
                yVar.a(k());
            }
        }
        b(true);
    }

    public f1 c() {
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "app_set_id", k());
        return f1VarB;
    }
}
