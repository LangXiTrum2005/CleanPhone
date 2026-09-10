package com.p004ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.a;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.p004ironsource.mediationsdk.config.ConfigFile;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public class le implements Runnable {
    public static final String M = "sdkVersion";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f25580N = "AdvIdOptOutReason";
    private static final int O = 15;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final int f25581P = 840;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final int f25582Q = -720;
    private Context K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25589a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25590b = "bundleId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25591c = "advertisingId";
    private final String d = d9.i.M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25592e = "appKey";
    private final String f = "deviceOS";
    private final String g = "osVersion";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25593h = d9.i.t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f25594i = d9.i.f24758u;
    private final String j = "language";
    private final String k = d9.i.k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f25595l = d9.i.f24755l;
    private final String m = d9.i.r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f25596n = "externalFreeMemory";
    private final String o = "internalFreeMemory";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f25597p = "battery";
    private final String q = "gmtMinutesOffset";
    private final String r = d9.i.W;
    private final String s = JsonStorageKeyNames.SESSION_ID_KEY;
    private final String t = "pluginType";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f25598u = "pluginVersion";
    private final String v = "plugin_fw_v";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f25599w = "jb";
    private final String x = "advertisingIdType";
    private final String y = ne.Y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f25600z = "firstSession";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final String f25583A = "mcc";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final String f25584B = "mnc";
    private final String C = "icc";
    private final String D = "tz";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final String f25585E = "auid";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final String f25586F = "userLat";
    private final String G = "publisherAPI";
    private final String H = "missingDependencies";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final String f25587I = "missingManifest";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final String f25588J = x4.DEFAULT_AUCTION_FALLBACK_VALUE;
    private final vf L = on.U().f();

    private le() {
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "missingDependencies";
        }
        if (!xa.f27681a.b()) {
            return "publisherAPI";
        }
        if (this.L.v(this.K)) {
            return Boolean.parseBoolean(str) ? "userLat" : x4.DEFAULT_AUCTION_FALLBACK_VALUE;
        }
        return "missingManifest";
    }

    private String b() {
        try {
            String str = Build.VERSION.RELEASE;
            return "" + Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (Exception e2) {
            q9.d().a(e2);
            return "";
        }
    }

    private String c() {
        return p.j().k();
    }

    private int d() {
        try {
            Intent intentRegisterReceiver = this.K.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, a.r(new StringBuilder(), this.f25589a, ":getBatteryLevel()"), e2);
        }
        return -1;
    }

    private String e() {
        try {
            return this.K.getPackageName();
        } catch (Exception e2) {
            q9.d().a(e2);
            return "";
        }
    }

    private String f() {
        try {
            return Build.MODEL;
        } catch (Exception e2) {
            q9.d().a(e2);
            return "";
        }
    }

    private String g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception e2) {
            q9.d().a(e2);
            return "";
        }
    }

    private String h() {
        return d9.d;
    }

    private long i() {
        if (!s()) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private int j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, a.r(new StringBuilder(), this.f25589a, ":getGmtMinutesOffset()"), e2);
            return 0;
        }
    }

    private long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception e2) {
            q9.d().a(e2);
            return -1L;
        }
    }

    private String l() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e2) {
            q9.d().a(e2);
            return "";
        }
    }

    private String m() {
        return p.j().n();
    }

    private String n() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.K.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!networkOperatorName.equals("")) {
                    return networkOperatorName;
                }
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, a.r(new StringBuilder(), this.f25589a, ":getMobileCarrier()"), e2);
        }
        return "";
    }

    private String o() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e2);
            return "";
        }
    }

    private String p() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e2);
            return "";
        }
    }

    private String q() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e2);
            return "";
        }
    }

    private String r() {
        return LevelPlay.getSdkVersion();
    }

    private boolean s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e2) {
            q9.d().a(e2);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ke.a().a(a());
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = ".concat(getClass().getSimpleName()), e2);
        }
    }

    public le(Context context) {
        this.K = context.getApplicationContext();
    }

    private Map<String, Object> a() {
        boolean z2;
        String str;
        HashMap map = new HashMap();
        map.put(JsonStorageKeyNames.SESSION_ID_KEY, IronSourceUtils.getSessionId());
        String strE = e();
        if (!TextUtils.isEmpty(strE)) {
            map.put("bundleId", strE);
            String strB = b4.b(this.K, strE);
            if (!TextUtils.isEmpty(strB)) {
                map.put(d9.i.W, strB);
            }
        }
        map.put("appKey", c());
        String strP = this.L.p(this.K);
        String strA = this.L.a(this.K);
        boolean z3 = false;
        if (TextUtils.isEmpty(strP)) {
            strP = this.L.M(this.K);
            z2 = true;
            str = !TextUtils.isEmpty(strP) ? IronSourceConstants.TYPE_UUID : "";
        } else {
            str = IronSourceConstants.TYPE_GAID;
            z2 = false;
        }
        if (!TextUtils.isEmpty(strP)) {
            map.put("advertisingId", strP);
            map.put("advertisingIdType", str);
        }
        if (!TextUtils.isEmpty(strA)) {
            z3 = Boolean.parseBoolean(strA);
            map.put(d9.i.M, Boolean.valueOf(z3));
        }
        if (z2 || z3) {
            map.put(f25580N, a(strA));
        }
        map.put("deviceOS", h());
        if (!TextUtils.isEmpty(b())) {
            map.put("osVersion", b());
        }
        String connectionType = IronSourceUtils.getConnectionType(this.K);
        if (!TextUtils.isEmpty(connectionType)) {
            map.put(d9.i.t, connectionType);
        }
        String strD = a9.d(this.K);
        if (!TextUtils.isEmpty(strD)) {
            map.put(d9.i.f24758u, strD);
        }
        map.put("sdkVersion", r());
        String strL = l();
        if (!TextUtils.isEmpty(strL)) {
            map.put("language", strL);
        }
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            map.put(d9.i.k, strG);
        }
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            map.put(d9.i.f24755l, strF);
        }
        String strN = n();
        if (!TextUtils.isEmpty(strN)) {
            map.put(d9.i.r, strN);
        }
        map.put("internalFreeMemory", Long.valueOf(k()));
        map.put("externalFreeMemory", Long.valueOf(i()));
        map.put("battery", Integer.valueOf(d()));
        int iJ = j();
        if (a(iJ)) {
            map.put("gmtMinutesOffset", Integer.valueOf(iJ));
        }
        String strP2 = p();
        if (!TextUtils.isEmpty(strP2)) {
            map.put("pluginType", strP2);
        }
        String strQ = q();
        if (!TextUtils.isEmpty(strQ)) {
            map.put("pluginVersion", strQ);
        }
        String strO = o();
        if (!TextUtils.isEmpty(strO)) {
            map.put("plugin_fw_v", strO);
        }
        String strValueOf = String.valueOf(this.L.f());
        if (!TextUtils.isEmpty(strValueOf)) {
            map.put("jb", strValueOf);
        }
        String strM = m();
        if (!TextUtils.isEmpty(strM)) {
            map.put(ne.Y0, strM);
        }
        String strValueOf2 = String.valueOf(IronSourceUtils.getFirstSession(this.K));
        if (!TextUtils.isEmpty(strValueOf2)) {
            map.put("firstSession", strValueOf2);
        }
        String strT = this.L.t(this.K);
        if (!TextUtils.isEmpty(strT)) {
            map.put("auid", strT);
        }
        map.put("mcc", Integer.valueOf(z8.b(this.K)));
        map.put("mnc", Integer.valueOf(z8.c(this.K)));
        String strN2 = this.L.n(this.K);
        if (!TextUtils.isEmpty(strN2)) {
            map.put("icc", strN2);
        }
        String strB2 = this.L.b();
        if (!TextUtils.isEmpty(strB2)) {
            map.put("tz", strB2);
        }
        IronLog.INTERNAL.verbose("collecting data for events: " + map);
        return map;
    }

    private boolean a(int i2) {
        return i2 <= f25581P && i2 >= f25582Q && i2 % 15 == 0;
    }
}
