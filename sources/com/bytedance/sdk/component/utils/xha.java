package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class xha {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.xha$1, reason: invalid class name */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    public static final class ri implements Comparator<File> {
        private ri() {
        }

        private int ri(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }

        public /* synthetic */ ri(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return ri(file.lastModified(), file2.lastModified());
        }
    }

    private static void di(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    private static void fi(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long length = file.length();
        if (length == 0) {
            di(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            long j = length - 1;
            try {
                randomAccessFile.seek(j);
                byte b = randomAccessFile.readByte();
                randomAccessFile.seek(j);
                randomAccessFile.write(b);
                randomAccessFile.close();
            } catch (Throwable unused) {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            }
        } catch (Throwable unused2) {
            randomAccessFile = null;
        }
    }

    public static void ik(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        ik(file2);
                    } else {
                        try {
                            file2.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            file.delete();
        } catch (Throwable unused2) {
        }
    }

    public static byte[] ka(File file) {
        FileInputStream fileInputStream;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    if (fileInputStream.read(bArr) == length) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return bArr;
                    }
                } catch (Throwable unused2) {
                    if (fileInputStream != null) {
                    }
                    return null;
                }
            } catch (Throwable unused3) {
                fileInputStream = null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    public static File lr(Context context, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = absolutePath + str2;
            }
        }
        File file = new File(absolutePath + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File ri(Context context, File file, String str) {
        if (file != null) {
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable unused) {
                return new File(file, str);
            }
        }
        if (ihz.ri(context)) {
            return new File(file, str);
        }
        return new File(file, str + "_" + ihz.ik(context));
    }

    public static void lr(File file) throws IOException {
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            fi(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    public static File ri(Context context, String str, String str2) {
        String strRi = ri(context);
        if (!ihz.ri(context)) {
            str = str + "_" + ihz.ik(context);
        }
        if (strRi != null) {
            String str3 = File.separator;
            if (!strRi.endsWith(str3)) {
                strRi = strRi + str3;
            }
        }
        String str4 = strRi + str;
        File file = new File(str4);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(str4, str2);
    }

    public static File ri(Context context, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (!ihz.ri(context)) {
            str = str + "_" + ihz.ik(context);
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = absolutePath + str2;
            }
        }
        File file = new File(absolutePath + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String ri(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static List<File> ri(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new ri(null));
        return listAsList;
    }
}
