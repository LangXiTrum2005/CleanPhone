package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2865Wr {
    public static final C2813Ur Companion = new C2813Ur();
    public static final AbstractC2865Wr NONE = new C2787Tr();

    public void cacheConditionalHit(InterfaceC2409Fc interfaceC2409Fc, C5021xZ c5021xZ) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(c5021xZ, "cachedResponse");
    }

    public void cacheHit(InterfaceC2409Fc interfaceC2409Fc, C5021xZ c5021xZ) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(c5021xZ, "response");
    }

    public void cacheMiss(InterfaceC2409Fc interfaceC2409Fc) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }

    public void callEnd(InterfaceC2409Fc interfaceC2409Fc) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }

    public void callFailed(InterfaceC2409Fc interfaceC2409Fc, IOException iOException) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(iOException, "ioe");
    }

    public void callStart(InterfaceC2409Fc interfaceC2409Fc) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }

    public void canceled(InterfaceC2409Fc interfaceC2409Fc) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }

    public void connectEnd(InterfaceC2409Fc interfaceC2409Fc, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC5106yW enumC5106yW) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(inetSocketAddress, "inetSocketAddress");
        AbstractC2995aW.q(proxy, "proxy");
    }

    public void connectFailed(InterfaceC2409Fc interfaceC2409Fc, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC5106yW enumC5106yW, IOException iOException) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(inetSocketAddress, "inetSocketAddress");
        AbstractC2995aW.q(proxy, "proxy");
        AbstractC2995aW.q(iOException, "ioe");
    }

    public void connectStart(InterfaceC2409Fc interfaceC2409Fc, InetSocketAddress inetSocketAddress, Proxy proxy) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(inetSocketAddress, "inetSocketAddress");
        AbstractC2995aW.q(proxy, "proxy");
    }

    public void connectionAcquired(InterfaceC2409Fc interfaceC2409Fc, InterfaceC3722ij interfaceC3722ij) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(interfaceC3722ij, "connection");
    }

    public void connectionReleased(InterfaceC2409Fc interfaceC2409Fc, InterfaceC3722ij interfaceC3722ij) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(interfaceC3722ij, "connection");
    }

    public void dnsEnd(InterfaceC2409Fc interfaceC2409Fc, String str, List list) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(str, "domainName");
        AbstractC2995aW.q(list, "inetAddressList");
    }

    public void dnsStart(InterfaceC2409Fc interfaceC2409Fc, String str) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(str, "domainName");
    }

    public void proxySelectEnd(InterfaceC2409Fc interfaceC2409Fc, ZA za, List<Proxy> list) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(za, "url");
        AbstractC2995aW.q(list, "proxies");
    }

    public void proxySelectStart(InterfaceC2409Fc interfaceC2409Fc, ZA za) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(za, "url");
    }

    public void requestBodyEnd(InterfaceC2409Fc interfaceC2409Fc, long j) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }

    public void requestBodyStart(InterfaceC2409Fc interfaceC2409Fc) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }

    public void requestFailed(InterfaceC2409Fc interfaceC2409Fc, IOException iOException) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(iOException, "ioe");
    }

    public void requestHeadersEnd(InterfaceC2409Fc interfaceC2409Fc, HY hy) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(hy, J0.REQUEST_KEY_EXTRA);
    }

    public void requestHeadersStart(InterfaceC2409Fc interfaceC2409Fc) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }

    public void responseBodyEnd(InterfaceC2409Fc interfaceC2409Fc, long j) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }

    public void responseBodyStart(InterfaceC2409Fc interfaceC2409Fc) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }

    public void responseFailed(InterfaceC2409Fc interfaceC2409Fc, IOException iOException) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(iOException, "ioe");
    }

    public void responseHeadersEnd(InterfaceC2409Fc interfaceC2409Fc, C5021xZ c5021xZ) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(c5021xZ, "response");
    }

    public void responseHeadersStart(InterfaceC2409Fc interfaceC2409Fc) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }

    public void satisfactionFailure(InterfaceC2409Fc interfaceC2409Fc, C5021xZ c5021xZ) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(c5021xZ, "response");
    }

    public void secureConnectEnd(InterfaceC2409Fc interfaceC2409Fc, C3657hz c3657hz) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }

    public void secureConnectStart(InterfaceC2409Fc interfaceC2409Fc) {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
    }
}
