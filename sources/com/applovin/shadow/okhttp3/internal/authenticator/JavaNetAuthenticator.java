package com.applovin.shadow.okhttp3.internal.authenticator;

import com.applovin.shadow.okhttp3.Address;
import com.applovin.shadow.okhttp3.Authenticator;
import com.applovin.shadow.okhttp3.Challenge;
import com.applovin.shadow.okhttp3.Credentials;
import com.applovin.shadow.okhttp3.Dns;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.Route;
import com.ironsource.Ve;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import xj.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/authenticator/JavaNetAuthenticator;", "Lcom/applovin/shadow/okhttp3/Authenticator;", "Lcom/applovin/shadow/okhttp3/Dns;", "defaultDns", "<init>", "(Lxn/b;)V", "Ljava/net/Proxy;", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "dns", "Ljava/net/InetAddress;", "connectToInetAddress", "(Ljava/net/Proxy;Lcom/applovin/shadow/okhttp3/HttpUrl;Lcom/applovin/shadow/okhttp3/Dns;)Ljava/net/InetAddress;", "Lcom/applovin/shadow/okhttp3/Route;", "route", "Lcom/applovin/shadow/okhttp3/Response;", Ve.f27442n, "Lcom/applovin/shadow/okhttp3/Request;", "authenticate", "(Lcom/applovin/shadow/okhttp3/Route;Lcom/applovin/shadow/okhttp3/Response;)Lcom/applovin/shadow/okhttp3/Request;", "Lcom/applovin/shadow/okhttp3/Dns;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class JavaNetAuthenticator implements Authenticator {
    private final Dns defaultDns;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final InetAddress connectToInetAddress(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) == 1) {
            return (InetAddress) n.o0(dns.lookup(httpUrl.host()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        kotlin.jvm.internal.n.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        kotlin.jvm.internal.n.e(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // com.applovin.shadow.okhttp3.Authenticator
    public Request authenticate(Route route, Response response) throws IOException {
        Proxy proxy;
        Dns dns;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        Address address;
        kotlin.jvm.internal.n.f(response, "response");
        List<Challenge> listChallenges = response.challenges();
        Request request = response.request();
        HttpUrl httpUrlUrl = request.url();
        boolean z10 = response.code() == 407;
        if (route == null || (proxy = route.proxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge challenge : listChallenges) {
            if ("Basic".equalsIgnoreCase(challenge.scheme())) {
                if (route == null || (address = route.address()) == null || (dns = address.dns()) == null) {
                    dns = this.defaultDns;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    kotlin.jvm.internal.n.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), connectToInetAddress(proxy, httpUrlUrl, dns), inetSocketAddress.getPort(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), java.net.Authenticator.RequestorType.PROXY);
                } else {
                    String strHost = httpUrlUrl.host();
                    kotlin.jvm.internal.n.e(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(strHost, connectToInetAddress(proxy, httpUrlUrl, dns), httpUrlUrl.port(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), java.net.Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    kotlin.jvm.internal.n.e(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    kotlin.jvm.internal.n.e(password, "auth.password");
                    return request.newBuilder().header(str, Credentials.basic(userName, new String(password), challenge.charset())).build();
                }
            }
        }
        return null;
    }

    public JavaNetAuthenticator(Dns defaultDns) {
        kotlin.jvm.internal.n.f(defaultDns, "defaultDns");
        this.defaultDns = defaultDns;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i10, g gVar) {
        this((i10 & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
