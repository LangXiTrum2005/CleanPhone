package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f48449b = new l0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f48450c = new l0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0 f48451d = new l0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48452a;

    public /* synthetic */ l0(int i10) {
        this.f48452a = i10;
    }

    @Override // pm.c
    public final sm.d y(m0 state, sm.c type) {
        switch (this.f48452a) {
            case 0:
                kotlin.jvm.internal.n.f(state, "state");
                kotlin.jvm.internal.n.f(type, "type");
                return state.f48456c.q0(type);
            case 1:
                kotlin.jvm.internal.n.f(state, "state");
                kotlin.jvm.internal.n.f(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            default:
                kotlin.jvm.internal.n.f(state, "state");
                kotlin.jvm.internal.n.f(type, "type");
                return state.f48456c.I(type);
        }
    }
}
