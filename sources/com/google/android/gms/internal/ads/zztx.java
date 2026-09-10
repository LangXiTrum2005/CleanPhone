package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
final class zztx extends zzih {
    private long zzg;
    private int zzh;
    private int zzi;

    public zztx() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzih, com.google.android.gms.internal.ads.zzic
    public final void zza() {
        super.zza();
        this.zzh = 0;
    }

    public final void zzm(int i2) {
        this.zzi = i2;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final int zzo() {
        return this.zzh;
    }

    public final boolean zzp() {
        return this.zzh > 0;
    }

    public final boolean zzq(zzih zzihVar) {
        ByteBuffer byteBuffer;
        zzgqa.zza(!zzihVar.zzi(1073741824));
        zzgqa.zza(!zzihVar.zzi(268435456));
        zzgqa.zza(!zzihVar.zzi(4));
        if (zzp()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzihVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i2 = this.zzh;
        this.zzh = i2 + 1;
        if (i2 == 0) {
            this.zze = zzihVar.zze;
            if (zzihVar.zzi(1)) {
                zzg(1);
            }
        }
        ByteBuffer byteBuffer3 = zzihVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzihVar.zze;
        return true;
    }
}
