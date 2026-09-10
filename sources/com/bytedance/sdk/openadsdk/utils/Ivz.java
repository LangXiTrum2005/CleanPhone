package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.PeriodicWorkRequest;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class Ivz implements Thread.UncaughtExceptionHandler {
    public static volatile boolean Lxb;
    private final Thread.UncaughtExceptionHandler LD = Thread.getDefaultUncaughtExceptionHandler();
    private String lk;

    private Ivz() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        LD();
    }

    private void LD() {
        Context contextLxb = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
        if (contextLxb == null) {
            return;
        }
        try {
            File file = new File(contextLxb.getFilesDir(), "TTCache");
            file.mkdirs();
            this.lk = file.getPath();
        } catch (Throwable unused) {
        }
    }

    public static Ivz Lxb() {
        return new Ivz();
    }

    private void lk() {
        try {
            Method methodLxb = com.bytedance.sdk.component.utils.eK.Lxb("com.bytedance.sdk.openadsdk.TTC2Proxy", "a", Context.class);
            if (methodLxb != null) {
                methodLxb.invoke(null, com.bytedance.sdk.openadsdk.core.kqm.Lxb());
            }
        } catch (Throwable unused) {
        }
        try {
            Method methodLxb2 = com.bytedance.sdk.component.utils.eK.Lxb("com.bytedance.sdk.openadsdk.TTC3Proxy", "a", Context.class);
            if (methodLxb2 != null) {
                methodLxb2.invoke(null, com.bytedance.sdk.openadsdk.core.kqm.Lxb());
            }
        } catch (Throwable unused2) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb();
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.component.adexpress.Lxb.LD.LD.LD();
        } catch (Throwable unused4) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Lxb = true;
        com.bytedance.sdk.component.OY.lc.Lxb(false);
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            if (string != null && string.contains(AdSlot.class.getPackage().getName())) {
                Lxb(thread, th);
            }
        } catch (Throwable unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.LD;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x010f A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0116 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    private void Lxb(Thread thread, Throwable th) {
        FileOutputStream fileOutputStream;
        int i;
        boolean z;
        FileInputStream fileInputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileInputStream fileInputStream2 = null;
        fileInputStream = null;
        try {
            if (TextUtils.isEmpty(this.lk)) {
                LD();
            }
            if (TextUtils.isEmpty(this.lk)) {
                return;
            }
            File file = new File(this.lk, "tt_crash_count.properties");
            if (!file.exists() || !file.isFile() || !file.canRead()) {
                Properties properties = new Properties();
                properties.setProperty("crash_count", "1");
                properties.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                fileOutputStream = new FileOutputStream(file);
                try {
                    properties.store(fileOutputStream, "tt_crash_info");
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTCrashHandler", "==first");
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Throwable unused) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTCrashHandler", "crash count error", th);
                        if (fileOutputStream != null) {
                            try {
                                return;
                            } catch (Throwable unused3) {
                                return;
                            }
                        }
                        return;
                    } finally {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused4) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused5) {
                            }
                        }
                    }
                }
            }
            Properties properties2 = new Properties();
            FileInputStream fileInputStream3 = new FileInputStream(file);
            try {
                properties2.load(fileInputStream3);
                String property = properties2.getProperty("crash_count", "0");
                String property2 = properties2.getProperty("crash_last_time", "0");
                int iIntValue = Integer.valueOf(property).intValue();
                long jLongValue = Long.valueOf(property2).longValue();
                int i2 = 0;
                if (System.currentTimeMillis() - jLongValue < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                    i = iIntValue + 1;
                    z = false;
                } else {
                    i = 1;
                    z = true;
                }
                boolean z2 = i >= 3;
                if (!z2) {
                    i2 = i;
                }
                com.bytedance.sdk.component.utils.sLN.Lxb("TTCrashHandler", "==" + i2 + ", " + z2 + ", " + z);
                if (z2) {
                    try {
                        file.delete();
                    } catch (Throwable unused6) {
                    }
                } else {
                    properties2.setProperty("crash_count", String.valueOf(i2));
                    if (z) {
                        properties2.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                    }
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        properties2.store(fileOutputStream, "tt_crash_info");
                        fileOutputStream2 = fileOutputStream;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = fileInputStream3;
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTCrashHandler", "crash count error", th);
                        if (fileOutputStream != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                if (z2) {
                    lk();
                }
                fileOutputStream = fileOutputStream2;
                fileInputStream2 = fileInputStream3;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }
}
