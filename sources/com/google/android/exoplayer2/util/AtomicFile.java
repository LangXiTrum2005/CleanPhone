package com.google.android.exoplayer2.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class AtomicFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f18889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f18890b;

    public static final class AtomicFileOutputStream extends OutputStream {
        public final FileOutputStream X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f18891Y = false;

        public AtomicFileOutputStream(File file) {
            this.X = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            FileOutputStream fileOutputStream = this.X;
            if (this.f18891Y) {
                return;
            }
            this.f18891Y = true;
            flush();
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException e2) {
                Log.h("AtomicFile", "Failed to sync file descriptor:", e2);
            }
            fileOutputStream.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.X.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i2) throws IOException {
            this.X.write(i2);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.X.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) throws IOException {
            this.X.write(bArr, i2, i3);
        }
    }

    public AtomicFile(File file) {
        this.f18889a = file;
        this.f18890b = new File(file.getPath() + ".bak");
    }

    public final OutputStream a() throws IOException {
        File file = this.f18889a;
        if (file.exists()) {
            File file2 = this.f18890b;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                Log.g("AtomicFile", "Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new AtomicFileOutputStream(file);
        } catch (FileNotFoundException e2) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e2);
            }
            try {
                return new AtomicFileOutputStream(file);
            } catch (FileNotFoundException e3) {
                throw new IOException("Couldn't create " + file, e3);
            }
        }
    }
}
