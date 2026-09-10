package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f4740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f4741b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4742c = new ArrayList();

    public d(f0 f0Var) {
        this.f4740a = f0Var;
    }

    public final void a(View view, int i10, boolean z10) {
        RecyclerView recyclerView = this.f4740a.f4767a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : f(i10);
        this.f4741b.H(childCount, z10);
        if (z10) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = this.f4740a.f4767a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : f(i10);
        this.f4741b.H(childCount, z10);
        if (z10) {
            i(view);
        }
        h1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(defpackage.e.k(recyclerView, sb2));
            }
            childViewHolderInt.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i10) {
        h1 childViewHolderInt;
        int iF = f(i10);
        this.f4741b.J(iF);
        RecyclerView recyclerView = this.f4740a.f4767a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
            if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(defpackage.e.k(recyclerView, sb2));
            }
            childViewHolderInt.addFlags(NotificationCompat.FLAG_LOCAL_ONLY);
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i10) {
        return this.f4740a.f4767a.getChildAt(f(i10));
    }

    public final int e() {
        return this.f4740a.f4767a.getChildCount() - this.f4742c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f4740a.f4767a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            c cVar = this.f4741b;
            int iE = i10 - (i11 - cVar.E(i11));
            if (iE == 0) {
                while (cVar.G(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iE;
        }
        return -1;
    }

    public final View g(int i10) {
        return this.f4740a.f4767a.getChildAt(i10);
    }

    public final int h() {
        return this.f4740a.f4767a.getChildCount();
    }

    public final void i(View view) {
        this.f4742c.add(view);
        h1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(this.f4740a.f4767a);
        }
    }

    public final void j(View view) {
        h1 childViewHolderInt;
        if (!this.f4742c.remove(view) || (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) == null) {
            return;
        }
        childViewHolderInt.onLeftHiddenState(this.f4740a.f4767a);
    }

    public final String toString() {
        return this.f4741b.toString() + ", hidden list:" + this.f4742c.size();
    }
}
