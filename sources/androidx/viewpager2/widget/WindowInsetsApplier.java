package androidx.viewpager2.widget;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsApplier implements OnApplyWindowInsetsListener {
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        WindowInsetsCompat windowInsetsCompatT = ViewCompat.t(viewPager2, windowInsetsCompat);
        if (windowInsetsCompatT.m()) {
            return windowInsetsCompatT;
        }
        RecyclerView recyclerView = viewPager2.n0;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ViewCompat.c(recyclerView.getChildAt(i2), new WindowInsetsCompat(windowInsetsCompatT));
        }
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.f4504b;
        return windowInsetsCompat2.o() != null ? windowInsetsCompat2 : windowInsetsCompatT.c().b();
    }
}
