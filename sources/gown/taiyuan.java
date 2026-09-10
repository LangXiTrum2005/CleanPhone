package gown;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.cuirassed;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: MaterialMainContainerBackHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class taiyuan extends gown.attabal<View> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public Rect f27415apical;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final float f27416competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public Rect f27417cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public float[] f27418formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final float f27419impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f27420taiyuan;

    /* JADX INFO: compiled from: MaterialMainContainerBackHelper.java */
    public class attabal extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ View f27421attabal;

        public attabal(View view) {
            this.f27421attabal = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f27421attabal;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public taiyuan(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f27416competently = resources.getDimension(bubbles.marial.m3_back_progress_main_container_min_edge_gap);
        this.f27419impromptu = resources.getDimension(bubbles.marial.m3_back_progress_main_container_max_translation_y);
    }

    public static float[] molybdenite(float[] fArr, float[] fArr2, float f) {
        return new float[]{phrasemonger.saneness.attabal(fArr[0], fArr2[0], f), phrasemonger.saneness.attabal(fArr[1], fArr2[1], f), phrasemonger.saneness.attabal(fArr[2], fArr2[2], f), phrasemonger.saneness.attabal(fArr[3], fArr2[3], f), phrasemonger.saneness.attabal(fArr[4], fArr2[4], f), phrasemonger.saneness.attabal(fArr[5], fArr2[5], f), phrasemonger.saneness.attabal(fArr[6], fArr2[6], f), phrasemonger.saneness.attabal(fArr[7], fArr2[7], f)};
    }

    public static float[] polloi(float[] fArr, float f, float f2) {
        return new float[]{phrasemonger.saneness.attabal(fArr[0], f, f2), phrasemonger.saneness.attabal(fArr[1], f, f2), phrasemonger.saneness.attabal(fArr[2], f, f2), phrasemonger.saneness.attabal(fArr[3], f, f2), phrasemonger.saneness.attabal(fArr[4], f, f2), phrasemonger.saneness.attabal(fArr[5], f, f2), phrasemonger.saneness.attabal(fArr[6], f, f2), phrasemonger.saneness.attabal(fArr[7], f, f2)};
    }

    public void adultoid(float f, View view) {
        this.f27417cutely = cuirassed.dern(this.f27396saneness);
        if (view != null) {
            this.f27415apical = cuirassed.saneness(this.f27396saneness, view);
        }
        this.f27420taiyuan = f;
    }

    public final ValueAnimator apical(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: gown.competently
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                return taiyuan.molybdenite((float[]) obj, (float[]) obj2, f);
            }
        }, clippableRoundedCornerLayout.getCornerRadii(), triweekly());
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gown.impromptu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                clippableRoundedCornerLayout.updateCornerRadii((float[]) valueAnimator.getAnimatedValue());
            }
        });
        return valueAnimatorOfObject;
    }

    public Rect arytenoidectomy() {
        return this.f27417cutely;
    }

    public void cutely() {
        this.f27418formularize = null;
    }

    public void dovishness(androidx.p000activity.saneness sanenessVar, View view) {
        super.wireman(sanenessVar);
        adultoid(sanenessVar.getTouchY(), view);
    }

    public final AnimatorSet formularize(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f27396saneness, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f27396saneness, (Property<V, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f27396saneness, (Property<V, Float>) View.TRANSLATION_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(this.f27396saneness, (Property<V, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        animatorSet.addListener(new attabal(view));
        return animatorSet;
    }

    public void gintrap(float f, boolean z, float f2, float f3) {
        float fAttabal = attabal(f);
        float width = this.f27396saneness.getWidth();
        float height = this.f27396saneness.getHeight();
        if (width <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float fAttabal2 = phrasemonger.saneness.attabal(1.0f, 0.9f, fAttabal);
        float fAttabal3 = phrasemonger.saneness.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((width - (0.9f * width)) / 2.0f) - this.f27416competently), fAttabal) * (z ? 1 : -1);
        float fMin = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((height - (fAttabal2 * height)) / 2.0f) - this.f27416competently), this.f27419impromptu);
        float f4 = f2 - this.f27420taiyuan;
        float fAttabal4 = phrasemonger.saneness.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fMin, Math.abs(f4) / height) * Math.signum(f4);
        if (Float.isNaN(fAttabal2) || Float.isNaN(fAttabal3) || Float.isNaN(fAttabal4)) {
            return;
        }
        this.f27396saneness.setScaleX(fAttabal2);
        this.f27396saneness.setScaleY(fAttabal2);
        this.f27396saneness.setTranslationX(fAttabal3);
        this.f27396saneness.setTranslationY(fAttabal4);
        V v = this.f27396saneness;
        if (v instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) v).updateCornerRadii(polloi(triweekly(), f3, fAttabal));
        }
    }

    public final void graveside() {
        this.f27420taiyuan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f27417cutely = null;
        this.f27415apical = null;
    }

    public void impassible(long j, View view) {
        AnimatorSet animatorSetFormularize = formularize(view);
        animatorSetFormularize.setDuration(j);
        animatorSetFormularize.start();
        graveside();
    }

    public final float[] impromptu() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.f27396saneness.getRootWindowInsets()) == null) {
            return new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        }
        DisplayMetrics displayMetrics = this.f27396saneness.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        this.f27396saneness.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int width = this.f27396saneness.getWidth();
        int height = this.f27396saneness.getHeight();
        int iMonoploid = (i3 == 0 && i4 == 0) ? monoploid(rootWindowInsets, 0) : 0;
        int i5 = width + i3;
        int iMonoploid2 = (i5 < i || i4 != 0) ? 0 : monoploid(rootWindowInsets, 1);
        int iMonoploid3 = (i5 < i || i4 + height < i2) ? 0 : monoploid(rootWindowInsets, 2);
        int iMonoploid4 = (i3 != 0 || i4 + height < i2) ? 0 : monoploid(rootWindowInsets, 3);
        float f = iMonoploid;
        float f2 = iMonoploid2;
        float f3 = iMonoploid3;
        float f4 = iMonoploid4;
        return new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    public Rect kowloon() {
        return this.f27415apical;
    }

    public final int monoploid(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    public void rotuma(androidx.p000activity.saneness sanenessVar, View view, float f) {
        if (super.marial(sanenessVar) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        gintrap(sanenessVar.getProgress(), sanenessVar.getSwipeEdge() == 0, sanenessVar.getTouchY(), f);
    }

    public void taiyuan(View view) {
        if (super.saneness() == null) {
            return;
        }
        AnimatorSet animatorSetFormularize = formularize(view);
        V v = this.f27396saneness;
        if (v instanceof ClippableRoundedCornerLayout) {
            animatorSetFormularize.playTogether(apical((ClippableRoundedCornerLayout) v));
        }
        animatorSetFormularize.setDuration(this.f27395marial);
        animatorSetFormularize.start();
        graveside();
    }

    public float[] triweekly() {
        if (this.f27418formularize == null) {
            this.f27418formularize = impromptu();
        }
        return this.f27418formularize;
    }
}
