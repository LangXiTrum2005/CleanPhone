package com.inmobi.media;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class O3 extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P3 f23031a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(P3 p3, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f23031a = p3;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.f23031a.f23064c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.f23031a.f23064c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i2) {
        try {
            ((FilterOutputStream) this).out.write(i2);
        } catch (IOException unused) {
            this.f23031a.f23064c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i2, i3);
        } catch (IOException unused) {
            this.f23031a.f23064c = true;
        }
    }
}
