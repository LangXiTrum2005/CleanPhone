package androidx.fragment.app;

import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f4371b;

    public /* synthetic */ k0(ComponentActivity componentActivity, int i10) {
        this.f4370a = i10;
        this.f4371b = componentActivity;
    }

    @Override // g.b
    public final void a(ComponentActivity componentActivity) {
        int i10 = this.f4370a;
        ComponentActivity componentActivity2 = this.f4371b;
        switch (i10) {
            case 0:
                l0 l0Var = (l0) ((FragmentActivity) componentActivity2).f4221b.f4268b;
                l0Var.f4445d.b(l0Var, l0Var, null);
                break;
            default:
                ComponentActivity.E(componentActivity2, componentActivity);
                break;
        }
    }
}
