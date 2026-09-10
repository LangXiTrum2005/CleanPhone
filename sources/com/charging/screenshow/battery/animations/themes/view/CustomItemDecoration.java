package com.charging.screenshow.battery.animations.themes.view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/view/CustomItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13325c;

    public CustomItemDecoration(int i2, int i3) {
        this.f13324b = IntExt.a(i2);
        this.f13323a = IntExt.a(i2);
        this.f13325c = IntExt.a(i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i2;
        Intrinsics.f(outRect, "outRect");
        Intrinsics.f(state, "state");
        recyclerView.getChildAdapterPosition(view);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int iA = 0;
        if (layoutManager == null) {
            i2 = 1;
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            i2 = ((StaggeredGridLayoutManager) layoutManager).X;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            iA = ((StaggeredGridLayoutManager.LayoutParams) layoutParams).a();
        } else if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int i3 = gridLayoutManager.f8054Y;
            gridLayoutManager.h0.getClass();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Intrinsics.d(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            i2 = i3;
            iA = ((GridLayoutManager.LayoutParams) layoutParams2).f0;
        } else {
            if (layoutManager instanceof LinearLayoutManager) {
                int i4 = this.f13323a;
                outRect.left = i4;
                outRect.right = i4;
                outRect.bottom = this.f13324b;
                return;
            }
            i2 = 1;
        }
        if (1 == i2) {
            int i5 = this.f13323a + this.f13325c;
            outRect.left = i5;
            outRect.right = i5;
            outRect.bottom = this.f13324b;
            return;
        }
        int i6 = this.f13323a;
        int i7 = this.f13325c;
        int i8 = ((i7 * 2) + ((i2 + 1) * i6)) / i2;
        int i9 = (((iA + 1) * i6) - (iA * i8)) + i7;
        outRect.left = i9;
        outRect.right = i8 - i9;
        outRect.bottom = this.f13324b;
    }
}
