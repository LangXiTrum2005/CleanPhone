package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
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

/* JADX INFO: loaded from: classes.dex */
public class wd {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.wd$1, reason: invalid class name */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    public static final class qdl implements Comparator<File> {
        private qdl() {
        }

        private int qdl(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }

        public /* synthetic */ qdl(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return qdl(file.lastModified(), file2.lastModified());
        }
    }

    public static void lnr(File file) {
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
                        lnr(file2);
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

    public static byte[] mml(File file) {
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

    private static void mo(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    private static void mzz(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long length = file.length();
        if (length == 0) {
            mo(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            long j = length - 1;
            try {
                randomAccessFile.seek(j);
                byte b2 = randomAccessFile.readByte();
                randomAccessFile.seek(j);
                randomAccessFile.write(b2);
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

    public static File qdl(Context context, boolean z2, String str, String str2) {
        String strUd = ud(context);
        if (z2) {
            str = qdl(context) + TokenBuilder.TOKEN_DELIMITER + str;
        }
        if (strUd != null) {
            String str3 = File.separator;
            if (!strUd.endsWith(str3)) {
                strUd = a.m(strUd, str3);
            }
        }
        String strM = a.m(strUd, str);
        File file = new File(strM);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(strM, str2);
    }

    private static String ud(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static void ud(File file) throws IOException {
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            mzz(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    public static File qdl(Context context, boolean z2, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z2) {
            str = qdl(context) + TokenBuilder.TOKEN_DELIMITER + str;
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = a.m(absolutePath, str2);
            }
        }
        File file = new File(a.m(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static List<File> qdl(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new qdl(null));
        return listAsList;
    }

    public static String qdl(Context context) {
        String strQdl = oth.qdl(context);
        return (TextUtils.isEmpty(strQdl) || !strQdl.contains(":")) ? strQdl : strQdl.replace(":", TokenBuilder.TOKEN_DELIMITER);
    }
}
