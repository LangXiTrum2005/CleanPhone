package com.smartdigimkt.n4;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f36998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f36999b;
    private long f;
    private boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37001e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f37000c = new byte[1];

    public j(h hVar, k kVar) {
        this.f36998a = hVar;
        this.f36999b = kVar;
    }

    private void b() throws IOException {
        if (this.d) {
            return;
        }
        this.f36998a.a(this.f36999b);
        this.d = true;
    }

    public long a() {
        return this.f;
    }

    public void c() throws IOException {
        b();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f37001e) {
            return;
        }
        this.f36998a.close();
        this.f37001e = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f37000c) == -1) {
            return -1;
        }
        return this.f37000c[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        com.smartdigimkt.p4.a.b(!this.f37001e);
        b();
        int iA = this.f36998a.a(bArr, i2, i3);
        if (iA == -1) {
            return -1;
        }
        this.f += (long) iA;
        return iA;
    }
}
