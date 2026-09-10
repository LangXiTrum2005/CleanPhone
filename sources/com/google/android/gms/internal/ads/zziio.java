package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class zziio extends zziir implements zzasv {
    protected final String zza = "moov";

    public zziio(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final void zzb(zziis zziisVar, ByteBuffer byteBuffer, long j, zzass zzassVar) throws IOException {
        zziisVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zziisVar;
        this.zze = zziisVar.zzc();
        zziisVar.zzd(zziisVar.zzc() + j);
        this.zzf = zziisVar.zzc();
        this.zzb = zzassVar;
    }
}
