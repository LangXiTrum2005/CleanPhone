package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbfa extends PushbackInputStream {
    final /* synthetic */ zzbfd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbfa(zzbfd zzbfdVar, InputStream inputStream, int i2) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbfdVar);
        this.zza = zzbfdVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zza.zzc.zzb();
        super.close();
    }
}
