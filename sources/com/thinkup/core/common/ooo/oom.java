package com.thinkup.core.common.ooo;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class oom {
    private static File m(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        File file2 = new File(file, sb.toString());
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }

    private static boolean n(Context context) {
        return o0(context) > 31457280;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b A[PHI: r1
  0x004b: PHI (r1v2 java.io.File) = (r1v1 java.io.File), (r1v1 java.io.File), (r1v5 java.io.File) binds: [B:9:0x000f, B:11:0x0015, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    public static File o(Context context) {
        File fileM;
        File file;
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                fileM = m(externalFilesDir);
                if (fileM != null) {
                    return fileM;
                }
            } else {
                fileM = null;
            }
        } catch (Throwable unused) {
        }
        if (fileM == null && m(context)) {
            fileM = m(new File(Environment.getExternalStorageDirectory().getPath() + File.separator + context.getPackageName()));
            file = o0(context) > 31457280 ? fileM : null;
        }
        return file == null ? new File(context.getFilesDir().getAbsoluteFile().getAbsolutePath()) : file;
    }

    private static long o0(File file) {
        File[] fileArrListFiles = file.listFiles();
        long jO0 = 0;
        if (fileArrListFiles != null) {
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                jO0 += fileArrListFiles[i2].isDirectory() ? o0(fileArrListFiles[i2]) : n(fileArrListFiles[i2]);
            }
        }
        return jO0;
    }

    private static long n(File file) throws Throwable {
        long jAvailable = 0;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            jAvailable = fileInputStream2.available();
                            fileInputStream = fileInputStream2;
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream = fileInputStream2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return jAvailable;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return jAvailable;
    }

    private static long o0(Context context) {
        if ("mounted".equals(Environment.getExternalStorageState()) && m(context)) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            } catch (Error unused) {
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }

    private static boolean m(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean o() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static long o(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0L;
        }
        try {
            if (file.isDirectory()) {
                return o0(file);
            }
            return n(file);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private static String m(String str) {
        return nm.o(str);
    }

    public static boolean o(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    try {
                        fileOutputStream2.close();
                        return true;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return true;
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049 A[RETURN] */
    public static String o(File file) throws Throwable {
        StringBuffer stringBuffer;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                try {
                    stringBuffer = new StringBuffer();
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            stringBuffer.append(line + IOUtils.LINE_SEPARATOR_UNIX);
                        } catch (IOException e2) {
                            e = e2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                }
                            }
                            if (stringBuffer != null) {
                                return stringBuffer.toString();
                            }
                            return null;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                stringBuffer = null;
            }
        } catch (IOException e4) {
            e = e4;
            stringBuffer = null;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
        bufferedReader.close();
        if (stringBuffer != null) {
            return stringBuffer.toString();
        }
        return null;
    }
}
