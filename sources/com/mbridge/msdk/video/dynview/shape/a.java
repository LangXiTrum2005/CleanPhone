package com.mbridge.msdk.video.dynview.shape;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a extends ShapeDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f37407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f37408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f37411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f37412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f37414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Matrix f37415j;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RectShape f37416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f37417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f37418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f37419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f37420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f37421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f37422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f37423h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f37424i;

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public a build() {
            return new a(this);
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c orientation(int i10) {
            this.f37420e = i10;
            return this;
        }

        private b() {
            this.f37421f = 100;
            this.f37422g = 10;
            this.f37416a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(Bitmap bitmap) {
            this.f37418c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c b(Bitmap bitmap) {
            this.f37417b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(boolean z10) {
            this.f37419d = z10;
            return this;
        }

        public c b(float f10) {
            this.f37423h = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(float f10) {
            this.f37424i = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(int i10) {
            this.f37422g = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        c a(float f10);

        c a(int i10);

        c a(Bitmap bitmap);

        c a(boolean z10);

        c b(Bitmap bitmap);

        a build();

        c orientation(int i10);
    }

    private void a(Canvas canvas) {
        float f10 = this.f37407b / 2.0f;
        Path path = new Path();
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f37408c);
        path.lineTo((f10 - this.f37409d) - this.f37410e, this.f37408c);
        path.lineTo((this.f37409d + f10) - this.f37410e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.f37413h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f37411f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f37411f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f37409d + f10 + this.f37410e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path2.lineTo(this.f37407b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path2.lineTo(this.f37407b, this.f37408c);
        path2.lineTo((f10 - this.f37409d) + this.f37410e, this.f37408c);
        if (this.f37413h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f37412g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f37412g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f10 = this.f37408c / 2.0f;
        Path path = new Path();
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (this.f37409d + f10) - this.f37410e);
        path.lineTo(this.f37407b, (f10 - this.f37409d) - this.f37410e);
        path.lineTo(this.f37407b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.f37413h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f37411f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f37411f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f37409d + f10 + this.f37410e);
        path2.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f37408c);
        path2.lineTo(this.f37407b, this.f37408c);
        path2.lineTo(this.f37407b, (f10 - this.f37409d) + this.f37410e);
        if (this.f37413h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f37412g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f37412g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f37406a == 1) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private a(b bVar) {
        super(bVar.f37416a);
        this.f37413h = false;
        this.f37411f = bVar.f37417b;
        this.f37412g = bVar.f37418c;
        this.f37413h = bVar.f37419d;
        this.f37406a = bVar.f37420e;
        this.f37409d = bVar.f37421f;
        this.f37410e = bVar.f37422g;
        this.f37407b = bVar.f37423h;
        this.f37408c = bVar.f37424i;
        Paint paint = new Paint();
        this.f37414i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f37414i.setAntiAlias(true);
        this.f37415j = new Matrix();
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float fMax = Math.max(this.f37407b / bitmap.getWidth(), this.f37408c / bitmap.getHeight());
            if (this.f37415j == null) {
                this.f37415j = new Matrix();
            }
            this.f37415j.reset();
            this.f37415j.preScale(fMax, fMax);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f37415j);
        this.f37414i.setShader(bitmapShader);
        canvas.drawPath(path, this.f37414i);
    }

    private void a(Canvas canvas, Path path) {
        this.f37414i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f37414i);
    }

    public static b a() {
        return new b();
    }
}
