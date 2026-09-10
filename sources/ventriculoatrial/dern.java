package ventriculoatrial;

import elusion.impromptu;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lventriculoatrial/dern;", "", "<init>", "()V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "attabal", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ventriculoatrial.dern$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CertificateChainCleaner.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lventriculoatrial/dern$attabal;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lventriculoatrial/dern;", "attabal", "(Ljavax/net/ssl/X509TrustManager;)Lventriculoatrial/dern;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dern attabal(X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return impromptu.INSTANCE.competently().dern(trustManager);
        }

        public Companion() {
        }
    }

    public abstract List<Certificate> attabal(List<? extends Certificate> chain, String hostname) throws SSLPeerUnverifiedException;
}
