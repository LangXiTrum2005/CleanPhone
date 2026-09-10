package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import chinny.kowloon;
import chinny.polloi;
import com.unity3d.services.UnityAdsConstants;
import gown.apical;
import java.util.ArrayList;
import java.util.Iterator;
import phrasemonger.impromptu;
import phrasemonger.taiyuan;
import technofreak.cutely;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public ArrayList<beachfront> f20276adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f20277apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public kowloon f20279attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f20280beachfront;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f20284cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Drawable f20285dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final FloatingActionButton f20286dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public StateListAnimator f20287formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final nitroguanidine.saneness f20288gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f20289graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public Animator f20290impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f20291impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public taiyuan f20292kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Drawable f20293marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f20294molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f20295monoploid;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public chinny.taiyuan f20299saneness;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f20300stratoscope;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f20301taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public taiyuan f20302triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public com.google.android.material.floatingactionbutton.dern f20303wireman;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final TimeInterpolator f20274trm = phrasemonger.saneness.f35308dern;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static final int f20268oilcan = bubbles.dern.motionDurationLong2;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static final int f20275yemenite = bubbles.dern.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static final int f20271sealless = bubbles.dern.motionDurationMedium1;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public static final int f20266kattegat = bubbles.dern.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public static final int[] f20273supplicat = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public static final int[] f20270restrictive = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public static final int[] f20267merc = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public static final int[] f20269polder = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public static final int[] f20272seminary = {R.attr.state_enabled};

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public static final int[] f20265grimness = new int[0];

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f20281competently = true;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float f20278arytenoidectomy = 1.0f;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f20296polloi = 0;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final Rect f20298rotuma = new Rect();

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final RectF f20297preprohormone = new RectF();

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final RectF f20282cord = new RectF();

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final Matrix f20283cuirassed = new Matrix();

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class attabal extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f20304attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ competently f20305dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ boolean f20306saneness;

        public attabal(boolean z, competently competentlyVar) {
            this.f20306saneness = z;
            this.f20305dern = competentlyVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f20304attabal = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            marial.this.f20296polloi = 0;
            marial.this.f20290impassible = null;
            if (this.f20304attabal) {
                return;
            }
            FloatingActionButton floatingActionButton = marial.this.f20286dovishness;
            boolean z = this.f20306saneness;
            floatingActionButton.internalSetVisibility(z ? 8 : 4, z);
            competently competentlyVar = this.f20305dern;
            if (competentlyVar != null) {
                competentlyVar.saneness();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            marial.this.f20286dovishness.internalSetVisibility(0, this.f20306saneness);
            marial.this.f20296polloi = 1;
            marial.this.f20290impassible = animator;
            this.f20304attabal = false;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public interface beachfront {
        void attabal();

        void saneness();
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public interface competently {
        void attabal();

        void saneness();
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class dern extends impromptu {
        public dern() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            marial.this.f20278arytenoidectomy = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.marial$marial, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public static class C0301marial extends chinny.taiyuan {
        public C0301marial(kowloon kowloonVar) {
            super(kowloonVar);
        }

        @Override // chinny.taiyuan, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class saneness extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ boolean f20309attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ competently f20311saneness;

        public saneness(boolean z, competently competentlyVar) {
            this.f20309attabal = z;
            this.f20311saneness = competentlyVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            marial.this.f20296polloi = 0;
            marial.this.f20290impassible = null;
            competently competentlyVar = this.f20311saneness;
            if (competentlyVar != null) {
                competentlyVar.attabal();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            marial.this.f20286dovishness.internalSetVisibility(0, this.f20309attabal);
            marial.this.f20296polloi = 2;
            marial.this.f20290impassible = animator;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class wireman implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final FloatEvaluator f20312attabal = new FloatEvaluator();

        public wireman() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f, Float f2, Float f3) {
            float fFloatValue = this.f20312attabal.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    public marial(FloatingActionButton floatingActionButton, nitroguanidine.saneness sanenessVar) {
        this.f20286dovishness = floatingActionButton;
        this.f20288gintrap = sanenessVar;
    }

    public static /* synthetic */ void attabal(marial marialVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix, ValueAnimator valueAnimator) {
        marialVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        marialVar.f20286dovishness.setAlpha(phrasemonger.saneness.saneness(f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, fFloatValue));
        marialVar.f20286dovishness.setScaleX(phrasemonger.saneness.attabal(f3, f4, fFloatValue));
        marialVar.f20286dovishness.setScaleY(phrasemonger.saneness.attabal(f5, f4, fFloatValue));
        marialVar.f20278arytenoidectomy = phrasemonger.saneness.attabal(f6, f7, fFloatValue);
        marialVar.impromptu(phrasemonger.saneness.attabal(f6, f7, fFloatValue), matrix);
        marialVar.f20286dovishness.setImageMatrix(matrix);
    }

    public float adultoid() {
        return this.f20284cutely;
    }

    public final AnimatorSet apical(final float f, final float f2, final float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        final float alpha = this.f20286dovishness.getAlpha();
        final float scaleX = this.f20286dovishness.getScaleX();
        final float scaleY = this.f20286dovishness.getScaleY();
        final float f4 = this.f20278arytenoidectomy;
        final Matrix matrix = new Matrix(this.f20283cuirassed);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.wireman
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                marial.attabal(this.f20321attabal, alpha, f, scaleX, f2, scaleY, f4, f3, matrix, valueAnimator);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        phrasemonger.dern.attabal(animatorSet, arrayList);
        animatorSet.setDuration(apical.beachfront(this.f20286dovishness.getContext(), i, this.f20286dovishness.getContext().getResources().getInteger(bubbles.impromptu.material_motion_duration_long_1)));
        animatorSet.setInterpolator(apical.competently(this.f20286dovishness.getContext(), i2, phrasemonger.saneness.f35310saneness));
        return animatorSet;
    }

    public float arytenoidectomy() {
        return this.f20286dovishness.getElevation();
    }

    public void beachfront(Animator.AnimatorListener animatorListener) {
        if (this.f20294molybdenite == null) {
            this.f20294molybdenite = new ArrayList<>();
        }
        this.f20294molybdenite.add(animatorListener);
    }

    public void clubfoot(ColorStateList colorStateList) {
        Drawable drawable = this.f20285dern;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(appreciation.attabal.wireman(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(appreciation.attabal.wireman(colorStateList));
        }
    }

    public void coffeecake(float f) {
        chinny.taiyuan taiyuanVar = this.f20299saneness;
        if (taiyuanVar != null) {
            taiyuanVar.lerp(f);
        }
    }

    public void competently(beachfront beachfrontVar) {
        if (this.f20276adultoid == null) {
            this.f20276adultoid = new ArrayList<>();
        }
        this.f20276adultoid.add(beachfrontVar);
    }

    public final boolean cord() {
        return this.f20280beachfront && this.f20286dovishness.getSizeDimension() < this.f20277apical;
    }

    public final void creditor(float f) {
        if (this.f20291impromptu != f) {
            this.f20291impromptu = f;
            kattegat(f, this.f20301taiyuan, this.f20284cutely);
        }
    }

    public void cuirassed(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        chinny.taiyuan taiyuanVarTriweekly = triweekly();
        this.f20299saneness = taiyuanVarTriweekly;
        taiyuanVarTriweekly.setTintList(colorStateList);
        if (mode != null) {
            this.f20299saneness.setTintMode(mode);
        }
        this.f20299saneness.overspeculate(this.f20286dovishness.getContext());
        if (i > 0) {
            this.f20303wireman = cutely(i, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) cutely.competently(this.f20303wireman), (Drawable) cutely.competently(this.f20299saneness)});
        } else {
            this.f20303wireman = null;
            layerDrawable = this.f20299saneness;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(appreciation.attabal.wireman(colorStateList2), layerDrawable, null);
        this.f20285dern = rippleDrawable;
        this.f20293marial = rippleDrawable;
    }

    public final void cultivated(taiyuan taiyuanVar) {
        this.f20302triweekly = taiyuanVar;
    }

    public com.google.android.material.floatingactionbutton.dern cutely(int i, ColorStateList colorStateList) {
        Context context = this.f20286dovishness.getContext();
        com.google.android.material.floatingactionbutton.dern dernVar = new com.google.android.material.floatingactionbutton.dern((kowloon) cutely.competently(this.f20279attabal));
        dernVar.marial(picketboat.saneness.getColor(context, bubbles.wireman.design_fab_stroke_top_outer_color), picketboat.saneness.getColor(context, bubbles.wireman.design_fab_stroke_top_inner_color), picketboat.saneness.getColor(context, bubbles.wireman.design_fab_stroke_end_inner_color), picketboat.saneness.getColor(context, bubbles.wireman.design_fab_stroke_end_outer_color));
        dernVar.wireman(i);
        dernVar.dern(colorStateList);
        return dernVar;
    }

    public void dent(boolean z) {
        this.f20281competently = z;
        itchy();
    }

    public final kowloon dovishness() {
        return this.f20279attabal;
    }

    public final StateListAnimator formularize(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(f20273supplicat, impassible(f, f3));
        stateListAnimator.addState(f20270restrictive, impassible(f, f2));
        stateListAnimator.addState(f20267merc, impassible(f, f2));
        stateListAnimator.addState(f20269polder, impassible(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f20286dovishness, "elevation", f).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f20286dovishness;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f20286dovishness, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(f20274trm);
        stateListAnimator.addState(f20272seminary, animatorSet);
        stateListAnimator.addState(f20265grimness, impassible(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        return stateListAnimator;
    }

    public final taiyuan gintrap() {
        return this.f20302triweekly;
    }

    public void graveside(Rect rect) {
        if (this.f20288gintrap.dern()) {
            int iRotuma = rotuma();
            float fArytenoidectomy = this.f20281competently ? arytenoidectomy() + this.f20284cutely : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            int iMax = Math.max(iRotuma, (int) Math.ceil(fArytenoidectomy));
            int iMax2 = Math.max(iRotuma, (int) Math.ceil(fArytenoidectomy * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
            return;
        }
        if (!cord()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f20277apical - this.f20286dovishness.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    public void grimness(beachfront beachfrontVar) {
        ArrayList<beachfront> arrayList = this.f20276adultoid;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(beachfrontVar);
    }

    public final void hydrovane(taiyuan taiyuanVar) {
        this.f20292kowloon = taiyuanVar;
    }

    public final Animator impassible(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f20286dovishness, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f20286dovishness, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(f20274trm);
        return animatorSet;
    }

    public final void impromptu(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f20286dovishness.getDrawable();
        if (drawable == null || this.f20295monoploid == 0) {
            return;
        }
        RectF rectF = this.f20297preprohormone;
        RectF rectF2 = this.f20282cord;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.f20295monoploid;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f20295monoploid;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    public final void itchy() {
        Rect rect = this.f20298rotuma;
        graveside(rect);
        supplicat(rect);
        this.f20288gintrap.attabal(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void kattegat(float f, float f2, float f3) {
        if (this.f20286dovishness.getStateListAnimator() == this.f20287formularize) {
            StateListAnimator stateListAnimatorFormularize = formularize(f, f2, f3);
            this.f20287formularize = stateListAnimatorFormularize;
            this.f20286dovishness.setStateListAnimator(stateListAnimatorFormularize);
        }
        if (premeiotic()) {
            itchy();
        }
    }

    public final Drawable kowloon() {
        return this.f20293marial;
    }

    public final void lerp(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new wireman());
    }

    public void marial(Animator.AnimatorListener animatorListener) {
        if (this.f20289graveside == null) {
            this.f20289graveside = new ArrayList<>();
        }
        this.f20289graveside.add(animatorListener);
    }

    public final void mathsort(int i) {
        if (this.f20295monoploid != i) {
            this.f20295monoploid = i;
            treadless();
        }
    }

    public void merc() {
        ArrayList<beachfront> arrayList = this.f20276adultoid;
        if (arrayList != null) {
            Iterator<beachfront> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().attabal();
            }
        }
    }

    public void milliradian(competently competentlyVar, boolean z) {
        AnimatorSet animatorSetApical;
        marial marialVar;
        if (trm()) {
            return;
        }
        Animator animator = this.f20290impassible;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = this.f20302triweekly == null;
        if (!timberyard()) {
            this.f20286dovishness.internalSetVisibility(0, z);
            this.f20286dovishness.setAlpha(1.0f);
            this.f20286dovishness.setScaleY(1.0f);
            this.f20286dovishness.setScaleX(1.0f);
            peridotite(1.0f);
            if (competentlyVar != null) {
                competentlyVar.attabal();
                return;
            }
            return;
        }
        if (this.f20286dovishness.getVisibility() != 0) {
            FloatingActionButton floatingActionButton = this.f20286dovishness;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            floatingActionButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f20286dovishness.setScaleY(z2 ? 0.4f : 0.0f);
            this.f20286dovishness.setScaleX(z2 ? 0.4f : 0.0f);
            if (z2) {
                f = 0.4f;
            }
            peridotite(f);
        }
        taiyuan taiyuanVar = this.f20302triweekly;
        if (taiyuanVar != null) {
            animatorSetApical = taiyuan(taiyuanVar, 1.0f, 1.0f, 1.0f);
            marialVar = this;
        } else {
            animatorSetApical = apical(1.0f, 1.0f, 1.0f, f20268oilcan, f20275yemenite);
            marialVar = this;
        }
        animatorSetApical.addListener(new saneness(z, competentlyVar));
        ArrayList<Animator.AnimatorListener> arrayList = marialVar.f20294molybdenite;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetApical.addListener(it.next());
            }
        }
        animatorSetApical.start();
    }

    public float molybdenite() {
        return this.f20301taiyuan;
    }

    public boolean monoploid() {
        return this.f20280beachfront;
    }

    public void oilcan() {
        chinny.taiyuan taiyuanVar = this.f20299saneness;
        if (taiyuanVar != null) {
            chinny.cutely.beachfront(this.f20286dovishness, taiyuanVar);
        }
    }

    public final void overspeculate(float f) {
        if (this.f20284cutely != f) {
            this.f20284cutely = f;
            kattegat(this.f20291impromptu, this.f20301taiyuan, f);
        }
    }

    public final void peridotite(float f) {
        this.f20278arytenoidectomy = f;
        Matrix matrix = this.f20283cuirassed;
        impromptu(f, matrix);
        this.f20286dovishness.setImageMatrix(matrix);
    }

    public final void permissivist(kowloon kowloonVar) {
        this.f20279attabal = kowloonVar;
        chinny.taiyuan taiyuanVar = this.f20299saneness;
        if (taiyuanVar != null) {
            taiyuanVar.setShapeAppearanceModel(kowloonVar);
        }
        Object obj = this.f20285dern;
        if (obj instanceof polloi) {
            ((polloi) obj).setShapeAppearanceModel(kowloonVar);
        }
        com.google.android.material.floatingactionbutton.dern dernVar = this.f20303wireman;
        if (dernVar != null) {
            dernVar.beachfront(kowloonVar);
        }
    }

    public void polder(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f20289graveside;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public final taiyuan polloi() {
        return this.f20292kowloon;
    }

    public boolean premeiotic() {
        return this.f20288gintrap.dern() || cord();
    }

    public void preprohormone(competently competentlyVar, boolean z) {
        marial marialVar;
        AnimatorSet animatorSetApical;
        if (stratoscope()) {
            return;
        }
        Animator animator = this.f20290impassible;
        if (animator != null) {
            animator.cancel();
        }
        if (!timberyard()) {
            this.f20286dovishness.internalSetVisibility(z ? 8 : 4, z);
            if (competentlyVar != null) {
                competentlyVar.saneness();
                return;
            }
            return;
        }
        taiyuan taiyuanVar = this.f20292kowloon;
        if (taiyuanVar != null) {
            animatorSetApical = taiyuan(taiyuanVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            marialVar = this;
        } else {
            marialVar = this;
            animatorSetApical = marialVar.apical(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.4f, 0.4f, f20271sealless, f20266kattegat);
        }
        animatorSetApical.addListener(new attabal(z, competentlyVar));
        ArrayList<Animator.AnimatorListener> arrayList = marialVar.f20289graveside;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetApical.addListener(it.next());
            }
        }
        animatorSetApical.start();
    }

    public void privatdozent(PorterDuff.Mode mode) {
        chinny.taiyuan taiyuanVar = this.f20299saneness;
        if (taiyuanVar != null) {
            taiyuanVar.setTintMode(mode);
        }
    }

    public void restrictive() {
        ArrayList<beachfront> arrayList = this.f20276adultoid;
        if (arrayList != null) {
            Iterator<beachfront> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().saneness();
            }
        }
    }

    public int rotuma() {
        if (this.f20280beachfront) {
            return Math.max((this.f20277apical - this.f20286dovishness.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    public void saran(ColorStateList colorStateList) {
        chinny.taiyuan taiyuanVar = this.f20299saneness;
        if (taiyuanVar != null) {
            taiyuanVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.dern dernVar = this.f20303wireman;
        if (dernVar != null) {
            dernVar.dern(colorStateList);
        }
    }

    public void sealless() {
        ViewTreeObserver viewTreeObserver = this.f20286dovishness.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f20300stratoscope;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f20300stratoscope = null;
        }
    }

    public void seminary(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f20294molybdenite;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void splinterproof(int i) {
        this.f20277apical = i;
    }

    public void starveling(boolean z) {
        this.f20280beachfront = z;
    }

    public boolean stratoscope() {
        if (this.f20286dovishness.getVisibility() == 0) {
            return this.f20296polloi == 1;
        }
        return this.f20296polloi != 2;
    }

    public void supplicat(Rect rect) {
        cutely.impromptu(this.f20293marial, "Didn't initialize content background");
        if (!premeiotic()) {
            this.f20288gintrap.saneness(this.f20293marial);
        } else {
            this.f20288gintrap.saneness(new InsetDrawable(this.f20293marial, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public final AnimatorSet taiyuan(taiyuan taiyuanVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f20286dovishness, (Property<FloatingActionButton, Float>) View.ALPHA, f);
        taiyuanVar.impromptu("opacity").attabal(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f20286dovishness, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        taiyuanVar.impromptu("scale").attabal(objectAnimatorOfFloat2);
        lerp(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f20286dovishness, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        taiyuanVar.impromptu("scale").attabal(objectAnimatorOfFloat3);
        lerp(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        impromptu(f3, this.f20283cuirassed);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f20286dovishness, new phrasemonger.competently(), new dern(), new Matrix(this.f20283cuirassed));
        taiyuanVar.impromptu("iconScale").attabal(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        phrasemonger.dern.attabal(animatorSet, arrayList);
        return animatorSet;
    }

    public final boolean timberyard() {
        return this.f20286dovishness.isLaidOut() && !this.f20286dovishness.isInEditMode();
    }

    public final void treadless() {
        peridotite(this.f20278arytenoidectomy);
    }

    public chinny.taiyuan triweekly() {
        return new C0301marial((kowloon) cutely.competently(this.f20279attabal));
    }

    public boolean trm() {
        if (this.f20286dovishness.getVisibility() != 0) {
            return this.f20296polloi == 2;
        }
        return this.f20296polloi != 1;
    }

    public final void walach(float f) {
        if (this.f20301taiyuan != f) {
            this.f20301taiyuan = f;
            kattegat(this.f20291impromptu, f, this.f20284cutely);
        }
    }

    public void yemenite() {
        itchy();
    }
}
