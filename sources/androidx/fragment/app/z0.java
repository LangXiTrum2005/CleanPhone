package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f4516a;

    public z0(Fragment fragment) {
        this.f4516a = fragment;
    }

    @Override // androidx.fragment.app.l1
    public final void a(Fragment fragment) {
        this.f4516a.onAttachFragment(fragment);
    }
}
