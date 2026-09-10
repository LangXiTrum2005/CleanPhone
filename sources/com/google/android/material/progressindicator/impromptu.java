package com.google.android.material.progressindicator;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import com.google.android.material.progressindicator.saneness;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: DeterminateDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impromptu<S extends saneness> extends taiyuan {

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public static final molet.taiyuan<impromptu<?>> f20700starveling = new attabal("indicatorLevel");

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public TimeInterpolator f20701creditor;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public ValueAnimator f20702grimness;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final molet.impassible f20703kattegat;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public float f20704merc;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public boolean f20705polder;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public TimeInterpolator f20706privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public final cutely.attabal f20707restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public TimeInterpolator f20708saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public cutely<S> f20709sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public final ValueAnimator f20710seminary;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final molet.formularize f20711supplicat;

    /* JADX INFO: compiled from: DeterminateDrawable.java */
    public class attabal extends molet.taiyuan<impromptu<?>> {
        public attabal(String str) {
            super(str);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(impromptu<?> impromptuVar) {
            return impromptuVar.yemenite() * 10000.0f;
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(impromptu<?> impromptuVar, float f) {
            impromptuVar.polder(f / 10000.0f);
            impromptuVar.kattegat((int) f);
        }
    }

    public impromptu(Context context, final saneness sanenessVar, cutely<S> cutelyVar) {
        super(context, sanenessVar);
        this.f20705polder = false;
        restrictive(cutelyVar);
        cutely.attabal attabalVar = new cutely.attabal();
        this.f20707restrictive = attabalVar;
        attabalVar.f20667impromptu = true;
        molet.impassible impassibleVar = new molet.impassible();
        this.f20703kattegat = impassibleVar;
        impassibleVar.beachfront(1.0f);
        impassibleVar.impromptu(50.0f);
        molet.formularize formularizeVar = new molet.formularize(this, f20700starveling);
        this.f20711supplicat = formularizeVar;
        formularizeVar.rotuma(impassibleVar);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f20710seminary = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.progressindicator.beachfront
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                impromptu.dovishness(this.f20655attabal, sanenessVar, valueAnimator2);
            }
        });
        if (sanenessVar.saneness(true) && sanenessVar.f20747impassible != 0) {
            valueAnimator.start();
        }
        arytenoidectomy(1.0f);
    }

    public static impromptu<CircularProgressIndicatorSpec> cuirassed(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec, dern dernVar) {
        return new impromptu<>(context, circularProgressIndicatorSpec, dernVar);
    }

    public static /* synthetic */ void dovishness(impromptu impromptuVar, saneness sanenessVar, ValueAnimator valueAnimator) {
        impromptuVar.getClass();
        if (sanenessVar.saneness(true) && sanenessVar.f20747impassible != 0 && impromptuVar.isVisible()) {
            impromptuVar.invalidateSelf();
        }
    }

    public static impromptu<LinearProgressIndicatorSpec> stratoscope(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, impassible impassibleVar) {
        return new impromptu<>(context, linearProgressIndicatorSpec, impassibleVar);
    }

    @Override // com.google.android.material.progressindicator.taiyuan
    public /* bridge */ /* synthetic */ boolean adultoid(weimar.saneness sanenessVar) {
        return super.adultoid(sanenessVar);
    }

    @Override // com.google.android.material.progressindicator.taiyuan
    public /* bridge */ /* synthetic */ boolean cutely() {
        return super.cutely();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f20765oilcan)) {
            canvas.save();
            this.f20709sealless.impromptu(canvas, getBounds(), impromptu(), impassible(), formularize());
            this.f20707restrictive.f20664beachfront = taiyuan();
            this.f20769stratoscope.setStyle(Paint.Style.FILL);
            this.f20769stratoscope.setAntiAlias(true);
            cutely.attabal attabalVar = this.f20707restrictive;
            saneness sanenessVar = this.f20756arytenoidectomy;
            attabalVar.f20666dern = sanenessVar.f20749marial[0];
            int iAttabal = sanenessVar.f20751taiyuan;
            if (iAttabal > 0) {
                if (!(this.f20709sealless instanceof impassible)) {
                    iAttabal = (int) ((iAttabal * achondroplasia.attabal.attabal(yemenite(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.01f)) / 0.01f);
                }
                this.f20709sealless.wireman(canvas, this.f20769stratoscope, yemenite(), 1.0f, this.f20756arytenoidectomy.f20742beachfront, getAlpha(), iAttabal);
            } else {
                this.f20709sealless.wireman(canvas, this.f20769stratoscope, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, sanenessVar.f20742beachfront, getAlpha(), 0);
            }
            this.f20709sealless.dern(canvas, this.f20769stratoscope, this.f20707restrictive, getAlpha());
            this.f20709sealless.saneness(canvas, this.f20769stratoscope, this.f20756arytenoidectomy.f20749marial[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.taiyuan
    public /* bridge */ /* synthetic */ boolean formularize() {
        return super.formularize();
    }

    @Override // com.google.android.material.progressindicator.taiyuan, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f20709sealless.marial();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20709sealless.beachfront();
    }

    @Override // com.google.android.material.progressindicator.taiyuan, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.taiyuan
    public boolean graveside(boolean z, boolean z2, boolean z3) {
        boolean zGraveside = super.graveside(z, z2, z3);
        float fAttabal = this.f20764monoploid.attabal(this.f20762kowloon.getContentResolver());
        if (fAttabal == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f20705polder = true;
            return zGraveside;
        }
        this.f20705polder = false;
        this.f20703kattegat.impromptu(50.0f / fAttabal);
        return zGraveside;
    }

    @Override // com.google.android.material.progressindicator.taiyuan
    public /* bridge */ /* synthetic */ boolean impassible() {
        return super.impassible();
    }

    @Override // com.google.android.material.progressindicator.taiyuan, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f20711supplicat.preprohormone();
        polder(getLevel() / 10000.0f);
    }

    public final void kattegat(int i) {
        if (this.f20756arytenoidectomy.saneness(true)) {
            sealless();
            float fTrm = trm(i);
            if (fTrm == this.f20704merc) {
                if (this.f20702grimness.isRunning()) {
                    return;
                }
                supplicat(fTrm);
                return;
            }
            if (this.f20702grimness.isRunning()) {
                this.f20702grimness.cancel();
            }
            this.f20704merc = fTrm;
            if (fTrm == 1.0f) {
                this.f20708saran = this.f20706privatdozent;
                this.f20702grimness.start();
            } else {
                this.f20708saran = this.f20701creditor;
                this.f20702grimness.reverse();
            }
        }
    }

    @Override // com.google.android.material.progressindicator.taiyuan
    public /* bridge */ /* synthetic */ void kowloon(weimar.saneness sanenessVar) {
        super.kowloon(sanenessVar);
    }

    public void merc(boolean z) {
        if (z && !this.f20710seminary.isRunning()) {
            this.f20710seminary.start();
        } else {
            if (z || !this.f20710seminary.isRunning()) {
                return;
            }
            this.f20710seminary.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.taiyuan
    public /* bridge */ /* synthetic */ boolean molybdenite(boolean z, boolean z2, boolean z3) {
        return super.molybdenite(z, z2, z3);
    }

    public cutely<S> oilcan() {
        return this.f20709sealless;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        float fTrm = trm(i);
        if (!this.f20705polder) {
            this.f20711supplicat.triweekly(yemenite() * 10000.0f);
            this.f20711supplicat.graveside(i);
            return true;
        }
        this.f20711supplicat.preprohormone();
        polder(i / 10000.0f);
        supplicat(fTrm);
        return true;
    }

    public final void polder(float f) {
        this.f20707restrictive.f20669saneness = f;
        invalidateSelf();
    }

    public void restrictive(cutely<S> cutelyVar) {
        this.f20709sealless = cutelyVar;
    }

    public final void sealless() {
        if (this.f20702grimness != null) {
            return;
        }
        Context context = this.f20762kowloon;
        int i = bubbles.dern.motionEasingStandardInterpolator;
        TimeInterpolator timeInterpolator = phrasemonger.saneness.f35307attabal;
        this.f20706privatdozent = gown.apical.competently(context, i, timeInterpolator);
        this.f20701creditor = gown.apical.competently(this.f20762kowloon, bubbles.dern.motionEasingEmphasizedAccelerateInterpolator, timeInterpolator);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f20702grimness = valueAnimator;
        valueAnimator.setDuration(500L);
        this.f20702grimness.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.f20702grimness.setInterpolator(null);
        this.f20702grimness.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.progressindicator.competently
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                impromptu impromptuVar = this.f20657attabal;
                impromptuVar.f20707restrictive.f20668marial = impromptuVar.f20708saran.getInterpolation(impromptuVar.f20702grimness.getAnimatedFraction());
            }
        });
    }

    public void seminary(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // com.google.android.material.progressindicator.taiyuan, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.taiyuan, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.taiyuan, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.taiyuan, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.taiyuan, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public final void supplicat(float f) {
        this.f20707restrictive.f20668marial = f;
        invalidateSelf();
    }

    public final float trm(int i) {
        float f = i;
        if (f < 1000.0f || f > 9000.0f) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return 1.0f;
    }

    public final float yemenite() {
        return this.f20707restrictive.f20669saneness;
    }
}
