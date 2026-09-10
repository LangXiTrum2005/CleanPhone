package qj;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.f0;
import i1.i0;
import i1.k0;
import i1.q0;
import i1.u0;
import i1.v0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f49058a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.k f49059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f49060c;

    public h(p1.k kVar, x xVar) {
        this.f49059b = kVar;
        this.f49060c = xVar;
    }

    @Override // i1.i0
    public final void C(boolean z10) {
        m5.k kVar = (m5.k) this.f49060c.f49096b;
        ((ArrayList) kVar.f45903c).add(new k(z10));
        kVar.D();
    }

    @Override // i1.i0
    public final void i(int i10) {
        o oVar;
        if (i10 == 1) {
            oVar = o.IDLE;
        } else if (i10 == 2) {
            oVar = o.BUFFERING;
        } else if (i10 != 3) {
            oVar = i10 != 4 ? o.UNKNOWN : o.ENDED;
        } else {
            if (!this.f49058a) {
                this.f49058a = true;
                l();
            }
            oVar = o.READY;
        }
        m5.k kVar = (m5.k) this.f49060c.f49096b;
        ((ArrayList) kVar.f45903c).add(new t(oVar));
        kVar.D();
    }

    public abstract void l();

    @Override // i1.i0
    public final void p(f0 f0Var) {
        if (f0Var.f42536a == 1002) {
            k0 k0Var = this.f49059b;
            al.b bVar = (al.b) k0Var;
            bVar.getClass();
            bVar.E0(((p1.b0) bVar).M0(), C.TIME_UNSET);
            ((p1.b0) k0Var).b1();
            return;
        }
        m5.k kVar = (m5.k) this.f49060c.f49096b;
        u uVar = new u();
        uVar.f49087a = "Video player had error " + f0Var;
        ((ArrayList) kVar.f45903c).add(uVar);
        kVar.D();
    }

    @Override // i1.i0
    public final void w(v0 v0Var) {
        String str;
        oa.f0 f0VarListIterator = v0Var.f42710a.listIterator(0);
        int i10 = 0;
        while (f0VarListIterator.hasNext()) {
            u0 u0Var = (u0) f0VarListIterator.next();
            q0 q0Var = u0Var.f42700b;
            boolean[] zArr = u0Var.f42703e;
            if (q0Var.f42661c == 1) {
                for (boolean z10 : zArr) {
                    if (z10) {
                        for (int i11 = 0; i11 < u0Var.f42699a; i11++) {
                            if (zArr[i11]) {
                                str = i10 + "_" + i11;
                                m5.k kVar = (m5.k) this.f49060c.f49096b;
                                ((ArrayList) kVar.f45903c).add(new d(str));
                                kVar.D();
                            }
                        }
                        break;
                    }
                }
            }
            i10++;
        }
        str = null;
        m5.k kVar2 = (m5.k) this.f49060c.f49096b;
        ((ArrayList) kVar2.f45903c).add(new d(str));
        kVar2.D();
    }
}
