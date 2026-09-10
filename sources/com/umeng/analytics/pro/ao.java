package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.custommapping.UAPMCustomMapping;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JSONObject f2494a;

    public static JSONObject a(Context context, JSONArray jSONArray, String str) {
        JSONObject jSONObject = f2494a;
        if (jSONObject != null && jSONObject.length() > 0) {
            return f2494a;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(bc.x, AnalyticsConstants.SDK_TYPE);
            jSONObject2.put("dm", Build.MODEL);
            jSONObject2.put("av", DeviceConfig.getAppVersionName(context));
            jSONObject2.put(bc.g, UMUtils.getUMId(context));
            jSONObject2.put("ov", Build.VERSION.RELEASE);
            jSONObject2.put("chn", UMUtils.getChannel(context));
            jSONObject2.put(bc.al, UMUtils.getZid(context));
            jSONObject2.put("sv", "9.7.4.1+000");
            jSONObject2.put("ak", UMUtils.getAppkey(context));
            String idfa = DeviceConfig.getIdfa(context);
            if (!TextUtils.isEmpty(idfa)) {
                jSONObject2.put("tk_idfa", idfa);
            }
            jSONObject2.put("db", Build.BRAND);
            jSONObject2.put("tk_aid", DeviceConfig.getAndroidId(context));
            String oaid = DeviceConfig.getOaid(context);
            if (!TextUtils.isEmpty(oaid)) {
                jSONObject2.put("tk_oaid", oaid);
            }
            String imeiNew = DeviceConfig.getImeiNew(context);
            if (!TextUtils.isEmpty(imeiNew)) {
                jSONObject2.put("tk_imei", imeiNew);
            }
            jSONObject2.put("boa", Build.BOARD);
            jSONObject2.put("mant", Build.TIME);
            String[] localeInfo = DeviceConfig.getLocaleInfo(context);
            jSONObject2.put("ct", localeInfo[0]);
            jSONObject2.put("lang", localeInfo[1]);
            jSONObject2.put("tz", DeviceConfig.getTimeZone(context));
            jSONObject2.put("pkg", DeviceConfig.getPackageName(context));
            jSONObject2.put("disn", DeviceConfig.getAppName(context));
            String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
            if ("Wi-Fi".equals(networkAccessMode[0])) {
                jSONObject2.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, NetworkUtil.NETWORK_TYPE_WIFI);
            } else if ("2G/3G".equals(networkAccessMode[0])) {
                jSONObject2.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "2G/3G");
            } else {
                jSONObject2.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "unknown");
            }
            if (!"".equals(networkAccessMode[1])) {
                jSONObject2.put("ast", networkAccessMode[1]);
            }
            jSONObject2.put("nt", DeviceConfig.getNetworkType(context));
            String deviceToken = UMUtils.getDeviceToken(context);
            if (!TextUtils.isEmpty(deviceToken)) {
                jSONObject2.put(bc.f2508a, deviceToken);
            }
            int[] resolutionArray = DeviceConfig.getResolutionArray(context);
            if (resolutionArray != null) {
                jSONObject2.put("rl", resolutionArray[1] + ProxyConfig.MATCH_ALL_SCHEMES + resolutionArray[0]);
            }
            jSONObject2.put("car", DeviceConfig.getNetworkOperatorName(context));
            jSONObject2.put(bc.b, "9.7.4.1+000");
            if (DeviceConfig.isHarmony(context)) {
                jSONObject2.put("oos", "harmony");
            } else {
                jSONObject2.put("oos", AnalyticsConstants.SDK_TYPE);
            }
            jSONObject2.put(com.umeng.ccg.a.r, str);
            jSONObject2.put("sdk", jSONArray);
            f2494a = jSONObject2;
        } catch (Throwable unused) {
        }
        return f2494a;
    }

    public static JSONObject a(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("ekv", jSONArray);
                return jSONObject3;
            } catch (Throwable unused) {
                jSONObject2 = jSONObject3;
                return jSONObject2;
            }
        } catch (Throwable unused2) {
        }
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("header", jSONObject);
            jSONObject3.put("analytics", jSONObject2);
        } catch (Throwable unused) {
        }
        return jSONObject3;
    }

    public static JSONObject a(Context context, String str) {
        JSONObject jSONObject = null;
        try {
            an anVar = new an();
            String uMId = UMUtils.getUMId(context);
            if (TextUtils.isEmpty(uMId)) {
                return null;
            }
            anVar.a(uMId);
            String appkey = UMUtils.getAppkey(context);
            if (TextUtils.isEmpty(appkey)) {
                return null;
            }
            anVar.b(appkey);
            anVar.c(UMUtils.getAppVersionName(context));
            anVar.d("9.7.4.1+000");
            anVar.e(UMUtils.getChannel(context));
            anVar.f(Build.VERSION.SDK_INT + "");
            anVar.g(Build.BRAND);
            anVar.h(Build.MODEL);
            String[] localeInfo = DeviceConfig.getLocaleInfo(context);
            anVar.i(localeInfo[1]);
            anVar.j(localeInfo[0]);
            int[] resolutionArray = DeviceConfig.getResolutionArray(context);
            anVar.b(Integer.valueOf(resolutionArray[1]));
            anVar.a(Integer.valueOf(resolutionArray[0]));
            anVar.k(as.a(context, "install_datetime", ""));
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(an.f2493a, anVar.a());
                    jSONObject2.put(an.c, anVar.c());
                    jSONObject2.put(an.b, anVar.b());
                    jSONObject2.put(an.d, anVar.d());
                    jSONObject2.put(an.e, anVar.e());
                    jSONObject2.put(an.f, anVar.f());
                    jSONObject2.put(an.g, anVar.g());
                    jSONObject2.put(an.h, anVar.h());
                    jSONObject2.put(an.k, anVar.k());
                    jSONObject2.put(an.j, anVar.j());
                    jSONObject2.put(an.l, anVar.l());
                    jSONObject2.put(an.i, anVar.i());
                    jSONObject2.put(an.m, anVar.m());
                    jSONObject2.put(bc.al, UMUtils.getZid(context));
                    jSONObject2.put("platform", "android");
                    jSONObject2.put("optional", new JSONObject(as.a()));
                    String[] strArrSplit = str.split("@");
                    if (strArrSplit.length == 4) {
                        try {
                            long j = Long.parseLong(strArrSplit[0]);
                            String str2 = strArrSplit[1];
                            jSONObject2.put(UAPMCustomMapping.STRING_PARAM_1, j);
                            jSONObject2.put(UAPMCustomMapping.STRING_PARAM_2, str2);
                        } catch (Throwable unused) {
                        }
                    }
                    try {
                        String str3 = Build.BRAND;
                        String strA = at.a(str3);
                        String strB = at.b(str3);
                        if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strB)) {
                            jSONObject2.put(an.n, strA);
                            jSONObject2.put(an.o, strB);
                        } else {
                            jSONObject2.put(an.n, AnalyticsConstants.SDK_TYPE);
                            jSONObject2.put(an.o, Build.VERSION.RELEASE);
                        }
                    } catch (Throwable unused2) {
                    }
                    return jSONObject2;
                } catch (JSONException e) {
                    e = e;
                    jSONObject = jSONObject2;
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "[getCloudConfigParam] error " + e.getMessage());
                    return jSONObject;
                } catch (Throwable th) {
                    th = th;
                    jSONObject = jSONObject2;
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "[getCloudConfigParam] error " + th.getMessage());
                    return jSONObject;
                }
            } catch (JSONException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static JSONObject a(Context context, int i, JSONArray jSONArray, String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                String zid = UMUtils.getZid(context);
                if (TextUtils.isEmpty(zid)) {
                    return jSONObject2;
                }
                jSONObject2.put("atoken", zid);
                String deviceToken = UMUtils.getDeviceToken(context);
                if (!TextUtils.isEmpty(deviceToken)) {
                    jSONObject2.put("device_token", deviceToken);
                }
                jSONObject2.put("model", Build.MODEL);
                jSONObject2.put(bc.x, "android");
                jSONObject2.put(bc.y, Build.VERSION.RELEASE);
                jSONObject2.put(com.umeng.ccg.a.r, str);
                jSONObject2.put("sdk", jSONArray);
                jSONObject2.put("e", i);
                return jSONObject2;
            } catch (Throwable unused) {
                jSONObject = jSONObject2;
                return jSONObject;
            }
        } catch (Throwable unused2) {
        }
    }
}
