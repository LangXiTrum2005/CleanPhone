package gown;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: MaterialBottomContainerBackHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront extends gown.attabal<View> {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final float f27398competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final float f27399impromptu;

    /* JADX INFO: compiled from: MaterialBottomContainerBackHelper.java */
    public class attabal extends AnimatorListenerAdapter {
        public attabal() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            beachfront.this.f27396saneness.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            beachfront.this.apical(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public beachfront(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f27398competently = resources.getDimension(bubbles.marial.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f27399impromptu = resources.getDimension(bubbles.marial.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public void apical(float f) {
        float fAttabal = attabal(f);
        float width = this.f27396saneness.getWidth();
        float height = this.f27396saneness.getHeight();
        if (width <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float f2 = this.f27398competently / width;
        float f3 = this.f27399impromptu / height;
        float fAttabal2 = 1.0f - phrasemonger.saneness.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, fAttabal);
        float fAttabal3 = 1.0f - phrasemonger.saneness.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, fAttabal);
        if (Float.isNaN(fAttabal2) || Float.isNaN(fAttabal3)) {
            return;
        }
        this.f27396saneness.setScaleX(fAttabal2);
        this.f27396saneness.setPivotY(height);
        this.f27396saneness.setScaleY(fAttabal3);
        V v = this.f27396saneness;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fAttabal3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? fAttabal2 / fAttabal3 : 1.0f);
            }
        }
    }

    public void beachfront() {
        if (super.saneness() == null) {
            return;
        }
        Animator animatorCompetently = competently();
        animatorCompetently.setDuration(this.f27395marial);
        animatorCompetently.start();
    }

    public final Animator competently() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f27396saneness, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f27396saneness, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v = this.f27396saneness;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new fastrack.saneness());
        return animatorSet;
    }

    public void cutely(androidx.p000activity.saneness sanenessVar) {
        super.wireman(sanenessVar);
    }

    public void formularize(androidx.p000activity.saneness sanenessVar) {
        if (super.marial(sanenessVar) == null) {
            return;
        }
        apical(sanenessVar.getProgress());
    }

    public void impromptu(androidx.p000activity.saneness sanenessVar, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27396saneness, (Property<V, Float>) View.TRANSLATION_Y, this.f27396saneness.getHeight() * this.f27396saneness.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new fastrack.saneness());
        objectAnimatorOfFloat.setDuration(phrasemonger.saneness.dern(this.f27394dern, this.f27397wireman, sanenessVar.getProgress()));
        objectAnimatorOfFloat.addListener(new attabal());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void taiyuan(androidx.p000activity.saneness sanenessVar, Animator.AnimatorListener animatorListener) {
        Animator animatorCompetently = competently();
        animatorCompetently.setDuration(phrasemonger.saneness.dern(this.f27394dern, this.f27397wireman, sanenessVar.getProgress()));
        if (animatorListener != null) {
            animatorCompetently.addListener(animatorListener);
        }
        animatorCompetently.start();
    }
}
