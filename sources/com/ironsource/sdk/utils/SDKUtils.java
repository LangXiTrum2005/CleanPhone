package com.ironsource.sdk.utils;

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
import com.ironsource.C0313e4;
import com.ironsource.C0395ie;
import com.ironsource.C0474n4;
import com.ironsource.C0514p8;
import com.ironsource.C0693z8;
import com.ironsource.InterfaceC0674y7;
import com.ironsource.Kb;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class SDKUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f30682a = "SDKUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f30683b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f30684c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f30685d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f30686e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f30687f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f30688g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Map<String, String> f30689h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f30690i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f30691j = new AtomicInteger(1);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f30691j;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    public static int convertDpToPx(int i10) {
        return (int) TypedValue.applyDimension(0, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static boolean copyFileFromBundleToStorage(Context context, C0693z8 c0693z8) {
        int iSaveFile;
        byte[] bArrA = C0313e4.a(context, c0693z8.getName());
        if (bArrA == null || bArrA.length == 0) {
            return false;
        }
        try {
            iSaveFile = IronSourceStorageUtils.saveFile(bArrA, c0693z8.getPath());
        } catch (Exception e10) {
            IronLog.INTERNAL.error("exception: " + e10.getMessage());
            iSaveFile = 0;
        }
        if (iSaveFile != 0) {
            return true;
        }
        IronLog.INTERNAL.verbose("failed to read bytes for " + c0693z8.getName());
        return false;
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C0474n4.d().a(e10);
            Logger.d(f30682a, "Failed decoding string " + e10.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j10) {
        return (int) ((j10 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e10) {
            C0474n4.d().a(e10);
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
            } catch (UnsupportedEncodingException e10) {
                e = e10;
                C0474n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            } catch (NoSuchAlgorithmException e11) {
                e = e11;
                C0474n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        } catch (UnsupportedEncodingException e12) {
            e = e12;
            messageDigest = null;
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static String fetchDemandSourceId(C0395ie c0395ie) {
        return fetchDemandSourceId(c0395ie.a());
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e10) {
                    C0474n4.d().a(e10);
                    Logger.i(f30682a, "flatMapToJsonAsStringfailed " + e10.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z10) {
        return z10 ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return f30683b;
    }

    public static String getControllerConfig() {
        return f30688g;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        if (TextUtils.isEmpty(f30686e)) {
            return !TextUtils.isEmpty(f30685d) ? f30685d : "";
        }
        return f30686e;
    }

    public static int getDebugMode() {
        return f30687f;
    }

    public static String getFileName(String str) {
        String[] strArrSplit = str.split(File.separator);
        try {
            return URLEncoder.encode(strArrSplit[strArrSplit.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f30689h;
    }

    public static String getLimitAdTracking() {
        return f30684c;
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (NoSuchAlgorithmException e10) {
            C0474n4.d().a(e10);
            throw new RuntimeException(e10);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(X3.d.f27717b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(X3.a.f27667b);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static JSONObject getNetworkFeatureConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectOptJSONObject = getNetworkConfiguration().optJSONObject(X3.a.f27686v);
            return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject : jSONObject;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public static JSONObject getOrientation(Context context) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(interfaceC0674y7A.A(context)));
            return jSONObject;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static C0514p8.e getProductType(String str) {
        C0514p8.e eVar = C0514p8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C0514p8.e eVar2 = C0514p8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "9.4.3";
    }

    public static String getTesterParameters() {
        return f30690i;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
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
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity) || (activity instanceof InlineStoreActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        String strI = interfaceC0674y7A.I(context);
        String strC = interfaceC0674y7A.c(context);
        if (!TextUtils.isEmpty(strI)) {
            f30683b = strI;
        }
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        f30684c = strC;
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
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j10) {
        return (int) ((j10 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f30688g = str;
        Kb.Q().y().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        f30685d = str;
    }

    public static void setCustomControllerUrl(String str) {
        f30686e = str;
    }

    public static void setDebugMode(int i10) {
        f30687f = i10;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f30689h = map;
    }

    public static void setTesterParameters(String str) {
        f30690i = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "none" : X3.i.C;
        }
        return X3.i.D;
    }

    public static String translateOrientation(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "none" : X3.i.C;
        }
        return X3.i.D;
    }

    public static String translateRequestedOrientation(int i10) {
        if (i10 == 0) {
            return X3.i.C;
        }
        if (i10 == 1) {
            return X3.i.D;
        }
        if (i10 == 11) {
            return X3.i.C;
        }
        if (i10 == 12) {
            return X3.i.D;
        }
        switch (i10) {
            case 6:
            case 8:
                return X3.i.C;
            case 7:
            case 9:
                return X3.i.D;
            default:
                return "none";
        }
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(f30688g);
            jSONObject2.put(str, jSONObject);
            f30688g = jSONObject2.toString();
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            Logger.i(f30682a, "Unable to update controllerConfigs: " + e10.toString());
        }
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(strOptString) ? strOptString : jSONObject.optString("demandSourceName");
    }
}
