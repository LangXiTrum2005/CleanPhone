package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2388Eh extends AbstractC4860vh {
    public static final C3693iO u;
    public final ArrayList k;
    public final HashSet l;
    public Handler m;
    public final ArrayList n;
    public final IdentityHashMap o;
    public final HashMap p;
    public final HashSet q;
    public boolean r;
    public HashSet s;
    public D60 t;

    static {
        C3341eO c3341eO;
        WN wn = new WN();
        ZN zn = new ZN();
        List listEmptyList = Collections.emptyList();
        C3965lY c3965lY = C3965lY.e;
        C3429fO c3429fO = C3429fO.d;
        Uri uri = Uri.EMPTY;
        FW.s(zn.b == null || zn.f4068a != null);
        if (uri != null) {
            c3341eO = new C3341eO(uri, null, zn.f4068a != null ? new C2987aO(zn) : null, listEmptyList, null, c3965lY, null);
        } else {
            c3341eO = null;
        }
        u = new C3693iO("", new YN(wn), c3341eO, new C3164cO(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), C3955lO.I, c3429fO);
    }

    public C2388Eh(G9... g9Arr) {
        D60 d60 = new D60();
        for (G9 g9 : g9Arr) {
            g9.getClass();
        }
        this.t = d60.b.length > 0 ? d60.a() : d60;
        this.o = new IdentityHashMap();
        this.p = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.n = new ArrayList();
        this.s = new HashSet();
        this.l = new HashSet();
        this.q = new HashSet();
        List listAsList = Arrays.asList(g9Arr);
        synchronized (this) {
            D(arrayList.size(), listAsList);
        }
    }

    public final synchronized void A(int i, G9 g9) {
        D(i, Collections.singletonList(g9));
    }

    public final synchronized void B(G9 g9) {
        A(this.k.size(), g9);
    }

    public final void C(int i, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C2336Ch c2336Ch = (C2336Ch) it.next();
            int i2 = i + 1;
            ArrayList arrayList = this.n;
            if (i > 0) {
                C2336Ch c2336Ch2 = (C2336Ch) arrayList.get(i - 1);
                int iP = c2336Ch2.f2934a.o.e.p() + c2336Ch2.e;
                c2336Ch.d = i;
                c2336Ch.e = iP;
                c2336Ch.f = false;
                c2336Ch.c.clear();
            } else {
                c2336Ch.d = i;
                c2336Ch.e = 0;
                c2336Ch.f = false;
                c2336Ch.c.clear();
            }
            E(i, 1, c2336Ch.f2934a.o.e.p());
            arrayList.add(i, c2336Ch);
            this.p.put(c2336Ch.b, c2336Ch);
            z(c2336Ch, c2336Ch.f2934a);
            if ((!this.b.isEmpty()) && this.o.isEmpty()) {
                this.q.add(c2336Ch);
            } else {
                C4772uh c4772uh = (C4772uh) this.h.get(c2336Ch);
                c4772uh.getClass();
                c4772uh.f5094a.f(c4772uh.b);
            }
            i = i2;
        }
    }

    public final void D(int i, List list) {
        Handler handler = this.m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((G9) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C2336Ch((G9) it2.next(), false));
        }
        this.k.addAll(i, arrayList);
        if (handler == null || list.isEmpty()) {
            return;
        }
        handler.obtainMessage(0, new C2362Dh(i, arrayList, null)).sendToTarget();
    }

    public final void E(int i, int i2, int i3) {
        while (true) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size()) {
                return;
            }
            C2336Ch c2336Ch = (C2336Ch) arrayList.get(i);
            c2336Ch.d += i2;
            c2336Ch.e += i3;
            i++;
        }
    }

    public final void F() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            C2336Ch c2336Ch = (C2336Ch) it.next();
            if (c2336Ch.c.isEmpty()) {
                C4772uh c4772uh = (C4772uh) this.h.get(c2336Ch);
                c4772uh.getClass();
                c4772uh.f5094a.f(c4772uh.b);
                it.remove();
            }
        }
    }

    public final synchronized void G(Set set) {
        Iterator it = set.iterator();
        if (it.hasNext()) {
            AbstractC2310Bh abstractC2310Bh = (AbstractC2310Bh) it.next();
            abstractC2310Bh.getClass();
            abstractC2310Bh.getClass();
            throw null;
        }
        this.l.removeAll(set);
    }

    public final synchronized C4920wM H() {
        return ((C2336Ch) this.k.get(1)).f2934a;
    }

    public final void I(AbstractC2310Bh abstractC2310Bh) {
        if (this.r) {
            return;
        }
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(4).sendToTarget();
        this.r = true;
    }

    public final void J() {
        this.r = false;
        HashSet hashSet = this.s;
        this.s = new HashSet();
        p(new C5212zh(this.n, this.t, false));
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(5, hashSet).sendToTarget();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final InterfaceC4395qO b(C5186zO c5186zO, C2833Vl c2833Vl, long j) {
        int i = AbstractC3832k.h;
        Pair pair = (Pair) c5186zO.f4977a;
        Object obj = pair.first;
        C5186zO c5186zOB = c5186zO.b(pair.second);
        C2336Ch c2336Ch = (C2336Ch) this.p.get(obj);
        if (c2336Ch == null) {
            c2336Ch = new C2336Ch(new C2284Ah(), false);
            c2336Ch.f = true;
            z(c2336Ch, c2336Ch.f2934a);
        }
        this.q.add(c2336Ch);
        C4772uh c4772uh = (C4772uh) this.h.get(c2336Ch);
        c4772uh.getClass();
        c4772uh.f5094a.h(c4772uh.b);
        c2336Ch.c.add(c5186zOB);
        C4656tM c4656tMB = c2336Ch.f2934a.b(c5186zOB, c2833Vl, j);
        this.o.put(c4656tMB, c2336Ch);
        F();
        return c4656tMB;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void g() {
        super.g();
        this.q.clear();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final synchronized Gc0 j() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new C5212zh(this.k, this.t.b.length != this.k.size() ? this.t.a().b(0, this.k.size()) : this.t, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final C3693iO k() {
        return u;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final boolean l() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final synchronized void o(Bd0 bd0) {
        try {
            this.j = bd0;
            this.i = Ug0.m(null);
            this.m = new Handler(new W9(this, 2));
            if (this.k.isEmpty()) {
                J();
            } else {
                this.t = this.t.b(0, this.k.size());
                C(0, this.k);
                I(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void q(InterfaceC4395qO interfaceC4395qO) {
        IdentityHashMap identityHashMap = this.o;
        C2336Ch c2336Ch = (C2336Ch) identityHashMap.remove(interfaceC4395qO);
        c2336Ch.getClass();
        c2336Ch.f2934a.q(interfaceC4395qO);
        ArrayList arrayList = c2336Ch.c;
        arrayList.remove(((C4656tM) interfaceC4395qO).f5032a);
        if (!identityHashMap.isEmpty()) {
            F();
        }
        if (c2336Ch.f && arrayList.isEmpty()) {
            this.q.remove(c2336Ch);
            C4772uh c4772uh = (C4772uh) this.h.remove(c2336Ch);
            c4772uh.getClass();
            G9 g9 = c4772uh.f5094a;
            g9.r(c4772uh.b);
            C3844k50 c3844k50 = c4772uh.c;
            g9.u(c3844k50);
            g9.t(c3844k50);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final synchronized void s() {
        try {
            super.s();
            this.n.clear();
            this.q.clear();
            this.p.clear();
            this.t = this.t.a();
            Handler handler = this.m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.m = null;
            }
            this.r = false;
            this.s.clear();
            G(this.l);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh
    public final C5186zO v(Object obj, C5186zO c5186zO) {
        C2336Ch c2336Ch = (C2336Ch) obj;
        for (int i = 0; i < c2336Ch.c.size(); i++) {
            if (((C5186zO) c2336Ch.c.get(i)).d == c5186zO.d) {
                Object obj2 = c2336Ch.b;
                int i2 = AbstractC3832k.h;
                return c5186zO.b(Pair.create(obj2, c5186zO.f4977a));
            }
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh
    public final int x(Object obj, int i) {
        return i + ((C2336Ch) obj).e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh
    public final void y(Object obj, G9 g9, Gc0 gc0) {
        C2336Ch c2336Ch = (C2336Ch) obj;
        int i = c2336Ch.d + 1;
        ArrayList arrayList = this.n;
        if (i < arrayList.size()) {
            int iP = gc0.p() - (((C2336Ch) arrayList.get(c2336Ch.d + 1)).e - c2336Ch.e);
            if (iP != 0) {
                E(c2336Ch.d + 1, 0, iP);
            }
        }
        I(null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void i() {
    }
}
