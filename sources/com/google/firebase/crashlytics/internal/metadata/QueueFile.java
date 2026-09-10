package com.google.firebase.crashlytics.internal.metadata;

import android.support.v4.media.session.PlaybackStateCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
class QueueFile implements Closeable {
    public static final Logger h0 = Logger.getLogger(QueueFile.class.getName());
    public final RandomAccessFile X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f20397Y;
    public int Z;
    public Element e0;
    public Element f0;
    public final byte[] g0;

    public static class Element {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Element f20400c = new Element(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20402b;

        public Element(int i2, int i3) {
            this.f20401a = i2;
            this.f20402b = i3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.f20401a);
            sb.append(", length = ");
            return android.support.v4.media.a.i(this.f20402b, d9.i.f24752e, sb);
        }
    }

    public interface ElementReader {
        void a(InputStream inputStream, int i2);
    }

    public QueueFile(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.g0 = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    s(i2, iArr[i3], bArr2);
                    i2 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.X = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iJ = j(0, bArr);
        this.f20397Y = iJ;
        if (iJ > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f20397Y + ", Actual length: " + randomAccessFile2.length());
        }
        this.Z = j(4, bArr);
        int iJ2 = j(8, bArr);
        int iJ3 = j(12, bArr);
        this.e0 = i(iJ2);
        this.f0 = i(iJ3);
    }

    public static int j(int i2, byte[] bArr) {
        return ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) + ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) + ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static void s(int i2, int i3, byte[] bArr) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public final void a(byte[] bArr) {
        int iQ;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    b(length);
                    boolean zH = h();
                    if (zH) {
                        iQ = 16;
                    } else {
                        Element element = this.f0;
                        iQ = q(element.f20401a + 4 + element.f20402b);
                    }
                    Element element2 = new Element(iQ, length);
                    s(0, length, this.g0);
                    m(iQ, 4, this.g0);
                    m(iQ + 4, length, bArr);
                    r(this.f20397Y, this.Z + 1, zH ? iQ : this.e0.f20401a, iQ);
                    this.f0 = element2;
                    this.Z++;
                    if (zH) {
                        this.e0 = element2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void b(int i2) throws IOException {
        int i3 = i2 + 4;
        int iP = this.f20397Y - p();
        if (iP >= i3) {
            return;
        }
        int i4 = this.f20397Y;
        do {
            iP += i4;
            i4 <<= 1;
        } while (iP < i3);
        RandomAccessFile randomAccessFile = this.X;
        randomAccessFile.setLength(i4);
        randomAccessFile.getChannel().force(true);
        Element element = this.f0;
        int iQ = q(element.f20401a + 4 + element.f20402b);
        if (iQ < this.e0.f20401a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f20397Y);
            long j = iQ - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i5 = this.f0.f20401a;
        int i6 = this.e0.f20401a;
        if (i5 < i6) {
            int i7 = (this.f20397Y + i5) - 16;
            r(i4, this.Z, i6, i7);
            this.f0 = new Element(i7, this.f0.f20402b);
        } else {
            r(i4, this.Z, i6, i5);
        }
        this.f20397Y = i4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.X.close();
    }

    public final synchronized void d(ElementReader elementReader) {
        int iQ = this.e0.f20401a;
        for (int i2 = 0; i2 < this.Z; i2++) {
            Element elementI = i(iQ);
            elementReader.a(new ElementInputStream(elementI), elementI.f20402b);
            iQ = q(elementI.f20401a + 4 + elementI.f20402b);
        }
    }

    public final synchronized boolean h() {
        return this.Z == 0;
    }

    public final Element i(int i2) throws IOException {
        if (i2 == 0) {
            return Element.f20400c;
        }
        RandomAccessFile randomAccessFile = this.X;
        randomAccessFile.seek(i2);
        return new Element(i2, randomAccessFile.readInt());
    }

    public final synchronized void k() {
        if (h()) {
            throw new NoSuchElementException();
        }
        if (this.Z == 1) {
            synchronized (this) {
                r(4096, 0, 0, 0);
                this.Z = 0;
                Element element = Element.f20400c;
                this.e0 = element;
                this.f0 = element;
                if (this.f20397Y > 4096) {
                    RandomAccessFile randomAccessFile = this.X;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f20397Y = 4096;
            }
        } else {
            Element element2 = this.e0;
            int iQ = q(element2.f20401a + 4 + element2.f20402b);
            l(iQ, 0, 4, this.g0);
            int iJ = j(0, this.g0);
            r(this.f20397Y, this.Z - 1, iQ, this.f0.f20401a);
            this.Z--;
            this.e0 = new Element(iQ, iJ);
        }
    }

    public final void l(int i2, int i3, int i4, byte[] bArr) throws IOException {
        int iQ = q(i2);
        int i5 = iQ + i4;
        int i6 = this.f20397Y;
        RandomAccessFile randomAccessFile = this.X;
        if (i5 <= i6) {
            randomAccessFile.seek(iQ);
            randomAccessFile.readFully(bArr, i3, i4);
            return;
        }
        int i7 = i6 - iQ;
        randomAccessFile.seek(iQ);
        randomAccessFile.readFully(bArr, i3, i7);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i3 + i7, i4 - i7);
    }

    public final void m(int i2, int i3, byte[] bArr) throws IOException {
        int iQ = q(i2);
        int i4 = iQ + i3;
        int i5 = this.f20397Y;
        RandomAccessFile randomAccessFile = this.X;
        if (i4 <= i5) {
            randomAccessFile.seek(iQ);
            randomAccessFile.write(bArr, 0, i3);
            return;
        }
        int i6 = i5 - iQ;
        randomAccessFile.seek(iQ);
        randomAccessFile.write(bArr, 0, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i6, i3 - i6);
    }

    public final int p() {
        if (this.Z == 0) {
            return 16;
        }
        Element element = this.f0;
        int i2 = element.f20401a;
        int i3 = this.e0.f20401a;
        return i2 >= i3 ? (i2 - i3) + 4 + element.f20402b + 16 : (((i2 + 4) + element.f20402b) + this.f20397Y) - i3;
    }

    public final int q(int i2) {
        int i3 = this.f20397Y;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    public final void r(int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = {i2, i3, i4, i5};
        byte[] bArr = this.g0;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            s(i6, iArr[i7], bArr);
            i6 += 4;
        }
        RandomAccessFile randomAccessFile = this.X;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f20397Y);
        sb.append(", size=");
        sb.append(this.Z);
        sb.append(", first=");
        sb.append(this.e0);
        sb.append(", last=");
        sb.append(this.f0);
        sb.append(", element lengths=[");
        try {
            d(new ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFile.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public boolean f20398a = true;

                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public final void a(InputStream inputStream, int i2) {
                    boolean z2 = this.f20398a;
                    StringBuilder sb2 = sb;
                    if (z2) {
                        this.f20398a = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(i2);
                }
            });
        } catch (IOException e2) {
            h0.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final class ElementInputStream extends InputStream {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f20403Y;

        public ElementInputStream(Element element) {
            int i2 = element.f20401a + 4;
            Logger logger = QueueFile.h0;
            this.X = QueueFile.this.q(i2);
            this.f20403Y = element.f20402b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) throws IOException {
            Logger logger = QueueFile.h0;
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.f20403Y;
            if (i4 <= 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            int i5 = this.X;
            QueueFile queueFile = QueueFile.this;
            queueFile.l(i5, i2, i3, bArr);
            this.X = queueFile.q(this.X + i3);
            this.f20403Y -= i3;
            return i3;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.f20403Y == 0) {
                return -1;
            }
            QueueFile queueFile = QueueFile.this;
            queueFile.X.seek(this.X);
            int i2 = queueFile.X.read();
            this.X = queueFile.q(this.X + 1);
            this.f20403Y--;
            return i2;
        }
    }
}
