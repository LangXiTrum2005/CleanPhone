package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zziin implements zzasv {
    private static final zziiy zzg = zziiy.zzb(zziin.class);
    protected final String zza;
    long zzd;
    zziis zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    public zziin(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        try {
            if (this.zzc) {
                return;
            }
            try {
                zziiy zziiyVar = zzg;
                String str = this.zza;
                zziiyVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzh = this.zzf.zze(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final void zzb(zziis zziisVar, ByteBuffer byteBuffer, long j, zzass zzassVar) throws IOException {
        this.zzd = zziisVar.zzc();
        byteBuffer.remaining();
        this.zze = j;
        this.zzf = zziisVar;
        zziisVar.zzd(zziisVar.zzc() + j);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        try {
            zzc();
            zziiy zziiyVar = zzg;
            String str = this.zza;
            zziiyVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.zzh;
            if (byteBuffer != null) {
                this.zzb = true;
                byteBuffer.rewind();
                zze(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.zzh = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
