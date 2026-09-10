package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class zzce {
    private AudioManager.OnAudioFocusChangeListener zza;
    private Handler zzb;
    private zzd zzc = zzd.zza;

    public zzce(int i2) {
    }

    public final zzce zza(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.zza = onAudioFocusChangeListener;
        this.zzb = handler;
        return this;
    }

    public final zzce zzb(zzd zzdVar) {
        this.zzc = zzdVar;
        return this;
    }

    public final zzch zzc() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.zza;
        if (onAudioFocusChangeListener == null) {
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        Handler handler = this.zzb;
        handler.getClass();
        return new zzch(1, onAudioFocusChangeListener, handler, this.zzc, false);
    }
}
