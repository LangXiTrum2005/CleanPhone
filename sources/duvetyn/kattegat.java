package duvetyn;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lduvetyn/kattegat;", "Lduvetyn/saneness;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "Ljava/io/IOException;", "cause", "rotuma", "(Ljava/io/IOException;)Ljava/io/IOException;", "", "stratoscope", "()V", "kowloon", "Ljava/net/Socket;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class kattegat extends saneness {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Socket socket;

    public kattegat(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.socket = socket;
    }

    @Override // duvetyn.saneness
    public IOException rotuma(IOException cause) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (cause != null) {
            socketTimeoutException.initCause(cause);
        }
        return socketTimeoutException;
    }

    @Override // duvetyn.saneness
    public void stratoscope() {
        try {
            this.socket.close();
        } catch (AssertionError e) {
            if (!adultoid.marial(e)) {
                throw e;
            }
            dovishness.f25409attabal.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e);
        } catch (Exception e2) {
            dovishness.f25409attabal.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e2);
        }
    }
}
