package xn;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f54095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f54096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f54097c;

    public z(a aVar, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.n.f(socketAddress, "socketAddress");
        this.f54095a = aVar;
        this.f54096b = proxy;
        this.f54097c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.n.a(zVar.f54095a, this.f54095a) && kotlin.jvm.internal.n.a(zVar.f54096b, this.f54096b) && kotlin.jvm.internal.n.a(zVar.f54097c, this.f54097c);
    }

    public final int hashCode() {
        return this.f54097c.hashCode() + ((this.f54096b.hashCode() + ((this.f54095a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f54097c + '}';
    }
}
