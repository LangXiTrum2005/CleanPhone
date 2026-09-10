package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/SocketAsyncTimeout;", "Lokio/AsyncTimeout;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SocketAsyncTimeout extends AsyncTimeout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Socket f45164a;

    public SocketAsyncTimeout(Socket socket) {
        Intrinsics.f(socket, "socket");
        this.f45164a = socket;
    }

    @Override // okio.AsyncTimeout
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public final void timedOut() {
        Socket socket = this.f45164a;
        try {
            socket.close();
        } catch (AssertionError e2) {
            if (!Okio.e(e2)) {
                throw e2;
            }
            Okio__JvmOkioKt.f45150a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        } catch (Exception e3) {
            Okio__JvmOkioKt.f45150a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
        }
    }
}
