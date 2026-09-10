package com.thinkup.core.common.nm;

import android.os.Process;
import android.os.SystemClock;
import com.thinkup.core.common.ooo.mm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static long m = 0;
    private static final int o = 100;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f41982n = SystemClock.uptimeMillis();
    private static final File o0 = new File(mm.m("L3Byb2Mv") + Process.myPid() + mm.m("L3N0YXQ="));

    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:29:0x0084, B:31:0x0089, B:33:0x008e), top: B:38:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008e A[Catch: all -> 0x0091, FINALLY_INSNS, TRY_LEAVE, TryCatch #0 {all -> 0x0091, blocks: (B:29:0x0084, B:31:0x0089, B:33:0x008e), top: B:38:0x0084 }] */
    public static int o() {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(o0);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String[] strArrSplit = bufferedReader.readLine().split(" ");
                        long j = Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]);
                        long j2 = j - m;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        float f = ((jUptimeMillis - f41982n) / 1000.0f) * 100.0f;
                        m = j;
                        f41982n = jUptimeMillis;
                        int iAvailableProcessors = (int) (((j2 / f) * 100.0f) / Runtime.getRuntime().availableProcessors());
                        try {
                            bufferedReader.close();
                            inputStreamReader.close();
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return iAvailableProcessors;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused2) {
                                    return 0;
                                }
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            return fileInputStream != null ? 0 : 0;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (inputStreamReader != null) {
                                        inputStreamReader.close();
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                } catch (Throwable unused3) {
                                }
                            } else {
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            inputStreamReader = null;
            bufferedReader = null;
            th = th5;
            fileInputStream = null;
        }
    }
}
