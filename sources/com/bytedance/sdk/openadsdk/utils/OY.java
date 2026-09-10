package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class OY {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.OY$1, reason: invalid class name */
    public static class AnonymousClass1 implements FilenameFilter {
        private final Pattern Lxb = Pattern.compile("^cpu[0-9]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.Lxb.matcher(str).matches();
        }
    }

    public static int LD(Context context) {
        return com.bytedance.sdk.openadsdk.core.lk.Lxb(context).LD("cpu_max_frequency", 0);
    }

    public static int Lxb() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 0);
    }

    public static int lk(Context context) {
        return com.bytedance.sdk.openadsdk.core.lk.Lxb(context).LD("cpu_min_frequency", 0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #5 {Exception -> 0x0062, blocks: (B:26:0x005e, B:29:0x0066), top: B:49:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0073 A[Catch: Exception -> 0x0076, TRY_LEAVE, TryCatch #2 {Exception -> 0x0076, blocks: (B:33:0x006e, B:35:0x0073), top: B:43:0x006e }] */
    public static int LD(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        int i2;
        int i3 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i3;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_min_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String line = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(line) && ((i2 = Integer.parseInt(line)) < i3 || i3 == 0)) {
                            i3 = i2;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.component.utils.sLN.Lxb("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            bufferedReader2 = bufferedReader;
                        } catch (Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused3) {
                                    throw th3;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th = th4;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th5) {
                bufferedReader = bufferedReader2;
                th = th5;
            }
        }
    }

    public static int Lxb(Context context) {
        return com.bytedance.sdk.openadsdk.core.lk.Lxb(context).LD("cpu_count", 0);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[Catch: Exception -> 0x005f, TRY_LEAVE, TryCatch #0 {Exception -> 0x005f, blocks: (B:24:0x005b, B:27:0x0063), top: B:37:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #5 {Exception -> 0x0073, blocks: (B:31:0x006b, B:33:0x0070), top: B:47:0x006b }] */
    public static int Lxb(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        int i2;
        int i3 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i3;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String line = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(line) && (i2 = Integer.parseInt(line)) > i3) {
                            i3 = i2;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.component.utils.sLN.Lxb("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            bufferedReader2 = bufferedReader;
                        } catch (Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused3) {
                                    throw th3;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th = th4;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th5) {
                bufferedReader = bufferedReader2;
                th = th5;
            }
        }
    }
}
