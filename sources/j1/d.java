package j1;

import androidx.appcompat.widget.ActionBarContextView;
import m0.x0;
import pm.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f43584c;

    public d(c0 c0Var, int i10, boolean z10) {
        this.f43584c = c0Var;
        this.f43583b = i10;
        this.f43582a = z10;
    }

    @Override // m0.x0
    public void a() {
        this.f43582a = true;
    }

    @Override // m0.x0
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f43582a = false;
    }

    @Override // m0.x0
    public void c() {
        if (this.f43582a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f43584c;
        actionBarContextView.f3880f = null;
        super/*android.view.View*/.setVisibility(this.f43583b);
    }
}
