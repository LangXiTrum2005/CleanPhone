package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: OrientationHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RecyclerView.kowloon f13480attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Rect f13481dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f13482saneness;

    /* JADX INFO: compiled from: OrientationHelper.java */
    public class attabal extends taiyuan {
        public attabal(RecyclerView.kowloon kowloonVar) {
            super(kowloonVar, null);
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int beachfront(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f13480attabal.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int competently(View view) {
            return this.f13480attabal.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int cutely() {
            return this.f13480attabal.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int formularize() {
            return this.f13480attabal.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int impassible() {
            return this.f13480attabal.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int impromptu() {
            return this.f13480attabal.getWidth();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int kowloon() {
            return (this.f13480attabal.getWidth() - this.f13480attabal.getPaddingLeft()) - this.f13480attabal.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int marial(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f13480attabal.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public void molybdenite(int i) {
            this.f13480attabal.offsetChildrenHorizontal(i);
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int monoploid(View view) {
            this.f13480attabal.getTransformedBoundingBox(view, true, this.f13481dern);
            return this.f13481dern.right;
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int polloi(View view) {
            this.f13480attabal.getTransformedBoundingBox(view, true, this.f13481dern);
            return this.f13481dern.left;
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int taiyuan() {
            return this.f13480attabal.getWidth() - this.f13480attabal.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int triweekly() {
            return this.f13480attabal.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int wireman(View view) {
            return this.f13480attabal.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }
    }

    /* JADX INFO: compiled from: OrientationHelper.java */
    public class saneness extends taiyuan {
        public saneness(RecyclerView.kowloon kowloonVar) {
            super(kowloonVar, null);
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int beachfront(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f13480attabal.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int competently(View view) {
            return this.f13480attabal.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int cutely() {
            return this.f13480attabal.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int formularize() {
            return this.f13480attabal.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int impassible() {
            return this.f13480attabal.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int impromptu() {
            return this.f13480attabal.getHeight();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int kowloon() {
            return (this.f13480attabal.getHeight() - this.f13480attabal.getPaddingTop()) - this.f13480attabal.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int marial(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f13480attabal.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public void molybdenite(int i) {
            this.f13480attabal.offsetChildrenVertical(i);
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int monoploid(View view) {
            this.f13480attabal.getTransformedBoundingBox(view, true, this.f13481dern);
            return this.f13481dern.bottom;
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int polloi(View view) {
            this.f13480attabal.getTransformedBoundingBox(view, true, this.f13481dern);
            return this.f13481dern.top;
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int taiyuan() {
            return this.f13480attabal.getHeight() - this.f13480attabal.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int triweekly() {
            return this.f13480attabal.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.taiyuan
        public int wireman(View view) {
            return this.f13480attabal.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }
    }

    public /* synthetic */ taiyuan(RecyclerView.kowloon kowloonVar, attabal attabalVar) {
        this(kowloonVar);
    }

    public static taiyuan attabal(RecyclerView.kowloon kowloonVar) {
        return new attabal(kowloonVar);
    }

    public static taiyuan dern(RecyclerView.kowloon kowloonVar) {
        return new saneness(kowloonVar);
    }

    public static taiyuan saneness(RecyclerView.kowloon kowloonVar, int i) {
        if (i == 0) {
            return attabal(kowloonVar);
        }
        if (i == 1) {
            return dern(kowloonVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public RecyclerView.kowloon apical() {
        return this.f13480attabal;
    }

    public int arytenoidectomy() {
        if (Integer.MIN_VALUE == this.f13482saneness) {
            return 0;
        }
        return kowloon() - this.f13482saneness;
    }

    public abstract int beachfront(View view);

    public abstract int competently(View view);

    public abstract int cutely();

    public abstract int formularize();

    public void graveside() {
        this.f13482saneness = kowloon();
    }

    public abstract int impassible();

    public abstract int impromptu();

    public abstract int kowloon();

    public abstract int marial(View view);

    public abstract void molybdenite(int i);

    public abstract int monoploid(View view);

    public abstract int polloi(View view);

    public abstract int taiyuan();

    public abstract int triweekly();

    public abstract int wireman(View view);

    public taiyuan(RecyclerView.kowloon kowloonVar) {
        this.f13482saneness = Integer.MIN_VALUE;
        this.f13481dern = new Rect();
        this.f13480attabal = kowloonVar;
    }
}
