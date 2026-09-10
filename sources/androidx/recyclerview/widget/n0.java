package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f4832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f4833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4837f;

    public static void b(h1 h1Var) {
        int i10 = h1Var.mFlags;
        if (!h1Var.isInvalid() && (i10 & 4) == 0) {
            h1Var.getOldPosition();
            h1Var.getAdapterPosition();
        }
    }

    public abstract boolean a(h1 h1Var, h1 h1Var2, m0 m0Var, m0 m0Var2);

    public final void c(h1 h1Var) {
        l0 l0Var = this.f4832a;
        if (l0Var != null) {
            RecyclerView recyclerView = ((f0) l0Var).f4767a;
            h1Var.setIsRecyclable(true);
            if (h1Var.mShadowedHolder != null && h1Var.mShadowingHolder == null) {
                h1Var.mShadowedHolder = null;
            }
            h1Var.mShadowingHolder = null;
            if (h1Var.shouldBeKeptAsChild() || recyclerView.removeAnimatingView(h1Var.itemView) || !h1Var.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(h1Var.itemView, false);
        }
    }

    public abstract void d(h1 h1Var);

    public abstract void e();

    public abstract boolean f();
}
