package okhttp3;

import com.ironsource.C3414a2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Address.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b(\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u0017\u0010\u001a\u001a\u00020\u00198\u0007¢\u0006\f\n\u0004\b:\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010F\u001a\u00020B8G¢\u0006\f\n\u0004\b@\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148G¢\u0006\f\n\u0004\b.\u0010G\u001a\u0004\b8\u0010HR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148G¢\u0006\f\n\u0004\b1\u0010G\u001a\u0004\b,\u0010H¨\u0006I"}, d2 = {"Lokhttp3/attabal;", "", "", "uriHost", "", "uriPort", "Lokhttp3/arytenoidectomy;", "dns", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "certificatePinner", "Lokhttp3/saneness;", "proxyAuthenticator", "Ljava/net/Proxy;", "proxy", "", "Lokhttp3/Protocol;", "protocols", "Lokhttp3/apical;", "connectionSpecs", "Ljava/net/ProxySelector;", "proxySelector", "<init>", "(Ljava/lang/String;ILokhttp3/arytenoidectomy;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/saneness;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "that", "wireman", "(Lokhttp3/attabal;)Z", "toString", "()Ljava/lang/String;", "attabal", "Lokhttp3/arytenoidectomy;", "dern", "()Lokhttp3/arytenoidectomy;", "saneness", "Ljavax/net/SocketFactory;", "cutely", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "apical", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "marial", "()Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "beachfront", "Lokhttp3/saneness;", "impromptu", "()Lokhttp3/saneness;", "competently", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "taiyuan", "()Ljava/net/ProxySelector;", "Lokhttp3/graveside;", "Lokhttp3/graveside;", "formularize", "()Lokhttp3/graveside;", "url", "Ljava/util/List;", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final List<apical> connectionSpecs;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final arytenoidectomy dns;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final saneness proxyAuthenticator;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Proxy proxy;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final List<Protocol> protocols;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final SSLSocketFactory sslSocketFactory;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final ProxySelector proxySelector;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final CertificatePinner certificatePinner;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final SocketFactory socketFactory;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final graveside url;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final HostnameVerifier hostnameVerifier;

    public attabal(String uriHost, int i, arytenoidectomy dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, saneness proxyAuthenticator, Proxy proxy, List<? extends Protocol> protocols, List<apical> connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new graveside.attabal().rotuma(sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http").triweekly(uriHost).graveside(i).dern();
        this.protocols = hereditist.wireman.peridotite(protocols);
        this.connectionSpecs = hereditist.wireman.peridotite(connectionSpecs);
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    public final List<Protocol> beachfront() {
        return this.protocols;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final arytenoidectomy getDns() {
        return this.dns;
    }

    public boolean equals(Object other) {
        if (!(other instanceof attabal)) {
            return false;
        }
        attabal attabalVar = (attabal) other;
        return Intrinsics.wireman(this.url, attabalVar.url) && wireman(attabalVar);
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final graveside getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final saneness getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<apical> saneness() {
        return this.connectionSpecs;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.url.getHost());
        sb.append(':');
        sb.append(this.url.getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String());
        sb.append(", ");
        Proxy proxy = this.proxy;
        sb.append(proxy != null ? Intrinsics.arytenoidectomy("proxy=", proxy) : Intrinsics.arytenoidectomy("proxySelector=", this.proxySelector));
        sb.append('}');
        return sb.toString();
    }

    public final boolean wireman(attabal that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.wireman(this.dns, that.dns) && Intrinsics.wireman(this.proxyAuthenticator, that.proxyAuthenticator) && Intrinsics.wireman(this.protocols, that.protocols) && Intrinsics.wireman(this.connectionSpecs, that.connectionSpecs) && Intrinsics.wireman(this.proxySelector, that.proxySelector) && Intrinsics.wireman(this.proxy, that.proxy) && Intrinsics.wireman(this.sslSocketFactory, that.sslSocketFactory) && Intrinsics.wireman(this.hostnameVerifier, that.hostnameVerifier) && Intrinsics.wireman(this.certificatePinner, that.certificatePinner) && this.url.getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String() == that.url.getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String();
    }
}
