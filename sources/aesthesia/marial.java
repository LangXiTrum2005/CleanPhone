package aesthesia;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: CarouselOrientationHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f3820attabal;

    /* JADX INFO: compiled from: CarouselOrientationHelper.java */
    public class attabal extends marial {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ CarouselLayoutManager f3821saneness;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.f3821saneness = carouselLayoutManager;
        }

        @Override // aesthesia.marial
        public void apical(View view, int i, int i2) {
            int iCompetently = competently();
            this.f3821saneness.layoutDecoratedWithMargins(view, iCompetently, i, iCompetently + triweekly(view), i2);
        }

        @Override // aesthesia.marial
        public void attabal(RectF rectF, RectF rectF2, RectF rectF3) {
            float f = rectF2.top;
            float f2 = rectF3.top;
            if (f < f2 && rectF2.bottom > f2) {
                float f3 = f2 - f;
                rectF.top += f3;
                rectF3.top += f3;
            }
            float f4 = rectF2.bottom;
            float f5 = rectF3.bottom;
            if (f4 <= f5 || rectF2.top >= f5) {
                return;
            }
            float f6 = f4 - f5;
            rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
        }

        @Override // aesthesia.marial
        public int beachfront() {
            return this.f3821saneness.getHeight();
        }

        @Override // aesthesia.marial
        public int competently() {
            return this.f3821saneness.getPaddingLeft();
        }

        @Override // aesthesia.marial
        public int cutely() {
            return 0;
        }

        @Override // aesthesia.marial
        public void formularize(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                rectF.bottom = fFloor;
                rectF.top = Math.min(rectF.top, fFloor);
            }
            if (rectF2.top >= rectF3.bottom) {
                float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                rectF.top = fCeil;
                rectF.bottom = Math.max(fCeil, rectF.bottom);
            }
        }

        @Override // aesthesia.marial
        public void impassible(View view, Rect rect, float f, float f2) {
            view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
        }

        @Override // aesthesia.marial
        public int impromptu() {
            return this.f3821saneness.getWidth() - this.f3821saneness.getPaddingRight();
        }

        @Override // aesthesia.marial
        public RectF marial(float f, float f2, float f3, float f4) {
            return new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f2, f - f3);
        }

        @Override // aesthesia.marial
        public int taiyuan() {
            return cutely();
        }

        public int triweekly(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f3821saneness.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }
    }

    /* JADX INFO: compiled from: CarouselOrientationHelper.java */
    public class saneness extends marial {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ CarouselLayoutManager f3822saneness;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.f3822saneness = carouselLayoutManager;
        }

        @Override // aesthesia.marial
        public void apical(View view, int i, int i2) {
            int iCutely = cutely();
            this.f3822saneness.layoutDecoratedWithMargins(view, i, iCutely, i2, iCutely + triweekly(view));
        }

        @Override // aesthesia.marial
        public void attabal(RectF rectF, RectF rectF2, RectF rectF3) {
            float f = rectF2.left;
            float f2 = rectF3.left;
            if (f < f2 && rectF2.right > f2) {
                float f3 = f2 - f;
                rectF.left += f3;
                rectF2.left += f3;
            }
            float f4 = rectF2.right;
            float f5 = rectF3.right;
            if (f4 <= f5 || rectF2.left >= f5) {
                return;
            }
            float f6 = f4 - f5;
            rectF.right = Math.max(rectF.right - f6, rectF.left);
            rectF2.right = Math.max(rectF2.right - f6, rectF2.left);
        }

        @Override // aesthesia.marial
        public int beachfront() {
            return this.f3822saneness.getHeight() - this.f3822saneness.getPaddingBottom();
        }

        @Override // aesthesia.marial
        public int competently() {
            return 0;
        }

        @Override // aesthesia.marial
        public int cutely() {
            return this.f3822saneness.getPaddingTop();
        }

        @Override // aesthesia.marial
        public void formularize(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                rectF.right = fFloor;
                rectF.left = Math.min(rectF.left, fFloor);
            }
            if (rectF2.left >= rectF3.right) {
                float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                rectF.left = fCeil;
                rectF.right = Math.max(fCeil, rectF.right);
            }
        }

        @Override // aesthesia.marial
        public void impassible(View view, Rect rect, float f, float f2) {
            view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
        }

        @Override // aesthesia.marial
        public int impromptu() {
            return this.f3822saneness.getWidth();
        }

        @Override // aesthesia.marial
        public RectF marial(float f, float f2, float f3, float f4) {
            return new RectF(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 - f4, f);
        }

        @Override // aesthesia.marial
        public int taiyuan() {
            return this.f3822saneness.creditor() ? impromptu() : competently();
        }

        public int triweekly(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f3822saneness.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
    }

    public /* synthetic */ marial(int i, attabal attabalVar) {
        this(i);
    }

    public static marial dern(CarouselLayoutManager carouselLayoutManager, int i) {
        if (i == 0) {
            return saneness(carouselLayoutManager);
        }
        if (i == 1) {
            return wireman(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static marial saneness(CarouselLayoutManager carouselLayoutManager) {
        return new saneness(0, carouselLayoutManager);
    }

    public static marial wireman(CarouselLayoutManager carouselLayoutManager) {
        return new attabal(1, carouselLayoutManager);
    }

    public abstract void apical(View view, int i, int i2);

    public abstract void attabal(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract int beachfront();

    public abstract int competently();

    public abstract int cutely();

    public abstract void formularize(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void impassible(View view, Rect rect, float f, float f2);

    public abstract int impromptu();

    public abstract RectF marial(float f, float f2, float f3, float f4);

    public abstract int taiyuan();

    public marial(int i) {
        this.f3820attabal = i;
    }
}
