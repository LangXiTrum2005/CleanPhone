package com.bytedance.adsdk.ugeno.QAg.ZU;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4107n5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class LD extends Drawable {
    private ImageView.ScaleType DY;
    private float IeN;
    private final RectF JVA;
    private final Paint JXs;
    private Shader.TileMode NXR;
    private final RectF OY;
    private final Paint QAg;
    private boolean STP;
    private final boolean[] VVE;
    private final Bitmap ZU;
    private float brP;
    private final int ebl;
    private boolean kqm;
    private final int lc;
    private final RectF lk;
    private final Matrix nBu;
    private Shader.TileMode sLN;
    private ColorStateList tD;
    private final RectF Lxb = new RectF();
    private final RectF LD = new RectF();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.QAg.ZU.LD$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            Lxb = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Lxb[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Lxb[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Lxb[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Lxb[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Lxb[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public LD(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.lk = rectF;
        this.OY = new RectF();
        this.nBu = new Matrix();
        this.JVA = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.sLN = tileMode;
        this.NXR = tileMode;
        this.STP = true;
        this.IeN = 0.0f;
        this.VVE = new boolean[]{true, true, true, true};
        this.kqm = false;
        this.brP = 0.0f;
        this.tD = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.DY = ImageView.ScaleType.FIT_CENTER;
        this.ZU = bitmap;
        int width = bitmap.getWidth();
        this.lc = width;
        int height = bitmap.getHeight();
        this.ebl = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.JXs = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.QAg = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.tD.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.brP);
    }

    public static Bitmap LD(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static LD Lxb(Bitmap bitmap) {
        if (bitmap != null) {
            return new LD(bitmap);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.STP) {
            BitmapShader bitmapShader = new BitmapShader(this.ZU, this.sLN, this.NXR);
            Shader.TileMode tileMode = this.sLN;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.NXR == tileMode2) {
                bitmapShader.setLocalMatrix(this.nBu);
            }
            this.JXs.setShader(bitmapShader);
            this.STP = false;
        }
        if (this.kqm) {
            if (this.brP <= 0.0f) {
                canvas.drawOval(this.LD, this.JXs);
                return;
            } else {
                canvas.drawOval(this.LD, this.JXs);
                canvas.drawOval(this.OY, this.QAg);
                return;
            }
        }
        if (!Lxb(this.VVE)) {
            canvas.drawRect(this.LD, this.JXs);
            if (this.brP > 0.0f) {
                canvas.drawRect(this.OY, this.QAg);
                return;
            }
            return;
        }
        float f = this.IeN;
        if (this.brP <= 0.0f) {
            canvas.drawRoundRect(this.LD, f, f, this.JXs);
            Lxb(canvas);
        } else {
            canvas.drawRoundRect(this.LD, f, f, this.JXs);
            canvas.drawRoundRect(this.OY, f, f, this.QAg);
            Lxb(canvas);
            LD(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.JXs.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.JXs.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.ebl;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.lc;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.tD.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.Lxb.set(rect);
        Lxb();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.tD.getColorForState(iArr, 0);
        if (this.QAg.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.QAg.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.JXs.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.JXs.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.JXs.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.JXs.setFilterBitmap(z);
        invalidateSelf();
    }

    public static Drawable Lxb(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof LD) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && AbstractC4107n5.A(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), Lxb(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapLD = LD(drawable);
        return bitmapLD != null ? new LD(bitmapLD) : drawable;
    }

    private void LD(Canvas canvas) {
        float f;
        if (LD(this.VVE) || this.IeN == 0.0f) {
            return;
        }
        RectF rectF = this.LD;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float fWidth = rectF.width() + f2;
        float fHeight = this.LD.height() + f3;
        float f4 = this.IeN;
        float f5 = this.brP / 2.0f;
        if (!this.VVE[0]) {
            canvas.drawLine(f2 - f5, f3, f2 + f4, f3, this.QAg);
            canvas.drawLine(f2, f3 - f5, f2, f3 + f4, this.QAg);
        }
        if (!this.VVE[1]) {
            canvas.drawLine((fWidth - f4) - f5, f3, fWidth, f3, this.QAg);
            canvas.drawLine(fWidth, f3 - f5, fWidth, f3 + f4, this.QAg);
        }
        if (this.VVE[2]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine((fWidth - f4) - f5, fHeight, fWidth + f5, fHeight, this.QAg);
            canvas.drawLine(fWidth, fHeight - f, fWidth, fHeight, this.QAg);
        }
        if (this.VVE[3]) {
            return;
        }
        canvas.drawLine(f2 - f5, fHeight, f2 + f, fHeight, this.QAg);
        canvas.drawLine(f2, fHeight - f, f2, fHeight, this.QAg);
    }

    private void Lxb() {
        float fWidth;
        float fHeight;
        int i = AnonymousClass1.Lxb[this.DY.ordinal()];
        if (i == 1) {
            this.OY.set(this.Lxb);
            RectF rectF = this.OY;
            float f = this.brP;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.nBu.reset();
            this.nBu.setTranslate((int) AbstractC5044xl.w(this.OY.width(), this.lc, 0.5f, 0.5f), (int) AbstractC5044xl.w(this.OY.height(), this.ebl, 0.5f, 0.5f));
        } else if (i == 2) {
            this.OY.set(this.Lxb);
            RectF rectF2 = this.OY;
            float f2 = this.brP;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.nBu.reset();
            float fWidth2 = 0.0f;
            if (this.OY.height() * this.lc > this.OY.width() * this.ebl) {
                fWidth = this.OY.height() / this.ebl;
                fWidth2 = (this.OY.width() - (this.lc * fWidth)) * 0.5f;
                fHeight = 0.0f;
            } else {
                fWidth = this.OY.width() / this.lc;
                fHeight = (this.OY.height() - (this.ebl * fWidth)) * 0.5f;
            }
            this.nBu.setScale(fWidth, fWidth);
            Matrix matrix = this.nBu;
            float f3 = this.brP;
            matrix.postTranslate((f3 / 2.0f) + ((int) (fWidth2 + 0.5f)), (f3 / 2.0f) + ((int) (fHeight + 0.5f)));
        } else if (i == 3) {
            this.nBu.reset();
            float fMin = (((float) this.lc) > this.Lxb.width() || ((float) this.ebl) > this.Lxb.height()) ? Math.min(this.Lxb.width() / this.lc, this.Lxb.height() / this.ebl) : 1.0f;
            float fWidth3 = (int) (((this.Lxb.width() - (this.lc * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.Lxb.height() - (this.ebl * fMin)) * 0.5f) + 0.5f);
            this.nBu.setScale(fMin, fMin);
            this.nBu.postTranslate(fWidth3, fHeight2);
            this.OY.set(this.lk);
            this.nBu.mapRect(this.OY);
            RectF rectF3 = this.OY;
            float f4 = this.brP;
            rectF3.inset(f4 / 2.0f, f4 / 2.0f);
            this.nBu.setRectToRect(this.lk, this.OY, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.OY.set(this.lk);
            this.nBu.setRectToRect(this.lk, this.Lxb, Matrix.ScaleToFit.END);
            this.nBu.mapRect(this.OY);
            RectF rectF4 = this.OY;
            float f5 = this.brP;
            rectF4.inset(f5 / 2.0f, f5 / 2.0f);
            this.nBu.setRectToRect(this.lk, this.OY, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.OY.set(this.lk);
            this.nBu.setRectToRect(this.lk, this.Lxb, Matrix.ScaleToFit.START);
            this.nBu.mapRect(this.OY);
            RectF rectF5 = this.OY;
            float f6 = this.brP;
            rectF5.inset(f6 / 2.0f, f6 / 2.0f);
            this.nBu.setRectToRect(this.lk, this.OY, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.OY.set(this.lk);
            this.nBu.setRectToRect(this.lk, this.Lxb, Matrix.ScaleToFit.CENTER);
            this.nBu.mapRect(this.OY);
            RectF rectF6 = this.OY;
            float f7 = this.brP;
            rectF6.inset(f7 / 2.0f, f7 / 2.0f);
            this.nBu.setRectToRect(this.lk, this.OY, Matrix.ScaleToFit.FILL);
        } else {
            this.OY.set(this.Lxb);
            RectF rectF7 = this.OY;
            float f8 = this.brP;
            rectF7.inset(f8 / 2.0f, f8 / 2.0f);
            this.nBu.reset();
            this.nBu.setRectToRect(this.lk, this.OY, Matrix.ScaleToFit.FILL);
        }
        this.LD.set(this.OY);
        this.STP = true;
    }

    public LD LD(Shader.TileMode tileMode) {
        if (this.NXR != tileMode) {
            this.NXR = tileMode;
            this.STP = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean LD(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    private void Lxb(Canvas canvas) {
        if (LD(this.VVE) || this.IeN == 0.0f) {
            return;
        }
        RectF rectF = this.LD;
        float f = rectF.left;
        float f2 = rectF.top;
        float fWidth = rectF.width() + f;
        float fHeight = this.LD.height() + f2;
        float f3 = this.IeN;
        if (!this.VVE[0]) {
            this.JVA.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.JVA, this.JXs);
        }
        if (!this.VVE[1]) {
            this.JVA.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.JVA, this.JXs);
        }
        if (!this.VVE[2]) {
            this.JVA.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.JVA, this.JXs);
        }
        if (this.VVE[3]) {
            return;
        }
        this.JVA.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.JVA, this.JXs);
    }

    public LD Lxb(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.IeN = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.IeN = 0.0f;
            }
            boolean[] zArr = this.VVE;
            zArr[0] = f > 0.0f;
            zArr[1] = f2 > 0.0f;
            zArr[2] = f3 > 0.0f;
            zArr[3] = f4 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public LD Lxb(float f) {
        this.brP = f;
        this.QAg.setStrokeWidth(f);
        return this;
    }

    public LD Lxb(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.tD = colorStateList;
        this.QAg.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    public LD Lxb(boolean z) {
        this.kqm = z;
        return this;
    }

    public LD Lxb(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.DY != scaleType) {
            this.DY = scaleType;
            Lxb();
        }
        return this;
    }

    public LD Lxb(Shader.TileMode tileMode) {
        if (this.sLN != tileMode) {
            this.sLN = tileMode;
            this.STP = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean Lxb(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
