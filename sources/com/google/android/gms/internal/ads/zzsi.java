package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsi {
    private final Context zza;
    private Boolean zzb;

    public zzsi() {
        this(null);
    }

    public final zzpw zza(zzv zzvVar, zzd zzdVar) {
        int i2;
        boolean zBooleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29 || (i2 = zzvVar.zzH) == -1) {
            return zzpw.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z2 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = Boolean.FALSE;
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzo;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (iZzg == 0 || i3 < zzfj.zzC(iZzg)) {
            return zzpw.zza;
        }
        int iZzB = zzfj.zzB(zzvVar.zzG);
        if (iZzB == 0) {
            return zzpw.zza;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(iZzB).setEncoding(iZzg).build();
            if (i3 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, zzdVar.zza())) {
                    return zzpw.zza;
                }
                zzpv zzpvVar = new zzpv();
                zzpvVar.zza(true);
                zzpvVar.zzc(zBooleanValue);
                return zzpvVar.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, zzdVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzpw.zza;
            }
            zzpv zzpvVar2 = new zzpv();
            if (i3 > 32 && playbackOffloadSupport == 2) {
                z2 = true;
            }
            zzpvVar2.zza(true);
            zzpvVar2.zzb(z2);
            zzpvVar2.zzc(zBooleanValue);
            return zzpvVar2.zzd();
        } catch (IllegalArgumentException unused) {
            return zzpw.zza;
        }
    }

    public zzsi(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }
}
