package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f36798a = Logger.getLogger(l.class.getName());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f36799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OutputStream f36800b;

        public a(t tVar, OutputStream outputStream) {
            this.f36799a = tVar;
            this.f36800b = outputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f36779b, 0L, j10);
            while (j10 > 0) {
                this.f36799a.e();
                o oVar = cVar.f36778a;
                int iMin = (int) Math.min(j10, oVar.f36813c - oVar.f36812b);
                this.f36800b.write(oVar.f36811a, oVar.f36812b, iMin);
                int i10 = oVar.f36812b + iMin;
                oVar.f36812b = i10;
                long j11 = iMin;
                j10 -= j11;
                cVar.f36779b -= j11;
                if (i10 == oVar.f36813c) {
                    cVar.f36778a = oVar.b();
                    p.a(oVar);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f36799a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f36800b.close();
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            this.f36800b.flush();
        }

        public String toString() {
            return "sink(" + this.f36800b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c extends com.mbridge.msdk.thrid.okio.a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Socket f36803k;

        public c(Socket socket) {
            this.f36803k = socket;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            try {
                this.f36803k.close();
            } catch (AssertionError e10) {
                if (!l.a(e10)) {
                    throw e10;
                }
                l.f36798a.log(Level.WARNING, "Failed to close timed out socket " + this.f36803k, (Throwable) e10);
            } catch (Exception e11) {
                l.f36798a.log(Level.WARNING, "Failed to close timed out socket " + this.f36803k, (Throwable) e11);
            }
        }
    }

    private l() {
    }

    public static e a(s sVar) {
        return new n(sVar);
    }

    public static s b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
        return aVarC.a(a(socket.getInputStream(), aVarC));
    }

    private static com.mbridge.msdk.thrid.okio.a c(Socket socket) {
        return new c(socket);
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    private static r a(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (tVar != null) {
            return new a(tVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static r a(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
                return aVarC.a(a(socket.getOutputStream(), aVarC));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static s a(InputStream inputStream) {
        return a(inputStream, new t());
    }

    private static s a(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (tVar != null) {
            return new b(tVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f36801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f36802b;

        public b(t tVar, InputStream inputStream) {
            this.f36801a = tVar;
            this.f36802b = inputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount < 0: "));
            }
            if (j10 == 0) {
                return 0L;
            }
            try {
                this.f36801a.e();
                o oVarB = cVar.b(1);
                int i10 = this.f36802b.read(oVarB.f36811a, oVarB.f36813c, (int) Math.min(j10, 8192 - oVarB.f36813c));
                if (i10 == -1) {
                    return -1L;
                }
                oVarB.f36813c += i10;
                long j11 = i10;
                cVar.f36779b += j11;
                return j11;
            } catch (AssertionError e10) {
                if (l.a(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f36802b.close();
        }

        public String toString() {
            return "source(" + this.f36802b + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f36801a;
        }
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
