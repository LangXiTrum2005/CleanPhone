package com.google.common.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class FileBackedOutputStream extends OutputStream {
    public FileOutputStream X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MemoryOutput f20025Y;

    /* JADX INFO: renamed from: com.google.common.io.FileBackedOutputStream$1, reason: invalid class name */
    class AnonymousClass1 extends ByteSource {
        public final void finalize() {
            try {
                throw null;
            } catch (Throwable th) {
                th.printStackTrace(System.err);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.FileBackedOutputStream$2, reason: invalid class name */
    class AnonymousClass2 extends ByteSource {
    }

    public static class MemoryOutput extends ByteArrayOutputStream {
        public final byte[] d() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public final int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }
    }

    public final void a(int i2) throws IOException {
        MemoryOutput memoryOutput = this.f20025Y;
        if (memoryOutput == null || memoryOutput.getCount() + i2 <= 0) {
            return;
        }
        File fileA = TempFileCreator.f20027a.a();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            fileOutputStream.write(this.f20025Y.d(), 0, this.f20025Y.getCount());
            fileOutputStream.flush();
            this.X = fileOutputStream;
            this.f20025Y = null;
        } catch (IOException e2) {
            fileA.delete();
            throw e2;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.X.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final synchronized void flush() {
        this.X.flush();
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i2) {
        a(1);
        this.X.write(i2);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        a(i3);
        this.X.write(bArr, i2, i3);
    }
}
