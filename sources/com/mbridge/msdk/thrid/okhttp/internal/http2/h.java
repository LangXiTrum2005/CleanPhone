package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class h implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Logger f36516e = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.e f36517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f36518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final d.a f36520d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a();

        void a(int i10, int i11, int i12, boolean z10);

        void a(int i10, int i11, List<c> list) throws IOException;

        void a(int i10, long j10);

        void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar);

        void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okio.f fVar);

        void a(boolean z10, int i10, int i11);

        void a(boolean z10, int i10, int i11, List<c> list);

        void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11) throws IOException;

        void a(boolean z10, m mVar);
    }

    public h(com.mbridge.msdk.thrid.okio.e eVar, boolean z10) {
        this.f36517a = eVar;
        this.f36519c = z10;
        a aVar = new a(eVar);
        this.f36518b = aVar;
        this.f36520d = new d.a(4096, aVar);
    }

    private void b(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 < 8) {
            throw e.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
        }
        if (i11 != 0) {
            throw e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int i12 = this.f36517a.readInt();
        int i13 = this.f36517a.readInt();
        int i14 = i10 - 8;
        com.mbridge.msdk.thrid.okhttp.internal.http2.b bVarA = com.mbridge.msdk.thrid.okhttp.internal.http2.b.a(i13);
        if (bVarA == null) {
            throw e.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i13));
        }
        com.mbridge.msdk.thrid.okio.f fVarB = com.mbridge.msdk.thrid.okio.f.f36782e;
        if (i14 > 0) {
            fVarB = this.f36517a.b(i14);
        }
        bVar.a(i12, bVarA, fVarB);
    }

    private void c(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 == 0) {
            throw e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z10 = (b10 & 1) != 0;
        short s10 = (b10 & 8) != 0 ? (short) (this.f36517a.readByte() & 255) : (short) 0;
        if ((b10 & 32) != 0) {
            a(bVar, i11);
            i10 -= 5;
        }
        bVar.a(z10, i11, -1, a(a(i10, b10, s10), s10, b10, i11));
    }

    private void d(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 8) {
            throw e.b("TYPE_PING length != 8: %s", Integer.valueOf(i10));
        }
        if (i11 != 0) {
            throw e.b("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.a((b10 & 1) != 0, this.f36517a.readInt(), this.f36517a.readInt());
    }

    private void e(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 5) {
            throw e.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
        }
        if (i11 == 0) {
            throw e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        a(bVar, i11);
    }

    private void f(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 == 0) {
            throw e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short s10 = (b10 & 8) != 0 ? (short) (this.f36517a.readByte() & 255) : (short) 0;
        bVar.a(i11, this.f36517a.readInt() & Integer.MAX_VALUE, a(a(i10 - 4, b10, s10), s10, b10, i11));
    }

    private void g(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 4) {
            throw e.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
        }
        if (i11 == 0) {
            throw e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int i12 = this.f36517a.readInt();
        com.mbridge.msdk.thrid.okhttp.internal.http2.b bVarA = com.mbridge.msdk.thrid.okhttp.internal.http2.b.a(i12);
        if (bVarA == null) {
            throw e.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i12));
        }
        bVar.a(i11, bVarA);
    }

    private void h(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 != 0) {
            throw e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b10 & 1) != 0) {
            if (i10 != 0) {
                throw e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            bVar.a();
            return;
        }
        if (i10 % 6 != 0) {
            throw e.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
        }
        m mVar = new m();
        for (int i12 = 0; i12 < i10; i12 += 6) {
            int i13 = this.f36517a.readShort() & 65535;
            int i14 = this.f36517a.readInt();
            if (i13 == 2) {
                if (i14 != 0 && i14 != 1) {
                    throw e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            } else if (i13 == 3) {
                i13 = 4;
            } else if (i13 != 4) {
                if (i13 == 5 && (i14 < 16384 || i14 > 16777215)) {
                    throw e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i14));
                }
            } else {
                if (i14 < 0) {
                    throw e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
                i13 = 7;
            }
            mVar.a(i13, i14);
        }
        bVar.a(false, mVar);
    }

    private void i(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 4) {
            throw e.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
        }
        long j10 = ((long) this.f36517a.readInt()) & 2147483647L;
        if (j10 == 0) {
            throw e.b("windowSizeIncrement was 0", Long.valueOf(j10));
        }
        bVar.a(i11, j10);
    }

    public void a(b bVar) throws IOException {
        if (this.f36519c) {
            if (!a(true, bVar)) {
                throw e.b("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        com.mbridge.msdk.thrid.okio.e eVar = this.f36517a;
        com.mbridge.msdk.thrid.okio.f fVar = e.f36433a;
        com.mbridge.msdk.thrid.okio.f fVarB = eVar.b(fVar.j());
        Logger logger = f36516e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(com.mbridge.msdk.thrid.okhttp.internal.c.a("<< CONNECTION %s", fVarB.g()));
        }
        if (!fVar.equals(fVarB)) {
            throw e.b("Expected a connection header but was %s", fVarB.m());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36517a.close();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.e f36521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte f36523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f36524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f36525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        short f36526f;

        public a(com.mbridge.msdk.thrid.okio.e eVar) {
            this.f36521a = eVar;
        }

        private void d() throws IOException {
            int i10 = this.f36524d;
            int iA = h.a(this.f36521a);
            this.f36525e = iA;
            this.f36522b = iA;
            byte b10 = (byte) (this.f36521a.readByte() & 255);
            this.f36523c = (byte) (this.f36521a.readByte() & 255);
            Logger logger = h.f36516e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.a(true, this.f36524d, this.f36522b, b10, this.f36523c));
            }
            int i11 = this.f36521a.readInt() & Integer.MAX_VALUE;
            this.f36524d = i11;
            if (b10 != 9) {
                throw e.b("%s != TYPE_CONTINUATION", Byte.valueOf(b10));
            }
            if (i11 != i10) {
                throw e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            while (true) {
                int i10 = this.f36525e;
                if (i10 != 0) {
                    long jB = this.f36521a.b(cVar, Math.min(j10, i10));
                    if (jB == -1) {
                        return -1L;
                    }
                    this.f36525e = (int) (((long) this.f36525e) - jB);
                    return jB;
                }
                this.f36521a.skip(this.f36526f);
                this.f36526f = (short) 0;
                if ((this.f36523c & 4) != 0) {
                    return -1L;
                }
                d();
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f36521a.b();
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public boolean a(boolean z10, b bVar) throws IOException {
        try {
            this.f36517a.e(9L);
            int iA = a(this.f36517a);
            if (iA >= 0 && iA <= 16384) {
                byte b10 = (byte) (this.f36517a.readByte() & 255);
                if (z10 && b10 != 4) {
                    throw e.b("Expected a SETTINGS frame but was %s", Byte.valueOf(b10));
                }
                byte b11 = (byte) (this.f36517a.readByte() & 255);
                int i10 = this.f36517a.readInt() & Integer.MAX_VALUE;
                Logger logger = f36516e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.a(true, i10, iA, b10, b11));
                }
                switch (b10) {
                    case 0:
                        a(bVar, iA, b11, i10);
                        return true;
                    case 1:
                        c(bVar, iA, b11, i10);
                        return true;
                    case 2:
                        e(bVar, iA, b11, i10);
                        return true;
                    case 3:
                        g(bVar, iA, b11, i10);
                        return true;
                    case 4:
                        h(bVar, iA, b11, i10);
                        return true;
                    case 5:
                        f(bVar, iA, b11, i10);
                        return true;
                    case 6:
                        d(bVar, iA, b11, i10);
                        return true;
                    case 7:
                        b(bVar, iA, b11, i10);
                        return true;
                    case 8:
                        i(bVar, iA, b11, i10);
                        return true;
                    default:
                        this.f36517a.skip(iA);
                        return true;
                }
            }
            throw e.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
        } catch (IOException unused) {
            return false;
        }
    }

    private List<c> a(int i10, short s10, byte b10, int i11) throws IOException {
        a aVar = this.f36518b;
        aVar.f36525e = i10;
        aVar.f36522b = i10;
        aVar.f36526f = s10;
        aVar.f36523c = b10;
        aVar.f36524d = i11;
        this.f36520d.f();
        return this.f36520d.c();
    }

    private void a(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 == 0) {
            throw e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z10 = (b10 & 1) != 0;
        if ((b10 & 32) == 0) {
            short s10 = (b10 & 8) != 0 ? (short) (this.f36517a.readByte() & 255) : (short) 0;
            bVar.a(z10, i11, this.f36517a, a(i10, b10, s10));
            this.f36517a.skip(s10);
            return;
        }
        throw e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
    }

    private void a(b bVar, int i10) throws IOException {
        int i11 = this.f36517a.readInt();
        bVar.a(i10, i11 & Integer.MAX_VALUE, (this.f36517a.readByte() & 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    public static int a(com.mbridge.msdk.thrid.okio.e eVar) throws IOException {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    public static int a(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw e.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }
}
