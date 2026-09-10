package m0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f45724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f45725b;

    public k0(View view, v vVar) {
        this.f45724a = view;
        this.f45725b = vVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.f45725b.f(view, r1.g(view, windowInsets)).f();
    }
}
