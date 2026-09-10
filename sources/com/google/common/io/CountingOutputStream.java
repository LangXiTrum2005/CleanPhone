package com.google.common.io;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class CountingOutputStream extends FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i2, i3);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2);
    }
}
