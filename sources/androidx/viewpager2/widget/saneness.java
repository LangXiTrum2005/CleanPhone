package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CompositeOnPageChangeCallback.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness extends ViewPager2.taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<ViewPager2.taiyuan> f13981attabal;

    public saneness(int i) {
        this.f13981attabal = new ArrayList(i);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.taiyuan
    public void attabal(int i) {
        try {
            Iterator<ViewPager2.taiyuan> it = this.f13981attabal.iterator();
            while (it.hasNext()) {
                it.next().attabal(i);
            }
        } catch (ConcurrentModificationException e) {
            beachfront(e);
        }
    }

    public final void beachfront(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.taiyuan
    public void dern(int i) {
        try {
            Iterator<ViewPager2.taiyuan> it = this.f13981attabal.iterator();
            while (it.hasNext()) {
                it.next().dern(i);
            }
        } catch (ConcurrentModificationException e) {
            beachfront(e);
        }
    }

    public void marial(ViewPager2.taiyuan taiyuanVar) {
        this.f13981attabal.remove(taiyuanVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.taiyuan
    public void saneness(int i, float f, int i2) {
        try {
            Iterator<ViewPager2.taiyuan> it = this.f13981attabal.iterator();
            while (it.hasNext()) {
                it.next().saneness(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            beachfront(e);
        }
    }

    public void wireman(ViewPager2.taiyuan taiyuanVar) {
        this.f13981attabal.add(taiyuanVar);
    }
}
