package com.bytedance.adsdk.lr.ka;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private final fi ri;

    public xha(fi fiVar) {
        this.ri = fiVar;
    }

    private File lr(String str) throws FileNotFoundException {
        File file = new File(ri(), ri(str, ik.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(ri(), ri(str, ik.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public Pair<ik, InputStream> ri(String str) {
        try {
            File fileLr = lr(str);
            if (fileLr == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileLr);
            ik ikVar = fileLr.getAbsolutePath().endsWith(".zip") ? ik.ZIP : ik.JSON;
            fileLr.getAbsolutePath();
            return new Pair<>(ikVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public File ri(String str, InputStream inputStream, ik ikVar) throws IOException {
        File file = new File(ri(), ri(str, ikVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    public void ri(String str, ik ikVar) {
        File file = new File(ri(), ri(str, ikVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File ri() {
        File fileRi = this.ri.ri();
        if (fileRi.isFile()) {
            fileRi.delete();
        }
        if (!fileRi.exists()) {
            fileRi.mkdirs();
        }
        return fileRi;
    }

    private static String ri(String str, ik ikVar, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? ikVar.ri() : ikVar.ik);
        return sb.toString();
    }
}
