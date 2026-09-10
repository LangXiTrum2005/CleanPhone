package androidx.viewpager2.widget;

import android.view.View;
import androidx.datastore.preferences.protobuf.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutManager f8541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager2.PageTransformer f8542b;

    public PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.f8541a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void a(int i2) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void b(int i2, float f, int i3) {
        if (this.f8542b == null) {
            return;
        }
        float f2 = -f;
        int i4 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.f8541a;
            if (i4 >= linearLayoutManager.getChildCount()) {
                return;
            }
            View childAt = linearLayoutManager.getChildAt(i4);
            if (childAt == null) {
                Locale locale = Locale.US;
                throw new IllegalStateException(a.e(i4, linearLayoutManager.getChildCount(), "LayoutManager returned a null child at pos ", "/", " while transforming pages"));
            }
            this.f8542b.a(childAt, (linearLayoutManager.getPosition(childAt) - i2) + f2);
            i4++;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void c(int i2) {
    }
}
