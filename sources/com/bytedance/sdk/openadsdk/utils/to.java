package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class to {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.to$1, reason: invalid class name */
    public static class AnonymousClass1 implements FilenameFilter {
        private final Pattern qdl = Pattern.compile("^cpu[0-9]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.qdl.matcher(str).matches();
        }
    }

    public static int lnr() {
        return com.bytedance.sdk.openadsdk.core.lnr.qdl().ud("cpu_max_frequency", 0);
    }

    public static int mml() {
        return com.bytedance.sdk.openadsdk.core.lnr.qdl().ud("cpu_min_frequency", 0);
    }

    public static int qdl() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 0);
    }

    public static int ud() {
        return com.bytedance.sdk.openadsdk.core.lnr.qdl().ud("cpu_count", 0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e A[Catch: Exception -> 0x0061, TRY_LEAVE, TryCatch #5 {Exception -> 0x0061, blocks: (B:22:0x0059, B:24:0x005e), top: B:46:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006b A[Catch: Exception -> 0x006e, TRY_LEAVE, TryCatch #0 {Exception -> 0x006e, blocks: (B:28:0x0066, B:30:0x006b), top: B:36:0x0066 }] */
    public static int qdl(int i2) {
        BufferedReader bufferedReader;
        Throwable th;
        int i3;
        int i4 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i4;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String line = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(line) && (i3 = Integer.parseInt(line)) > i4) {
                            i4 = i3;
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
                            com.bytedance.sdk.component.utils.aaj.lnr("CpuUtils", th.getMessage());
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

    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #3 {Exception -> 0x0064, blocks: (B:24:0x005c, B:26:0x0061), top: B:44:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e A[Catch: Exception -> 0x0071, TRY_LEAVE, TryCatch #6 {Exception -> 0x0071, blocks: (B:30:0x0069, B:32:0x006e), top: B:50:0x0069 }] */
    public static int ud(int i2) {
        BufferedReader bufferedReader;
        Throwable th;
        int i3;
        int i4 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i4;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_min_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String line = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(line) && ((i3 = Integer.parseInt(line)) < i4 || i4 == 0)) {
                            i4 = i3;
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
                            com.bytedance.sdk.component.utils.aaj.lnr("CpuUtils", th.getMessage());
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
