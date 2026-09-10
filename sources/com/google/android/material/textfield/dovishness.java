package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: IndicatorViewController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dovishness {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f21167adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public FrameLayout f21168apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public CharSequence f21169arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f21170attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final TimeInterpolator f21171beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Context f21172competently;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f21173cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public ColorStateList f21174cuirassed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f21175cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f21176dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public ColorStateList f21177dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public Animator f21178formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public CharSequence f21179gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f21180graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final float f21181impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final TextInputLayout f21182impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f21183kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final TimeInterpolator f21184marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public CharSequence f21185molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f21186monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public TextView f21187polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public TextView f21188preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public boolean f21189rotuma;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f21190saneness;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public Typeface f21191stratoscope;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public LinearLayout f21192taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f21193triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final TimeInterpolator f21194wireman;

    /* JADX INFO: compiled from: IndicatorViewController.java */
    public class attabal extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ int f21195attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ int f21196dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ TextView f21198saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ TextView f21199wireman;

        public attabal(int i, TextView textView, int i2, TextView textView2) {
            this.f21195attabal = i;
            this.f21198saneness = textView;
            this.f21196dern = i2;
            this.f21199wireman = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            dovishness.this.f21193triweekly = this.f21195attabal;
            dovishness.this.f21178formularize = null;
            TextView textView = this.f21198saneness;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f21196dern == 1 && dovishness.this.f21187polloi != null) {
                    dovishness.this.f21187polloi.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f21199wireman;
            if (textView2 != null) {
                textView2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.f21199wireman.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f21199wireman;
            if (textView != null) {
                textView.setVisibility(0);
                this.f21199wireman.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    /* JADX INFO: compiled from: IndicatorViewController.java */
    public class saneness extends View.AccessibilityDelegate {
        public saneness() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = dovishness.this.f21182impromptu.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public dovishness(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f21172competently = context;
        this.f21182impromptu = textInputLayout;
        this.f21181impassible = context.getResources().getDimensionPixelSize(bubbles.marial.design_textinput_caption_translate_y);
        this.f21170attabal = gown.apical.beachfront(context, bubbles.dern.motionDurationShort4, Sdk$SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
        this.f21190saneness = gown.apical.beachfront(context, bubbles.dern.motionDurationMedium4, Opcodes.GOTO);
        this.f21176dern = gown.apical.beachfront(context, bubbles.dern.motionDurationShort4, Opcodes.GOTO);
        this.f21194wireman = gown.apical.competently(context, bubbles.dern.motionEasingEmphasizedDecelerateInterpolator, phrasemonger.saneness.f35311wireman);
        int i = bubbles.dern.motionEasingEmphasizedDecelerateInterpolator;
        TimeInterpolator timeInterpolator = phrasemonger.saneness.f35307attabal;
        this.f21184marial = gown.apical.competently(context, i, timeInterpolator);
        this.f21171beachfront = gown.apical.competently(context, bubbles.dern.motionEasingLinearInterpolator, timeInterpolator);
    }

    public int adultoid() {
        TextView textView = this.f21188preprohormone;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final ObjectAnimator apical(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f21181impassible, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        objectAnimatorOfFloat.setDuration(this.f21170attabal);
        objectAnimatorOfFloat.setInterpolator(this.f21194wireman);
        return objectAnimatorOfFloat;
    }

    public CharSequence arytenoidectomy() {
        return this.f21169arytenoidectomy;
    }

    public void beachfront() {
        if (competently()) {
            EditText editText = this.f21182impromptu.getEditText();
            boolean zApical = mullein.dern.apical(this.f21172competently);
            this.f21192taiyuan.setPaddingRelative(dovishness(zApical, bubbles.marial.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingStart()), dovishness(zApical, bubbles.marial.material_helper_text_font_1_3_padding_top, this.f21172competently.getResources().getDimensionPixelSize(bubbles.marial.material_helper_text_default_padding_top)), dovishness(zApical, bubbles.marial.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingEnd()), 0);
        }
    }

    public final boolean competently() {
        return (this.f21192taiyuan == null || this.f21182impromptu.getEditText() == null) ? false : true;
    }

    public final boolean cord(int i) {
        return (i != 1 || this.f21187polloi == null || TextUtils.isEmpty(this.f21169arytenoidectomy)) ? false : true;
    }

    public void creditor(Typeface typeface) {
        if (typeface != this.f21191stratoscope) {
            this.f21191stratoscope = typeface;
            privatdozent(this.f21187polloi, typeface);
            privatdozent(this.f21188preprohormone, typeface);
        }
    }

    public final boolean cuirassed(int i) {
        return (i != 2 || this.f21188preprohormone == null || TextUtils.isEmpty(this.f21179gintrap)) ? false : true;
    }

    public final ObjectAnimator cutely(TextView textView, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        objectAnimatorOfFloat.setDuration(z ? this.f21190saneness : this.f21176dern);
        objectAnimatorOfFloat.setInterpolator(z ? this.f21184marial : this.f21171beachfront);
        return objectAnimatorOfFloat;
    }

    public final int dovishness(boolean z, int i, int i2) {
        return z ? this.f21172competently.getResources().getDimensionPixelSize(i) : i2;
    }

    public boolean formularize() {
        return cord(this.f21183kowloon);
    }

    public boolean gintrap() {
        return cuirassed(this.f21193triweekly);
    }

    public View graveside() {
        return this.f21188preprohormone;
    }

    public void grimness(boolean z) {
        if (this.f21189rotuma == z) {
            return;
        }
        impromptu();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f21172competently);
            this.f21188preprohormone = appCompatTextView;
            appCompatTextView.setId(bubbles.competently.textinput_helper_text);
            this.f21188preprohormone.setTextAlignment(5);
            Typeface typeface = this.f21191stratoscope;
            if (typeface != null) {
                this.f21188preprohormone.setTypeface(typeface);
            }
            this.f21188preprohormone.setVisibility(4);
            this.f21188preprohormone.setAccessibilityLiveRegion(1);
            seminary(this.f21173cord);
            saran(this.f21174cuirassed);
            marial(this.f21188preprohormone, 1);
            this.f21188preprohormone.setAccessibilityDelegate(new saneness());
        } else {
            preprohormone();
            yemenite(this.f21188preprohormone, 1);
            this.f21188preprohormone = null;
            this.f21182impromptu.updateEditTextBackground();
            this.f21182impromptu.updateTextInputBoxState();
        }
        this.f21189rotuma = z;
    }

    public final boolean hydrovane(TextView textView, CharSequence charSequence) {
        if (this.f21182impromptu.isLaidOut() && this.f21182impromptu.isEnabled()) {
            return (this.f21183kowloon == this.f21193triweekly && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final TextView impassible(int i) {
        if (i == 1) {
            return this.f21187polloi;
        }
        if (i != 2) {
            return null;
        }
        return this.f21188preprohormone;
    }

    public void impromptu() {
        Animator animator = this.f21178formularize;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void kattegat(int i) {
        this.f21180graveside = i;
        TextView textView = this.f21187polloi;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i);
        }
    }

    public CharSequence kowloon() {
        return this.f21185molybdenite;
    }

    public void marial(TextView textView, int i) {
        if (this.f21192taiyuan == null && this.f21168apical == null) {
            LinearLayout linearLayout = new LinearLayout(this.f21172competently);
            this.f21192taiyuan = linearLayout;
            linearLayout.setOrientation(0);
            this.f21182impromptu.addView(this.f21192taiyuan, -1, -2);
            this.f21168apical = new FrameLayout(this.f21172competently);
            this.f21192taiyuan.addView(this.f21168apical, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f21182impromptu.getEditText() != null) {
                beachfront();
            }
        }
        if (stratoscope(i)) {
            this.f21168apical.setVisibility(0);
            this.f21168apical.addView(textView);
        } else {
            this.f21192taiyuan.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f21192taiyuan.setVisibility(0);
        this.f21175cutely++;
    }

    public final void mathsort(int i, int i2, boolean z) {
        dovishness dovishnessVar;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f21178formularize = animatorSet;
            ArrayList arrayList = new ArrayList();
            dovishnessVar = this;
            dovishnessVar.taiyuan(arrayList, this.f21189rotuma, this.f21188preprohormone, 2, i, i2);
            dovishnessVar.taiyuan(arrayList, dovishnessVar.f21186monoploid, dovishnessVar.f21187polloi, 1, i, i2);
            phrasemonger.dern.attabal(animatorSet, arrayList);
            animatorSet.addListener(dovishnessVar.new attabal(i2, impassible(i), i, impassible(i2)));
            animatorSet.start();
        } else {
            dovishnessVar = this;
            sealless(i, i2);
        }
        dovishnessVar.f21182impromptu.updateEditTextBackground();
        dovishnessVar.f21182impromptu.updateLabelState(z);
        dovishnessVar.f21182impromptu.updateTextInputBoxState();
    }

    public void merc(int i) {
        this.f21167adultoid = i;
        TextView textView = this.f21187polloi;
        if (textView != null) {
            this.f21182impromptu.setTextAppearanceCompatWithErrorFallback(textView, i);
        }
    }

    public CharSequence molybdenite() {
        return this.f21179gintrap;
    }

    public int monoploid() {
        TextView textView = this.f21187polloi;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public boolean oilcan() {
        return this.f21189rotuma;
    }

    public void peridotite(CharSequence charSequence) {
        impromptu();
        this.f21179gintrap = charSequence;
        this.f21188preprohormone.setText(charSequence);
        int i = this.f21193triweekly;
        if (i != 2) {
            this.f21183kowloon = 2;
        }
        mathsort(i, this.f21183kowloon, hydrovane(this.f21188preprohormone, charSequence));
    }

    public void polder(ColorStateList colorStateList) {
        this.f21177dovishness = colorStateList;
        TextView textView = this.f21187polloi;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public ColorStateList polloi() {
        TextView textView = this.f21187polloi;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public void preprohormone() {
        impromptu();
        int i = this.f21193triweekly;
        if (i == 2) {
            this.f21183kowloon = 0;
        }
        mathsort(i, this.f21183kowloon, hydrovane(this.f21188preprohormone, ""));
    }

    public final void privatdozent(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void restrictive(boolean z) {
        if (this.f21186monoploid == z) {
            return;
        }
        impromptu();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f21172competently);
            this.f21187polloi = appCompatTextView;
            appCompatTextView.setId(bubbles.competently.textinput_error);
            this.f21187polloi.setTextAlignment(5);
            Typeface typeface = this.f21191stratoscope;
            if (typeface != null) {
                this.f21187polloi.setTypeface(typeface);
            }
            merc(this.f21167adultoid);
            polder(this.f21177dovishness);
            supplicat(this.f21185molybdenite);
            kattegat(this.f21180graveside);
            this.f21187polloi.setVisibility(4);
            marial(this.f21187polloi, 0);
        } else {
            rotuma();
            yemenite(this.f21187polloi, 0);
            this.f21187polloi = null;
            this.f21182impromptu.updateEditTextBackground();
            this.f21182impromptu.updateTextInputBoxState();
        }
        this.f21186monoploid = z;
    }

    public void rotuma() {
        this.f21169arytenoidectomy = null;
        impromptu();
        if (this.f21193triweekly == 1) {
            if (!this.f21189rotuma || TextUtils.isEmpty(this.f21179gintrap)) {
                this.f21183kowloon = 0;
            } else {
                this.f21183kowloon = 2;
            }
        }
        mathsort(this.f21193triweekly, this.f21183kowloon, hydrovane(this.f21187polloi, ""));
    }

    public void saran(ColorStateList colorStateList) {
        this.f21174cuirassed = colorStateList;
        TextView textView = this.f21188preprohormone;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void sealless(int i, int i2) {
        TextView textViewImpassible;
        TextView textViewImpassible2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (textViewImpassible2 = impassible(i2)) != null) {
            textViewImpassible2.setVisibility(0);
            textViewImpassible2.setAlpha(1.0f);
        }
        if (i != 0 && (textViewImpassible = impassible(i)) != null) {
            textViewImpassible.setVisibility(4);
            if (i == 1) {
                textViewImpassible.setText((CharSequence) null);
            }
        }
        this.f21193triweekly = i2;
    }

    public void seminary(int i) {
        this.f21173cord = i;
        TextView textView = this.f21188preprohormone;
        if (textView != null) {
            androidx.core.widget.formularize.impassible(textView, i);
        }
    }

    public final void starveling(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public boolean stratoscope(int i) {
        return i == 0 || i == 1;
    }

    public void supplicat(CharSequence charSequence) {
        this.f21185molybdenite = charSequence;
        TextView textView = this.f21187polloi;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public final void taiyuan(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorCutely = cutely(textView, i3 == i);
            if (i == i3 && i2 != 0) {
                objectAnimatorCutely.setStartDelay(this.f21176dern);
            }
            list.add(objectAnimatorCutely);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorApical = apical(textView);
            objectAnimatorApical.setStartDelay(this.f21176dern);
            list.add(objectAnimatorApical);
        }
    }

    public int triweekly() {
        return this.f21180graveside;
    }

    public boolean trm() {
        return this.f21186monoploid;
    }

    public void walach(CharSequence charSequence) {
        impromptu();
        this.f21169arytenoidectomy = charSequence;
        this.f21187polloi.setText(charSequence);
        int i = this.f21193triweekly;
        if (i != 1) {
            this.f21183kowloon = 1;
        }
        mathsort(i, this.f21183kowloon, hydrovane(this.f21187polloi, charSequence));
    }

    public void yemenite(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f21192taiyuan == null) {
            return;
        }
        if (!stratoscope(i) || (frameLayout = this.f21168apical) == null) {
            this.f21192taiyuan.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.f21175cutely - 1;
        this.f21175cutely = i2;
        starveling(this.f21192taiyuan, i2);
    }
}
