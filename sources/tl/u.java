package tl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends zl.i implements zl.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f51480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q0 f51481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f51483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f51484i;

    public static u f() {
        u uVar = new u();
        uVar.f51480e = v.TRUE;
        uVar.f51481f = q0.f51409t;
        List list = Collections.EMPTY_LIST;
        uVar.f51483h = list;
        uVar.f51484i = list;
        return uVar;
    }

    @Override // zl.i
    public final zl.a a() {
        w wVarE = e();
        if (wVarE.isInitialized()) {
            return wVarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        w wVar = null;
        try {
            try {
                w.f51507m.getClass();
                g(new w(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                w wVar2 = (w) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    wVar = wVar2;
                    if (wVar != null) {
                        g(wVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (wVar != null) {
                g(wVar);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((w) nVar);
        return this;
    }

    public final Object clone() {
        u uVarF = f();
        uVarF.g(e());
        return uVarF;
    }

    public final w e() {
        w wVar = new w(this);
        int i10 = this.f51477b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        wVar.f51510c = this.f51478c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        wVar.f51511d = this.f51479d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        wVar.f51512e = this.f51480e;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        wVar.f51513f = this.f51481f;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        wVar.f51514g = this.f51482g;
        if ((i10 & 32) == 32) {
            this.f51483h = Collections.unmodifiableList(this.f51483h);
            this.f51477b &= -33;
        }
        wVar.f51515h = this.f51483h;
        if ((this.f51477b & 64) == 64) {
            this.f51484i = Collections.unmodifiableList(this.f51484i);
            this.f51477b &= -65;
        }
        wVar.f51516i = this.f51484i;
        wVar.f51509b = i11;
        return wVar;
    }

    public final void g(w wVar) {
        q0 q0Var;
        if (wVar == w.l) {
            return;
        }
        int i10 = wVar.f51509b;
        if ((i10 & 1) == 1) {
            int i11 = wVar.f51510c;
            this.f51477b = 1 | this.f51477b;
            this.f51478c = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = wVar.f51511d;
            this.f51477b = 2 | this.f51477b;
            this.f51479d = i12;
        }
        if ((i10 & 4) == 4) {
            v vVar = wVar.f51512e;
            vVar.getClass();
            this.f51477b = 4 | this.f51477b;
            this.f51480e = vVar;
        }
        if ((wVar.f51509b & 8) == 8) {
            q0 q0Var2 = wVar.f51513f;
            if ((this.f51477b & 8) != 8 || (q0Var = this.f51481f) == q0.f51409t) {
                this.f51481f = q0Var2;
            } else {
                p0 p0VarU = q0.u(q0Var);
                p0VarU.g(q0Var2);
                this.f51481f = p0VarU.e();
            }
            this.f51477b |= 8;
        }
        if ((wVar.f51509b & 16) == 16) {
            int i13 = wVar.f51514g;
            this.f51477b = 16 | this.f51477b;
            this.f51482g = i13;
        }
        if (!wVar.f51515h.isEmpty()) {
            if (this.f51483h.isEmpty()) {
                this.f51483h = wVar.f51515h;
                this.f51477b &= -33;
            } else {
                if ((this.f51477b & 32) != 32) {
                    this.f51483h = new ArrayList(this.f51483h);
                    this.f51477b |= 32;
                }
                this.f51483h.addAll(wVar.f51515h);
            }
        }
        if (!wVar.f51516i.isEmpty()) {
            if (this.f51484i.isEmpty()) {
                this.f51484i = wVar.f51516i;
                this.f51477b &= -65;
            } else {
                if ((this.f51477b & 64) != 64) {
                    this.f51484i = new ArrayList(this.f51484i);
                    this.f51477b |= 64;
                }
                this.f51484i.addAll(wVar.f51516i);
            }
        }
        this.f55044a = this.f55044a.h(wVar.f51508a);
    }
}
