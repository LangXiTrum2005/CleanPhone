package com.google.android.gms.common;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class zzy {
    private static final zzy zze = new zzy(true, 3, 1, null, null, -1);
    final boolean zza;

    @Nullable
    final String zzb;

    @Nullable
    final Throwable zzc;
    final int zzd;

    private zzy(boolean z2, int i2, int i3, @Nullable String str, @Nullable Throwable th, long j) {
        this.zza = z2;
        this.zzd = i2;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    public static zzy zzb() {
        return zze;
    }

    public static zzy zzc(String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    public static zzy zzd(String str, Throwable th) {
        return new zzy(false, 1, 5, str, th, -1L);
    }

    public static zzy zzf(int i2, long j) {
        return new zzy(true, i2, 1, null, null, j);
    }

    public static zzy zzg(int i2, int i3, String str, @Nullable Throwable th) {
        return new zzy(false, i2, i3, str, th, -1L);
    }

    @Nullable
    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.zzc;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", zza(), th);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }

    public /* synthetic */ zzy(boolean z2, int i2, int i3, String str, Throwable th, long j, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
