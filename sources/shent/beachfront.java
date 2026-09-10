package shent;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: AndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 $2\u00020\u0001:\u0001\u0017B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\n \u001d*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u001c\u0010!\u001a\n \u001d*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR\u001c\u0010#\u001a\n \u001d*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001b¨\u0006%"}, d2 = {"Lshent/beachfront;", "Lshent/apical;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "", "isSupported", "()Z", "sslSocket", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "attabal", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "saneness", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "kotlin.jvm.PlatformType", "dern", "setHostname", "wireman", "getAlpnSelectedProtocol", "marial", "setAlpnProtocols", "beachfront", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class beachfront implements apical {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final cutely.attabal f37593competently;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Class<? super SSLSocket> sslSocketClass;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Method setHostname;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Method setAlpnProtocols;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Method setUseSessionTickets;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final Method getAlpnSelectedProtocol;

    /* JADX INFO: renamed from: shent.beachfront$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AndroidSocketAdapter.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lshent/beachfront$attabal;", "", "<init>", "()V", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "Lshent/cutely$attabal;", "dern", "(Ljava/lang/String;)Lshent/cutely$attabal;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lshent/beachfront;", "saneness", "(Ljava/lang/Class;)Lshent/beachfront;", "playProviderFactory", "Lshent/cutely$attabal;", "wireman", "()Lshent/cutely$attabal;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: shent.beachfront$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AndroidSocketAdapter.kt */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"shent/beachfront$attabal$attabal", "Lshent/cutely$attabal;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "Lshent/apical;", "create", "(Ljavax/net/ssl/SSLSocket;)Lshent/apical;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0799attabal implements cutely.attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ String f37599attabal;

            public C0799attabal(String str) {
                this.f37599attabal = str;
            }

            @Override // shent.cutely.attabal
            public apical create(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return beachfront.INSTANCE.saneness(sslSocket.getClass());
            }

            @Override // shent.cutely.attabal
            public boolean matchesSocket(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                return dovishness.starveling(name, Intrinsics.arytenoidectomy(this.f37599attabal, "."), false, 2, null);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cutely.attabal dern(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C0799attabal(packageName);
        }

        public final beachfront saneness(Class<? super SSLSocket> actualSSLSocketClass) {
            Class<? super SSLSocket> superclass = actualSSLSocketClass;
            while (superclass != null && !Intrinsics.wireman(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError(Intrinsics.arytenoidectomy("No OpenSSLSocketImpl superclass of socket of type ", actualSSLSocketClass));
                }
            }
            Intrinsics.beachfront(superclass);
            return new beachfront(superclass);
        }

        public final cutely.attabal wireman() {
            return beachfront.f37593competently;
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f37593competently = companion.dern("com.google.android.gms.org.conscrypt");
    }

    public beachfront(Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.sslSocketClass = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = sslSocketClass.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.setAlpnProtocols = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // shent.apical
    public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            try {
                this.setUseSessionTickets.invoke(sslSocket, Boolean.TRUE);
                if (hostname != null) {
                    this.setHostname.invoke(sslSocket, hostname);
                }
                this.setAlpnProtocols.invoke(sslSocket, elusion.impromptu.INSTANCE.dern(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // shent.apical
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!matchesSocket(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sslSocket, null);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, Charsets.UTF_8);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.wireman(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // shent.apical
    public boolean isSupported() {
        return elusion.saneness.INSTANCE.saneness();
    }

    @Override // shent.apical
    public boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.sslSocketClass.isInstance(sslSocket);
    }
}
