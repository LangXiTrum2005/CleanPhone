package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
final class SubtitlePainter {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f7731A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f7732B;
    public int C;
    public int D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public StaticLayout f7733E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public StaticLayout f7734F;
    public int G;
    public int H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f7735I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Rect f7736J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7739c;
    public final float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7740e;
    public final TextPaint f;
    public final Paint g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f7741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f7742i;
    public Layout.Alignment j;
    public Bitmap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f7743l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7744n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7745p;
    public float q;
    public float r;
    public int s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7746u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7747w;
    public float x;
    public float y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f7748z;

    public SubtitlePainter(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.f7740e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f7737a = fRound;
        this.f7738b = fRound;
        this.f7739c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f7741h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z2) {
        Canvas canvas2;
        if (!z2) {
            this.f7736J.getClass();
            this.k.getClass();
            canvas.drawBitmap(this.k, (Rect) null, this.f7736J, this.f7741h);
            return;
        }
        StaticLayout staticLayout = this.f7733E;
        StaticLayout staticLayout2 = this.f7734F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f7746u) > 0) {
            Paint paint = this.g;
            paint.setColor(this.f7746u);
            canvas2 = canvas;
            canvas2.drawRect(-this.f7735I, 0.0f, staticLayout.getWidth() + this.f7735I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i2 = this.f7747w;
        TextPaint textPaint = this.f;
        if (i2 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f7737a);
            textPaint.setColor(this.v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f = this.f7738b;
            if (i2 == 2) {
                float f2 = this.f7739c;
                textPaint.setShadowLayer(f, f2, f2, this.v);
            } else if (i2 == 3 || i2 == 4) {
                boolean z3 = i2 == 3;
                int i3 = z3 ? -1 : this.v;
                int i4 = z3 ? this.v : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.s);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i3);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f, f3, f3, i4);
            }
        }
        textPaint.setColor(this.s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
