package com.thinkup.core.common.no.m.o.m;

import com.thinkup.core.common.no.m.m0m;
import com.thinkup.core.common.no.m.o0m;
import com.thinkup.core.common.no.m.oom;
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

/* JADX INFO: loaded from: classes6.dex */
final class mo {
    private final on m;
    private final List<m0m> m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.thinkup.core.common.no.m.oo f42009n;
    private final com.thinkup.core.common.no.m.o o;
    private final o0m o0;
    private int om;
    private List<InetSocketAddress> on;
    private List<Proxy> oo;

    public static final class o {
        private int m = 0;
        private final List<m0m> o;

        public o(List<m0m> list) {
            this.o = list;
        }

        public final m0m m() {
            if (!o()) {
                throw new NoSuchElementException();
            }
            List<m0m> list = this.o;
            int i2 = this.m;
            this.m = i2 + 1;
            return list.get(i2);
        }

        public final List<m0m> n() {
            return new ArrayList(this.o);
        }

        public final boolean o() {
            return this.m < this.o.size();
        }
    }

    public mo(com.thinkup.core.common.no.m.o oVar, on onVar, com.thinkup.core.common.no.m.oo ooVar, o0m o0mVar) {
        List<Proxy> listO;
        List list = Collections.EMPTY_LIST;
        this.oo = list;
        this.on = list;
        this.m0 = new ArrayList();
        this.o = oVar;
        this.m = onVar;
        this.f42009n = ooVar;
        this.o0 = o0mVar;
        oom oomVarO = oVar.o();
        Proxy proxyM0 = oVar.m0();
        if (proxyM0 != null) {
            listO = Collections.singletonList(proxyM0);
        } else {
            List<Proxy> listSelect = oVar.on().select(oomVarO.o());
            listO = (listSelect == null || listSelect.isEmpty()) ? com.thinkup.core.common.no.m.o.n.o(Proxy.NO_PROXY) : com.thinkup.core.common.no.m.o.n.o(listSelect);
        }
        this.oo = listO;
        this.om = 0;
    }

    private boolean n() {
        return this.om < this.oo.size();
    }

    private Proxy o0() throws SocketException, UnknownHostException {
        if (!n()) {
            throw new SocketException("No route to " + this.o.o().om() + "; exhausted proxy configurations: " + this.oo);
        }
        List<Proxy> list = this.oo;
        int i2 = this.om;
        this.om = i2 + 1;
        Proxy proxy = list.get(i2);
        o(proxy);
        return proxy;
    }

    public final o m() throws SocketException, UnknownHostException {
        if (!o()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (n()) {
            if (!n()) {
                throw new SocketException("No route to " + this.o.o().om() + "; exhausted proxy configurations: " + this.oo);
            }
            List<Proxy> list = this.oo;
            int i2 = this.om;
            this.om = i2 + 1;
            Proxy proxy = list.get(i2);
            o(proxy);
            int size = this.on.size();
            for (int i3 = 0; i3 < size; i3++) {
                m0m m0mVar = new m0m(this.o, proxy, this.on.get(i3));
                if (this.m.n(m0mVar)) {
                    this.m0.add(m0mVar);
                } else {
                    arrayList.add(m0mVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.m0);
            this.m0.clear();
        }
        return new o(arrayList);
    }

    public final boolean o() {
        return n() || !this.m0.isEmpty();
    }

    private void o(oom oomVar, Proxy proxy) {
        List<Proxy> listO;
        if (proxy != null) {
            listO = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.o.on().select(oomVar.o());
            listO = (listSelect == null || listSelect.isEmpty()) ? com.thinkup.core.common.no.m.o.n.o(Proxy.NO_PROXY) : com.thinkup.core.common.no.m.o.n.o(listSelect);
        }
        this.oo = listO;
        this.om = 0;
    }

    private void o(Proxy proxy) throws SocketException, UnknownHostException {
        String strOm;
        int iOn;
        this.on = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress socketAddressAddress = proxy.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    strOm = inetSocketAddress.getHostName();
                } else {
                    strOm = address.getHostAddress();
                }
                iOn = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
        } else {
            strOm = this.o.o().om();
            iOn = this.o.o().on();
        }
        if (iOn > 0 && iOn <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.on.add(InetSocketAddress.createUnresolved(strOm, iOn));
                return;
            }
            List<InetAddress> listO = this.o.m().o(strOm);
            if (!listO.isEmpty()) {
                int size = listO.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.on.add(new InetSocketAddress(listO.get(i2), iOn));
                }
                return;
            }
            throw new UnknownHostException(this.o.m() + " returned no addresses for " + strOm);
        }
        throw new SocketException("No route to " + strOm + ":" + iOn + "; port is out of range");
    }

    private static String o(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
