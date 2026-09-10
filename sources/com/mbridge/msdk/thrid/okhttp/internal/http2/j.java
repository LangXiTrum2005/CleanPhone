package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class j implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f36551g = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.d f36552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.c f36554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final d.b f36557f;

    public j(com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        this.f36552a = dVar;
        this.f36553b = z10;
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        this.f36554c = cVar;
        this.f36557f = new d.b(cVar);
        this.f36555d = Http2.INITIAL_MAX_FRAME_SIZE;
    }

    public synchronized void a(m mVar) throws IOException {
        try {
            if (this.f36556e) {
                throw new IOException("closed");
            }
            this.f36555d = mVar.c(this.f36555d);
            if (mVar.b() != -1) {
                this.f36557f.b(mVar.b());
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.f36552a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(m mVar) throws IOException {
        int i10;
        try {
            if (this.f36556e) {
                throw new IOException("closed");
            }
            int i11 = 0;
            a(0, mVar.d() * 6, (byte) 4, (byte) 0);
            while (i11 < 10) {
                if (mVar.d(i11)) {
                    if (i11 == 4) {
                        i10 = 3;
                    } else {
                        i10 = i11 == 7 ? 4 : i11;
                    }
                    this.f36552a.writeShort(i10);
                    this.f36552a.writeInt(mVar.a(i11));
                }
                i11++;
            }
            this.f36552a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f36556e = true;
        this.f36552a.close();
    }

    public synchronized void d() throws IOException {
        try {
            if (this.f36556e) {
                throw new IOException("closed");
            }
            if (this.f36553b) {
                Logger logger = f36551g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(com.mbridge.msdk.thrid.okhttp.internal.c.a(">> CONNECTION %s", e.f36433a.g()));
                }
                this.f36552a.write(e.f36433a.l());
                this.f36552a.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void flush() throws IOException {
        if (this.f36556e) {
            throw new IOException("closed");
        }
        this.f36552a.flush();
    }

    public int h() {
        return this.f36555d;
    }

    public synchronized void a(int i10, int i11, List<c> list) throws IOException {
        if (!this.f36556e) {
            this.f36557f.a(list);
            long size = this.f36554c.size();
            int iMin = (int) Math.min(this.f36555d - 4, size);
            long j10 = iMin;
            a(i10, iMin + 4, (byte) 5, size == j10 ? (byte) 4 : (byte) 0);
            this.f36552a.writeInt(i11 & Integer.MAX_VALUE);
            this.f36552a.a(this.f36554c, j10);
            if (size > j10) {
                b(i10, size - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void b(int i10, long j10) throws IOException {
        while (j10 > 0) {
            int iMin = (int) Math.min(this.f36555d, j10);
            long j11 = iMin;
            j10 -= j11;
            a(i10, iMin, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
            this.f36552a.a(this.f36554c, j11);
        }
    }

    public synchronized void a(boolean z10, int i10, int i11, List<c> list) throws IOException {
        if (!this.f36556e) {
            a(z10, i10, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i10, b bVar) throws IOException {
        if (!this.f36556e) {
            if (bVar.f36403a != -1) {
                a(i10, 4, (byte) 3, (byte) 0);
                this.f36552a.writeInt(bVar.f36403a);
                this.f36552a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.c cVar, int i11) throws IOException {
        if (!this.f36556e) {
            a(i10, z10 ? (byte) 1 : (byte) 0, cVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public void a(int i10, byte b10, com.mbridge.msdk.thrid.okio.c cVar, int i11) throws IOException {
        a(i10, i11, (byte) 0, b10);
        if (i11 > 0) {
            this.f36552a.a(cVar, i11);
        }
    }

    public synchronized void a(boolean z10, int i10, int i11) throws IOException {
        if (!this.f36556e) {
            a(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f36552a.writeInt(i10);
            this.f36552a.writeInt(i11);
            this.f36552a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i10, b bVar, byte[] bArr) throws IOException {
        try {
            if (!this.f36556e) {
                if (bVar.f36403a != -1) {
                    a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f36552a.writeInt(i10);
                    this.f36552a.writeInt(bVar.f36403a);
                    if (bArr.length > 0) {
                        this.f36552a.write(bArr);
                    }
                    this.f36552a.flush();
                } else {
                    throw e.a("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(int i10, long j10) throws IOException {
        if (this.f36556e) {
            throw new IOException("closed");
        }
        if (j10 != 0 && j10 <= 2147483647L) {
            a(i10, 4, (byte) 8, (byte) 0);
            this.f36552a.writeInt((int) j10);
            this.f36552a.flush();
        } else {
            throw e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
        }
    }

    public void a(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = f36551g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f36555d;
        if (i11 > i12) {
            throw e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        }
        if ((Integer.MIN_VALUE & i10) == 0) {
            a(this.f36552a, i11);
            this.f36552a.writeByte(b10 & 255);
            this.f36552a.writeByte(b11 & 255);
            this.f36552a.writeInt(i10 & Integer.MAX_VALUE);
            return;
        }
        throw e.a("reserved bit set: %s", Integer.valueOf(i10));
    }

    private static void a(com.mbridge.msdk.thrid.okio.d dVar, int i10) throws IOException {
        dVar.writeByte((i10 >>> 16) & 255);
        dVar.writeByte((i10 >>> 8) & 255);
        dVar.writeByte(i10 & 255);
    }

    public void a(boolean z10, int i10, List<c> list) throws IOException {
        if (!this.f36556e) {
            this.f36557f.a(list);
            long size = this.f36554c.size();
            int iMin = (int) Math.min(this.f36555d, size);
            long j10 = iMin;
            byte b10 = size == j10 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            a(i10, iMin, (byte) 1, b10);
            this.f36552a.a(this.f36554c, j10);
            if (size > j10) {
                b(i10, size - j10);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
