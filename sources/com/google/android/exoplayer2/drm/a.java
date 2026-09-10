package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.WidevineUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3384eq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3472fq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3560gq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4038mJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4147nc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2295As;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2678Pm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2756Sm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2863Wp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3031aq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3196ck;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3278dg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3491g4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3877kY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5231zs;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HandlerC2652Om;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HandlerC2704Qm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2287Ak;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2889Xp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC2928Zc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wm0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements InterfaceC2889Xp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f801a;
    public final e b;
    public final C3491g4 c;
    public final Wm0 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final C3196ck i;
    public final G7 j;
    public final WU k;
    public final C3877kY l;
    public final UUID m;
    public final HandlerC2704Qm n;
    public int o;
    public int p;
    public HandlerThread q;
    public HandlerC2652Om r;
    public InterfaceC2287Ak s;
    public C2863Wp t;
    public byte[] u;
    public byte[] v;
    public C5231zs w;
    public C2295As x;

    public a(UUID uuid, e eVar, C3491g4 c3491g4, Wm0 wm0, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap map, C3877kY c3877kY, Looper looper, G7 g7, WU wu) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = c3491g4;
        this.d = wm0;
        this.b = eVar;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.v = bArr;
            this.f801a = null;
        } else {
            list.getClass();
            this.f801a = Collections.unmodifiableList(list);
        }
        this.h = map;
        this.l = c3877kY;
        this.i = new C3196ck();
        this.j = g7;
        this.k = wu;
        this.o = 2;
        this.n = new HandlerC2704Qm(this, looper);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2889Xp
    public final UUID a() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x010c  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2889Xp
    public final void b(C3031aq c3031aq) {
        b bVar;
        C3491g4 c3491g4;
        b bVar2;
        int i = this.p;
        if (i <= 0) {
            AbstractC4038mJ.c();
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.o = 0;
            HandlerC2704Qm handlerC2704Qm = this.n;
            int i3 = Ug0.f3833a;
            handlerC2704Qm.removeCallbacksAndMessages(null);
            HandlerC2652Om handlerC2652Om = this.r;
            synchronized (handlerC2652Om) {
                handlerC2652Om.removeCallbacksAndMessages(null);
                handlerC2652Om.f3521a = true;
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.w = null;
            this.x = null;
            byte[] bArr = this.u;
            if (bArr != null) {
                this.b.closeSession(bArr);
                this.u = null;
            }
        }
        if (c3031aq != null) {
            this.i.b(c3031aq);
            if (this.i.a(c3031aq) == 0) {
                c3031aq.f();
            }
        }
        Wm0 wm0 = this.d;
        int i4 = this.p;
        if (i4 == 1) {
            b bVar3 = (b) wm0.b;
            if (bVar3.o > 0 && bVar3.k != C.TIME_UNSET) {
                bVar3.n.add(this);
                Handler handler = ((b) wm0.b).t;
                handler.getClass();
                handler.postAtTime(new RunnableC2928Zc(this, 9), this, SystemClock.uptimeMillis() + ((b) wm0.b).k);
            } else if (i4 == 0) {
                ((b) wm0.b).l.remove(this);
                bVar = (b) wm0.b;
                if (bVar.q == this) {
                    bVar.q = null;
                }
                if (bVar.r == this) {
                    bVar.r = null;
                }
                c3491g4 = bVar.h;
                ((Set) c3491g4.b).remove(this);
                if (((a) c3491g4.c) == this) {
                    c3491g4.c = null;
                    if (!((Set) c3491g4.b).isEmpty()) {
                        a aVar = (a) ((Set) c3491g4.b).iterator().next();
                        c3491g4.c = aVar;
                        C2295As provisionRequest = aVar.b.getProvisionRequest();
                        aVar.x = provisionRequest;
                        HandlerC2652Om handlerC2652Om2 = aVar.r;
                        int i5 = Ug0.f3833a;
                        provisionRequest.getClass();
                        handlerC2652Om2.getClass();
                        handlerC2652Om2.obtainMessage(0, new C2678Pm(FI.f3063a.getAndIncrement(), true, SystemClock.elapsedRealtime(), provisionRequest)).sendToTarget();
                    }
                }
                bVar2 = (b) wm0.b;
                if (bVar2.k != C.TIME_UNSET) {
                    Handler handler2 = bVar2.t;
                    handler2.getClass();
                    handler2.removeCallbacksAndMessages(this);
                    ((b) wm0.b).n.remove(this);
                }
            }
        } else if (i4 == 0) {
            ((b) wm0.b).l.remove(this);
            bVar = (b) wm0.b;
            if (bVar.q == this) {
                bVar.q = null;
            }
            if (bVar.r == this) {
                bVar.r = null;
            }
            c3491g4 = bVar.h;
            ((Set) c3491g4.b).remove(this);
            if (((a) c3491g4.c) == this) {
                c3491g4.c = null;
                if (!((Set) c3491g4.b).isEmpty()) {
                    a aVar2 = (a) ((Set) c3491g4.b).iterator().next();
                    c3491g4.c = aVar2;
                    C2295As provisionRequest2 = aVar2.b.getProvisionRequest();
                    aVar2.x = provisionRequest2;
                    HandlerC2652Om handlerC2652Om3 = aVar2.r;
                    int i6 = Ug0.f3833a;
                    provisionRequest2.getClass();
                    handlerC2652Om3.getClass();
                    handlerC2652Om3.obtainMessage(0, new C2678Pm(FI.f3063a.getAndIncrement(), true, SystemClock.elapsedRealtime(), provisionRequest2)).sendToTarget();
                }
            }
            bVar2 = (b) wm0.b;
            if (bVar2.k != C.TIME_UNSET) {
                Handler handler3 = bVar2.t;
                handler3.getClass();
                handler3.removeCallbacksAndMessages(this);
                ((b) wm0.b).n.remove(this);
            }
        }
        ((b) wm0.b).i();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2889Xp
    public final boolean c() {
        return this.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2889Xp
    public final void d(C3031aq c3031aq) {
        if (this.p < 0) {
            AbstractC4038mJ.c();
            this.p = 0;
        }
        if (c3031aq != null) {
            C3196ck c3196ck = this.i;
            synchronized (c3196ck.f4240a) {
                try {
                    ArrayList arrayList = new ArrayList(c3196ck.d);
                    arrayList.add(c3031aq);
                    c3196ck.d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) c3196ck.b.get(c3031aq);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c3196ck.c);
                        hashSet.add(c3031aq);
                        c3196ck.c = Collections.unmodifiableSet(hashSet);
                    }
                    c3196ck.b.put(c3031aq, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = this.p + 1;
        this.p = i;
        if (i == 1) {
            FW.s(this.o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new HandlerC2652Om(this, this.q.getLooper());
            if (k()) {
                g(true);
            }
        } else if (c3031aq != null && h() && this.i.a(c3031aq) == 1) {
            c3031aq.d(this.o);
        }
        Wm0 wm0 = this.d;
        b bVar = (b) wm0.b;
        if (bVar.k != C.TIME_UNSET) {
            bVar.n.remove(this);
            Handler handler = ((b) wm0.b).t;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2889Xp
    public final InterfaceC2287Ak e() {
        return this.s;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2889Xp
    public final boolean f(String str) {
        byte[] bArr = this.u;
        FW.t(bArr);
        return this.b.e(bArr, str);
    }

    public final void g(boolean z) {
        long j;
        Pair pair;
        long jMin;
        Set set;
        if (this.g) {
            return;
        }
        byte[] bArr = this.u;
        int i = Ug0.f3833a;
        int i2 = this.e;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.v.getClass();
                this.u.getClass();
                l(this.v, 3, z);
                return;
            }
            byte[] bArr2 = this.v;
            if (bArr2 != null) {
                try {
                    this.b.restoreKeys(bArr, bArr2);
                } catch (Exception e) {
                    i(1, e);
                    return;
                }
            }
            l(bArr, 2, z);
            return;
        }
        byte[] bArr3 = this.v;
        if (bArr3 == null) {
            l(bArr, 1, z);
            return;
        }
        if (this.o != 4) {
            try {
                this.b.restoreKeys(bArr, bArr3);
            } catch (Exception e2) {
                i(1, e2);
                return;
            }
        }
        if (AbstractC4147nc.d.equals(this.m)) {
            Map mapM = m();
            if (mapM == null) {
                pair = null;
            } else {
                long j2 = C.TIME_UNSET;
                try {
                    String str = (String) mapM.get(WidevineUtil.PROPERTY_LICENSE_DURATION_REMAINING);
                    j = str != null ? Long.parseLong(str) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j);
                try {
                    String str2 = (String) mapM.get(WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING);
                    if (str2 != null) {
                        j2 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j2));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (this.e == 0 && jMin <= 60) {
            AbstractC4038mJ.b();
            l(bArr, 2, z);
        } else {
            if (jMin <= 0) {
                i(2, new CG());
                return;
            }
            this.o = 4;
            C3196ck c3196ck = this.i;
            synchronized (c3196ck.f4240a) {
                set = c3196ck.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C3031aq) it.next()).c();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2889Xp
    public final C2863Wp getError() {
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2889Xp
    public final int getState() {
        return this.o;
    }

    public final boolean h() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    public final void i(int i, Exception exc) {
        int iB;
        Set set;
        int i2 = Ug0.f3833a;
        if (i2 >= 21 && AbstractC3472fq.a(exc)) {
            iB = AbstractC3472fq.b(exc);
        } else if (i2 >= 23 && AbstractC3560gq.a(exc)) {
            iB = 6006;
        } else if (i2 >= 18 && AbstractC3384eq.b(exc)) {
            iB = AdError.ICONVIEW_MISSING_ERROR_CODE;
        } else if (i2 >= 18 && AbstractC3384eq.a(exc)) {
            iB = 6007;
        } else if (exc instanceof C3278dg0) {
            iB = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        } else if (exc instanceof C2756Sm) {
            iB = AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        } else if (exc instanceof CG) {
            iB = 6008;
        } else if (i == 1) {
            iB = 6006;
        } else if (i == 2) {
            iB = 6004;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            iB = AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        this.t = new C2863Wp(exc, iB);
        AbstractC4038mJ.d("DRM session error", exc);
        C3196ck c3196ck = this.i;
        synchronized (c3196ck.f4240a) {
            set = c3196ck.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C3031aq) it.next()).e(exc);
        }
        if (this.o != 4) {
            this.o = 1;
        }
    }

    public final void j(Exception exc, boolean z) {
        if (!(exc instanceof NotProvisionedException)) {
            i(z ? 1 : 2, exc);
            return;
        }
        C3491g4 c3491g4 = this.c;
        ((Set) c3491g4.b).add(this);
        if (((a) c3491g4.c) != null) {
            return;
        }
        c3491g4.c = this;
        C2295As provisionRequest = this.b.getProvisionRequest();
        this.x = provisionRequest;
        HandlerC2652Om handlerC2652Om = this.r;
        int i = Ug0.f3833a;
        provisionRequest.getClass();
        handlerC2652Om.getClass();
        handlerC2652Om.obtainMessage(0, new C2678Pm(FI.f3063a.getAndIncrement(), true, SystemClock.elapsedRealtime(), provisionRequest)).sendToTarget();
    }

    public final boolean k() {
        Set set;
        if (h()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.b.openSession();
            this.u = bArrOpenSession;
            this.b.c(bArrOpenSession, this.k);
            this.s = this.b.d(this.u);
            this.o = 3;
            C3196ck c3196ck = this.i;
            synchronized (c3196ck.f4240a) {
                set = c3196ck.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C3031aq) it.next()).d(3);
            }
            this.u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            C3491g4 c3491g4 = this.c;
            ((Set) c3491g4.b).add(this);
            if (((a) c3491g4.c) == null) {
                c3491g4.c = this;
                C2295As provisionRequest = this.b.getProvisionRequest();
                this.x = provisionRequest;
                HandlerC2652Om handlerC2652Om = this.r;
                int i = Ug0.f3833a;
                provisionRequest.getClass();
                handlerC2652Om.getClass();
                handlerC2652Om.obtainMessage(0, new C2678Pm(FI.f3063a.getAndIncrement(), true, SystemClock.elapsedRealtime(), provisionRequest)).sendToTarget();
            }
            return false;
        } catch (Exception e) {
            i(1, e);
            return false;
        }
    }

    public final void l(byte[] bArr, int i, boolean z) {
        try {
            C5231zs c5231zsF = this.b.f(bArr, this.f801a, i, this.h);
            this.w = c5231zsF;
            HandlerC2652Om handlerC2652Om = this.r;
            int i2 = Ug0.f3833a;
            c5231zsF.getClass();
            handlerC2652Om.getClass();
            handlerC2652Om.obtainMessage(1, new C2678Pm(FI.f3063a.getAndIncrement(), z, SystemClock.elapsedRealtime(), c5231zsF)).sendToTarget();
        } catch (Exception e) {
            j(e, true);
        }
    }

    public final Map m() {
        byte[] bArr = this.u;
        if (bArr == null) {
            return null;
        }
        return this.b.queryKeyStatus(bArr);
    }
}
