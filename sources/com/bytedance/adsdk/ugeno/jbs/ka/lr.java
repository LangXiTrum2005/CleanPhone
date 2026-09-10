package com.bytedance.adsdk.ugeno.jbs.ka;

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
import com.unity3d.services.UnityAdsConstants;
import dumb.saneness;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends Drawable {
    private ImageView.ScaleType ac;
    private Shader.TileMode aw;
    private boolean bgr;
    private boolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private Shader.TileMode f18016co;
    private final int di;
    private final Paint fi;
    private final RectF ik;
    private final Paint jbs;
    private final Bitmap ka;
    private final RectF mj;
    private float nr;
    private final Matrix qt;
    private final RectF sf;
    private final boolean[] slm;
    private ColorStateList tan;
    private float vr;
    private final int xha;
    private final RectF ri = new RectF();
    private final RectF lr = new RectF();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.ka.lr$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ri = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ri[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ri[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ri[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ri[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ri[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public lr(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.ik = rectF;
        this.mj = new RectF();
        this.qt = new Matrix();
        this.sf = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f18016co = tileMode;
        this.aw = tileMode;
        this.bgr = true;
        this.vr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.slm = new boolean[]{true, true, true, true};
        this.bu = false;
        this.nr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.tan = ColorStateList.valueOf(-16777216);
        this.ac = ImageView.ScaleType.FIT_CENTER;
        this.ka = bitmap;
        int width = bitmap.getWidth();
        this.di = width;
        int height = bitmap.getHeight();
        this.xha = height;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
        Paint paint = new Paint();
        this.fi = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.jbs = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.tan.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.nr);
    }

    public static Bitmap lr(Drawable drawable) {
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

    public static lr ri(Bitmap bitmap) {
        if (bitmap != null) {
            return new lr(bitmap);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.bgr) {
            BitmapShader bitmapShader = new BitmapShader(this.ka, this.f18016co, this.aw);
            Shader.TileMode tileMode = this.f18016co;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.aw == tileMode2) {
                bitmapShader.setLocalMatrix(this.qt);
            }
            this.fi.setShader(bitmapShader);
            this.bgr = false;
        }
        if (this.bu) {
            if (this.nr <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawOval(this.lr, this.fi);
                return;
            } else {
                canvas.drawOval(this.lr, this.fi);
                canvas.drawOval(this.mj, this.jbs);
                return;
            }
        }
        if (!ri(this.slm)) {
            canvas.drawRect(this.lr, this.fi);
            if (this.nr > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawRect(this.mj, this.jbs);
                return;
            }
            return;
        }
        float f = this.vr;
        if (this.nr <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawRoundRect(this.lr, f, f, this.fi);
            ri(canvas);
        } else {
            canvas.drawRoundRect(this.lr, f, f, this.fi);
            canvas.drawRoundRect(this.mj, f, f, this.jbs);
            ri(canvas);
            lr(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.fi.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.fi.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.xha;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.di;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.tan.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.ri.set(rect);
        ri();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.tan.getColorForState(iArr, 0);
        if (this.jbs.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.jbs.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.fi.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.fi.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.fi.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.fi.setFilterBitmap(z);
        invalidateSelf();
    }

    public static Drawable ri(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof lr) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(drawable)) {
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
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), ri(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapLr = lr(drawable);
        return bitmapLr != null ? new lr(bitmapLr) : drawable;
    }

    private void lr(Canvas canvas) {
        float f;
        float f2;
        if (lr(this.slm) || this.vr == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        RectF rectF = this.lr;
        float f3 = rectF.left;
        float f4 = rectF.top;
        float fWidth = rectF.width() + f3;
        float fHeight = f4 + this.lr.height();
        float f5 = this.vr;
        float f6 = this.nr / 2.0f;
        if (this.slm[0]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine(f3 - f6, f4, f3 + f5, f, this.jbs);
            canvas.drawLine(f3, f - f6, f3, f + f5, this.jbs);
        }
        if (!this.slm[1]) {
            float f7 = f;
            canvas.drawLine((fWidth - f5) - f6, f7, fWidth, f, this.jbs);
            canvas.drawLine(fWidth, f7 - f6, fWidth, f7 + f5, this.jbs);
            fWidth = fWidth;
        }
        if (this.slm[2]) {
            f2 = fHeight;
        } else {
            canvas.drawLine((fWidth - f5) - f6, fHeight, fWidth + f6, fHeight, this.jbs);
            float f8 = fWidth;
            canvas.drawLine(f8, fHeight - f5, fWidth, fHeight, this.jbs);
            f2 = fHeight;
        }
        if (this.slm[3]) {
            return;
        }
        canvas.drawLine(f3 - f6, f2, f3 + f5, f2, this.jbs);
        canvas.drawLine(f3, f2 - f5, f3, f2, this.jbs);
    }

    private void ri() {
        float fWidth;
        float fHeight;
        int i = AnonymousClass1.ri[this.ac.ordinal()];
        if (i == 1) {
            this.mj.set(this.ri);
            RectF rectF = this.mj;
            float f = this.nr;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.qt.reset();
            this.qt.setTranslate((int) (((this.mj.width() - this.di) * 0.5f) + 0.5f), (int) (((this.mj.height() - this.xha) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.mj.set(this.ri);
            RectF rectF2 = this.mj;
            float f2 = this.nr;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.qt.reset();
            float fHeight2 = this.di * this.mj.height();
            float fWidth2 = this.mj.width() * this.xha;
            float fWidth3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (fHeight2 > fWidth2) {
                fWidth = this.mj.height() / this.xha;
                fHeight = 0.0f;
                fWidth3 = (this.mj.width() - (this.di * fWidth)) * 0.5f;
            } else {
                fWidth = this.mj.width() / this.di;
                fHeight = (this.mj.height() - (this.xha * fWidth)) * 0.5f;
            }
            this.qt.setScale(fWidth, fWidth);
            Matrix matrix = this.qt;
            float f3 = this.nr;
            matrix.postTranslate(((int) (fWidth3 + 0.5f)) + (f3 / 2.0f), ((int) (fHeight + 0.5f)) + (f3 / 2.0f));
        } else if (i == 3) {
            this.qt.reset();
            float fMin = (((float) this.di) > this.ri.width() || ((float) this.xha) > this.ri.height()) ? Math.min(this.ri.width() / this.di, this.ri.height() / this.xha) : 1.0f;
            float fWidth4 = (int) (((this.ri.width() - (this.di * fMin)) * 0.5f) + 0.5f);
            float fHeight3 = (int) (((this.ri.height() - (this.xha * fMin)) * 0.5f) + 0.5f);
            this.qt.setScale(fMin, fMin);
            this.qt.postTranslate(fWidth4, fHeight3);
            this.mj.set(this.ik);
            this.qt.mapRect(this.mj);
            RectF rectF3 = this.mj;
            float f4 = this.nr;
            rectF3.inset(f4 / 2.0f, f4 / 2.0f);
            this.qt.setRectToRect(this.ik, this.mj, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.mj.set(this.ik);
            this.qt.setRectToRect(this.ik, this.ri, Matrix.ScaleToFit.END);
            this.qt.mapRect(this.mj);
            RectF rectF4 = this.mj;
            float f5 = this.nr;
            rectF4.inset(f5 / 2.0f, f5 / 2.0f);
            this.qt.setRectToRect(this.ik, this.mj, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.mj.set(this.ik);
            this.qt.setRectToRect(this.ik, this.ri, Matrix.ScaleToFit.START);
            this.qt.mapRect(this.mj);
            RectF rectF5 = this.mj;
            float f6 = this.nr;
            rectF5.inset(f6 / 2.0f, f6 / 2.0f);
            this.qt.setRectToRect(this.ik, this.mj, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.mj.set(this.ik);
            this.qt.setRectToRect(this.ik, this.ri, Matrix.ScaleToFit.CENTER);
            this.qt.mapRect(this.mj);
            RectF rectF6 = this.mj;
            float f7 = this.nr;
            rectF6.inset(f7 / 2.0f, f7 / 2.0f);
            this.qt.setRectToRect(this.ik, this.mj, Matrix.ScaleToFit.FILL);
        } else {
            this.mj.set(this.ri);
            RectF rectF7 = this.mj;
            float f8 = this.nr;
            rectF7.inset(f8 / 2.0f, f8 / 2.0f);
            this.qt.reset();
            this.qt.setRectToRect(this.ik, this.mj, Matrix.ScaleToFit.FILL);
        }
        this.lr.set(this.mj);
        this.bgr = true;
    }

    public lr lr(Shader.TileMode tileMode) {
        if (this.aw != tileMode) {
            this.aw = tileMode;
            this.bgr = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean lr(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    private void ri(Canvas canvas) {
        if (lr(this.slm) || this.vr == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        RectF rectF = this.lr;
        float f = rectF.left;
        float f2 = rectF.top;
        float fWidth = rectF.width() + f;
        float fHeight = this.lr.height() + f2;
        float f3 = this.vr;
        if (!this.slm[0]) {
            this.sf.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.sf, this.fi);
        }
        if (!this.slm[1]) {
            this.sf.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.sf, this.fi);
        }
        if (!this.slm[2]) {
            this.sf.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.sf, this.fi);
        }
        if (this.slm[3]) {
            return;
        }
        this.sf.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.sf, this.fi);
    }

    public lr ri(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.vr = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.vr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            boolean[] zArr = this.slm;
            zArr[0] = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[1] = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[2] = f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[3] = f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public lr ri(float f) {
        this.nr = f;
        this.jbs.setStrokeWidth(f);
        return this;
    }

    public lr ri(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.tan = colorStateList;
        this.jbs.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public lr ri(boolean z) {
        this.bu = z;
        return this;
    }

    public lr ri(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.ac != scaleType) {
            this.ac = scaleType;
            ri();
        }
        return this;
    }

    public lr ri(Shader.TileMode tileMode) {
        if (this.f18016co != tileMode) {
            this.f18016co = tileMode;
            this.bgr = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean ri(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
