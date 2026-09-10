package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class oh implements Thread.UncaughtExceptionHandler {
    public static volatile boolean ri;
    private String ik;
    private final Thread.UncaughtExceptionHandler lr = Thread.getDefaultUncaughtExceptionHandler();

    private oh() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        lr();
    }

    private void ik() {
        try {
            com.bytedance.sdk.openadsdk.component.xha.ri.ri(com.bytedance.sdk.openadsdk.core.nr.ri());
        } catch (Throwable unused) {
        }
        try {
            if (lr.lr()) {
                com.bytedance.sdk.openadsdk.component.reward.bu.ri(com.bytedance.sdk.openadsdk.core.nr.ri()).fi();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.slm.ri(com.bytedance.sdk.openadsdk.core.nr.ri()).ri();
            }
        } catch (Throwable unused2) {
        }
        try {
            if (lr.lr()) {
                com.bytedance.sdk.openadsdk.component.reward.xha.ri(com.bytedance.sdk.openadsdk.core.nr.ri()).fi();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.di.ri(com.bytedance.sdk.openadsdk.core.nr.ri()).ri();
            }
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.sf.lr().ri();
        } catch (Throwable unused4) {
        }
        try {
            com.bytedance.sdk.component.adexpress.ri.lr.lr.lr();
        } catch (Throwable unused5) {
        }
    }

    private void lr() {
        Context contextRi = com.bytedance.sdk.openadsdk.core.nr.ri();
        if (contextRi == null) {
            return;
        }
        try {
            File file = new File(contextRi.getFilesDir(), "TTCache");
            file.mkdirs();
            this.ik = file.getPath();
        } catch (Throwable unused) {
        }
    }

    public static oh ri() {
        return new oh();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ri = true;
        com.bytedance.sdk.component.utils.mj.ri = true;
        com.bytedance.sdk.component.mj.lr.fi.ik = true;
        boolean zContains = false;
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            if (string != null) {
                zContains = string.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (zContains) {
            ri(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.lr;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00eb A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private void ri(Thread thread, Throwable th) {
        FileOutputStream fileOutputStream;
        byte b;
        int i;
        FileInputStream fileInputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileInputStream fileInputStream2 = null;
        fileInputStream = null;
        try {
            if (TextUtils.isEmpty(this.ik)) {
                lr();
            }
            if (TextUtils.isEmpty(this.ik)) {
                return;
            }
            File file = new File(this.ik, "tt_crash_count.properties");
            if (!file.exists() || !file.isFile() || !file.canRead()) {
                Properties properties = new Properties();
                properties.setProperty("crash_count", "1");
                properties.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                fileOutputStream = new FileOutputStream(file);
                try {
                    properties.store(fileOutputStream, "tt_crash_info");
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
                        com.bytedance.sdk.component.utils.ac.ri("TTCrashHandler", "crash count error", th);
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
                if (System.currentTimeMillis() - Long.valueOf(property2).longValue() < 300000) {
                    i = iIntValue + 1;
                    b = false;
                } else {
                    b = true;
                    i = 1;
                }
                boolean z = i >= 3;
                int i2 = z ? 0 : i;
                if (z) {
                    try {
                        file.delete();
                    } catch (Throwable unused6) {
                    }
                } else {
                    properties2.setProperty("crash_count", String.valueOf(i2));
                    if (b != false) {
                        properties2.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                    try {
                        properties2.store(fileOutputStream3, "tt_crash_info");
                        fileOutputStream2 = fileOutputStream3;
                    } catch (Throwable th3) {
                        fileOutputStream = fileOutputStream3;
                        th = th3;
                        fileInputStream = fileInputStream3;
                        com.bytedance.sdk.component.utils.ac.ri("TTCrashHandler", "crash count error", th);
                        if (fileOutputStream != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                if (z) {
                    ik();
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
