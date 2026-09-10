package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ze {
    /* JADX WARN: Code duplicated, block: B:104:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0170  */
    /* JADX WARN: Code duplicated, block: B:77:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x017f  */
    /* JADX WARN: Code duplicated, block: B:82:0x019c  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ab A[LOOP:5: B:80:0x0198->B:85:0x01ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d5 A[PHI: r4
  0x01d5: PHI (r4v2 java.lang.Process) = (r4v1 java.lang.Process), (r4v4 java.lang.Process) binds: [B:94:0x01d8, B:90:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean a(Context context) {
        boolean z2;
        String str;
        boolean z3;
        String[] strArr;
        int i2;
        boolean z4;
        Process processExec;
        boolean z5;
        boolean zExists;
        Process processExec2;
        boolean z6;
        PackageManager packageManager = context.getPackageManager();
        char c2 = 1;
        if (xe.a(packageManager, ye.f41709a)) {
            z2 = true;
        } else if ((xe.a(packageManager, new String[]{"com.noshufou.android.su", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.zachspong.temprootremovejb", "com.ramdroid.appquarantine"}) ? true : xe.a(packageManager, ye.f41710b)) || xe.a("su") || xe.a("busybox")) {
            z2 = true;
        } else {
            HashMap mapT = androidx.media3.extractor.text.ttml.a.t("ro.debuggable", "1", "ro.secure", "0");
            String[] strArrSplit = new String[0];
            try {
                strArrSplit = new Scanner(Runtime.getRuntime().exec("getprop").getInputStream()).useDelimiter("\\A").next().split(IOUtils.LINE_SEPARATOR_UNIX);
            } catch (IOException | NoSuchElementException unused) {
            }
            boolean z7 = false;
            for (String str2 : strArrSplit) {
                for (String str3 : mapT.keySet()) {
                    if (str2.contains(str3)) {
                        if (str2.contains(com.ironsource.d9.i.d + ((String) mapT.get(str3)) + com.ironsource.d9.i.f24752e)) {
                            z7 = true;
                        }
                    }
                }
            }
            if (z7) {
                z2 = true;
            } else {
                String[] strArrSplit2 = new String[0];
                try {
                    strArrSplit2 = new Scanner(Runtime.getRuntime().exec("mount").getInputStream()).useDelimiter("\\A").next().split(IOUtils.LINE_SEPARATOR_UNIX);
                } catch (IOException | NoSuchElementException unused2) {
                }
                int length = strArrSplit2.length;
                int i3 = 0;
                boolean z8 = false;
                while (i3 < length) {
                    String[] strArrSplit3 = strArrSplit2[i3].split(" ");
                    if (strArrSplit3.length >= 4) {
                        String str4 = strArrSplit3[c2];
                        String str5 = strArrSplit3[3];
                        String[] strArr2 = ye.d;
                        for (int i4 = 0; i4 < 7; i4++) {
                            if (str4.equalsIgnoreCase(strArr2[i4])) {
                                for (String str6 : str5.split(",")) {
                                    if (str6.equalsIgnoreCase("rw")) {
                                        z8 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    i3++;
                    c2 = 1;
                }
                if (z8) {
                    z2 = true;
                } else {
                    String str7 = Build.TAGS;
                    if (str7 != null && str7.contains("test-keys")) {
                        z2 = true;
                    } else {
                        try {
                            processExec2 = Runtime.getRuntime().exec(new String[]{"which", "su"});
                            try {
                                z6 = new BufferedReader(new InputStreamReader(processExec2.getInputStream())).readLine() != null;
                            } catch (Throwable unused3) {
                                if (processExec2 == null) {
                                    z6 = false;
                                }
                                if (z6) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                if (!z2) {
                                    str = Build.TAGS;
                                    if (str == null) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        strArr = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
                                        i2 = 0;
                                        while (true) {
                                            if (i2 < 10) {
                                                z4 = false;
                                                break;
                                            }
                                            if (new File(strArr[i2]).exists()) {
                                                z4 = true;
                                                break;
                                            }
                                            i2++;
                                        }
                                        if (!z4) {
                                            try {
                                                processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
                                                try {
                                                    if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                } catch (Throwable unused4) {
                                                    if (processExec == null) {
                                                        z5 = false;
                                                    }
                                                    if (!z5) {
                                                        try {
                                                            zExists = new File("/system/app/Superuser.apk").exists();
                                                        } catch (Throwable unused5) {
                                                            zExists = false;
                                                        }
                                                        if (!zExists) {
                                                            return false;
                                                        }
                                                    }
                                                    return true;
                                                }
                                            } catch (Throwable unused6) {
                                                processExec = null;
                                            }
                                            processExec.destroy();
                                            if (!z5) {
                                                zExists = new File("/system/app/Superuser.apk").exists();
                                                if (!zExists) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } catch (Throwable unused7) {
                            processExec2 = null;
                        }
                        processExec2.destroy();
                        if (z6 || xe.a("magisk")) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                }
            }
        }
        if (!z2) {
            str = Build.TAGS;
            if (str == null && str.contains("test-keys")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                strArr = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
                i2 = 0;
                while (true) {
                    if (i2 < 10) {
                        z4 = false;
                        break;
                    }
                    if (new File(strArr[i2]).exists()) {
                        z4 = true;
                        break;
                    }
                    i2++;
                }
                if (!z4) {
                    processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
                    if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    processExec.destroy();
                    if (!z5) {
                        zExists = new File("/system/app/Superuser.apk").exists();
                        if (!zExists) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
