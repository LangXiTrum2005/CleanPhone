package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okhttp3.apical;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConnectionSpecSelector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/connection/saneness;", "", "", "Lokhttp3/apical;", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "attabal", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/apical;", "Ljava/io/IOException;", "e", "", "saneness", "(Ljava/io/IOException;)Z", "socket", "dern", "(Ljavax/net/ssl/SSLSocket;)Z", "Ljava/util/List;", "", "I", "nextModeIndex", "Z", "isFallbackPossible", "wireman", "isFallback", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<apical> connectionSpecs;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public boolean isFallbackPossible;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int nextModeIndex;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public boolean isFallback;

    public saneness(List<apical> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.connectionSpecs = connectionSpecs;
    }

    public final apical attabal(SSLSocket sslSocket) throws IOException {
        apical apicalVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i >= size) {
                apicalVar = null;
                break;
            }
            int i2 = i + 1;
            apicalVar = this.connectionSpecs.get(i);
            if (apicalVar.marial(sslSocket)) {
                this.nextModeIndex = i2;
                break;
            }
            i = i2;
        }
        if (apicalVar != null) {
            this.isFallbackPossible = dern(sslSocket);
            apicalVar.dern(sslSocket, this.isFallback);
            return apicalVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isFallback);
        sb.append(", modes=");
        sb.append(this.connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.beachfront(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean dern(SSLSocket socket) {
        int i = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (i < size) {
            int i2 = i + 1;
            if (this.connectionSpecs.get(i).marial(socket)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public final boolean saneness(IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.isFallback = true;
        if (!this.isFallbackPossible || (e instanceof ProtocolException) || (e instanceof InterruptedIOException)) {
            return false;
        }
        return (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException)) ? false : true;
    }
}
