package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public class RoundedImageView extends ImageView implements sg.bigo.ads.common.view.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f47613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f47614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f47615c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f47616e;
    private int f;

    public RoundedImageView(Context context) {
        this(context, null);
    }

    private void a() {
        if (getOutlineProvider() instanceof sg.bigo.ads.common.view.b.b) {
            return;
        }
        super.setOutlineProvider(new sg.bigo.ads.common.view.b.b());
    }

    private RectF getImageRectF() {
        float fMin;
        float fMin2;
        float fMax;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Drawable drawable = getDrawable();
        float f = 0.0f;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float[] fArr = new float[9];
            Matrix imageMatrix = getImageMatrix();
            if (imageMatrix != null && !imageMatrix.isIdentity()) {
                imageMatrix.getValues(fArr);
            }
            float f2 = fArr[2];
            float f3 = fArr[5];
            float f4 = fArr[0];
            float f5 = fArr[4];
            float fMax2 = Float.isNaN(f2) ? 0.0f : Math.max(0.0f, f2);
            fMax = Float.isNaN(f3) ? 0.0f : Math.max(0.0f, f3);
            fMin = Math.min((Float.isNaN(f4) || f4 <= 0.0f) ? intrinsicWidth + fMax2 : (intrinsicWidth * f4) + fMax2, measuredWidth);
            fMin2 = Math.min((Float.isNaN(f5) || f5 <= 0.0f) ? intrinsicHeight + fMax : (intrinsicHeight * f5) + fMax, measuredHeight);
            f = fMax2;
        } else {
            fMin = measuredWidth;
            fMin2 = measuredHeight;
            fMax = 0.0f;
        }
        return new RectF(f, fMax, fMin, fMin2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Path clipPath = getClipPath();
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        super.draw(canvas);
        RectF imageRectF = getImageRectF();
        if (this.f47616e > 0.0f && !imageRectF.isEmpty()) {
            Paint paint = new Paint();
            paint.setColor(this.f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f47616e);
            paint.setAntiAlias(true);
            float f = this.f47613a;
            canvas.drawRoundRect(imageRectF, f, f, paint);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // sg.bigo.ads.common.view.b.a
    public Path getClipPath() {
        RectF imageRectF = getImageRectF();
        if (Float.isNaN(this.f47613a) || Float.isNaN(this.f47614b) || Float.isNaN(this.d) || Float.isNaN(this.f47615c) || imageRectF == null || imageRectF.isEmpty()) {
            return null;
        }
        Path path = new Path();
        float[] fArr = new float[8];
        float f = Float.isNaN(this.f47613a) ? 0.0f : this.f47613a;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = Float.isNaN(this.f47614b) ? 0.0f : this.f47614b;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = Float.isNaN(this.d) ? 0.0f : this.d;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = Float.isNaN(this.f47615c) ? 0.0f : this.f47615c;
        fArr[6] = f4;
        fArr[7] = f4;
        path.addRoundRect(imageRectF, fArr, Path.Direction.CW);
        return path;
    }

    public void setCornerRadius(float f) {
        this.f47613a = f;
        this.f47614b = f;
        this.f47615c = f;
        this.d = f;
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        a();
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
    }

    public void setStrokeColor(int i2) {
        this.f = i2;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f47616e = f;
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        a();
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f47613a = Float.NaN;
        this.f47614b = Float.NaN;
        this.f47615c = Float.NaN;
        this.d = Float.NaN;
        this.f = -1;
    }
}
