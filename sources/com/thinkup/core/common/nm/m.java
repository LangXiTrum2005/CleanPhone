package com.thinkup.core.common.nm;

import android.app.ActivityManager;
import android.content.Context;
import com.applovin.shadow.okio.Segment;
import com.thinkup.core.common.ooo.mm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    public static int m() {
        return o(3);
    }

    public static int o() {
        return o(1);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0048 A[EXC_TOP_SPLITTER, PHI: r3
  0x0048: PHI (r3v3 java.io.FileReader) = (r3v2 java.io.FileReader), (r3v4 java.io.FileReader) binds: [B:18:0x0046, B:24:0x0052] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private static int o(int i2) {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(mm.m("L3Byb2MvbWVtaW5mbw=="));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, Segment.SIZE);
                String line = "";
                for (int i3 = 0; i3 < i2; i3++) {
                    try {
                        line = bufferedReader2.readLine();
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        return 0;
                    } catch (Throwable unused4) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        return 0;
                    }
                }
                int iLongValue = (int) (Long.valueOf(line.split("\\s+")[1]).longValue() / 1024);
                try {
                    bufferedReader2.close();
                } catch (IOException unused6) {
                }
                try {
                    fileReader.close();
                } catch (IOException unused7) {
                }
                return iLongValue;
            } catch (IOException unused8) {
            } catch (Throwable unused9) {
            }
        } catch (IOException unused10) {
            fileReader = null;
        } catch (Throwable unused11) {
            fileReader = null;
        }
    }

    public static int o(ActivityManager activityManager) {
        try {
            activityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
            return (int) ((Runtime.getRuntime().totalMemory() / 1024) / 1024);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static int o(Context context, ActivityManager activityManager) {
        return (context.getApplicationContext().getApplicationInfo().flags & 1048576) == 1048576 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
    }
}
