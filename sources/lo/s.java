package lo;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Socket f45671m;

    public s(Socket socket) {
        this.f45671m = socket;
    }

    @Override // lo.d
    public final void j() {
        Socket socket = this.f45671m;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (!q1.u(e10)) {
                throw e10;
            }
            l.f45652a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        } catch (Exception e11) {
            l.f45652a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
