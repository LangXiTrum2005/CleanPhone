package com.bytedance.adsdk.LD.ZU;

import android.util.Pair;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ebl {
    private final JXs Lxb;

    public ebl(JXs jXs) {
        this.Lxb = jXs;
    }

    private File LD(String str) throws FileNotFoundException {
        File file = new File(Lxb(), Lxb(str, lk.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(Lxb(), Lxb(str, lk.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    @WorkerThread
    public Pair<lk, InputStream> Lxb(String str) {
        try {
            File fileLD = LD(str);
            if (fileLD == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileLD);
            lk lkVar = fileLD.getAbsolutePath().endsWith(".zip") ? lk.ZIP : lk.JSON;
            fileLD.getAbsolutePath();
            return new Pair<>(lkVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public File Lxb(String str, InputStream inputStream, lk lkVar) throws IOException {
        File file = new File(Lxb(), Lxb(str, lkVar, true));
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

    public void Lxb(String str, lk lkVar) {
        File file = new File(Lxb(), Lxb(str, lkVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File Lxb() {
        File fileLxb = this.Lxb.Lxb();
        if (fileLxb.isFile()) {
            fileLxb.delete();
        }
        if (!fileLxb.exists()) {
            fileLxb.mkdirs();
        }
        return fileLxb;
    }

    private static String Lxb(String str, lk lkVar, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? lkVar.Lxb() : lkVar.lk);
        return sb.toString();
    }
}
