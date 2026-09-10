package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcgg {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzasy zzasyVar;
        zzasx zzasxVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzast(new zzcgf(byteBufferDuplicate), zzcgk.zzb).zzc().iterator();
            while (true) {
                zzasyVar = null;
                if (!it.hasNext()) {
                    zzasxVar = null;
                    break;
                }
                zzasv zzasvVar = (zzasv) it.next();
                if (zzasvVar instanceof zzasx) {
                    zzasxVar = (zzasx) zzasvVar;
                    break;
                }
            }
            for (zzasv zzasvVar2 : zzasxVar.zzc()) {
                if (zzasvVar2 instanceof zzasy) {
                    zzasyVar = (zzasy) zzasvVar2;
                    break;
                }
            }
            long jZzd = (zzasyVar.zzd() * 1000) / zzasyVar.zzc();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
