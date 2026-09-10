package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcgk extends zzasr {
    static final zzcgk zzb = new zzcgk();

    @Override // com.google.android.gms.internal.ads.zzasr
    public final zzasv zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzasx();
        }
        return "mvhd".equals(str) ? new zzasy() : new zzasz(str);
    }
}
