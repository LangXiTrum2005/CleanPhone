package okhttp3;

import com.ironsource.C3414a2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Route.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokhttp3/trm;", "", "Lokhttp3/attabal;", AgentOptions.ADDRESS, "Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(Lokhttp3/attabal;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "", "dern", "()Z", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "attabal", "Lokhttp3/attabal;", "()Lokhttp3/attabal;", "saneness", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "Ljava/net/InetSocketAddress;", "wireman", "()Ljava/net/InetSocketAddress;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class trm {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final attabal address;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final InetSocketAddress socketAddress;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Proxy proxy;

    public trm(attabal address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final attabal getAddress() {
        return this.address;
    }

    public final boolean dern() {
        return this.address.getSslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object other) {
        if (!(other instanceof trm)) {
            return false;
        }
        trm trmVar = (trm) other;
        return Intrinsics.wireman(trmVar.address, this.address) && Intrinsics.wireman(trmVar.proxy, this.proxy) && Intrinsics.wireman(trmVar.socketAddress, this.socketAddress);
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }
}
