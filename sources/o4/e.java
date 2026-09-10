package o4;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47108a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f47109b;

    public e(ViewGroup viewGroup) {
        this.f47109b = viewGroup;
    }

    @Override // o4.s, o4.q
    public final void a() {
        this.f47109b.suppressLayout(false);
    }

    @Override // o4.s, o4.q
    public final void b() {
        this.f47109b.suppressLayout(false);
        this.f47108a = true;
    }

    @Override // o4.q
    public final void c(r rVar) {
        if (!this.f47108a) {
            this.f47109b.suppressLayout(false);
        }
        rVar.v(this);
    }

    @Override // o4.s, o4.q
    public final void d() {
        this.f47109b.suppressLayout(true);
    }
}
