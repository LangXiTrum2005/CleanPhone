package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzetv implements zzezx {
    private final zzgyw zza;
    private final Context zzb;

    public zzetv(zzgyw zzgywVar, Context context) {
        this.zza = zzgywVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzetu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 13;
    }

    public final /* synthetic */ zzetw zzc() {
        int i2;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        float fZzb = com.google.android.gms.ads.internal.zzt.zzi().zzb();
        boolean zZzd = com.google.android.gms.ads.internal.zzt.zzi().zzd();
        if (audioManager == null) {
            return new zzetw(-1, false, false, -1, -1, -1, -1, -1, fZzb, zZzd, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmq)).booleanValue()) {
            int iZzk = com.google.android.gms.ads.internal.zzt.zzf().zzk(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
            i2 = iZzk;
        } else {
            i2 = -1;
            streamMaxVolume = -1;
        }
        return new zzetw(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i2, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fZzb, zZzd, false);
    }
}
