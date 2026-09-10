package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class c implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f12939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f12940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RandomAccessFile f12941c;
    private AtomicBoolean d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f12942e;

    public c(long j, File file) throws IOException {
        this.f12939a = j;
        this.f12942e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f12941c = randomAccessFile;
            randomAccessFile.setLength(j);
        } catch (Exception e2) {
            CloseableUtils.close(this.f12941c);
            throw new IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e2.getMessage(), e2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f12939a;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (this.d.get()) {
            throw new IOException("released!");
        }
        return this.f12940b;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f12941c);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f12942e;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e A[PHI: r0
  0x000e: PHI (r0v5 long) = (r0v2 long), (r0v3 long) binds: [B:5:0x000c, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j) throws IOException {
        if (this.d.get()) {
            throw new IOException("released!");
        }
        long j2 = 0;
        if (j < 0) {
            j = j2;
        } else {
            j2 = this.f12939a;
            if (j > j2) {
                j = j2;
            }
        }
        this.f12940b = j;
        this.f12941c.seek(j);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int i2) throws IOException {
        a(new byte[]{(byte) i2});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j) throws IOException {
        int iSkipBytes;
        if (this.d.get()) {
            throw new IOException("released!");
        }
        int i2 = (int) j;
        if (i2 == j) {
            iSkipBytes = this.f12941c.skipBytes(i2);
            this.f12940b = this.f12941c.getFilePointer();
        } else {
            throw new IOException("too large:".concat(String.valueOf(j)));
        }
        return iSkipBytes;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.d.get()) {
            if (bArr == null || i3 <= 0 || i2 < 0 || i2 >= bArr.length) {
                return 0;
            }
            if (i2 + i3 > bArr.length) {
                i3 = bArr.length - i2;
            }
            synchronized (this) {
                try {
                    long j = this.f12940b;
                    long j2 = this.f12939a;
                    if (j == j2) {
                        return -1;
                    }
                    if (((long) i3) + j > j2) {
                        i3 = (int) (j2 - j);
                    }
                    int i4 = this.f12941c.read(bArr, i2, i3);
                    if (i4 == -1) {
                        return -1;
                    }
                    this.f12940b += (long) i4;
                    return i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.d.get()) {
            if (bArr == null || bArr.length == 0 || i3 <= 0 || i2 < 0 || i2 >= bArr.length) {
                return 0;
            }
            if (i2 + i3 > bArr.length) {
                i3 = bArr.length - i2;
            }
            synchronized (this) {
                try {
                    long j = this.f12940b;
                    long j2 = this.f12939a;
                    if (j == j2) {
                        return 0;
                    }
                    if (((long) i3) + j > j2) {
                        i3 = (int) (j2 - j);
                    }
                    this.f12941c.write(bArr, i2, i3);
                    this.f12940b += (long) i3;
                    return i3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IOException("released!");
    }
}
