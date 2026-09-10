package com.bykv.vk.openvk.qdl.qdl.ud.mml;

import android.support.v4.media.a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    public static File lnr(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static long qdl(String str, String str2) {
        File fileLnr = lnr(str, str2);
        if (fileLnr.exists()) {
            return fileLnr.length();
        }
        File fileUd = ud(str, str2);
        if (fileUd.exists()) {
            return fileUd.length();
        }
        return 0L;
    }

    public static File ud(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, a.m(str2, ".temp"));
    }

    public static void qdl(RandomAccessFile randomAccessFile, byte[] bArr, int i2, int i3, String str) throws IOException {
        try {
            randomAccessFile.seek(i2);
            randomAccessFile.write(bArr, 0, i3);
        } catch (Throwable unused) {
        }
    }
}
