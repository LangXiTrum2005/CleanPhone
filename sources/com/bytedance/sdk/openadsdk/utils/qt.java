package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class qt {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.qt$1, reason: invalid class name */
    public static class AnonymousClass1 implements FilenameFilter {
        private final Pattern ri = Pattern.compile("^cpu[0-9]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.ri.matcher(str).matches();
        }
    }

    public static int ik() {
        return com.bytedance.sdk.openadsdk.core.ik.ri().lr("cpu_max_frequency", 0);
    }

    public static int ka() {
        return com.bytedance.sdk.openadsdk.core.ik.ri().lr("cpu_min_frequency", 0);
    }

    public static int lr() {
        return com.bytedance.sdk.openadsdk.core.ik.ri().lr("cpu_count", 0);
    }

    public static int ri() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #3 {Exception -> 0x0064, blocks: (B:24:0x005c, B:26:0x0061), top: B:44:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e A[Catch: Exception -> 0x0071, TRY_LEAVE, TryCatch #6 {Exception -> 0x0071, blocks: (B:30:0x0069, B:32:0x006e), top: B:50:0x0069 }] */
    public static int lr(int i) {
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
                            com.bytedance.sdk.component.utils.ac.ik("CpuUtils", th.getMessage());
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

    /* JADX WARN: Code duplicated, block: B:24:0x005e A[Catch: Exception -> 0x0061, TRY_LEAVE, TryCatch #5 {Exception -> 0x0061, blocks: (B:22:0x0059, B:24:0x005e), top: B:46:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006b A[Catch: Exception -> 0x006e, TRY_LEAVE, TryCatch #0 {Exception -> 0x006e, blocks: (B:28:0x0066, B:30:0x006b), top: B:36:0x0066 }] */
    public static int ri(int i) {
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
                            com.bytedance.sdk.component.utils.ac.ik("CpuUtils", th.getMessage());
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
