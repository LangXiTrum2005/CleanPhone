package sg.bigo.ads.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public static long a(long j, int i2) {
        char c2;
        if (i2 == 2) {
            c2 = '\n';
        } else if (i2 == 3) {
            c2 = 20;
        } else {
            if (i2 != 4) {
                return j;
            }
            c2 = 30;
        }
        return j >> c2;
    }

    public static void b(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        b(file2);
                    } else {
                        a(file2);
                    }
                }
            }
        }
        a(file);
    }

    public static String c(String str) {
        return android.support.v4.media.a.m(str, ".tmp");
    }

    public static String d(String str) {
        return android.support.v4.media.a.m(str, ".tmp");
    }

    public static long a(String str, int i2) {
        File file = new File(str);
        if (file.exists()) {
            return a(file.length(), i2);
        }
        return 0L;
    }

    public static boolean b(String str) {
        if (q.a((CharSequence) str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        return file.delete();
    }

    public static boolean b(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return false;
        }
        return new File(str, str2).exists();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean a(String str) throws Throwable {
        FileInputStream fileInputStream;
        Exception e2;
        File file = new File(str);
        boolean z2 = false;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    fileInputStream.read(bArr);
                    String str2 = new String(bArr);
                    if (str2.contains("ftyp") && str2.contains("moov")) {
                        sg.bigo.ads.common.t.a.a(0, 3, "FileUtils", "contains ftyp moov");
                        z2 = true;
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    sg.bigo.ads.common.t.a.a(0, "FileUtils", "read file " + file.getPath() + " failed" + e2.getMessage());
                    if (fileInputStream != null) {
                    }
                    return z2;
                }
            } catch (Exception e4) {
                fileInputStream = null;
                e2 = e4;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            return z2;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    public static boolean a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str, str2);
        try {
            boolean zMkdirs = !file.exists() ? file.mkdirs() : true;
            if (file2.exists()) {
                return zMkdirs;
            }
            return zMkdirs && file2.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static void c(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return;
        }
        File file = new File(str, str2);
        if (file.exists()) {
            file.setLastModified(System.currentTimeMillis());
        }
    }

    public static boolean c(File file) {
        try {
            File parentFile = file.getParentFile();
            boolean zMkdirs = !parentFile.exists() ? parentFile.mkdirs() : true;
            if (file.exists()) {
                return zMkdirs;
            }
            return zMkdirs && file.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }
}
