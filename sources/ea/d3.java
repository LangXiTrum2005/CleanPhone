package ea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d3 extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h3 f39348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(h3 h3Var, m1 m1Var, int i10) {
        super(m1Var);
        this.f39347e = i10;
        this.f39348f = h3Var;
    }

    @Override // ea.n
    public final void a() {
        switch (this.f39347e) {
            case 0:
                h3 h3Var = this.f39348f;
                h3Var.G0();
                if (h3Var.X0()) {
                    s0 s0Var = ((m1) h3Var.f3623a).f39587f;
                    m1.h(s0Var);
                    s0Var.f39760n.b("Inactivity, disconnecting from the service");
                    h3Var.O0();
                    break;
                }
                break;
            default:
                s0 s0Var2 = ((m1) this.f39348f.f3623a).f39587f;
                m1.h(s0Var2);
                s0Var2.f39756i.b("Tasks have been queued for a long time");
                break;
        }
    }
}
