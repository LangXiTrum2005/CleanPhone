package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
final class zzcgf implements zziis {
    private final ByteBuffer zza;

    public zzcgf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zziis
    public final int zza(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zziis
    public final long zzb() throws IOException {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zziis
    public final long zzc() throws IOException {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zziis
    public final void zzd(long j) throws IOException {
        this.zza.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zziis
    public final ByteBuffer zze(long j, long j2) throws IOException {
        ByteBuffer byteBuffer = this.zza;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit((int) j2);
        byteBuffer.position(iPosition);
        return byteBufferSlice;
    }
}
