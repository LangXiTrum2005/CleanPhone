package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes4.dex */
class CutoutDrawable extends MaterialShapeDrawable {
    public static final /* synthetic */ int A0 = 0;
    public CutoutDrawableState z0;

    public static class ImplApi14 extends CutoutDrawable {
        public Paint B0;
        public int C0;

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            Canvas canvas2;
            Drawable.Callback callback = getCallback();
            if (callback instanceof View) {
                View view = (View) callback;
                if (view.getLayerType() != 2) {
                    view.setLayerType(2, null);
                }
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                this.C0 = canvas2.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
            }
            super.draw(canvas2);
            if (getCallback() instanceof View) {
                return;
            }
            canvas2.restoreToCount(this.C0);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public final void f(Canvas canvas) {
            super.f(canvas);
            RectF rectF = this.z0.r;
            if (this.B0 == null) {
                Paint paint = new Paint(1);
                this.B0 = paint;
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.B0.setColor(-1);
                this.B0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            canvas.drawRect(rectF, this.B0);
        }
    }

    public static class ImplApi18 extends CutoutDrawable {
        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public final void f(Canvas canvas) {
            if (this.z0.r.isEmpty()) {
                super.f(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.z0.r);
            } else {
                canvas.clipRect(this.z0.r, Region.Op.DIFFERENCE);
            }
            super.f(canvas);
            canvas.restore();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.z0 = new CutoutDrawableState(this.z0);
        return this;
    }

    public final void s(float f, float f2, float f3, float f4) {
        RectF rectF = this.z0.r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public static final class CutoutDrawableState extends MaterialShapeDrawable.MaterialShapeDrawableState {
        public final RectF r;

        public CutoutDrawableState(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
            super(shapeAppearanceModel);
            this.r = rectF;
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            int i2 = CutoutDrawable.A0;
            ImplApi18 implApi18 = new ImplApi18(this);
            implApi18.z0 = this;
            implApi18.invalidateSelf();
            return implApi18;
        }

        public CutoutDrawableState(CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
            this.r = cutoutDrawableState.r;
        }
    }
}
