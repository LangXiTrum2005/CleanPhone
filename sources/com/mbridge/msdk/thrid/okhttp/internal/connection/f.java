package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.a f36312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f36313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f36314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f36315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<Proxy> f36316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<InetSocketAddress> f36318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<c0> f36319h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c0> f36320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36321b = 0;

        public a(List<c0> list) {
            this.f36320a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.f36320a);
        }

        public boolean b() {
            return this.f36321b < this.f36320a.size();
        }

        public c0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<c0> list = this.f36320a;
            int i10 = this.f36321b;
            this.f36321b = i10 + 1;
            return list.get(i10);
        }
    }

    public f(com.mbridge.msdk.thrid.okhttp.a aVar, d dVar, com.mbridge.msdk.thrid.okhttp.d dVar2, o oVar) {
        List list = Collections.EMPTY_LIST;
        this.f36316e = list;
        this.f36318g = list;
        this.f36319h = new ArrayList();
        this.f36312a = aVar;
        this.f36313b = dVar;
        this.f36314c = dVar2;
        this.f36315d = oVar;
        a(aVar.k(), aVar.f());
    }

    private boolean b() {
        return this.f36317f < this.f36316e.size();
    }

    private Proxy d() throws IOException {
        if (!b()) {
            throw new SocketException("No route to " + this.f36312a.k().g() + "; exhausted proxy configurations: " + this.f36316e);
        }
        List<Proxy> list = this.f36316e;
        int i10 = this.f36317f;
        this.f36317f = i10 + 1;
        Proxy proxy = list.get(i10);
        a(proxy);
        return proxy;
    }

    public boolean a() {
        return b() || !this.f36319h.isEmpty();
    }

    public a c() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            int size = this.f36318g.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = new c0(this.f36312a, proxyD, this.f36318g.get(i10));
                if (this.f36313b.c(c0Var)) {
                    this.f36319h.add(c0Var);
                } else {
                    arrayList.add(c0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f36319h);
            this.f36319h.clear();
        }
        return new a(arrayList);
    }

    public void a(c0 c0Var, IOException iOException) {
        if (c0Var.b().type() != Proxy.Type.DIRECT && this.f36312a.h() != null) {
            this.f36312a.h().connectFailed(this.f36312a.k().n(), c0Var.b().address(), iOException);
        }
        this.f36313b.b(c0Var);
    }

    private void a(s sVar, Proxy proxy) {
        List<Proxy> listA;
        if (proxy != null) {
            this.f36316e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f36312a.h().select(sVar.n());
            if (listSelect != null && !listSelect.isEmpty()) {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(listSelect);
            } else {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(Proxy.NO_PROXY);
            }
            this.f36316e = listA;
        }
        this.f36317f = 0;
    }

    private void a(Proxy proxy) throws IOException {
        String strG;
        int iJ;
        this.f36318g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress socketAddressAddress = proxy.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strG = a(inetSocketAddress);
                iJ = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
        } else {
            strG = this.f36312a.k().g();
            iJ = this.f36312a.k().j();
        }
        if (iJ >= 1 && iJ <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f36318g.add(InetSocketAddress.createUnresolved(strG, iJ));
                return;
            }
            this.f36315d.dnsStart(this.f36314c, strG);
            List<InetAddress> listA = this.f36312a.c().a(strG);
            if (!listA.isEmpty()) {
                this.f36315d.dnsEnd(this.f36314c, strG, listA);
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f36318g.add(new InetSocketAddress(listA.get(i10), iJ));
                }
                return;
            }
            throw new UnknownHostException(this.f36312a.c() + " returned no addresses for " + strG);
        }
        throw new SocketException("No route to " + strG + ":" + iJ + "; port is out of range");
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
