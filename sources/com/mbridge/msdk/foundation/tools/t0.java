package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f34191a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f34192b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f34193c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f34194d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f34195e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            t0.b();
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f34192b) {
                return;
            }
            f34192b = true;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                f34191a = externalFilesDir.getAbsolutePath();
            }
            try {
                b(context);
            } catch (Exception unused) {
                b(context);
            }
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }

    private static void b(Context context) {
        File externalFilesDir;
        if (TextUtils.isEmpty(f34191a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            f34191a = externalFilesDir.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(f34191a)) {
            com.mbridge.msdk.foundation.same.directory.e.a(new com.mbridge.msdk.foundation.same.directory.d(f34191a));
            com.mbridge.msdk.foundation.same.directory.e.b().a();
        }
        b();
    }

    public static int c() {
        return f34194d;
    }

    public static int a() {
        if (System.currentTimeMillis() - f34195e > 1800000) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        }
        return f34193c;
    }

    public static void b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            f34194d = Long.valueOf(((((long) statFs.getBlockCount()) * blockSize) / 1000) / 1000).intValue();
            f34193c = Long.valueOf(((availableBlocks * blockSize) / 1000) / 1000).intValue();
            f34195e = System.currentTimeMillis();
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }
}
