package shent;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeferredSocketAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lshent/cutely;", "Lshent/apical;", "Lshent/cutely$attabal;", "socketAdapterFactory", "<init>", "(Lshent/cutely$attabal;)V", "", "isSupported", "()Z", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "attabal", "(Ljavax/net/ssl/SSLSocket;)Lshent/apical;", "Lshent/cutely$attabal;", "saneness", "Lshent/apical;", "delegate", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class cutely implements apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final attabal socketAdapterFactory;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public apical delegate;

    /* JADX INFO: compiled from: DeferredSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lshent/cutely$attabal;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "Lshent/apical;", "create", "(Ljavax/net/ssl/SSLSocket;)Lshent/apical;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface attabal {
        apical create(SSLSocket sslSocket);

        boolean matchesSocket(SSLSocket sslSocket);
    }

    public cutely(attabal socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.socketAdapterFactory = socketAdapterFactory;
    }

    public final synchronized apical attabal(SSLSocket sslSocket) {
        try {
            if (this.delegate == null && this.socketAdapterFactory.matchesSocket(sslSocket)) {
                this.delegate = this.socketAdapterFactory.create(sslSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.delegate;
    }

    @Override // shent.apical
    public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        apical apicalVarAttabal = attabal(sslSocket);
        if (apicalVarAttabal == null) {
            return;
        }
        apicalVarAttabal.configureTlsExtensions(sslSocket, hostname, protocols);
    }

    @Override // shent.apical
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        apical apicalVarAttabal = attabal(sslSocket);
        if (apicalVarAttabal == null) {
            return null;
        }
        return apicalVarAttabal.getSelectedProtocol(sslSocket);
    }

    @Override // shent.apical
    public boolean isSupported() {
        return true;
    }

    @Override // shent.apical
    public boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.socketAdapterFactory.matchesSocket(sslSocket);
    }
}
