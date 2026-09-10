package com.smartdigimkt.h8;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f35775a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f35776b = 16384;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final SecureRandom f35777a = new SecureRandom();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final char[] f35778b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        private a() {
        }
    }

    public static int a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", null);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), null)).intValue();
        } catch (Throwable unused) {
            return 16384;
        }
    }

    public static String b() {
        byte[] bArr = new byte[16];
        a.f35777a.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 << 1;
            char[] cArr2 = a.f35778b;
            cArr[i3] = cArr2[(b2 >> 4) & 15];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static byte[] c(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        int i2 = (int) length;
        byte[] bArr = new byte[i2];
        a(file, bArr, i2);
        return bArr;
    }

    public static boolean d(File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    public static void a(File file, byte[] bArr, int i2) throws IOException {
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
                a(randomAccessFile);
            }
        }
    }

    public static boolean b(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        return (!file2.exists() || file2.delete()) && file.renameTo(file2);
    }

    private static void b(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                b(file2);
            }
        }
        file.delete();
    }

    public static boolean a(File file, byte[] bArr, AtomicBoolean atomicBoolean) throws Throwable {
        File file2;
        File file3 = null;
        try {
            try {
                int length = bArr.length;
                file2 = new File(file.getParent(), file.getName() + ".tmp");
                try {
                    if (!d(file2)) {
                        a(new Exception("create file failed"));
                        if (atomicBoolean != null && atomicBoolean.get()) {
                            a(file2);
                            a(file);
                        }
                        return false;
                    }
                    if (atomicBoolean != null && atomicBoolean.get()) {
                        if (atomicBoolean.get()) {
                            a(file2);
                            a(file);
                        }
                        return false;
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        randomAccessFile.setLength(length);
                        randomAccessFile.write(bArr, 0, length);
                        if (atomicBoolean != null && atomicBoolean.get()) {
                            randomAccessFile.close();
                            if (atomicBoolean.get()) {
                                a(file2);
                                a(file);
                            }
                            return false;
                        }
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                        boolean zB = b(file2, file);
                        if (atomicBoolean != null && atomicBoolean.get()) {
                            a(file2);
                            a(file);
                        }
                        return zB;
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    e = e;
                    file3 = file2;
                    a(new Exception("save bytes failed", e));
                    if (atomicBoolean != null && atomicBoolean.get()) {
                        a(file3);
                        a(file);
                    }
                    return false;
                } catch (Exception e2) {
                    e = e2;
                    file3 = file2;
                } catch (Throwable th3) {
                    th = th3;
                    if (atomicBoolean != null && atomicBoolean.get()) {
                        a(file2);
                        a(file);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                file2 = file3;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(File file) {
        try {
            if (file.exists()) {
                b(file);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(File file, String str) {
        File[] fileArrListFiles;
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                a(file2, new File(str, file2.getName()));
            } catch (Exception e2) {
                a(e2);
            }
        }
    }

    private static void a(File file, File file2) throws Throwable {
        if (!file.exists() || file2.exists() || file.renameTo(file2)) {
            return;
        }
        a(file2, c(file), (AtomicBoolean) null);
        a(file);
    }

    public static int a(int[] iArr, int i2) {
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

    private static void a(Exception exc) {
        com.smartdigimkt.i8.c cVar = h.f35757a;
        if (cVar != null) {
            cVar.b("FastKV", exc);
        }
    }
}
