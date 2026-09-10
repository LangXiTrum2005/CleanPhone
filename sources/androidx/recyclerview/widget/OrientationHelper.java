package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class OrientationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.LayoutManager f8083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8084b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f8085c = new Rect();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OrientationHelper$1, reason: invalid class name */
    class AnonymousClass1 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int d(View view) {
            return this.f8083a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f8083a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f8083a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int g(View view) {
            return this.f8083a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int h() {
            return this.f8083a.getWidth();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int i() {
            RecyclerView.LayoutManager layoutManager = this.f8083a;
            return layoutManager.getWidth() - layoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int j() {
            return this.f8083a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int k() {
            return this.f8083a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int l() {
            return this.f8083a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int m() {
            return this.f8083a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int n() {
            RecyclerView.LayoutManager layoutManager = this.f8083a;
            return (layoutManager.getWidth() - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int p(View view) {
            RecyclerView.LayoutManager layoutManager = this.f8083a;
            Rect rect = this.f8085c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.right;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int q(View view) {
            RecyclerView.LayoutManager layoutManager = this.f8083a;
            Rect rect = this.f8085c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.left;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void r(int i2) {
            this.f8083a.offsetChildrenHorizontal(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OrientationHelper$2, reason: invalid class name */
    class AnonymousClass2 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int d(View view) {
            return this.f8083a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f8083a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f8083a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int g(View view) {
            return this.f8083a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int h() {
            return this.f8083a.getHeight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int i() {
            RecyclerView.LayoutManager layoutManager = this.f8083a;
            return layoutManager.getHeight() - layoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int j() {
            return this.f8083a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int k() {
            return this.f8083a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int l() {
            return this.f8083a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int m() {
            return this.f8083a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int n() {
            RecyclerView.LayoutManager layoutManager = this.f8083a;
            return (layoutManager.getHeight() - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int p(View view) {
            RecyclerView.LayoutManager layoutManager = this.f8083a;
            Rect rect = this.f8085c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.bottom;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int q(View view) {
            RecyclerView.LayoutManager layoutManager = this.f8083a;
            Rect rect = this.f8085c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.top;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void r(int i2) {
            this.f8083a.offsetChildrenVertical(i2);
        }
    }

    public OrientationHelper(RecyclerView.LayoutManager layoutManager) {
        this.f8083a = layoutManager;
    }

    public static OrientationHelper a(RecyclerView.LayoutManager layoutManager) {
        return new AnonymousClass1(layoutManager);
    }

    public static OrientationHelper b(RecyclerView.LayoutManager layoutManager, int i2) {
        if (i2 == 0) {
            return new AnonymousClass1(layoutManager);
        }
        if (i2 == 1) {
            return new AnonymousClass2(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        return new AnonymousClass2(layoutManager);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public final int o() {
        if (Integer.MIN_VALUE == this.f8084b) {
            return 0;
        }
        return n() - this.f8084b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i2);
}
