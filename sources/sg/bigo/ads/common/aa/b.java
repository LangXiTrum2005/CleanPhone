package sg.bigo.ads.common.aa;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.p004ironsource.d9;
import com.p004ironsource.x4;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.d.e;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f47097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<a> f47098b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f47099c = false;
    private static String d = x4.DISABLED_AUCTION_FALLBACK_ID;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f47100e = x4.DISABLED_AUCTION_FALLBACK_ID;
    private static int f = 0;
    private static final AtomicBoolean g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f47101h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static sg.bigo.ads.common.b f47102i = new sg.bigo.ads.common.b();
    private static boolean j = false;
    private static BroadcastReceiver k = new BroadcastReceiver() { // from class: sg.bigo.ads.common.aa.b.3
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (b.f47101h <= 0 || System.currentTimeMillis() - b.f47101h >= r.f47535a.a(10)) {
                long unused = b.f47101h = System.currentTimeMillis();
                if (intent != null) {
                    b.f47102i.f47111a = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                    b.f47102i.f47112b = intent.getIntExtra("scale", -1);
                    b.f47102i.f47113c = intent.getIntExtra("status", -1);
                }
            }
        }
    };

    public interface a {
        void a(int i2);
    }

    public static String c(Context context) {
        Resources resources;
        Locale locale;
        return (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) ? "zz" : locale.getCountry();
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        if (x4.DISABLED_AUCTION_FALLBACK_ID.equals(d)) {
            d = "";
            if (!sg.bigo.ads.common.utils.c.a(context, "android.permission.READ_PHONE_STATE")) {
                return d;
            }
            try {
                d = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
            } catch (Exception unused) {
            }
        }
        return d;
    }

    public static String f(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            return !TextUtils.isEmpty(defaultUserAgent) ? defaultUserAgent.substring(defaultUserAgent.indexOf("Chrome/") + 7, defaultUserAgent.indexOf("Mobile")).trim() : defaultUserAgent;
        } catch (Exception unused2) {
            return str;
        }
    }

    public static void j(Context context) {
        BroadcastReceiver broadcastReceiver;
        if (context == null || (broadcastReceiver = k) == null || !j) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        k = null;
        j = false;
    }

    private static boolean k() {
        for (String str : System.getenv(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH).split(":")) {
            File file = new File(str);
            if (file.isDirectory() && new File(file, "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static int l(Context context) {
        int i2 = 4;
        if (context == null) {
            return 4;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager.isActiveNetworkMetered()) {
            int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
            i2 = 3;
            if (restrictBackgroundStatus != 1) {
                if (restrictBackgroundStatus != 2) {
                    return restrictBackgroundStatus != 3 ? 0 : 1;
                }
                return 2;
            }
        }
        return i2;
    }

    public static float m(Context context) {
        if (context == null) {
            return 0.0f;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
            }
        } catch (Exception e2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getVolume exception: " + e2.getMessage());
        }
        return 0.0f;
    }

    public static boolean n(Context context) {
        if (context == null) {
            return false;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            return accessibilityManager != null && accessibilityManager.isEnabled();
        } catch (Exception e2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "isAccessibilityServiceEnabled exception: " + e2.getMessage());
            return false;
        }
    }

    public static int o(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getRingerMode();
            }
        } catch (Exception e2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getNotificationMode exception: " + e2.getMessage());
        }
        return 0;
    }

    public static float p(Context context) {
        if (context == null) {
            return 1.0f;
        }
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.fontScale;
            }
        } catch (Exception e2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getFontScale exception: " + e2.getMessage());
        }
        return 1.0f;
    }

    public static int q(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            int i2 = context.getResources().getDisplayMetrics().densityDpi;
            int i3 = DisplayMetrics.DENSITY_DEVICE_STABLE;
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 0 : 2;
        } catch (Exception e2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getDisplayScale exception: " + e2.getMessage());
            return -1;
        }
    }

    public static int r(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            int i2 = context.getResources().getConfiguration().uiMode & 48;
            if (i2 != 16) {
                return i2 != 32 ? 0 : 2;
            }
            return 1;
        } catch (Exception e2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getThemeMode exception: " + e2.getMessage());
            return 0;
        }
    }

    public static int s(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getTargetSdkVersion exception: " + th.getMessage());
            return 0;
        }
    }

    public static int t(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getMinSdkVersion exception: " + th.getMessage());
            return 0;
        }
    }

    public static boolean u(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (Throwable unused) {
            sg.bigo.ads.common.t.a.b("DeviceUtil", "Unexpected exception from Play services lib.");
            return false;
        }
    }

    public static long v(Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            return new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir).length();
        } catch (Throwable th) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getApkSize exception: " + th.getMessage());
            return 0L;
        }
    }

    public static boolean w(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            return true;
        } catch (Throwable th) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "isUnityEnvironment exception: " + th.getMessage());
            return false;
        }
    }

    public static int a(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i2 = activity.getResources().getConfiguration().orientation;
        if (1 == i2) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        }
        if (2 == i2) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "Unknown orientation. return portrait by default");
        return 9;
    }

    public static String b(Context context) {
        Resources resources;
        Locale locale;
        if (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) {
            return Locale.US.getLanguage();
        }
        String language = locale.getLanguage();
        if (language.equals("iw")) {
            return "he";
        }
        if (language.equals(ScarConstants.IN_SIGNAL_KEY)) {
            return "id";
        }
        return language.equals("ji") ? "yi" : language;
    }

    public static boolean c() {
        try {
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su"};
            for (int i2 = 0; i2 < 6; i2++) {
                if (!new File(strArr[i2]).exists()) {
                }
            }
            String str = Build.TAGS;
            return (str != null && str.contains("test-keys")) || k();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean d() {
        return true;
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        if (x4.DISABLED_AUCTION_FALLBACK_ID.equals(f47100e)) {
            f47100e = "";
            if (!sg.bigo.ads.common.utils.c.a(context, "android.permission.READ_PHONE_STATE")) {
                return f47100e;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                f47100e = networkCountryIso;
                if (TextUtils.isEmpty(networkCountryIso)) {
                    f47100e = telephonyManager.getSimCountryIso();
                }
            } catch (Exception unused) {
            }
        }
        return f47100e;
    }

    public static void g(Context context) {
        if (g.getAndSet(true) || context == null || !j()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "Register display listener");
        final DisplayManager displayManager = (DisplayManager) context.getSystemService(d9.h.d);
        displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: sg.bigo.ads.common.aa.b.2
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int i2) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int i2) {
                if (i2 == 0) {
                    try {
                        int unused = b.f = displayManager.getDisplay(i2).getState();
                    } catch (Throwable unused2) {
                    }
                }
                StringBuilder sbU = android.support.v4.media.a.u(i2, "onDisplayChanged: ", ", sDefaultDisplayState: ");
                sbU.append(b.f);
                sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", sbU.toString());
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int i2) {
            }
        }, null);
    }

    public static sg.bigo.ads.common.b h(Context context) {
        if (!j) {
            i(context);
        }
        return f47102i;
    }

    public static void i(Context context) {
        if (context == null || j) {
            return;
        }
        context.registerReceiver(k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        j = true;
    }

    private static boolean j() {
        return true;
    }

    public static boolean k(Context context) {
        PowerManager powerManager;
        return (context == null || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isPowerSaveMode()) ? false : true;
    }

    public static boolean b() {
        return j() && f == 1;
    }

    public static void a() {
        d = x4.DISABLED_AUCTION_FALLBACK_ID;
        f47100e = x4.DISABLED_AUCTION_FALLBACK_ID;
    }

    public static synchronized void a(Context context, a aVar) {
        if (context != null) {
            try {
                List<a> list = f47098b;
                if (!list.contains(aVar)) {
                    list.add(aVar);
                }
                if (!f47099c) {
                    f47099c = true;
                    sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "registerScreenListener");
                    sg.bigo.ads.common.d.a.a().a(context, new e() { // from class: sg.bigo.ads.common.aa.b.1
                        /* JADX WARN: Code duplicated, block: B:15:0x0041  */
                        /* JADX WARN: Code duplicated, block: B:18:0x004f A[LOOP:0: B:16:0x0049->B:18:0x004f, LOOP_END] */
                        /* JADX WARN: Code duplicated, block: B:19:0x005d A[ORIG_RETURN, RETURN] */
                        @Override // sg.bigo.ads.common.d.b
                        public final void a(Context context2, Intent intent) {
                            Iterator it;
                            int i2;
                            String action = intent.getAction();
                            if (q.a((CharSequence) action)) {
                                return;
                            }
                            int i3 = b.f47097a;
                            sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "action = ".concat(String.valueOf(action)));
                            action.getClass();
                            if (!action.equals("android.intent.action.SCREEN_OFF")) {
                                i2 = action.equals("android.intent.action.USER_PRESENT") ? 1 : 2;
                                if (i3 != b.f47097a) {
                                    it = b.f47098b.iterator();
                                    while (it.hasNext()) {
                                        ((a) it.next()).a(b.f47097a);
                                    }
                                }
                            }
                            int unused = b.f47097a = i2;
                            if (i3 != b.f47097a) {
                                it = b.f47098b.iterator();
                                while (it.hasNext()) {
                                    ((a) it.next()).a(b.f47097a);
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (f47097a == 0) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            f47097a = (powerManager == null || powerManager.isScreenOn()) ? 1 : 2;
        }
        return f47097a == 1;
    }
}
