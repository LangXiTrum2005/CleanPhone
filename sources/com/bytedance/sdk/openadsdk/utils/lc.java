package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.bc;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private static final AtomicReference<Boolean> Lxb = new AtomicReference<>(null);
    private static final AtomicReference<String> LD = new AtomicReference<>(null);

    private static PackageInfo JVA(Context context) {
        try {
            String str = Build.VERSION.SDK_INT <= 23 ? (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]) : (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String JXs(Context context) {
        try {
            AtomicReference<String> atomicReference = LD;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoLc = lc(context);
            String str2 = packageInfoLc != null ? packageInfoLc.versionName : "";
            while (!atomicReference.compareAndSet(null, str2) && atomicReference.get() == null) {
            }
            return str2;
        } catch (Throwable unused) {
            AtomicReference<String> atomicReference2 = LD;
            while (!atomicReference2.compareAndSet(null, "") && atomicReference2.get() == null) {
            }
            return "";
        }
    }

    public static int LD(Context context) {
        if (OY(context)) {
            return 1;
        }
        if (QAg(context)) {
            return 2;
        }
        return nBu(context) ? 3 : 4;
    }

    public static void Lxb(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (LD()) {
                com.bytedance.sdk.openadsdk.core.lk lkVarLxb = com.bytedance.sdk.openadsdk.core.lk.Lxb(context);
                lkVarLxb.Lxb("w_ver", JXs(context));
                lkVarLxb.Lxb("bp", LD(context));
                lkVarLxb.Lxb("is_fold", ebl(context) ? 1 : 0);
                lkVarLxb.Lxb("abi", Lxb());
                lkVarLxb.Lxb(bc.bu, lk(context));
                lkVarLxb.Lxb(CampaignEx.JSON_KEY_AAB, ZU(context));
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean OY(Context context) {
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

    private static boolean QAg(Context context) {
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

    public static int ZU(Context context) {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0011, B:9:0x0019, B:10:0x001d, B:12:0x0025, B:13:0x0029, B:15:0x002f, B:17:0x0035, B:18:0x0037, B:21:0x003e, B:24:0x0045, B:27:0x0057, B:28:0x005b, B:55:0x00a4, B:57:0x00aa, B:58:0x00ae, B:77:0x00db, B:78:0x00e0, B:79:0x00e5, B:80:0x00ea, B:60:0x00b2, B:63:0x00ba, B:66:0x00c2, B:69:0x00ca, B:81:0x00ee, B:82:0x00f2, B:85:0x00f9, B:48:0x008b, B:50:0x0091, B:51:0x0096, B:52:0x009b, B:30:0x005f, B:33:0x0067, B:36:0x006f, B:39:0x0077), top: B:95:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0011, B:9:0x0019, B:10:0x001d, B:12:0x0025, B:13:0x0029, B:15:0x002f, B:17:0x0035, B:18:0x0037, B:21:0x003e, B:24:0x0045, B:27:0x0057, B:28:0x005b, B:55:0x00a4, B:57:0x00aa, B:58:0x00ae, B:77:0x00db, B:78:0x00e0, B:79:0x00e5, B:80:0x00ea, B:60:0x00b2, B:63:0x00ba, B:66:0x00c2, B:69:0x00ca, B:81:0x00ee, B:82:0x00f2, B:85:0x00f9, B:48:0x008b, B:50:0x0091, B:51:0x0096, B:52:0x009b, B:30:0x005f, B:33:0x0067, B:36:0x006f, B:39:0x0077), top: B:95:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0011, B:9:0x0019, B:10:0x001d, B:12:0x0025, B:13:0x0029, B:15:0x002f, B:17:0x0035, B:18:0x0037, B:21:0x003e, B:24:0x0045, B:27:0x0057, B:28:0x005b, B:55:0x00a4, B:57:0x00aa, B:58:0x00ae, B:77:0x00db, B:78:0x00e0, B:79:0x00e5, B:80:0x00ea, B:60:0x00b2, B:63:0x00ba, B:66:0x00c2, B:69:0x00ca, B:81:0x00ee, B:82:0x00f2, B:85:0x00f9, B:48:0x008b, B:50:0x0091, B:51:0x0096, B:52:0x009b, B:30:0x005f, B:33:0x0067, B:36:0x006f, B:39:0x0077), top: B:95:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0011, B:9:0x0019, B:10:0x001d, B:12:0x0025, B:13:0x0029, B:15:0x002f, B:17:0x0035, B:18:0x0037, B:21:0x003e, B:24:0x0045, B:27:0x0057, B:28:0x005b, B:55:0x00a4, B:57:0x00aa, B:58:0x00ae, B:77:0x00db, B:78:0x00e0, B:79:0x00e5, B:80:0x00ea, B:60:0x00b2, B:63:0x00ba, B:66:0x00c2, B:69:0x00ca, B:81:0x00ee, B:82:0x00f2, B:85:0x00f9, B:48:0x008b, B:50:0x0091, B:51:0x0096, B:52:0x009b, B:30:0x005f, B:33:0x0067, B:36:0x006f, B:39:0x0077), top: B:95:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0011, B:9:0x0019, B:10:0x001d, B:12:0x0025, B:13:0x0029, B:15:0x002f, B:17:0x0035, B:18:0x0037, B:21:0x003e, B:24:0x0045, B:27:0x0057, B:28:0x005b, B:55:0x00a4, B:57:0x00aa, B:58:0x00ae, B:77:0x00db, B:78:0x00e0, B:79:0x00e5, B:80:0x00ea, B:60:0x00b2, B:63:0x00ba, B:66:0x00c2, B:69:0x00ca, B:81:0x00ee, B:82:0x00f2, B:85:0x00f9, B:48:0x008b, B:50:0x0091, B:51:0x0096, B:52:0x009b, B:30:0x005f, B:33:0x0067, B:36:0x006f, B:39:0x0077), top: B:95:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0011, B:9:0x0019, B:10:0x001d, B:12:0x0025, B:13:0x0029, B:15:0x002f, B:17:0x0035, B:18:0x0037, B:21:0x003e, B:24:0x0045, B:27:0x0057, B:28:0x005b, B:55:0x00a4, B:57:0x00aa, B:58:0x00ae, B:77:0x00db, B:78:0x00e0, B:79:0x00e5, B:80:0x00ea, B:60:0x00b2, B:63:0x00ba, B:66:0x00c2, B:69:0x00ca, B:81:0x00ee, B:82:0x00f2, B:85:0x00f9, B:48:0x008b, B:50:0x0091, B:51:0x0096, B:52:0x009b, B:30:0x005f, B:33:0x0067, B:36:0x006f, B:39:0x0077), top: B:95:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0011, B:9:0x0019, B:10:0x001d, B:12:0x0025, B:13:0x0029, B:15:0x002f, B:17:0x0035, B:18:0x0037, B:21:0x003e, B:24:0x0045, B:27:0x0057, B:28:0x005b, B:55:0x00a4, B:57:0x00aa, B:58:0x00ae, B:77:0x00db, B:78:0x00e0, B:79:0x00e5, B:80:0x00ea, B:60:0x00b2, B:63:0x00ba, B:66:0x00c2, B:69:0x00ca, B:81:0x00ee, B:82:0x00f2, B:85:0x00f9, B:48:0x008b, B:50:0x0091, B:51:0x0096, B:52:0x009b, B:30:0x005f, B:33:0x0067, B:36:0x006f, B:39:0x0077), top: B:95:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0011, B:9:0x0019, B:10:0x001d, B:12:0x0025, B:13:0x0029, B:15:0x002f, B:17:0x0035, B:18:0x0037, B:21:0x003e, B:24:0x0045, B:27:0x0057, B:28:0x005b, B:55:0x00a4, B:57:0x00aa, B:58:0x00ae, B:77:0x00db, B:78:0x00e0, B:79:0x00e5, B:80:0x00ea, B:60:0x00b2, B:63:0x00ba, B:66:0x00c2, B:69:0x00ca, B:81:0x00ee, B:82:0x00f2, B:85:0x00f9, B:48:0x008b, B:50:0x0091, B:51:0x0096, B:52:0x009b, B:30:0x005f, B:33:0x0067, B:36:0x006f, B:39:0x0077), top: B:95:0x0002 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean ebl(Context context) {
        boolean zQAg;
        boolean z;
        Boolean boolValueOf;
        byte b;
        try {
            AtomicReference<Boolean> atomicReference = Lxb;
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
            byte b2 = -1;
            if (TextUtils.isEmpty(lowerCase)) {
                zQAg = false;
            } else {
                switch (lowerCase.hashCode()) {
                    case -759499589:
                        if (!lowerCase.equals("xiaomi")) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case 3418016:
                        if (!lowerCase.equals("oppo")) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case 3620012:
                        if (!lowerCase.equals("vivo")) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 1864941562:
                        if (!lowerCase.equals("samsung")) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    zQAg = QAg();
                } else if (b == 1) {
                    zQAg = lc();
                } else {
                    if (b != 2) {
                        if (b != 3) {
                            zQAg = false;
                            z = true;
                        } else {
                            zQAg = ZU();
                        }
                        if (z && !TextUtils.isEmpty(lowerCase2)) {
                            switch (lowerCase2.hashCode()) {
                                case -759499589:
                                    if (lowerCase2.equals("xiaomi")) {
                                        b2 = 2;
                                    }
                                    break;
                                case 3418016:
                                    if (lowerCase2.equals("oppo")) {
                                        b2 = 0;
                                    }
                                    break;
                                case 3620012:
                                    if (lowerCase2.equals("vivo")) {
                                        b2 = 1;
                                    }
                                    break;
                                case 1864941562:
                                    if (lowerCase2.equals("samsung")) {
                                        b2 = 3;
                                    }
                                    break;
                            }
                            if (b2 != 0) {
                                zQAg = QAg();
                            } else if (b2 != 1) {
                                zQAg = lc();
                            } else if (b2 != 2) {
                                zQAg = JXs();
                            } else if (b2 != 3) {
                                zQAg = false;
                            } else {
                                zQAg = ZU();
                            }
                        }
                        boolValueOf = Boolean.valueOf(zQAg);
                        while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
                        }
                        return zQAg;
                    }
                    zQAg = JXs();
                }
            }
            z = false;
            if (z) {
                switch (lowerCase2.hashCode()) {
                    case -759499589:
                        if (lowerCase2.equals("xiaomi")) {
                            b2 = 2;
                        }
                        break;
                    case 3418016:
                        if (lowerCase2.equals("oppo")) {
                            b2 = 0;
                        }
                        break;
                    case 3620012:
                        if (lowerCase2.equals("vivo")) {
                            b2 = 1;
                        }
                        break;
                    case 1864941562:
                        if (lowerCase2.equals("samsung")) {
                            b2 = 3;
                        }
                        break;
                }
                if (b2 != 0) {
                    zQAg = QAg();
                } else if (b2 != 1) {
                    zQAg = lc();
                } else if (b2 != 2) {
                    zQAg = JXs();
                } else if (b2 != 3) {
                    zQAg = false;
                } else {
                    zQAg = ZU();
                }
            }
            boolValueOf = Boolean.valueOf(zQAg);
            while (!atomicReference.compareAndSet(null, boolValueOf)) {
            }
            return zQAg;
        } catch (Throwable unused) {
            AtomicReference<Boolean> atomicReference2 = Lxb;
            Boolean bool3 = Boolean.FALSE;
            while (!atomicReference2.compareAndSet(null, bool3) && atomicReference2.get() == null) {
            }
            return false;
        }
    }

    public static PackageInfo lc(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
            return packageInfo != null ? packageInfo : JVA(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String lk(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean nBu(Context context) {
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

    private static boolean ZU() {
        if (JVA()) {
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
            if (LD()) {
                String strLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("fold_config", "fold_samung", "");
                if (TextUtils.isEmpty(strLxb)) {
                    return false;
                }
                for (String str : strLxb.split(",")) {
                    if (lowerCase2.contains(str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean LD() {
        return com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("fold_config", "enable", 0) == 1;
    }

    private static boolean OY() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("BED", "isXiaomiFold return false " + th.getMessage());
            return false;
        }
    }

    private static boolean QAg() {
        if (nBu()) {
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
                if (LD()) {
                    String strLk = lk();
                    if (TextUtils.isEmpty(strLk)) {
                        return false;
                    }
                    for (String str : strLk.split(",")) {
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

    public static String lk() {
        return com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("fold_config", "fold_default", "");
    }

    private static boolean nBu() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException e) {
            e = e;
            com.bytedance.sdk.component.utils.sLN.Lxb("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (IllegalAccessException e2) {
            e = e2;
            com.bytedance.sdk.component.utils.sLN.Lxb("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (NoSuchMethodException e3) {
            e = e3;
            com.bytedance.sdk.component.utils.sLN.Lxb("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (InvocationTargetException e4) {
            e = e4;
            com.bytedance.sdk.component.utils.sLN.Lxb("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean JXs() {
        if (OY()) {
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
                if (LD()) {
                    String strLk = lk();
                    if (TextUtils.isEmpty(strLk)) {
                        return false;
                    }
                    for (String str : strLk.split(",")) {
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

    private static boolean lc() {
        if (ebl()) {
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
                if (LD()) {
                    String strLk = lk();
                    if (TextUtils.isEmpty(strLk)) {
                        return false;
                    }
                    for (String str : strLk.split(",")) {
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

    private static boolean JVA() {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD")) || "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("PAG_BANNER", "get ss fold device error: " + e.getMessage());
            return false;
        }
    }

    public static String Lxb() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void Lxb(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (LD()) {
                com.bytedance.sdk.openadsdk.core.lk lkVarLxb = com.bytedance.sdk.openadsdk.core.lk.Lxb(context);
                String strLD = lkVarLxb.LD("md", com.bytedance.sdk.openadsdk.core.QAg.LD().JXs());
                if (!TextUtils.isEmpty(strLD)) {
                    jSONObject.put("md", strLD);
                }
                int iLD = lkVarLxb.LD("bp", LD(context));
                if (iLD != 4) {
                    jSONObject.put("bp", iLD);
                }
                String strLD2 = lkVarLxb.LD(bc.bu, lk(context));
                if (!TextUtils.isEmpty(strLD2)) {
                    jSONObject.put(bc.bu, strLD2);
                }
                jSONObject.put("is_fold", lkVarLxb.LD("is_fold", ebl(context) ? 1 : 0));
                jSONObject.put(CampaignEx.JSON_KEY_AAB, lkVarLxb.LD(CampaignEx.JSON_KEY_AAB, ZU(context)));
                String strLD3 = lkVarLxb.LD("w_ver", JXs(context));
                if (!TextUtils.isEmpty(strLD3)) {
                    jSONObject.put("w_ver", strLD3);
                }
                String strLD4 = lkVarLxb.LD("abi", Lxb());
                if (TextUtils.isEmpty(strLD4)) {
                    return;
                }
                jSONObject.put("abi", strLD4);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean ebl() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", new Class[0]).invoke(null, new Object[0]));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("BED", "isVIVOFoldDevice return false " + th.getMessage());
            return false;
        }
    }
}
