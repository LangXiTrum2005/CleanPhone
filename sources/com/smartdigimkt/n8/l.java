package com.smartdigimkt.n8;

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

/* JADX INFO: loaded from: classes4.dex */
public class l {
    private static long a(Context context) {
        if (a() && d(context)) {
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

    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[PHI: r1
  0x0047: PHI (r1v2 java.io.File) = (r1v1 java.io.File), (r1v1 java.io.File), (r1v5 java.io.File) binds: [B:9:0x000f, B:11:0x0015, B:13:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    public static File b(Context context) {
        File fileC;
        File file;
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                fileC = c(externalFilesDir);
                if (fileC != null) {
                    return fileC;
                }
            } else {
                fileC = null;
            }
        } catch (Throwable unused) {
        }
        if (fileC == null && d(context)) {
            fileC = c(new File(Environment.getExternalStorageDirectory().getPath() + File.separator + context.getPackageName()));
            file = c(context) ? fileC : null;
        }
        return file == null ? new File(context.getFilesDir().getAbsoluteFile().getAbsolutePath()) : file;
    }

    private static File c(File file) {
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

    private static boolean d(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    public static String d(File file) throws Throwable {
        IOException e2;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            if (file == 0) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    try {
                        file = new StringBuffer();
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                file.append(line + IOUtils.LINE_SEPARATOR_UNIX);
                            } catch (IOException e3) {
                                e2 = e3;
                                try {
                                    e2.printStackTrace();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                        file = file;
                                    }
                                    if (file != 0) {
                                        return file.toString();
                                    }
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }
                        bufferedReader.close();
                        file = file;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    file = 0;
                }
            } catch (IOException e5) {
                e2 = e5;
                file = 0;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
        if (file != 0) {
            return file.toString();
        }
        return null;
    }

    private static boolean a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static boolean c(Context context) {
        return a(context) > 31457280;
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0L;
        }
        try {
            if (file.isDirectory()) {
                return b(file);
            }
            return a(file);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String b(String str) {
        return e.b(str);
    }

    private static long b(File file) throws Exception {
        long jA;
        File[] fileArrListFiles = file.listFiles();
        long j = 0;
        if (fileArrListFiles != null) {
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                if (fileArrListFiles[i2].isDirectory()) {
                    jA = b(fileArrListFiles[i2]);
                } else {
                    jA = a(fileArrListFiles[i2]);
                }
                j += jA;
            }
        }
        return j;
    }

    private static long a(File file) throws Exception {
        FileInputStream fileInputStream;
        long jAvailable = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        fileInputStream = new FileInputStream(file);
                        try {
                            jAvailable = fileInputStream.available();
                            fileInputStream2 = fileInputStream;
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = fileInputStream;
                            e.printStackTrace();
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            return 0L;
                        } catch (Throwable th) {
                            th = th;
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
                    if (fileInputStream2 == null) {
                        return jAvailable;
                    }
                    fileInputStream2.close();
                    return jAvailable;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = null;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static boolean a(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return true;
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    if (fileOutputStream2 == null) {
                        return false;
                    }
                    try {
                        fileOutputStream2.close();
                        return false;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
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
            fileOutputStream = null;
        }
    }
}
