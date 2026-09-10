package com.thinkup.core.common.no.m;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes6.dex */
public final class m0m {
    final Proxy m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final InetSocketAddress f41990n;
    final o o;

    public m0m(o oVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (oVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.o = oVar;
        this.m = proxy;
        this.f41990n = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0m)) {
            return false;
        }
        m0m m0mVar = (m0m) obj;
        return m0mVar.o.equals(this.o) && m0mVar.m.equals(this.m) && m0mVar.f41990n.equals(this.f41990n);
    }

    public final int hashCode() {
        return this.f41990n.hashCode() + ((this.m.hashCode() + ((this.o.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final Proxy m() {
        return this.m;
    }

    public final InetSocketAddress n() {
        return this.f41990n;
    }

    public final o o() {
        return this.o;
    }

    public final boolean o0() {
        return this.o.mo != null && this.m.type() == Proxy.Type.HTTP;
    }

    public final String toString() {
        return "Route{" + this.f41990n + "}";
    }
}
