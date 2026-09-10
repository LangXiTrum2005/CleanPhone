package com.smartdigimkt.p4;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f37514c = "AtomicFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f37515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f37516b;

    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileOutputStream f37517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f37518b = false;

        public a(File file) throws FileNotFoundException {
            this.f37517a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f37518b) {
                return;
            }
            this.f37518b = true;
            flush();
            try {
                this.f37517a.getFD().sync();
            } catch (IOException e2) {
                Log.w(b.f37514c, "Failed to sync file descriptor:", e2);
            }
            this.f37517a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f37517a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.f37517a.write(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f37517a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.f37517a.write(bArr, i2, i3);
        }
    }

    public b(File file) {
        this.f37515a = file;
        this.f37516b = new File(file.getPath() + ".bak");
    }

    private void c() {
        if (this.f37516b.exists()) {
            this.f37515a.delete();
            this.f37516b.renameTo(this.f37515a);
        }
    }

    public void a() {
        this.f37515a.delete();
        this.f37516b.delete();
    }

    public InputStream b() throws FileNotFoundException {
        c();
        return new FileInputStream(this.f37515a);
    }

    public OutputStream d() throws IOException {
        if (this.f37515a.exists()) {
            if (this.f37516b.exists()) {
                this.f37515a.delete();
            } else if (!this.f37515a.renameTo(this.f37516b)) {
                Log.w(f37514c, "Couldn't rename file " + this.f37515a + " to backup file " + this.f37516b);
            }
        }
        try {
            return new a(this.f37515a);
        } catch (FileNotFoundException e2) {
            if (!this.f37515a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f37515a, e2);
            }
            try {
                return new a(this.f37515a);
            } catch (FileNotFoundException e3) {
                throw new IOException("Couldn't create " + this.f37515a, e3);
            }
        }
    }

    public void a(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f37516b.delete();
    }
}
