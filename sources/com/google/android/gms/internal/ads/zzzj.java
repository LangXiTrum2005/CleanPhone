package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzzj {
    private final Spatializer zza;
    private final boolean zzb;
    private final Handler zzc;
    private final Spatializer$OnSpatializerStateChangedListener zzd;

    public zzzj(Context context, zzzu zzzuVar, Boolean bool) {
        AudioManager audioManagerZza = context == null ? null : zzcj.zza(context);
        if (audioManagerZza == null || (bool != null && bool.booleanValue())) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        Spatializer spatializer = audioManagerZza.getSpatializer();
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
        zzzh zzzhVar = new zzzh(this, zzzuVar);
        this.zzd = zzzhVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        final Handler handler = new Handler(looperMyLooper);
        this.zzc = handler;
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzzi
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zzzhVar);
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return androidx.core.view.accessibility.a.c(spatializer).isAvailable();
    }

    public final boolean zzc() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return androidx.core.view.accessibility.a.c(spatializer).isEnabled();
    }

    public final boolean zzd(zzd zzdVar, zzv zzvVar) {
        int i2;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i2 = zzvVar.zzG;
            if (i2 == 16) {
                i2 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i2 = zzvVar.zzG;
            if (i2 == -1) {
                i2 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            i2 = zzvVar.zzG;
            if (i2 == 18 || i2 == 21) {
                i2 = 24;
            }
        } else {
            i2 = zzvVar.zzG;
        }
        int iZzB = zzfj.zzB(i2);
        if (iZzB == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iZzB);
        int i3 = zzvVar.zzH;
        if (i3 != -1) {
            channelMask.setSampleRate(i3);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return androidx.core.view.accessibility.a.c(spatializer).canBeSpatialized(zzdVar.zza(), channelMask.build());
    }

    public final void zze() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }
}
