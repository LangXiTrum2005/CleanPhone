package b2;

import com.google.android.gms.internal.ads.kj1;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f5218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f5219i;

    public a(bo.l connectionPool, xn.a aVar, bo.i iVar) {
        kotlin.jvm.internal.n.f(connectionPool, "connectionPool");
        this.f5214d = connectionPool;
        this.f5215e = aVar;
        this.f5216f = iVar;
    }

    public static String b(String str, int i10, int i11, int i12) {
        String str2 = l1.y.f44830a;
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(" ");
        sb2.append(str);
        sb2.append("/");
        sb2.append(i11);
        return l1.d.k(sb2, "/", i12);
    }

    public c a() {
        String strB;
        b bVarA;
        HashMap map = (HashMap) this.f5219i;
        try {
            if (map.containsKey("rtpmap")) {
                String str = (String) map.get("rtpmap");
                String str2 = l1.y.f44830a;
                bVarA = b.a(str);
            } else {
                int i10 = this.f5212b;
                go.k.i(i10 < 96);
                if (i10 == 0) {
                    strB = b("PCMU", 0, 8000, 1);
                } else if (i10 == 8) {
                    strB = b("PCMA", 8, 8000, 1);
                } else if (i10 == 10) {
                    strB = b("L16", 10, 44100, 2);
                } else {
                    if (i10 != 11) {
                        throw new IllegalStateException(l1.d.e(i10, "Unsupported static paylod type "));
                    }
                    strB = b("L16", 11, 44100, 1);
                }
                bVarA = b.a(strB);
            }
            return new c(this, oa.o0.e(map), bVarA);
        } catch (i1.e0 e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0277  */
    /* JADX WARN: Code duplicated, block: B:117:0x0294  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:131:0x0309  */
    /* JADX WARN: Code duplicated, block: B:132:0x031e  */
    /* JADX WARN: Code duplicated, block: B:180:0x031f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:67:0x015b  */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.List] */
    public bo.k c(int i10, int i11, int i12, boolean z10, boolean z11) throws IOException {
        xn.z zVar;
        bc.q qVar;
        kj1 kj1Var;
        ArrayList arrayList;
        bc.q qVar2;
        xn.a aVar;
        Proxy proxy;
        String hostName;
        int port;
        List listC;
        boolean zContains;
        bo.k kVar;
        od.c cVar;
        Socket socketL;
        while (!((bo.i) this.f5216f).f5797m) {
            bo.k kVar2 = ((bo.i) this.f5216f).f5793h;
            if (kVar2 != null) {
                synchronized (kVar2) {
                    try {
                        socketL = (kVar2.f5809j || !d(kVar2.f5801b.f54095a.f53917h)) ? ((bo.i) this.f5216f).l() : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (((bo.i) this.f5216f).f5793h == null) {
                    if (socketL != null) {
                        yn.a.e(socketL);
                    }
                    this.f5211a = 0;
                    this.f5212b = 0;
                    this.f5213c = 0;
                    if (((bo.l) this.f5214d).a((xn.a) this.f5215e, (bo.i) this.f5216f, null, false)) {
                        kVar2 = ((bo.i) this.f5216f).f5793h;
                        kotlin.jvm.internal.n.c(kVar2);
                    } else {
                        zVar = (xn.z) this.f5219i;
                        try {
                            if (zVar != null) {
                                this.f5219i = null;
                            } else {
                                qVar = (bc.q) this.f5217g;
                                if (qVar == null && qVar.b()) {
                                    bc.q qVar3 = (bc.q) this.f5217g;
                                    kotlin.jvm.internal.n.c(qVar3);
                                    if (!qVar3.b()) {
                                        throw new NoSuchElementException();
                                    }
                                    ArrayList arrayList2 = qVar3.f5573a;
                                    int i13 = qVar3.f5574b;
                                    qVar3.f5574b = i13 + 1;
                                    zVar = (xn.z) arrayList2.get(i13);
                                } else {
                                    kj1Var = (kj1) this.f5218h;
                                    if (kj1Var == null) {
                                        xn.a aVar2 = (xn.a) this.f5215e;
                                        bo.i iVar = (bo.i) this.f5216f;
                                        kj1Var = new kj1(aVar2, iVar.f5786a.f54051z, iVar);
                                        this.f5218h = kj1Var;
                                    }
                                    if (kj1Var.p()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (kj1Var.f16462a < ((List) kj1Var.f16465d).size()) {
                                        aVar = (xn.a) kj1Var.f16463b;
                                        if (kj1Var.f16462a < ((List) kj1Var.f16465d).size()) {
                                            throw new SocketException("No route to " + aVar.f53917h.f53992d + "; exhausted proxy configurations: " + ((List) kj1Var.f16465d));
                                        }
                                        List list = (List) kj1Var.f16465d;
                                        int i14 = kj1Var.f16462a;
                                        kj1Var.f16462a = i14 + 1;
                                        proxy = (Proxy) list.get(i14);
                                        ArrayList arrayList3 = new ArrayList();
                                        kj1Var.f16466e = arrayList3;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            xn.m mVar = aVar.f53917h;
                                            hostName = mVar.f53992d;
                                            port = mVar.f53993e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address == null) {
                                                hostName = inetSocketAddress.getHostName();
                                                kotlin.jvm.internal.n.e(hostName, "hostName");
                                            } else {
                                                hostName = address.getHostAddress();
                                                kotlin.jvm.internal.n.e(hostName, "address.hostAddress");
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList3.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            byte[] bArr = yn.a.f54560a;
                                            kotlin.jvm.internal.n.f(hostName, "<this>");
                                            if (yn.a.f54564e.a(hostName)) {
                                                listC = j1.f.C(InetAddress.getByName(hostName));
                                            } else {
                                                aVar.f53910a.getClass();
                                                try {
                                                    InetAddress[] allByName = InetAddress.getAllByName(hostName);
                                                    kotlin.jvm.internal.n.e(allByName, "getAllByName(hostname)");
                                                    List listC0 = xj.k.C0(allByName);
                                                    if (listC0.isEmpty()) {
                                                        throw new UnknownHostException(aVar.f53910a + " returned no addresses for " + hostName);
                                                    }
                                                    listC = listC0;
                                                } catch (NullPointerException e10) {
                                                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                                                    unknownHostException.initCause(e10);
                                                    throw unknownHostException;
                                                }
                                            }
                                            Iterator it = listC.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = kj1Var.f16466e.iterator();
                                        while (it2.hasNext()) {
                                            xn.z zVar2 = new xn.z((xn.a) kj1Var.f16463b, proxy, (InetSocketAddress) it2.next());
                                            od.c cVar2 = (od.c) kj1Var.f16464c;
                                            synchronized (cVar2) {
                                                zContains = ((LinkedHashSet) cVar2.f47386b).contains(zVar2);
                                            }
                                            if (zContains) {
                                                ((ArrayList) kj1Var.f16467f).add(zVar2);
                                            } else {
                                                arrayList.add(zVar2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        xj.t.a0((ArrayList) kj1Var.f16467f, arrayList);
                                        ((ArrayList) kj1Var.f16467f).clear();
                                    }
                                    qVar2 = new bc.q(arrayList);
                                    this.f5217g = qVar2;
                                    if (!((bo.i) this.f5216f).f5797m) {
                                        throw new IOException("Canceled");
                                    }
                                    if (((bo.l) this.f5214d).a((xn.a) this.f5215e, (bo.i) this.f5216f, arrayList, false)) {
                                        kVar2 = ((bo.i) this.f5216f).f5793h;
                                        kotlin.jvm.internal.n.c(kVar2);
                                    } else {
                                        if (qVar2.b()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i15 = qVar2.f5574b;
                                        qVar2.f5574b = i15 + 1;
                                        zVar = (xn.z) arrayList.get(i15);
                                        kVar = new bo.k((bo.l) this.f5214d, zVar);
                                        ((bo.i) this.f5216f).f5799o = kVar;
                                        kVar.c(i10, i11, i12, z10, (bo.i) this.f5216f);
                                        ((bo.i) this.f5216f).f5799o = null;
                                        cVar = ((bo.i) this.f5216f).f5786a.f54051z;
                                        synchronized (cVar) {
                                            ((LinkedHashSet) cVar.f47386b).remove(zVar);
                                        }
                                        if (((bo.l) this.f5214d).a((xn.a) this.f5215e, (bo.i) this.f5216f, arrayList, true)) {
                                            kVar2 = ((bo.i) this.f5216f).f5793h;
                                            kotlin.jvm.internal.n.c(kVar2);
                                            this.f5219i = zVar;
                                            Socket socket = kVar.f5803d;
                                            kotlin.jvm.internal.n.c(socket);
                                            yn.a.e(socket);
                                        } else {
                                            synchronized (kVar) {
                                                bo.l lVar = (bo.l) this.f5214d;
                                                lVar.getClass();
                                                byte[] bArr2 = yn.a.f54560a;
                                                ((ConcurrentLinkedQueue) lVar.f5821d).add(kVar);
                                                ((ao.c) lVar.f5819b).c((ao.b) lVar.f5820c, 0L);
                                                ((bo.i) this.f5216f).b(kVar);
                                            }
                                            kVar2 = kVar;
                                        }
                                    }
                                }
                            }
                            kVar.c(i10, i11, i12, z10, (bo.i) this.f5216f);
                            ((bo.i) this.f5216f).f5799o = null;
                            cVar = ((bo.i) this.f5216f).f5786a.f54051z;
                            synchronized (cVar) {
                                ((LinkedHashSet) cVar.f47386b).remove(zVar);
                                if (((bo.l) this.f5214d).a((xn.a) this.f5215e, (bo.i) this.f5216f, arrayList, true)) {
                                    kVar2 = ((bo.i) this.f5216f).f5793h;
                                    kotlin.jvm.internal.n.c(kVar2);
                                    this.f5219i = zVar;
                                    Socket socket2 = kVar.f5803d;
                                    kotlin.jvm.internal.n.c(socket2);
                                    yn.a.e(socket2);
                                } else {
                                    synchronized (kVar) {
                                        bo.l lVar2 = (bo.l) this.f5214d;
                                        lVar2.getClass();
                                        byte[] bArr3 = yn.a.f54560a;
                                        ((ConcurrentLinkedQueue) lVar2.f5821d).add(kVar);
                                        ((ao.c) lVar2.f5819b).c((ao.b) lVar2.f5820c, 0L);
                                        ((bo.i) this.f5216f).b(kVar);
                                        kVar2 = kVar;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            ((bo.i) this.f5216f).f5799o = null;
                            throw th3;
                        }
                        arrayList = null;
                        kVar = new bo.k((bo.l) this.f5214d, zVar);
                        ((bo.i) this.f5216f).f5799o = kVar;
                    }
                } else if (socketL != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                this.f5211a = 0;
                this.f5212b = 0;
                this.f5213c = 0;
                if (((bo.l) this.f5214d).a((xn.a) this.f5215e, (bo.i) this.f5216f, null, false)) {
                    kVar2 = ((bo.i) this.f5216f).f5793h;
                    kotlin.jvm.internal.n.c(kVar2);
                } else {
                    zVar = (xn.z) this.f5219i;
                    if (zVar != null) {
                        this.f5219i = null;
                    } else {
                        qVar = (bc.q) this.f5217g;
                        if (qVar == null) {
                        }
                        kj1Var = (kj1) this.f5218h;
                        if (kj1Var == null) {
                            xn.a aVar3 = (xn.a) this.f5215e;
                            bo.i iVar2 = (bo.i) this.f5216f;
                            kj1Var = new kj1(aVar3, iVar2.f5786a.f54051z, iVar2);
                            this.f5218h = kj1Var;
                        }
                        if (kj1Var.p()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (kj1Var.f16462a < ((List) kj1Var.f16465d).size()) {
                            aVar = (xn.a) kj1Var.f16463b;
                            if (kj1Var.f16462a < ((List) kj1Var.f16465d).size()) {
                                throw new SocketException("No route to " + aVar.f53917h.f53992d + "; exhausted proxy configurations: " + ((List) kj1Var.f16465d));
                            }
                            List list2 = (List) kj1Var.f16465d;
                            int i16 = kj1Var.f16462a;
                            kj1Var.f16462a = i16 + 1;
                            proxy = (Proxy) list2.get(i16);
                            ArrayList arrayList4 = new ArrayList();
                            kj1Var.f16466e = arrayList4;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                xn.m mVar2 = aVar.f53917h;
                                hostName = mVar2.f53992d;
                                port = mVar2.f53993e;
                            } else {
                                xn.m mVar3 = aVar.f53917h;
                                hostName = mVar3.f53992d;
                                port = mVar3.f53993e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            xj.t.a0((ArrayList) kj1Var.f16467f, arrayList);
                            ((ArrayList) kj1Var.f16467f).clear();
                        }
                        qVar2 = new bc.q(arrayList);
                        this.f5217g = qVar2;
                        if (!((bo.i) this.f5216f).f5797m) {
                            throw new IOException("Canceled");
                        }
                        if (((bo.l) this.f5214d).a((xn.a) this.f5215e, (bo.i) this.f5216f, arrayList, false)) {
                            kVar2 = ((bo.i) this.f5216f).f5793h;
                            kotlin.jvm.internal.n.c(kVar2);
                        } else {
                            if (qVar2.b()) {
                                throw new NoSuchElementException();
                            }
                            int i17 = qVar2.f5574b;
                            qVar2.f5574b = i17 + 1;
                            zVar = (xn.z) arrayList.get(i17);
                            kVar = new bo.k((bo.l) this.f5214d, zVar);
                            ((bo.i) this.f5216f).f5799o = kVar;
                            kVar.c(i10, i11, i12, z10, (bo.i) this.f5216f);
                            ((bo.i) this.f5216f).f5799o = null;
                            cVar = ((bo.i) this.f5216f).f5786a.f54051z;
                            synchronized (cVar) {
                                ((LinkedHashSet) cVar.f47386b).remove(zVar);
                                if (((bo.l) this.f5214d).a((xn.a) this.f5215e, (bo.i) this.f5216f, arrayList, true)) {
                                    kVar2 = ((bo.i) this.f5216f).f5793h;
                                    kotlin.jvm.internal.n.c(kVar2);
                                    this.f5219i = zVar;
                                    Socket socket3 = kVar.f5803d;
                                    kotlin.jvm.internal.n.c(socket3);
                                    yn.a.e(socket3);
                                } else {
                                    synchronized (kVar) {
                                        bo.l lVar3 = (bo.l) this.f5214d;
                                        lVar3.getClass();
                                        byte[] bArr4 = yn.a.f54560a;
                                        ((ConcurrentLinkedQueue) lVar3.f5821d).add(kVar);
                                        ((ao.c) lVar3.f5819b).c((ao.b) lVar3.f5820c, 0L);
                                        ((bo.i) this.f5216f).b(kVar);
                                        kVar2 = kVar;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    kVar = new bo.k((bo.l) this.f5214d, zVar);
                    ((bo.i) this.f5216f).f5799o = kVar;
                    kVar.c(i10, i11, i12, z10, (bo.i) this.f5216f);
                    ((bo.i) this.f5216f).f5799o = null;
                    cVar = ((bo.i) this.f5216f).f5786a.f54051z;
                    synchronized (cVar) {
                        ((LinkedHashSet) cVar.f47386b).remove(zVar);
                        if (((bo.l) this.f5214d).a((xn.a) this.f5215e, (bo.i) this.f5216f, arrayList, true)) {
                            kVar2 = ((bo.i) this.f5216f).f5793h;
                            kotlin.jvm.internal.n.c(kVar2);
                            this.f5219i = zVar;
                            Socket socket4 = kVar.f5803d;
                            kotlin.jvm.internal.n.c(socket4);
                            yn.a.e(socket4);
                        } else {
                            synchronized (kVar) {
                                bo.l lVar4 = (bo.l) this.f5214d;
                                lVar4.getClass();
                                byte[] bArr5 = yn.a.f54560a;
                                ((ConcurrentLinkedQueue) lVar4.f5821d).add(kVar);
                                ((ao.c) lVar4.f5819b).c((ao.b) lVar4.f5820c, 0L);
                                ((bo.i) this.f5216f).b(kVar);
                                kVar2 = kVar;
                            }
                        }
                    }
                }
            }
            if (kVar2.i(z11)) {
                return kVar2;
            }
            kVar2.k();
            if (((xn.z) this.f5219i) == null) {
                bc.q qVar4 = (bc.q) this.f5217g;
                if (qVar4 != null ? qVar4.b() : true) {
                    continue;
                } else {
                    kj1 kj1Var2 = (kj1) this.f5218h;
                    if (!(kj1Var2 != null ? kj1Var2.p() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public boolean d(xn.m url) {
        kotlin.jvm.internal.n.f(url, "url");
        xn.m mVar = ((xn.a) this.f5215e).f53917h;
        return url.f53993e == mVar.f53993e && kotlin.jvm.internal.n.a(url.f53992d, mVar.f53992d);
    }

    public void e(IOException e10) {
        kotlin.jvm.internal.n.f(e10, "e");
        this.f5219i = null;
        if ((e10 instanceof fo.a0) && ((fo.a0) e10).f41203a == 8) {
            this.f5211a++;
        } else if (e10 instanceof fo.a) {
            this.f5212b++;
        } else {
            this.f5213c++;
        }
    }

    public a(int i10, int i11, String str, String str2) {
        this.f5214d = str;
        this.f5211a = i10;
        this.f5215e = str2;
        this.f5212b = i11;
        this.f5219i = new HashMap();
        this.f5213c = -1;
    }
}
