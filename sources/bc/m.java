package bc;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f5560g = Logger.getLogger(m.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f5561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f5564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f5565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f5566f;

    public m(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f5566f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    s(bArr2, i10, iArr[i11]);
                    i10 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f5561a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iJ = j(0, bArr);
        this.f5562b = iJ;
        if (iJ > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f5562b + ", Actual length: " + randomAccessFile2.length());
        }
        this.f5563c = j(4, bArr);
        int iJ2 = j(8, bArr);
        int iJ3 = j(12, bArr);
        this.f5564d = h(iJ2);
        this.f5565e = h(iJ3);
    }

    public static int j(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public static void s(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public final void a(byte[] bArr) {
        int iQ;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    b(length);
                    boolean zD = d();
                    if (zD) {
                        iQ = 16;
                    } else {
                        j jVar = this.f5565e;
                        iQ = q(jVar.f5555a + 4 + jVar.f5556b);
                    }
                    j jVar2 = new j(iQ, length);
                    s(this.f5566f, 0, length);
                    o(this.f5566f, iQ, 4);
                    o(bArr, iQ + 4, length);
                    r(this.f5562b, this.f5563c + 1, zD ? iQ : this.f5564d.f5555a, iQ);
                    this.f5565e = jVar2;
                    this.f5563c++;
                    if (zD) {
                        this.f5564d = jVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void b(int i10) throws IOException {
        int i11 = i10 + 4;
        int iP = this.f5562b - p();
        if (iP >= i11) {
            return;
        }
        int i12 = this.f5562b;
        do {
            iP += i12;
            i12 <<= 1;
        } while (iP < i11);
        RandomAccessFile randomAccessFile = this.f5561a;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        j jVar = this.f5565e;
        int iQ = q(jVar.f5555a + 4 + jVar.f5556b);
        if (iQ < this.f5564d.f5555a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f5562b);
            long j10 = iQ - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f5565e.f5555a;
        int i14 = this.f5564d.f5555a;
        if (i13 < i14) {
            int i15 = (this.f5562b + i13) - 16;
            r(i12, this.f5563c, i14, i15);
            this.f5565e = new j(i15, this.f5565e.f5556b);
        } else {
            r(i12, this.f5563c, i14, i13);
        }
        this.f5562b = i12;
    }

    public final synchronized void c(l lVar) {
        int iQ = this.f5564d.f5555a;
        for (int i10 = 0; i10 < this.f5563c; i10++) {
            j jVarH = h(iQ);
            lVar.a(new k(this, jVarH), jVarH.f5556b);
            iQ = q(jVarH.f5555a + 4 + jVarH.f5556b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5561a.close();
    }

    public final synchronized boolean d() {
        return this.f5563c == 0;
    }

    public final j h(int i10) throws IOException {
        if (i10 == 0) {
            return j.f5554c;
        }
        RandomAccessFile randomAccessFile = this.f5561a;
        randomAccessFile.seek(i10);
        return new j(i10, randomAccessFile.readInt());
    }

    public final synchronized void k() {
        if (d()) {
            throw new NoSuchElementException();
        }
        if (this.f5563c == 1) {
            synchronized (this) {
                r(4096, 0, 0, 0);
                this.f5563c = 0;
                j jVar = j.f5554c;
                this.f5564d = jVar;
                this.f5565e = jVar;
                if (this.f5562b > 4096) {
                    RandomAccessFile randomAccessFile = this.f5561a;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f5562b = 4096;
            }
        } else {
            j jVar2 = this.f5564d;
            int iQ = q(jVar2.f5555a + 4 + jVar2.f5556b);
            n(iQ, 0, 4, this.f5566f);
            int iJ = j(0, this.f5566f);
            r(this.f5562b, this.f5563c - 1, iQ, this.f5565e.f5555a);
            this.f5563c--;
            this.f5564d = new j(iQ, iJ);
        }
    }

    public final void n(int i10, int i11, int i12, byte[] bArr) throws IOException {
        int iQ = q(i10);
        int i13 = iQ + i12;
        int i14 = this.f5562b;
        RandomAccessFile randomAccessFile = this.f5561a;
        if (i13 <= i14) {
            randomAccessFile.seek(iQ);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iQ;
        randomAccessFile.seek(iQ);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void o(byte[] bArr, int i10, int i11) throws IOException {
        int iQ = q(i10);
        int i12 = iQ + i11;
        int i13 = this.f5562b;
        RandomAccessFile randomAccessFile = this.f5561a;
        if (i12 <= i13) {
            randomAccessFile.seek(iQ);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - iQ;
        randomAccessFile.seek(iQ);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i14, i11 - i14);
    }

    public final int p() {
        if (this.f5563c == 0) {
            return 16;
        }
        j jVar = this.f5565e;
        int i10 = jVar.f5555a;
        int i11 = this.f5564d.f5555a;
        return i10 >= i11 ? (i10 - i11) + 4 + jVar.f5556b + 16 : (((i10 + 4) + jVar.f5556b) + this.f5562b) - i11;
    }

    public final int q(int i10) {
        int i11 = this.f5562b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void r(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f5566f;
            if (i14 >= 4) {
                RandomAccessFile randomAccessFile = this.f5561a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                s(bArr, i15, iArr[i14]);
                i15 += 4;
                i14++;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f5562b);
        sb2.append(", size=");
        sb2.append(this.f5563c);
        sb2.append(", first=");
        sb2.append(this.f5564d);
        sb2.append(", last=");
        sb2.append(this.f5565e);
        sb2.append(", element lengths=[");
        try {
            c(new i(sb2, 0));
        } catch (IOException e10) {
            f5560g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
