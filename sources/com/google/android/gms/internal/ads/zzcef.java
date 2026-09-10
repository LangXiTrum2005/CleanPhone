package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcef implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzceo zzb;

    public zzcef(zzceo zzceoVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzceoVar);
        this.zzb = zzceoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzceo zzceoVar = this.zzb;
        zzceoVar.zzs(this.zza);
        if (zzceoVar.zzt() != null) {
            zzceoVar.zzt().zzb();
        }
    }
}
