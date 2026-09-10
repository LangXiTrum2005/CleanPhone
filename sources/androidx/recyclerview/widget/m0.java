package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4824b;

    public final void a(h1 h1Var) {
        View view = h1Var.itemView;
        this.f4823a = view.getLeft();
        this.f4824b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
