package gondola;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: StrictLineReader.java */
/* JADX INFO: loaded from: classes2.dex */
public class dern implements Closeable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Charset f27352arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final InputStream f27353kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f27354molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public byte[] f27355monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f27356polloi;

    /* JADX INFO: compiled from: StrictLineReader.java */
    public class attabal extends ByteArrayOutputStream {
        public attabal(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, dern.this.f27352arytenoidectomy.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public dern(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f27353kowloon) {
            try {
                if (this.f27355monoploid != null) {
                    this.f27355monoploid = null;
                    this.f27353kowloon.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean dern() {
        return this.f27354molybdenite == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String marial() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f27353kowloon) {
            try {
                if (this.f27355monoploid == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f27356polloi >= this.f27354molybdenite) {
                    saneness();
                }
                for (int i3 = this.f27356polloi; i3 != this.f27354molybdenite; i3++) {
                    byte[] bArr2 = this.f27355monoploid;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f27356polloi;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] != 13) {
                                i2 = i3;
                            }
                        } else {
                            i2 = i3;
                        }
                        String str = new String(bArr2, i4, i2 - i4, this.f27352arytenoidectomy.name());
                        this.f27356polloi = i3 + 1;
                        return str;
                    }
                }
                attabal attabalVar = new attabal((this.f27354molybdenite - this.f27356polloi) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f27355monoploid;
                    int i5 = this.f27356polloi;
                    attabalVar.write(bArr3, i5, this.f27354molybdenite - i5);
                    this.f27354molybdenite = -1;
                    saneness();
                    i = this.f27356polloi;
                    while (i != this.f27354molybdenite) {
                        bArr = this.f27355monoploid;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.f27356polloi;
                if (i != i6) {
                    attabalVar.write(bArr, i6, i - i6);
                }
                this.f27356polloi = i + 1;
                return attabalVar.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void saneness() throws IOException {
        InputStream inputStream = this.f27353kowloon;
        byte[] bArr = this.f27355monoploid;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.f27356polloi = 0;
        this.f27354molybdenite = i;
    }

    public dern(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(wireman.f27390attabal)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f27353kowloon = inputStream;
        this.f27352arytenoidectomy = charset;
        this.f27355monoploid = new byte[i];
    }
}
