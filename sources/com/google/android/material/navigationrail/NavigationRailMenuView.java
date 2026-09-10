package com.google.android.material.navigationrail;

import android.view.View;
import com.google.android.material.navigation.NavigationBarMenuView;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    public int x0;

    public final int b(int i2, int i3, int i4, View view) {
        int iMakeMeasureSpec;
        int measuredHeight;
        if (view == null) {
            int iMax = i3 / Math.max(1, i4);
            int size = this.x0;
            if (size == -1) {
                size = View.MeasureSpec.getSize(i2);
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i2, iMakeMeasureSpec);
                    measuredHeight = childAt.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                i5 += measuredHeight;
            }
        }
        return i5;
    }

    public int getItemMinimumHeight() {
        return this.x0;
    }

    public int getMenuGravity() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                childAt.layout(0, i7, i6, measuredHeight);
                i7 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int iB;
        int labelVisibilityMode;
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = getMenu().l().size();
        if (size2 <= 1 || ((labelVisibilityMode = getLabelVisibilityMode()) != -1 ? labelVisibilityMode != 0 : size2 <= 3)) {
            iB = b(i2, size, size2, null);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int iMax = size / Math.max(1, size2);
                int size3 = this.x0;
                if (size3 == -1) {
                    size3 = View.MeasureSpec.getSize(i2);
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size3, iMax), 0);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i2, iMakeMeasureSpec);
                    measuredHeight = childAt.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                size -= measuredHeight;
                size2--;
            } else {
                measuredHeight = 0;
            }
            iB = b(i2, size, size2, childAt) + measuredHeight;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.resolveSizeAndState(iB, i3, 0));
    }

    public void setItemMinimumHeight(int i2) {
        if (this.x0 != i2) {
            this.x0 = i2;
            requestLayout();
        }
    }

    public void setMenuGravity(int i2) {
        throw null;
    }
}
