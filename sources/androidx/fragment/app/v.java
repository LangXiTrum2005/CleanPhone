package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f4482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f4483b;

    public v(w wVar, o0 o0Var) {
        this.f4483b = wVar;
        this.f4482a = o0Var;
    }

    @Override // androidx.fragment.app.o0
    public final View b(int i10) {
        o0 o0Var = this.f4482a;
        if (o0Var.c()) {
            return o0Var.b(i10);
        }
        Dialog dialog = this.f4483b.l;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.o0
    public final boolean c() {
        return this.f4482a.c() || this.f4483b.f4501p;
    }
}
