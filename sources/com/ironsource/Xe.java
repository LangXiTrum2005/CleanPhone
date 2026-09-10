package com.ironsource;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Xe {
    private static final String A = "mcc";
    private static final String B = "mnc";
    private static final String C = "icc";
    private static final String D = "mCar";
    private static final String E = "tz";
    private static final String F = "tzOff";
    private static final String G = "rvManual";
    private static final String H = "ts";
    private static final String I = "android";
    private static final String J = "impression";
    private static final String K = "placementId";
    private static final String L = "=";
    private static final String M = "&";
    static String N = "";
    static String O = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f27920a = "https://i-sdk.mediation.unity3d.com/sdk/v";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f27921b = "?request=";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f27922c = "platform";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f27923d = "applicationKey";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f27924e = "applicationUserId";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f27925f = "sdkVersion";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f27926g = "pluginType";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f27927h = "pluginVersion";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f27928i = "plugin_fw_v";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f27929j = "advId";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f27930k = "auid";
    private static final String l = "isDemandOnly";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f27931m = "serr";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f27932n = "appVer";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f27933o = "osVer";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f27934p = "devModel";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f27935q = "devMake";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f27936r = "connType";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f27937s = "rawConnType";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f27938t = "mt";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f27939u = "fs";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f27940v = "coppa";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f27941w = "dff";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f27942x = "browserUserAgent";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f27943y = "deviceLang";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f27944z = "bundleId";

    public static String a() {
        return N;
    }

    public static String b() {
        return O;
    }

    public static void c(String str) {
        O = str;
    }

    public static String a(Context context, String str, String str2, String str3, String str4, boolean z10, List<Pair<String, String>> list, boolean z11) throws UnsupportedEncodingException {
        String str5;
        List<String> list2;
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            l1.d.n("applicationUserId", str2, arrayList);
        }
        arrayList.add(new Pair("sdkVersion", LevelPlay.getSdkVersion()));
        if (z10) {
            l1.d.n(G, "1", arrayList);
        }
        if (!IronSourceUtils.g()) {
            l1.d.n(f27931m, "0", arrayList);
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(f27926g, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(f27927h, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(f27928i, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            l1.d.n(f27929j, str3, arrayList);
        }
        if (!TextUtils.isEmpty(str4)) {
            l1.d.n("mt", str4, arrayList);
        }
        String strB = E1.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            l1.d.n(f27932n, strB, arrayList);
        }
        arrayList.add(new Pair(f27933o, d5.u.f(Build.VERSION.SDK_INT, "")));
        l1.d.n(f27935q, Build.MANUFACTURER, arrayList);
        arrayList.add(new Pair(f27934p, Build.MODEL));
        arrayList.add(new Pair("fs", d5.u.f(IronSourceUtils.c(context) ? 1 : 0, "")));
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C0462ma.b().c();
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f29605b)) {
            arrayList.add(new Pair(f27940v, concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f29605b).get(0)));
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f29609f)) {
            String str6 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f29609f).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.f29613j)) {
                l1.d.n("ts", "1", arrayList);
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f29607d)) {
            String str7 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f29607d).get(0);
            if (!TextUtils.isEmpty(str7) && str7.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.f29610g)) {
                l1.d.n(f27941w, "1", arrayList);
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f29608e) && (list2 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f29608e)) != null) {
            arrayList.add(new Pair(com.ironsource.mediationsdk.metadata.a.f29608e, list2.get(0)));
        }
        String strA = IronSourceUtils.a(context);
        if (!TextUtils.isEmpty(strA)) {
            l1.d.n(f27936r, strA, arrayList);
        }
        String strD = U3.d(context);
        if (!TextUtils.isEmpty(strD)) {
            l1.d.n(f27937s, strD, arrayList);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String strS = interfaceC0674y7A.s();
        if (strS.length() != 0) {
            l1.d.n(f27942x, strS, arrayList);
        }
        try {
            str5 = interfaceC0674y7A.d(context) + "-" + interfaceC0674y7A.B(context);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            l1.d.n(f27943y, str5, arrayList);
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + T3.b(context)));
        arrayList.add(new Pair("mnc", "" + T3.c(context)));
        String strH = interfaceC0674y7A.H(context);
        if (!TextUtils.isEmpty(strH)) {
            l1.d.n("icc", strH, arrayList);
        }
        String strV = interfaceC0674y7A.v(context);
        if (!TextUtils.isEmpty(strV)) {
            l1.d.n(D, strV, arrayList);
        }
        String strD2 = interfaceC0674y7A.d();
        if (!TextUtils.isEmpty(strD2)) {
            l1.d.n("tz", strD2, arrayList);
        }
        arrayList.add(new Pair(F, "" + interfaceC0674y7A.m()));
        String strE = interfaceC0674y7A.e(context);
        if (!TextUtils.isEmpty(strE)) {
            l1.d.n("auid", strE, arrayList);
        }
        if (z11) {
            l1.d.n("isDemandOnly", "1", arrayList);
        }
        l1.d.n(O6.f26722j0, String.valueOf(C0434l0.a()), arrayList);
        String strA2 = a(arrayList);
        N = strA2;
        return defpackage.e.q(a(LevelPlay.getSdkVersion()), URLEncoder.encode(J9.e(C0421k5.b().c(), strA2), "UTF-8"), new StringBuilder());
    }

    private static void b(String str) {
        f27920a = str;
    }

    public static String a(String str, boolean z10, int i10) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z10)));
        arrayList.add(new Pair("placementId", Integer.toString(i10)));
        return wi.d.i(str, "&", a(arrayList));
    }

    private static String a(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String string = "";
        for (Pair<String, String> pair : list) {
            if (string.length() > 0) {
                string = string.concat("&");
            }
            StringBuilder sbI = d5.u.i(string);
            sbI.append((String) pair.first);
            sbI.append("=");
            sbI.append(URLEncoder.encode((String) pair.second, "UTF-8"));
            string = sbI.toString();
        }
        return string;
    }

    private static String a(String str) {
        return q4.a.j(new StringBuilder(), f27920a, str, f27921b);
    }
}
