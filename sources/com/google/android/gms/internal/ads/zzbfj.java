package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbfj {
    private final zzbfo zza;
    private final zzbfp.zzt.zza zzb;
    private final boolean zzc;

    private zzbfj() {
        this.zzb = zzbfp.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbfo();
    }

    public static zzbfj zza() {
        return new zzbfj();
    }

    private final synchronized void zzd(int i2) {
        zzbfp.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(com.google.android.gms.ads.internal.util.zzs.zzk());
        zzbfn zzbfnVar = new zzbfn(this.zza, zzaVar.zzbu().zzaN(), null);
        int i3 = i2 - 1;
        zzbfnVar.zzb(i3);
        zzbfnVar.zza();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i3, 10))));
    }

    private final synchronized void zze(int i2) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfwj.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(zzf(i2).getBytes());
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

    private final synchronized String zzf(int i2) {
        StringBuilder sb;
        zzbfp.zzt.zza zzaVar = this.zzb;
        String strZzf = zzaVar.zzf();
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(zzaVar.zzbu().zzaN(), 3);
        sb = new StringBuilder("id=");
        sb.append(strZzf);
        sb.append(",timestamp=");
        sb.append(jElapsedRealtime);
        sb.append(",event=");
        sb.append(i2 - 1);
        sb.append(",data=");
        sb.append(strEncodeToString);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        return sb.toString();
    }

    public final synchronized void zzb(zzbfi zzbfiVar) {
        if (this.zzc) {
            try {
                zzbfiVar.zza(this.zzb);
            } catch (NullPointerException e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i2) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfZ)).booleanValue()) {
                zze(i2);
            } else {
                zzd(i2);
            }
        }
    }

    public zzbfj(zzbfo zzbfoVar) {
        this.zzb = zzbfp.zzt.zzx();
        this.zza = zzbfoVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfY)).booleanValue();
    }
}
