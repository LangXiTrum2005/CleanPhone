package com.thinkup.core.common.no.n;

import android.os.Build;
import com.thinkup.core.common.no.n.o.AnonymousClass1;
import com.thinkup.core.common.no.n.o.AnonymousClass2;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class nm {
    static final Logger o = Logger.getLogger(nm.class.getName());

    private nm() {
    }

    public static oom m(File file) {
        if (file != null) {
            return o(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static oom n(File file) {
        if (file != null) {
            return o(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static oo o(oon oonVar) {
        return new o0m(oonVar);
    }

    public static o0 o(oom oomVar) {
        return new o0o(oomVar);
    }

    private static oom m(Path path, OpenOption... openOptionArr) {
        if (path != null) {
            return o(Files.newOutputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    private static o n(final Socket socket) {
        return new o() { // from class: com.thinkup.core.common.no.n.nm.4
            @Override // com.thinkup.core.common.no.n.o
            public final IOException o(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // com.thinkup.core.common.no.n.o
            public final void o() {
                try {
                    socket.close();
                } catch (AssertionError e2) {
                    if (nm.o(e2)) {
                        nm.o.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                        return;
                    }
                    throw e2;
                } catch (Exception e3) {
                    nm.o.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
                }
            }
        };
    }

    private static oom o(OutputStream outputStream) {
        return o(outputStream, new om0());
    }

    private static oom o(final OutputStream outputStream, final om0 om0Var) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (om0Var != null) {
            return new oom() { // from class: com.thinkup.core.common.no.n.nm.1
                @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    outputStream.close();
                }

                @Override // com.thinkup.core.common.no.n.oom, java.io.Flushable
                public final void flush() throws IOException {
                    outputStream.flush();
                }

                @Override // com.thinkup.core.common.no.n.oom
                public final void o(n nVar, long j) throws IOException {
                    omo.o(nVar.f42084n, 0L, j);
                    while (j > 0) {
                        om0Var.on();
                        o0n o0nVar = nVar.m;
                        int iMin = (int) Math.min(j, o0nVar.oo - o0nVar.o0);
                        outputStream.write(o0nVar.f42090n, o0nVar.o0, iMin);
                        int i2 = o0nVar.o0 + iMin;
                        o0nVar.o0 = i2;
                        long j2 = iMin;
                        j -= j2;
                        nVar.f42084n -= j2;
                        if (i2 == o0nVar.oo) {
                            nVar.m = o0nVar.n();
                            oo0.o(o0nVar);
                        }
                    }
                }

                public final String toString() {
                    return "sink(" + outputStream + ")";
                }

                @Override // com.thinkup.core.common.no.n.oom
                public final om0 o() {
                    return om0Var;
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static oon m(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                o oVarN = n(socket);
                return oVarN.new AnonymousClass2(o(socket.getInputStream(), oVarN));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static oom o(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                o oVarN = n(socket);
                return oVarN.new AnonymousClass1(o(socket.getOutputStream(), oVarN));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static oon o(InputStream inputStream) {
        return o(inputStream, new om0());
    }

    private static oon o(final InputStream inputStream, final om0 om0Var) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (om0Var != null) {
            return new oon() { // from class: com.thinkup.core.common.no.n.nm.2
                @Override // com.thinkup.core.common.no.n.oon
                public final long a_(n nVar, long j) throws IOException {
                    if (j < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                    }
                    if (j == 0) {
                        return 0L;
                    }
                    try {
                        om0Var.on();
                        o0n o0nVarOn = nVar.on(1);
                        int i2 = inputStream.read(o0nVarOn.f42090n, o0nVarOn.oo, (int) Math.min(j, 8192 - o0nVarOn.oo));
                        if (i2 == -1) {
                            return -1L;
                        }
                        o0nVarOn.oo += i2;
                        long j2 = i2;
                        nVar.f42084n += j2;
                        return j2;
                    } catch (AssertionError e2) {
                        if (nm.o(e2)) {
                            throw new IOException(e2);
                        }
                        throw e2;
                    }
                }

                @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    inputStream.close();
                }

                @Override // com.thinkup.core.common.no.n.oon
                public final om0 o() {
                    return om0Var;
                }

                public final String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static oon o(File file) {
        if (file != null) {
            return o(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    private static oon o(Path path, OpenOption... openOptionArr) {
        if (path != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                return o(Files.newInputStream(path, openOptionArr));
            }
            return o(new FileInputStream(path.toFile()));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static oom o() {
        return new oom() { // from class: com.thinkup.core.common.no.n.nm.3
            @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // com.thinkup.core.common.no.n.oom, java.io.Flushable
            public final void flush() {
            }

            @Override // com.thinkup.core.common.no.n.oom
            public final void o(n nVar, long j) throws EOFException {
                nVar.mo(j);
            }

            @Override // com.thinkup.core.common.no.n.oom
            public final om0 o() {
                return om0.f42093n;
            }
        };
    }

    public static boolean o(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
