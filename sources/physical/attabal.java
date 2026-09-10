package physical;

import com.ironsource.Ie;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import okhttp3.arytenoidectomy;
import okhttp3.competently;
import okhttp3.cuirassed;
import okhttp3.graveside;
import okhttp3.preprohormone;
import okhttp3.saneness;
import okhttp3.triweekly;
import okhttp3.trm;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: JavaNetAuthenticator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lphysical/attabal;", "Lokhttp3/saneness;", "Lokhttp3/arytenoidectomy;", "defaultDns", "<init>", "(Lokhttp3/arytenoidectomy;)V", "Lokhttp3/trm;", "route", "Lokhttp3/cuirassed;", Ie.n, "Lokhttp3/preprohormone;", "attabal", "(Lokhttp3/trm;Lokhttp3/cuirassed;)Lokhttp3/preprohormone;", "Ljava/net/Proxy;", "Lokhttp3/graveside;", "url", "dns", "Ljava/net/InetAddress;", "saneness", "(Ljava/net/Proxy;Lokhttp3/graveside;Lokhttp3/arytenoidectomy;)Ljava/net/InetAddress;", "wireman", "Lokhttp3/arytenoidectomy;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class attabal implements saneness {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final arytenoidectomy defaultDns;

    /* JADX INFO: renamed from: physical.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JavaNetAuthenticator.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class C0769attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f35316attabal;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f35316attabal = iArr;
        }
    }

    public attabal(arytenoidectomy defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.defaultDns = defaultDns;
    }

    @Override // okhttp3.saneness
    public preprohormone attabal(trm route, cuirassed response) throws IOException {
        okhttp3.attabal attabalVar;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        Intrinsics.checkNotNullParameter(response, "response");
        List<competently> listMarial = response.marial();
        preprohormone preprohormoneVar = response.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String();
        graveside url = preprohormoneVar.getUrl();
        boolean z = response.getCode() == 407;
        Proxy proxy = route == null ? null : route.getProxy();
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (competently competentlyVar : listMarial) {
            if (dovishness.stratoscope("Basic", competentlyVar.getScheme(), true)) {
                arytenoidectomy dns = (route == null || (attabalVar = route.getOrg.jacoco.core.runtime.AgentOptions.ADDRESS java.lang.String()) == null) ? null : attabalVar.getDns();
                if (dns == null) {
                    dns = this.defaultDns;
                }
                if (z) {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (socketAddressAddress == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, saneness(proxy, url, dns), inetSocketAddress.getPort(), url.getScheme(), competentlyVar.saneness(), competentlyVar.getScheme(), url.adultoid(), Authenticator.RequestorType.PROXY);
                } else {
                    String host = url.getHost();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(host, saneness(proxy, url, dns), url.getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String(), url.getScheme(), competentlyVar.saneness(), competentlyVar.getScheme(), url.adultoid(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return preprohormoneVar.taiyuan().impromptu(str, triweekly.attabal(userName, new String(password), competentlyVar.attabal())).saneness();
                }
            }
        }
        return null;
    }

    public final InetAddress saneness(Proxy proxy, graveside gravesideVar, arytenoidectomy arytenoidectomyVar) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0769attabal.f35316attabal[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.lerp(arytenoidectomyVar.lookup(gravesideVar.getHost()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "address() as InetSocketAddress).address");
        return address;
    }

    public /* synthetic */ attabal(arytenoidectomy arytenoidectomyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? arytenoidectomy.f34137saneness : arytenoidectomyVar);
    }
}
