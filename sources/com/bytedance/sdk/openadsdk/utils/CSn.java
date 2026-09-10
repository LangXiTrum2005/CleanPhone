package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class CSn {
    private static String JXs = null;
    public static boolean LD = false;
    public static boolean Lxb = false;
    private static int lc = Integer.MAX_VALUE;
    private static final CharSequence lk = "amigo";
    private static final CharSequence ZU = "funtouch";
    private static final ConcurrentHashMap<String, String> ebl = new ConcurrentHashMap<>();

    public static class Lxb implements Callable<String> {
        private final String Lxb;

        public Lxb(String str) {
            this.Lxb = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) CSn.ebl.get(this.Lxb);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String strLk = CSn.lk(this.Lxb);
            System.currentTimeMillis();
            if (strLk != null) {
                CSn.ebl.put(this.Lxb, strLk);
            }
            return strLk;
        }
    }

    public static boolean DY() {
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

    private static String HD() {
        if (IeN()) {
            return VVE();
        }
        if (JXs()) {
            return sLN();
        }
        if (LD()) {
            return kqm();
        }
        if (brP()) {
            return tD();
        }
        String strNXR = NXR();
        if (!TextUtils.isEmpty(strNXR)) {
            return strNXR;
        }
        if (ebl()) {
            return lc();
        }
        if (OY()) {
            return QAg();
        }
        if (ZU()) {
            return lk();
        }
        String strNBu = nBu();
        return !TextUtils.isEmpty(strNBu) ? strNBu : Build.DISPLAY;
    }

    public static boolean IeN() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean JVA() {
        return !TextUtils.isEmpty(ZU("ro.letv.release.version"));
    }

    public static boolean JXs() {
        if (!LD) {
            try {
                Class.forName("miui.os.Build");
                Lxb = true;
                LD = true;
                return true;
            } catch (Exception unused) {
                LD = true;
            }
        }
        return Lxb;
    }

    public static String Lxb() {
        if (!TextUtils.isEmpty(JXs)) {
            return JXs;
        }
        String strLxb = com.bytedance.sdk.openadsdk.core.QAg.Lxb("sdk_local_rom_info", 604800000L);
        JXs = strLxb;
        if (TextUtils.isEmpty(strLxb)) {
            String strHD = HD();
            JXs = strHD;
            com.bytedance.sdk.openadsdk.core.QAg.Lxb("sdk_local_rom_info", strHD);
        }
        return JXs;
    }

    public static String NXR() {
        String strSTP = STP();
        if (strSTP == null || !strSTP.toLowerCase().contains("emotionui")) {
            return "";
        }
        StringBuilder sbQ = DM.q(strSTP, "_");
        sbQ.append(Build.DISPLAY);
        return sbQ.toString();
    }

    public static boolean OY() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(lk);
    }

    public static String QAg() {
        return Build.DISPLAY + "_" + ZU("ro.gn.sv.version");
    }

    public static String STP() {
        return ZU("ro.build.version.emui");
    }

    public static String VVE() {
        if (IeN()) {
            try {
                return "smartisan_".concat(String.valueOf(ZU("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static boolean ZU() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean brP() {
        if (lc == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strEbl = nJ.ebl("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strEbl)) {
                lc = 0;
            } else {
                lc = 1;
            }
        }
        return lc == 1;
    }

    public static boolean ebl() {
        String strZU = ZU("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strZU) && strZU.toLowerCase().contains(ZU);
    }

    public static String kqm() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static String lc() {
        return ZU("ro.vivo.os.build.display.id") + "_" + ZU("ro.vivo.product.version");
    }

    public static String lk() {
        return ZU("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static String nBu() {
        if (!JVA()) {
            return "";
        }
        return "eui_" + ZU("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static String sLN() {
        if (!JXs()) {
            return "";
        }
        return "miui_" + ZU("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    public static String tD() {
        if (!brP()) {
            return "";
        }
        return "coloros_" + ZU(nJ.ebl("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
    }

    public static boolean LD() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String lk(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        String line = "";
        Process process = null;
        try {
            try {
                try {
                    Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
                        try {
                            line = bufferedReader.readLine();
                            processExec.exitValue();
                            bufferedReader.close();
                        } catch (IllegalThreadStateException unused) {
                            process = processExec;
                            try {
                                process.destroy();
                            } catch (Throwable unused2) {
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return line;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                com.bytedance.sdk.component.utils.sLN.Lxb("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                                return line;
                            } finally {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e) {
                                        com.bytedance.sdk.component.utils.sLN.Lxb("ToolUtils", "Exception while closing InputStream", e);
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
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        } catch (IOException e2) {
            com.bytedance.sdk.component.utils.sLN.Lxb("ToolUtils", "Exception while closing InputStream", e2);
        }
        return line;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String ZU(String str) {
        String str2;
        String str3 = ebl.get(str);
        if (str3 != null) {
            return str3;
        }
        try {
            if (!TextUtils.isEmpty("")) {
                str2 = "";
            } else {
                final com.bytedance.sdk.component.OY.ebl eblVar = new com.bytedance.sdk.component.OY.ebl(new Lxb(str), 5, 2);
                hg.LD(new com.bytedance.sdk.component.OY.OY("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.CSn.1
                    @Override // java.lang.Runnable
                    public void run() {
                        eblVar.run();
                    }
                });
                str2 = (String) eblVar.get(1L, TimeUnit.SECONDS);
            }
        } catch (Throwable unused) {
        }
        return str2 == null ? "" : str2;
    }

    public static boolean Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            str = STP();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || DY();
    }
}
