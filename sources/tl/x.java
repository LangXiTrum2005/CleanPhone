package tl;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends zl.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q0 f51531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f51533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q0 f51534k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f51535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f51536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f51537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w0 f51538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f51539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f51540r;

    public static x f() {
        x xVar = new x();
        xVar.f51528e = 6;
        xVar.f51529f = 6;
        q0 q0Var = q0.f51409t;
        xVar.f51531h = q0Var;
        List list = Collections.EMPTY_LIST;
        xVar.f51533j = list;
        xVar.f51534k = q0Var;
        xVar.f51535m = list;
        xVar.f51536n = list;
        xVar.f51537o = list;
        xVar.f51538p = w0.f51519g;
        xVar.f51539q = list;
        xVar.f51540r = n.f51359e;
        return xVar;
    }

    @Override // zl.i
    public final zl.a a() {
        y yVarE = e();
        if (yVarE.isInitialized()) {
            return yVarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        y yVar = null;
        try {
            try {
                y.f51549v.getClass();
                g(new y(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                y yVar2 = (y) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    yVar = yVar2;
                    if (yVar != null) {
                        g(yVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (yVar != null) {
                g(yVar);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((y) nVar);
        return this;
    }

    public final Object clone() {
        x xVarF = f();
        xVarF.g(e());
        return xVarF;
    }

    public final y e() {
        y yVar = new y(this);
        int i10 = this.f51527d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        yVar.f51552d = this.f51528e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        yVar.f51553e = this.f51529f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        yVar.f51554f = this.f51530g;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        yVar.f51555g = this.f51531h;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        yVar.f51556h = this.f51532i;
        if ((i10 & 32) == 32) {
            this.f51533j = Collections.unmodifiableList(this.f51533j);
            this.f51527d &= -33;
        }
        yVar.f51557i = this.f51533j;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        yVar.f51558j = this.f51534k;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        yVar.f51559k = this.l;
        if ((this.f51527d & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            this.f51535m = Collections.unmodifiableList(this.f51535m);
            this.f51527d &= -257;
        }
        yVar.l = this.f51535m;
        if ((this.f51527d & 512) == 512) {
            this.f51536n = Collections.unmodifiableList(this.f51536n);
            this.f51527d &= -513;
        }
        yVar.f51560m = this.f51536n;
        if ((this.f51527d & 1024) == 1024) {
            this.f51537o = Collections.unmodifiableList(this.f51537o);
            this.f51527d &= -1025;
        }
        yVar.f51562o = this.f51537o;
        if ((i10 & com.ironsource.mediationsdk.metadata.a.f29616n) == 2048) {
            i11 |= 128;
        }
        yVar.f51563p = this.f51538p;
        if ((this.f51527d & 4096) == 4096) {
            this.f51539q = Collections.unmodifiableList(this.f51539q);
            this.f51527d &= -4097;
        }
        yVar.f51564q = this.f51539q;
        if ((i10 & Segment.SIZE) == 8192) {
            i11 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        yVar.f51565r = this.f51540r;
        yVar.f51551c = i11;
        return yVar;
    }

    public final void g(y yVar) {
        n nVar;
        w0 w0Var;
        q0 q0Var;
        q0 q0Var2;
        if (yVar == y.f51548u) {
            return;
        }
        int i10 = yVar.f51551c;
        if ((i10 & 1) == 1) {
            int i11 = yVar.f51552d;
            this.f51527d = 1 | this.f51527d;
            this.f51528e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = yVar.f51553e;
            this.f51527d = 2 | this.f51527d;
            this.f51529f = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = yVar.f51554f;
            this.f51527d = 4 | this.f51527d;
            this.f51530g = i13;
        }
        if ((i10 & 8) == 8) {
            q0 q0Var3 = yVar.f51555g;
            if ((this.f51527d & 8) != 8 || (q0Var2 = this.f51531h) == q0.f51409t) {
                this.f51531h = q0Var3;
            } else {
                p0 p0VarU = q0.u(q0Var2);
                p0VarU.g(q0Var3);
                this.f51531h = p0VarU.e();
            }
            this.f51527d |= 8;
        }
        if ((yVar.f51551c & 16) == 16) {
            int i14 = yVar.f51556h;
            this.f51527d = 16 | this.f51527d;
            this.f51532i = i14;
        }
        if (!yVar.f51557i.isEmpty()) {
            if (this.f51533j.isEmpty()) {
                this.f51533j = yVar.f51557i;
                this.f51527d &= -33;
            } else {
                if ((this.f51527d & 32) != 32) {
                    this.f51533j = new ArrayList(this.f51533j);
                    this.f51527d |= 32;
                }
                this.f51533j.addAll(yVar.f51557i);
            }
        }
        if ((yVar.f51551c & 32) == 32) {
            q0 q0Var4 = yVar.f51558j;
            if ((this.f51527d & 64) != 64 || (q0Var = this.f51534k) == q0.f51409t) {
                this.f51534k = q0Var4;
            } else {
                p0 p0VarU2 = q0.u(q0Var);
                p0VarU2.g(q0Var4);
                this.f51534k = p0VarU2.e();
            }
            this.f51527d |= 64;
        }
        if ((yVar.f51551c & 64) == 64) {
            int i15 = yVar.f51559k;
            this.f51527d |= 128;
            this.l = i15;
        }
        if (!yVar.l.isEmpty()) {
            if (this.f51535m.isEmpty()) {
                this.f51535m = yVar.l;
                this.f51527d &= -257;
            } else {
                if ((this.f51527d & NotificationCompat.FLAG_LOCAL_ONLY) != 256) {
                    this.f51535m = new ArrayList(this.f51535m);
                    this.f51527d |= NotificationCompat.FLAG_LOCAL_ONLY;
                }
                this.f51535m.addAll(yVar.l);
            }
        }
        if (!yVar.f51560m.isEmpty()) {
            if (this.f51536n.isEmpty()) {
                this.f51536n = yVar.f51560m;
                this.f51527d &= -513;
            } else {
                if ((this.f51527d & 512) != 512) {
                    this.f51536n = new ArrayList(this.f51536n);
                    this.f51527d |= 512;
                }
                this.f51536n.addAll(yVar.f51560m);
            }
        }
        if (!yVar.f51562o.isEmpty()) {
            if (this.f51537o.isEmpty()) {
                this.f51537o = yVar.f51562o;
                this.f51527d &= -1025;
            } else {
                if ((this.f51527d & 1024) != 1024) {
                    this.f51537o = new ArrayList(this.f51537o);
                    this.f51527d |= 1024;
                }
                this.f51537o.addAll(yVar.f51562o);
            }
        }
        if ((yVar.f51551c & 128) == 128) {
            w0 w0Var2 = yVar.f51563p;
            if ((this.f51527d & com.ironsource.mediationsdk.metadata.a.f29616n) != 2048 || (w0Var = this.f51538p) == w0.f51519g) {
                this.f51538p = w0Var2;
            } else {
                f fVarL = w0.l(w0Var);
                fVarL.l(w0Var2);
                this.f51538p = fVarL.g();
            }
            this.f51527d |= com.ironsource.mediationsdk.metadata.a.f29616n;
        }
        if (!yVar.f51564q.isEmpty()) {
            if (this.f51539q.isEmpty()) {
                this.f51539q = yVar.f51564q;
                this.f51527d &= -4097;
            } else {
                if ((this.f51527d & 4096) != 4096) {
                    this.f51539q = new ArrayList(this.f51539q);
                    this.f51527d |= 4096;
                }
                this.f51539q.addAll(yVar.f51564q);
            }
        }
        if ((yVar.f51551c & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            n nVar2 = yVar.f51565r;
            if ((this.f51527d & Segment.SIZE) != 8192 || (nVar = this.f51540r) == n.f51359e) {
                this.f51540r = nVar2;
            } else {
                m mVar = new m(0);
                mVar.f51354d = Collections.EMPTY_LIST;
                mVar.j(nVar);
                mVar.j(nVar2);
                this.f51540r = mVar.e();
            }
            this.f51527d |= Segment.SIZE;
        }
        d(yVar);
        this.f55044a = this.f55044a.h(yVar.f51550b);
    }
}
