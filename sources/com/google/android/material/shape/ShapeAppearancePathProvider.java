package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ShapeAppearancePathProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShapePath[] f19441a = new ShapePath[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f19442b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f19443c = new Matrix[4];
    public final PointF d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f19444e = new Path();
    public final Path f = new Path();
    public final ShapePath g = new ShapePath();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f19445h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f19446i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f19447l = true;

    public static class Lazy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShapeAppearancePathProvider f19448a = new ShapeAppearancePathProvider();
    }

    public interface PathListener {
    }

    public static final class ShapeAppearancePathSpec {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShapeAppearanceModel f19449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f19450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f19451c;
        public final PathListener d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f19452e;

        public ShapeAppearancePathSpec(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, PathListener pathListener, Path path) {
            this.d = pathListener;
            this.f19449a = shapeAppearanceModel;
            this.f19452e = f;
            this.f19451c = rectF;
            this.f19450b = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f19441a[i2] = new ShapePath();
            this.f19442b[i2] = new Matrix();
            this.f19443c[i2] = new Matrix();
        }
    }

    public static ShapeAppearancePathProvider b() {
        return Lazy.f19448a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, PathListener pathListener, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        ShapePath[] shapePathArr;
        int i2;
        int i3;
        float[] fArr;
        float f2;
        RectF rectF2;
        char c2;
        ShapeAppearanceModel shapeAppearanceModel2;
        EdgeTreatment edgeTreatment;
        int i4;
        char c3;
        CornerSize cornerSize;
        CornerTreatment cornerTreatment;
        path.rewind();
        Path path2 = this.f19444e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f, rectF, pathListener, path);
        int i5 = 0;
        while (true) {
            matrixArr = this.f19443c;
            matrixArr2 = this.f19442b;
            shapePathArr = this.f19441a;
            i2 = 1;
            fArr = this.f19445h;
            f2 = shapeAppearancePathSpec.f19452e;
            rectF2 = shapeAppearancePathSpec.f19451c;
            c2 = 0;
            shapeAppearanceModel2 = shapeAppearancePathSpec.f19449a;
            if (i5 >= 4) {
                break;
            }
            if (i5 == 1) {
                cornerSize = shapeAppearanceModel2.g;
            } else if (i5 != 2) {
                cornerSize = i5 != 3 ? shapeAppearanceModel2.f : shapeAppearanceModel2.f19430e;
            } else {
                cornerSize = shapeAppearanceModel2.f19431h;
            }
            if (i5 == 1) {
                cornerTreatment = shapeAppearanceModel2.f19429c;
            } else if (i5 != 2) {
                cornerTreatment = i5 != 3 ? shapeAppearanceModel2.f19428b : shapeAppearanceModel2.f19427a;
            } else {
                cornerTreatment = shapeAppearanceModel2.d;
            }
            ShapePath shapePath = shapePathArr[i5];
            cornerTreatment.getClass();
            cornerTreatment.a(shapePath, f2, cornerSize.a(rectF2));
            int i6 = i5 + 1;
            float f3 = (i6 % 4) * 90;
            matrixArr2[i5].reset();
            PointF pointF = this.d;
            if (i5 == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i5 == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i5 != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i5].setTranslate(pointF.x, pointF.y);
            matrixArr2[i5].preRotate(f3);
            ShapePath shapePath2 = shapePathArr[i5];
            fArr[0] = shapePath2.f19455c;
            fArr[1] = shapePath2.d;
            matrixArr2[i5].mapPoints(fArr);
            matrixArr[i5].reset();
            matrixArr[i5].setTranslate(fArr[0], fArr[1]);
            matrixArr[i5].preRotate(f3);
            i5 = i6;
        }
        int i7 = 0;
        for (i3 = 4; i7 < i3; i3 = 4) {
            ShapePath shapePath3 = shapePathArr[i7];
            fArr[c2] = shapePath3.f19453a;
            fArr[i2] = shapePath3.f19454b;
            matrixArr2[i7].mapPoints(fArr);
            Path path4 = shapeAppearancePathSpec.f19450b;
            if (i7 == 0) {
                path4.moveTo(fArr[c2], fArr[i2]);
            } else {
                path4.lineTo(fArr[c2], fArr[i2]);
            }
            shapePathArr[i7].b(matrixArr2[i7], path4);
            PathListener pathListener2 = shapeAppearancePathSpec.d;
            if (pathListener2 != null) {
                ShapePath shapePath4 = shapePathArr[i7];
                Matrix matrix = matrixArr2[i7];
                MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
                BitSet bitSet = materialShapeDrawable.e0;
                shapePath4.getClass();
                bitSet.set(i7, (boolean) c2);
                shapePath4.a(shapePath4.f);
                materialShapeDrawable.f19415Y[i7] = new ShapePath.ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ ArrayList f19458c;
                    public final /* synthetic */ Matrix d;

                    public AnonymousClass1() {
                        arrayList = arrayList;
                        matrix = matrix;
                    }

                    @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
                    public final void a(Matrix matrix2, ShadowRenderer shadowRenderer, int i8, Canvas canvas) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((ShadowCompatOperation) it.next()).a(matrix, shadowRenderer, i8, canvas);
                        }
                    }
                };
            }
            int i8 = i7 + 1;
            int i9 = i8 % 4;
            ShapePath shapePath5 = shapePathArr[i7];
            fArr[0] = shapePath5.f19455c;
            fArr[i2] = shapePath5.d;
            matrixArr2[i7].mapPoints(fArr);
            ShapePath shapePath6 = shapePathArr[i9];
            float f4 = shapePath6.f19453a;
            float[] fArr2 = this.f19446i;
            fArr2[0] = f4;
            fArr2[i2] = shapePath6.f19454b;
            matrixArr2[i9].mapPoints(fArr2);
            ShapePath[] shapePathArr2 = shapePathArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[i2] - fArr2[i2])) - 0.001f, 0.0f);
            ShapePath shapePath7 = shapePathArr2[i7];
            fArr[0] = shapePath7.f19455c;
            fArr[i2] = shapePath7.d;
            matrixArr2[i7].mapPoints(fArr);
            int i10 = i2;
            float fAbs = (i7 == i10 || i7 == 3) ? Math.abs(rectF2.centerX() - fArr[0]) : Math.abs(rectF2.centerY() - fArr[i10]);
            ShapePath shapePath8 = this.g;
            shapePath8.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i7 == 1) {
                edgeTreatment = shapeAppearanceModel2.k;
            } else if (i7 != 2) {
                edgeTreatment = i7 != 3 ? shapeAppearanceModel2.j : shapeAppearanceModel2.f19432i;
            } else {
                edgeTreatment = shapeAppearanceModel2.f19433l;
            }
            edgeTreatment.c(fMax, fAbs, f2, shapePath8);
            Path path5 = this.j;
            path5.reset();
            shapePath8.b(matrixArr[i7], path5);
            if (this.f19447l && (edgeTreatment.b() || c(path5, i7) || c(path5, i9))) {
                path5.op(path5, path3, Path.Op.DIFFERENCE);
                fArr[0] = shapePath8.f19453a;
                i4 = 1;
                fArr[1] = shapePath8.f19454b;
                matrixArr[i7].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                shapePath8.b(matrixArr[i7], path2);
            } else {
                i4 = 1;
                shapePath8.b(matrixArr[i7], path4);
            }
            if (pathListener2 != null) {
                Matrix matrix2 = matrixArr[i7];
                MaterialShapeDrawable materialShapeDrawable2 = MaterialShapeDrawable.this;
                c3 = 0;
                materialShapeDrawable2.e0.set(i7 + 4, false);
                shapePath8.a(shapePath8.f);
                materialShapeDrawable2.Z[i7] = new ShapePath.ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ ArrayList f19458c;
                    public final /* synthetic */ Matrix d;

                    public AnonymousClass1() {
                        arrayList = arrayList;
                        matrix = matrix;
                    }

                    @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
                    public final void a(Matrix matrix3, ShadowRenderer shadowRenderer, int i11, Canvas canvas) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((ShadowCompatOperation) it.next()).a(matrix, shadowRenderer, i11, canvas);
                        }
                    }
                };
            } else {
                c3 = 0;
            }
            c2 = c3;
            i2 = i4;
            shapeAppearancePathSpec = shapeAppearancePathSpec;
            matrixArr = matrixArr;
            matrixArr2 = matrixArr2;
            shapePathArr = shapePathArr2;
            i7 = i8;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean c(Path path, int i2) {
        Path path2 = this.k;
        path2.reset();
        this.f19441a[i2].b(this.f19442b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
