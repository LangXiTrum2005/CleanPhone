package com.thinkup.core.common.o0m.o;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
final class n0 {
    private static final int m = 16384;
    static final int o = 32;

    public static class o {
        static final SecureRandom o = new SecureRandom();
        static final char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        private o() {
        }
    }

    public static int m() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), new Object[0])).intValue();
        } catch (Throwable unused) {
            return 16384;
        }
    }

    public static void n(File file) {
        try {
            if (file.exists()) {
                o0(file);
            }
        } catch (Throwable unused) {
        }
    }

    public static String o() {
        byte[] bArr = new byte[16];
        o.o.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 << 1;
            char[] cArr2 = o.m;
            cArr[i3] = cArr2[(b2 >> 4) & 15];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    private static void o0(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                o0(file2);
            }
        }
        file.delete();
    }

    public static byte[] m(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) == 0) {
            int i2 = (int) length;
            byte[] bArr = new byte[i2];
            o(file, bArr, i2);
            return bArr;
        }
        throw new IllegalArgumentException("file too large, path:" + file.getPath());
    }

    public static boolean o(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    public static void o(File file, byte[] bArr, int i2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i3 = 0;
        while (i3 < i2) {
            try {
                int i4 = randomAccessFile.read(bArr, i3, i2 - i3);
                if (i4 < 0) {
                    break;
                } else {
                    i3 += i4;
                }
            } finally {
                o(randomAccessFile);
            }
        }
    }

    private static void m(File file, File file2) throws Throwable {
        if (!file.exists() || file2.exists() || file.renameTo(file2)) {
            return;
        }
        o(file2, m(file), (AtomicBoolean) null);
        n(file);
    }

    public static boolean o(File file, byte[] bArr, AtomicBoolean atomicBoolean) throws Throwable {
        File file2 = null;
        try {
            try {
                int length = bArr.length;
                File file3 = new File(file.getParent(), file.getName() + ".tmp");
                try {
                    if (!o(file3)) {
                        o(new Exception("create file failed"));
                        if (atomicBoolean != null && atomicBoolean.get()) {
                            n(file3);
                            n(file);
                        }
                        return false;
                    }
                    if (atomicBoolean != null && atomicBoolean.get()) {
                        if (atomicBoolean.get()) {
                            n(file3);
                            n(file);
                        }
                        return false;
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
                    try {
                        randomAccessFile.setLength(length);
                        randomAccessFile.write(bArr, 0, length);
                        if (atomicBoolean != null && atomicBoolean.get()) {
                            randomAccessFile.close();
                            if (atomicBoolean.get()) {
                                n(file3);
                                n(file);
                            }
                            return false;
                        }
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                        boolean zO = o(file3, file);
                        if (atomicBoolean != null && atomicBoolean.get()) {
                            n(file3);
                            n(file);
                        }
                        return zO;
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    e = e;
                    file2 = file3;
                    o(new Exception("save bytes failed", e));
                    if (atomicBoolean != null && atomicBoolean.get()) {
                        n(file2);
                        n(file);
                    }
                    return false;
                } catch (Exception e2) {
                    e = e2;
                    file2 = file3;
                } catch (Throwable th3) {
                    th = th3;
                    file2 = file3;
                    if (atomicBoolean != null && atomicBoolean.get()) {
                        n(file2);
                        n(file);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static boolean o(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        return (!file2.exists() || file2.delete()) && file.renameTo(file2);
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void o(File file, String str) throws Throwable {
        File[] fileArrListFiles;
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                File file3 = new File(str, file2.getName());
                if (file2.exists() && !file3.exists() && !file2.renameTo(file3)) {
                    o(file3, m(file2), (AtomicBoolean) null);
                    n(file2);
                }
            } catch (Exception e2) {
                o(e2);
            }
        }
    }

    private static int o(int[] iArr, int i2) {
        int length = iArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (i3 + length) >>> 1;
            int i5 = iArr[i4];
            if (i5 < i2) {
                i3 = i4 + 1;
            } else {
                if (i5 <= i2) {
                    return i4;
                }
                length = i4 - 1;
            }
        }
        return length;
    }

    private static void o(Exception exc) {
        com.thinkup.core.common.o0m.o.o.n nVar = m0.o;
        if (nVar != null) {
            nVar.m("FastKV", exc);
        }
    }
}
