package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class igq {
    private static int di = Integer.MAX_VALUE;
    private static String fi = null;
    public static boolean lr = false;
    public static boolean ri = false;
    private static final CharSequence ik = "amigo";
    private static final CharSequence ka = "funtouch";
    private static final ConcurrentHashMap<String, String> xha = new ConcurrentHashMap<>();

    public static class ri implements Callable<String> {
        private final String ri;

        public ri(String str) {
            this.ri = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) igq.xha.get(this.ri);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String strIk = igq.ik(this.ri);
            System.currentTimeMillis();
            if (strIk != null) {
                igq.xha.put(this.ri, strIk);
            }
            return strIk;
        }
    }

    public static boolean ac() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2) || !str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String aw() {
        String strBgr = bgr();
        if (strBgr == null || !strBgr.toLowerCase().contains("emotionui")) {
            return "";
        }
        return strBgr + "_" + Build.DISPLAY;
    }

    public static String bgr() {
        return ka("ro.build.version.emui");
    }

    public static String bu() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static String co() {
        if (!fi()) {
            return "";
        }
        return "miui_" + ka("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    public static String di() {
        return ka("ro.vivo.os.build.display.id") + "_" + ka("ro.vivo.product.version");
    }

    public static boolean fi() {
        if (!lr) {
            try {
                Class.forName("miui.os.Build");
                ri = true;
                lr = true;
                return true;
            } catch (Exception unused) {
                lr = true;
            }
        }
        return ri;
    }

    public static String ik() {
        return ka("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static String jbs() {
        return Build.DISPLAY + "_" + ka("ro.gn.sv.version");
    }

    public static boolean ka() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean mj() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(ik);
    }

    public static boolean nr() {
        if (di == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strMj = ig.mj("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strMj)) {
                di = 0;
            } else {
                di = 1;
            }
        }
        return di == 1;
    }

    public static String qt() {
        if (!sf()) {
            return "";
        }
        return "eui_" + ka("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static String ri() {
        if (!TextUtils.isEmpty(fi)) {
            return fi;
        }
        String strRi = com.bytedance.sdk.openadsdk.core.qt.ri("sdk_local_rom_info", 604800000L);
        fi = strRi;
        if (TextUtils.isEmpty(strRi)) {
            String strUq = uq();
            fi = strUq;
            com.bytedance.sdk.openadsdk.core.qt.ri("sdk_local_rom_info", strUq);
        }
        return fi;
    }

    public static boolean sf() {
        return !TextUtils.isEmpty(ka("ro.letv.release.version"));
    }

    public static String slm() {
        if (vr()) {
            try {
                return "smartisan_".concat(String.valueOf(ka("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String tan() {
        if (!nr()) {
            return "";
        }
        return "coloros_" + ka(ig.mj("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
    }

    private static String uq() {
        if (vr()) {
            return slm();
        }
        if (fi()) {
            return co();
        }
        if (lr()) {
            return bu();
        }
        if (nr()) {
            return tan();
        }
        String strAw = aw();
        if (!TextUtils.isEmpty(strAw)) {
            return strAw;
        }
        if (xha()) {
            return di();
        }
        if (mj()) {
            return jbs();
        }
        if (ka()) {
            return ik();
        }
        String strQt = qt();
        return !TextUtils.isEmpty(strQt) ? strQt : Build.DISPLAY;
    }

    public static boolean vr() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean xha() {
        String strKa = ka("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strKa) && strKa.toLowerCase().contains(ka);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ik(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        String line = "";
        Process process = null;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
                    try {
                        line = bufferedReader.readLine();
                        processExec.exitValue();
                    } catch (IllegalThreadStateException unused) {
                        process = processExec;
                        try {
                            process.destroy();
                        } catch (Throwable unused2) {
                        }
                        if (bufferedReader != null) {
                        }
                        return line;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.utils.ac.ri("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                            return line;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e) {
                                    com.bytedance.sdk.component.utils.ac.ri("ToolUtils", "Exception while closing InputStream", e);
                                }
                            }
                        }
                    }
                } catch (IllegalThreadStateException unused3) {
                    bufferedReader = null;
                }
            } catch (IllegalThreadStateException unused4) {
                bufferedReader = null;
            }
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                com.bytedance.sdk.component.utils.ac.ri("ToolUtils", "Exception while closing InputStream", e2);
            }
            return line;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static boolean lr() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String ka(String str) {
        String str2;
        String str3 = xha.get(str);
        if (str3 != null) {
            return str3;
        }
        try {
            if (!TextUtils.isEmpty("")) {
                str2 = "";
            } else {
                final com.bytedance.sdk.component.mj.lr.lr lrVar = new com.bytedance.sdk.component.mj.lr.lr(new ri(str), 5, 2);
                dzy.ik((Runnable) new com.bytedance.sdk.component.mj.lr.ik("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.igq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lrVar.run();
                    }
                });
                str2 = (String) lrVar.get(1L, TimeUnit.SECONDS);
            }
        } catch (Throwable unused) {
        }
        return str2 == null ? "" : str2;
    }

    public static boolean ri(String str) {
        if (TextUtils.isEmpty(str)) {
            str = bgr();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || ac();
    }
}
