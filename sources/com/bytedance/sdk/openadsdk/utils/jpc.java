package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p004ironsource.mediationsdk.metadata.a;
import com.p004ironsource.ne;
import com.smartdigimkt.q0.b;
import com.unity3d.services.core.fid.Constants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jpc {
    private static final AtomicReference<Boolean> qdl = new AtomicReference<>(null);
    private static final AtomicReference<String> ud = new AtomicReference<>(null);

    private static boolean jpc(Context context) {
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

    public static String lnr(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int mml(Context context) {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static PackageInfo mo(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
            return packageInfo != null ? packageInfo : rq(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String mzz(Context context) {
        try {
            AtomicReference<String> atomicReference = ud;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoMo = mo(context);
            String str2 = packageInfoMo != null ? packageInfoMo.versionName : "";
            while (!atomicReference.compareAndSet(null, str2) && atomicReference.get() == null) {
            }
            return str2;
        } catch (Throwable unused) {
            AtomicReference<String> atomicReference2 = ud;
            while (!atomicReference2.compareAndSet(null, "") && atomicReference2.get() == null) {
            }
            return "";
        }
    }

    public static void qdl(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ud()) {
                com.bytedance.sdk.openadsdk.core.lnr lnrVarQdl = com.bytedance.sdk.openadsdk.core.lnr.qdl();
                lnrVarQdl.qdl("w_ver", mzz(context));
                lnrVarQdl.qdl(b.h0, ud(context));
                lnrVarQdl.qdl("is_fold", wd(context) ? 1 : 0);
                lnrVarQdl.qdl("abi", qdl());
                lnrVarQdl.qdl("t_ver", lnr(context));
                lnrVarQdl.qdl("aab", mml(context));
            }
        } catch (Throwable unused) {
        }
    }

    private static PackageInfo rq(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean to(Context context) {
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

    private static boolean tvp(Context context) {
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

    public static int ud(Context context) {
        if (jpc(context)) {
            return 1;
        }
        if (tvp(context)) {
            return 2;
        }
        return to(context) ? 3 : 4;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean wd(Context context) {
        boolean zTvp;
        boolean z2;
        byte b2;
        try {
            AtomicReference<Boolean> atomicReference = qdl;
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
                Boolean bool2 = Boolean.FALSE;
                while (!atomicReference.compareAndSet(null, bool2) && atomicReference.get() == null) {
                }
                return false;
            }
            byte b3 = -1;
            if (TextUtils.isEmpty(lowerCase)) {
                zTvp = false;
                z2 = false;
            } else {
                switch (lowerCase.hashCode()) {
                    case -759499589:
                        if (!lowerCase.equals("xiaomi")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 3418016:
                        if (!lowerCase.equals("oppo")) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 3620012:
                        if (!lowerCase.equals("vivo")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 1864941562:
                        if (!lowerCase.equals("samsung")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    zTvp = tvp();
                } else if (b2 == 1) {
                    zTvp = mo();
                } else if (b2 == 2) {
                    zTvp = mzz();
                } else if (b2 != 3) {
                    zTvp = false;
                    z2 = true;
                } else {
                    zTvp = mml();
                }
                z2 = false;
            }
            if (z2 && !TextUtils.isEmpty(lowerCase2)) {
                switch (lowerCase2.hashCode()) {
                    case -759499589:
                        if (lowerCase2.equals("xiaomi")) {
                            b3 = 2;
                        }
                        break;
                    case 3418016:
                        if (lowerCase2.equals("oppo")) {
                            b3 = 0;
                        }
                        break;
                    case 3620012:
                        if (lowerCase2.equals("vivo")) {
                            b3 = 1;
                        }
                        break;
                    case 1864941562:
                        if (lowerCase2.equals("samsung")) {
                            b3 = 3;
                        }
                        break;
                }
                if (b3 == 0) {
                    zTvp = tvp();
                } else if (b3 == 1) {
                    zTvp = mo();
                } else if (b3 != 2) {
                    zTvp = b3 != 3 ? false : mml();
                } else {
                    zTvp = mzz();
                }
            }
            Boolean boolValueOf = Boolean.valueOf(zTvp);
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
            return zTvp;
        } catch (Throwable unused) {
            AtomicReference<Boolean> atomicReference2 = qdl;
            Boolean bool3 = Boolean.FALSE;
            while (!atomicReference2.compareAndSet(null, bool3) && atomicReference2.get() == null) {
            }
            return false;
        }
    }

    private static boolean mml() {
        if (rq()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i2 = 0; i2 < 12; i2++) {
                    if (lowerCase.contains(strArr2[i2])) {
                        return true;
                    }
                }
            }
            String lowerCase2 = Build.MODEL.toLowerCase();
            if (TextUtils.isEmpty(lowerCase2)) {
                return false;
            }
            for (int i3 = 0; i3 < 12; i3++) {
                if (lowerCase2.contains(strArr[i3])) {
                    return true;
                }
            }
            if (ud()) {
                String strQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("fold_config", "fold_samung", "");
                if (TextUtils.isEmpty(strQdl)) {
                    return false;
                }
                for (String str : strQdl.split(",")) {
                    if (lowerCase2.contains(str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean jpc() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "isXiaomiFold return false " + th.getMessage());
            return false;
        }
    }

    public static String lnr() {
        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("fold_config", "fold_default", "");
    }

    private static boolean to() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (ClassNotFoundException e2) {
            e = e2;
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (IllegalAccessException e3) {
            e = e3;
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (NoSuchMethodException e4) {
            e = e4;
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (InvocationTargetException e5) {
            e = e5;
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean tvp() {
        if (to()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i2 = 0; i2 < 9; i2++) {
                    if (lowerCase.contains(strArr[i2].toLowerCase())) {
                        return true;
                    }
                }
                if (ud()) {
                    String strLnr = lnr();
                    if (TextUtils.isEmpty(strLnr)) {
                        return false;
                    }
                    for (String str : strLnr.split(",")) {
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

    public static boolean ud() {
        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("fold_config", a.j, 0) == 1;
    }

    private static boolean mzz() {
        if (jpc()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i2 = 0; i2 < 6; i2++) {
                    if (lowerCase.contains(strArr[i2])) {
                        return true;
                    }
                }
                if (ud()) {
                    String strLnr = lnr();
                    if (TextUtils.isEmpty(strLnr)) {
                        return false;
                    }
                    for (String str : strLnr.split(",")) {
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

    private static boolean rq() {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD")) || "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("PAG_BANNER", "get ss fold device error: " + e2.getMessage());
            return false;
        }
    }

    private static boolean mo() {
        if (wd()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i2 = 0; i2 < 7; i2++) {
                    if (lowerCase.contains(strArr[i2].toLowerCase())) {
                        return true;
                    }
                }
                if (ud()) {
                    String strLnr = lnr();
                    if (TextUtils.isEmpty(strLnr)) {
                        return false;
                    }
                    for (String str : strLnr.split(",")) {
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

    public static String qdl() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void qdl(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ud()) {
                com.bytedance.sdk.openadsdk.core.lnr lnrVarQdl = com.bytedance.sdk.openadsdk.core.lnr.qdl();
                String strUd = lnrVarQdl.ud(ne.f26279u, com.bytedance.sdk.openadsdk.core.tvp.ud().wd());
                if (!TextUtils.isEmpty(strUd)) {
                    jSONObject.put(ne.f26279u, strUd);
                }
                int iUd = lnrVarQdl.ud(b.h0, ud(context));
                if (iUd != 4) {
                    jSONObject.put(b.h0, iUd);
                }
                String strUd2 = lnrVarQdl.ud("t_ver", lnr(context));
                if (!TextUtils.isEmpty(strUd2)) {
                    jSONObject.put("t_ver", strUd2);
                }
                jSONObject.put("is_fold", lnrVarQdl.ud("is_fold", wd(context) ? 1 : 0));
                jSONObject.put("aab", lnrVarQdl.ud("aab", mml(context)));
                String strUd3 = lnrVarQdl.ud("w_ver", mzz(context));
                if (!TextUtils.isEmpty(strUd3)) {
                    jSONObject.put("w_ver", strUd3);
                }
                String strUd4 = lnrVarQdl.ud("abi", qdl());
                if (TextUtils.isEmpty(strUd4)) {
                    return;
                }
                jSONObject.put("abi", strUd4);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean wd() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", new Class[0]).invoke(null, new Object[0]));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "isVIVOFoldDevice return false " + th.getMessage());
            return false;
        }
    }
}
