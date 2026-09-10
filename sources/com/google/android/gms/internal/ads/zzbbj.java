package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbbj {
    private final zzbbp zza;
    private final zzbbq.zzt.zza zzb;
    private final boolean zzc;

    private zzbbj() {
        this.zzb = zzbbq.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbbp();
    }

    public static zzbbj zza() {
        return new zzbbj();
    }

    private final synchronized String zzd(int i) {
        StringBuilder sb;
        String strZzah = this.zzb.zzah();
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(this.zzb.zzbr().zzaV(), 3);
        sb = new StringBuilder("id=");
        sb.append(strZzah);
        sb.append(",timestamp=");
        sb.append(jElapsedRealtime);
        sb.append(",event=");
        sb.append(i - 1);
        sb.append(",data=");
        sb.append(strEncodeToString);
        sb.append("\n");
        return sb.toString();
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfpv.zza(zzfpu.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(zzd(i).getBytes());
            } catch (IOException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i) {
        zzbbq.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(com.google.android.gms.ads.internal.util.zzs.zzd());
        zzbbn zzbbnVar = new zzbbn(this.zza, this.zzb.zzbr().zzaV(), null);
        int i2 = i - 1;
        zzbbnVar.zza(i2);
        zzbbnVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(zzbbi zzbbiVar) {
        if (this.zzc) {
            try {
                zzbbiVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeX)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzbbj(zzbbp zzbbpVar) {
        this.zzb = zzbbq.zzt.zzj();
        this.zza = zzbbpVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeW)).booleanValue();
    }
}
