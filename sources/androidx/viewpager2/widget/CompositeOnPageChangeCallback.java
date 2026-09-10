package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class CompositeOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8539a = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void a(int i2) {
        try {
            Iterator it = this.f8539a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).a(i2);
            }
        } catch (ConcurrentModificationException e2) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void b(int i2, float f, int i3) {
        try {
            Iterator it = this.f8539a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).b(i2, f, i3);
            }
        } catch (ConcurrentModificationException e2) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void c(int i2) {
        try {
            Iterator it = this.f8539a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).c(i2);
            }
        } catch (ConcurrentModificationException e2) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e2);
        }
    }
}
