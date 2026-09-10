package com.smartdigimkt.v0;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.p004ironsource.d9;
import java.io.File;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f39028a = "common-exception";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f39029b = "SameSDCardTool";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f39030c = false;
    static String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f39031e = false;
    private static int f = -1;
    private static int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f39032h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f39033i = -1;
    public static char[] j = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};
    private static String k;

    private static File a(File file) {
        File file2 = new File(file, UUID.randomUUID() + "");
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a A[PHI: r1
  0x004a: PHI (r1v2 java.io.File) = (r1v1 java.io.File), (r1v4 java.io.File) binds: [B:9:0x000f, B:13:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    private static String b(Context context) {
        File fileA;
        File absoluteFile;
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            fileA = externalFilesDir != null ? a(externalFilesDir) : null;
        } catch (Throwable unused) {
        }
        if (f39030c) {
            if (fileA == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory().getPath());
                String str = File.separator;
                androidx.media3.extractor.text.ttml.a.C(sb, str, d9.d, str, "data");
                sb.append(str);
                sb.append(context.getPackageName());
                fileA = a(new File(sb.toString()));
            }
            absoluteFile = j() ? fileA : null;
        }
        if (absoluteFile == null || !absoluteFile.exists()) {
            absoluteFile = context.getFilesDir().getAbsoluteFile();
        }
        return absoluteFile.getAbsolutePath();
    }

    public static void c(Context context) {
        if (f39031e) {
            return;
        }
        try {
            try {
                d = context.getFilesDir().getAbsolutePath() + File.separator;
                if (context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0) {
                    f39030c = true;
                } else {
                    f39030c = false;
                }
                d(context);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            d = context.getFilesDir().getAbsolutePath() + File.separator;
            d(context);
        }
        f39031e = true;
    }

    private static void d(Context context) {
        String strB = b(context);
        k = strB;
        com.smartdigimkt.e0.d.a(new com.smartdigimkt.e0.b(strB));
        com.smartdigimkt.e0.d.b().a();
    }

    public static String e() {
        return k;
    }

    public static int f() {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            long jLongValue = ((Long) x.b(contextD, "TotalDataSize", 0L)).longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue > 1800000 || f39032h == -1) {
                f39032h = Long.valueOf((i() / 1000) / 1000).intValue();
                x.d(contextD, "TotalDataSize", Long.valueOf(jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return f39032h;
    }

    public static long g() {
        if (l()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }

    public static int h() {
        if (f == -1) {
            try {
                f = new Long((g() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return f;
    }

    public static long i() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    public static boolean j() {
        return b() > 31457280;
    }

    public static boolean k() {
        return f39030c;
    }

    public static boolean l() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    public static long d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static long a(Context context) {
        try {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            StatFs statFs = new StatFs(absolutePath);
            statFs.restat(absolutePath);
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static boolean a(long j2) {
        return b() > j2;
    }

    public static int a() {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            long jLongValue = ((Long) x.b(contextD, "FreeDataSize", 0L)).longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue > 1800000 || f39033i == -1) {
                f39033i = Long.valueOf((d() / 1000) / 1000).intValue();
                x.d(contextD, "FreeDataSize", Long.valueOf(jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return f39033i;
    }

    public static int c() {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            long jLongValue = ((Long) x.b(contextD, "freeExternalSize", 0L)).longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue > 1800000 || g == -1) {
                g = Long.valueOf((b() / 1000) / 1000).intValue();
                x.d(contextD, "freeExternalSize", Long.valueOf(jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return g;
    }

    public static long b() {
        if (l()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }
}
