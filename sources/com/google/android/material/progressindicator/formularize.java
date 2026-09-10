package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.material.progressindicator.saneness;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: IndeterminateDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class formularize<S extends saneness> extends taiyuan {

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public apical<ObjectAnimator> f20687kattegat;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public cutely<S> f20688sealless;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public Drawable f20689supplicat;

    public formularize(Context context, saneness sanenessVar, cutely<S> cutelyVar, apical<ObjectAnimator> apicalVar) {
        super(context, sanenessVar);
        stratoscope(cutelyVar);
        cuirassed(apicalVar);
    }

    public static formularize<CircularProgressIndicatorSpec> dovishness(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec, dern dernVar) {
        formularize<CircularProgressIndicatorSpec> formularizeVar = new formularize<>(context, circularProgressIndicatorSpec, dernVar, circularProgressIndicatorSpec.f20640kowloon == 1 ? new marial(context, circularProgressIndicatorSpec) : new wireman(circularProgressIndicatorSpec));
        formularizeVar.trm(weimar.competently.saneness(context.getResources(), bubbles.beachfront.ic_mtrl_arrow_circle, null));
        return formularizeVar;
    }

    public static formularize<LinearProgressIndicatorSpec> gintrap(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, impassible impassibleVar) {
        return new formularize<>(context, linearProgressIndicatorSpec, impassibleVar, linearProgressIndicatorSpec.f20649kowloon == 0 ? new triweekly(linearProgressIndicatorSpec) : new kowloon(context, linearProgressIndicatorSpec));
    }

    @Override // com.google.android.material.progressindicator.taiyuan
    public /* bridge */ /* synthetic */ boolean adultoid(weimar.saneness sanenessVar) {
        return super.adultoid(sanenessVar);
    }

    public final boolean cord() {
        attabal attabalVar = this.f20764monoploid;
        return attabalVar != null && attabalVar.attabal(this.f20762kowloon.getContentResolver()) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void cuirassed(apical<ObjectAnimator> apicalVar) {
        this.f20687kattegat = apicalVar;
        apicalVar.marial(this);
    }

    @Override // com.google.android.material.progressindicator.taiyuan
    public /* bridge */ /* synthetic */ boolean cutely() {
        return super.cutely();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int i;
        Drawable drawable;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f20765oilcan)) {
            int i2 = 0;
            if (cord() && (drawable = this.f20689supplicat) != null) {
                drawable.setBounds(getBounds());
                this.f20689supplicat.setTint(this.f20756arytenoidectomy.f20749marial[0]);
                this.f20689supplicat.draw(canvas);
                return;
            }
            canvas.save();
            this.f20688sealless.impromptu(canvas, getBounds(), impromptu(), impassible(), formularize());
            int i3 = this.f20756arytenoidectomy.f20751taiyuan;
            int alpha = getAlpha();
            saneness sanenessVar = this.f20756arytenoidectomy;
            boolean z = (sanenessVar instanceof LinearProgressIndicatorSpec) || ((sanenessVar instanceof CircularProgressIndicatorSpec) && ((CircularProgressIndicatorSpec) sanenessVar).f20641molybdenite);
            boolean z2 = z && i3 == 0 && !sanenessVar.saneness(false);
            if (!z2) {
                if (z) {
                    cutely.attabal attabalVar = this.f20687kattegat.f20654saneness.get(0);
                    List<cutely.attabal> list = this.f20687kattegat.f20654saneness;
                    cutely.attabal attabalVar2 = list.get(list.size() - 1);
                    cutely<S> cutelyVar = this.f20688sealless;
                    if (cutelyVar instanceof impassible) {
                        i = i3;
                        cutelyVar.wireman(canvas, this.f20769stratoscope, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, attabalVar.f20663attabal, this.f20756arytenoidectomy.f20742beachfront, alpha, i);
                        canvas2 = canvas;
                        this.f20688sealless.wireman(canvas2, this.f20769stratoscope, attabalVar2.f20669saneness, 1.0f, this.f20756arytenoidectomy.f20742beachfront, alpha, i);
                    } else {
                        canvas2 = canvas;
                        i = i3;
                        canvas.save();
                        canvas.rotate(attabalVar2.f20665competently);
                        this.f20688sealless.wireman(canvas2, this.f20769stratoscope, attabalVar2.f20669saneness, attabalVar.f20663attabal + 1.0f, this.f20756arytenoidectomy.f20742beachfront, alpha, i);
                        canvas.restore();
                    }
                } else {
                    canvas2 = canvas;
                }
                while (i2 < this.f20687kattegat.f20654saneness.size()) {
                    cutely.attabal attabalVar3 = this.f20687kattegat.f20654saneness.get(i2);
                    attabalVar3.f20664beachfront = taiyuan();
                    this.f20688sealless.dern(canvas, this.f20769stratoscope, attabalVar3, getAlpha());
                    if (i2 <= 0 && !z2 && z) {
                        this.f20688sealless.wireman(canvas2, this.f20769stratoscope, this.f20687kattegat.f20654saneness.get(i2 - 1).f20669saneness, attabalVar3.f20663attabal, this.f20756arytenoidectomy.f20742beachfront, alpha, i);
                    }
                    i2++;
                    canvas2 = canvas;
                }
                canvas.restore();
            }
            canvas2 = canvas;
            this.f20688sealless.wireman(canvas2, this.f20769stratoscope, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, this.f20756arytenoidectomy.f20742beachfront, alpha, 0);
            i = i3;
            while (i2 < this.f20687kattegat.f20654saneness.size()) {
                cutely.attabal attabalVar4 = this.f20687kattegat.f20654saneness.get(i2);
                attabalVar4.f20664beachfront = taiyuan();
                this.f20688sealless.dern(canvas, this.f20769stratoscope, attabalVar4, getAlpha());
                if (i2 <= 0) {
                }
                i2++;
                canvas2 = canvas;
            }
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
        return this.f20688sealless.marial();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20688sealless.beachfront();
    }

    @Override // com.google.android.material.progressindicator.taiyuan, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.taiyuan
    public boolean graveside(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean zGraveside = super.graveside(z, z2, z3);
        if (cord() && (drawable = this.f20689supplicat) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.f20687kattegat.attabal();
        }
        if (!z || !z3) {
            return zGraveside;
        }
        this.f20687kattegat.competently();
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

    @Override // com.google.android.material.progressindicator.taiyuan
    public /* bridge */ /* synthetic */ void kowloon(weimar.saneness sanenessVar) {
        super.kowloon(sanenessVar);
    }

    @Override // com.google.android.material.progressindicator.taiyuan
    public /* bridge */ /* synthetic */ boolean molybdenite(boolean z, boolean z2, boolean z3) {
        return super.molybdenite(z, z2, z3);
    }

    public cutely<S> preprohormone() {
        return this.f20688sealless;
    }

    public apical<ObjectAnimator> rotuma() {
        return this.f20687kattegat;
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

    public void stratoscope(cutely<S> cutelyVar) {
        this.f20688sealless = cutelyVar;
    }

    public void trm(Drawable drawable) {
        this.f20689supplicat = drawable;
    }
}
