package cm;

import al.j;
import com.ironsource.X3;
import d5.u;
import kotlin.jvm.internal.n;
import pm.q0;
import pm.t0;
import pm.y;
import zk.g;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f6669c;

    public /* synthetic */ d(t0 t0Var, int i10) {
        this.f6668b = i10;
        this.f6669c = t0Var;
    }

    @Override // pm.t0
    public boolean a() {
        switch (this.f6668b) {
            case 0:
                return this.f6669c.a();
            default:
                return super.a();
        }
    }

    @Override // pm.t0
    public boolean b() {
        switch (this.f6668b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // pm.t0
    public final j c(j annotations) {
        switch (this.f6668b) {
            case 0:
                n.f(annotations, "annotations");
                break;
            default:
                n.f(annotations, "annotations");
                break;
        }
        return this.f6669c.c(annotations);
    }

    @Override // pm.t0
    public final q0 d(y yVar) {
        switch (this.f6668b) {
            case 0:
                q0 q0VarD = this.f6669c.d(yVar);
                if (q0VarD == null) {
                    return null;
                }
                g gVarE = yVar.P().e();
                return com.bumptech.glide.c.f(q0VarD, gVarE instanceof m0 ? (m0) gVarE : null);
            default:
                return this.f6669c.d(yVar);
        }
    }

    @Override // pm.t0
    public final boolean e() {
        switch (this.f6668b) {
            case 0:
                break;
        }
        return this.f6669c.e();
    }

    @Override // pm.t0
    public final y f(int i10, y topLevelType) {
        switch (this.f6668b) {
            case 0:
                n.f(topLevelType, "topLevelType");
                u.n(i10, X3.i.L);
                break;
            default:
                n.f(topLevelType, "topLevelType");
                u.n(i10, X3.i.L);
                break;
        }
        return this.f6669c.f(i10, topLevelType);
    }
}
