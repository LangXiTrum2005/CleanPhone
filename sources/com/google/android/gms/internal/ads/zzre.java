package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzre extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    public zzre(int i2, zzv zzvVar, boolean z2) {
        super(androidx.datastore.preferences.protobuf.a.g(i2, "AudioTrack write failed: ", new StringBuilder(String.valueOf(i2).length() + 25)));
        this.zzb = z2;
        this.zza = i2;
        this.zzc = zzvVar;
    }
}
