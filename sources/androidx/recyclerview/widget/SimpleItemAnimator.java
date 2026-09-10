package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {
    public boolean g;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2;
        int i3;
        if (itemHolderInfo != null && ((i2 = itemHolderInfo.f8098a) != (i3 = itemHolderInfo2.f8098a) || itemHolderInfo.f8099b != itemHolderInfo2.f8099b)) {
            return o(viewHolder, i2, itemHolderInfo.f8099b, i3, itemHolderInfo2.f8099b);
        }
        m(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean b(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2;
        int i3;
        int i4 = itemHolderInfo.f8098a;
        int i5 = itemHolderInfo.f8099b;
        if (viewHolder2.shouldIgnore()) {
            int i6 = itemHolderInfo.f8098a;
            i3 = itemHolderInfo.f8099b;
            i2 = i6;
        } else {
            i2 = itemHolderInfo2.f8098a;
            i3 = itemHolderInfo2.f8099b;
        }
        return n(viewHolder, viewHolder2, i4, i5, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2 = itemHolderInfo.f8098a;
        int i3 = itemHolderInfo.f8099b;
        View view = viewHolder.itemView;
        int left = itemHolderInfo2 == null ? view.getLeft() : itemHolderInfo2.f8098a;
        int top2 = itemHolderInfo2 == null ? view.getTop() : itemHolderInfo2.f8099b;
        if (viewHolder.isRemoved() || (i2 == left && i3 == top2)) {
            p(viewHolder);
            return true;
        }
        view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
        return o(viewHolder, i2, i3, left, top2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2 = itemHolderInfo.f8098a;
        int i3 = itemHolderInfo2.f8098a;
        if (i2 != i3 || itemHolderInfo.f8099b != itemHolderInfo2.f8099b) {
            return o(viewHolder, i2, itemHolderInfo.f8099b, i3, itemHolderInfo2.f8099b);
        }
        h(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean f(RecyclerView.ViewHolder viewHolder) {
        return !this.g || viewHolder.isInvalid();
    }

    public abstract void m(RecyclerView.ViewHolder viewHolder);

    public abstract boolean n(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5);

    public abstract boolean o(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5);

    public abstract void p(RecyclerView.ViewHolder viewHolder);
}
