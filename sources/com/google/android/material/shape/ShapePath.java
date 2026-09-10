package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class ShapePath {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19455c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f19456e;
    public float f;
    public final ArrayList g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f19457h = new ArrayList();

    public static class ArcShadowOperation extends ShadowCompatOperation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PathArcOperation f19459c;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.f19459c = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i2, Canvas canvas) {
            PathArcOperation pathArcOperation = this.f19459c;
            shadowRenderer.a(canvas, matrix, new RectF(pathArcOperation.f19465b, pathArcOperation.f19466c, pathArcOperation.d, pathArcOperation.f19467e), i2, pathArcOperation.f, pathArcOperation.g);
        }
    }

    public static class InnerCornerShadowOperation extends ShadowCompatOperation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PathLineOperation f19460c;
        public final PathLineOperation d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f19461e;
        public final float f;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f, float f2) {
            this.f19460c = pathLineOperation;
            this.d = pathLineOperation2;
            this.f19461e = f;
            this.f = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i2, Canvas canvas) {
            float f;
            float f2;
            float f3;
            float fB = ((b() - c()) + 360.0f) % 360.0f;
            if (fB > 180.0f) {
                fB -= 360.0f;
            }
            if (fB > 0.0f) {
                return;
            }
            PathLineOperation pathLineOperation = this.f19460c;
            float f4 = pathLineOperation.f19468b;
            float f5 = this.f19461e;
            double d = f4 - f5;
            float f6 = pathLineOperation.f19469c;
            float f7 = this.f;
            double dHypot = Math.hypot(d, f6 - f7);
            PathLineOperation pathLineOperation2 = this.d;
            double dHypot2 = Math.hypot(pathLineOperation2.f19468b - pathLineOperation.f19468b, pathLineOperation2.f19469c - pathLineOperation.f19469c);
            float fMin = (float) Math.min(i2, Math.min(dHypot, dHypot2));
            double d2 = fMin;
            float f8 = -fB;
            float f9 = fB;
            double dTan = Math.tan(Math.toRadians(f8 / 2.0f)) * d2;
            Matrix matrix2 = this.f19472a;
            if (dHypot > dTan) {
                f = 0.0f;
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                matrix2.set(matrix);
                matrix2.preTranslate(f5, f7);
                matrix2.preRotate(c());
                shadowRenderer.b(canvas, matrix2, rectF, i2);
            } else {
                f = 0.0f;
            }
            float f10 = fMin * 2.0f;
            RectF rectF2 = new RectF(f, f, f10, f10);
            matrix2.set(matrix);
            matrix2.preTranslate(pathLineOperation.f19468b, pathLineOperation.f19469c);
            matrix2.preRotate(c());
            matrix2.preTranslate((float) ((-dTan) - d2), (-2.0f) * fMin);
            int i3 = (int) fMin;
            float[] fArr = {(float) (d2 + dTan), f10};
            shadowRenderer.getClass();
            if (fB > 0.0f) {
                f2 = f8;
                f3 = 450.0f + f9;
            } else {
                f2 = f9;
                f3 = 450.0f;
            }
            shadowRenderer.a(canvas, matrix2, rectF2, i3, f3, f2);
            Path path = shadowRenderer.g;
            path.rewind();
            path.moveTo(fArr[0], fArr[1]);
            path.arcTo(rectF2, f3, f2);
            path.close();
            canvas.save();
            canvas.concat(matrix2);
            canvas.scale(1.0f, rectF2.height() / rectF2.width());
            canvas.drawPath(path, shadowRenderer.f19410h);
            canvas.drawPath(path, shadowRenderer.f19406a);
            canvas.restore();
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                matrix2.set(matrix);
                matrix2.preTranslate(pathLineOperation.f19468b, pathLineOperation.f19469c);
                matrix2.preRotate(b());
                matrix2.preTranslate((float) dTan, 0.0f);
                shadowRenderer.b(canvas, matrix2, rectF3, i2);
            }
        }

        public final float b() {
            PathLineOperation pathLineOperation = this.d;
            float f = pathLineOperation.f19469c;
            PathLineOperation pathLineOperation2 = this.f19460c;
            return (float) Math.toDegrees(Math.atan((f - pathLineOperation2.f19469c) / (pathLineOperation.f19468b - pathLineOperation2.f19468b)));
        }

        public final float c() {
            PathLineOperation pathLineOperation = this.f19460c;
            return (float) Math.toDegrees(Math.atan((pathLineOperation.f19469c - this.f) / (pathLineOperation.f19468b - this.f19461e)));
        }
    }

    public static class LineShadowOperation extends ShadowCompatOperation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PathLineOperation f19462c;
        public final float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f19463e;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f, float f2) {
            this.f19462c = pathLineOperation;
            this.d = f;
            this.f19463e = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i2, Canvas canvas) {
            PathLineOperation pathLineOperation = this.f19462c;
            float f = pathLineOperation.f19469c;
            float f2 = this.f19463e;
            float f3 = pathLineOperation.f19468b;
            float f4 = this.d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
            Matrix matrix2 = this.f19472a;
            matrix2.set(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate(b());
            shadowRenderer.b(canvas, matrix2, rectF, i2);
        }

        public final float b() {
            PathLineOperation pathLineOperation = this.f19462c;
            return (float) Math.toDegrees(Math.atan((pathLineOperation.f19469c - this.f19463e) / (pathLineOperation.f19468b - this.d)));
        }
    }

    public static class PathArcOperation extends PathOperation {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final RectF f19464h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f19465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f19466c;
        public final float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f19467e;
        public float f;
        public float g;

        public PathArcOperation(float f, float f2, float f3, float f4) {
            this.f19465b = f;
            this.f19466c = f2;
            this.d = f3;
            this.f19467e = f4;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f19470a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f19464h;
            rectF.set(this.f19465b, this.f19466c, this.d, this.f19467e);
            path.arcTo(rectF, this.f, this.g, false);
            path.transform(matrix);
        }
    }

    public static class PathCubicOperation extends PathOperation {
        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f19470a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            path.transform(matrix);
        }
    }

    public static class PathLineOperation extends PathOperation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f19468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f19469c;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f19470a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f19468b, this.f19469c);
            path.transform(matrix);
        }
    }

    public static abstract class PathOperation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f19470a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static class PathQuadOperation extends PathOperation {
        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f19470a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(0.0f, 0.0f, 0.0f, 0.0f);
            path.transform(matrix);
        }
    }

    public static abstract class ShadowCompatOperation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Matrix f19471b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f19472a = new Matrix();

        public abstract void a(Matrix matrix, ShadowRenderer shadowRenderer, int i2, Canvas canvas);
    }

    public ShapePath() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.f19456e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f19455c;
        float f5 = this.d;
        PathArcOperation pathArcOperation = new PathArcOperation(f4, f5, f4, f5);
        pathArcOperation.f = this.f19456e;
        pathArcOperation.g = f3;
        this.f19457h.add(new ArcShadowOperation(pathArcOperation));
        this.f19456e = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((PathOperation) arrayList.get(i2)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f19468b = f;
        pathLineOperation.f19469c = f2;
        this.g.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, this.f19455c, this.d);
        float fB = lineShadowOperation.b() + 270.0f;
        float fB2 = lineShadowOperation.b() + 270.0f;
        a(fB);
        this.f19457h.add(lineShadowOperation);
        this.f19456e = fB2;
        this.f19455c = f;
        this.d = f2;
    }

    public final void d(float f, float f2, float f3) {
        if ((Math.abs(f - this.f19455c) < 0.001f && Math.abs(0.0f - this.d) < 0.001f) || (Math.abs(f - f2) < 0.001f && Math.abs(0.0f - f3) < 0.001f)) {
            c(f2, f3);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f19468b = f;
        pathLineOperation.f19469c = 0.0f;
        ArrayList arrayList = this.g;
        arrayList.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f19468b = f2;
        pathLineOperation2.f19469c = f3;
        arrayList.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, this.f19455c, this.d);
        float fB = ((innerCornerShadowOperation.b() - innerCornerShadowOperation.c()) + 360.0f) % 360.0f;
        if (fB > 180.0f) {
            fB -= 360.0f;
        }
        if (fB > 0.0f) {
            c(f, 0.0f);
            c(f2, f3);
            return;
        }
        float fC = innerCornerShadowOperation.c() + 270.0f;
        float fB2 = innerCornerShadowOperation.b() + 270.0f;
        a(fC);
        this.f19457h.add(innerCornerShadowOperation);
        this.f19456e = fB2;
        this.f19455c = f2;
        this.d = f3;
    }

    public final void e(float f, float f2, float f3, float f4) {
        this.f19453a = f;
        this.f19454b = f2;
        this.f19455c = f;
        this.d = f2;
        this.f19456e = f3;
        this.f = (f3 + f4) % 360.0f;
        this.g.clear();
        this.f19457h.clear();
    }
}
