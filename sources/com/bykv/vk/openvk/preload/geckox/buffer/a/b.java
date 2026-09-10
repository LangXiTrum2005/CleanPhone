package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class b implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RandomAccessFile f12936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f12937b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f12938c;

    public b(File file) throws IOException {
        this.f12938c = file;
        file.getParentFile().mkdirs();
        try {
            this.f12936a = new RandomAccessFile(file, "rw");
        } catch (Exception e2) {
            CloseableUtils.close(this.f12936a);
            throw new IOException("create raf mSwap failed! path: " + file.getAbsolutePath() + " caused by: " + e2.getMessage(), e2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f12937b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() throws IOException {
        return this.f12936a.length();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (this.f12937b.get()) {
            throw new IOException("released!");
        }
        return this.f12936a.getFilePointer();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.f12937b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f12936a);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f12938c;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j) throws IOException {
        if (this.f12937b.get()) {
            throw new IOException("released!");
        }
        if (j < 0) {
            j = 0;
        }
        this.f12936a.seek(j);
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
        int i2;
        if (this.f12937b.get()) {
            throw new IOException("released!");
        }
        i2 = (int) j;
        if (i2 == j) {
        } else {
            throw new IOException("too large:".concat(String.valueOf(j)));
        }
        return this.f12936a.skipBytes(i2);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        if (!this.f12937b.get()) {
            if (bArr == null || i3 <= 0 || i2 < 0 || i2 >= bArr.length) {
                return 0;
            }
            if (i2 + i3 > bArr.length) {
                i3 = bArr.length - i2;
            }
            synchronized (this) {
                i4 = this.f12936a.read(bArr, i2, i3);
            }
            return i4;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f12937b.get()) {
            if (bArr == null || bArr.length == 0 || i3 <= 0 || i2 < 0 || i2 >= bArr.length) {
                return 0;
            }
            if (i2 + i3 > bArr.length) {
                i3 = bArr.length - i2;
            }
            synchronized (this) {
                this.f12936a.write(bArr, i2, i3);
            }
            return i3;
        }
        throw new IOException("released!");
    }
}
