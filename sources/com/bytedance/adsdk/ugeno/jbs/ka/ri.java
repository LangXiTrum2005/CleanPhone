package com.bytedance.adsdk.ugeno.jbs.ka;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.ka;
import com.bytedance.adsdk.ugeno.ri.mj;
import com.bytedance.adsdk.ugeno.ri.xha;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends ImageView implements IAnimation, xha {
    static final /* synthetic */ boolean lr = true;
    private ka ac;
    private boolean aw;
    private boolean bgr;
    private ImageView.ScaleType bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18017co;
    private Drawable di;
    private final float[] fi;
    private mj ihz;
    private float ik;
    private ColorFilter jbs;
    private float mj;
    private Shader.TileMode nr;
    private boolean qt;
    private Drawable sf;
    private int slm;
    private Shader.TileMode tan;
    private int vr;
    private ColorStateList xha;
    public static final Shader.TileMode ri = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] ka = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.ka.ri$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ri = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ri[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ri[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ri[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ri[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ri[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ri(Context context) {
        super(context);
        this.fi = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.xha = ColorStateList.valueOf(-16777216);
        this.mj = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.jbs = null;
        this.qt = false;
        this.f18017co = false;
        this.aw = false;
        this.bgr = false;
        Shader.TileMode tileMode = ri;
        this.nr = tileMode;
        this.tan = tileMode;
        this.ihz = new mj(this);
    }

    private void ik() {
        ri(this.sf, this.bu);
    }

    private void ka() {
        Drawable drawable = this.sf;
        if (drawable == null || !this.qt) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.sf = drawableMutate;
        if (this.f18017co) {
            drawableMutate.setColorFilter(this.jbs);
        }
    }

    private Drawable lr() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.slm;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.slm = 0;
            }
        }
        return lr.ri(drawable);
    }

    private Drawable ri() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.vr;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.vr = 0;
            }
        }
        return lr.ri(drawable);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ka kaVar = this.ac;
        if (kaVar != null) {
            kaVar.lr(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.xha.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.xha;
    }

    public float getBorderRadius() {
        return this.ihz.ri();
    }

    public float getBorderWidth() {
        return this.mj;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float[] fArr = this.fi;
        float fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (float f : fArr) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.ri.xha
    public float getRipple() {
        return this.ik;
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getRubIn() {
        return this.ihz.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.bu;
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getShine() {
        return this.ihz.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getStretch() {
        return this.ihz.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.nr;
    }

    public Shader.TileMode getTileModeY() {
        return this.tan;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka kaVar = this.ac;
        if (kaVar != null) {
            kaVar.xha();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ka kaVar = this.ac;
        if (kaVar != null) {
            kaVar.mj();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ka kaVar = this.ac;
        if (kaVar != null) {
            kaVar.ri(canvas, this);
            this.ac.ri(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ka kaVar = this.ac;
        if (kaVar != null) {
            kaVar.ri(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        ka kaVar = this.ac;
        if (kaVar == null) {
            super.onMeasure(i, i2);
        } else {
            int[] iArrRi = kaVar.ri(i, i2);
            super.onMeasure(iArrRi[0], iArrRi[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ka kaVar = this.ac;
        if (kaVar != null) {
            kaVar.lr(i, i2, i3, i3);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.di = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.di = drawable;
        ri(true);
        super.setBackgroundDrawable(this.di);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.slm != i) {
            this.slm = i;
            Drawable drawableLr = lr();
            this.di = drawableLr;
            setBackgroundDrawable(drawableLr);
        }
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBorderRadius(float f) {
        mj mjVar = this.ihz;
        if (mjVar != null) {
            mjVar.ri(f);
        }
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.jbs != colorFilter) {
            this.jbs = colorFilter;
            this.f18017co = true;
            this.qt = true;
            ka();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        ri(f, f, f, f);
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        ri(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.vr = 0;
        this.sf = lr.ri(bitmap);
        ik();
        super.setImageDrawable(this.sf);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.vr = 0;
        this.sf = lr.ri(drawable);
        ik();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.vr != i) {
            this.vr = i;
            this.sf = ri();
            ik();
            super.setImageDrawable(this.sf);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.aw = z;
        ik();
        ri(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.ik = f;
        mj mjVar = this.ihz;
        if (mjVar != null) {
            mjVar.lr(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        mj mjVar = this.ihz;
        if (mjVar != null) {
            mjVar.fi(f);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!lr && scaleType == null) {
            throw new AssertionError();
        }
        if (this.bu != scaleType) {
            this.bu = scaleType;
            int i = AnonymousClass1.ri[scaleType.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            ik();
            ri(false);
            invalidate();
        }
    }

    public void setShine(float f) {
        mj mjVar = this.ihz;
        if (mjVar != null) {
            mjVar.ik(f);
        }
    }

    public void setStretch(float f) {
        mj mjVar = this.ihz;
        if (mjVar != null) {
            mjVar.ka(f);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.nr == tileMode) {
            return;
        }
        this.nr = tileMode;
        ik();
        ri(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.tan == tileMode) {
            return;
        }
        this.tan = tileMode;
        ik();
        ri(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.xha.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.xha = colorStateList;
        ik();
        ri(false);
        if (this.mj > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if (this.mj == f) {
            return;
        }
        this.mj = f;
        ik();
        ri(false);
        invalidate();
    }

    private void ri(boolean z) {
        if (this.bgr) {
            if (z) {
                this.di = lr.ri(this.di);
            }
            ri(this.di, ImageView.ScaleType.FIT_XY);
        }
    }

    private void ri(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof lr) {
            lr lrVar = (lr) drawable;
            lrVar.ri(scaleType).ri(this.mj).ri(this.xha).ri(this.aw).ri(this.nr).lr(this.tan);
            float[] fArr = this.fi;
            if (fArr != null) {
                lrVar.ri(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            ka();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                ri(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    public void ri(float f, float f2, float f3, float f4) {
        float[] fArr = this.fi;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        ik();
        ri(false);
        invalidate();
    }

    public void ri(ka kaVar) {
        this.ac = kaVar;
    }
}
