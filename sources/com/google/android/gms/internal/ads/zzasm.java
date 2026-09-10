package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzasm extends ByteArrayOutputStream {
    private final zzasb zza;

    public zzasm(zzasb zzasbVar, int i2) {
        this.zza = zzasbVar;
        ((ByteArrayOutputStream) this).buf = zzasbVar.zza(Math.max(i2, 256));
    }

    private final void zza(int i2) {
        int i3 = ((ByteArrayOutputStream) this).count;
        if (i3 + i2 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        zzasb zzasbVar = this.zza;
        int i4 = i3 + i2;
        byte[] bArrZza = zzasbVar.zza(i4 + i4);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrZza, 0, ((ByteArrayOutputStream) this).count);
        zzasbVar.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrZza;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i2) {
        zza(1);
        super.write(i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        zza(i3);
        super.write(bArr, i2, i3);
    }
}
