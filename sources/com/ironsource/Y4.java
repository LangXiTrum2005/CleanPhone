package com.ironsource;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Y4 implements InterfaceC0674y7, InterfaceC0674y7.a {
    private static final String A = "browser_user_agent";
    private static final String B = "browser_user_agent_time";
    private static final String C = "IABTCF_gdprApplies";
    private static final String D = "IABTCF_TCString";
    private static final String E = "IABTCF_AddtlConsent";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f27968j = "android";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f27969k = "com.google.android.gms.permission.AD_ID";
    private static final String l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f27970m = "com.google.android.gms.appset.AppSet";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f27971n = "com.google.android.gms.tasks.OnSuccessListener";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f27972o = "getAdvertisingIdInfo";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f27973p = "getClient";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f27974q = "getAppSetIdInfo";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f27975r = "addOnSuccessListener";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f27976s = "getId";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f27977t = "isLimitAdTrackingEnabled";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f27978u = "Mediation_Shared_Preferences";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f27979v = "supersonic_shared_preferen";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f27980w = "cachedUUID";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f27981x = "auid";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f27982y = "unityads-installinfo";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f27983z = "unityads-idfi";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27984b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27985c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f27986d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f27987e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27988f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f27989g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f27990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile String f27991i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements InvocationHandler {
        public a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                        String string = obj2.getClass().getMethod(Y4.f27976s, null).invoke(objArr[0], null).toString();
                        if (!TextUtils.isEmpty(string)) {
                            Y4.this.f27989g = string;
                            return null;
                        }
                    }
                } catch (Exception e10) {
                    C0474n4.d().a(e10);
                }
            }
            return null;
        }
    }

    private String N(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objP = P(context);
        return objP.getClass().getMethod(f27976s, null).invoke(objP, null).toString();
    }

    private void O(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objInvoke = AppSet.class.getMethod(f27973p, Context.class).invoke(AppSet.class, context);
        Object objInvoke2 = objInvoke.getClass().getMethod(f27974q, null).invoke(objInvoke, null);
        objInvoke2.getClass().getMethod(f27975r, OnSuccessListener.class).invoke(objInvoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new a()));
    }

    private Object P(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return AdvertisingIdClient.class.getMethod(f27972o, Context.class).invoke(AdvertisingIdClient.class, context);
    }

    private String Q(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objP = P(context);
        return String.valueOf(((Boolean) objP.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objP, null)).booleanValue());
    }

    private String R(Context context) {
        try {
            return C0319ea.a(context, f27978u, A, "");
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    private long S(Context context) {
        try {
            return Long.parseLong(C0319ea.a(context, f27978u, B, String.valueOf(-1L)));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1L;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int A(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String B(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.InterfaceC0674y7
    public File C(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.InterfaceC0674y7
    public boolean D(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int E(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public float F(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String G(Context context) {
        try {
            return C0319ea.a(context, E, (String) null);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String H(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String I(Context context) {
        V4 v4 = V4.f27346a;
        if (v4.b()) {
            try {
                if (!v4.a()) {
                    return N(context);
                }
                if (this.f27991i != null) {
                    return this.f27991i;
                }
                String strN = N(context);
                if (TextUtils.isEmpty(strN)) {
                    return strN;
                }
                this.f27991i = strN;
                return strN;
            } catch (Exception e10) {
                C0474n4.d().a(e10);
            }
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public boolean J(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int K(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String L(Context context) {
        try {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (resolveInfoResolveActivity != null) {
                return resolveInfoResolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int M(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public boolean b(Context context) {
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

    @Override // com.ironsource.InterfaceC0674y7
    public Long c(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String d() {
        String id2 = TimeZone.getDefault().getID();
        return id2 != null ? id2 : "";
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int e() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public boolean f(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public File g(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.InterfaceC0674y7
    public long h() {
        return a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.InterfaceC0674y7
    public boolean i(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public boolean j() {
        try {
            return "mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable();
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String l() {
        return Build.MODEL;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int m() {
        return -(TimeZone.getDefault().getOffset(a()) / 60000);
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String n(Context context) {
        if (context == null) {
            return "";
        }
        int iM = M(context);
        if (iM == 0) {
            return X3.i.C;
        }
        if (iM == 1) {
            return X3.i.D;
        }
        if (iM == 11) {
            return X3.i.C;
        }
        if (iM == 12) {
            return X3.i.D;
        }
        switch (iM) {
            case 6:
            case 8:
                return X3.i.C;
            case 7:
            case 9:
                return X3.i.D;
            default:
                return "none";
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public ActivityManager.MemoryInfo o(Context context) {
        if (context == null || !Kb.Y().h().d()) {
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

    @Override // com.ironsource.InterfaceC0674y7
    public boolean p() {
        return b("su");
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String q() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public long r(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String s(Context context) {
        return b(context) ? "Tablet" : "Phone";
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String t() {
        try {
            return System.getProperty("os.arch");
        } catch (SecurityException e10) {
            IronLog.INTERNAL.error(e10.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int u(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String v(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String w(Context context) {
        try {
            return C0319ea.a(context, "IABTCF_TCString", (String) null);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public boolean x(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String y(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String z(Context context) {
        if (!V4.f27346a.c()) {
            return "";
        }
        try {
            O(context);
            return !TextUtils.isEmpty(this.f27989g) ? this.f27989g : "";
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public long a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int c() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public synchronized String e(Context context) {
        if (!TextUtils.isEmpty(this.f27985c)) {
            return this.f27985c;
        }
        if (context == null) {
            return "";
        }
        String strA = C0319ea.a(context, "supersonic_shared_preferen", "auid", "");
        this.f27985c = strA;
        if (TextUtils.isEmpty(strA)) {
            String string = UUID.randomUUID().toString();
            this.f27985c = string;
            C0319ea.b(context, "supersonic_shared_preferen", "auid", string);
        }
        return this.f27985c;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public long g() {
        if (j()) {
            return a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int l(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public File m(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int p(Context context) {
        int iK = K(context);
        int iA = A(context);
        return (((iK == 0 || iK == 2) && iA == 2) || ((iK == 1 || iK == 3) && iA == 1)) ? 2 : 1;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public boolean q(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String d(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.InterfaceC0674y7
    public boolean h(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(f27969k)) {
                    return true;
                }
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public File k(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int t(Context context) {
        try {
            return C0319ea.a(context, C, -1);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return -1;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String c(Context context) {
        try {
            if (V4.f27346a.a()) {
                if (this.f27990h == null) {
                    String strQ = Q(context);
                    if (TextUtils.isEmpty(strQ)) {
                        return strQ;
                    }
                    this.f27990h = strQ;
                    return strQ;
                }
                return this.f27990h;
            }
            return Q(context);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String f() {
        return "android";
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String s() {
        try {
            if (this.f27987e.isEmpty()) {
                return R(ContextProvider.getInstance().getApplicationContext());
            }
            return this.f27987e;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return "";
        }
    }

    private long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public Boolean b(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String i() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int o() {
        return k();
    }

    @Override // com.ironsource.InterfaceC0674y7
    public float r() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    private boolean b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10] + str).exists()) {
                    return true;
                }
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public String j(Context context) {
        if (!TextUtils.isEmpty(this.f27986d)) {
            return this.f27986d;
        }
        if (context == null) {
            return null;
        }
        String strA = C0319ea.a(context, "unityads-installinfo", "unityads-idfi", (String) null);
        this.f27986d = strA;
        return strA;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public boolean n() {
        return this.f27988f;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public Long a(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.threshold);
    }

    @Override // com.ironsource.InterfaceC0674y7
    public long a(String str) {
        return a(new File(str));
    }

    @Override // com.ironsource.InterfaceC0674y7
    public boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | com.ironsource.mediationsdk.metadata.a.f29616n) == systemUiVisibility;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public synchronized String a(Context context) {
        if (!TextUtils.isEmpty(this.f27984b)) {
            return this.f27984b;
        }
        if (C0319ea.a(context, f27978u, InterfaceC0674y7.f31293a, true)) {
            String strA = C0319ea.a(context, f27978u, f27980w, "");
            if (TextUtils.isEmpty(strA)) {
                String string = UUID.randomUUID().toString();
                this.f27984b = string;
                C0319ea.b(context, f27978u, f27980w, string);
            } else {
                this.f27984b = strA;
            }
        }
        return this.f27984b;
    }

    @Override // com.ironsource.InterfaceC0674y7
    public int b() {
        return c();
    }

    private void b(Context context, long j10) {
        try {
            C0319ea.b(context, f27978u, B, String.valueOf(j10));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC0674y7.a
    public void a(Context context, long j10) {
        if (context != null) {
            if (!new C0629vg(new InterfaceC0510p4.a()).a(S(context), j10)) {
                String strR = R(context);
                this.f27987e = strR;
                this.f27988f = !strR.isEmpty();
            }
            if (this.f27987e.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.f27987e = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j10 > 0) {
                        b(context, System.currentTimeMillis());
                    }
                } catch (Exception e10) {
                    C0474n4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
    }

    private void a(Context context, String str) {
        try {
            C0319ea.b(context, f27978u, A, str);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
