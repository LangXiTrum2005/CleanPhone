package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f36164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Proxy f36165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final InetSocketAddress f36166c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f36164a = aVar;
        this.f36165b = proxy;
        this.f36166c = inetSocketAddress;
    }

    public a a() {
        return this.f36164a;
    }

    public Proxy b() {
        return this.f36165b;
    }

    public boolean c() {
        return this.f36164a.f36112i != null && this.f36165b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f36166c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f36164a.equals(this.f36164a) && c0Var.f36165b.equals(this.f36165b) && c0Var.f36166c.equals(this.f36166c);
    }

    public int hashCode() {
        return this.f36166c.hashCode() + ((this.f36165b.hashCode() + ((this.f36164a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public String toString() {
        return "Route{" + this.f36166c + "}";
    }
}
