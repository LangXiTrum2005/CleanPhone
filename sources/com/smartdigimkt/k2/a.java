package com.smartdigimkt.k2;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: loaded from: classes.dex */
public class a extends ShapeDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f36156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f36157c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36158e;
    private Bitmap f;
    private Bitmap g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f36160i;

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RectShape f36161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f36162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f36163c;
        private boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f36164e;
        private int f;
        private int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f36165h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f36166i;

        private b() {
            this.f = 100;
            this.g = 10;
            this.f36161a = new RectShape();
        }

        @Override // com.smartdigimkt.k2.a.c
        public c a(Bitmap bitmap) {
            this.f36163c = bitmap;
            return this;
        }

        @Override // com.smartdigimkt.k2.a.c
        public c b(Bitmap bitmap) {
            this.f36162b = bitmap;
            return this;
        }

        @Override // com.smartdigimkt.k2.a.c
        public c c(int i2) {
            this.g = i2;
            return this;
        }

        @Override // com.smartdigimkt.k2.a.c
        public c a(boolean z2) {
            this.d = z2;
            return this;
        }

        @Override // com.smartdigimkt.k2.a.c
        public c b(float f) {
            this.f36165h = f;
            return this;
        }

        @Override // com.smartdigimkt.k2.a.c
        public c a(int i2) {
            this.f36164e = i2;
            return this;
        }

        @Override // com.smartdigimkt.k2.a.c
        public c b(int i2) {
            this.f = i2;
            return this;
        }

        @Override // com.smartdigimkt.k2.a.c
        public c a(float f) {
            this.f36166i = f;
            return this;
        }

        @Override // com.smartdigimkt.k2.a.c
        public a a() {
            return new a(this);
        }
    }

    public interface c {
        c a(float f);

        c a(int i2);

        c a(Bitmap bitmap);

        c a(boolean z2);

        a a();

        c b(float f);

        c b(int i2);

        c b(Bitmap bitmap);

        c c(int i2);
    }

    private void a(Canvas canvas) {
        float f = this.f36156b / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.f36157c);
        path.lineTo((f - this.d) - this.f36158e, this.f36157c);
        path.lineTo((this.d + f) - this.f36158e, 0.0f);
        if (this.f36159h) {
            try {
                a(canvas, path);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.d + f + this.f36158e, 0.0f);
        path2.lineTo(this.f36156b, 0.0f);
        path2.lineTo(this.f36156b, this.f36157c);
        path2.lineTo((f - this.d) + this.f36158e, this.f36157c);
        if (this.f36159h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e4) {
                e4.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.g);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f = this.f36157c / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (this.d + f) - this.f36158e);
        path.lineTo(this.f36156b, (f - this.d) - this.f36158e);
        path.lineTo(this.f36156b, 0.0f);
        if (this.f36159h) {
            try {
                a(canvas, path);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, this.d + f + this.f36158e);
        path2.lineTo(0.0f, this.f36157c);
        path2.lineTo(this.f36156b, this.f36157c);
        path2.lineTo(this.f36156b, (f - this.d) + this.f36158e);
        if (this.f36159h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e4) {
                e4.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.g);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f36155a == 1) {
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
        super(bVar.f36161a);
        this.f36159h = false;
        this.f = bVar.f36162b;
        this.g = bVar.f36163c;
        this.f36159h = bVar.d;
        this.f36155a = bVar.f36164e;
        this.d = bVar.f;
        this.f36158e = bVar.g;
        this.f36156b = bVar.f36165h;
        this.f36157c = bVar.f36166i;
        Paint paint = new Paint();
        this.f36160i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f36160i.setAntiAlias(true);
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f36160i.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        canvas.drawPath(path, this.f36160i);
    }

    private void a(Canvas canvas, Path path) {
        this.f36160i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f36160i);
    }

    public static b a() {
        return new b();
    }
}
