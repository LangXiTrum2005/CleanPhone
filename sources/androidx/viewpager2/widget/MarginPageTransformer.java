package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class MarginPageTransformer implements ViewPager2.PageTransformer {
    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public final void a(View view, float f) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
            throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
        }
        ViewPager2 viewPager2 = (ViewPager2) parent2;
        float f2 = 0 * f;
        if (viewPager2.getOrientation() != 0) {
            view.setTranslationY(f2);
            return;
        }
        if (viewPager2.k0.getLayoutDirection() == 1) {
            f2 = -f2;
        }
        view.setTranslationX(f2);
    }
}
