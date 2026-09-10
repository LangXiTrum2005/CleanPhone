package com.umeng.crash;

import android.app.ActivityManager;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class UCrashJNI {
    private static String getValue(int i) {
        i iVarA = i.a();
        if (i == 1) {
            return m.i();
        }
        if (i == 100) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            iVarA.d = jCurrentTimeMillis;
            iVarA.c = k.a(jCurrentTimeMillis, "_jni.log");
            return c.a().c + File.separator + iVarA.c;
        }
        if (i == 101) {
            return m.a(UCrashCallback.TYPE_NATIVE, iVarA.d, iVarA.c);
        }
        if (i != 200) {
            return i == 201 ? m.a(UCrashCallback.TYPE_ANR, iVarA.d, iVarA.c) : "";
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        iVarA.d = jCurrentTimeMillis2;
        iVarA.c = k.a(jCurrentTimeMillis2, "_anr.log");
        return c.a().c + File.separator + iVarA.c;
    }

    public static native int init(String str, boolean z);

    private static void onAnr(String str) {
        String str2;
        i.a();
        UCrash.a().c("UCrash.Native", "onAnr time: " + new Date() + " path:" + str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            f.b bVar = i.a().f2721a;
            if (bVar == null) {
                UCrash.a().d("UCrash.Native", "onAnr config null.");
                k.a((Closeable) null);
                return;
            }
            f.a aVar = bVar.f2719a;
            if (aVar == null) {
                UCrash.a().d("UCrash.Native", "onAnr callback null.");
                k.a((Closeable) null);
                return;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str, true));
            try {
                k.a((OutputStream) bufferedOutputStream2);
                k.a(bufferedOutputStream2, m.a(m.l()));
                k.a((OutputStream) bufferedOutputStream2);
                k.a(bufferedOutputStream2, m.m());
                k.a((OutputStream) bufferedOutputStream2);
                k.a(bufferedOutputStream2, m.f());
                k.a((OutputStream) bufferedOutputStream2);
                k.a(bufferedOutputStream2, m.h());
                k.a((OutputStream) bufferedOutputStream2);
                k.a(bufferedOutputStream2, m.g());
                if (bVar.i) {
                    k.a((OutputStream) bufferedOutputStream2);
                    k.a(bufferedOutputStream2, m.b());
                }
                k.a((OutputStream) bufferedOutputStream2);
                k.a(bufferedOutputStream2, m.j());
                k.a((OutputStream) bufferedOutputStream2);
                k.a(bufferedOutputStream2, m.e());
                k.a((OutputStream) bufferedOutputStream2);
                k.a(bufferedOutputStream2, m.k());
                if (bVar.p) {
                    k.a((OutputStream) bufferedOutputStream2);
                    k.a(bufferedOutputStream2, m.c());
                }
                aVar.a(UCrashCallback.TYPE_ANR, bufferedOutputStream2);
                i.a(str, (OutputStream) bufferedOutputStream2, false);
                String str3 = c.a().f;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
                Locale locale = Locale.US;
                String str4 = "Process Name: '" + str3 + "'\nThread Name: '" + m.l() + "'\nANR Time: " + simpleDateFormat.format(new Date()) + "\n\nANR Info:\n";
                k.a((OutputStream) bufferedOutputStream2);
                k.a(bufferedOutputStream2, str4);
                bufferedOutputStream2.flush();
                Objects.requireNonNull(i.a());
                ActivityManager.ProcessErrorStateInfo processErrorStateInfoA = m.a();
                if (processErrorStateInfoA != null) {
                    str2 = processErrorStateInfoA.longMsg;
                } else {
                    str2 = "(get failed)";
                    try {
                        UCrash.a().d("UCrash.Native", "checkProcessAnrState false, not ANR.");
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException e) {
                            UCrash.a().a("UCrash.Native", "close outputStream failed", e);
                        }
                        File file = new File(str);
                        if (file.exists()) {
                            file.delete();
                        }
                        File file2 = new File(str + ".traces.dp");
                        if (file2.exists()) {
                            file2.delete();
                        }
                        File file3 = new File(str + ".traces.hk");
                        if (file3.exists()) {
                            file3.delete();
                        }
                        k.a((Closeable) bufferedOutputStream2);
                        return;
                    } catch (Exception unused) {
                    }
                }
                k.a(bufferedOutputStream2, str2);
                bufferedOutputStream2.flush();
                i.a(str, (OutputStream) bufferedOutputStream2, true);
                aVar.a(UCrashCallback.TYPE_ANR, str);
                k.a((Closeable) bufferedOutputStream2);
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    UCrash.a().a("UCrash.Native", "onLogGenerated(TYPE_NATIVE) failed", th);
                } finally {
                    k.a((Closeable) bufferedOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void onAnrSignal() {
        i.a();
        i.b();
    }

    private static void onCrash(String str, boolean z, String str2) {
        i.a();
        i.a(str, z, str2);
    }

    public static native void onJavaCrashed();

    public static native int registerAnr(boolean z);

    public static native int registerNative(boolean z);
}
