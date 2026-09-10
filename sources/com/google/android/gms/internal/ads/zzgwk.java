package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgwk {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgvz zzgvzVar = new zzgvz();
        file.getClass();
        zzgtn zzgtnVarZzp = zzgtn.zzp(new zzgwh[0]);
        bArr.getClass();
        FileOutputStream fileOutputStreamZza = zzgwi.zza(file, zzgtnVarZzp, zzgvzVar);
        try {
            fileOutputStreamZza.write(bArr);
            fileOutputStreamZza.close();
        } catch (Throwable th) {
            try {
                fileOutputStreamZza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void zzc(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        zzgqa.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        zzgqa.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        zzgwj zzgwjVar = new zzgwj(file, null);
        zzgvz zzgvzVar = new zzgvz();
        zzgtn zzgtnVarZzp = zzgtn.zzp(new zzgwh[0]);
        zzgwg zzgwgVarZza = zzgwg.zza();
        try {
            InputStream inputStreamZza = zzgwjVar.zza();
            zzgwgVarZza.zzb(inputStreamZza);
            FileOutputStream fileOutputStreamZza = zzgwi.zza(file2, zzgtnVarZzp, zzgvzVar);
            zzgwgVarZza.zzb(fileOutputStreamZza);
            int i2 = zzgwd.zza;
            byte[] bArr = new byte[Segment.SIZE];
            while (true) {
                int i3 = inputStreamZza.read(bArr);
                if (i3 == -1) {
                    break;
                } else {
                    fileOutputStreamZza.write(bArr, 0, i3);
                }
            }
            zzgwgVarZza.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                throw zzgwgVarZza.zzc(th);
            } catch (Throwable th2) {
                zzgwgVarZza.close();
                throw th2;
            }
        }
    }
}
