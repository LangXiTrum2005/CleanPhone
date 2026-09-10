package com.inmobi.media;

import A.RunnableC0905n;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.PagerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3193q8 extends PagerAdapter implements L8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3177p8 f23925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D8 f23926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23927c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f23928e;
    public boolean f;
    public final SparseArray g;

    public C3193q8(C3177p8 mNativeDataModel, D8 mNativeLayoutInflater) {
        Intrinsics.f(mNativeDataModel, "mNativeDataModel");
        Intrinsics.f(mNativeLayoutInflater, "mNativeLayoutInflater");
        this.f23925a = mNativeDataModel;
        this.f23926b = mNativeLayoutInflater;
        this.f23927c = "q8";
        this.d = 50;
        this.f23928e = new Handler(Looper.getMainLooper());
        this.g = new SparseArray();
    }

    public static final void a(Object item, C3193q8 this$0) {
        Intrinsics.f(item, "$item");
        Intrinsics.f(this$0, "this$0");
        if (item instanceof View) {
            D8 d8 = this$0.f23926b;
            d8.getClass();
            d8.m.a((View) item);
        }
    }

    @Override // com.inmobi.media.L8
    public final void destroy() {
        this.f = true;
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f23928e.removeCallbacks((Runnable) this.g.get(this.g.keyAt(i2)));
        }
        this.g.clear();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup container, int i2, Object item) {
        Intrinsics.f(container, "container");
        Intrinsics.f(item, "item");
        if (item instanceof View) {
            container.removeView((View) item);
        }
        Runnable runnable = (Runnable) this.g.get(i2);
        if (runnable != null) {
            this.f23928e.removeCallbacks(runnable);
            String TAG = this.f23927c;
            Intrinsics.e(TAG, "TAG");
        }
        this.f23928e.post(new RunnableC0905n(23, item, this));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f23925a.d();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object item) {
        Intrinsics.f(item, "item");
        View view = item instanceof View ? (View) item : null;
        Object tag = view != null ? view.getTag() : null;
        if (tag instanceof Integer) {
            return ((Number) tag).intValue();
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup container, int i2) {
        View relativeLayout;
        Intrinsics.f(container, "container");
        String TAG = this.f23927c;
        Intrinsics.e(TAG, "TAG");
        C3049h8 c3049h8B = this.f23925a.b(i2);
        if (c3049h8B == null || (relativeLayout = a(i2, container, c3049h8B)) == null) {
            relativeLayout = new RelativeLayout(container.getContext());
        }
        relativeLayout.setTag(Integer.valueOf(i2));
        container.addView(relativeLayout);
        return relativeLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        Intrinsics.f(view, "view");
        Intrinsics.f(obj, "obj");
        return view.equals(obj);
    }

    public final ViewGroup a(int i2, ViewGroup parent, C3049h8 pageContainerAsset) {
        Intrinsics.f(parent, "parent");
        Intrinsics.f(pageContainerAsset, "pageContainerAsset");
        ViewGroup viewGroupA = this.f23926b.a(parent, pageContainerAsset);
        if (viewGroupA == null) {
            return viewGroupA;
        }
        int iAbs = Math.abs(this.f23926b.k - i2);
        A.s0 s0Var = new A.s0(this, i2, viewGroupA, parent, pageContainerAsset);
        this.g.put(i2, s0Var);
        this.f23928e.postDelayed(s0Var, iAbs * this.d);
        return viewGroupA;
    }

    public static final void a(C3193q8 this$0, int i2, ViewGroup it, ViewGroup parent, C3049h8 pageContainerAsset) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(it, "$it");
        Intrinsics.f(parent, "$parent");
        Intrinsics.f(pageContainerAsset, "$pageContainerAsset");
        if (this$0.f) {
            return;
        }
        this$0.g.remove(i2);
        D8 d8 = this$0.f23926b;
        d8.getClass();
        d8.b(it, pageContainerAsset);
    }
}
