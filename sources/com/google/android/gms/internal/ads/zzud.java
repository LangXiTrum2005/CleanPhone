package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final class zzud {
    public final zzuj zza;
    public final MediaFormat zzb;
    public final zzv zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzuc zzf;

    private zzud(zzuj zzujVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto, zzuc zzucVar) {
        this.zza = zzujVar;
        this.zzb = mediaFormat;
        this.zzc = zzvVar;
        this.zzd = surface;
        this.zzf = zzucVar;
    }

    public static zzud zza(zzuj zzujVar, MediaFormat mediaFormat, zzv zzvVar, MediaCrypto mediaCrypto, zzuc zzucVar) {
        return new zzud(zzujVar, mediaFormat, zzvVar, null, null, zzucVar);
    }

    public static zzud zzb(zzuj zzujVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzud(zzujVar, mediaFormat, zzvVar, surface, null, null);
    }
}
