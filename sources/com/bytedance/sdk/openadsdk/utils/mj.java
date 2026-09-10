package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ironsource.L6;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.fid.Constants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import saneness.retroflection;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private static final AtomicReference<Boolean> ri = new AtomicReference<>(null);
    private static final AtomicReference<String> lr = new AtomicReference<>(null);

    public static PackageInfo di(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return packageInfo != null ? packageInfo : sf(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String fi(Context context) {
        try {
            AtomicReference<String> atomicReference = lr;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoDi = di(context);
            String str2 = packageInfoDi != null ? packageInfoDi.versionName : "";
            retroflection.attabal(atomicReference, null, str2);
            return str2;
        } catch (Throwable unused) {
            retroflection.attabal(lr, null, "");
            return "";
        }
    }

    public static String ik(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean jbs(Context context) {
        try {
            Class.forName("io.flutter.embedding.android.FlutterActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static int ka(Context context) {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static int lr(Context context) {
        if (mj(context)) {
            return 1;
        }
        if (jbs(context)) {
            return 2;
        }
        return qt(context) ? 3 : 4;
    }

    private static boolean mj(Context context) {
        try {
            Class.forName("com.unity3d.player.UnityPlayerActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean qt(Context context) {
        try {
            Class.forName("com.facebook.react.ReactActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static void ri(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (lr()) {
                com.bytedance.sdk.openadsdk.core.ik ikVarRi = com.bytedance.sdk.openadsdk.core.ik.ri();
                ikVarRi.ri("w_ver", fi(context));
                ikVarRi.ri("bp", lr(context));
                ikVarRi.ri("is_fold", xha(context) ? 1 : 0);
                ikVarRi.ri("abi", ri());
                ikVarRi.ri("t_ver", ik(context));
                ikVarRi.ri(CampaignEx.JSON_KEY_AAB, ka(context));
            }
        } catch (Throwable unused) {
        }
    }

    private static PackageInfo sf(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean xha(Context context) {
        boolean z;
        boolean zFi;
        boolean zFi2;
        try {
            AtomicReference<Boolean> atomicReference = ri;
            Boolean bool = atomicReference.get();
            if (bool != null) {
                return bool.booleanValue();
            }
            String lowerCase = Build.BRAND;
            if (!TextUtils.isEmpty(lowerCase)) {
                lowerCase = lowerCase.toLowerCase();
            }
            String lowerCase2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(lowerCase2)) {
                lowerCase2 = lowerCase2.toLowerCase();
            }
            if (TextUtils.isEmpty(lowerCase) && TextUtils.isEmpty(lowerCase2)) {
                retroflection.attabal(atomicReference, null, Boolean.FALSE);
                return false;
            }
            if (!TextUtils.isEmpty(lowerCase)) {
                switch (lowerCase.hashCode()) {
                    case -759499589:
                        if (!lowerCase.equals("xiaomi")) {
                            z = true;
                            zFi = false;
                        } else {
                            zFi2 = fi();
                            zFi = zFi2;
                            z = false;
                        }
                        break;
                    case 3418016:
                        if (!lowerCase.equals("oppo")) {
                            z = true;
                            zFi = false;
                        } else {
                            zFi2 = jbs();
                            zFi = zFi2;
                            z = false;
                        }
                        break;
                    case 3620012:
                        if (!lowerCase.equals("vivo")) {
                            z = true;
                            zFi = false;
                        } else {
                            zFi2 = di();
                            zFi = zFi2;
                            z = false;
                        }
                        break;
                    case 1864941562:
                        if (!lowerCase.equals("samsung")) {
                            z = true;
                            zFi = false;
                        } else {
                            zFi2 = ka();
                            zFi = zFi2;
                            z = false;
                        }
                        break;
                    default:
                        z = true;
                        zFi = false;
                        break;
                }
            } else {
                z = false;
                zFi = false;
            }
            if (z && !TextUtils.isEmpty(lowerCase2)) {
                switch (lowerCase2.hashCode()) {
                    case -759499589:
                        if (!lowerCase2.equals("xiaomi")) {
                            zFi = false;
                        } else {
                            zFi = fi();
                        }
                        break;
                    case 3418016:
                        if (!lowerCase2.equals("oppo")) {
                            zFi = false;
                        } else {
                            zFi = jbs();
                        }
                        break;
                    case 3620012:
                        if (!lowerCase2.equals("vivo")) {
                            zFi = false;
                        } else {
                            zFi = di();
                        }
                        break;
                    case 1864941562:
                        if (!lowerCase2.equals("samsung")) {
                            zFi = false;
                        } else {
                            zFi = ka();
                        }
                        break;
                    default:
                        zFi = false;
                        break;
                }
            }
            retroflection.attabal(atomicReference, null, Boolean.valueOf(zFi));
            return zFi;
        } catch (Throwable unused) {
            retroflection.attabal(ri, null, Boolean.FALSE);
            return false;
        }
    }

    private static boolean ka() {
        if (sf()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 12; i++) {
                    if (lowerCase.contains(strArr2[i])) {
                        return true;
                    }
                }
            }
            String lowerCase2 = Build.MODEL.toLowerCase();
            if (TextUtils.isEmpty(lowerCase2)) {
                return false;
            }
            for (int i2 = 0; i2 < 12; i2++) {
                if (lowerCase2.contains(strArr[i2])) {
                    return true;
                }
            }
            if (lr()) {
                String strRi = com.bytedance.sdk.openadsdk.wjv.fi.ri("fold_config", "fold_samung", "");
                if (TextUtils.isEmpty(strRi)) {
                    return false;
                }
                for (String str : strRi.split(",")) {
                    if (lowerCase2.contains(str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String ik() {
        return com.bytedance.sdk.openadsdk.wjv.fi.ri("fold_config", "fold_default", "");
    }

    private static boolean jbs() {
        if (qt()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 9; i++) {
                    if (lowerCase.contains(strArr[i].toLowerCase())) {
                        return true;
                    }
                }
                if (lr()) {
                    String strIk = ik();
                    if (TextUtils.isEmpty(strIk)) {
                        return false;
                    }
                    for (String str : strIk.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void lr(JSONObject jSONObject, Context context) {
        try {
            if (lr()) {
                String strLr = com.bytedance.sdk.openadsdk.core.ik.ri().lr("w_ver", fi(context));
                if (TextUtils.isEmpty(strLr)) {
                    return;
                }
                jSONObject.put("w_ver", strLr);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean mj() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("BED", "isXiaomiFold return false " + th.getMessage());
            return false;
        }
    }

    private static boolean qt() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            com.bytedance.sdk.component.utils.ac.ik("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean fi() {
        if (mj()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 6; i++) {
                    if (lowerCase.contains(strArr[i])) {
                        return true;
                    }
                }
                if (lr()) {
                    String strIk = ik();
                    if (TextUtils.isEmpty(strIk)) {
                        return false;
                    }
                    for (String str : strIk.split(",")) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean sf() {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD")) || "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            com.bytedance.sdk.component.utils.ac.ik("PAG_BANNER", "get ss fold device error: " + e.getMessage());
            return false;
        }
    }

    private static boolean di() {
        if (xha()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 7; i++) {
                    if (lowerCase.contains(strArr[i].toLowerCase())) {
                        return true;
                    }
                }
                if (lr()) {
                    String strIk = ik();
                    if (TextUtils.isEmpty(strIk)) {
                        return false;
                    }
                    for (String str : strIk.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean lr() {
        return com.bytedance.sdk.openadsdk.wjv.fi.ri("fold_config", a.j, 0) == 1;
    }

    public static String ri() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void ri(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (lr()) {
                com.bytedance.sdk.openadsdk.core.ik ikVarRi = com.bytedance.sdk.openadsdk.core.ik.ri();
                String strLr = ikVarRi.lr(L6.u, com.bytedance.sdk.openadsdk.core.qt.lr().xha());
                if (!TextUtils.isEmpty(strLr)) {
                    jSONObject.put(L6.u, strLr);
                }
                int iLr = ikVarRi.lr("bp", lr(context));
                if (iLr != 4) {
                    jSONObject.put("bp", iLr);
                }
                String strLr2 = ikVarRi.lr("t_ver", ik(context));
                if (!TextUtils.isEmpty(strLr2)) {
                    jSONObject.put("t_ver", strLr2);
                }
                jSONObject.put("is_fold", ikVarRi.lr("is_fold", xha(context) ? 1 : 0));
                jSONObject.put(CampaignEx.JSON_KEY_AAB, ikVarRi.lr(CampaignEx.JSON_KEY_AAB, ka(context)));
                String strLr3 = ikVarRi.lr("abi", ri());
                if (TextUtils.isEmpty(strLr3)) {
                    return;
                }
                jSONObject.put("abi", strLr3);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean xha() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", null).invoke(null, null));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("BED", "isVIVOFoldDevice return false " + th.getMessage());
            return false;
        }
    }
}
