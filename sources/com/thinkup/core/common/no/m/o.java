package com.thinkup.core.common.no.m;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    final o0o m;
    final Proxy m0;
    final HostnameVerifier mm;
    final on mn;
    final SSLSocketFactory mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final SocketFactory f42005n;
    final oom o;
    final m o0;
    final List<n0> om;
    final ProxySelector on;
    final List<on0> oo;

    public o(String str, int i2, o0o o0oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, on onVar, m mVar, Proxy proxy, List<on0> list, List<n0> list2, ProxySelector proxySelector) {
        oom.o oVar = new oom.o();
        String str2 = sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http";
        if (str2.equalsIgnoreCase("http")) {
            oVar.o = "http";
        } else {
            if (!str2.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            oVar.o = HttpRequest.DEFAULT_SCHEME;
        }
        oom.o oVarO = oVar.o(str);
        if (i2 <= 0 || i2 > 65535) {
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i2)));
        }
        oVarO.oo = i2;
        this.o = oVarO.m();
        if (o0oVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.m = o0oVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f42005n = socketFactory;
        if (mVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.o0 = mVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.oo = com.thinkup.core.common.no.m.o.n.o(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.om = com.thinkup.core.common.no.m.o.n.o(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.on = proxySelector;
        this.m0 = proxy;
        this.mo = sSLSocketFactory;
        this.mm = hostnameVerifier;
        this.mn = onVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.o.equals(oVar.o) && o(oVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.mn) + ((Objects.hashCode(this.mm) + ((Objects.hashCode(this.mo) + ((Objects.hashCode(this.m0) + ((this.on.hashCode() + ((this.om.hashCode() + ((this.oo.hashCode() + ((this.o0.hashCode() + ((this.m.hashCode() + ((this.o.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final o0o m() {
        return this.m;
    }

    public final Proxy m0() {
        return this.m0;
    }

    public final HostnameVerifier mm() {
        return this.mm;
    }

    public final on mn() {
        return this.mn;
    }

    public final SSLSocketFactory mo() {
        return this.mo;
    }

    public final SocketFactory n() {
        return this.f42005n;
    }

    public final oom o() {
        return this.o;
    }

    public final m o0() {
        return this.o0;
    }

    public final List<n0> om() {
        return this.om;
    }

    public final ProxySelector on() {
        return this.on;
    }

    public final List<on0> oo() {
        return this.oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.o.no);
        sb.append(":");
        sb.append(this.o.nm);
        if (this.m0 != null) {
            sb.append(", proxy=");
            sb.append(this.m0);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.on);
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean o(o oVar) {
        return this.m.equals(oVar.m) && this.o0.equals(oVar.o0) && this.oo.equals(oVar.oo) && this.om.equals(oVar.om) && this.on.equals(oVar.on) && Objects.equals(this.m0, oVar.m0) && Objects.equals(this.mo, oVar.mo) && Objects.equals(this.mm, oVar.mm) && Objects.equals(this.mn, oVar.mn) && this.o.nm == oVar.o.nm;
    }
}
