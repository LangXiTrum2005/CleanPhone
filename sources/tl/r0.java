package tl;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends zl.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f51441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q0 f51442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q0 f51444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51445k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f51446m;

    public static r0 f() {
        r0 r0Var = new r0();
        r0Var.f51439e = 6;
        List list = Collections.EMPTY_LIST;
        r0Var.f51441g = list;
        q0 q0Var = q0.f51409t;
        r0Var.f51442h = q0Var;
        r0Var.f51444j = q0Var;
        r0Var.l = list;
        r0Var.f51446m = list;
        return r0Var;
    }

    @Override // zl.i
    public final zl.a a() {
        s0 s0VarE = e();
        if (s0VarE.isInitialized()) {
            return s0VarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        s0 s0Var = null;
        try {
            try {
                s0.f51450p.getClass();
                g(new s0(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                s0 s0Var2 = (s0) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    s0Var = s0Var2;
                    if (s0Var != null) {
                        g(s0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (s0Var != null) {
                g(s0Var);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((s0) nVar);
        return this;
    }

    public final Object clone() {
        r0 r0VarF = f();
        r0VarF.g(e());
        return r0VarF;
    }

    public final s0 e() {
        s0 s0Var = new s0(this);
        int i10 = this.f51438d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        s0Var.f51453d = this.f51439e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        s0Var.f51454e = this.f51440f;
        if ((i10 & 4) == 4) {
            this.f51441g = Collections.unmodifiableList(this.f51441g);
            this.f51438d &= -5;
        }
        s0Var.f51455f = this.f51441g;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        s0Var.f51456g = this.f51442h;
        if ((i10 & 16) == 16) {
            i11 |= 8;
        }
        s0Var.f51457h = this.f51443i;
        if ((i10 & 32) == 32) {
            i11 |= 16;
        }
        s0Var.f51458i = this.f51444j;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        s0Var.f51459j = this.f51445k;
        if ((this.f51438d & 128) == 128) {
            this.l = Collections.unmodifiableList(this.l);
            this.f51438d &= -129;
        }
        s0Var.f51460k = this.l;
        if ((this.f51438d & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            this.f51446m = Collections.unmodifiableList(this.f51446m);
            this.f51438d &= -257;
        }
        s0Var.l = this.f51446m;
        s0Var.f51452c = i11;
        return s0Var;
    }

    public final void g(s0 s0Var) {
        q0 q0Var;
        q0 q0Var2;
        if (s0Var == s0.f51449o) {
            return;
        }
        int i10 = s0Var.f51452c;
        if ((i10 & 1) == 1) {
            int i11 = s0Var.f51453d;
            this.f51438d = 1 | this.f51438d;
            this.f51439e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = s0Var.f51454e;
            this.f51438d = 2 | this.f51438d;
            this.f51440f = i12;
        }
        if (!s0Var.f51455f.isEmpty()) {
            if (this.f51441g.isEmpty()) {
                this.f51441g = s0Var.f51455f;
                this.f51438d &= -5;
            } else {
                if ((this.f51438d & 4) != 4) {
                    this.f51441g = new ArrayList(this.f51441g);
                    this.f51438d |= 4;
                }
                this.f51441g.addAll(s0Var.f51455f);
            }
        }
        if ((s0Var.f51452c & 4) == 4) {
            q0 q0Var3 = s0Var.f51456g;
            if ((this.f51438d & 8) != 8 || (q0Var2 = this.f51442h) == q0.f51409t) {
                this.f51442h = q0Var3;
            } else {
                p0 p0VarU = q0.u(q0Var2);
                p0VarU.g(q0Var3);
                this.f51442h = p0VarU.e();
            }
            this.f51438d |= 8;
        }
        int i13 = s0Var.f51452c;
        if ((i13 & 8) == 8) {
            int i14 = s0Var.f51457h;
            this.f51438d |= 16;
            this.f51443i = i14;
        }
        if ((i13 & 16) == 16) {
            q0 q0Var4 = s0Var.f51458i;
            if ((this.f51438d & 32) != 32 || (q0Var = this.f51444j) == q0.f51409t) {
                this.f51444j = q0Var4;
            } else {
                p0 p0VarU2 = q0.u(q0Var);
                p0VarU2.g(q0Var4);
                this.f51444j = p0VarU2.e();
            }
            this.f51438d |= 32;
        }
        if ((s0Var.f51452c & 32) == 32) {
            int i15 = s0Var.f51459j;
            this.f51438d |= 64;
            this.f51445k = i15;
        }
        if (!s0Var.f51460k.isEmpty()) {
            if (this.l.isEmpty()) {
                this.l = s0Var.f51460k;
                this.f51438d &= -129;
            } else {
                if ((this.f51438d & 128) != 128) {
                    this.l = new ArrayList(this.l);
                    this.f51438d |= 128;
                }
                this.l.addAll(s0Var.f51460k);
            }
        }
        if (!s0Var.l.isEmpty()) {
            if (this.f51446m.isEmpty()) {
                this.f51446m = s0Var.l;
                this.f51438d &= -257;
            } else {
                if ((this.f51438d & NotificationCompat.FLAG_LOCAL_ONLY) != 256) {
                    this.f51446m = new ArrayList(this.f51446m);
                    this.f51438d |= NotificationCompat.FLAG_LOCAL_ONLY;
                }
                this.f51446m.addAll(s0Var.l);
            }
        }
        d(s0Var);
        this.f55044a = this.f55044a.h(s0Var.f51451b);
    }
}
