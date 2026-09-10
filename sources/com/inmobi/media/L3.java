package com.inmobi.media;

import A.AbstractC0891g;
import A.RunnableC0895i;
import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L3 f22938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f22939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f22940c;
    public static String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3297x1 f22941e;
    public static final C3297x1 f;
    public static final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pair f22942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f22943i;
    public static final String j;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("maxDeviceVolume", L3.class, "getMaxDeviceVolume()I");
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f22939b = new KProperty[]{reflectionFactory.i(propertyReference1Impl), reflectionFactory.i(new PropertyReference1Impl("curDeviceVolume", L3.class, "getCurDeviceVolume()I"))};
        f22938a = new L3();
        f22940c = -1L;
        f22941e = new C3297x1((Integer) 15, (Function0) K3.f22916a, false, 12);
        f = new C3297x1((Integer) 15, (Function0) J3.f22897a, true, 8);
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.e(RELEASE, "RELEASE");
        g = RELEASE;
        f22942h = new Pair("d-api-lev", "" + Build.VERSION.SDK_INT);
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.e(MANUFACTURER, "MANUFACTURER");
        f22943i = MANUFACTURER;
        String MODEL = Build.MODEL;
        Intrinsics.e(MODEL, "MODEL");
        j = MODEL;
    }

    @JvmStatic
    public static final boolean G() {
        return true;
    }

    @JvmStatic
    public static final boolean I() {
        return true;
    }

    public static void K() {
        Uc.a(new RunnableC0895i(6));
    }

    public static final void L() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            f22940c = availableBytes / ((long) 1048576);
        } catch (Exception e2) {
            S5.d.a(new C3011f2(e2));
        }
    }

    public static void M() {
        Uc.a(new RunnableC0895i(5));
    }

    public static final void N() {
        UUID uuidFromString;
        Context contextD = Uc.d();
        if (contextD == null) {
            return;
        }
        Object systemService = contextD.getSystemService("storagestats");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerI = AbstractC0891g.i(systemService);
        Object systemService2 = contextD.getSystemService(com.ironsource.d9.a.k);
        Intrinsics.d(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.e(storageVolumes, "getStorageVolumes(...)");
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid = storageVolume.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                Intrinsics.c(uuidFromString);
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    Intrinsics.c(uuidFromString);
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    freeBytes += storageStatsManagerI.getFreeBytes(uuidFromString);
                } catch (Exception e2) {
                    C3011f2 c3011f2 = new C3011f2(e2);
                    S5 s5 = S5.f23167a;
                    S5.d.a(c3011f2);
                }
            }
        }
        f22940c = freeBytes / ((long) 1048576);
    }

    public static void O() {
        Uc.a(new RunnableC0895i(3));
    }

    public static final void P() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            d = "" + (blockCountLong / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Exception e2) {
            S5.d.a(new C3011f2(e2));
        }
    }

    public static void Q() {
        Uc.a(new RunnableC0895i(4));
    }

    public static final void R() {
        UUID uuidFromString;
        Context contextD = Uc.d();
        if (contextD == null) {
            return;
        }
        Object systemService = contextD.getSystemService("storagestats");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerI = AbstractC0891g.i(systemService);
        Object systemService2 = contextD.getSystemService(com.ironsource.d9.a.k);
        Intrinsics.d(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.e(storageVolumes, "getStorageVolumes(...)");
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid = storageVolume.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                Intrinsics.c(uuidFromString);
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    Intrinsics.c(uuidFromString);
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManagerI.getTotalBytes(uuidFromString);
                } catch (Exception e2) {
                    C3011f2 c3011f2 = new C3011f2(e2);
                    S5 s5 = S5.f23167a;
                    S5.d.a(c3011f2);
                }
            }
        }
        d = "" + (totalBytes / ((long) 1048576));
    }

    public static String o() {
        String string;
        Context contextD = Uc.d();
        if (contextD == null || !AbstractC3290wa.a(contextD, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = contextD.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            e2.toString();
        }
        if (activeNetworkInfo == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 28) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type != 0) {
                if (type != 1) {
                    string = String.valueOf(type);
                }
                return "1";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(type);
            sb.append('|');
            sb.append(subtype);
            string = sb.toString();
            return string;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return "";
        }
        if (!networkCapabilities.hasTransport(0)) {
            if (!networkCapabilities.hasTransport(1)) {
                if (networkCapabilities.hasTransport(2)) {
                    string = "7";
                } else if (networkCapabilities.hasTransport(3)) {
                    string = com.smartdigimkt.f3.b.j;
                } else if (networkCapabilities.hasTransport(4)) {
                    string = "17";
                } else if (networkCapabilities.hasTransport(5)) {
                    string = "10";
                } else {
                    string = networkCapabilities.hasTransport(6) ? "11" : "8";
                }
            }
            return "1";
        }
        string = "0|" + activeNetworkInfo.getSubtype();
        return string;
    }

    public static final String q() {
        int iP = f22938a.p();
        if (iP != 0) {
            return iP != 1 ? "NIL" : com.p004ironsource.z8.f27869b;
        }
        return com.p004ironsource.ne.O0;
    }

    @JvmStatic
    public static /* synthetic */ void r() {
    }

    public final boolean A() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public final boolean B() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public final boolean C() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public final boolean D() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public final boolean E() {
        return true;
    }

    public final boolean F() {
        return true;
    }

    public final boolean H() {
        return true;
    }

    public final boolean J() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final int a(Context context, boolean z2) {
        if (context == null || z2) {
            return 0;
        }
        int iIntValue = ((Number) f.getValue(this, f22939b[1])).intValue();
        int iM = m();
        if (iM <= 0) {
            return 0;
        }
        return (iIntValue * 100) / iM;
    }

    public final Pair<String, String> b() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return null;
        }
        return Settings.Global.getInt(contextD.getContentResolver(), "airplane_mode_on", 0) != 0 ? new Pair<>("d-airplane-m", "1") : new Pair<>("d-airplane-m", "0");
    }

    public final Pair<String, String> c() {
        return f22942h;
    }

    public final Pair<String, String> d() {
        if (Build.VERSION.SDK_INT >= 26) {
            M();
        } else {
            K();
        }
        long j2 = f22940c;
        if (j2 != -1) {
            return new Pair<>("d-av-disk", String.valueOf(j2));
        }
        return null;
    }

    public final long e() {
        return f22940c;
    }

    public final Pair<String, String> f() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return null;
        }
        Intent intentA = B2.a(contextD, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return new Pair<>("d-bat-chrg", (intentA != null ? intentA.getIntExtra("status", -1) : -1) == 2 ? "1" : "0");
    }

    public final Pair<String, String> g() {
        Context contextD = Uc.d();
        Integer numValueOf = null;
        if (contextD == null) {
            return null;
        }
        Intent intentA = B2.a(contextD, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentA != null) {
            numValueOf = Integer.valueOf((int) ((intentA.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intentA.getIntExtra("scale", -1)));
        }
        return new Pair<>("d-bat-lev", "" + numValueOf);
    }

    public final Pair<String, String> h() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return null;
        }
        Object systemService = contextD.getSystemService("power");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode() ? new Pair<>("d-bat-sav", "1") : new Pair<>("d-bat-sav", "0");
    }

    public final Pair<String, String> i() {
        String str;
        int i2 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i2 == 16) {
            str = "0";
        } else {
            if (i2 != 32) {
                return null;
            }
            str = "1";
        }
        return new Pair<>("d-drk-m", str);
    }

    public final Pair<String, String> j() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return null;
        }
        Object systemService = contextD.getSystemService("notification");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new Pair<>("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
        } catch (Exception unused) {
            return null;
        }
    }

    public final Pair<String, String> k() {
        ArrayList arrayList = new ArrayList();
        Context contextD = Uc.d();
        if (contextD == null) {
            return null;
        }
        Object systemService = contextD.getSystemService("input_method");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        Intrinsics.e(enabledInputMethodList, "getEnabledInputMethodList(...)");
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            Intrinsics.e(enabledInputMethodSubtypeList, "getEnabledInputMethodSubtypeList(...)");
            for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                if (Intrinsics.a(inputMethodSubtype.getMode(), "keyboard")) {
                    String languageTag = inputMethodSubtype.getLanguageTag();
                    Intrinsics.e(languageTag, "getLanguageTag(...)");
                    String language = languageTag.length() > 0 ? Locale.forLanguageTag(inputMethodSubtype.getLanguageTag()).getLanguage() : new Locale(inputMethodSubtype.getLocale()).getLanguage();
                    Intrinsics.c(language);
                    if (language.length() > 0) {
                        arrayList.add(language);
                    }
                }
            }
        }
        String string = new JSONArray((Collection) arrayList).toString();
        Intrinsics.e(string, "toString(...)");
        return new Pair<>("d-key-lang", string);
    }

    public final String l() {
        return f22943i;
    }

    public final int m() {
        return ((Number) f22941e.getValue(this, f22939b[0])).intValue();
    }

    public final String n() {
        return j;
    }

    public final int p() {
        String strO = o();
        if (StringsKt.M(strO, "0", false)) {
            return 0;
        }
        return StringsKt.M(strO, "1", false) ? 1 : 2;
    }

    public final String s() {
        return g;
    }

    public final Pair<String, String> t() {
        if (Build.VERSION.SDK_INT >= 26) {
            Q();
        } else {
            O();
        }
        String str = d;
        if (str != null) {
            return new Pair<>("d-tot-disk", str);
        }
        return null;
    }

    public final Pair<String, String> u() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return null;
        }
        Intent intentA = B2.a(contextD, (BroadcastReceiver) null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        return (intentA == null || intentA.getIntExtra("state", 0) != 1) ? new Pair<>("d-w-h", "0") : new Pair<>("d-w-h", "1");
    }

    public final void v() {
        d();
        t();
        m();
    }

    public final boolean w() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public final boolean x() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public final boolean y() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public final boolean z() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public final String a(Context context) {
        Intrinsics.f(context, "context");
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    public final Map<String, String> a(boolean z2) {
        HashMap map = new HashMap();
        try {
            map.put("os-v", g);
            String BRAND = Build.BRAND;
            Intrinsics.e(BRAND, "BRAND");
            map.put("d-brand-name", BRAND);
            map.put("d-manufacturer-name", f22943i);
            map.put("d-model-name", j);
            map.put("d-nettype-raw", o());
            String string = Locale.getDefault().toString();
            Intrinsics.e(string, "toString(...)");
            map.put("d-localization", string);
            String language = Locale.getDefault().getLanguage();
            Intrinsics.e(language, "getLanguage(...)");
            map.put("d-language", language);
            map.put("d-media-volume", String.valueOf(a(Uc.d(), z2)));
        } catch (Exception unused) {
        }
        return map;
    }

    public final I3 a() {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.freeMemory();
        return new I3(jMaxMemory, jFreeMemory, jMaxMemory - jFreeMemory);
    }
}
