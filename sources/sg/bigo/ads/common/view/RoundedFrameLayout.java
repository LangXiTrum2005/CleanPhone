package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public class RoundedFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f47606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f47607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f47608c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f47609e;
    private int f;
    private Paint g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f47610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f47611i;
    private float j;
    private Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f47612l;

    public RoundedFrameLayout(Context context) {
        this(context, null);
    }

    private void a() {
        if (this.j > 0.0f) {
            setLayerType(1, null);
            setWillNotDraw(false);
            Paint paint = new Paint();
            this.k = paint;
            paint.setShadowLayer(this.j, 0.0f, 0.0f, this.f47611i);
        }
    }

    private Path getPath() {
        Path path = new Path();
        float f = this.f47606a;
        float f2 = this.f47607b;
        float f3 = this.d;
        float f4 = this.f47608c;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = this.f47612l;
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        return path;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.k != null) {
            float f = this.j;
            RectF rectF = new RectF(f, f, getWidth() - this.j, getHeight() - this.j);
            this.f47612l = rectF;
            float f2 = this.f47606a;
            canvas.drawRoundRect(rectF, f2, f2, this.k);
        }
        canvas.clipPath(getPath());
        super.dispatchDraw(canvas);
        Paint paint = this.g;
        float f3 = this.f47609e;
        RectF rectF2 = this.f47610h;
        if (paint != null && rectF2 != null && f3 > 0.0f) {
            float width = getWidth();
            float height = getHeight();
            if (width > 0.0f && height > 0.0f) {
                paint.setColor(this.f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f3);
                paint.setAntiAlias(true);
                rectF2.set(0.0f, 0.0f, width, height);
                float f4 = this.f47606a;
                canvas.drawRoundRect(rectF2, f4, f4, paint);
            }
        }
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadiusBottomLeft() {
        return this.f47608c;
    }

    public float getCornerRadiusBottomRight() {
        return this.d;
    }

    public float getCornerRadiusTopLeft() {
        return this.f47606a;
    }

    public float getCornerRadiusTopRight() {
        return this.f47607b;
    }

    public void setCornerRadius(float f) {
        a(f, f, f, f);
    }

    public void setShadowColor(int i2) {
        this.f47611i = i2;
        invalidate();
    }

    public void setShadowRadius(float f) {
        boolean z2 = this.k == null;
        this.j = f;
        if (z2) {
            a();
        }
        invalidate();
    }

    public void setStrokeColor(int i2) {
        this.f = i2;
        if (this.g == null) {
            this.g = new Paint();
        }
        if (this.f47610h == null) {
            this.f47610h = new RectF();
        }
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f47609e = f;
        if (this.g == null) {
            this.g = new Paint();
        }
        if (this.f47610h == null) {
            this.f47610h = new RectF();
        }
        invalidate();
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.f47606a = f;
        this.f47607b = f2;
        this.f47608c = f3;
        this.d = f4;
        invalidate();
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundedFrameLayout);
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_radius, 0.0f);
            this.f47606a = dimension;
            this.f47607b = dimension;
            this.f47608c = dimension;
            this.d = dimension;
            if (dimension == 0.0f) {
                this.f47606a = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_topLeftRadius, 0.0f);
                this.f47607b = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_topRightRadius, 0.0f);
                this.f47608c = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_bottomLeftRadius, 0.0f);
                this.d = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_bottomRightRadius, 0.0f);
            }
            this.f47611i = typedArrayObtainStyledAttributes.getColor(R.styleable.RoundedFrameLayout_bigo_ad_shadowColor, Color.parseColor("#00FFFFFF"));
            this.j = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_shadowRadius, -1.0f);
            a();
        } catch (Exception unused) {
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
