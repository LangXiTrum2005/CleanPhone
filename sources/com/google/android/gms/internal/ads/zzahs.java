package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahs {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzahs() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzahr zzahrVar) {
        ByteArrayOutputStream byteArrayOutputStream = this.zza;
        byteArrayOutputStream.reset();
        try {
            DataOutputStream dataOutputStream = this.zzb;
            zzb(dataOutputStream, zzahrVar.zza);
            zzb(dataOutputStream, zzahrVar.zzb);
            dataOutputStream.writeLong(zzahrVar.zzc);
            dataOutputStream.writeLong(zzahrVar.zzd);
            dataOutputStream.write(zzahrVar.zze);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
