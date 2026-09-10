package com.umeng.crash;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.umeng.commonsdk.utils.UMUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class UCrash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f2707a;
    private static final h b = new h();

    public static g a() {
        return b;
    }

    public static void addHeader(String str, String str2) {
        c cVarA = c.a();
        synchronized (cVarA.q) {
            cVarA.q.put(str, str2);
        }
    }

    public static void generateCustomLog(final String str, final boolean z) {
        if (f2707a) {
            b.a(new Runnable() { // from class: com.umeng.crash.UCrash.3
                /* JADX WARN: Code duplicated, block: B:43:0x00fa A[Catch: all -> 0x0037, Exception -> 0x014b, TRY_LEAVE, TryCatch #1 {Exception -> 0x014b, blocks: (B:41:0x00d7, B:43:0x00fa, B:48:0x010c, B:50:0x0124, B:51:0x0125, B:47:0x0107), top: B:63:0x00d7 }] */
                /* JADX WARN: Code duplicated, block: B:50:0x0124 A[Catch: all -> 0x0037, Exception -> 0x014b, TryCatch #1 {Exception -> 0x014b, blocks: (B:41:0x00d7, B:43:0x00fa, B:48:0x010c, B:50:0x0124, B:51:0x0125, B:47:0x0107), top: B:63:0x00d7 }] */
                /* JADX WARN: Code duplicated, block: B:68:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                public final void run() {
                    String str2;
                    BufferedOutputStream bufferedOutputStream;
                    String string;
                    JSONObject jSONObject;
                    try {
                        Application application = c.a().f2715a;
                        if (!j.a(application)) {
                            int i = c.a().o;
                            return;
                        }
                        a aVarA = a.a();
                        String str3 = str;
                        boolean z2 = z;
                        try {
                            f.b bVar = aVarA.f2712a;
                            try {
                                try {
                                    if (bVar == null) {
                                        UCrash.a().d("UCrash.Custom", "config null.");
                                    } else {
                                        f.a aVar = bVar.f2719a;
                                        if (aVar == null) {
                                            UCrash.a().d("UCrash.Custom", "callback null.");
                                        } else {
                                            try {
                                                if (bVar.q) {
                                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                                    c cVarA = c.a();
                                                    String strA = k.a(jCurrentTimeMillis, "_exception.log");
                                                    File file = new File(cVarA.c, strA);
                                                    str2 = "cnt";
                                                    try {
                                                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, false));
                                                        try {
                                                            k.a(bufferedOutputStream, m.a("exception", jCurrentTimeMillis, strA));
                                                            k.a((OutputStream) bufferedOutputStream);
                                                            k.a(bufferedOutputStream, m.i());
                                                            k.a((OutputStream) bufferedOutputStream);
                                                            k.a(bufferedOutputStream, str3 + "\n");
                                                            if (z2) {
                                                                k.a((OutputStream) bufferedOutputStream);
                                                                k.a(bufferedOutputStream, m.c());
                                                            }
                                                            aVar.a("exception", bufferedOutputStream);
                                                            bufferedOutputStream.flush();
                                                            aVar.a("exception", file.getPath());
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            UCrash.a().a("UCrash.Custom", "custom log failed", th);
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        bufferedOutputStream = null;
                                                    }
                                                    k.a((Closeable) bufferedOutputStream);
                                                    SharedPreferences sharedPreferences = application.getSharedPreferences("um_crash_cfg", 0);
                                                    string = sharedPreferences.getString("k_generate", null);
                                                    UCrash.a().a("UCrash", "get generate cfg: ".concat(String.valueOf(string)));
                                                    if (TextUtils.isEmpty(string)) {
                                                        jSONObject = new JSONObject();
                                                    } else {
                                                        try {
                                                            jSONObject = new JSONObject(string);
                                                        } catch (Exception unused) {
                                                            jSONObject = new JSONObject();
                                                        }
                                                    }
                                                    long jOptLong = jSONObject.optLong("ts", 0L);
                                                    String str4 = str2;
                                                    int iOptInt = jSONObject.optInt(str4, 0);
                                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                    int i2 = j.a(jCurrentTimeMillis2, jOptLong) ? 1 + iOptInt : 1;
                                                    jSONObject.put("ts", jCurrentTimeMillis2);
                                                    jSONObject.put(str4, i2);
                                                    sharedPreferences.edit().putString("k_generate", jSONObject.toString()).apply();
                                                    UCrash.a().a("UCrash", "save generate cfg: ".concat(String.valueOf(jSONObject)));
                                                    return;
                                                }
                                                UCrash.a().d("UCrash.Custom", "custom disabled");
                                                UCrash.a().a("UCrash.Custom", "custom log failed", th);
                                                k.a((Closeable) bufferedOutputStream);
                                                SharedPreferences sharedPreferences2 = application.getSharedPreferences("um_crash_cfg", 0);
                                                string = sharedPreferences2.getString("k_generate", null);
                                                UCrash.a().a("UCrash", "get generate cfg: ".concat(String.valueOf(string)));
                                                if (TextUtils.isEmpty(string)) {
                                                    jSONObject = new JSONObject();
                                                } else {
                                                    jSONObject = new JSONObject(string);
                                                }
                                                long jOptLong2 = jSONObject.optLong("ts", 0L);
                                                String str5 = str2;
                                                int iOptInt2 = jSONObject.optInt(str5, 0);
                                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                                if (j.a(jCurrentTimeMillis3, jOptLong2)) {
                                                }
                                                jSONObject.put("ts", jCurrentTimeMillis3);
                                                jSONObject.put(str5, i2);
                                                sharedPreferences2.edit().putString("k_generate", jSONObject.toString()).apply();
                                                UCrash.a().a("UCrash", "save generate cfg: ".concat(String.valueOf(jSONObject)));
                                                return;
                                            } catch (Throwable th3) {
                                                k.a((Closeable) bufferedOutputStream);
                                                throw th3;
                                            }
                                            bufferedOutputStream = null;
                                        }
                                    }
                                    SharedPreferences sharedPreferences3 = application.getSharedPreferences("um_crash_cfg", 0);
                                    string = sharedPreferences3.getString("k_generate", null);
                                    UCrash.a().a("UCrash", "get generate cfg: ".concat(String.valueOf(string)));
                                    if (TextUtils.isEmpty(string)) {
                                        jSONObject = new JSONObject();
                                    } else {
                                        jSONObject = new JSONObject(string);
                                    }
                                    long jOptLong3 = jSONObject.optLong("ts", 0L);
                                    String str6 = str2;
                                    int iOptInt3 = jSONObject.optInt(str6, 0);
                                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                                    if (j.a(jCurrentTimeMillis4, jOptLong3)) {
                                    }
                                    jSONObject.put("ts", jCurrentTimeMillis4);
                                    jSONObject.put(str6, i2);
                                    sharedPreferences3.edit().putString("k_generate", jSONObject.toString()).apply();
                                    UCrash.a().a("UCrash", "save generate cfg: ".concat(String.valueOf(jSONObject)));
                                    return;
                                } catch (Exception unused2) {
                                    return;
                                }
                                k.a((Closeable) null);
                                str2 = "cnt";
                            } catch (Throwable th4) {
                                th = th4;
                                str2 = "cnt";
                                bufferedOutputStream = null;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            str2 = "cnt";
                        }
                    } catch (Throwable th6) {
                        UCrash.a().a("UCrash", "generate custom log failed", th6);
                    }
                }
            });
        }
    }

    public static synchronized void init(final Context context, final UCrashConfig uCrashConfig) {
        if (f2707a) {
            b.c("UCrash", "init: skipped. already initialized.");
            return;
        }
        if (context == null || uCrashConfig == null) {
            return;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        f.a aVar = new f.a() { // from class: com.umeng.crash.UCrash.1
            @Override // com.umeng.crash.f.a
            public final void a(String str, OutputStream outputStream) throws IOException {
                Map<String, String> extras;
                UCrashCallback uCrashCallback = uCrashConfig.callback;
                if (uCrashCallback == null || (extras = uCrashCallback.getExtras(str)) == null || extras.isEmpty()) {
                    return;
                }
                for (String str2 : extras.keySet()) {
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = extras.get(str2);
                        if (!TextUtils.isEmpty(str3)) {
                            k.a(outputStream);
                            k.a(outputStream, AbstractC3888ke0.j(str2, "\n", str3, "\n"));
                        }
                    }
                }
            }

            @Override // com.umeng.crash.f.a
            public final void a(String str, String str2) {
                UCrash.a().b("UCrash", AbstractC5044xl.m("type: ", str, ", path: ", str2));
                File file = new File(str2);
                final File fileA = l.a(file);
                UCrashConfig uCrashConfig2 = uCrashConfig;
                if (uCrashConfig2.backupEnable && !TextUtils.isEmpty(uCrashConfig2.backupDir)) {
                    File file2 = new File(uCrashConfig.backupDir);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    file.renameTo(new File(file2, file.getName()));
                } else {
                    file.delete();
                }
                if ("exception".equals(str) && !uCrashConfig.customUploadImmediately) {
                    UCrash.a().b("UCrash", "custom log upload now: false");
                    return;
                }
                Runnable runnable = new Runnable() { // from class: com.umeng.crash.UCrash.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        l.a(context, uCrashConfig.url, fileA, true);
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    try {
                        Thread thread = new Thread(runnable);
                        thread.start();
                        thread.join(2000L);
                        return;
                    } catch (Throwable th) {
                        UCrash.a().a("UCrash", "upload log failed", th);
                        return;
                    }
                }
                runnable.run();
            }
        };
        boolean z = false;
        h.f2720a = uCrashConfig.logEnable || m.d();
        f.b bVar = new f.b();
        bVar.f2719a = aVar;
        if (uCrashConfig.anrEnable && UMUtils.isMainProgress(context)) {
            z = true;
        }
        bVar.l = z;
        bVar.o = true;
        bVar.n = true;
        bVar.m = uCrashConfig.anrTraceHkEnable;
        bVar.g = uCrashConfig.nativeCrashEnable;
        bVar.j = uCrashConfig.nativeDumpAllThreads;
        bVar.h = uCrashConfig.nativeCrashRethrow;
        bVar.b = uCrashConfig.javaCrashEnable;
        bVar.c = uCrashConfig.javaCrashRethrow;
        bVar.d = true;
        bVar.e = uCrashConfig.javaDumpAllThreads;
        bVar.q = uCrashConfig.customEnable;
        c.a(context);
        c cVarA = c.a();
        cVarA.o = uCrashConfig.customFileSaveLimit;
        cVarA.p = uCrashConfig.customFileUploadLimit;
        int iA = f.a(context, bVar);
        b.b(new Runnable() { // from class: com.umeng.crash.UCrash.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    String str = uCrashConfig.url;
                    File[] fileArrA = k.a();
                    if (fileArrA.length != 0) {
                        int length = fileArrA.length - 15;
                        if (length > 0) {
                            for (int i = 0; i < length; i++) {
                                fileArrA[i].delete();
                                UCrash.a().b("UCrash.Upload", "file over limit. delete old file: " + fileArrA[i].getName());
                            }
                        } else {
                            length = 0;
                        }
                        while (length < fileArrA.length) {
                            if (fileArrA[length].getName().endsWith("_anr.log")) {
                                File file = fileArrA[length];
                                fileArrA[length] = l.a(file);
                                file.delete();
                            }
                            l.a(context2, str, fileArrA[length], false);
                            length++;
                        }
                    }
                    l.a(context, uCrashConfig.url);
                    k.c();
                } catch (Throwable th) {
                    UCrash.a().a("UCrash", "upload cache failed", th);
                }
            }
        });
        b.b("UCrash", "init version: 1.1.0, code: ".concat(String.valueOf(iA)));
        f2707a = true;
    }

    public static void reRegisterAnrHandler() {
        if (f2707a) {
            try {
                f.b bVar = i.a().f2721a;
                if (bVar.l) {
                    UCrashJNI.registerAnr(bVar.m);
                }
            } catch (Throwable th) {
                b.a("UCrash.Native", "register anr failed", th);
            }
        }
    }

    public static void updateCustomLogLimit(int i, int i2) {
        c.a().o = i;
        c.a().p = i2;
    }
}
