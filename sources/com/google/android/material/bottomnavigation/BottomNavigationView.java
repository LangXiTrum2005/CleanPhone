package com.google.android.material.bottomnavigation;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class BottomNavigationView extends NavigationBarView {

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$1, reason: invalid class name */
    class AnonymousClass1 implements ViewUtils.OnApplyWindowInsetsListener {
        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
            relativePadding.d = windowInsetsCompat.g() + relativePadding.d;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            boolean z2 = view.getLayoutDirection() == 1;
            int iH = windowInsetsCompat.h();
            int i2 = windowInsetsCompat.i();
            int i3 = relativePadding.f19355a + (z2 ? i2 : iH);
            relativePadding.f19355a = i3;
            int i4 = relativePadding.f19357c;
            if (!z2) {
                iH = i2;
            }
            int i5 = i4 + iH;
            relativePadding.f19357c = i5;
            view.setPaddingRelative(i3, relativePadding.f19356b, i5, relativePadding.d);
            return windowInsetsCompat;
        }
    }

    @Deprecated
    public interface OnNavigationItemReselectedListener extends NavigationBarView.OnItemReselectedListener {
    }

    @Deprecated
    public interface OnNavigationItemSelectedListener extends NavigationBarView.OnItemSelectedListener {
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i3) != 1073741824 && suggestedMinimumHeight > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i3), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.x0 == z2) {
            return;
        }
        bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z2);
        getPresenter().getClass();
        throw null;
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        setOnItemReselectedListener(onNavigationItemReselectedListener);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        setOnItemSelectedListener(onNavigationItemSelectedListener);
    }
}
