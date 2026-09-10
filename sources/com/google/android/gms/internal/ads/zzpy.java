package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpy extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzpy(int i2, boolean z2) {
        super(androidx.datastore.preferences.protobuf.a.g(i2, "AudioOutput write failed: ", new StringBuilder(String.valueOf(i2).length() + 26)));
        this.zzb = z2;
        this.zza = i2;
    }
}
