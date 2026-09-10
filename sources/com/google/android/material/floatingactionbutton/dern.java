package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import chinny.arytenoidectomy;
import chinny.kowloon;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: BorderDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern extends Drawable {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f20248apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public ColorStateList f20249arytenoidectomy;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f20253cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f20255formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f20256impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f20257impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public kowloon f20258kowloon;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Paint f20260saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f20261taiyuan;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final arytenoidectomy f20250attabal = arytenoidectomy.formularize();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Path f20254dern = new Path();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Rect f20263wireman = new Rect();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final RectF f20259marial = new RectF();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final RectF f20251beachfront = new RectF();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final saneness f20252competently = new saneness();

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public boolean f20262triweekly = true;

    /* JADX INFO: compiled from: BorderDrawable.java */
    public class saneness extends Drawable.ConstantState {
        public saneness() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return dern.this;
        }
    }

    public dern(kowloon kowloonVar) {
        this.f20258kowloon = kowloonVar;
        Paint paint = new Paint(1);
        this.f20260saneness = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final Shader attabal() {
        Rect rect = this.f20263wireman;
        copyBounds(rect);
        float fHeight = this.f20257impromptu / rect.height();
        return new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.top, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.bottom, new int[]{monroe.dern.competently(this.f20261taiyuan, this.f20256impassible), monroe.dern.competently(this.f20253cutely, this.f20256impassible), monroe.dern.competently(monroe.dern.apical(this.f20253cutely, 0), this.f20256impassible), monroe.dern.competently(monroe.dern.apical(this.f20255formularize, 0), this.f20256impassible), monroe.dern.competently(this.f20255formularize, this.f20256impassible), monroe.dern.competently(this.f20248apical, this.f20256impassible)}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    public void beachfront(kowloon kowloonVar) {
        this.f20258kowloon = kowloonVar;
        invalidateSelf();
    }

    public void dern(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f20256impassible = colorStateList.getColorForState(getState(), this.f20256impassible);
        }
        this.f20249arytenoidectomy = colorStateList;
        this.f20262triweekly = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f20262triweekly) {
            this.f20260saneness.setShader(attabal());
            this.f20262triweekly = false;
        }
        float strokeWidth = this.f20260saneness.getStrokeWidth() / 2.0f;
        copyBounds(this.f20263wireman);
        this.f20259marial.set(this.f20263wireman);
        float fMin = Math.min(this.f20258kowloon.polloi().attabal(saneness()), this.f20259marial.width() / 2.0f);
        if (this.f20258kowloon.dovishness(saneness())) {
            this.f20259marial.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f20259marial, fMin, fMin, this.f20260saneness);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f20252competently;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f20257impromptu > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f20258kowloon.dovishness(saneness())) {
            outline.setRoundRect(getBounds(), this.f20258kowloon.polloi().attabal(saneness()));
        } else {
            copyBounds(this.f20263wireman);
            this.f20259marial.set(this.f20263wireman);
            this.f20250attabal.wireman(this.f20258kowloon, 1.0f, this.f20259marial, this.f20254dern);
            strum.wireman.formularize(outline, this.f20254dern);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f20258kowloon.dovishness(saneness())) {
            return true;
        }
        int iRound = Math.round(this.f20257impromptu);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f20249arytenoidectomy;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void marial(int i, int i2, int i3, int i4) {
        this.f20261taiyuan = i;
        this.f20253cutely = i2;
        this.f20248apical = i3;
        this.f20255formularize = i4;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f20262triweekly = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f20249arytenoidectomy;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f20256impassible)) != this.f20256impassible) {
            this.f20262triweekly = true;
            this.f20256impassible = colorForState;
        }
        if (this.f20262triweekly) {
            invalidateSelf();
        }
        return this.f20262triweekly;
    }

    public RectF saneness() {
        this.f20251beachfront.set(getBounds());
        return this.f20251beachfront;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f20260saneness.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20260saneness.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void wireman(float f) {
        if (this.f20257impromptu != f) {
            this.f20257impromptu = f;
            this.f20260saneness.setStrokeWidth(f * 1.3333f);
            this.f20262triweekly = true;
            invalidateSelf();
        }
    }
}
