package com.p004ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.p004ironsource.a4;
import com.p004ironsource.aj;
import com.p004ironsource.ek;
import com.p004ironsource.fm;
import com.p004ironsource.fq;
import com.p004ironsource.ke;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.logger.d;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.vf;
import com.p004ironsource.z8;
import com.unity3d.mediation.LevelPlay;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class IronSourceUtils {
    private static final String DEFAULT_APP_EVENTS_FORMATTER_TYPE = "default_app_events_formatter_type";
    private static final String DEFAULT_APP_EVENTS_URL = "default_app_events_url";
    private static final String DEFAULT_APP_NON_CONNECTIVITY_EVENTS = "default_app_non_connectivity_events";
    private static final String DEFAULT_APP_OPT_IN_EVENTS = "default_app_opt_in_events";
    private static final String DEFAULT_APP_OPT_OUT_EVENTS = "default_app_opt_out_events";
    private static final String DEFAULT_APP_TRIGGER_EVENTS = "default_app_trigger_events";
    private static final String DEFAULT_IS_EVENTS_FORMATTER_TYPE = "default_is_events_formatter_type";
    private static final String DEFAULT_IS_EVENTS_URL = "default_is_events_url";
    private static final String DEFAULT_IS_NON_CONNECTIVITY_EVENTS = "default_is_non_connectivity_events";
    private static final String DEFAULT_IS_OPT_IN_EVENTS = "default_is_opt_in_events";
    private static final String DEFAULT_IS_OPT_OUT_EVENTS = "default_is_opt_out_events";
    private static final String DEFAULT_IS_TRIGGER_EVENTS = "default_is_trigger_events";
    private static final String DEFAULT_PXL_EVENTS_URL = "default_pxl_events_url";
    private static final String DEFAULT_PXL_TRIGGER_EVENTS = "default_pxl_trigger_events";
    private static final String DEFAULT_RV_EVENTS_FORMATTER_TYPE = "default_rv_events_formatter_type";
    private static final String DEFAULT_RV_EVENTS_URL = "default_rv_events_url";
    private static final String DEFAULT_RV_NON_CONNECTIVITY_EVENTS = "default_rv_non_connectivity_events";
    private static final String DEFAULT_RV_OPT_IN_EVENTS = "default_rv_opt_in_events";
    private static final String DEFAULT_RV_OPT_OUT_EVENTS = "default_rv_opt_out_events";
    private static final String DEFAULT_RV_TRIGGER_EVENTS = "default_rv_trigger_events";
    private static final String FIRST_SESSION_TIMESTAMP = "firstSessionTimestamp";
    private static final String GENERAL_PROPERTIES = "general_properties";
    private static final String LAST_RESPONSE = "last_response";
    private static final String PROVIDER_PRIORITY = "providerPriority";
    private static final String SDK_VERSION = "8.10.0";
    private static final String SHARED_PREFERENCES_NAME = "Mediation_Shared_Preferences";
    private static int serr = 1;
    private static AtomicBoolean mDidCreateSessionID = new AtomicBoolean(false);
    private static String mSessionId = null;
    private static Boolean mFirstSession = null;
    private static IronSourceUtils instance = new IronSourceUtils();

    public static void createAndStartWorker(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new d());
        thread.start();
    }

    public static JSONObject deepMergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objDeepMergeJSONObjects = jSONObject2.get(next);
            if ((objDeepMergeJSONObjects instanceof JSONObject) && jSONObject3.optJSONObject(next) != null) {
                objDeepMergeJSONObjects = deepMergeJSONObjects(jSONObject3.getJSONObject(next), (JSONObject) objDeepMergeJSONObjects);
            }
            jSONObject3.put(next, objDeepMergeJSONObjects);
        }
        return jSONObject3;
    }

    public static boolean doesClassExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Map<LevelPlay.AdFormat, Map<String, JSONObject>> getAdUnitIds() {
        HashMap map = new HashMap();
        try {
            fm fmVarA = on.U().t().a();
            if (fmVarA != null) {
                for (LevelPlay.AdFormat adFormat : LevelPlay.AdFormat.values()) {
                    HashMap map2 = new HashMap();
                    map.put(adFormat, map2);
                    for (String str : fmVarA.a(adFormat)) {
                        if (!str.equals(a4.f24256e)) {
                            map2.put(str, new JSONObject());
                        }
                    }
                }
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("failed to get ad unit ids - exception = " + e2);
        }
        return map;
    }

    public static String getBase64Auth(String str, String str2) {
        return "Basic " + Base64.encodeToString(a.D(str, ":", str2).getBytes(), 10);
    }

    public static boolean getBooleanFromSharedPrefs(Context context, String str, boolean z2) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getBoolean(str, z2);
    }

    public static String getConnectionType(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return z8.f27869b;
            }
            return networkCapabilities.hasTransport(0) ? z8.g : "none";
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.NATIVE.error("failed to connection type - exception = " + e2);
            return "none";
        }
    }

    public static String getCurrentMethodName() {
        try {
            return new Throwable().getStackTrace()[1].getMethodName();
        } catch (Exception e2) {
            q9.d().a(e2);
            return "";
        }
    }

    public static int getCurrentTimestamp() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static synchronized String getDefaultEventsFormatterType(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultFormatterTypeByEventType(str), str2);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e2);
        }
        return str2;
    }

    public static synchronized String getDefaultEventsURL(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultEventsUrlByEventType(str), str2);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e2);
        }
        return str2;
    }

    private static String getDefaultEventsUrlByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_EVENTS_URL;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_EVENTS_URL;
        }
        if (IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return DEFAULT_PXL_EVENTS_URL;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? DEFAULT_APP_EVENTS_URL : "";
    }

    private static String getDefaultFormatterTypeByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_EVENTS_FORMATTER_TYPE;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_EVENTS_FORMATTER_TYPE;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? DEFAULT_APP_EVENTS_FORMATTER_TYPE : "";
    }

    public static synchronized int[] getDefaultNonConnectivityEvents(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultNonConnectivityEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return iArr;
    }

    private static String getDefaultNonConnectivityEventsByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_NON_CONNECTIVITY_EVENTS;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_NON_CONNECTIVITY_EVENTS;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? DEFAULT_APP_NON_CONNECTIVITY_EVENTS : "";
    }

    public static synchronized int[] getDefaultOptInEvents(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptInEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return iArr;
    }

    private static String getDefaultOptInEventsByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_OPT_IN_EVENTS;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_OPT_IN_EVENTS;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? DEFAULT_APP_OPT_IN_EVENTS : "";
    }

    public static synchronized int[] getDefaultOptOutEvents(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptOutEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return iArr;
    }

    private static String getDefaultOptOutEventsByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_OPT_OUT_EVENTS;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_OPT_OUT_EVENTS;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? DEFAULT_APP_OPT_OUT_EVENTS : "";
    }

    public static synchronized int[] getDefaultTriggerEvents(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultTriggerEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return iArr;
    }

    private static String getDefaultTriggerEventsByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_TRIGGER_EVENTS;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_TRIGGER_EVENTS;
        }
        if (IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return DEFAULT_PXL_TRIGGER_EVENTS;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? DEFAULT_APP_TRIGGER_EVENTS : "";
    }

    public static String getDeviceType(Context context) {
        return on.U().f().s(context) ? "Tablet" : "Phone";
    }

    public static boolean getFirstSession(Context context) {
        if (mFirstSession == null) {
            mFirstSession = Boolean.valueOf(!aj.a(context));
        }
        return mFirstSession.booleanValue();
    }

    public static IronSourceUtils getInstance() {
        return instance;
    }

    public static int getIntFromSharedPrefs(Context context, String str, int i2) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getInt(str, i2);
    }

    public static ek getIronSourceAdvId(Context context) {
        String str;
        vf vfVarF = on.U().f();
        if (context == null) {
            return null;
        }
        String advertiserId = p.j().getAdvertiserId(context);
        if (TextUtils.isEmpty(advertiserId)) {
            advertiserId = vfVarF.M(context);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
            str = IronSourceConstants.TYPE_UUID;
        } else {
            str = IronSourceConstants.TYPE_GAID;
        }
        return new ek(advertiserId, str);
    }

    public static JSONObject getJsonForMetaData(String str, List<String> list, List<String> list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (int i3 = 0; i2 < list.size() && i3 < list2.size(); i3++) {
                String str2 = list.get(i2);
                String str3 = list2.get(i3);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i2++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + ";" + TextUtils.join(",", arrayList));
            return jSONObject;
        } catch (JSONException e2) {
            q9.d().a(e2);
            return jSONObject;
        }
    }

    public static JSONObject getJsonForUserId(boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z2) {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "dynamic");
                return jSONObject;
            }
        } catch (JSONException e2) {
            q9.d().a(e2);
        }
        return jSONObject;
    }

    public static String getLastResponse(Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(LAST_RESPONSE, "");
    }

    public static long getLongFromSharedPrefs(Context context, String str, long j) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getLong(str, j);
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (Throwable th) {
            q9.d().a(th);
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:null)", th);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, a.n("getMD5(input:", str, ")"), th);
            return "";
        }
    }

    public static JSONObject getMediationAdditionalData(boolean z2) {
        return getMediationAdditionalData(z2, false, 1);
    }

    public static String getMediationUserId() {
        return ke.a().a("userId");
    }

    @Deprecated
    public static String getSDKVersion() {
        return "8.10.0";
    }

    public static String getSHA256(String str) {
        try {
            return String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e2) {
            q9.d().a(e2);
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e2);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, a.n("getSHA256(input:", str, ")"), e2);
            return "";
        }
    }

    public static int getSerr() {
        return serr;
    }

    public static synchronized String getSessionId() {
        try {
            if (mDidCreateSessionID.compareAndSet(false, true)) {
                mSessionId = UUID.randomUUID().toString();
            }
        } catch (Throwable th) {
            throw th;
        }
        return mSessionId;
    }

    public static String getStringFromSharedPrefs(Context context, String str, String str2) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(str, str2);
    }

    public static long getTimestamp() {
        return System.currentTimeMillis();
    }

    public static String getTransId(long j, String str) {
        return getSHA256(j + p.j().k() + str);
    }

    public static String getUserIdForNetworks() {
        String strA = ke.a().a("userId");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return strA;
    }

    public static boolean isEncryptedResponse() {
        return serr == 1;
    }

    public static boolean isGooglePlayInstalled(Context context) {
        return fq.d(context);
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.NATIVE.error("failed to check if network is connected - exception = " + e2);
            return false;
        }
    }

    public static JSONObject mergeJsons(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (jSONObject == null && jSONObject2 == null) {
                return new JSONObject();
            }
            if (jSONObject == null) {
                return jSONObject2;
            }
            if (jSONObject2 == null) {
                return jSONObject;
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
            return jSONObject;
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public static List<Pair<String, String>> parseJsonToPairList(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        arrayList.add(new Pair(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return arrayList;
    }

    public static Map<String, String> parseJsonToStringMap(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        map.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return map;
    }

    public static void saveBooleanToSharedPrefs(Context context, String str, boolean z2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putBoolean(str, z2);
        editorEdit.apply();
    }

    public static synchronized void saveDefaultEventsFormatterType(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            editorEdit.putString(getDefaultFormatterTypeByEventType(str), str2);
            editorEdit.apply();
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e2);
        }
    }

    public static synchronized void saveDefaultEventsURL(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            editorEdit.putString(getDefaultEventsUrlByEventType(str), str2);
            editorEdit.apply();
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e2);
        }
    }

    public static synchronized void saveDefaultNonConnectivityEvents(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    string = sb.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(getDefaultNonConnectivityEventsByEventType(str), string);
                editorEdit.apply();
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void saveDefaultOptInEvents(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    string = sb.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(getDefaultOptInEventsByEventType(str), string);
                editorEdit.apply();
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void saveDefaultOptOutEvents(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    string = sb.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(getDefaultOptOutEventsByEventType(str), string);
                editorEdit.apply();
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void saveDefaultTriggerEvents(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    string = sb.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(getDefaultTriggerEventsByEventType(str), string);
                editorEdit.apply();
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void saveIntToSharedPrefs(Context context, String str, int i2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putInt(str, i2);
        editorEdit.apply();
    }

    public static synchronized void saveLastResponse(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putString(LAST_RESPONSE, str);
        editorEdit.apply();
    }

    public static void saveLongToSharedPrefs(Context context, String str, long j) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    public static void saveStringToSharedPrefs(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static synchronized void sendAutomationLog(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
    }

    private static void setSerr(int i2) {
        serr = i2;
    }

    public static JSONObject getMediationAdditionalData(boolean z2, boolean z3, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z2) {
                jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z3 && i2 != -1) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i2);
                return jSONObject;
            }
        } catch (JSONException e2) {
            q9.d().a(e2);
        }
        return jSONObject;
    }
}
