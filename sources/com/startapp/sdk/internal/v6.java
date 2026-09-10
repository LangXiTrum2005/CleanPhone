package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class v6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f41562c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] d = {"goldfish"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f41563e = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] f = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] g = {"fstab.andy", "ueventd.andy.rc"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f41564h = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final se[] f41565i = {new se("init.svc.qemud", null), new se("init.svc.qemu-props", null), new se("qemu.hw.mainkeys", null), new se("qemu.sf.fake_camera", null), new se("qemu.sf.lcd_density", null), new se("ro.bootloader", "unknown"), new se("ro.bootmode", "unknown"), new se("ro.hardware", "goldfish"), new se("ro.kernel.android.qemud", null), new se("ro.kernel.qemu.gles", null), new se("ro.kernel.qemu", "1"), new se("ro.product.device", "generic"), new se("ro.product.model", "sdk"), new se("ro.product.name", "sdk"), new se("ro.serialno", null), new se("ro.build.description", "72656C656173652D6B657973"), new se("ro.build.fingerprint", "3A757365722F72656C656173652D6B657973"), new se("net.eth0.dns1", null), new se("rild.libpath", "2F73797374656D2F6C69622F6C69627265666572656E63652D72696C2E736F"), new se("ro.radio.use-ppp", null), new se("gsm.version.baseband", null), new se("ro.build.tags", "72656C656173652D6B65"), new se("ro.build.display.id", "746573742D"), new se("init.svc.console", null)};
    public static v6 j;
    public static Boolean k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41567b;

    public v6(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f41567b = arrayList;
        this.f41566a = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01dd A[Catch: Exception -> 0x01e9, LOOP:2: B:110:0x01d7->B:112:0x01dd, LOOP_END, TryCatch #3 {Exception -> 0x01e9, blocks: (B:109:0x01bb, B:110:0x01d7, B:112:0x01dd, B:113:0x01e6), top: B:179:0x01bb }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:128:0x0223  */
    /* JADX WARN: Code duplicated, block: B:131:0x022b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0267 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x027a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0287  */
    /* JADX WARN: Code duplicated, block: B:153:0x028a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0293  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02be A[EDGE_INSN: B:164:0x02be->B:166:0x02c1 BREAK  A[LOOP:5: B:157:0x029f->B:210:0x029f]] */
    /* JADX WARN: Code duplicated, block: B:165:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:198:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0275 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    public static boolean a(Context context) throws Throwable {
        boolean z2;
        PackageManager packageManager;
        Iterator it;
        Intent launchIntentForPackage;
        se[] seVarArr;
        int i2;
        int i3;
        String str;
        String str2;
        StringBuilder sb;
        String string;
        String[] strArrSplit;
        int length;
        int i4;
        String str3;
        InputStream inputStream;
        byte[] bArr;
        BufferedReader bufferedReader;
        boolean z3 = true;
        if (k == null) {
            if (j == null) {
                Context contextA = x0.a(context);
                if (contextA != null) {
                    context = contextA;
                }
                j = new v6(context);
            }
            v6 v6Var = j;
            v6Var.getClass();
            String str4 = Build.FINGERPRINT;
            if (str4.startsWith("generic")) {
                z2 = true;
            } else {
                String str5 = Build.MODEL;
                if (str5.contains("google_sdk")) {
                    z2 = true;
                } else {
                    Locale locale = Locale.ROOT;
                    if (str5.toLowerCase(locale).contains("droid4x") || str5.contains("Emulator") || str5.contains("Android SDK built for") || Build.MANUFACTURER.contains("Genymotion")) {
                        z2 = true;
                    } else {
                        String str6 = Build.HARDWARE;
                        if (str6.equals("goldfish") || str6.equals("vbox86")) {
                            z2 = true;
                        } else {
                            String str7 = Build.PRODUCT;
                            if (str7.equals("sdk") || str7.equals("google_sdk") || str7.equals("sdk_x86") || str7.equals("vbox86p") || Build.BOARD.toLowerCase(locale).contains("nox") || Build.BOOTLOADER.toLowerCase(locale).contains("nox") || str6.toLowerCase(locale).contains("nox") || str7.toLowerCase(locale).contains("nox") || str4.startsWith("unknown") || str4.contains("Andy") || str4.contains("ttVM_Hdragon") || str4.contains("vbox86p") || str6.contains("ttVM_x86") || str5.equals("sdk") || str5.contains("Droid4X") || str5.contains("TiantianVM") || str5.contains("Andy") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic"))) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                    }
                }
            }
            if (!z2) {
                if (v6Var.a(f41562c, "Geny") || v6Var.a(g, "Andy") || v6Var.a(f41564h, "Nox")) {
                    z2 = true;
                } else {
                    File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
                    int i5 = 0;
                    while (true) {
                        BufferedReader bufferedReader2 = null;
                        if (i5 < 2) {
                            File file = fileArr[i5];
                            if (file.exists() && file.canRead()) {
                                char[] cArr = new char[1024];
                                StringBuilder sb2 = new StringBuilder();
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                                    while (true) {
                                        try {
                                            int i6 = bufferedReader.read(cArr);
                                            if (i6 != -1) {
                                                sb2.append(cArr, 0, i6);
                                            } else {
                                                try {
                                                    break;
                                                } catch (IOException unused) {
                                                }
                                            }
                                        } catch (Exception unused2) {
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (IOException unused3) {
                                                }
                                            }
                                            if (v6Var.a(f41563e, "Pipes")) {
                                                try {
                                                    if (v6Var.f41566a.checkSelfPermission("android.permission.INTERNET") == 0) {
                                                        String[] strArr = {"/system/bin/netcfg"};
                                                        sb = new StringBuilder();
                                                        try {
                                                            ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                                                            processBuilder.directory(new File("/system/bin/"));
                                                            processBuilder.redirectErrorStream(true);
                                                            inputStream = processBuilder.start().getInputStream();
                                                            bArr = new byte[1024];
                                                            while (inputStream.read(bArr) != -1) {
                                                                sb.append(new String(bArr));
                                                            }
                                                            inputStream.close();
                                                        } catch (Exception unused4) {
                                                        }
                                                        string = sb.toString();
                                                        if (TextUtils.isEmpty(string)) {
                                                            seVarArr = f41565i;
                                                            i3 = 0;
                                                            for (i2 = 0; i2 < 24; i2++) {
                                                                se seVar = seVarArr[i2];
                                                                Context context2 = v6Var.f41566a;
                                                                String str8 = seVar.f41481a;
                                                                Class<?> clsLoadClass = context2.getClassLoader().loadClass("android.os.".concat("SystemProperties"));
                                                                str = (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, str8);
                                                                str2 = seVar.f41482b;
                                                                if (str2 == null) {
                                                                    i3++;
                                                                }
                                                                if (str2 == null) {
                                                                }
                                                            }
                                                            if (i3 >= 5) {
                                                            }
                                                            z2 = false;
                                                        } else {
                                                            strArrSplit = string.split(IOUtils.LINE_SEPARATOR_UNIX);
                                                            length = strArrSplit.length;
                                                            i4 = 0;
                                                            while (true) {
                                                                if (i4 < length) {
                                                                    str3 = strArrSplit[i4];
                                                                    if (str3.contains("wlan0")) {
                                                                    }
                                                                    i4++;
                                                                } else {
                                                                    seVarArr = f41565i;
                                                                    i3 = 0;
                                                                    while (i2 < 24) {
                                                                        se seVar2 = seVarArr[i2];
                                                                        Context context3 = v6Var.f41566a;
                                                                        String str9 = seVar2.f41481a;
                                                                        try {
                                                                            Class<?> clsLoadClass2 = context3.getClassLoader().loadClass("android.os.".concat("SystemProperties"));
                                                                            str = (String) clsLoadClass2.getMethod("get", String.class).invoke(clsLoadClass2, str9);
                                                                        } catch (Exception unused5) {
                                                                            str = null;
                                                                        }
                                                                        str2 = seVar2.f41482b;
                                                                        if (str2 == null) {
                                                                            i3++;
                                                                        }
                                                                        if (str2 == null) {
                                                                        }
                                                                    }
                                                                    if (i3 >= 5) {
                                                                    }
                                                                    z2 = false;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        seVarArr = f41565i;
                                                        i3 = 0;
                                                        while (i2 < 24) {
                                                            se seVar3 = seVarArr[i2];
                                                            Context context4 = v6Var.f41566a;
                                                            String str10 = seVar3.f41481a;
                                                            Class<?> clsLoadClass3 = context4.getClassLoader().loadClass("android.os.".concat("SystemProperties"));
                                                            str = (String) clsLoadClass3.getMethod("get", String.class).invoke(clsLoadClass3, str10);
                                                            str2 = seVar3.f41482b;
                                                            if (str2 == null) {
                                                                i3++;
                                                            }
                                                            if (str2 == null) {
                                                            }
                                                        }
                                                        if (i3 >= 5) {
                                                        }
                                                        z2 = false;
                                                    }
                                                } catch (Throwable unused6) {
                                                }
                                            }
                                            if (z2) {
                                                z3 = z2;
                                            } else {
                                                if (v6Var.f41567b.isEmpty()) {
                                                    z3 = false;
                                                    break;
                                                }
                                                packageManager = v6Var.f41566a.getPackageManager();
                                                it = v6Var.f41567b.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        z3 = false;
                                                        break;
                                                    }
                                                    launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) it.next());
                                                    if (launchIntentForPackage == null) {
                                                    }
                                                }
                                            }
                                            k = Boolean.valueOf(z3);
                                            return k.booleanValue();
                                        } catch (Throwable th) {
                                            th = th;
                                            bufferedReader2 = bufferedReader;
                                            if (bufferedReader2 != null) {
                                                try {
                                                    bufferedReader2.close();
                                                } catch (IOException unused7) {
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                    bufferedReader.close();
                                    if (sb2.toString().contains(d[0])) {
                                        z2 = true;
                                    }
                                } catch (Exception unused8) {
                                    bufferedReader = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            i5++;
                        }
                        if (v6Var.a(f41563e, "Pipes")) {
                            z2 = true;
                        } else if (v6Var.f41566a.checkSelfPermission("android.permission.INTERNET") == 0) {
                            String[] strArr2 = {"/system/bin/netcfg"};
                            sb = new StringBuilder();
                            ProcessBuilder processBuilder2 = new ProcessBuilder(strArr2);
                            processBuilder2.directory(new File("/system/bin/"));
                            processBuilder2.redirectErrorStream(true);
                            inputStream = processBuilder2.start().getInputStream();
                            bArr = new byte[1024];
                            while (inputStream.read(bArr) != -1) {
                                sb.append(new String(bArr));
                            }
                            inputStream.close();
                            string = sb.toString();
                            if (TextUtils.isEmpty(string)) {
                                strArrSplit = string.split(IOUtils.LINE_SEPARATOR_UNIX);
                                length = strArrSplit.length;
                                i4 = 0;
                                while (true) {
                                    if (i4 < length) {
                                        str3 = strArrSplit[i4];
                                        if ((str3.contains("wlan0") && !str3.contains("tunl0") && !str3.contains("eth0")) || !str3.contains("10.0.2.15")) {
                                            i4++;
                                        }
                                    } else {
                                        seVarArr = f41565i;
                                        i3 = 0;
                                        while (i2 < 24) {
                                            se seVar4 = seVarArr[i2];
                                            Context context5 = v6Var.f41566a;
                                            String str11 = seVar4.f41481a;
                                            Class<?> clsLoadClass4 = context5.getClassLoader().loadClass("android.os.".concat("SystemProperties"));
                                            str = (String) clsLoadClass4.getMethod("get", String.class).invoke(clsLoadClass4, str11);
                                            str2 = seVar4.f41482b;
                                            if (str2 == null && str != null) {
                                                i3++;
                                            }
                                            if (str2 == null && str != null && str.contains(str2)) {
                                                i3++;
                                            }
                                        }
                                        if (i3 >= 5 || !v6Var.a(f, "X86")) {
                                            z2 = false;
                                        }
                                    }
                                    z2 = true;
                                }
                            } else {
                                seVarArr = f41565i;
                                i3 = 0;
                                while (i2 < 24) {
                                    se seVar5 = seVarArr[i2];
                                    Context context6 = v6Var.f41566a;
                                    String str12 = seVar5.f41481a;
                                    Class<?> clsLoadClass5 = context6.getClassLoader().loadClass("android.os.".concat("SystemProperties"));
                                    str = (String) clsLoadClass5.getMethod("get", String.class).invoke(clsLoadClass5, str12);
                                    str2 = seVar5.f41482b;
                                    if (str2 == null) {
                                        i3++;
                                    }
                                    if (str2 == null) {
                                    }
                                }
                                if (i3 >= 5) {
                                }
                                z2 = false;
                            }
                        } else {
                            seVarArr = f41565i;
                            i3 = 0;
                            while (i2 < 24) {
                                se seVar6 = seVarArr[i2];
                                Context context7 = v6Var.f41566a;
                                String str13 = seVar6.f41481a;
                                Class<?> clsLoadClass6 = context7.getClassLoader().loadClass("android.os.".concat("SystemProperties"));
                                str = (String) clsLoadClass6.getMethod("get", String.class).invoke(clsLoadClass6, str13);
                                str2 = seVar6.f41482b;
                                if (str2 == null) {
                                    i3++;
                                }
                                if (str2 == null) {
                                }
                            }
                            if (i3 >= 5) {
                            }
                            z2 = false;
                        }
                    }
                }
            }
            if (z2) {
                if (v6Var.f41567b.isEmpty()) {
                    z3 = false;
                    break;
                }
                packageManager = v6Var.f41566a.getPackageManager();
                it = v6Var.f41567b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z3 = false;
                        break;
                    }
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) it.next());
                    if (launchIntentForPackage == null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                        break;
                    }
                }
            } else {
                z3 = z2;
            }
            k = Boolean.valueOf(z3);
        }
        return k.booleanValue();
    }

    public final boolean a(String[] strArr, String str) {
        File file;
        for (String str2 : strArr) {
            try {
                if (this.f41566a.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && str2.contains("/") && str.equals("Nox")) {
                    file = new File(Environment.getExternalStorageDirectory() + str2);
                } else {
                    file = new File(str2);
                }
            } catch (Throwable unused) {
            }
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }
}
