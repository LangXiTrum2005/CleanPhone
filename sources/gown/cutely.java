package gown;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: MaterialSideContainerBackHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class cutely extends gown.attabal<View> {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final float f27401competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final float f27402impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final float f27403taiyuan;

    /* JADX INFO: compiled from: MaterialSideContainerBackHelper.java */
    public class attabal extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ boolean f27404attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ int f27406saneness;

        public attabal(boolean z, int i) {
            this.f27404attabal = z;
            this.f27406saneness = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            cutely.this.f27396saneness.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            cutely.this.apical(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f27404attabal, this.f27406saneness);
        }
    }

    public cutely(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f27401competently = resources.getDimension(bubbles.marial.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f27402impromptu = resources.getDimension(bubbles.marial.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f27403taiyuan = resources.getDimension(bubbles.marial.m3_back_progress_side_container_max_scale_y_distance);
    }

    public void apical(float f, boolean z, int i) {
        float fAttabal = attabal(f);
        boolean zCompetently = competently(i, 3);
        boolean z2 = z == zCompetently;
        int width = this.f27396saneness.getWidth();
        int height = this.f27396saneness.getHeight();
        float f2 = width;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f3 = height;
            if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            float f4 = this.f27401competently / f2;
            float f5 = this.f27402impromptu / f2;
            float f6 = this.f27403taiyuan / f3;
            V v = this.f27396saneness;
            if (zCompetently) {
                f2 = 0.0f;
            }
            v.setPivotX(f2);
            if (!z2) {
                f5 = -f4;
            }
            float fAttabal2 = phrasemonger.saneness.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, fAttabal);
            float f7 = fAttabal2 + 1.0f;
            float fAttabal3 = 1.0f - phrasemonger.saneness.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, fAttabal);
            if (Float.isNaN(f7) || Float.isNaN(fAttabal3)) {
                return;
            }
            this.f27396saneness.setScaleX(f7);
            this.f27396saneness.setScaleY(fAttabal3);
            V v2 = this.f27396saneness;
            if (v2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v2;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(zCompetently ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z2 ? 1.0f - fAttabal2 : 1.0f;
                    float f9 = fAttabal3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (f7 / fAttabal3) * f8 : 1.0f;
                    if (!Float.isNaN(f8) && !Float.isNaN(f9)) {
                        childAt.setScaleX(f8);
                        childAt.setScaleY(f9);
                    }
                }
            }
        }
    }

    public void beachfront() {
        if (super.saneness() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f27396saneness, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f27396saneness, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v = this.f27396saneness;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f27395marial);
        animatorSet.start();
    }

    public final boolean competently(int i, int i2) {
        return (Gravity.getAbsoluteGravity(i, this.f27396saneness.getLayoutDirection()) & i2) == i2;
    }

    public void cutely(androidx.p000activity.saneness sanenessVar) {
        super.wireman(sanenessVar);
    }

    public void formularize(androidx.p000activity.saneness sanenessVar, int i) {
        if (super.marial(sanenessVar) == null) {
            return;
        }
        apical(sanenessVar.getProgress(), sanenessVar.getSwipeEdge() == 0, i);
    }

    public void impromptu(androidx.p000activity.saneness sanenessVar, int i, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z = sanenessVar.getSwipeEdge() == 0;
        boolean zCompetently = competently(i, 3);
        float width = (this.f27396saneness.getWidth() * this.f27396saneness.getScaleX()) + taiyuan(zCompetently);
        V v = this.f27396saneness;
        Property property = View.TRANSLATION_X;
        if (zCompetently) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new fastrack.saneness());
        objectAnimatorOfFloat.setDuration(phrasemonger.saneness.dern(this.f27394dern, this.f27397wireman, sanenessVar.getProgress()));
        objectAnimatorOfFloat.addListener(new attabal(z, i));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public final int taiyuan(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f27396saneness.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }
}
