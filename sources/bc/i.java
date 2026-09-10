package bc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import androidx.lifecycle.g0;
import b2.w;
import com.applovin.impl.ca;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.ads.ak;
import com.google.android.gms.internal.ads.bd;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.db1;
import com.google.android.gms.internal.ads.dd;
import com.google.android.gms.internal.ads.ec;
import com.google.android.gms.internal.ads.ed;
import com.google.android.gms.internal.ads.et1;
import com.google.android.gms.internal.ads.fc;
import com.google.android.gms.internal.ads.gc;
import com.google.android.gms.internal.ads.gd;
import com.google.android.gms.internal.ads.gk;
import com.google.android.gms.internal.ads.hc;
import com.google.android.gms.internal.ads.hk;
import com.google.android.gms.internal.ads.ic;
import com.google.android.gms.internal.ads.id;
import com.google.android.gms.internal.ads.il;
import com.google.android.gms.internal.ads.jc;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.lc;
import com.google.android.gms.internal.ads.lj1;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.m01;
import com.google.android.gms.internal.ads.mc;
import com.google.android.gms.internal.ads.ml;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.pc;
import com.google.android.gms.internal.ads.pj;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.qv0;
import com.google.android.gms.internal.ads.rb0;
import com.google.android.gms.internal.ads.rc;
import com.google.android.gms.internal.ads.rl0;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.so0;
import com.google.android.gms.internal.ads.tc;
import com.google.android.gms.internal.ads.tj;
import com.google.android.gms.internal.ads.uc;
import com.google.android.gms.internal.ads.uj;
import com.google.android.gms.internal.ads.v71;
import com.google.android.gms.internal.ads.vc;
import com.google.android.gms.internal.ads.vu0;
import com.google.android.gms.internal.ads.xj;
import com.google.android.gms.internal.ads.ya1;
import com.google.android.gms.internal.ads.yc;
import com.google.android.gms.internal.ads.yd1;
import com.google.android.gms.internal.ads.yj;
import com.google.android.gms.internal.ads.zc;
import com.google.android.gms.internal.ads.zj;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.y3;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import g6.a0;
import g6.d0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements l, yd1, qv0, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5553c;

    public i(int i10) {
        this.f5551a = i10;
        switch (i10) {
            case 8:
                this.f5553c = new Handler(Looper.getMainLooper(), new d0());
                break;
            default:
                q qVar = new q(2);
                s6 s6Var = new s6(22);
                vc vcVar = new vc(qc.f19022b, 0, new s6(false));
                vcVar.f21151d = s6Var;
                this.f5553c = new ed(qVar, vcVar);
                this.f5552b = false;
                break;
        }
    }

    @Override // androidx.lifecycle.g0
    public void A(Object obj) {
        this.f5552b = true;
        od.c cVar = (od.c) this.f5553c;
        cVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.f47386b;
        signInHubActivity.setResult(signInHubActivity.f11638k, signInHubActivity.l);
        signInHubActivity.finish();
    }

    @Override // bc.l
    public void a(k kVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f5553c;
        if (this.f5552b) {
            this.f5552b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b() {
        this.f5552b = false;
    }

    public void c(boolean z10) {
        if (this.f5552b) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f5552b = true;
        com.google.android.gms.common.api.internal.m mVar = (com.google.android.gms.common.api.internal.m) this.f5553c;
        int i10 = mVar.f11731c - 1;
        mVar.f11731c = i10;
        boolean z11 = z10 | mVar.f11730b;
        mVar.f11730b = z11;
        if (i10 != 0 || z11) {
            return;
        }
        ((v9.e) mVar.f11729a).G((KeyEvent) mVar.f11732d);
    }

    public void d(char c4) {
        w wVar = (w) this.f5553c;
        wVar.c(wVar.f5410b, 1);
        char[] cArr = (char[]) wVar.f5411c;
        int i10 = wVar.f5410b;
        wVar.f5410b = i10 + 1;
        cArr[i10] = c4;
    }

    public synchronized void e(a0 a0Var, boolean z10) {
        try {
            if (this.f5552b || z10) {
                ((Handler) this.f5553c).obtainMessage(1, a0Var).sendToTarget();
            } else {
                this.f5552b = true;
                a0Var.b();
                this.f5552b = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void h() throws ic {
        ed edVar = (ed) this.f5553c;
        boolean z10 = this.f5552b;
        String strA = pc.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
        if (z10) {
            return;
        }
        try {
            HashMap map = dd.f13496a;
            pb pbVar = new pb(4);
            pbVar.e(rc.f19519a, id.f(mc.f17389s));
            pbVar.e(rc.f19521b, s6.m(0L));
            pbVar.e(rc.f19523c, s6.m(1L));
            pbVar.e(rc.f19525d, s6.m(2L));
            pbVar.e(rc.f19527e, s6.m(3L));
            pbVar.e(rc.f19529f, s6.m(4L));
            pbVar.e(rc.f19531g, s6.m(7L));
            pbVar.e(rc.f19532h, s6.m(-1L));
            pbVar.e(rc.f19534i, s6.m(-2L));
            pbVar.e(rc.f19536j, id.f(lc.f16848b));
            pbVar.e(rc.f19538k, id.f(lc.f16850d));
            pbVar.e(rc.l, id.f(lc.f16856j));
            pbVar.e(rc.f19541m, id.f(lc.f16857k));
            pbVar.e(rc.f19543n, id.f(lc.f16859n));
            pbVar.e(rc.f19545o, id.f(mc.f17384n));
            pbVar.e(rc.f19546p, id.f(lc.f16852f));
            pbVar.e(rc.f19547q, id.f(lc.f16853g));
            pbVar.e(rc.f19548r, id.f(lc.f16854h));
            pbVar.e(rc.f19549s, id.f(lc.f16855i));
            pbVar.e(rc.f19550t, id.f(mc.f17379h));
            pbVar.e(rc.f19551u, id.f(mc.f17381j));
            pbVar.e(rc.f19553w, id.f(lc.f16860o));
            pbVar.e(rc.f19554x, id.f(lc.f16861p));
            pbVar.e(rc.f19555y, id.f(lc.f16864s));
            pbVar.e(rc.f19556z, id.f(lc.f16865t));
            pbVar.e(rc.A, id.f(lc.f16866u));
            pbVar.e(rc.B, id.f(lc.f16867v));
            pbVar.e(rc.C, id.f(mc.f17373b));
            pbVar.e(rc.D, id.f(mc.f17375d));
            pbVar.e(rc.E, id.f(mc.f17376e));
            pbVar.e(rc.F, id.f(mc.f17377f));
            pbVar.e(rc.G, id.f(mc.f17382k));
            pbVar.e(rc.H, id.f(mc.l));
            pbVar.e(rc.I, id.f(mc.f17386p));
            pbVar.e(rc.J, id.f(mc.f17387q));
            pbVar.e(rc.K, id.f(mc.f17391u));
            pbVar.e(rc.L, id.f(mc.f17392v));
            pbVar.e(rc.M, id.f(oc.f18217b));
            pbVar.e(rc.N, id.f(oc.f18219d));
            pbVar.e(rc.U, id.f(oc.f18220e));
            pbVar.e(rc.O, id.f(oc.f18225j));
            pbVar.e(rc.P, id.f(oc.f18226k));
            pbVar.e(rc.Q, id.f(oc.f18228n));
            pbVar.e(rc.R, id.f(oc.f18231q));
            pbVar.e(rc.S, id.f(lc.f16862q));
            pbVar.e(rc.T, id.f(oc.l));
            pbVar.e(rc.V, id.f(lc.l));
            pbVar.e(rc.W, id.f(oc.f18222g));
            pbVar.e(rc.X, id.f(oc.f18223h));
            pbVar.e(rc.f19552v, id.f(mc.f17380i));
            pbVar.e(rc.Y, id.f(oc.f18230p));
            pbVar.e(rc.Z, id.f(mc.f17383m));
            pbVar.e(rc.f19520a0, id.f(oc.f18229o));
            pbVar.e(rc.f19522b0, id.f(mc.f17374c));
            pbVar.e(rc.f19524c0, id.f(oc.f18218c));
            pbVar.e(rc.f19526d0, id.f(lc.f16863r));
            pbVar.e(rc.f19528e0, id.f(oc.f18227m));
            pbVar.e(rc.f19530f0, id.f(lc.f16851e));
            pbVar.e(rc.g0, id.f(oc.f18221f));
            pbVar.e(rc.f19533h0, id.f(mc.f17390t));
            pbVar.e(rc.f19535i0, id.f(lc.f16849c));
            pbVar.e(rc.f19537j0, id.f(oc.f18224i));
            pbVar.e(rc.f19539k0, id.f(mc.f17385o));
            pbVar.e(rc.f19540l0, id.f(lc.f16858m));
            pbVar.e(rc.f19542m0, id.f(mc.f17388r));
            pbVar.e(rc.f19544n0, id.f(mc.f17378g));
            db1 db1VarP = pbVar.p(true);
            for (long j10 = -1; j10 >= -82; j10--) {
                rc rcVar = (rc) map.get(Long.valueOf(j10));
                if (rcVar == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 36);
                    sb2.append(strA);
                    sb2.append(j10);
                    throw new aa.b(sb2.toString(), false);
                }
                edVar.f13933a.e((id) db1VarP.get(rcVar));
            }
            for (int i10 = 82; i10 < 1159; i10++) {
                edVar.f13933a.e(id.a(null));
            }
            this.f5552b = true;
        } catch (bd e10) {
            throw new ic(hc.f15247b, e10);
        }
    }

    public void i(y3 y3Var) {
        if (this.f5552b) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((nf) this.f5553c).y(new o8.a(y3Var, o8.d.f47211a, null), new r1.q(4));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    public Object j(Optional optional) throws fc, ic {
        long j10;
        gc gcVar;
        Object objOf;
        long j11;
        ed edVar = (ed) this.f5553c;
        try {
            try {
                long j12 = 2;
                if (this.f5552b) {
                    j10 = 2;
                } else {
                    String strA = pc.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
                    try {
                        HashMap map = dd.f13496a;
                        pb pbVar = new pb(7, false);
                        pbVar.e(rc.f19519a, id.f(mc.f17389s));
                        pbVar.e(rc.f19521b, s6.m(0L));
                        pbVar.e(rc.f19523c, s6.m(1L));
                        pbVar.e(rc.f19525d, s6.m(2L));
                        pbVar.e(rc.f19527e, s6.m(3L));
                        pbVar.e(rc.f19529f, s6.m(4L));
                        pbVar.e(rc.f19531g, s6.m(7L));
                        pbVar.e(rc.f19532h, s6.m(-1L));
                        pbVar.e(rc.f19534i, s6.m(-2L));
                        pbVar.e(rc.f19536j, id.f(lc.f16848b));
                        pbVar.e(rc.f19538k, id.f(lc.f16850d));
                        pbVar.e(rc.l, id.f(lc.f16856j));
                        pbVar.e(rc.f19541m, id.f(lc.f16857k));
                        pbVar.e(rc.f19543n, id.f(lc.f16859n));
                        pbVar.e(rc.f19545o, id.f(mc.f17384n));
                        pbVar.e(rc.f19546p, id.f(lc.f16852f));
                        pbVar.e(rc.f19547q, id.f(lc.f16853g));
                        pbVar.e(rc.f19548r, id.f(lc.f16854h));
                        pbVar.e(rc.f19549s, id.f(lc.f16855i));
                        pbVar.e(rc.f19550t, id.f(mc.f17379h));
                        pbVar.e(rc.f19551u, id.f(mc.f17381j));
                        pbVar.e(rc.f19553w, id.f(lc.f16860o));
                        pbVar.e(rc.f19554x, id.f(lc.f16861p));
                        pbVar.e(rc.f19555y, id.f(lc.f16864s));
                        pbVar.e(rc.f19556z, id.f(lc.f16865t));
                        pbVar.e(rc.A, id.f(lc.f16866u));
                        pbVar.e(rc.B, id.f(lc.f16867v));
                        pbVar.e(rc.C, id.f(mc.f17373b));
                        pbVar.e(rc.D, id.f(mc.f17375d));
                        pbVar.e(rc.E, id.f(mc.f17376e));
                        pbVar.e(rc.F, id.f(mc.f17377f));
                        pbVar.e(rc.G, id.f(mc.f17382k));
                        pbVar.e(rc.H, id.f(mc.l));
                        pbVar.e(rc.I, id.f(mc.f17386p));
                        pbVar.e(rc.J, id.f(mc.f17387q));
                        pbVar.e(rc.K, id.f(mc.f17391u));
                        pbVar.e(rc.L, id.f(mc.f17392v));
                        pbVar.e(rc.M, id.f(oc.f18217b));
                        pbVar.e(rc.N, id.f(oc.f18219d));
                        pbVar.e(rc.U, id.f(oc.f18220e));
                        pbVar.e(rc.O, id.f(oc.f18225j));
                        pbVar.e(rc.P, id.f(oc.f18226k));
                        pbVar.e(rc.Q, id.f(oc.f18228n));
                        pbVar.e(rc.R, id.f(oc.f18231q));
                        pbVar.e(rc.S, id.f(lc.f16862q));
                        pbVar.e(rc.T, id.f(oc.l));
                        pbVar.e(rc.V, id.f(lc.l));
                        pbVar.e(rc.W, id.f(oc.f18222g));
                        pbVar.e(rc.X, id.f(oc.f18223h));
                        pbVar.e(rc.f19552v, id.f(mc.f17380i));
                        pbVar.e(rc.Y, id.f(oc.f18230p));
                        pbVar.e(rc.Z, id.f(mc.f17383m));
                        pbVar.e(rc.f19520a0, id.f(oc.f18229o));
                        pbVar.e(rc.f19522b0, id.f(mc.f17374c));
                        pbVar.e(rc.f19524c0, id.f(oc.f18218c));
                        pbVar.e(rc.f19526d0, id.f(lc.f16863r));
                        pbVar.e(rc.f19528e0, id.f(oc.f18227m));
                        pbVar.e(rc.f19530f0, id.f(lc.f16851e));
                        pbVar.e(rc.g0, id.f(oc.f18221f));
                        pbVar.e(rc.f19533h0, id.f(mc.f17390t));
                        pbVar.e(rc.f19535i0, id.f(lc.f16849c));
                        pbVar.e(rc.f19537j0, id.f(oc.f18224i));
                        pbVar.e(rc.f19539k0, id.f(mc.f17385o));
                        pbVar.e(rc.f19540l0, id.f(lc.f16858m));
                        pbVar.e(rc.f19542m0, id.f(mc.f17388r));
                        pbVar.e(rc.f19544n0, id.f(mc.f17378g));
                        db1 db1VarM = pbVar.m();
                        long j13 = -1;
                        while (j13 >= -82) {
                            long j14 = j12;
                            rc rcVar = (rc) map.get(Long.valueOf(j13));
                            if (rcVar == null) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(j13).length() + 36);
                                sb2.append(strA);
                                sb2.append(j13);
                                throw new aa.b(sb2.toString(), 3);
                            }
                            edVar.f13933a.e((id) db1VarM.get(rcVar));
                            j13--;
                            j12 = j14;
                        }
                        j10 = j12;
                        for (int i10 = 82; i10 < 1159; i10++) {
                            edVar.f13933a.e(id.a(null));
                        }
                        this.f5552b = true;
                    } catch (bd e10) {
                        throw new ic(hc.f15247b, e10);
                    }
                }
                vc vcVar = edVar.f13935c;
                try {
                    vc vcVar2 = edVar.f13935c;
                    vcVar.b(0L);
                    vcVar.f21150c = new s6(21);
                    String strA2 = pc.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo");
                    String strA3 = pc.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=");
                    try {
                        int iF = vcVar2.f();
                        int i11 = ((iF & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16) >> 16;
                        int i12 = (((iF >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16) >> 16;
                        if (i11 != -14426) {
                            throw new fc(strA2.concat(String.format(pc.a("e1Hk+x0="), Short.valueOf((short) i11))));
                        }
                        if (i12 != 5) {
                            throw new fc(strA3.concat(String.format(pc.a("e1Hk+x0="), Short.valueOf((short) i12))));
                        }
                        String strA4 = pc.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1");
                        try {
                            int iF2 = vcVar2.f();
                            if (iF2 != 1182321202) {
                                throw new fc(strA4.concat(String.format(pc.a("e1Hk9x0="), Integer.valueOf(iF2))));
                            }
                            try {
                                int[] iArr = {vcVar2.f()};
                                int[] iArr2 = ec.f13929a;
                                s6 s6Var = (s6) vcVar2.f21151d;
                                int i13 = iArr[0];
                                s6Var.getClass();
                                vcVar2.f21150c = new pb(new w(i13, 3, iArr2));
                                try {
                                    vcVar2.b(96L);
                                    ya1 ya1Var = jc.f16044a;
                                    Optional.empty();
                                    optional.isPresent();
                                    id idVarA = id.a(null);
                                    q qVar = edVar.f13933a;
                                    qVar.e(idVarA);
                                    qVar.e(id.a(null));
                                    so0 so0Var = edVar.f13934b;
                                    so0Var.d(0L, 0L, qVar.f5574b);
                                    while (!((ArrayDeque) so0Var.f20013b).isEmpty()) {
                                        vc vcVar3 = edVar.f13935c;
                                        long jC = vcVar3.c();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        objOf = edVar.f13933a.g(vcVar3.e()).p().apply(edVar);
                                                    } catch (Throwable unused) {
                                                        gcVar = gc.f14830w;
                                                        objOf = Optional.of(gcVar);
                                                    }
                                                } catch (gd unused2) {
                                                    gcVar = gc.f14812d;
                                                }
                                            } catch (ad unused3) {
                                                gcVar = gc.f14811c;
                                            }
                                        } catch (uc unused4) {
                                            gcVar = gc.f14829v;
                                        }
                                        Optional optional2 = (Optional) objOf;
                                        if (optional2.isPresent()) {
                                            if (!jc.f16044a.contains(optional2.get())) {
                                                throw new ic(hc.f15253h, (gc) optional2.get(), jC);
                                            }
                                            Object obj = optional2.get();
                                            long jC2 = edVar.f13935c.c();
                                            do {
                                                try {
                                                    j11 = edVar.f13934b.i().f21835c;
                                                    Optional optionalA = edVar.a();
                                                    if (optionalA.isPresent() && optionalA.get() == gc.f14831x) {
                                                        throw new ic(hc.f15253h, (gc) obj, jC2);
                                                    }
                                                    if (optionalA.isPresent()) {
                                                        throw new ic(hc.f15253h, (gc) optionalA.get(), jC2);
                                                    }
                                                } catch (zc unused5) {
                                                    throw new ic(hc.f15253h, (gc) obj, jC2);
                                                }
                                            } while (j11 != j10);
                                        }
                                    }
                                    try {
                                        q qVar2 = edVar.f13933a;
                                        id idVarF = qVar2.f();
                                        qVar2.f();
                                        return idVarF.h();
                                    } catch (ad e11) {
                                        throw new ic(hc.f15251f, e11);
                                    } catch (gd e12) {
                                        throw new ic(hc.f15252g, e12);
                                    }
                                } catch (tc | uc e13) {
                                    throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e13);
                                }
                            } catch (uc e14) {
                                throw new ic(hc.f15250e, e14);
                            }
                        } catch (uc e15) {
                            throw new fc(pc.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e15);
                        }
                    } catch (uc e16) {
                        throw new fc(pc.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e16);
                    }
                } catch (tc | uc e17) {
                    throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e17);
                }
            } catch (yc e18) {
                throw new ic(hc.f15249d, e18);
            }
        } catch (bd e19) {
            throw new ic(hc.f15248c, e19);
        }
    }

    public Object k(long j10, Optional optional) throws fc, ic {
        gc gcVar;
        Object objOf;
        long j11;
        ed edVar = (ed) this.f5553c;
        try {
            if (!this.f5552b) {
                h();
            }
            vc vcVar = edVar.f13935c;
            try {
                vc vcVar2 = edVar.f13935c;
                vcVar.b(0L);
                vcVar.f21150c = new s6(false);
                try {
                    int iF = vcVar2.f();
                    int i10 = ((iF & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16) >> 16;
                    int i11 = (((iF >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16) >> 16;
                    if (i10 != -14426) {
                        throw new fc(pc.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo").concat(String.format(pc.a("e1Hk+x0="), Short.valueOf((short) i10))));
                    }
                    if (i11 != 5) {
                        throw new fc(pc.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=").concat(String.format(pc.a("e1Hk+x0="), Short.valueOf((short) i11))));
                    }
                    int i12 = 9;
                    int[] iArr = {171029949, 1356422403, 1913211838, 215266853, 506454572, 1309457854, 56236614, 1696779465, 30245415};
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    int i15 = iArr[2];
                    int i16 = iArr[3];
                    int iG = (iArr[7] % 30245415) ^ ca.g((i14 & (~i13)) | i15, (i13 & i16) | iArr[4], iArr[5], iArr[6]);
                    try {
                        int iF2 = vcVar2.f();
                        if (iF2 != iG) {
                            throw new fc(pc.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1").concat(String.format(pc.a("e1Hk9x0="), Integer.valueOf(iF2))));
                        }
                        try {
                            int[] iArr2 = {vcVar2.f()};
                            int[] iArr3 = ec.f13929a;
                            s6 s6Var = (s6) vcVar2.f21151d;
                            int i17 = iArr2[0];
                            s6Var.getClass();
                            vcVar2.f21150c = new pb(new w(i17, 3, iArr3));
                            try {
                                vcVar2.b(j10);
                                ya1 ya1Var = jc.f16044a;
                                Optional.empty();
                                Object objA = true != optional.isPresent() ? id.a(null) : optional.get();
                                id idVarG = objA instanceof id ? (id) objA : id.g(objA);
                                q qVar = edVar.f13933a;
                                qVar.e(idVarG);
                                qVar.e(id.a(null));
                                so0 so0Var = edVar.f13934b;
                                so0Var.d(0L, 0L, qVar.f5574b);
                                while (!((ArrayDeque) so0Var.f20013b).isEmpty()) {
                                    vc vcVar3 = edVar.f13935c;
                                    long jC = vcVar3.c();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    objOf = edVar.f13933a.g(vcVar3.e()).p().apply(edVar);
                                                } catch (Throwable unused) {
                                                    gcVar = gc.f14830w;
                                                    objOf = Optional.of(gcVar);
                                                }
                                            } catch (gd unused2) {
                                                gcVar = gc.f14812d;
                                            }
                                        } catch (ad unused3) {
                                            gcVar = gc.f14811c;
                                        }
                                    } catch (uc unused4) {
                                        gcVar = gc.f14829v;
                                    }
                                    Optional optional2 = (Optional) objOf;
                                    if (optional2.isPresent()) {
                                        if (!jc.f16044a.contains(optional2.get())) {
                                            throw new ic(hc.f15253h, (gc) optional2.get(), jC);
                                        }
                                        Object obj = optional2.get();
                                        long[] jArr = new long[i12];
                                        // fill-array-data instruction
                                        jArr[0] = 1598171894;
                                        jArr[1] = 600979209;
                                        jArr[2] = 180618323;
                                        jArr[3] = 2704454472L;
                                        jArr[4] = 3601187955L;
                                        jArr[5] = 4055661621L;
                                        jArr[6] = 545343058;
                                        jArr[7] = 1815320763;
                                        jArr[8] = 988992210;
                                        long j12 = jArr[0];
                                        long j13 = jArr[1];
                                        long j14 = jArr[2];
                                        long j15 = jArr[3];
                                        long j16 = jArr[4];
                                        long j17 = jArr[5];
                                        long j18 = jArr[6];
                                        long j19 = jArr[7];
                                        so0 so0Var2 = so0Var;
                                        long j20 = (((((~j12) & j13) | j14) + ((j12 & j15) | j16)) - j17) + j18;
                                        long j21 = j19 % 988992210;
                                        long jC2 = edVar.f13935c.c();
                                        do {
                                            try {
                                                j11 = edVar.f13934b.i().f21835c;
                                                Optional optionalA = edVar.a();
                                                if (optionalA.isPresent() && optionalA.get() == gc.f14831x) {
                                                    throw new ic(hc.f15253h, (gc) obj, jC2);
                                                }
                                                if (optionalA.isPresent()) {
                                                    throw new ic(hc.f15253h, (gc) optionalA.get(), jC2);
                                                }
                                            } catch (zc unused5) {
                                                throw new ic(hc.f15253h, (gc) obj, jC2);
                                            }
                                        } while (j11 != (j20 ^ j21));
                                        so0Var = so0Var2;
                                        i12 = 9;
                                    }
                                }
                                try {
                                    q qVar2 = edVar.f13933a;
                                    id idVarF = qVar2.f();
                                    qVar2.f();
                                    return idVarF.h();
                                } catch (ad e10) {
                                    throw new ic(hc.f15251f, e10);
                                } catch (gd e11) {
                                    throw new ic(hc.f15252g, e11);
                                }
                            } catch (tc | uc e12) {
                                throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e12);
                            }
                        } catch (uc e13) {
                            throw new ic(hc.f15250e, e13);
                        }
                    } catch (uc e14) {
                        throw new fc(pc.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), (Throwable) e14);
                    }
                } catch (uc e15) {
                    throw new fc(pc.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), (Throwable) e15);
                }
            } catch (tc | uc e16) {
                throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e16);
            }
        } catch (bd e17) {
            throw new ic(hc.f15248c, e17);
        } catch (yc e18) {
            throw new ic(hc.f15249d, e18);
        }
    }

    public void l(long j10, String str) {
        new com.google.android.gms.internal.auth.r(this, str, Long.valueOf(j10), 0);
    }

    public com.google.android.gms.internal.auth.r m(String str, boolean z10) {
        return new com.google.android.gms.internal.auth.r(this, str, Boolean.valueOf(z10), 1);
    }

    public String toString() {
        switch (this.f5551a) {
            case 5:
                return ((od.c) this.f5553c).toString();
            case 12:
                return this.f5552b ? "FALL_THROUGH" : String.valueOf(this.f5553c);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        int i10 = zze.zza;
        zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        List listUnmodifiableList;
        List listAsList;
        ArrayList arrayList;
        Iterator it;
        tj tjVarZ;
        int i10;
        int i11;
        int i12;
        cl clVar;
        rl0 rl0Var = (rl0) this.f5553c;
        Bundle bundle = (Bundle) obj;
        if (((zzg) rl0Var.f18847a).zzx()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            arrayList = new ArrayList();
            it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        clVar = cl.BANNER;
                        break;
                    case "native":
                        clVar = cl.NATIVE_APP_INSTALL;
                        break;
                    case "rewarded":
                        clVar = cl.REWARD_BASED_VIDEO_AD;
                        break;
                    case "interstitial":
                        clVar = cl.INTERSTITIAL;
                        break;
                    default:
                        clVar = cl.AD_FORMAT_TYPE_UNSPECIFIED;
                        break;
                }
                arrayList.add(clVar);
            }
            zj zjVar = (zj) rl0.f19610h.get(rb0.b(rb0.b(bundle, X3.i.G), "network").getInt("active_network_state", -1), zj.UNSPECIFIED);
            tjVarZ = uj.z();
            i10 = bundle.getInt("cnt", -2);
            i11 = bundle.getInt("gnt", 0);
            if (i10 == -1) {
                rl0Var.f19615g = ll.ENUM_TRUE;
            } else {
                rl0Var.f19615g = ll.ENUM_FALSE;
                i12 = 2;
                if (i10 != 0) {
                    tjVarZ.b();
                    ((uj) tjVarZ.f19193b).A(2);
                } else if (i10 != 1) {
                    tjVarZ.b();
                    ((uj) tjVarZ.f19193b).A(1);
                } else {
                    tjVarZ.b();
                    ((uj) tjVarZ.f19193b).A(3);
                }
                switch (i11) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        i12 = 3;
                        break;
                    case 13:
                        i12 = 4;
                        break;
                    default:
                        i12 = 1;
                        break;
                }
                tjVarZ.b();
                ((uj) tjVarZ.f19193b).B(i12);
            }
            ((lj1) rl0Var.f18848b).i(new m01(this, this.f5552b, arrayList, (uj) tjVarZ.e(), zjVar));
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r2.equals("banner")) {
                        clVar = cl.BANNER;
                    } else {
                        clVar = cl.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case -1052618729:
                    if (!r2.equals(IronSourceConstants.EVENTS_NATIVE)) {
                        clVar = cl.NATIVE_APP_INSTALL;
                    } else {
                        clVar = cl.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case -239580146:
                    if (!r2.equals("rewarded")) {
                        clVar = cl.REWARD_BASED_VIDEO_AD;
                    } else {
                        clVar = cl.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case 604727084:
                    if (!r2.equals("interstitial")) {
                        clVar = cl.INTERSTITIAL;
                    } else {
                        clVar = cl.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                default:
                    clVar = cl.AD_FORMAT_TYPE_UNSPECIFIED;
                    break;
            }
            arrayList.add(clVar);
        }
        zj zjVar2 = (zj) rl0.f19610h.get(rb0.b(rb0.b(bundle, X3.i.G), "network").getInt("active_network_state", -1), zj.UNSPECIFIED);
        tjVarZ = uj.z();
        i10 = bundle.getInt("cnt", -2);
        i11 = bundle.getInt("gnt", 0);
        if (i10 == -1) {
            rl0Var.f19615g = ll.ENUM_TRUE;
        } else {
            rl0Var.f19615g = ll.ENUM_FALSE;
            i12 = 2;
            if (i10 != 0) {
                tjVarZ.b();
                ((uj) tjVarZ.f19193b).A(2);
            } else if (i10 != 1) {
                tjVarZ.b();
                ((uj) tjVarZ.f19193b).A(1);
            } else {
                tjVarZ.b();
                ((uj) tjVarZ.f19193b).A(3);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i12 = 3;
                    break;
                case 13:
                    i12 = 4;
                    break;
                default:
                    i12 = 1;
                    break;
            }
            tjVarZ.b();
            ((uj) tjVarZ.f19193b).B(i12);
        }
        ((lj1) rl0Var.f18848b).i(new m01(this, this.f5552b, arrayList, (uj) tjVarZ.e(), zjVar2));
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public Object zza(Object obj) {
        long j10;
        vu0 vu0Var = (vu0) this.f5553c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f5552b) {
            ((Context) vu0Var.f21274b).deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(xj.O(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (et1 e10) {
                int i10 = zze.zza;
                zzo.zzf("Unable to deserialize proto from offline signals database:");
                zzo.zzf(e10.getMessage());
            }
        }
        cursorQuery.close();
        Context context = (Context) vu0Var.f21274b;
        yj yjVarZ = ak.z();
        String packageName = context.getPackageName();
        yjVarZ.b();
        ((ak) yjVarZ.f19193b).E(packageName);
        String str = Build.MODEL;
        yjVarZ.b();
        ((ak) yjVarZ.f19193b).F();
        int iT = v71.t(sQLiteDatabase, 0);
        yjVarZ.b();
        ((ak) yjVarZ.f19193b).B(iT);
        yjVarZ.b();
        ((ak) yjVarZ.f19193b).A(arrayList);
        int iT2 = v71.t(sQLiteDatabase, 1);
        yjVarZ.b();
        ((ak) yjVarZ.f19193b).C(iT2);
        int iT3 = v71.t(sQLiteDatabase, 3);
        yjVarZ.b();
        ((ak) yjVarZ.f19193b).H(iT3);
        ((p9.b) zzt.zzk()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        yjVarZ.b();
        ((ak) yjVarZ.f19193b).D(jCurrentTimeMillis);
        Cursor cursorK = v71.K(sQLiteDatabase, 2);
        if (cursorK.getCount() > 0) {
            cursorK.moveToNext();
            j10 = cursorK.getLong(cursorK.getColumnIndexOrThrow(X3.i.X));
        } else {
            j10 = 0;
        }
        cursorK.close();
        yjVarZ.b();
        ((ak) yjVarZ.f19193b).G(j10);
        ak akVar = (ak) yjVarZ.e();
        int size = arrayList.size();
        long jM = 0;
        for (int i11 = 0; i11 < size; i11++) {
            xj xjVar = (xj) arrayList.get(i11);
            if (xjVar.N() == ll.ENUM_TRUE && xjVar.M() > jM) {
                jM = xjVar.M();
            }
        }
        if (jM != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(X3.i.X, Long.valueOf(jM));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        pj pjVar = (pj) vu0Var.f21275c;
        synchronized (pjVar) {
            if (pjVar.f18694c) {
                try {
                    ml mlVar = pjVar.f18693b;
                    mlVar.b();
                    ((nl) mlVar.f19193b).H(akVar);
                } catch (NullPointerException e11) {
                    zzt.zzh().d("AdMobClearcutLogger.modify", e11);
                }
            }
            VersionInfoParcel versionInfoParcel = (VersionInfoParcel) vu0Var.f21276d;
            gk gkVarA = hk.A();
            int i12 = versionInfoParcel.buddyApkVersion;
            gkVarA.b();
            ((hk) gkVarA.f19193b).B(i12);
            int i13 = versionInfoParcel.clientJarVersion;
            gkVarA.b();
            ((hk) gkVarA.f19193b).C(i13);
            int i14 = true != versionInfoParcel.isClientJar ? 2 : 0;
            gkVarA.b();
            ((hk) gkVarA.f19193b).z(i14);
            hk hkVar = (hk) gkVarA.e();
            synchronized (pjVar) {
                if (pjVar.f18694c) {
                    try {
                        ml mlVar2 = pjVar.f18693b;
                        il ilVar = (il) ((nl) mlVar2.f19193b).z().r();
                        ilVar.b();
                        ((jl) ilVar.f19193b).B(hkVar);
                        mlVar2.b();
                        ((nl) mlVar2.f19193b).F((jl) ilVar.e());
                    } catch (NullPointerException e12) {
                        zzt.zzh().d("AdMobClearcutLogger.modify", e12);
                    }
                }
            }
        }
        pjVar.b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        v71.P(sQLiteDatabase, "failed_requests");
        v71.P(sQLiteDatabase, "total_requests");
        v71.P(sQLiteDatabase, "completed_requests");
        return null;
    }

    public /* synthetic */ i(int i10, Object obj, boolean z10) {
        this.f5551a = i10;
        this.f5552b = z10;
        this.f5553c = obj;
    }

    public /* synthetic */ i(int i10, boolean z10) {
        this.f5551a = i10;
    }

    public i(Uri uri, boolean z10, boolean z11) {
        this.f5551a = 4;
        this.f5553c = uri;
        this.f5552b = z10;
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.f5551a = i10;
        this.f5553c = obj;
        this.f5552b = true;
    }

    public i(com.google.android.gms.common.api.internal.m mVar) {
        this.f5551a = 10;
        this.f5553c = mVar;
        this.f5552b = false;
    }

    public i(g9.d dVar, od.c cVar) {
        this.f5551a = 5;
        this.f5552b = false;
        this.f5553c = cVar;
    }

    public void f() {
    }

    public void g() {
    }
}
