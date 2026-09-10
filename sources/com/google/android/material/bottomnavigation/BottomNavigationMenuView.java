package com.google.android.material.bottomnavigation;

import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    public boolean x0;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int measuredWidth = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                if (getLayoutDirection() == 1) {
                    int i9 = i6 - measuredWidth;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i7);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i7);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        MenuBuilder menu = getMenu();
        View.MeasureSpec.getSize(i2);
        menu.l().size();
        getChildCount();
        throw null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        this.x0 = z2;
    }
}
