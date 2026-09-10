package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: CutoutDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class impromptu extends chinny.taiyuan {

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public saneness f21207overspeculate;

    /* JADX INFO: compiled from: CutoutDrawable.java */
    public static class dern extends impromptu {
        public dern(saneness sanenessVar) {
            super(sanenessVar);
        }

        @Override // chinny.taiyuan
        public void gintrap(Canvas canvas) {
            if (this.f21207overspeculate.f21208rotuma.isEmpty()) {
                super.gintrap(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f21207overspeculate.f21208rotuma);
            } else {
                canvas.clipRect(this.f21207overspeculate.f21208rotuma, Region.Op.DIFFERENCE);
            }
            super.gintrap(canvas);
            canvas.restore();
        }
    }

    public static impromptu herdbook(chinny.kowloon kowloonVar) {
        if (kowloonVar == null) {
            kowloonVar = new chinny.kowloon();
        }
        return technofreak(new saneness(kowloonVar, new RectF()));
    }

    public static impromptu technofreak(saneness sanenessVar) {
        return new dern(sanenessVar);
    }

    public void dhss() {
        vesuvio(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f21207overspeculate = new saneness(this.f21207overspeculate);
        return this;
    }

    public boolean outmarry() {
        return !this.f21207overspeculate.f21208rotuma.isEmpty();
    }

    public void setterwort(RectF rectF) {
        vesuvio(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void vesuvio(float f, float f2, float f3, float f4) {
        if (f == this.f21207overspeculate.f21208rotuma.left && f2 == this.f21207overspeculate.f21208rotuma.top && f3 == this.f21207overspeculate.f21208rotuma.right && f4 == this.f21207overspeculate.f21208rotuma.bottom) {
            return;
        }
        this.f21207overspeculate.f21208rotuma.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX INFO: compiled from: CutoutDrawable.java */
    public static final class saneness extends chinny.taiyuan.dern {

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public final RectF f21208rotuma;

        @Override // chinny.taiyuan.dern, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            impromptu impromptuVarTechnofreak = impromptu.technofreak(this);
            impromptuVarTechnofreak.invalidateSelf();
            return impromptuVarTechnofreak;
        }

        public saneness(chinny.kowloon kowloonVar, RectF rectF) {
            super(kowloonVar, null);
            this.f21208rotuma = rectF;
        }

        public saneness(saneness sanenessVar) {
            super(sanenessVar);
            this.f21208rotuma = sanenessVar.f21208rotuma;
        }
    }

    public impromptu(saneness sanenessVar) {
        super(sanenessVar);
        this.f21207overspeculate = sanenessVar;
    }
}
