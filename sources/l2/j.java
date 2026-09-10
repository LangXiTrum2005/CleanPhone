package l2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.g1;
import com.google.android.gms.internal.ads.ht0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import oa.f0;
import oa.j0;
import oa.n1;
import ta.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f44896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i1.p f44897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f44898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f44899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f44901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f44902g;

    public j(o oVar, Context context) {
        this.f44902g = oVar;
        l1.y.I(context);
        f0 f0Var = j0.f47265b;
        this.f44896a = n1.f47281e;
        this.f44899d = C.TIME_UNSET;
        this.f44901f = o.f44905r;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042 A[Catch: i -> 0x003d, TryCatch #0 {i -> 0x003d, blocks: (B:14:0x002b, B:17:0x0033, B:20:0x003a, B:25:0x0042, B:27:0x0046, B:38:0x0060, B:39:0x0063, B:32:0x0051), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0051 A[Catch: i -> 0x003d, TryCatch #0 {i -> 0x003d, blocks: (B:14:0x002b, B:17:0x0033, B:20:0x003a, B:25:0x0042, B:27:0x0046, B:38:0x0060, B:39:0x0063, B:32:0x0051), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060 A[Catch: i -> 0x003d, TryCatch #0 {i -> 0x003d, blocks: (B:14:0x002b, B:17:0x0033, B:20:0x003a, B:25:0x0042, B:27:0x0046, B:38:0x0060, B:39:0x0063, B:32:0x0051), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0063 A[Catch: i -> 0x003d, TRY_LEAVE, TryCatch #0 {i -> 0x003d, blocks: (B:14:0x002b, B:17:0x0033, B:20:0x003a, B:25:0x0042, B:27:0x0046, B:38:0x0060, B:39:0x0063, B:32:0x0051), top: B:44:0x002b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x0063, please report this as an issue */
    @Override // l2.z
    public final boolean a(i1.p pVar) throws y {
        boolean zL = true;
        go.k.t(!false);
        o oVar = this.f44902g;
        go.k.t(oVar.f44918n == 0);
        i1.h hVar = pVar.D;
        if (hVar == null || !hVar.d()) {
            hVar = i1.h.f42547h;
        }
        int i10 = hVar.f42550c;
        if (i10 == 7) {
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 34 || i11 < 33 || !l1.a.l("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    if (i10 == 6) {
                        if (Build.VERSION.SDK_INT >= 33 || !l1.a.l("EGL_EXT_gl_colorspace_bt2020_pq")) {
                            zL = false;
                        }
                    } else if (i10 == 7) {
                        zL = l1.a.l("EGL_EXT_gl_colorspace_bt2020_hlg");
                    }
                    if (zL) {
                        Locale locale = Locale.US;
                        l1.a.s("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
                        i1.h hVar2 = i1.h.f42547h;
                    } else if (i10 != 2 || i10 == 10) {
                        i1.h hVar3 = i1.h.f42547h;
                    }
                }
            } catch (l1.i e10) {
                throw new y(e10, pVar);
            }
        } else {
            if (i10 == 6) {
                if (Build.VERSION.SDK_INT >= 33) {
                    zL = false;
                } else {
                    zL = false;
                }
            } else if (i10 == 7) {
                zL = l1.a.l("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (zL) {
                Locale locale2 = Locale.US;
                l1.a.s("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
                i1.h hVar4 = i1.h.f42547h;
            } else if (i10 != 2) {
                i1.h hVar5 = i1.h.f42547h;
            } else {
                i1.h hVar6 = i1.h.f42547h;
            }
        }
        l1.u uVar = oVar.f44911f;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        oVar.f44916k = uVar.a(looperMyLooper, null);
        oVar.f44907b.a();
        throw null;
    }

    @Override // l2.z
    public final void b(long j10) {
        this.f44898c = j10;
    }

    @Override // l2.z
    public final void c() {
        long j10 = this.f44899d;
        o oVar = this.f44902g;
        if (oVar.f44919o >= j10) {
            oVar.f44910e.c();
            oVar.f44920p = true;
        }
    }

    @Override // l2.z
    public final void d(i1.p pVar, long j10, int i10, List list) {
        go.k.t(false);
        this.f44896a = j0.x(list);
        this.f44897b = pVar;
        this.f44902g.f44920p = false;
        i1.o oVarA = pVar.a();
        i1.h hVar = pVar.D;
        if (hVar == null || !hVar.d()) {
            hVar = i1.h.f42547h;
        }
        oVarA.C = hVar;
        oVarA.a();
        throw null;
    }

    @Override // l2.z
    public final void e(List list) {
        if (this.f44896a.equals(list)) {
            return;
        }
        this.f44896a = j0.x(list);
        i1.p pVar = this.f44897b;
        if (pVar == null) {
            return;
        }
        i1.o oVarA = pVar.a();
        i1.h hVar = pVar.D;
        if (hVar == null || !hVar.d()) {
            hVar = i1.h.f42547h;
        }
        oVarA.C = hVar;
        oVarA.a();
        throw null;
    }

    @Override // l2.z
    public final boolean f(boolean z10) {
        return this.f44902g.f44910e.f44846a.b(false);
    }

    @Override // l2.z
    public final boolean h(long j10, f fVar) {
        int i10;
        go.k.t(false);
        long j11 = j10 + this.f44898c;
        o oVar = this.f44902g;
        g1 g1Var = oVar.f44914i;
        long j12 = g1Var.f14649a;
        long j13 = j12 == C.TIME_UNSET ? -9223372036854775807L : (long) (((j11 - j12) * g1Var.f14651c) + g1Var.f14650b);
        if (j13 != C.TIME_UNSET) {
            long j14 = oVar.f44913h;
            if (j14 != C.TIME_UNSET && j13 < j14 && (i10 = this.f44900e) < 2) {
                this.f44900e = i10 + 1;
                h hVar = fVar.f44859c;
                y1.j jVar = fVar.f44857a;
                int i11 = fVar.f44858b;
                Trace.beginSection("dropVideoBuffer");
                jVar.t(i11);
                Trace.endSection();
                hVar.O0(0, 1);
                return true;
            }
        }
        int i12 = oVar.f44921q;
        if (i12 == -1 || i12 != 0) {
            return false;
        }
        throw null;
    }

    @Override // l2.z
    public final void i(Surface surface, l1.r rVar) {
        o oVar = this.f44902g;
        Pair pair = oVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((l1.r) oVar.l.second).equals(rVar)) {
            return;
        }
        oVar.l = Pair.create(surface, rVar);
        int i10 = rVar.f44817a;
    }

    @Override // l2.z
    public final boolean isEnded() {
        return false;
    }

    @Override // l2.z
    public final boolean isInitialized() {
        return false;
    }

    @Override // l2.z
    public final void j() {
        o oVar = this.f44902g;
        if (oVar.f44915j.f() == 0) {
            oVar.f44910e.j();
            return;
        }
        ht0 ht0Var = new ht0(1);
        if (oVar.f44915j.f() <= 0) {
            oVar.f44915j = ht0Var;
        } else {
            ((n) oVar.f44915j.c()).getClass();
            throw null;
        }
    }

    @Override // l2.z
    public final Surface k() {
        go.k.t(false);
        throw null;
    }

    @Override // l2.z
    public final void l() {
        o oVar = this.f44902g;
        if (oVar.f44909d) {
            oVar.f44910e.l();
        }
    }

    @Override // l2.z
    public final void m() {
        o oVar = this.f44902g;
        if (oVar.f44909d) {
            oVar.f44910e.m();
        }
    }

    @Override // l2.z
    public final void n(p pVar) {
        this.f44902g.f44910e.f44855j = pVar;
    }

    @Override // l2.z
    public final void o(int i10) {
        this.f44902g.f44910e.o(i10);
    }

    @Override // l2.z
    public final void p(float f10) {
        o oVar = this.f44902g;
        oVar.f44914i.c(f10);
        oVar.f44910e.p(f10);
    }

    @Override // l2.z
    public final void q() {
        int i10 = l1.r.f44816c.f44817a;
        this.f44902g.l = null;
    }

    @Override // l2.z
    public final void r(boolean z10) {
        this.f44899d = C.TIME_UNSET;
        o oVar = this.f44902g;
        c cVar = oVar.f44910e;
        if (oVar.f44918n == 1) {
            oVar.f44917m++;
            cVar.r(z10);
            while (oVar.f44915j.f() > 1) {
                oVar.f44915j.c();
            }
            if (oVar.f44915j.f() == 1) {
                ((n) oVar.f44915j.c()).getClass();
                throw null;
            }
            oVar.f44919o = C.TIME_UNSET;
            if (z10) {
                oVar.f44920p = false;
            }
            l1.w wVar = oVar.f44916k;
            wVar.getClass();
            wVar.c(new com.mbridge.msdk.config.component.info.provider.subprovider.f(oVar, 21));
        }
    }

    @Override // l2.z
    public final void release() {
        o oVar = this.f44902g;
        if (oVar.f44918n == 2) {
            return;
        }
        l1.w wVar = oVar.f44916k;
        if (wVar != null) {
            wVar.f44825a.removeCallbacksAndMessages(null);
        }
        oVar.l = null;
        oVar.f44918n = 2;
    }

    @Override // l2.z
    public final void render(long j10, long j11) throws y {
        this.f44902g.f44910e.render(j10 + this.f44898c, j11);
    }

    @Override // l2.z
    public final void s(e eVar) {
        this.f44901f = c0.f50592a;
    }

    @Override // l2.z
    public final void t(boolean z10) {
        o oVar = this.f44902g;
        if (oVar.f44909d) {
            oVar.f44910e.t(z10);
        }
    }

    @Override // l2.z
    public final void g() {
    }
}
