package l2;

import android.view.Surface;
import com.applovin.impl.da;
import com.google.android.gms.internal.ads.g1;
import com.google.android.gms.internal.ads.h1;
import com.google.android.gms.internal.ads.ht0;
import com.google.android.gms.internal.ads.l1;
import com.google.android.gms.internal.ads.m1;
import com.google.android.gms.internal.ads.ml0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import eb.d0;
import i1.z0;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import ta.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f44846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f44847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f44848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f44849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f44850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i1.p f44851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f44852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f44853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Executor f44854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f44855j;

    public c(q qVar, g1 g1Var, l1.u uVar) {
        this.f44846a = qVar;
        this.f44847b = g1Var;
        qVar.l = uVar;
        this.f44848c = new m1(new d0(this), qVar, g1Var);
        this.f44849d = new ArrayDeque();
        this.f44851f = new i1.p(new i1.o());
        this.f44852g = C.TIME_UNSET;
        this.f44853h = x.f44943a;
        this.f44854i = new da(2);
        this.f44855j = new a();
    }

    @Override // l2.z
    public final boolean a(i1.p pVar) {
        return true;
    }

    @Override // l2.z
    public final void b(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // l2.z
    public final void c() {
        m1 m1Var = this.f44848c;
        if (m1Var.f17192a == C.TIME_UNSET) {
            m1Var.f17192a = Long.MIN_VALUE;
            m1Var.f17193b = Long.MIN_VALUE;
        }
        m1Var.f17194c = m1Var.f17192a;
    }

    @Override // l2.z
    public final void d(i1.p pVar, long j10, int i10, List list) {
        go.k.t(list.isEmpty());
        int i11 = pVar.f42650u;
        int i12 = pVar.f42651v;
        i1.p pVar2 = this.f44851f;
        int i13 = pVar2.f42650u;
        m1 m1Var = this.f44848c;
        if (i11 != i13 || i12 != pVar2.f42651v) {
            ht0 ht0Var = (ht0) m1Var.f17199h;
            long j11 = m1Var.f17192a;
            ht0Var.a(j11 == C.TIME_UNSET ? 0L : j11 + 1, new z0(i11, i12));
        }
        float f10 = pVar.f42654y;
        if (f10 != this.f44851f.f42654y) {
            this.f44846a.f(f10);
        }
        this.f44851f = pVar;
        if (j10 != this.f44852g) {
            if (((ml0) m1Var.f17201j).f17472c == 0) {
                ((q) m1Var.f17197f).e(i10);
                m1Var.f17195d = j10;
            } else {
                ht0 ht0Var2 = (ht0) m1Var.f17200i;
                long j12 = m1Var.f17192a;
                ht0Var2.a(j12 == C.TIME_UNSET ? -4611686018427387904L : j12 + 1, Long.valueOf(j10));
            }
            this.f44852g = j10;
        }
    }

    @Override // l2.z
    public final void e(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // l2.z
    public final boolean f(boolean z10) {
        return this.f44846a.b(z10);
    }

    @Override // l2.z
    public final void g() {
        throw new UnsupportedOperationException();
    }

    @Override // l2.z
    public final boolean h(long j10, f fVar) {
        this.f44849d.add(fVar);
        m1 m1Var = this.f44848c;
        ml0 ml0Var = (ml0) m1Var.f17201j;
        int i10 = ml0Var.f17472c;
        long[] jArr = ml0Var.f17473d;
        if (i10 == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i11 = ml0Var.f17470a;
            int i12 = length2 - i11;
            System.arraycopy(jArr, i11, jArr2, 0, i12);
            System.arraycopy(ml0Var.f17473d, 0, jArr2, i12, i11);
            ml0Var.f17470a = 0;
            ml0Var.f17471b = ml0Var.f17472c - 1;
            ml0Var.f17473d = jArr2;
            ml0Var.f17474e = length - 1;
        }
        int i13 = (ml0Var.f17471b + 1) & ml0Var.f17474e;
        ml0Var.f17471b = i13;
        ml0Var.f17473d[i13] = j10;
        ml0Var.f17472c++;
        m1Var.f17192a = j10;
        m1Var.f17194c = C.TIME_UNSET;
        this.f44854i.execute(new com.mbridge.msdk.config.component.info.provider.subprovider.f(this, 20));
        return true;
    }

    @Override // l2.z
    public final void i(Surface surface, l1.r rVar) {
        this.f44850e = surface;
        this.f44846a.g(surface);
    }

    @Override // l2.z
    public final boolean isEnded() {
        m1 m1Var = this.f44848c;
        long j10 = m1Var.f17194c;
        return j10 != C.TIME_UNSET && m1Var.f17193b == j10;
    }

    @Override // l2.z
    public final boolean isInitialized() {
        return true;
    }

    @Override // l2.z
    public final void j() {
        q qVar = this.f44846a;
        if (qVar.f44926e == 0) {
            qVar.f44926e = 1;
        }
    }

    @Override // l2.z
    public final Surface k() {
        Surface surface = this.f44850e;
        surface.getClass();
        return surface;
    }

    @Override // l2.z
    public final void l() {
        this.f44847b.b();
        q qVar = this.f44846a;
        qVar.f44925d = false;
        qVar.f44930i = C.TIME_UNSET;
        l1 l1Var = qVar.f44923b;
        l1Var.f16628b = false;
        h1 h1Var = (h1) l1Var.f16644s;
        if (h1Var != null) {
            h1Var.f();
        }
        l1Var.a();
    }

    @Override // l2.z
    public final void m() {
        this.f44847b.b();
        this.f44846a.d();
    }

    @Override // l2.z
    public final void n(p pVar) {
        this.f44855j = pVar;
    }

    @Override // l2.z
    public final void o(int i10) {
        l1 l1Var = this.f44846a.f44923b;
        if (l1Var.f16634h == i10) {
            return;
        }
        l1Var.f16634h = i10;
        l1Var.d(true);
    }

    @Override // l2.z
    public final void p(float f10) {
        this.f44846a.h(f10);
    }

    @Override // l2.z
    public final void q() {
        this.f44850e = null;
        this.f44846a.g(null);
    }

    @Override // l2.z
    public final void r(boolean z10) {
        if (z10) {
            q qVar = this.f44846a;
            qVar.f44923b.b();
            qVar.f44929h = C.TIME_UNSET;
            qVar.f44927f = C.TIME_UNSET;
            qVar.f44926e = Math.min(qVar.f44926e, 1);
            qVar.f44930i = C.TIME_UNSET;
        }
        this.f44847b.b();
        m1 m1Var = this.f44848c;
        ht0 ht0Var = (ht0) m1Var.f17199h;
        ml0 ml0Var = (ml0) m1Var.f17201j;
        ml0Var.f17470a = 0;
        ml0Var.f17471b = -1;
        ml0Var.f17472c = 0;
        m1Var.f17192a = C.TIME_UNSET;
        m1Var.f17193b = C.TIME_UNSET;
        m1Var.f17194c = C.TIME_UNSET;
        ht0 ht0Var2 = (ht0) m1Var.f17200i;
        if (ht0Var2.f() > 0) {
            go.k.i(ht0Var2.f() > 0);
            while (ht0Var2.f() > 1) {
                ht0Var2.c();
            }
            Object objC = ht0Var2.c();
            objC.getClass();
            m1Var.f17195d = ((Long) objC).longValue();
        }
        if (ht0Var.f() > 0) {
            go.k.i(ht0Var.f() > 0);
            while (ht0Var.f() > 1) {
                ht0Var.c();
            }
            Object objC2 = ht0Var.c();
            objC2.getClass();
            ht0Var.a(0L, (z0) objC2);
        }
        this.f44849d.clear();
    }

    @Override // l2.z
    public final void render(long j10, long j11) throws y {
        try {
            this.f44848c.a(j10, j11);
        } catch (p1.h e10) {
            throw new y(e10, this.f44851f);
        }
    }

    @Override // l2.z
    public final void s(e eVar) {
        this.f44853h = eVar;
        this.f44854i = c0.f50592a;
    }

    @Override // l2.z
    public final void t(boolean z10) {
        this.f44846a.c(z10);
    }

    @Override // l2.z
    public final void release() {
    }
}
