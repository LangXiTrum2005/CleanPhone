package com.p004ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.p004ironsource.d9;
import com.p004ironsource.is;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mh;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.sdk.controller.ControllerActivity;
import com.p004ironsource.sdk.controller.OpenUrlActivity;
import com.p004ironsource.vf;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class SDKUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27163a = "SDKUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f27164b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f27165c = null;
    private static String d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f27166e = 0;
    private static String f = null;
    private static Map<String, String> g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f27167h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f27168i = new AtomicInteger(1);

    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        do {
            atomicInteger = f27168i;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    public static int convertDpToPx(int i2) {
        return (int) TypedValue.applyDimension(0, i2, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i2) {
        return (int) TypedValue.applyDimension(1, i2, Resources.getSystem().getDisplayMetrics());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            q9.d().a(e2);
            Logger.d(f27163a, "Failed decoding string " + e2.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j) {
        return (int) ((j * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e2) {
            q9.d().a(e2);
            return "";
        }
    }

    public static byte[] encrypt(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            try {
                messageDigest.reset();
                messageDigest.update(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                q9.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                q9.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e4) {
            e = e4;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static String fetchDemandSourceId(is isVar) {
        return fetchDemandSourceId(isVar.a());
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    Logger.i(f27163a, "flatMapToJsonAsStringfailed " + e2.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z2) {
        return z2 ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return f27164b;
    }

    public static String getControllerConfig() {
        return f;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(d) ? d : "";
    }

    public static int getDebugMode() {
        return f27166e;
    }

    public static String getFileName(String str) {
        String[] strArrSplit = str.split(File.separator);
        try {
            return URLEncoder.encode(strArrSplit[strArrSplit.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return g;
    }

    public static String getLimitAdTracking() {
        return f27165c;
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (NoSuchAlgorithmException e2) {
            q9.d().a(e2);
            throw new RuntimeException(e2);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(d9.d.f24663b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(d9.a.f24633b);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) {
        vf vfVarF = on.U().f();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(vfVarF.H(context)));
            return jSONObject;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }

    public static mh.e getProductType(String str) {
        mh.e eVar = mh.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        mh.e eVar2 = mh.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "8.10.0";
    }

    public static String getTesterParameters() {
        return f27167h;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception e2) {
            q9.d().a(e2);
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
        } catch (Exception e2) {
            q9.d().a(e2);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        vf vfVarF = on.U().f();
        String strP = vfVarF.p(context);
        String strA = vfVarF.a(context);
        if (!TextUtils.isEmpty(strP)) {
            f27164b = strP;
        }
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        f27165c = strA;
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap map = new HashMap();
        if (mapArr != null) {
            for (Map<String, String> map2 : mapArr) {
                if (map2 != null) {
                    map.putAll(map2);
                }
            }
        }
        return map;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j) {
        return (int) ((j / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f = str;
        on.O().n().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        d = str;
    }

    public static void setDebugMode(int i2) {
        f27166e = i2;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        g = map;
    }

    public static void setTesterParameters(String str) {
        f27167h = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? "none" : d9.h.C;
        }
        return d9.h.D;
    }

    public static String translateOrientation(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? "none" : d9.h.C;
        }
        return d9.h.D;
    }

    public static String translateRequestedOrientation(int i2) {
        if (i2 == 0) {
            return d9.h.C;
        }
        if (i2 == 1) {
            return d9.h.D;
        }
        if (i2 == 11) {
            return d9.h.C;
        }
        if (i2 == 12) {
            return d9.h.D;
        }
        switch (i2) {
            case 6:
            case 8:
                return d9.h.C;
            case 7:
            case 9:
                return d9.h.D;
            default:
                return "none";
        }
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(f);
            jSONObject2.put(str, jSONObject);
            f = jSONObject2.toString();
        } catch (JSONException e2) {
            q9.d().a(e2);
            Logger.i(f27163a, "Unable to update controllerConfigs: " + e2.toString());
        }
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(strOptString) ? strOptString : jSONObject.optString("demandSourceName");
    }
}
