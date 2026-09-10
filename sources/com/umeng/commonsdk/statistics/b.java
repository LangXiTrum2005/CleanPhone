package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.webkit.ProxyConfig;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.hjq.permissions.Permission;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.bz;
import com.umeng.analytics.pro.f;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.idtracking.e;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f2663a = null;
    public static String b = "";
    private static final String c = "EnvelopeManager";
    private static final String d = "debug.umeng.umTaskId";
    private static final String e = "debug.umeng.umCaseId";
    private static final String f = "empty";
    private static String g = "";
    private static String h = "";
    private static String i;
    private static Map<String, String> j;
    private static boolean l;
    private int k = 0;

    static {
        HashMap map = new HashMap();
        j = map;
        map.put("header", "#h");
        j.put(bc.u, "#sdt");
        j.put(bc.Q, "#ac");
        j.put("device_model", "#dm");
        j.put(bc.g, "#umid");
        j.put(bc.x, bc.x);
        j.put(bc.N, "#lang");
        j.put(bc.ai, "#dt");
        j.put(bc.z, "#rl");
        j.put(bc.H, "#dmf");
        j.put(bc.J, "#dn");
        j.put("platform_version", "#pv");
        j.put("font_size_setting", "#fss");
        j.put(bc.y, "#ov");
        j.put(bc.I, "#did");
        j.put("platform_sdk_version", "#psv");
        j.put(bc.F, "#db");
        j.put("appkey", "#ak");
        j.put(bc.Y, "#itr");
        j.put("id_type", "#it");
        j.put("uuid", "#ud");
        j.put("device_id", "#dd");
        j.put(bc.X, "#imp");
        j.put("sdk_version", "#sv");
        j.put("st", "#st");
        j.put("analytics", "#a");
        j.put("package_name", "#pkg");
        j.put(bc.p, "#sig");
        j.put(bc.q, "#sis1");
        j.put(bc.r, "#sis");
        j.put("app_version", "#av");
        j.put("version_code", "#vc");
        j.put(bc.v, "#imd");
        j.put(bc.B, "#mnc");
        j.put(bc.E, "#boa");
        j.put(bc.G, "#mant");
        j.put(bc.M, "#tz");
        j.put(bc.O, "#ct");
        j.put(bc.P, "#car");
        j.put(bc.s, "#disn");
        j.put(bc.T, "#nt");
        j.put(bc.b, "#cv");
        j.put(bc.d, "#mv");
        j.put(bc.c, "#cot");
        j.put(bc.e, "#mod");
        j.put(bc.aj, "#al");
        j.put("session_id", "#sid");
        j.put(bc.S, "#ip");
        j.put(bc.U, "#sre");
        j.put(bc.V, "#fre");
        j.put(bc.W, "#ret");
        j.put("channel", "#chn");
        j.put("wrapper_type", "#wt");
        j.put("wrapper_version", "#wv");
        j.put(bc.bb, "#tsv");
        j.put(bc.bc, "#rps");
        j.put(bc.bh, "#mov");
        j.put(f.i, "#vt");
        j.put("secret", "#sec");
        j.put(f.an, "#prv");
        j.put(f.l, "#$prv");
        j.put(f.m, "#uda");
        j.put(bc.f2508a, "#tok");
        j.put(bc.aT, "#iv");
        j.put(bc.R, "#ast");
        j.put("backstate", "#bst");
        j.put("zdata_ver", "#zv");
        j.put("zdata_req_ts", "#zrt");
        j.put("app_b_v", "#bv");
        j.put("zdata", "#zta");
        j.put(bc.ap, "#mt");
        j.put(bc.am, "#zsv");
        j.put("others_OS", "#oos");
    }

    public static String a(String str) {
        return j.containsKey(str) ? j.get(str) : str;
    }

    private static boolean b() {
        g = UMUtils.getSystemProperty(d, "");
        h = UMUtils.getSystemProperty(e, "");
        return (!TextUtils.isEmpty(g) && !f.equals(g)) && (!TextUtils.isEmpty(h) && !f.equals(h));
    }

    public static void a() {
        if (i != null) {
            i = null;
            e.a();
        }
    }

    public JSONObject b(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelopeA;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(a("header"), new JSONObject());
            try {
                if (b()) {
                    jSONObject.put("umTaskId", g);
                    jSONObject.put("umCaseId", h);
                }
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                jSONObject3 = a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, jSONObject3);
            }
            if (jSONObject3 != null) {
                envelopeA = a(context, jSONObject3.toString().getBytes());
                if (envelopeA == null) {
                    return a(111, jSONObject3);
                }
            } else {
                envelopeA = null;
            }
            Envelope envelope = envelopeA;
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject3);
            }
            int iA = a(context, envelope, "z==1.2.0", DeviceConfig.getAppVersionName(context), str);
            if (iA != 0) {
                return a(iA, jSONObject3);
            }
            if (ULog.DEBUG) {
                int length = jSONObject3.toString().getBytes().length;
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return a(110, new JSONObject());
        }
    }

    public static long a(Context context) {
        return DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
    }

    private JSONObject a(int i2, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i2);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i2);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        String str4;
        Envelope envelope;
        JSONObject jSONObjectOptJSONObject;
        if (ULog.DEBUG && jSONObject != null && jSONObject2 != null) {
            int length = jSONObject.toString().getBytes().length;
            int length2 = jSONObject2.toString().getBytes().length;
        }
        JSONObject jSONObject3 = null;
        if (context != null && jSONObject2 != null) {
            try {
                JSONObject jSONObjectA = a(context, str2, jSONObject2.has("analytics") && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.has(f.n));
                if (jSONObjectA != null && jSONObject != null) {
                    jSONObjectA = a(jSONObjectA, jSONObject);
                }
                JSONObject jSONObject4 = jSONObjectA;
                if (jSONObject4 != null) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (next != null && (next instanceof String)) {
                            String str5 = next;
                            if (jSONObject2.opt(str5) != null) {
                                try {
                                    jSONObject4.put(a(str5), jSONObject2.opt(str5));
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = bc.aN;
                }
                String str6 = TextUtils.isEmpty(str3) ? "1.0.0" : str3;
                if (jSONObject4 != null) {
                    String strSubstring = str2 + "==" + str6 + "&=";
                    if (TextUtils.isEmpty(strSubstring)) {
                        return a(101, jSONObject4);
                    }
                    if (strSubstring.endsWith("&=")) {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    }
                    str4 = strSubstring;
                } else {
                    str4 = null;
                }
                if (jSONObject4 != null) {
                    try {
                        e eVarA = e.a(context);
                        if (eVarA != null) {
                            eVarA.b();
                            String strEncodeToString = Base64.encodeToString(new bz().a(eVarA.c()), 0);
                            if (!TextUtils.isEmpty(strEncodeToString)) {
                                JSONObject jSONObject5 = jSONObject4.getJSONObject(a("header"));
                                jSONObject5.put(a(bc.Y), strEncodeToString);
                                jSONObject4.put(a("header"), jSONObject5);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (jSONObject4 != null && DataHelper.largeThanMaxSize(jSONObject4.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                    SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                    }
                    return a(113, jSONObject4);
                }
                if (jSONObject4 != null) {
                    Envelope envelopeA = a(context, jSONObject4.toString().getBytes());
                    if (envelopeA == null) {
                        return a(111, jSONObject4);
                    }
                    envelope = envelopeA;
                } else {
                    envelope = null;
                }
                if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                    return a(114, jSONObject4);
                }
                int iA = a(context, envelope, str4, jSONObject4 != null ? jSONObject4.optJSONObject(a("header")).optString(a("app_version")) : null, str);
                if (iA != 0) {
                    return a(iA, jSONObject4);
                }
                if (ULog.DEBUG) {
                    int length3 = jSONObject4.toString().getBytes().length;
                }
                if (!str4.startsWith(bc.aJ) && !str4.startsWith(bc.aI) && !str4.startsWith(bc.aO) && !str4.startsWith("a") && !com.umeng.commonsdk.stateless.b.a()) {
                    new com.umeng.commonsdk.stateless.b(context);
                    com.umeng.commonsdk.stateless.b.b();
                }
                return jSONObject4;
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
                if (jSONObject != null) {
                    try {
                        JSONObject jSONObject6 = new JSONObject();
                        try {
                            jSONObject6.put("header", jSONObject);
                        } catch (JSONException unused3) {
                        } catch (Exception e2) {
                            e = e2;
                            jSONObject3 = jSONObject6;
                            UMCrashManager.reportCrash(context, e);
                            return a(110, jSONObject3);
                        }
                        jSONObject3 = jSONObject6;
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (next2 != null && (next2 instanceof String)) {
                        String str7 = next2;
                        if (jSONObject2.opt(str7) != null) {
                            try {
                                jSONObject3.put(str7, jSONObject2.opt(str7));
                            } catch (Exception unused4) {
                            }
                        }
                    }
                }
                return a(110, jSONObject3);
            }
        }
        return a(110, (JSONObject) null);
    }

    private static int[] b(Context context) {
        int[] iArr = new int[3];
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(com.umeng.commonsdk.internal.c.f2647a, 0);
            if (sharedPreferences != null) {
                iArr[0] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.b, 0);
                iArr[1] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.c, 0);
                iArr[2] = sharedPreferences.getInt("policyGrantResult", 0);
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelopeA;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(a("header"), new JSONObject());
            if (jSONObject != null) {
                jSONObject3 = a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, jSONObject3);
            }
            if (jSONObject3 != null) {
                envelopeA = a(context, jSONObject3.toString().getBytes());
                if (envelopeA == null) {
                    return a(111, jSONObject3);
                }
            } else {
                envelopeA = null;
            }
            Envelope envelope = envelopeA;
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject3);
            }
            int iA = a(context, envelope, "h==1.2.0", "", str);
            if (iA != 0) {
                return a(iA, jSONObject3);
            }
            if (ULog.DEBUG) {
                int length = jSONObject3.toString().getBytes().length;
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return a(110, new JSONObject());
        }
    }

    private static JSONObject a(Context context, String str, boolean z) {
        JSONObject jSONObject;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (!TextUtils.isEmpty(i)) {
                try {
                    jSONObject = new JSONObject(i);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(a(bc.p), DeviceConfig.getAppMD5Signature(context));
                jSONObject2.put(a(bc.q), DeviceConfig.getAppSHA1Key(context));
                jSONObject2.put(a(bc.r), DeviceConfig.getAppHashKey(context));
                jSONObject2.put(a("app_version"), DeviceConfig.getAppVersionName(context));
                jSONObject2.put(a("version_code"), Integer.parseInt(DeviceConfig.getAppVersionCode(context)));
                jSONObject2.put(a(bc.v), DeviceConfig.getDeviceIdUmengMD5(context));
                jSONObject2.put(a(bc.w), DeviceConfig.getCPU());
                String mccmnc = DeviceConfig.getMCCMNC(context);
                if (!TextUtils.isEmpty(mccmnc)) {
                    jSONObject2.put(a(bc.B), mccmnc);
                    b = mccmnc;
                } else {
                    jSONObject2.put(a(bc.B), "");
                }
                if (FieldManager.allow(d.I)) {
                    String subOSName = DeviceConfig.getSubOSName(context);
                    if (!TextUtils.isEmpty(subOSName)) {
                        jSONObject2.put(a(bc.K), subOSName);
                    }
                    String subOSVersion = DeviceConfig.getSubOSVersion(context);
                    if (!TextUtils.isEmpty(subOSVersion)) {
                        jSONObject2.put(a(bc.L), subOSVersion);
                    }
                }
                String deviceType = DeviceConfig.getDeviceType(context);
                if (!TextUtils.isEmpty(deviceType)) {
                    jSONObject2.put(a(bc.ai), deviceType);
                }
                jSONObject2.put(a("package_name"), DeviceConfig.getPackageName(context));
                jSONObject2.put(a(bc.u), AnalyticsConstants.SDK_TYPE);
                jSONObject2.put(a("device_id"), DeviceConfig.getDeviceId(context));
                jSONObject2.put(a("device_model"), Build.MODEL);
                jSONObject2.put(a(bc.E), Build.BOARD);
                jSONObject2.put(a(bc.F), Build.BRAND);
                jSONObject2.put(a(bc.G), Build.TIME);
                jSONObject2.put(a(bc.H), Build.MANUFACTURER);
                jSONObject2.put(a(bc.I), Build.ID);
                jSONObject2.put(a(bc.J), Build.DEVICE);
                jSONObject2.put(a(bc.y), Build.VERSION.RELEASE);
                jSONObject2.put(a(bc.x), AnalyticsConstants.SDK_TYPE);
                int[] resolutionArray = DeviceConfig.getResolutionArray(context);
                if (resolutionArray != null) {
                    jSONObject2.put(a(bc.z), resolutionArray[1] + ProxyConfig.MATCH_ALL_SCHEMES + resolutionArray[0]);
                }
                jSONObject2.put(a(bc.A), DeviceConfig.getMac(context));
                jSONObject2.put(a(bc.M), DeviceConfig.getTimeZone(context));
                String[] localeInfo = DeviceConfig.getLocaleInfo(context);
                jSONObject2.put(a(bc.O), localeInfo[0]);
                jSONObject2.put(a(bc.N), localeInfo[1]);
                jSONObject2.put(a(bc.P), DeviceConfig.getNetworkOperatorName(context));
                jSONObject2.put(a(bc.s), DeviceConfig.getAppName(context));
                String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
                if ("Wi-Fi".equals(networkAccessMode[0])) {
                    jSONObject2.put(a(bc.Q), NetworkUtil.NETWORK_TYPE_WIFI);
                } else if ("2G/3G".equals(networkAccessMode[0])) {
                    jSONObject2.put(a(bc.Q), "2G/3G");
                } else {
                    jSONObject2.put(a(bc.Q), "unknow");
                }
                if (!"".equals(networkAccessMode[1])) {
                    jSONObject2.put(a(bc.R), networkAccessMode[1]);
                }
                if (DeviceConfig.isHarmony(context)) {
                    jSONObject2.put(a("others_OS"), "harmony");
                } else {
                    jSONObject2.put(a("others_OS"), AnalyticsConstants.SDK_TYPE);
                }
                jSONObject2.put(a(bc.T), DeviceConfig.getNetworkType(context));
                jSONObject2.put(a(bc.b), "9.7.4.1+000");
                jSONObject2.put(a(bc.c), SdkVersion.SDK_TYPE);
                jSONObject2.put(a(bc.d), "1");
                if (!TextUtils.isEmpty(f2663a)) {
                    jSONObject2.put(a(bc.e), f2663a);
                }
                jSONObject2.put(a(bc.aj), Build.VERSION.SDK_INT);
                if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                    jSONObject2.put(a(bc.af), UMUtils.VALUE_REC_VERSION_NAME);
                }
                try {
                    String uUIDForZid = UMUtils.getUUIDForZid(context);
                    if (TextUtils.isEmpty(uUIDForZid)) {
                        UMUtils.setUUIDForZid(context);
                        uUIDForZid = UMUtils.getUUIDForZid(context);
                    }
                    jSONObject2.put(a("session_id"), uUIDForZid);
                } catch (Throwable unused2) {
                }
                if (DeviceConfig.isHonorDevice()) {
                    try {
                        if (ba.c()) {
                            jSONObject2.put(bc.at, 2);
                        }
                        if (ba.b()) {
                            jSONObject2.put(bc.at, 3);
                        }
                    } catch (Throwable unused3) {
                    }
                }
                try {
                    jSONObject2.put(bc.au, DeviceConfig.getNotificationStatus(context));
                } catch (Throwable unused4) {
                }
                try {
                    jSONObject2.put(bc.av, DeviceConfig.getRingerMode(context));
                } catch (Throwable unused5) {
                }
                i = jSONObject2.toString();
                jSONObject = jSONObject2;
            }
            if (jSONObject == null) {
                return null;
            }
            try {
                jSONObject.put(a(bc.ak), UMUtils.getOaidRequiredTime(context));
            } catch (Exception unused6) {
            }
            try {
                jSONObject.put(a(bc.U), sharedPreferences.getInt("successful_request", 0));
                jSONObject.put(a(bc.V), sharedPreferences.getInt(bc.V, 0));
                jSONObject.put(a(bc.W), sharedPreferences.getInt("last_request_spent_ms", 0));
                String zid = UMUtils.getZid(context);
                if (!TextUtils.isEmpty(zid)) {
                    jSONObject.put(a(bc.al), zid);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                    jSONObject.put(a(bc.am), UMUtils.VALUE_ASMS_VERSION);
                }
            } catch (Exception unused7) {
            }
            jSONObject.put(a("channel"), UMUtils.getChannel(context));
            jSONObject.put(a("appkey"), UMUtils.getAppkey(context));
            try {
                String deviceToken = UMUtils.getDeviceToken(context);
                if (!TextUtils.isEmpty(deviceToken)) {
                    jSONObject.put(a(bc.f2508a), deviceToken);
                }
            } catch (Exception e2) {
                UMCrashManager.reportCrash(context, e2);
            }
            try {
                String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, bc.g, null);
                if (!TextUtils.isEmpty(strImprintProperty)) {
                    jSONObject.put(a(bc.g), strImprintProperty);
                }
            } catch (Exception e3) {
                UMCrashManager.reportCrash(context, e3);
            }
            try {
                jSONObject.put(a("wrapper_type"), a.f2662a);
                jSONObject.put(a("wrapper_version"), a.b);
            } catch (Exception unused8) {
            }
            int targetSdkVersion = UMUtils.getTargetSdkVersion(context);
            boolean zCheckPermission = UMUtils.checkPermission(context, Permission.READ_PHONE_STATE);
            jSONObject.put(a(bc.bb), targetSdkVersion);
            if (zCheckPermission) {
                jSONObject.put(a(bc.bc), "yes");
            } else {
                jSONObject.put(a(bc.bc), "no");
            }
            try {
                if (b()) {
                    jSONObject.put("umTaskId", g);
                    jSONObject.put("umCaseId", h);
                }
            } catch (Throwable unused9) {
            }
            if ((bc.aO.equals(str) || "a".equals(str)) && z) {
                try {
                    int[] iArrB = b(context);
                    jSONObject.put(a(bc.by), String.valueOf(iArrB[0]) + String.valueOf(iArrB[1]) + String.valueOf(iArrB[2]));
                } catch (Throwable unused10) {
                }
            }
            try {
                Map<String, String> moduleTags = TagHelper.getModuleTags();
                if (moduleTags != null && moduleTags.size() > 0) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry<String, String> entry : moduleTags.entrySet()) {
                        jSONObject3.put(entry.getKey(), entry.getValue());
                    }
                    jSONObject.put(a(bc.ap), jSONObject3);
                }
            } catch (Throwable unused11) {
            }
            try {
                String realTimeDebugKey = AnalyticsConfig.getRealTimeDebugKey();
                if (!TextUtils.isEmpty(realTimeDebugKey)) {
                    jSONObject.put(a(bc.bx), realTimeDebugKey);
                }
            } catch (Throwable unused12) {
            }
            try {
                JSONObject moduleVer = UMUtils.getModuleVer();
                if (moduleVer.length() > 0) {
                    jSONObject.put(a(bc.bh), moduleVer);
                }
            } catch (Throwable unused13) {
            }
            try {
                String apmFlag = UMUtils.getApmFlag();
                if (!TextUtils.isEmpty(apmFlag)) {
                    jSONObject.put(a(bc.bw), apmFlag);
                }
            } catch (Throwable unused14) {
            }
            try {
                String str2 = Build.BRAND;
                String strA = at.a(str2);
                String strB = at.b(str2);
                jSONObject.put(bc.bf, strA);
                jSONObject.put(bc.bg, strB);
            } catch (Throwable unused15) {
            }
            byte[] bArrA = ImprintHandler.getImprintService(context).a();
            if (bArrA != null && bArrA.length > 0) {
                try {
                    jSONObject.put(a(bc.X), Base64.encodeToString(bArrA, 0));
                } catch (JSONException e4) {
                    UMCrashManager.reportCrash(context, e4);
                }
            }
            if (jSONObject.length() > 0) {
                return new JSONObject().put(a("header"), jSONObject);
            }
            return null;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt(a("header")) != null && (jSONObject.opt(a("header")) instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt(a("header"));
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && (next instanceof String)) {
                    String str = next;
                    if (jSONObject2.opt(str) != null) {
                        try {
                            jSONObject3.put(str, jSONObject2.opt(str));
                            if (str.equals(a(f.i)) && (jSONObject2.opt(str) instanceof Integer)) {
                                this.k = ((Integer) jSONObject2.opt(str)).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    private Envelope a(Context context, byte[] bArr) {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int iIntValue = -1;
        try {
            if (!TextUtils.isEmpty(strImprintProperty)) {
                iIntValue = Integer.valueOf(strImprintProperty).intValue();
            }
        } catch (NumberFormatException e2) {
            UMCrashManager.reportCrash(context, e2);
        }
        if (iIntValue == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (iIntValue == 1) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (l) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    private int a(Context context, Envelope envelope, String str, String str2, String str3) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        String strB = com.umeng.commonsdk.stateless.d.b(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&&");
        sb.append(str2);
        sb.append("_");
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(strB);
        sb.append(".log");
        byte[] binary = envelope.toBinary();
        if (com.umeng.commonsdk.utils.c.a()) {
            if (str.startsWith(bc.aM)) {
                return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
            }
            return 122;
        }
        if (str.startsWith(bc.aM)) {
            return 122;
        }
        if (!str.startsWith(bc.aJ) && !str.startsWith(bc.aI) && !str.startsWith("a") && !str.startsWith(bc.aO)) {
            return com.umeng.commonsdk.stateless.d.a(context, com.umeng.commonsdk.stateless.a.f, sb.toString(), binary);
        }
        return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
    }

    public static void a(boolean z) {
        l = z;
    }
}
