package com.google.android.material.navigationrail;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarView;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationRailView extends NavigationBarView {
    public static final /* synthetic */ int g0 = 0;

    /* JADX INFO: renamed from: com.google.android.material.navigationrail.NavigationRailView$1, reason: invalid class name */
    class AnonymousClass1 implements ViewUtils.OnApplyWindowInsetsListener {
        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
            windowInsetsCompat.e(7);
            int i2 = NavigationRailView.g0;
            throw null;
        }
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    public View getHeaderView() {
        return null;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        getNavigationRailMenuView().getClass();
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumWidth > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    public void setItemMinimumHeight(int i2) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i2);
    }

    public void setMenuGravity(int i2) {
        getNavigationRailMenuView().setMenuGravity(i2);
    }
}
