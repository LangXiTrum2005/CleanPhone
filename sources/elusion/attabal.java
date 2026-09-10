package elusion;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import shent.apical;
import shent.cutely;
import shent.taiyuan;

/* JADX INFO: compiled from: Android10Platform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lelusion/attabal;", "Lelusion/impromptu;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "marial", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "impromptu", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "cutely", "(Ljava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lventriculoatrial/dern;", "dern", "(Ljavax/net/ssl/X509TrustManager;)Lventriculoatrial/dern;", "Lshent/apical;", "wireman", "Ljava/util/List;", "socketAdapters", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class attabal extends impromptu {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final boolean f25615beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final List<apical> socketAdapters;

    /* JADX INFO: renamed from: elusion.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: Android10Platform.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lelusion/attabal$attabal;", "", "<init>", "()V", "Lelusion/impromptu;", "attabal", "()Lelusion/impromptu;", "", "isSupported", "Z", "saneness", "()Z", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final impromptu attabal() {
            if (saneness()) {
                return new attabal();
            }
            return null;
        }

        public final boolean saneness() {
            return attabal.f25615beachfront;
        }

        public Companion() {
        }
    }

    static {
        f25615beachfront = impromptu.INSTANCE.impromptu() && Build.VERSION.SDK_INT >= 29;
    }

    public attabal() {
        List listMonoploid = adultoid.monoploid(shent.attabal.INSTANCE.attabal(), new cutely(shent.beachfront.INSTANCE.wireman()), new cutely(taiyuan.INSTANCE.attabal()), new cutely(shent.competently.INSTANCE.attabal()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMonoploid) {
            if (((apical) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }

    @Override // elusion.impromptu
    public boolean cutely(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // elusion.impromptu
    public ventriculoatrial.dern dern(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        shent.saneness sanenessVarAttabal = shent.saneness.INSTANCE.attabal(trustManager);
        return sanenessVarAttabal == null ? super.dern(trustManager) : sanenessVarAttabal;
    }

    @Override // elusion.impromptu
    public String impromptu(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((apical) next).matchesSocket(sslSocket));
        apical apicalVar = (apical) next;
        if (apicalVar == null) {
            return null;
        }
        return apicalVar.getSelectedProtocol(sslSocket);
    }

    @Override // elusion.impromptu
    public void marial(SSLSocket sslSocket, String hostname, List<? extends Protocol> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((apical) next).matchesSocket(sslSocket));
        apical apicalVar = (apical) next;
        if (apicalVar == null) {
            return;
        }
        apicalVar.configureTlsExtensions(sslSocket, hostname, protocols);
    }
}
