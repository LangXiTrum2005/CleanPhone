package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FragmentPagerAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FragmentManager f5145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FragmentTransaction f5146i = null;
    public Fragment j = null;
    public boolean k;

    public FragmentPagerAdapter(FragmentManager fragmentManager) {
        this.f5145h = fragmentManager;
    }

    public abstract Fragment a(int i2);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f5146i == null) {
            FragmentManager fragmentManager = this.f5145h;
            fragmentManager.getClass();
            this.f5146i = new BackStackRecord(fragmentManager);
        }
        this.f5146i.g(fragment);
        if (fragment.equals(this.j)) {
            this.j = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f5146i;
        if (fragmentTransaction != null) {
            if (!this.k) {
                try {
                    this.k = true;
                    fragmentTransaction.f();
                    this.k = false;
                } catch (Throwable th) {
                    this.k = false;
                    throw th;
                }
            }
            this.f5146i = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        FragmentTransaction fragmentTransaction = this.f5146i;
        FragmentManager fragmentManager = this.f5145h;
        if (fragmentTransaction == null) {
            fragmentManager.getClass();
            this.f5146i = new BackStackRecord(fragmentManager);
        }
        long j = i2;
        Fragment fragmentC = fragmentManager.C("android:switcher:" + viewGroup.getId() + ":" + j);
        if (fragmentC != null) {
            FragmentTransaction fragmentTransaction2 = this.f5146i;
            fragmentTransaction2.getClass();
            fragmentTransaction2.b(new FragmentTransaction.Op(fragmentC, 7));
        } else {
            fragmentC = a(i2);
            this.f5146i.h(viewGroup.getId(), fragmentC, "android:switcher:" + viewGroup.getId() + ":" + j, 1);
        }
        if (fragmentC != this.j) {
            fragmentC.setMenuVisibility(false);
            fragmentC.setUserVisibleHint(false);
        }
        return fragmentC;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.j;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.j.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.j = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
