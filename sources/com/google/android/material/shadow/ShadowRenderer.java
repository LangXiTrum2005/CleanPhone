package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: classes4.dex */
public class ShadowRenderer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f19404i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f19405l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f19406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f19407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f19408c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19409e;
    public int f;
    public final Path g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f19410h;

    public ShadowRenderer() {
        Paint paint = new Paint();
        this.f19410h = paint;
        this.f19406a = new Paint();
        c(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f19407b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f19408c = new Paint(paint2);
    }

    public final void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f, float f2) {
        boolean z2 = f2 < 0.0f;
        Path path = this.g;
        int[] iArr = k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = this.f;
            iArr[2] = this.f19409e;
            iArr[3] = this.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i2;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = this.d;
            iArr[2] = this.f19409e;
            iArr[3] = this.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i2 / fWidth);
        float[] fArr = f19405l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        boolean z3 = z2;
        Paint paint = this.f19407b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f19410h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }

    public final void b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = f19404i;
        iArr[0] = this.f;
        iArr[1] = this.f19409e;
        iArr[2] = this.d;
        Paint paint = this.f19408c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final void c(int i2) {
        this.d = ColorUtils.e(i2, 68);
        this.f19409e = ColorUtils.e(i2, 20);
        this.f = ColorUtils.e(i2, 0);
        this.f19406a.setColor(this.d);
    }
}
