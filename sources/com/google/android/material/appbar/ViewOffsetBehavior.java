package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public ViewOffsetHelper X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f19102Y = 0;

    public ViewOffsetBehavior() {
    }

    public void A(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.s(i2, view);
    }

    public boolean B(int i2) {
        ViewOffsetHelper viewOffsetHelper = this.X;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.b(i2);
        }
        this.f19102Y = i2;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean n(CoordinatorLayout coordinatorLayout, View view, int i2) {
        A(coordinatorLayout, view, i2);
        if (this.X == null) {
            this.X = new ViewOffsetHelper(view);
        }
        ViewOffsetHelper viewOffsetHelper = this.X;
        View view2 = viewOffsetHelper.f19103a;
        viewOffsetHelper.f19104b = view2.getTop();
        viewOffsetHelper.f19105c = view2.getLeft();
        this.X.a();
        int i3 = this.f19102Y;
        if (i3 == 0) {
            return true;
        }
        this.X.b(i3);
        this.f19102Y = 0;
        return true;
    }

    public int y() {
        ViewOffsetHelper viewOffsetHelper = this.X;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.d;
        }
        return 0;
    }

    public int z() {
        return y();
    }

    public ViewOffsetBehavior(int i2) {
    }
}
