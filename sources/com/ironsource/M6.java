package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class M6 implements Runnable {
    public static final String M = "sdkVersion";
    public static final String N = "AdvIdOptOutReason";
    private static final int O = 15;
    private static final int P = 840;
    private static final int Q = -720;
    private Context K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26544a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26545b = "bundleId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26546c = "advertisingId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26547d = X3.j.M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26548e = "appKey";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f26549f = Wa.f27581o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26550g = "osVersion";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f26551h = "connectionType";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f26552i = "rawConnectionType";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f26553j = "language";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f26554k = "deviceOEM";
    private final String l = "deviceModel";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f26555m = X3.j.f27860r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f26556n = Wa.f27584r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f26557o = Wa.f27585s;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f26558p = "battery";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f26559q = "gmtMinutesOffset";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f26560r = X3.j.W;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f26561s = JsonStorageKeyNames.SESSION_ID_KEY;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f26562t = "pluginType";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f26563u = "pluginVersion";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f26564v = "plugin_fw_v";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f26565w = Wa.f27587u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f26566x = Wa.f27586t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f26567y = O6.f26701b1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f26568z = Wa.f27589w;
    private final String A = "mcc";
    private final String B = "mnc";
    private final String C = "icc";
    private final String D = "tz";
    private final String E = "auid";
    private final String F = "userLat";
    private final String G = "publisherAPI";
    private final String H = "missingDependencies";
    private final String I = "missingManifest";
    private final String J = "other";
    private final InterfaceC0674y7 L = Kb.Y().a();

    private M6() {
    }

    private Map<String, Object> a() {
        boolean z10;
        String str;
        HashMap map = new HashMap();
        map.put(JsonStorageKeyNames.SESSION_ID_KEY, IronSourceUtils.d());
        String strE = e();
        if (!TextUtils.isEmpty(strE)) {
            map.put("bundleId", strE);
            String strB = E1.b(this.K, strE);
            if (!TextUtils.isEmpty(strB)) {
                map.put(X3.j.W, strB);
            }
        }
        map.put("appKey", c());
        String strI = this.L.I(this.K);
        String strC = this.L.c(this.K);
        boolean z11 = false;
        if (TextUtils.isEmpty(strI)) {
            strI = this.L.a(this.K);
            z10 = true;
            str = !TextUtils.isEmpty(strI) ? IronSourceConstants.TYPE_UUID : "";
        } else {
            str = IronSourceConstants.TYPE_GAID;
            z10 = false;
        }
        if (!TextUtils.isEmpty(strI)) {
            map.put("advertisingId", strI);
            map.put(Wa.f27586t, str);
        }
        if (!TextUtils.isEmpty(strC)) {
            z11 = Boolean.parseBoolean(strC);
            map.put(X3.j.M, Boolean.valueOf(z11));
        }
        if (z10 || z11) {
            map.put(N, a(strC));
        }
        map.put(Wa.f27581o, h());
        if (!TextUtils.isEmpty(b())) {
            map.put("osVersion", b());
        }
        String strA = IronSourceUtils.a(this.K);
        if (!TextUtils.isEmpty(strA)) {
            map.put("connectionType", strA);
        }
        String strD = U3.d(this.K);
        if (!TextUtils.isEmpty(strD)) {
            map.put("rawConnectionType", strD);
        }
        map.put("sdkVersion", r());
        String strL = l();
        if (!TextUtils.isEmpty(strL)) {
            map.put("language", strL);
        }
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            map.put("deviceOEM", strG);
        }
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            map.put("deviceModel", strF);
        }
        String strN = n();
        if (!TextUtils.isEmpty(strN)) {
            map.put(X3.j.f27860r, strN);
        }
        map.put(Wa.f27585s, Long.valueOf(k()));
        map.put(Wa.f27584r, Long.valueOf(i()));
        map.put("battery", Integer.valueOf(d()));
        int iJ = j();
        if (a(iJ)) {
            map.put("gmtMinutesOffset", Integer.valueOf(iJ));
        }
        String strP = p();
        if (!TextUtils.isEmpty(strP)) {
            map.put("pluginType", strP);
        }
        String strQ = q();
        if (!TextUtils.isEmpty(strQ)) {
            map.put("pluginVersion", strQ);
        }
        String strO = o();
        if (!TextUtils.isEmpty(strO)) {
            map.put("plugin_fw_v", strO);
        }
        String strValueOf = String.valueOf(this.L.p());
        if (!TextUtils.isEmpty(strValueOf)) {
            map.put(Wa.f27587u, strValueOf);
        }
        String strM = m();
        if (!TextUtils.isEmpty(strM)) {
            map.put(O6.f26701b1, strM);
        }
        String strValueOf2 = String.valueOf(IronSourceUtils.c(this.K));
        if (!TextUtils.isEmpty(strValueOf2)) {
            map.put(Wa.f27589w, strValueOf2);
        }
        String strE2 = this.L.e(this.K);
        if (!TextUtils.isEmpty(strE2)) {
            map.put("auid", strE2);
        }
        map.put("mcc", Integer.valueOf(T3.b(this.K)));
        map.put("mnc", Integer.valueOf(T3.c(this.K)));
        String strH = this.L.H(this.K);
        if (!TextUtils.isEmpty(strH)) {
            map.put("icc", strH);
        }
        String strD2 = this.L.d();
        if (!TextUtils.isEmpty(strD2)) {
            map.put("tz", strD2);
        }
        IronLog.INTERNAL.verbose("collecting data for events: " + map);
        return map;
    }

    private String b() {
        try {
            String str = Build.VERSION.RELEASE;
            return "" + Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return "";
        }
    }

    private String c() {
        return com.ironsource.mediationsdk.p.h().i();
    }

    private int d() {
        try {
            Intent intentRegisterReceiver = this.K.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, defpackage.e.q(this.f26544a, ":getBatteryLevel()", new StringBuilder()), e10);
        }
        return -1;
    }

    private String e() {
        try {
            return this.K.getPackageName();
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return "";
        }
    }

    private String f() {
        try {
            return Build.MODEL;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return "";
        }
    }

    private String g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return "";
        }
    }

    private String h() {
        return X3.f27645d;
    }

    private long i() {
        if (!s()) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1048576;
    }

    private int j() {
        int offset = 0;
        try {
            TimeZone timeZone = TimeZone.getDefault();
            offset = (timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60;
            return Math.round(offset / 15) * 15;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, defpackage.e.q(this.f26544a, ":getGmtMinutesOffset()", new StringBuilder()), e10);
            return offset;
        }
    }

    private long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1048576;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return -1L;
        }
    }

    private String l() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return "";
        }
    }

    private String m() {
        return com.ironsource.mediationsdk.p.h().k();
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
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, defpackage.e.q(this.f26544a, ":getMobileCarrier()", new StringBuilder()), e10);
        }
        return "";
    }

    private String o() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e10);
            return "";
        }
    }

    private String p() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e10);
            return "";
        }
    }

    private String q() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e10);
            return "";
        }
    }

    private String r() {
        return LevelPlay.getSdkVersion();
    }

    private boolean s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            L6.a().a(a());
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = ".concat(getClass().getSimpleName()), e10);
        }
    }

    public M6(Context context) {
        this.K = context.getApplicationContext();
    }

    private boolean a(int i10) {
        return i10 <= P && i10 >= Q && i10 % 15 == 0;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "missingDependencies";
        }
        if (!V4.f27346a.b()) {
            return "publisherAPI";
        }
        if (this.L.h(this.K)) {
            return Boolean.parseBoolean(str) ? "userLat" : "other";
        }
        return "missingManifest";
    }
}
