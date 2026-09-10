package com.inmobi.media;

import adsuki.discernable;
import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.inmobi.media.C3342x5;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.cutely;
import kurbash.formularize;
import org.json.JSONArray;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Pair;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.saneness;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3342x5 {
    public static String d;
    public static final I1 f;
    public static final I1 g;
    public static final String h;
    public static final Pair i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static volatile boolean m;
    public static volatile long n;
    public static final taiyuan o;
    public static final taiyuan p;
    public static final taiyuan q;
    public static final JSONArray r;
    public static final /* synthetic */ formularize[] b = {polloi.cutely(new PropertyReference1Impl(C3342x5.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0)), polloi.cutely(new PropertyReference1Impl(C3342x5.class, "curDeviceVolume", "getCurDeviceVolume()I", 0))};
    public static final C3342x5 a = new C3342x5();
    public static long c = -1;
    public static final String e = C3342x5.class.getSimpleName();

    static {
        int i2 = 15;
        f = new I1(i2, new Function0() { // from class: adsuki.hobby
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C3342x5.A());
            }
        }, 12);
        g = new I1(i2, new Function0() { // from class: adsuki.horsehair
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C3342x5.b());
            }
        }, 8);
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        h = RELEASE;
        int i3 = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        i = new Pair("d-api-lev", sb.toString());
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        j = MANUFACTURER;
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        k = MODEL;
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        l = HARDWARE;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = saneness.attabal(lazyThreadSafetyMode, new Function0() { // from class: adsuki.ascolichen
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3342x5.B();
            }
        });
        p = saneness.attabal(lazyThreadSafetyMode, new Function0() { // from class: adsuki.larchwood
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C3342x5.c());
            }
        });
        taiyuan taiyuanVarAttabal = saneness.attabal(lazyThreadSafetyMode, new Function0() { // from class: adsuki.supersedeas
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3342x5.a();
            }
        });
        q = taiyuanVarAttabal;
        r = (JSONArray) taiyuanVarAttabal.getValue();
    }

    public static final int A() {
        Context context = Ji.a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    public static final C3292v5 B() {
        boolean z;
        String str;
        a.getClass();
        try {
            Context context = Ji.a;
            if (context == null) {
                return new C3292v5(null, false);
            }
            PackageManager packageManager = context.getPackageManager();
            try {
                z = packageManager.getApplicationEnabledSetting("com.android.vending") >= 2;
            } catch (Exception unused) {
            }
            try {
                str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
                if (str == null) {
                    str = "";
                }
            } catch (Exception unused2) {
                str = null;
            }
            return new C3292v5(str, z);
        } catch (Exception e2) {
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e2));
            return new C3292v5(null, false);
        }
    }

    public static void C() {
        Runnable runnable = new Runnable() { // from class: adsuki.lemberg
            @Override // java.lang.Runnable
            public final void run() {
                C3342x5.D();
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }

    public static final void D() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            c = availableBytes / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        } catch (Exception e2) {
            AbstractC2973i9.a(e2);
        }
    }

    public static void E() {
        Runnable runnable = new Runnable() { // from class: adsuki.invest
            @Override // java.lang.Runnable
            public final void run() {
                C3342x5.F();
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }

    public static final void F() {
        Context context = Ji.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerAttabal = discernable.attabal(systemService);
        Object systemService2 = context.getSystemService(com.ironsource.X3.a.k);
        Intrinsics.competently(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            try {
                UUID uuidFromString = UUID.fromString(String.valueOf(storageVolume.getUuid()));
                Intrinsics.beachfront(uuidFromString);
                if (storageVolume.getState().equals("mounted")) {
                    try {
                        freeBytes += storageStatsManagerAttabal.getFreeBytes(uuidFromString);
                    } catch (Exception e2) {
                        L2 l2 = new L2(e2);
                        taiyuan taiyuanVar = P9.a;
                        P9.a(l2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        c = freeBytes / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    public static void G() {
        Runnable runnable = new Runnable() { // from class: adsuki.ebullioscopic
            @Override // java.lang.Runnable
            public final void run() {
                C3342x5.H();
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }

    public static final void H() {
        Context context = Ji.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerAttabal = discernable.attabal(systemService);
        Object systemService2 = context.getSystemService(com.ironsource.X3.a.k);
        Intrinsics.competently(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    freeBytes += storageStatsManagerAttabal.getFreeBytes(storageUuid);
                } catch (Exception e2) {
                    L2 l2 = new L2(e2);
                    taiyuan taiyuanVar = P9.a;
                    P9.a(l2);
                }
            }
        }
        c = freeBytes / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    public static void I() {
        Runnable runnable = new Runnable() { // from class: adsuki.astronautic
            @Override // java.lang.Runnable
            public final void run() {
                C3342x5.J();
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }

    public static final void J() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(blockCountLong / 1048576);
            d = sb.toString();
        } catch (Exception e2) {
            AbstractC2973i9.a(e2);
        }
    }

    public static void K() {
        Runnable runnable = new Runnable() { // from class: adsuki.extensively
            @Override // java.lang.Runnable
            public final void run() {
                C3342x5.L();
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }

    public static final void L() {
        UUID uuidFromString;
        Context context = Ji.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerAttabal = discernable.attabal(systemService);
        Object systemService2 = context.getSystemService(com.ironsource.X3.a.k);
        Intrinsics.competently(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid = storageVolume.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                Intrinsics.beachfront(uuidFromString);
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    Intrinsics.beachfront(uuidFromString);
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManagerAttabal.getTotalBytes(uuidFromString);
                } catch (Exception e2) {
                    L2 l2 = new L2(e2);
                    taiyuan taiyuanVar = P9.a;
                    P9.a(l2);
                }
            }
        }
        long j2 = totalBytes / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        d = sb.toString();
    }

    public static void M() {
        Runnable runnable = new Runnable() { // from class: adsuki.affiche
            @Override // java.lang.Runnable
            public final void run() {
                C3342x5.N();
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }

    public static final void N() {
        Context context = Ji.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerAttabal = discernable.attabal(systemService);
        Object systemService2 = context.getSystemService(com.ironsource.X3.a.k);
        Intrinsics.competently(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManagerAttabal.getTotalBytes(storageUuid);
                } catch (Exception e2) {
                    L2 l2 = new L2(e2);
                    taiyuan taiyuanVar = P9.a;
                    P9.a(l2);
                }
            }
        }
        long j2 = totalBytes / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        d = sb.toString();
    }

    public static final int b() {
        Context context = Ji.a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 15;
    }

    public static final boolean c() {
        a.getClass();
        try {
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = FINGERPRINT.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase2 = MODEL.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase3 = MANUFACTURER.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase4 = BRAND.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase5 = DEVICE.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
            String HARDWARE = Build.HARDWARE;
            Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase6 = HARDWARE.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
            String PRODUCT = Build.PRODUCT;
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase7 = PRODUCT.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
            if (dovishness.starveling(lowerCase, "generic", false, 2, null) || dovishness.starveling(lowerCase, "unknown", false, 2, null) || StringsKt.overspeculate(lowerCase2, "google_sdk", false, 2, null) || StringsKt.overspeculate(lowerCase2, "emu", false, 2, null) || StringsKt.overspeculate(lowerCase2, "Android SDK built for x86", false, 2, null) || StringsKt.overspeculate(lowerCase3, "Genymotion", false, 2, null) || StringsKt.overspeculate(lowerCase7, "sdk", false, 2, null) || StringsKt.overspeculate(lowerCase7, "vbox86p", false, 2, null) || StringsKt.overspeculate(lowerCase7, "emu", false, 2, null) || Intrinsics.wireman(lowerCase6, "goldfish") || Intrinsics.wireman(lowerCase6, "ranchu") || Intrinsics.wireman(lowerCase6, "vbox86p") || StringsKt.overspeculate(lowerCase6, "nox", false, 2, null)) {
                return true;
            }
            return dovishness.starveling(lowerCase4, "generic", false, 2, null) && dovishness.starveling(lowerCase5, "generic", false, 2, null);
        } catch (Exception unused) {
            return false;
        }
    }

    public static Pair d() {
        Context context = Ji.a;
        if (context == null) {
            return null;
        }
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? new Pair("d-airplane-m", "1") : new Pair("d-airplane-m", "0");
    }

    public static Pair e() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            G();
        } else if (i2 >= 26) {
            E();
        } else {
            C();
        }
        long j2 = c;
        if (j2 != -1) {
            return new Pair("d-av-disk", String.valueOf(j2));
        }
        return null;
    }

    public static Pair f() {
        Context context = Ji.a;
        Integer numValueOf = null;
        if (context == null) {
            return null;
        }
        Intent intentA = F3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentA != null) {
            numValueOf = Integer.valueOf((int) ((intentA.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intentA.getIntExtra("scale", -1)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(numValueOf);
        return new Pair("d-bat-lev", sb.toString());
    }

    public static Pair g() {
        Context context = Ji.a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("power");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode() ? new Pair("d-bat-sav", "1") : new Pair("d-bat-sav", "0");
    }

    public static Pair h() {
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
        return new Pair("d-drk-m", str);
    }

    public static Pair i() {
        Context context = Ji.a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new Pair("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Pair j() {
        ArrayList arrayList = new ArrayList();
        Context context = Ji.a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("input_method");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        Intrinsics.checkNotNullExpressionValue(enabledInputMethodList, "getEnabledInputMethodList(...)");
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            Intrinsics.checkNotNullExpressionValue(enabledInputMethodSubtypeList, "getEnabledInputMethodSubtypeList(...)");
            for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                if (Intrinsics.wireman(inputMethodSubtype.getMode(), "keyboard")) {
                    String languageTag = inputMethodSubtype.getLanguageTag();
                    Intrinsics.checkNotNullExpressionValue(languageTag, "getLanguageTag(...)");
                    String language = languageTag.length() > 0 ? Locale.forLanguageTag(inputMethodSubtype.getLanguageTag()).getLanguage() : new Locale(inputMethodSubtype.getLocale()).getLanguage();
                    Intrinsics.beachfront(language);
                    if (language.length() > 0) {
                        arrayList.add(language);
                    }
                }
            }
        }
        return new Pair("d-key-lang", new JSONArray((Collection) arrayList).toString());
    }

    public static String k() {
        String strValueOf;
        Context context = Ji.a;
        if (context == null || !Kf.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue(C3342x5.class.getSimpleName(), "getSimpleName(...)");
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
                    strValueOf = String.valueOf(type);
                }
                return "1";
            }
            strValueOf = type + "|" + subtype;
            return strValueOf;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return "";
        }
        if (!networkCapabilities.hasTransport(0)) {
            if (!networkCapabilities.hasTransport(1)) {
                if (networkCapabilities.hasTransport(2)) {
                    strValueOf = com.ironsource.Bc.e;
                } else if (networkCapabilities.hasTransport(3)) {
                    strValueOf = "9";
                } else if (networkCapabilities.hasTransport(4)) {
                    strValueOf = "17";
                } else if (networkCapabilities.hasTransport(5)) {
                    strValueOf = "10";
                } else {
                    strValueOf = networkCapabilities.hasTransport(6) ? "11" : "8";
                }
            }
            return "1";
        }
        strValueOf = "0|" + activeNetworkInfo.getSubtype();
        return strValueOf;
    }

    public static int l() {
        String strK = k();
        if (dovishness.starveling(strK, "0", false, 2, null)) {
            return 0;
        }
        return dovishness.starveling(strK, "1", false, 2, null) ? 1 : 2;
    }

    public static final String m() {
        a.getClass();
        int iL = l();
        if (iL != 0) {
            return iL != 1 ? "NIL" : com.ironsource.T3.b;
        }
        return com.ironsource.L6.Q0;
    }

    public static HashMap n() {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        boolean enabled = ((SignalsConfig) Y3.a.a(SignalsConfig.class)).getBts().getEnabled();
        HashMap map = new HashMap();
        try {
            if (enabled) {
                map.put("d-t1", r.toString());
                return map;
            }
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return map;
        } catch (Exception unused) {
        }
    }

    public static Pair o() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            M();
        } else if (i2 >= 26) {
            K();
        } else {
            I();
        }
        String str = d;
        if (str != null) {
            return new Pair("d-tot-disk", str);
        }
        return null;
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean q() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static boolean u() {
        return true;
    }

    public static boolean v() {
        return true;
    }

    public static boolean w() {
        return true;
    }

    public static boolean x() {
        return true;
    }

    public static boolean y() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean z() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public final int a(Context context, boolean z) {
        if (context == null || z) {
            return 0;
        }
        I1 i1 = g;
        formularize[] formularizeVarArr = b;
        int iIntValue = ((Number) i1.getValue(this, formularizeVarArr[1])).intValue();
        int iIntValue2 = ((Number) f.getValue(this, formularizeVarArr[0])).intValue();
        if (iIntValue2 > 0) {
            return (iIntValue * 100) / iIntValue2;
        }
        Intrinsics.checkNotNullExpressionValue(C3342x5.class.getSimpleName(), "getSimpleName(...)");
        return 0;
    }

    public final HashMap b(boolean z) {
        int iAvailableProcessors;
        HashMap map = new HashMap();
        map.put("os-v", h);
        map.put("d-brand-name", Build.BRAND);
        map.put("d-manufacturer-name", j);
        map.put("d-model-name", k);
        map.put("d-nettype-raw", k());
        String string = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        map.put("d-localization", string);
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        map.put("d-language", language);
        map.put("d-devicemachinehw", l);
        if (System.currentTimeMillis() >= n) {
            C2968i4 c2968i4 = Y3.a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            SignalsConfig signalsConfig = (SignalsConfig) Y3.a.a(SignalsConfig.class);
            n = (((long) signalsConfig.getLowMemoryFreq()) * 1000) + System.currentTimeMillis();
            cutely.wireman(A9.c, null, null, new C3317w5(null), 3, null);
        }
        map.put("d-lowmem", String.valueOf(m));
        try {
            iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        } catch (Exception e2) {
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e2);
            iAvailableProcessors = 0;
        }
        map.put("d-pcount", String.valueOf(iAvailableProcessors));
        map.put("d-emu", String.valueOf(((Boolean) p.getValue()).booleanValue()));
        taiyuan taiyuanVar2 = o;
        map.put("d-ps-disabled", String.valueOf(((C3292v5) taiyuanVar2.getValue()).a));
        String str = ((C3292v5) taiyuanVar2.getValue()).b;
        if (str == null) {
            str = "N/A";
        }
        map.put("d-ps-v", str);
        map.put("d-media-volume", String.valueOf(a(Ji.a, z)));
        return map;
    }

    public final HashMap a(boolean z) {
        HashMap map = new HashMap();
        try {
            map.putAll(b(z));
            map.putAll(n());
            return map;
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue(C3342x5.class.getSimpleName(), "getSimpleName(...)");
            e2.getMessage();
            return map;
        }
    }

    public static final JSONArray a() {
        a.getClass();
        Context context = Ji.a;
        if (context != null) {
            try {
                C2968i4 c2968i4 = Y3.a;
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                SignalsConfig signalsConfig = (SignalsConfig) Y3.a.a(SignalsConfig.class);
                ConcurrentHashMap concurrentHashMap = Ea.b;
                Ea eaA = Da.a(context, "boot_time");
                Intrinsics.checkNotNullParameter("bt", com.ironsource.X3.i.W);
                JSONArray jSONArray = new JSONArray(eaA.a.getString("bt", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                Long lValueOf = jSONArray.length() > 0 ? Long.valueOf(jSONArray.optLong(jSONArray.length() - 1, 0L)) : null;
                if (lValueOf != null) {
                    if (Math.abs(lValueOf.longValue() - jCurrentTimeMillis) <= ((long) signalsConfig.getBts().getThreshold()) * 1000) {
                        return jSONArray;
                    }
                }
                jSONArray.put(jCurrentTimeMillis);
                while (jSONArray.length() > 0 && jSONArray.length() > signalsConfig.getBts().getMaxEntries()) {
                    jSONArray.remove(0);
                }
                eaA.a("bt", jSONArray.toString(), true);
                return jSONArray;
            } catch (Exception e2) {
                taiyuan taiyuanVar = P9.a;
                AbstractC2973i9.a(e2);
            }
        }
        return new JSONArray();
    }
}
