package com.smartdigimkt.v0;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f39006a = "SameFileMD5";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static char[] f39007b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static MessageDigest f39008c;

    static {
        f39008c = null;
        try {
            f39008c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e2) {
            System.err.println(o.class.getName().concat("Init fail,MessageDigest not support MD5Util."));
            e2.printStackTrace();
        }
    }

    public static String a(String str) throws IOException {
        return a(new File(str));
    }

    public static String b(String str) throws IOException {
        return TextUtils.isEmpty(str) ? "" : b(new File(str));
    }

    public static String a(File file) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                f39008c.update(fileInputStream2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length()));
                String strA = a(f39008c.digest());
                fileInputStream2.close();
                return strA;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                    return "";
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                    throw th;
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String b(File file) throws IOException {
        if (file == null || !file.exists()) {
            return "";
        }
        RandomAccessFile randomAccessFile = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[10485760];
                while (true) {
                    int i2 = randomAccessFile2.read(bArr);
                    if (i2 != -1) {
                        messageDigest.update(bArr, 0, i2);
                    } else {
                        String strA = a(messageDigest.digest());
                        try {
                            randomAccessFile2.close();
                            return strA;
                        } catch (IOException e2) {
                            e2.getMessage();
                            return strA;
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                try {
                    th.getMessage();
                    return "";
                } finally {
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e3) {
                            e3.getMessage();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private static String a(byte[] bArr, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer(i3 * 2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            a(bArr[i2], stringBuffer);
            i2++;
        }
        return stringBuffer.toString();
    }

    private static void a(byte b2, StringBuffer stringBuffer) {
        char[] cArr = f39007b;
        char c2 = cArr[(b2 & 240) >> 4];
        char c3 = cArr[b2 & 15];
        stringBuffer.append(c2);
        stringBuffer.append(c3);
    }
}
