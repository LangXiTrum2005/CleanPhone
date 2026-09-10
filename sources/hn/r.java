package hn;

import cn.d0;
import cn.j0;
import com.google.android.gms.internal.play_billing.q1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class r extends cn.a implements ck.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ak.f f42453d;

    public r(ak.f fVar, ak.k kVar) {
        super(kVar, true);
        this.f42453d = fVar;
    }

    @Override // cn.q1
    public final boolean M() {
        return true;
    }

    @Override // ck.d
    public final ck.d getCallerFrame() {
        ak.f fVar = this.f42453d;
        if (fVar instanceof ck.d) {
            return (ck.d) fVar;
        }
        return null;
    }

    @Override // cn.q1
    public void q(Object obj) throws j0 {
        b.h(q1.t(this.f42453d), d0.z(obj));
    }

    @Override // cn.q1
    public void r(Object obj) {
        this.f42453d.resumeWith(d0.z(obj));
    }

    public void e0() {
    }
}
