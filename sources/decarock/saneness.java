package decarock;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: AtomicFile.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final File f25125attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final File f25126saneness;

    /* JADX INFO: compiled from: AtomicFile.java */
    public static final class attabal extends OutputStream {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public boolean f25127arytenoidectomy = false;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final FileOutputStream f25128kowloon;

        public attabal(File file) throws FileNotFoundException {
            this.f25128kowloon = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f25127arytenoidectomy) {
                return;
            }
            this.f25127arytenoidectomy = true;
            flush();
            try {
                this.f25128kowloon.getFD().sync();
            } catch (IOException e) {
                triweekly.taiyuan("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.f25128kowloon.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f25128kowloon.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f25128kowloon.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f25128kowloon.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f25128kowloon.write(bArr, i, i2);
        }
    }

    public saneness(File file) {
        this.f25125attabal = file;
        this.f25126saneness = new File(file.getPath() + ".bak");
    }

    public void attabal() {
        this.f25125attabal.delete();
        this.f25126saneness.delete();
    }

    public OutputStream beachfront() throws IOException {
        if (this.f25125attabal.exists()) {
            if (this.f25126saneness.exists()) {
                this.f25125attabal.delete();
            } else if (!this.f25125attabal.renameTo(this.f25126saneness)) {
                triweekly.impromptu("AtomicFile", "Couldn't rename file " + this.f25125attabal + " to backup file " + this.f25126saneness);
            }
        }
        try {
            return new attabal(this.f25125attabal);
        } catch (FileNotFoundException e) {
            File parentFile = this.f25125attabal.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f25125attabal, e);
            }
            try {
                return new attabal(this.f25125attabal);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.f25125attabal, e2);
            }
        }
    }

    public boolean dern() {
        return this.f25125attabal.exists() || this.f25126saneness.exists();
    }

    public final void marial() {
        if (this.f25126saneness.exists()) {
            this.f25125attabal.delete();
            this.f25126saneness.renameTo(this.f25125attabal);
        }
    }

    public void saneness(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f25126saneness.delete();
    }

    public InputStream wireman() throws FileNotFoundException {
        marial();
        return new FileInputStream(this.f25125attabal);
    }
}
