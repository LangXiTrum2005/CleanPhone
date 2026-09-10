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

/* JADX INFO: loaded from: classes3.dex */
public class ekw implements Thread.UncaughtExceptionHandler {
    public static volatile boolean qdl;
    private String lnr;
    private final Thread.UncaughtExceptionHandler ud = Thread.getDefaultUncaughtExceptionHandler();

    private ekw() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        ud();
    }

    private void lnr() {
        try {
            com.bytedance.sdk.openadsdk.component.wd.qdl.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl());
        } catch (Throwable unused) {
        }
        try {
            com.bytedance.sdk.openadsdk.component.reward.exu.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl()).qdl();
        } catch (Throwable unused2) {
        }
        try {
            com.bytedance.sdk.openadsdk.component.reward.mzz.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl()).qdl();
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.rq.lnr().qdl();
        } catch (Throwable unused4) {
        }
        try {
            com.bytedance.sdk.component.adexpress.qdl.ud.ud.ud();
        } catch (Throwable unused5) {
        }
    }

    public static ekw qdl() {
        return new ekw();
    }

    private void ud() {
        Context contextQdl = com.bytedance.sdk.openadsdk.core.yt.qdl();
        if (contextQdl == null) {
            return;
        }
        try {
            File file = new File(contextQdl.getFilesDir(), "TTCache");
            file.mkdirs();
            this.lnr = file.getPath();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        qdl = true;
        com.bytedance.sdk.component.jpc.tvp.sCrashHappened = true;
        com.bytedance.sdk.component.jpc.lnr.mml.lnr = true;
        boolean zContains = false;
        com.bytedance.sdk.component.jpc.mo.qdl(false);
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
            qdl(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.ud;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private void qdl(Thread thread, Throwable th) {
        FileOutputStream fileOutputStream;
        byte b2;
        int i2;
        FileInputStream fileInputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileInputStream fileInputStream2 = null;
        fileInputStream = null;
        try {
            if (TextUtils.isEmpty(this.lnr)) {
                ud();
            }
            if (TextUtils.isEmpty(this.lnr)) {
                return;
            }
            File file = new File(this.lnr, "tt_crash_count.properties");
            if (file.exists() && file.isFile() && file.canRead()) {
                Properties properties = new Properties();
                FileInputStream fileInputStream3 = new FileInputStream(file);
                try {
                    properties.load(fileInputStream3);
                    String property = properties.getProperty("crash_count", "0");
                    String property2 = properties.getProperty("crash_last_time", "0");
                    int iIntValue = Integer.valueOf(property).intValue();
                    if (System.currentTimeMillis() - Long.valueOf(property2).longValue() < 300000) {
                        i2 = iIntValue + 1;
                        b2 = false;
                    } else {
                        b2 = true;
                        i2 = 1;
                    }
                    boolean z2 = i2 >= 3;
                    int i3 = z2 ? 0 : i2;
                    if (z2) {
                        try {
                            file.delete();
                        } catch (Throwable unused) {
                        }
                    } else {
                        properties.setProperty("crash_count", String.valueOf(i3));
                        if (b2 != false) {
                            properties.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                        }
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            properties.store(fileOutputStream3, "tt_crash_info");
                            fileOutputStream2 = fileOutputStream3;
                        } catch (Throwable th2) {
                            fileOutputStream = fileOutputStream3;
                            th = th2;
                            fileInputStream = fileInputStream3;
                            com.bytedance.sdk.component.utils.aaj.qdl("TTCrashHandler", "crash count error", th);
                        }
                    }
                    if (z2) {
                        lnr();
                    }
                    fileOutputStream = fileOutputStream2;
                    fileInputStream2 = fileInputStream3;
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    if (fileOutputStream == null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                }
            } else {
                Properties properties2 = new Properties();
                properties2.setProperty("crash_count", "1");
                properties2.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                fileOutputStream = new FileOutputStream(file);
                try {
                    properties2.store(fileOutputStream, "tt_crash_info");
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (fileOutputStream == null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        com.bytedance.sdk.component.utils.aaj.qdl("TTCrashHandler", "crash count error", th);
                    } finally {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused4) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }
}
