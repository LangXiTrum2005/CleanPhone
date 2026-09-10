package com.p004ironsource;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.environment.IronSourceSharedPreferencesUtilities;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class ab implements vf, vf.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f24287A = "browser_user_agent";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f24288B = "browser_user_agent_time";
    private static final String C = "IABTCF_gdprApplies";
    private static final String D = "IABTCF_TCString";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f24289E = "IABTCF_AddtlConsent";
    private static final String j = "android";
    private static final String k = "com.google.android.gms.permission.AD_ID";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f24290l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static final String m = "com.google.android.gms.appset.AppSet";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f24291n = "com.google.android.gms.tasks.OnSuccessListener";
    private static final String o = "getAdvertisingIdInfo";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f24292p = "getClient";
    private static final String q = "getAppSetIdInfo";
    private static final String r = "addOnSuccessListener";
    private static final String s = "getId";
    private static final String t = "isLimitAdTrackingEnabled";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f24293u = "Mediation_Shared_Preferences";
    private static final String v = "supersonic_shared_preferen";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f24294w = "cachedUUID";
    private static final String x = "auid";
    private static final String y = "unityads-installinfo";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f24295z = "unityads-idfi";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24296b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24297c = null;
    private String d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f24298e = "";
    private boolean f = false;
    private String g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f24299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile String f24300i;

    public class a implements InvocationHandler {
        public a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr == null) {
                return null;
            }
            try {
                if (objArr.length <= 0 || (obj2 = objArr[0]) == null) {
                    return null;
                }
                String string = obj2.getClass().getMethod(ab.s, new Class[0]).invoke(objArr[0], new Object[0]).toString();
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                ab.this.g = string;
                return null;
            } catch (Exception e2) {
                q9.d().a(e2);
                return null;
            }
        }
    }

    private String O(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objQ = Q(context);
        return objQ.getClass().getMethod(s, new Class[0]).invoke(objQ, new Object[0]).toString();
    }

    private void P(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objInvoke = AppSet.class.getMethod(f24292p, Context.class).invoke(AppSet.class, context);
        Object objInvoke2 = objInvoke.getClass().getMethod(q, new Class[0]).invoke(objInvoke, new Object[0]);
        objInvoke2.getClass().getMethod(r, OnSuccessListener.class).invoke(objInvoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new a()));
    }

    private Object Q(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return AdvertisingIdClient.class.getMethod(o, Context.class).invoke(AdvertisingIdClient.class, context);
    }

    private String R(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objQ = Q(context);
        return String.valueOf(((Boolean) objQ.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(objQ, new Object[0])).booleanValue());
    }

    private String S(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f24293u, f24287A, "");
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return "";
        }
    }

    private long T(Context context) {
        try {
            return Long.parseLong(IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f24293u, f24288B, String.valueOf(-1L)));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return -1L;
        }
    }

    @Override // com.p004ironsource.vf
    public int A(Context context) {
        int iL = L(context);
        int iH = H(context);
        return (((iL == 0 || iL == 2) && iH == 2) || ((iL == 1 || iL == 3) && iH == 1)) ? 2 : 1;
    }

    @Override // com.p004ironsource.vf
    public int B(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, "IABTCF_gdprApplies", -1);
        } catch (Exception e2) {
            q9.d().a(e2);
            return -1;
        }
    }

    @Override // com.p004ironsource.vf
    public int C(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.p004ironsource.vf
    public String D(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, "IABTCF_TCString", null);
        } catch (Exception e2) {
            q9.d().a(e2);
            return null;
        }
    }

    @Override // com.p004ironsource.vf
    public boolean E(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.p004ironsource.vf
    public String F(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.p004ironsource.vf
    public String G(Context context) {
        if (!xa.f27681a.c()) {
            return "";
        }
        try {
            P(context);
            return !TextUtils.isEmpty(this.g) ? this.g : "";
        } catch (Exception e2) {
            q9.d().a(e2);
            return "";
        }
    }

    @Override // com.p004ironsource.vf
    public int H(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.p004ironsource.vf
    public String I(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.p004ironsource.vf
    public boolean J(Context context) {
        Intent intentD = androidx.datastore.preferences.protobuf.a.d("android.intent.action.BATTERY_CHANGED", context, null);
        int intExtra = intentD != null ? intentD.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.p004ironsource.vf
    public String K(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, f24289E, null);
        } catch (Exception e2) {
            q9.d().a(e2);
            return null;
        }
    }

    @Override // com.p004ironsource.vf
    public int L(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.p004ironsource.vf
    public synchronized String M(Context context) {
        if (!TextUtils.isEmpty(this.f24296b)) {
            return this.f24296b;
        }
        if (IronSourceSharedPreferencesUtilities.getBooleanFromSharedPrefs(context, f24293u, vf.f27507a, true)) {
            String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f24293u, f24294w, "");
            if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                String string = UUID.randomUUID().toString();
                this.f24296b = string;
                IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f24293u, f24294w, string);
            } else {
                this.f24296b = stringFromSharedPrefs;
            }
        }
        return this.f24296b;
    }

    @Override // com.p004ironsource.vf
    public int N(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.p004ironsource.vf
    public int a() {
        return k();
    }

    @Override // com.p004ironsource.vf
    public Boolean b(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.p004ironsource.vf
    public Long c(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.p004ironsource.vf
    public int d() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.p004ironsource.vf
    public File e(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.p004ironsource.vf
    public String f(Context context) {
        if (context == null) {
            return "";
        }
        int iN = N(context);
        if (iN == 0) {
            return d9.h.C;
        }
        if (iN == 1) {
            return d9.h.D;
        }
        if (iN == 11) {
            return d9.h.C;
        }
        if (iN == 12) {
            return d9.h.D;
        }
        switch (iN) {
            case 6:
            case 8:
                return d9.h.C;
            case 7:
            case 9:
                return d9.h.D;
            default:
                return "none";
        }
    }

    @Override // com.p004ironsource.vf
    public String g() {
        return Build.MANUFACTURER;
    }

    @Override // com.p004ironsource.vf
    public float h() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // com.p004ironsource.vf
    public String i() {
        try {
            return System.getProperty("os.arch");
        } catch (SecurityException e2) {
            IronLog.INTERNAL.error(e2.getMessage());
            return null;
        }
    }

    @Override // com.p004ironsource.vf
    public long j() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.p004ironsource.vf
    public int k() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.p004ironsource.vf
    public int l() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.p004ironsource.vf
    public float m(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return -1.0f;
        }
    }

    @Override // com.p004ironsource.vf
    public long n() {
        if (c()) {
            return a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.p004ironsource.vf
    public long o() {
        return a(Environment.getDataDirectory());
    }

    @Override // com.p004ironsource.vf
    public String p() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.p004ironsource.vf
    public int q() {
        return -(TimeZone.getDefault().getOffset(j()) / 60000);
    }

    @Override // com.p004ironsource.vf
    public String r(Context context) {
        try {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveInfoResolveActivity != null) {
                return resolveInfoResolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (Throwable th) {
            q9.d().a(th);
            return null;
        }
    }

    @Override // com.p004ironsource.vf
    public int s() {
        return d();
    }

    @Override // com.p004ironsource.vf
    public String t() {
        try {
            return this.f24298e.isEmpty() ? S(ContextProvider.getInstance().getApplicationContext()) : this.f24298e;
        } catch (Exception e2) {
            q9.d().a(e2);
            return "";
        }
    }

    @Override // com.p004ironsource.vf
    public File u(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.p004ironsource.vf
    public boolean v(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(k)) {
                    return true;
                }
            }
        } catch (Exception e2) {
            q9.d().a(e2);
        }
        return false;
    }

    @Override // com.p004ironsource.vf
    public String w(Context context) {
        if (!TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        if (context == null) {
            return null;
        }
        String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "unityads-installinfo", "unityads-idfi", null);
        this.d = stringFromSharedPrefs;
        return stringFromSharedPrefs;
    }

    @Override // com.p004ironsource.vf
    public File x(Context context) {
        return context.getFilesDir();
    }

    @Override // com.p004ironsource.vf
    public int y(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return -1;
    }

    @Override // com.p004ironsource.vf
    public ActivityManager.MemoryInfo z(Context context) {
        if (context == null || !on.U().d().a()) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return null;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    private long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    @Override // com.p004ironsource.vf
    public String b() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    @Override // com.p004ironsource.vf
    public boolean c() {
        try {
            return "mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable();
        } catch (Exception e2) {
            q9.d().a(e2);
            return false;
        }
    }

    @Override // com.p004ironsource.vf
    public boolean d(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    @Override // com.p004ironsource.vf
    public String e() {
        return Build.MODEL;
    }

    @Override // com.p004ironsource.vf
    public boolean f() {
        return b("su");
    }

    @Override // com.p004ironsource.vf
    public boolean g(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.p004ironsource.vf
    public long h(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.p004ironsource.vf
    public String i(Context context) {
        return s(context) ? "Tablet" : "Phone";
    }

    @Override // com.p004ironsource.vf
    public String j(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.p004ironsource.vf
    public File k(Context context) {
        return context.getCacheDir();
    }

    @Override // com.p004ironsource.vf
    public int l(Context context) {
        Intent intentD = androidx.datastore.preferences.protobuf.a.d("android.intent.action.BATTERY_CHANGED", context, null);
        if (intentD != null) {
            return intentD.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.p004ironsource.vf
    public String m() {
        return "android";
    }

    @Override // com.p004ironsource.vf
    public String n(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.p004ironsource.vf
    public List<ApplicationInfo> o(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.p004ironsource.vf
    public String p(Context context) {
        xa xaVar = xa.f27681a;
        if (xaVar.b()) {
            try {
                if (!xaVar.a()) {
                    return O(context);
                }
                if (this.f24300i != null) {
                    return this.f24300i;
                }
                String strO = O(context);
                if (TextUtils.isEmpty(strO)) {
                    return strO;
                }
                this.f24300i = strO;
                return strO;
            } catch (Exception e2) {
                q9.d().a(e2);
            }
        }
        return null;
    }

    @Override // com.p004ironsource.vf
    public boolean q(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    @Override // com.p004ironsource.vf
    public boolean r() {
        return this.f;
    }

    @Override // com.p004ironsource.vf
    public boolean s(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p004ironsource.vf
    public synchronized String t(Context context) {
        if (!TextUtils.isEmpty(this.f24297c)) {
            return this.f24297c;
        }
        if (context == null) {
            return "";
        }
        String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "supersonic_shared_preferen", "auid", "");
        this.f24297c = stringFromSharedPrefs;
        if (TextUtils.isEmpty(stringFromSharedPrefs)) {
            String string = UUID.randomUUID().toString();
            this.f24297c = string;
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "supersonic_shared_preferen", "auid", string);
        }
        return this.f24297c;
    }

    @Override // com.p004ironsource.vf
    public long a(String str) {
        return a(new File(str));
    }

    @Override // com.p004ironsource.vf
    public String b(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.p004ironsource.vf
    public boolean c(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    private void b(Context context, long j2) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f24293u, f24288B, String.valueOf(j2));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.p004ironsource.vf
    public Long a(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.threshold);
    }

    private boolean b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i2 = 0; i2 < 8; i2++) {
                if (new File(strArr[i2] + str).exists()) {
                    return true;
                }
            }
        } catch (Exception e2) {
            q9.d().a(e2);
        }
        return false;
    }

    @Override // com.p004ironsource.vf
    public String a(Context context) {
        try {
            if (!xa.f27681a.a()) {
                return R(context);
            }
            if (this.f24299h != null) {
                return this.f24299h;
            }
            String strR = R(context);
            if (TextUtils.isEmpty(strR)) {
                return strR;
            }
            this.f24299h = strR;
            return strR;
        } catch (Exception e2) {
            q9.d().a(e2);
            return null;
        }
    }

    @Override // com.ironsource.vf.a
    public void a(Context context, long j2) {
        if (context != null) {
            if (!new qw(new s9.a()).a(T(context), j2)) {
                String strS = S(context);
                this.f24298e = strS;
                this.f = !strS.isEmpty();
            }
            if (this.f24298e.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.f24298e = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j2 > 0) {
                        b(context, System.currentTimeMillis());
                    }
                } catch (Exception e2) {
                    q9.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
        }
    }

    private void a(Context context, String str) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f24293u, f24287A, str);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.p004ironsource.vf
    public boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | com.p004ironsource.mediationsdk.metadata.a.f25965n) == systemUiVisibility;
    }
}
