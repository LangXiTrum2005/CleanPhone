package androidx.viewpager2.widget;

import android.support.v4.media.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class ScrollEventAdapter extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager2.OnPageChangeCallback f8543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f8544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f8545c;
    public final LinearLayoutManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8546e;
    public int f;
    public final ScrollEventValues g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8548i;
    public boolean j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8549l;

    public static final class ScrollEventValues {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8552c;
    }

    public ScrollEventAdapter(ViewPager2 viewPager2) {
        this.f8544b = viewPager2;
        RecyclerView recyclerView = viewPager2.n0;
        this.f8545c = recyclerView;
        this.d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.g = new ScrollEventValues();
        b();
    }

    public final void a(int i2) {
        if ((this.f8546e == 3 && this.f == 0) || this.f == i2) {
            return;
        }
        this.f = i2;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f8543a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.a(i2);
        }
    }

    public final void b() {
        this.f8546e = 0;
        this.f = 0;
        ScrollEventValues scrollEventValues = this.g;
        scrollEventValues.f8550a = -1;
        scrollEventValues.f8551b = 0.0f;
        scrollEventValues.f8552c = 0;
        this.f8547h = -1;
        this.f8548i = -1;
        this.j = false;
        this.k = false;
        this.f8549l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0129  */
    /* JADX WARN: Code duplicated, block: B:67:0x0133 A[LOOP:2: B:64:0x0127->B:67:0x0133, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0136 A[SYNTHETIC] */
    public final void c() {
        int top2;
        int childCount;
        int top3;
        int i2;
        int bottom;
        int i3;
        LinearLayoutManager linearLayoutManager = this.d;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        ScrollEventValues scrollEventValues = this.g;
        scrollEventValues.f8550a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            scrollEventValues.f8550a = -1;
            scrollEventValues.f8551b = 0.0f;
            scrollEventValues.f8552c = 0;
            return;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            scrollEventValues.f8550a = -1;
            scrollEventValues.f8551b = 0.0f;
            scrollEventValues.f8552c = 0;
            return;
        }
        int leftDecorationWidth = linearLayoutManager.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = linearLayoutManager.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = linearLayoutManager.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = linearLayoutManager.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        int orientation = linearLayoutManager.getOrientation();
        RecyclerView recyclerView = this.f8545c;
        if (orientation == 0) {
            top2 = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - recyclerView.getPaddingLeft();
            if (this.f8544b.k0.getLayoutDirection() == 1) {
                top2 = -top2;
            }
            height = width;
        } else {
            top2 = (viewFindViewByPosition.getTop() - topDecorationHeight) - recyclerView.getPaddingTop();
        }
        int i4 = -top2;
        scrollEventValues.f8552c = i4;
        if (i4 >= 0) {
            scrollEventValues.f8551b = height != 0 ? i4 / height : 0.0f;
            return;
        }
        int childCount2 = linearLayoutManager.getChildCount();
        if (childCount2 != 0) {
            boolean z2 = linearLayoutManager.getOrientation() == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount2, 2);
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt = linearLayoutManager.getChildAt(i5);
                if (childAt == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : AnimateLayoutChangeDetector.f8538a;
                int[] iArr2 = iArr[i5];
                if (z2) {
                    top3 = childAt.getLeft();
                    i2 = marginLayoutParams2.leftMargin;
                } else {
                    top3 = childAt.getTop();
                    i2 = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top3 - i2;
                int[] iArr3 = iArr[i5];
                if (z2) {
                    bottom = childAt.getRight();
                    i3 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i3 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i3;
            }
            Arrays.sort(iArr, new AnimateLayoutChangeDetector.AnonymousClass1());
            int i6 = 1;
            while (true) {
                if (i6 >= childCount2) {
                    int[] iArr4 = iArr[0];
                    int i7 = iArr4[1];
                    int i8 = iArr4[0];
                    int i9 = i7 - i8;
                    if (i8 <= 0 && iArr[childCount2 - 1][1] >= i9) {
                        if (linearLayoutManager.getChildCount() <= 1) {
                        }
                    }
                } else if (iArr[i6 - 1][1] == iArr[i6][0]) {
                    i6++;
                }
                childCount = linearLayoutManager.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    if (!AnimateLayoutChangeDetector.a(linearLayoutManager.getChildAt(i10))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.getChildCount() <= 1) {
            childCount = linearLayoutManager.getChildCount();
            while (i10 < childCount) {
                if (!AnimateLayoutChangeDetector.a(linearLayoutManager.getChildAt(i10))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        Locale locale = Locale.US;
        throw new IllegalStateException(a.h(scrollEventValues.f8552c, "Page can only be offset by a positive amount, not by "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback;
        ViewPager2.OnPageChangeCallback onPageChangeCallback2;
        int i3 = this.f8546e;
        boolean z2 = true;
        if (!(i3 == 1 && this.f == 1) && i2 == 1) {
            this.f8546e = 1;
            int i4 = this.f8548i;
            if (i4 != -1) {
                this.f8547h = i4;
                this.f8548i = -1;
            } else if (this.f8547h == -1) {
                this.f8547h = this.d.findFirstVisibleItemPosition();
            }
            a(1);
            return;
        }
        if ((i3 == 1 || i3 == 4) && i2 == 2) {
            if (this.k) {
                a(2);
                this.j = true;
                return;
            }
            return;
        }
        if (i3 != 1 && i3 != 4) {
            z2 = false;
        }
        ScrollEventValues scrollEventValues = this.g;
        if (z2 && i2 == 0) {
            c();
            if (!this.k) {
                int i5 = scrollEventValues.f8550a;
                if (i5 != -1 && (onPageChangeCallback2 = this.f8543a) != null) {
                    onPageChangeCallback2.b(i5, 0.0f, 0);
                }
            } else if (scrollEventValues.f8552c == 0) {
                int i6 = this.f8547h;
                int i7 = scrollEventValues.f8550a;
                if (i6 != i7 && (onPageChangeCallback = this.f8543a) != null) {
                    onPageChangeCallback.c(i7);
                }
            }
            a(0);
            b();
        }
        if (this.f8546e == 2 && i2 == 0 && this.f8549l) {
            c();
            if (scrollEventValues.f8552c == 0) {
                int i8 = this.f8548i;
                int i9 = scrollEventValues.f8550a;
                if (i8 != i9) {
                    if (i9 == -1) {
                        i9 = 0;
                    }
                    ViewPager2.OnPageChangeCallback onPageChangeCallback3 = this.f8543a;
                    if (onPageChangeCallback3 != null) {
                        onPageChangeCallback3.c(i9);
                    }
                }
                a(0);
                b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        int i4;
        ViewPager2.OnPageChangeCallback onPageChangeCallback;
        this.k = true;
        c();
        boolean z2 = this.j;
        ScrollEventValues scrollEventValues = this.g;
        if (z2) {
            this.j = false;
            if (i3 <= 0) {
                if (i3 == 0) {
                    if ((i2 < 0) == (this.f8544b.k0.getLayoutDirection() == 1)) {
                        if (scrollEventValues.f8552c != 0) {
                            i4 = scrollEventValues.f8550a + 1;
                        }
                    }
                }
                i4 = scrollEventValues.f8550a;
            } else if (scrollEventValues.f8552c != 0) {
                i4 = scrollEventValues.f8550a + 1;
            } else {
                i4 = scrollEventValues.f8550a;
            }
            this.f8548i = i4;
            if (this.f8547h != i4 && (onPageChangeCallback = this.f8543a) != null) {
                onPageChangeCallback.c(i4);
            }
        } else if (this.f8546e == 0) {
            int i5 = scrollEventValues.f8550a;
            if (i5 == -1) {
                i5 = 0;
            }
            ViewPager2.OnPageChangeCallback onPageChangeCallback2 = this.f8543a;
            if (onPageChangeCallback2 != null) {
                onPageChangeCallback2.c(i5);
            }
        }
        int i6 = scrollEventValues.f8550a;
        if (i6 == -1) {
            i6 = 0;
        }
        float f = scrollEventValues.f8551b;
        int i7 = scrollEventValues.f8552c;
        ViewPager2.OnPageChangeCallback onPageChangeCallback3 = this.f8543a;
        if (onPageChangeCallback3 != null) {
            onPageChangeCallback3.b(i6, f, i7);
        }
        int i8 = scrollEventValues.f8550a;
        int i9 = this.f8548i;
        if ((i8 == i9 || i9 == -1) && scrollEventValues.f8552c == 0 && this.f != 1) {
            a(0);
            b();
        }
    }
}
