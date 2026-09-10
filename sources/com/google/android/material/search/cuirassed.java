package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;

/* JADX INFO: compiled from: SearchViewAnimationHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class cuirassed {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final ImageButton f20833apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public SearchBar f20834arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SearchView f20835attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Toolbar f20836beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Toolbar f20837competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final EditText f20838cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f20839dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final View f20840formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final TouchObserverFrameLayout f20841impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final LinearLayout f20842impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public AnimatorSet f20843kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final FrameLayout f20844marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final View f20845saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final TextView f20846taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final gown.taiyuan f20847triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final FrameLayout f20848wireman;

    /* JADX INFO: compiled from: SearchViewAnimationHelper.java */
    public class attabal extends AnimatorListenerAdapter {
        public attabal() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!cuirassed.this.f20835attabal.isAdjustNothingSoftInputMode()) {
                cuirassed.this.f20835attabal.requestFocusAndShowKeyboardIfNeeded();
            }
            cuirassed.this.f20835attabal.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            cuirassed.this.f20839dern.setVisibility(0);
            cuirassed.this.f20834arytenoidectomy.coffeecake();
        }
    }

    /* JADX INFO: compiled from: SearchViewAnimationHelper.java */
    public class dern extends AnimatorListenerAdapter {
        public dern() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!cuirassed.this.f20835attabal.isAdjustNothingSoftInputMode()) {
                cuirassed.this.f20835attabal.requestFocusAndShowKeyboardIfNeeded();
            }
            cuirassed.this.f20835attabal.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            cuirassed.this.f20839dern.setVisibility(0);
            cuirassed.this.f20835attabal.setTransitionState(SearchView.TransitionState.SHOWING);
        }
    }

    /* JADX INFO: compiled from: SearchViewAnimationHelper.java */
    public class marial extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ boolean f20851attabal;

        public marial(boolean z) {
            this.f20851attabal = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            cuirassed.this.milliradian(this.f20851attabal ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            cuirassed.this.f20838cutely.setAlpha(1.0f);
            if (cuirassed.this.f20834arytenoidectomy != null) {
                cuirassed.this.f20834arytenoidectomy.getTextView().setAlpha(1.0f);
            }
            cuirassed.this.f20838cutely.setClipBounds(null);
            cuirassed.this.f20839dern.resetClipBoundsAndCornerRadii();
            if (this.f20851attabal) {
                return;
            }
            cuirassed.this.f20847triweekly.cutely();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            cuirassed.this.milliradian(this.f20851attabal ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        }
    }

    /* JADX INFO: compiled from: SearchViewAnimationHelper.java */
    public class saneness extends AnimatorListenerAdapter {
        public saneness() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            cuirassed.this.f20839dern.setVisibility(8);
            if (!cuirassed.this.f20835attabal.isAdjustNothingSoftInputMode()) {
                cuirassed.this.f20835attabal.clearFocusAndHideKeyboard();
            }
            cuirassed.this.f20835attabal.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            cuirassed.this.f20835attabal.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* JADX INFO: compiled from: SearchViewAnimationHelper.java */
    public class wireman extends AnimatorListenerAdapter {
        public wireman() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            cuirassed.this.f20839dern.setVisibility(8);
            if (!cuirassed.this.f20835attabal.isAdjustNothingSoftInputMode()) {
                cuirassed.this.f20835attabal.clearFocusAndHideKeyboard();
            }
            cuirassed.this.f20835attabal.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            cuirassed.this.f20835attabal.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    public cuirassed(SearchView searchView) {
        this.f20835attabal = searchView;
        this.f20845saneness = searchView.scrim;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.rootView;
        this.f20839dern = clippableRoundedCornerLayout;
        this.f20848wireman = searchView.headerContainer;
        this.f20844marial = searchView.toolbarContainer;
        this.f20836beachfront = searchView.toolbar;
        this.f20837competently = searchView.dummyToolbar;
        this.f20846taiyuan = searchView.searchPrefix;
        this.f20838cutely = searchView.editText;
        this.f20833apical = searchView.clearButton;
        this.f20840formularize = searchView.divider;
        this.f20841impassible = searchView.contentContainer;
        this.f20842impromptu = searchView.textContainer;
        this.f20847triweekly = new gown.taiyuan(clippableRoundedCornerLayout);
    }

    public static /* synthetic */ void attabal(cuirassed cuirassedVar) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = cuirassedVar.f20839dern;
        clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
        AnimatorSet animatorSetHydrovane = cuirassedVar.hydrovane(true);
        animatorSetHydrovane.addListener(cuirassedVar.new dern());
        animatorSetHydrovane.start();
    }

    public static /* synthetic */ void competently(cuirassed cuirassedVar, float f, float[] fArr, Rect rect, ValueAnimator valueAnimator) {
        cuirassedVar.getClass();
        cuirassedVar.f20839dern.updateClipBoundsAndCornerRadii(rect, permissivist(f, fArr, valueAnimator.getAnimatedFraction()));
    }

    public static float[] cultivated(float[] fArr, float[] fArr2) {
        return new float[]{Math.max(fArr[0], fArr2[0]), Math.max(fArr[1], fArr2[1]), Math.max(fArr[2], fArr2[2]), Math.max(fArr[3], fArr2[3]), Math.max(fArr[4], fArr2[4]), Math.max(fArr[5], fArr2[5]), Math.max(fArr[6], fArr2[6]), Math.max(fArr[7], fArr2[7])};
    }

    public static /* synthetic */ void dern(cuirassed cuirassedVar, Rect rect, ValueAnimator valueAnimator) {
        cuirassedVar.getClass();
        rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        cuirassedVar.f20838cutely.setClipBounds(rect);
    }

    public static float[] permissivist(float f, float[] fArr, float f2) {
        return new float[]{phrasemonger.saneness.attabal(f, fArr[0], f2), phrasemonger.saneness.attabal(f, fArr[1], f2), phrasemonger.saneness.attabal(f, fArr[2], f2), phrasemonger.saneness.attabal(f, fArr[3], f2), phrasemonger.saneness.attabal(f, fArr[4], f2), phrasemonger.saneness.attabal(f, fArr[5], f2), phrasemonger.saneness.attabal(f, fArr[6], f2), phrasemonger.saneness.attabal(f, fArr[7], f2)};
    }

    public static /* synthetic */ void saneness(cuirassed cuirassedVar, ValueAnimator valueAnimator) {
        cuirassedVar.f20838cutely.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        cuirassedVar.f20834arytenoidectomy.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void wireman(cuirassed cuirassedVar) {
        AnimatorSet animatorSetMerc = cuirassedVar.merc(true);
        animatorSetMerc.addListener(cuirassedVar.new attabal());
        animatorSetMerc.start();
    }

    public final void adultoid(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof com.google.android.material.internal.beachfront) {
            final com.google.android.material.internal.beachfront beachfrontVar = (com.google.android.material.internal.beachfront) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.dovishness
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    beachfrontVar.attabal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    public final void arytenoidectomy(AnimatorSet animatorSet, final ImageButton imageButton) {
        SearchBar searchBar = this.f20834arytenoidectomy;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.cord
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                imageButton.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    public final int clubfoot(View view) {
        int top = view.getTop();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.f20835attabal.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return top;
    }

    public void coffeecake(SearchBar searchBar) {
        this.f20834arytenoidectomy = searchBar;
    }

    public final void coi() {
        if (this.f20835attabal.isAdjustNothingSoftInputMode()) {
            this.f20835attabal.requestFocusAndShowKeyboardIfNeeded();
        }
        this.f20835attabal.setTransitionState(SearchView.TransitionState.SHOWING);
        lerp();
        this.f20838cutely.setText(this.f20834arytenoidectomy.getText());
        EditText editText = this.f20838cutely;
        editText.setSelection(editText.getText().length());
        this.f20839dern.setVisibility(4);
        this.f20839dern.post(new Runnable() { // from class: com.google.android.material.search.adultoid
            @Override // java.lang.Runnable
            public final void run() {
                cuirassed.wireman(this.f20827kowloon);
            }
        });
    }

    public gown.taiyuan cord() {
        return this.f20847triweekly;
    }

    public final Animator creditor(boolean z) {
        return peridotite(z, this.f20846taiyuan);
    }

    public final AnimatorSet cuirassed(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        monoploid(animatorSet);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, phrasemonger.saneness.f35310saneness));
        return animatorSet;
    }

    public final void czestochowa() {
        if (this.f20835attabal.isAdjustNothingSoftInputMode()) {
            final SearchView searchView = this.f20835attabal;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: com.google.android.material.search.rotuma
                @Override // java.lang.Runnable
                public final void run() {
                    searchView.requestFocusAndShowKeyboardIfNeeded();
                }
            }, 150L);
        }
        this.f20839dern.setVisibility(4);
        this.f20839dern.post(new Runnable() { // from class: com.google.android.material.search.preprohormone
            @Override // java.lang.Runnable
            public final void run() {
                cuirassed.attabal(this.f20869kowloon);
            }
        });
    }

    public AnimatorSet dent() {
        return this.f20834arytenoidectomy != null ? sayid() : empress();
    }

    public final void dovishness(AnimatorSet animatorSet) {
        if (this.f20834arytenoidectomy == null || TextUtils.equals(this.f20838cutely.getText(), this.f20834arytenoidectomy.getText())) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.gintrap
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cuirassed.saneness(this.f20858attabal, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    public final AnimatorSet empress() {
        if (this.f20835attabal.isAdjustNothingSoftInputMode()) {
            this.f20835attabal.clearFocusAndHideKeyboard();
        }
        AnimatorSet animatorSetHydrovane = hydrovane(false);
        animatorSetHydrovane.addListener(new wireman());
        animatorSetHydrovane.start();
        return animatorSetHydrovane;
    }

    public void gintrap() {
        this.f20847triweekly.taiyuan(this.f20834arytenoidectomy);
        AnimatorSet animatorSet = this.f20843kowloon;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f20843kowloon = null;
    }

    public final void graveside(AnimatorSet animatorSet) {
        if (this.f20834arytenoidectomy == null || !TextUtils.equals(this.f20838cutely.getText(), this.f20834arytenoidectomy.getText())) {
            return;
        }
        final Rect rect = new Rect(0, 0, this.f20838cutely.getWidth(), this.f20838cutely.getHeight());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f20834arytenoidectomy.getTextView().getWidth(), this.f20838cutely.getWidth());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.polloi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cuirassed.dern(this.f20867attabal, rect, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfInt);
    }

    public final Animator grimness(boolean z) {
        FrameLayout frameLayout = this.f20848wireman;
        return walach(z, frameLayout, polder(frameLayout), seminary());
    }

    public final AnimatorSet hydrovane(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(splinterproof());
        monoploid(animatorSet);
        animatorSet.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, phrasemonger.saneness.f35310saneness));
        animatorSet.setDuration(z ? 350L : 300L);
        return animatorSet;
    }

    public final void itchy(Toolbar toolbar) {
        ActionMenuView actionMenuViewAttabal = com.google.android.material.internal.preprohormone.attabal(toolbar);
        if (actionMenuViewAttabal != null) {
            for (int i = 0; i < actionMenuViewAttabal.getChildCount(); i++) {
                View childAt = actionMenuViewAttabal.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    public final Animator kattegat(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f20841impassible.getHeight() * 0.050000012f) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, phrasemonger.saneness.f35310saneness));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.triweekly.formularize(this.f20840formularize));
        return valueAnimatorOfFloat;
    }

    public final void kowloon(AnimatorSet animatorSet) {
        ActionMenuView actionMenuViewAttabal = com.google.android.material.internal.preprohormone.attabal(this.f20836beachfront);
        if (actionMenuViewAttabal == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(mathsort(com.google.android.material.internal.preprohormone.attabal(this.f20834arytenoidectomy), actionMenuViewAttabal), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.triweekly.apical(actionMenuViewAttabal));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(seminary(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.triweekly.formularize(actionMenuViewAttabal));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    public final void lerp() {
        Menu menu = this.f20837competently.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.f20834arytenoidectomy.getMenuResId() == -1 || !this.f20835attabal.isMenuItemsAnimated()) {
            this.f20837competently.setVisibility(8);
            return;
        }
        this.f20837competently.rotuma(this.f20834arytenoidectomy.getMenuResId());
        itchy(this.f20837competently);
        this.f20837competently.setVisibility(0);
    }

    public void lotta(androidx.p000activity.saneness sanenessVar) {
        this.f20847triweekly.dovishness(sanenessVar, this.f20834arytenoidectomy);
    }

    public final int mathsort(View view, View view2) {
        if (view != null) {
            return overspeculate(view) - overspeculate(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.f20834arytenoidectomy.getPaddingStart();
        int iOverspeculate = overspeculate(this.f20834arytenoidectomy);
        return com.google.android.material.internal.cuirassed.impassible(this.f20834arytenoidectomy) ? (((iOverspeculate + this.f20834arytenoidectomy.getWidth()) + marginStart) - paddingStart) - this.f20835attabal.getRight() : (iOverspeculate - marginStart) + paddingStart;
    }

    public final AnimatorSet merc(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f20843kowloon == null) {
            animatorSet.playTogether(cuirassed(z), stratoscope(z));
        }
        animatorSet.playTogether(privatdozent(z), saran(z), trm(z), yemenite(z), grimness(z), supplicat(z), preprohormone(z), restrictive(z), creditor(z), starveling(z));
        animatorSet.addListener(new marial(z));
        return animatorSet;
    }

    public final void milliradian(float f) {
        this.f20833apical.setAlpha(f);
        this.f20840formularize.setAlpha(f);
        this.f20841impassible.setAlpha(f);
        timberyard(f);
    }

    public final void molybdenite(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof impromptu.saneness) {
            final impromptu.saneness sanenessVar = (impromptu.saneness) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.graveside
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    sanenessVar.marial(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    public final void monoploid(AnimatorSet animatorSet) {
        ImageButton imageButtonWireman = com.google.android.material.internal.preprohormone.wireman(this.f20836beachfront);
        if (imageButtonWireman == null) {
            return;
        }
        Drawable drawableUnwrap = DrawableCompat.unwrap(imageButtonWireman.getDrawable());
        if (!this.f20835attabal.isAnimatedNavigationIcon()) {
            treadless(drawableUnwrap);
            return;
        }
        molybdenite(animatorSet, drawableUnwrap);
        adultoid(animatorSet, drawableUnwrap);
        arytenoidectomy(animatorSet, imageButtonWireman);
    }

    public void nosophobia() {
        if (this.f20834arytenoidectomy != null) {
            coi();
        } else {
            czestochowa();
        }
    }

    public final Animator oilcan(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 150L : 83L);
        valueAnimatorOfFloat.setStartDelay(z ? 75L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, phrasemonger.saneness.f35307attabal));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.triweekly.marial(this.f20840formularize, this.f20841impassible));
        return valueAnimatorOfFloat;
    }

    public final int overspeculate(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.f20835attabal.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final Animator peridotite(boolean z, View view) {
        TextView placeholderTextView = this.f20834arytenoidectomy.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z) {
            placeholderTextView = this.f20834arytenoidectomy.getTextView();
        }
        return walach(z, view, overspeculate(placeholderTextView) - (view.getLeft() + this.f20842impromptu.getLeft()), seminary());
    }

    public final int polder(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int iOverspeculate = overspeculate(this.f20834arytenoidectomy);
        return com.google.android.material.internal.cuirassed.impassible(this.f20834arytenoidectomy) ? iOverspeculate - marginEnd : ((iOverspeculate + this.f20834arytenoidectomy.getWidth()) + marginEnd) - this.f20835attabal.getWidth();
    }

    public final void polloi(AnimatorSet animatorSet) {
        ImageButton imageButtonWireman = com.google.android.material.internal.preprohormone.wireman(this.f20836beachfront);
        if (imageButtonWireman == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(mathsort(com.google.android.material.internal.preprohormone.wireman(this.f20834arytenoidectomy), imageButtonWireman), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.triweekly.apical(imageButtonWireman));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(seminary(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.triweekly.formularize(imageButtonWireman));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    public androidx.p000activity.saneness premeiotic() {
        return this.f20847triweekly.dern();
    }

    public final Animator preprohormone(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, phrasemonger.saneness.f35310saneness));
        if (this.f20835attabal.isMenuItemsAnimated()) {
            valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.internal.competently(com.google.android.material.internal.preprohormone.attabal(this.f20837competently), com.google.android.material.internal.preprohormone.attabal(this.f20836beachfront)));
        }
        return valueAnimatorOfFloat;
    }

    public final Animator privatdozent(boolean z) {
        TimeInterpolator timeInterpolator = z ? phrasemonger.saneness.f35307attabal : phrasemonger.saneness.f35310saneness;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setStartDelay(z ? 100L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.triweekly.marial(this.f20845saneness));
        return valueAnimatorOfFloat;
    }

    public final Animator restrictive(boolean z) {
        return peridotite(z, this.f20838cutely);
    }

    public void rotuma() {
        this.f20847triweekly.impassible(dent().getTotalDuration(), this.f20834arytenoidectomy);
        if (this.f20843kowloon != null) {
            stratoscope(false).start();
            this.f20843kowloon.resume();
        }
        this.f20843kowloon = null;
    }

    public final Animator saran(boolean z) {
        Rect rectArytenoidectomy = this.f20847triweekly.arytenoidectomy();
        Rect rectKowloon = this.f20847triweekly.kowloon();
        if (rectArytenoidectomy == null) {
            rectArytenoidectomy = com.google.android.material.internal.cuirassed.dern(this.f20835attabal);
        }
        if (rectKowloon == null) {
            rectKowloon = com.google.android.material.internal.cuirassed.saneness(this.f20839dern, this.f20834arytenoidectomy);
        }
        final Rect rect = new Rect(rectKowloon);
        final float cornerSize = this.f20834arytenoidectomy.getCornerSize();
        final float[] fArrCultivated = cultivated(this.f20839dern.getCornerRadii(), this.f20847triweekly.triweekly());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new com.google.android.material.internal.polloi(rect), rectKowloon, rectArytenoidectomy);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.molybdenite
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cuirassed.competently(this.f20863attabal, cornerSize, fArrCultivated, rect, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(z ? 300L : 250L);
        valueAnimatorOfObject.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, phrasemonger.saneness.f35310saneness));
        return valueAnimatorOfObject;
    }

    public final AnimatorSet sayid() {
        if (this.f20835attabal.isAdjustNothingSoftInputMode()) {
            this.f20835attabal.clearFocusAndHideKeyboard();
        }
        AnimatorSet animatorSetMerc = merc(false);
        animatorSetMerc.addListener(new saneness());
        animatorSetMerc.start();
        return animatorSetMerc;
    }

    public final Animator sealless(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, phrasemonger.saneness.f35310saneness));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.triweekly.beachfront(this.f20841impassible));
        return valueAnimatorOfFloat;
    }

    public final int seminary() {
        return (clubfoot(this.f20834arytenoidectomy) + (this.f20834arytenoidectomy.getHeight() / 2)) - (this.f20844marial.getTop() + (this.f20844marial.getHeight() / 2));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void sensatory(androidx.p000activity.saneness sanenessVar) {
        if (sanenessVar.getProgress() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        gown.taiyuan taiyuanVar = this.f20847triweekly;
        SearchBar searchBar = this.f20834arytenoidectomy;
        taiyuanVar.rotuma(sanenessVar, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.f20843kowloon;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (sanenessVar.getProgress() * this.f20843kowloon.getDuration()));
            return;
        }
        if (this.f20835attabal.isAdjustNothingSoftInputMode()) {
            this.f20835attabal.clearFocusAndHideKeyboard();
        }
        if (this.f20835attabal.isAnimatedNavigationIcon()) {
            AnimatorSet animatorSetCuirassed = cuirassed(false);
            this.f20843kowloon = animatorSetCuirassed;
            animatorSetCuirassed.start();
            this.f20843kowloon.pause();
        }
    }

    public final Animator splinterproof() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f20839dern.getHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.triweekly.formularize(this.f20839dern));
        return valueAnimatorOfFloat;
    }

    public final AnimatorSet starveling(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        dovishness(animatorSet);
        graveside(animatorSet);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, phrasemonger.saneness.f35307attabal));
        return animatorSet;
    }

    public final AnimatorSet stratoscope(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        polloi(animatorSet);
        kowloon(animatorSet);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, phrasemonger.saneness.f35310saneness));
        return animatorSet;
    }

    public final Animator supplicat(boolean z) {
        Toolbar toolbar = this.f20837competently;
        return walach(z, toolbar, polder(toolbar), seminary());
    }

    public final void timberyard(float f) {
        ActionMenuView actionMenuViewAttabal;
        if (!this.f20835attabal.isMenuItemsAnimated() || (actionMenuViewAttabal = com.google.android.material.internal.preprohormone.attabal(this.f20836beachfront)) == null) {
            return;
        }
        actionMenuViewAttabal.setAlpha(f);
    }

    public final void treadless(Drawable drawable) {
        if (drawable instanceof impromptu.saneness) {
            ((impromptu.saneness) drawable).marial(1.0f);
        }
        if (drawable instanceof com.google.android.material.internal.beachfront) {
            ((com.google.android.material.internal.beachfront) drawable).attabal(1.0f);
        }
    }

    public final Animator trm(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 50L : 42L);
        valueAnimatorOfFloat.setStartDelay(z ? 250L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, phrasemonger.saneness.f35307attabal));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.triweekly.marial(this.f20833apical));
        return valueAnimatorOfFloat;
    }

    public final Animator walach(boolean z, View view, int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.triweekly.apical(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.triweekly.formularize(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.molybdenite.attabal(z, phrasemonger.saneness.f35310saneness));
        return animatorSet;
    }

    public final Animator yemenite(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(oilcan(z), kattegat(z), sealless(z));
        return animatorSet;
    }
}
