package com.p004ironsource.mediationsdk.server;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.a9;
import com.p004ironsource.b4;
import com.p004ironsource.i1;
import com.p004ironsource.mb;
import com.p004ironsource.mediationsdk.config.ConfigFile;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceAES;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.ne;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.vf;
import com.p004ironsource.xk;
import com.p004ironsource.z8;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.mediation.LevelPlay;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class ServerURL {
    private static final String AMPERSAND = "&";
    private static final String ANDROID = "android";
    private static final String APPLICATION_KEY = "applicationKey";
    private static final String APPLICATION_USER_ID = "applicationUserId";
    private static final String APPLICATION_VERSION = "appVer";
    private static final String AUID = "auid";
    private static String BASE_URL_PREFIX = "https://i-sdk.mediation.unity3d.com/sdk/v";
    private static final String BASE_URL_SUFFIX = "?request=";
    private static final String BROWSER_USER_AGENT = "browserUserAgent";
    private static final String BUNDLE_ID = "bundleId";
    private static final String CONNECTION_TYPE = "connType";
    private static final String COPPA = "coppa";
    private static final String DEVICE_LANG = "deviceLang";
    private static final String DEVICE_MAKE = "devMake";
    private static final String DEVICE_MODEL = "devModel";
    private static final String EQUAL = "=";
    private static final String FIRST_SESSION = "fs";
    private static final String GAID = "advId";
    private static final String GOOGLE_FAMILY_SUPPORT = "dff";
    private static final String IMPRESSION = "impression";
    private static final String ISO_COUNTRY_CODE = "icc";
    private static final String IS_DEMAND_ONLY = "isDemandOnly";
    private static final String MEDIATION_TYPE = "mt";
    private static final String MOBILE_CARRIER = "mCar";
    private static final String MOBILE_COUNTRY_CODE = "mcc";
    private static final String MOBILE_NETWORK_CODE = "mnc";
    private static final String OS_VERSION = "osVer";
    private static final String PLACEMENT = "placementId";
    private static final String PLATFORM_KEY = "platform";
    private static final String PLUGIN_FW_VERSION = "plugin_fw_v";
    private static final String PLUGIN_TYPE = "pluginType";
    private static final String PLUGIN_VERSION = "pluginVersion";
    private static final String RAW_CONNECTION_TYPE = "rawConnType";
    private static final String REWARDED_VIDEO_MANUAL_MODE = "rvManual";
    private static final String SDK_VERSION = "sdkVersion";
    private static final String SERR = "serr";
    private static final String TEST_SUITE = "ts";
    private static final String TIME_ZONE_ID = "tz";
    private static final String TIME_ZONE_OFFSET = "tzOff";

    public static String buildInitURL(Context context, String str, String str2, String str3, String str4, boolean z2, List<Pair<String, String>> list, boolean z3) throws UnsupportedEncodingException {
        String str5;
        List<String> list2;
        vf vfVarF = on.U().f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            a.z("applicationUserId", str2, arrayList);
        }
        arrayList.add(new Pair("sdkVersion", LevelPlay.getSdkVersion()));
        if (z2) {
            a.z(REWARDED_VIDEO_MANUAL_MODE, "1", arrayList);
        }
        if (!IronSourceUtils.isEncryptedResponse()) {
            a.z(SERR, "0", arrayList);
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(PLUGIN_TYPE, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(PLUGIN_VERSION, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(PLUGIN_FW_VERSION, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            a.z(GAID, str3, arrayList);
        }
        if (!TextUtils.isEmpty(str4)) {
            a.z("mt", str4, arrayList);
        }
        String strB = b4.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            a.z(APPLICATION_VERSION, strB, arrayList);
        }
        arrayList.add(new Pair(OS_VERSION, androidx.datastore.preferences.protobuf.a.f(Build.VERSION.SDK_INT, "")));
        a.z(DEVICE_MAKE, Build.MANUFACTURER, arrayList);
        arrayList.add(new Pair(DEVICE_MODEL, Build.MODEL));
        arrayList.add(new Pair("fs", androidx.datastore.preferences.protobuf.a.f(IronSourceUtils.getFirstSession(context) ? 1 : 0, "")));
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = xk.b().c();
        if (concurrentHashMapC.containsKey(com.p004ironsource.mediationsdk.metadata.a.f25959b)) {
            arrayList.add(new Pair("coppa", concurrentHashMapC.get(com.p004ironsource.mediationsdk.metadata.a.f25959b).get(0)));
        }
        if (concurrentHashMapC.containsKey(com.p004ironsource.mediationsdk.metadata.a.f)) {
            String str6 = concurrentHashMapC.get(com.p004ironsource.mediationsdk.metadata.a.f).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(com.p004ironsource.mediationsdk.metadata.a.j)) {
                a.z("ts", "1", arrayList);
            }
        }
        if (concurrentHashMapC.containsKey(com.p004ironsource.mediationsdk.metadata.a.d)) {
            String str7 = concurrentHashMapC.get(com.p004ironsource.mediationsdk.metadata.a.d).get(0);
            if (!TextUtils.isEmpty(str7) && str7.equalsIgnoreCase(com.p004ironsource.mediationsdk.metadata.a.g)) {
                a.z(GOOGLE_FAMILY_SUPPORT, "1", arrayList);
            }
        }
        if (concurrentHashMapC.containsKey(com.p004ironsource.mediationsdk.metadata.a.f25961e) && (list2 = concurrentHashMapC.get(com.p004ironsource.mediationsdk.metadata.a.f25961e)) != null) {
            arrayList.add(new Pair(com.p004ironsource.mediationsdk.metadata.a.f25961e, list2.get(0)));
        }
        String connectionType = IronSourceUtils.getConnectionType(context);
        if (!TextUtils.isEmpty(connectionType)) {
            a.z(CONNECTION_TYPE, connectionType, arrayList);
        }
        String strD = a9.d(context);
        if (!TextUtils.isEmpty(strD)) {
            a.z(RAW_CONNECTION_TYPE, strD, arrayList);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String strT = vfVarF.t();
        if (strT.length() != 0) {
            a.z(BROWSER_USER_AGENT, strT, arrayList);
        }
        try {
            str5 = vfVarF.b(context) + TokenBuilder.TOKEN_DELIMITER + vfVarF.I(context);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            a.z(DEVICE_LANG, str5, arrayList);
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + z8.b(context)));
        arrayList.add(new Pair("mnc", "" + z8.c(context)));
        String strN = vfVarF.n(context);
        if (!TextUtils.isEmpty(strN)) {
            a.z("icc", strN, arrayList);
        }
        String strJ = vfVarF.j(context);
        if (!TextUtils.isEmpty(strJ)) {
            a.z(MOBILE_CARRIER, strJ, arrayList);
        }
        String strB2 = vfVarF.b();
        if (!TextUtils.isEmpty(strB2)) {
            a.z("tz", strB2, arrayList);
        }
        arrayList.add(new Pair(TIME_ZONE_OFFSET, "" + vfVarF.q()));
        String strT2 = vfVarF.t(context);
        if (!TextUtils.isEmpty(strT2)) {
            a.z("auid", strT2, arrayList);
        }
        if (z3) {
            a.z("isDemandOnly", "1", arrayList);
        }
        a.z(ne.h0, String.valueOf(i1.a()), arrayList);
        return android.support.v4.media.a.r(new StringBuilder(), getBaseUrl(LevelPlay.getSdkVersion()), URLEncoder.encode(IronSourceAES.encode(mb.b().c(), createURLParams(arrayList)), "UTF-8"));
    }

    private static String createURLParams(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String string = "";
        for (Pair<String, String> pair : list) {
            if (string.length() > 0) {
                string = string.concat("&");
            }
            StringBuilder sbW = android.support.v4.media.a.w(string);
            sbW.append((String) pair.first);
            sbW.append("=");
            sbW.append(URLEncoder.encode((String) pair.second, "UTF-8"));
            string = sbW.toString();
        }
        return string;
    }

    private static String getBaseUrl(String str) {
        return android.support.v4.media.a.s(new StringBuilder(), BASE_URL_PREFIX, str, BASE_URL_SUFFIX);
    }

    public static String getRequestURL(String str, boolean z2, int i2) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z2)));
        arrayList.add(new Pair("placementId", Integer.toString(i2)));
        return android.support.v4.media.a.D(str, "&", createURLParams(arrayList));
    }

    private static void setBaseUrlPrefix(String str) {
        BASE_URL_PREFIX = str;
    }
}
