package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpu {
    private final Context zza;
    private final zzpt zzb;
    private final Handler zzc;
    private final zzpq zzd;
    private final BroadcastReceiver zze;
    private final zzpr zzf;
    private zzpp zzg;
    private AudioDeviceInfo zzh;
    private zzd zzi;
    private boolean zzj;

    public zzpu(Context context, zzpt zzptVar, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = zzptVar;
        this.zzi = zzdVar;
        this.zzh = audioDeviceInfo;
        Handler handler = new Handler(zzfj.zze(), null);
        this.zzc = handler;
        this.zzd = new zzpq(this, 0 == true ? 1 : 0);
        this.zze = new zzps(this, null);
        Uri uriZzc = zzpp.zzc();
        this.zzf = uriZzc != null ? new zzpr(this, handler, applicationContext.getContentResolver(), uriZzc) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final void zzf(zzpp zzppVar) {
        if (!this.zzj || zzppVar.equals(this.zzg)) {
            return;
        }
        this.zzg = zzppVar;
        this.zzb.zza(zzppVar);
    }

    public final void zza(zzpp zzppVar) {
        zzf(zzppVar);
    }

    public final void zzb(zzd zzdVar) {
        this.zzi = zzdVar;
        zzf(zzpp.zza(this.zza, zzdVar, this.zzh));
    }

    public final void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.zzh)) {
            return;
        }
        this.zzh = audioDeviceInfo;
        zzf(zzpp.zza(this.zza, this.zzi, audioDeviceInfo));
    }

    public final zzpp zzd() {
        if (this.zzj) {
            zzpp zzppVar = this.zzg;
            zzppVar.getClass();
            return zzppVar;
        }
        this.zzj = true;
        zzpr zzprVar = this.zzf;
        if (zzprVar != null) {
            zzprVar.zza();
        }
        Context context = this.zza;
        zzpq zzpqVar = this.zzd;
        Handler handler = this.zzc;
        zzcj.zza(context).registerAudioDeviceCallback(zzpqVar, handler);
        zzpp zzppVarZzb = zzpp.zzb(context, context.registerReceiver(this.zze, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.zzi, this.zzh);
        this.zzg = zzppVarZzb;
        return zzppVarZzb;
    }

    public final void zze() {
        if (this.zzj) {
            this.zzg = null;
            Context context = this.zza;
            zzcj.zza(context).unregisterAudioDeviceCallback(this.zzd);
            context.unregisterReceiver(this.zze);
            zzpr zzprVar = this.zzf;
            if (zzprVar != null) {
                zzprVar.zzb();
            }
            this.zzj = false;
        }
    }

    public final /* synthetic */ Context zzg() {
        return this.zza;
    }

    public final /* synthetic */ AudioDeviceInfo zzh() {
        return this.zzh;
    }

    public final /* synthetic */ void zzi(AudioDeviceInfo audioDeviceInfo) {
        this.zzh = null;
    }

    public final /* synthetic */ zzd zzj() {
        return this.zzi;
    }
}
