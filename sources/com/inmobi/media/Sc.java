package com.inmobi.media;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Sc extends K8 implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager f23180c;
    public final Point d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Point f23181e;
    public boolean f;
    public D8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sc(Context context) {
        super(context, (byte) 0);
        Intrinsics.f(context, "context");
        this.f23179b = "Sc";
        this.d = new Point();
        this.f23181e = new Point();
        setClipChildren(false);
        setLayerType(1, null);
        ViewPager viewPager = new ViewPager(getContext());
        this.f23180c = viewPager;
        viewPager.addOnPageChangeListener(this);
        addView(viewPager);
    }

    @Override // com.inmobi.media.K8
    public final void a(C3049h8 scrollableContainerAsset, L8 dataSource, int i2, int i3, D8 d8) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.f(scrollableContainerAsset, "scrollableContainerAsset");
        Intrinsics.f(dataSource, "dataSource");
        C2984d8 c2984d8 = scrollableContainerAsset.f23660B > 0 ? (C2984d8) scrollableContainerAsset.f23659A.get(0) : null;
        if (c2984d8 != null) {
            HashMap map = D9.f22775c;
            ViewGroup.LayoutParams layoutParamsA = C3146n9.a(c2984d8, this);
            Intrinsics.d(layoutParamsA, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            layoutParams = (FrameLayout.LayoutParams) layoutParamsA;
            layoutParams.setMarginStart(20);
            layoutParams.setMarginEnd(20);
            layoutParams.gravity = i3;
        } else {
            layoutParams = null;
        }
        ViewPager viewPager = this.f23180c;
        if (viewPager != null) {
            viewPager.setLayoutParams(layoutParams);
            viewPager.setAdapter(dataSource instanceof C3193q8 ? (C3193q8) dataSource : null);
            viewPager.setOffscreenPageLimit(2);
            viewPager.setPageMargin(16);
            viewPager.setCurrentItem(i2);
        }
        this.g = d8;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i2) {
        this.f = i2 != 0;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i2, float f, int i3) {
        if (this.f) {
            invalidate();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i2) {
        int i3;
        Intrinsics.e(this.f23179b, "TAG");
        ViewPager viewPager = this.f23180c;
        ViewGroup.LayoutParams layoutParams = viewPager != null ? viewPager.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        D8 d8 = this.g;
        if (d8 != null) {
            if (layoutParams2 != null) {
                d8.k = i2;
                C3049h8 c3049h8B = d8.f22768c.b(i2);
                if (c3049h8B != null) {
                    C3304x8 c3304x8 = d8.d.f24073a;
                    if (!c3304x8.f24099a) {
                        T7 t7 = c3304x8.f24100b;
                        t7.getClass();
                        if (!t7.f23218n.contains(Integer.valueOf(i2)) && !t7.t) {
                            t7.m();
                            if (!t7.t) {
                                t7.f23218n.add(Integer.valueOf(i2));
                                c3049h8B.y = System.currentTimeMillis();
                                if (t7.r) {
                                    HashMap mapA = t7.a(c3049h8B);
                                    InterfaceC3333z5 interfaceC3333z5 = t7.j;
                                    if (interfaceC3333z5 != null) {
                                        String TAG = t7.m;
                                        Intrinsics.e(TAG, "TAG");
                                        ((A5) interfaceC3333z5).a(TAG, "Page-view impression record request");
                                    }
                                    c3049h8B.a("page_view", mapA, (L7) null, t7.j);
                                } else {
                                    t7.o.add(c3049h8B);
                                }
                            }
                        }
                    }
                }
                int i4 = d8.k;
                if (i4 == 0) {
                    i3 = 8388611;
                } else {
                    i3 = i4 == d8.f22768c.d() - 1 ? 8388613 : 1;
                }
                layoutParams2.gravity = i3;
            }
            ViewPager viewPager2 = this.f23180c;
            if (viewPager2 != null) {
                viewPager2.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        Point point = this.d;
        point.x = i2 / 2;
        point.y = i3 / 2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        double dCeil;
        double dCeil2;
        int i2;
        ViewPager viewPager;
        Intrinsics.f(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.f23181e.x = (int) ev.getX();
            this.f23181e.y = (int) ev.getY();
            Point point = this.d;
            int i3 = point.x;
            Point point2 = this.f23181e;
            ev.offsetLocation(i3 - point2.x, point.y - point2.y);
        } else if (action != 1) {
            Point point3 = this.d;
            int i4 = point3.x;
            Point point4 = this.f23181e;
            ev.offsetLocation(i4 - point4.x, point3.y - point4.y);
        } else {
            float f = this.f23181e.x;
            float x = ev.getX();
            ViewPager viewPager2 = this.f23180c;
            Intrinsics.c(viewPager2);
            int currentItem = viewPager2.getCurrentItem();
            PagerAdapter adapter = this.f23180c.getAdapter();
            Intrinsics.c(adapter);
            int count = adapter.getCount();
            int width = this.f23180c.getWidth();
            int width2 = getWidth();
            if (currentItem == 0 || count - 1 == currentItem) {
                int i5 = width2 - width;
                if (currentItem == 0) {
                    float f2 = i5;
                    if (f > f2 && x > f2) {
                        dCeil2 = Math.ceil((x - f2) / width);
                        i2 = (int) dCeil2;
                    }
                    if (i2 != 0) {
                        ev.setAction(3);
                        viewPager = this.f23180c;
                        if (viewPager != null) {
                            viewPager.setCurrentItem(viewPager.getCurrentItem() + i2);
                        }
                    }
                    Point point5 = this.d;
                    int i6 = point5.x;
                    Point point6 = this.f23181e;
                    ev.offsetLocation(i6 - point6.x, point5.y - point6.y);
                } else {
                    float f3 = i5;
                    if (f < f3 && x < f3) {
                        dCeil = Math.ceil((f3 - x) / width);
                        dCeil2 = -dCeil;
                        i2 = (int) dCeil2;
                    }
                    if (i2 != 0) {
                        ev.setAction(3);
                        viewPager = this.f23180c;
                        if (viewPager != null) {
                            viewPager.setCurrentItem(viewPager.getCurrentItem() + i2);
                        }
                    }
                    Point point7 = this.d;
                    int i7 = point7.x;
                    Point point8 = this.f23181e;
                    ev.offsetLocation(i7 - point8.x, point7.y - point8.y);
                }
                i2 = 0;
                if (i2 != 0) {
                    ev.setAction(3);
                    viewPager = this.f23180c;
                    if (viewPager != null) {
                        viewPager.setCurrentItem(viewPager.getCurrentItem() + i2);
                    }
                }
                Point point9 = this.d;
                int i8 = point9.x;
                Point point10 = this.f23181e;
                ev.offsetLocation(i8 - point10.x, point9.y - point10.y);
            } else {
                float f4 = (width2 - width) / 2;
                if (f >= f4 || x >= f4) {
                    float f5 = (width2 + width) / 2;
                    if (f <= f5 || x <= f5) {
                        i2 = 0;
                    } else {
                        dCeil2 = Math.ceil((x - f5) / width);
                    }
                    if (i2 != 0) {
                        ev.setAction(3);
                        viewPager = this.f23180c;
                        if (viewPager != null) {
                            viewPager.setCurrentItem(viewPager.getCurrentItem() + i2);
                        }
                    }
                    Point point11 = this.d;
                    int i9 = point11.x;
                    Point point12 = this.f23181e;
                    ev.offsetLocation(i9 - point12.x, point11.y - point12.y);
                } else {
                    dCeil = Math.ceil((f4 - x) / width);
                    dCeil2 = -dCeil;
                }
                i2 = (int) dCeil2;
                if (i2 != 0) {
                    ev.setAction(3);
                    viewPager = this.f23180c;
                    if (viewPager != null) {
                        viewPager.setCurrentItem(viewPager.getCurrentItem() + i2);
                    }
                }
                Point point13 = this.d;
                int i10 = point13.x;
                Point point14 = this.f23181e;
                ev.offsetLocation(i10 - point14.x, point13.y - point14.y);
            }
        }
        ViewPager viewPager3 = this.f23180c;
        if (viewPager3 != null) {
            return viewPager3.dispatchTouchEvent(ev);
        }
        return false;
    }
}
