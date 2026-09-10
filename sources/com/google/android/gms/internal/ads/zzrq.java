package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
final class zzrq {
    private final AudioTrack zza;
    private final Handler zzb;
    private AudioRouting.OnRoutingChangedListener zzc;
    private final zzsd zzd;

    public /* synthetic */ zzrq(AudioTrack audioTrack, zzsd zzsdVar, byte[] bArr) {
        this.zza = audioTrack;
        this.zzd = zzsdVar;
        Handler handlerZzc = zzfj.zzc(null);
        this.zzb = handlerZzc;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzrp
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                this.zza.zza(audioRouting);
            }
        };
        this.zzc = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerZzc);
    }

    public final /* synthetic */ void zza(final AudioRouting audioRouting) {
        if (this.zzc == null) {
            return;
        }
        zzdh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(audioRouting);
            }
        });
    }

    public final /* synthetic */ void zzb(AudioRouting audioRouting) {
        final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzro
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(routedDevice);
                }
            });
        }
    }

    public final /* synthetic */ void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (this.zzc == null) {
            return;
        }
        zzse zzseVar = this.zzd.zza;
        if (zzseVar.zzi() != null) {
            zzseVar.zzi().zzc(audioDeviceInfo);
        }
    }

    public final /* synthetic */ void zzd() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }
}
