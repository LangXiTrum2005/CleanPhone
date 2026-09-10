package com.google.android.material.divider;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z2;
        rect.set(0, 0, 0, 0);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            z2 = childAdapterPosition == adapter.getItemCount() - 1;
        }
        if (childAdapterPosition == -1 || z2) {
            return;
        }
        if (ViewUtils.e(recyclerView)) {
            rect.left = 0;
        } else {
            rect.right = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z2;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            canvas.clipRect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            recyclerView.getHeight();
        }
        boolean zE = ViewUtils.e(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                z2 = childAdapterPosition == adapter.getItemCount() - 1;
            }
            if (childAdapterPosition != -1 && !z2) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, null);
                Math.round(childAt.getTranslationX());
                if (!zE) {
                    throw null;
                }
                throw null;
            }
        }
        canvas.restore();
    }
}
