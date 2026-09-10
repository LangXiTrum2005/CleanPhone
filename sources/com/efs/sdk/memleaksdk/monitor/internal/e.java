package com.efs.sdk.memleaksdk.monitor.internal;

import android.content.Context;
import android.os.StatFs;
import com.efs.sdk.memleaksdk.monitor.UMonitor;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.commonsdk.utils.UMUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f681a;
    private static String b;

    public static abstract class a {
        public abstract boolean a(String str);
    }

    public static void a(String str) {
        if (str != null) {
            b = str;
        }
        f681a = UMUtils.getAppVersionName(UMonitor.getContext());
    }

    public static File b() {
        File file = new File(a(), "memory/hprof_analysis");
        file.mkdirs();
        return file;
    }

    public static File c() {
        File file = new File(a(), "memory/hprof_script");
        file.mkdirs();
        return file;
    }

    public static File d() {
        File file = new File(a(), "thread");
        file.mkdirs();
        return file;
    }

    public static File e() {
        File file = new File(a(), "fd");
        file.mkdirs();
        return file;
    }

    public static boolean f() {
        StatFs statFs = new StatFs(b().getPath());
        return ((double) (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong())) > 1258291.2d;
    }

    public static void a(Context context, String str) {
        if (str != null) {
            b = str;
        }
        f681a = UMUtils.getAppVersionName(context);
    }

    public static File b(Date date) {
        return new File(b(), DM.n(new StringBuilder(), f681a, "_", new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(date), ".json"));
    }

    public static File c(Date date) {
        return new File(c(), DM.n(new StringBuilder(), f681a, "_", new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(date), ".hprof"));
    }

    public static File a() {
        return new File(b);
    }

    public static File a(Date date) {
        return new File(b(), DM.n(new StringBuilder(), f681a, "_", new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(date), ".hprof"));
    }

    public static String b(File file) {
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, C.UTF8_NAME));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb.append(line);
                        } else {
                            String string = sb.toString();
                            i.a(bufferedReader);
                            i.a(fileInputStream);
                            return string;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        g.b(UMonitor.TAG, "read file failed", th);
                        return null;
                    } finally {
                        i.a(bufferedReader);
                        i.a(fileInputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            fileInputStream = null;
        }
    }

    public static File a(File file) {
        return new File(file, "dump.txt");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.efs.sdk.memleaksdk.monitor.internal.e$a] */
    public static void a(File file, a aVar) throws Throwable {
        FileInputStream fileInputStream;
        ?? line;
        if (!file.exists()) {
            return;
        }
        ?? r0 = 0;
        bufferedReader = null;
        BufferedReader bufferedReader = null;
        r0 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream, C.UTF8_NAME));
                    do {
                        try {
                            line = bufferedReader2.readLine();
                            if (line == 0) {
                                break;
                            } else {
                                line = aVar.a(line);
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            g.b(UMonitor.TAG, "read file failed", e);
                            i.a(bufferedReader);
                            r0 = bufferedReader;
                        } catch (Throwable th) {
                            th = th;
                            r0 = bufferedReader2;
                            i.a(r0);
                            i.a(fileInputStream);
                            throw th;
                        }
                    } while (line != 0);
                    i.a(bufferedReader2);
                    r0 = line;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
            i.a(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void a(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    fileOutputStream2.write(str.getBytes(C.UTF8_NAME));
                    i.a(fileOutputStream2);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    g.b(UMonitor.TAG, "write file failed", e);
                    i.a(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    i.a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
