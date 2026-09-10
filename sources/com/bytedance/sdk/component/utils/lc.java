package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
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
public class lc {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.lc$1, reason: invalid class name */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    public static final class Lxb implements Comparator<File> {
        private Lxb() {
        }

        public /* synthetic */ Lxb(AnonymousClass1 anonymousClass1) {
            this();
        }

        private int Lxb(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return Lxb(file.lastModified(), file2.lastModified());
        }
    }

    private static void JXs(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long length = file.length();
        if (length == 0) {
            lc(file);
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

    private static String LD(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static File Lxb(Context context, boolean z, String str, String str2) {
        String strLD = LD(context);
        if (z) {
            str = Lxb(context) + "-" + str;
        }
        if (strLD != null) {
            String str3 = File.separator;
            if (!strLD.endsWith(str3)) {
                strLD = DM.h(strLD, str3);
            }
        }
        String strH = DM.h(strLD, str);
        File file = new File(strH);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(strH, str2);
    }

    public static byte[] ZU(File file) {
        FileInputStream fileInputStream;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
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
                fileInputStream.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    private static void lc(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    public static void lk(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            try {
                file.delete();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    lk(file2);
                } else {
                    try {
                        file2.delete();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        try {
            file.delete();
        } catch (Throwable unused3) {
        }
    }

    public static void LD(File file) throws IOException {
        if (file.exists()) {
            sLN.Lxb("splashLoadAd", "update file modify time");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            JXs(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    public static File Lxb(Context context, boolean z, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z) {
            str = Lxb(context) + "-" + str;
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = DM.h(absolutePath, str2);
            }
        }
        File file = new File(DM.h(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static List<File> Lxb(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new Lxb(null));
        return listAsList;
    }

    public static String Lxb(Context context) {
        String strLxb = brP.Lxb(context);
        return (TextUtils.isEmpty(strLxb) || !strLxb.contains(":")) ? strLxb : strLxb.replace(":", "-");
    }
}
