package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes4.dex */
public class ShapeAppearanceModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CornerTreatment f19427a = new RoundedCornerTreatment();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CornerTreatment f19428b = new RoundedCornerTreatment();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CornerTreatment f19429c = new RoundedCornerTreatment();
    public CornerTreatment d = new RoundedCornerTreatment();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CornerSize f19430e = new AbsoluteCornerSize(0.0f);
    public CornerSize f = new AbsoluteCornerSize(0.0f);
    public CornerSize g = new AbsoluteCornerSize(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CornerSize f19431h = new AbsoluteCornerSize(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeTreatment f19432i = new EdgeTreatment();
    public EdgeTreatment j = new EdgeTreatment();
    public EdgeTreatment k = new EdgeTreatment();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EdgeTreatment f19433l = new EdgeTreatment();

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CornerTreatment f19434a = new RoundedCornerTreatment();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CornerTreatment f19435b = new RoundedCornerTreatment();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CornerTreatment f19436c = new RoundedCornerTreatment();
        public CornerTreatment d = new RoundedCornerTreatment();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CornerSize f19437e = new AbsoluteCornerSize(0.0f);
        public CornerSize f = new AbsoluteCornerSize(0.0f);
        public CornerSize g = new AbsoluteCornerSize(0.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CornerSize f19438h = new AbsoluteCornerSize(0.0f);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public EdgeTreatment f19439i = new EdgeTreatment();
        public EdgeTreatment j = new EdgeTreatment();
        public EdgeTreatment k = new EdgeTreatment();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public EdgeTreatment f19440l = new EdgeTreatment();

        public static void b(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                ((RoundedCornerTreatment) cornerTreatment).getClass();
            } else if (cornerTreatment instanceof CutCornerTreatment) {
                ((CutCornerTreatment) cornerTreatment).getClass();
            }
        }

        public final ShapeAppearanceModel a() {
            ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
            shapeAppearanceModel.f19427a = this.f19434a;
            shapeAppearanceModel.f19428b = this.f19435b;
            shapeAppearanceModel.f19429c = this.f19436c;
            shapeAppearanceModel.d = this.d;
            shapeAppearanceModel.f19430e = this.f19437e;
            shapeAppearanceModel.f = this.f;
            shapeAppearanceModel.g = this.g;
            shapeAppearanceModel.f19431h = this.f19438h;
            shapeAppearanceModel.f19432i = this.f19439i;
            shapeAppearanceModel.j = this.j;
            shapeAppearanceModel.k = this.k;
            shapeAppearanceModel.f19433l = this.f19440l;
            return shapeAppearanceModel;
        }

        public final void c(float f) {
            f(f);
            g(f);
            e(f);
            d(f);
        }

        public final void d(float f) {
            this.f19438h = new AbsoluteCornerSize(f);
        }

        public final void e(float f) {
            this.g = new AbsoluteCornerSize(f);
        }

        public final void f(float f) {
            this.f19437e = new AbsoluteCornerSize(f);
        }

        public final void g(float f) {
            this.f = new AbsoluteCornerSize(f);
        }
    }

    public interface CornerSizeUnaryOperator {
        CornerSize b(CornerSize cornerSize);
    }

    public static Builder a(Context context, int i2, int i3) {
        return b(context, i2, i3, new AbsoluteCornerSize(0));
    }

    public static Builder b(Context context, int i2, int i3, AbsoluteCornerSize absoluteCornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.f19062B);
        try {
            int i4 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i5 = typedArrayObtainStyledAttributes.getInt(3, i4);
            int i6 = typedArrayObtainStyledAttributes.getInt(4, i4);
            int i7 = typedArrayObtainStyledAttributes.getInt(2, i4);
            int i8 = typedArrayObtainStyledAttributes.getInt(1, i4);
            CornerSize cornerSizeD = d(typedArrayObtainStyledAttributes, 5, absoluteCornerSize);
            CornerSize cornerSizeD2 = d(typedArrayObtainStyledAttributes, 8, cornerSizeD);
            CornerSize cornerSizeD3 = d(typedArrayObtainStyledAttributes, 9, cornerSizeD);
            CornerSize cornerSizeD4 = d(typedArrayObtainStyledAttributes, 7, cornerSizeD);
            CornerSize cornerSizeD5 = d(typedArrayObtainStyledAttributes, 6, cornerSizeD);
            Builder builder = new Builder();
            CornerTreatment cornerTreatmentA = MaterialShapeUtils.a(i5);
            builder.f19434a = cornerTreatmentA;
            Builder.b(cornerTreatmentA);
            builder.f19437e = cornerSizeD2;
            CornerTreatment cornerTreatmentA2 = MaterialShapeUtils.a(i6);
            builder.f19435b = cornerTreatmentA2;
            Builder.b(cornerTreatmentA2);
            builder.f = cornerSizeD3;
            CornerTreatment cornerTreatmentA3 = MaterialShapeUtils.a(i7);
            builder.f19436c = cornerTreatmentA3;
            Builder.b(cornerTreatmentA3);
            builder.g = cornerSizeD4;
            CornerTreatment cornerTreatmentA4 = MaterialShapeUtils.a(i8);
            builder.d = cornerTreatmentA4;
            Builder.b(cornerTreatmentA4);
            builder.f19438h = cornerSizeD5;
            return builder;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Builder c(Context context, AttributeSet attributeSet, int i2, int i3) {
        AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19075u, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, absoluteCornerSize);
    }

    public static CornerSize d(TypedArray typedArray, int i2, CornerSize cornerSize) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                return new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i3 == 6) {
                return new RelativeCornerSize(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cornerSize;
    }

    public final boolean e(RectF rectF) {
        boolean z2 = this.f19433l.getClass().equals(EdgeTreatment.class) && this.j.getClass().equals(EdgeTreatment.class) && this.f19432i.getClass().equals(EdgeTreatment.class) && this.k.getClass().equals(EdgeTreatment.class);
        float fA = this.f19430e.a(rectF);
        return z2 && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f19431h.a(rectF) > fA ? 1 : (this.f19431h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f19428b instanceof RoundedCornerTreatment) && (this.f19427a instanceof RoundedCornerTreatment) && (this.f19429c instanceof RoundedCornerTreatment) && (this.d instanceof RoundedCornerTreatment));
    }

    public final Builder f() {
        Builder builder = new Builder();
        builder.f19434a = this.f19427a;
        builder.f19435b = this.f19428b;
        builder.f19436c = this.f19429c;
        builder.d = this.d;
        builder.f19437e = this.f19430e;
        builder.f = this.f;
        builder.g = this.g;
        builder.f19438h = this.f19431h;
        builder.f19439i = this.f19432i;
        builder.j = this.j;
        builder.k = this.k;
        builder.f19440l = this.f19433l;
        return builder;
    }

    public final ShapeAppearanceModel g(CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        Builder builderF = f();
        builderF.f19437e = cornerSizeUnaryOperator.b(this.f19430e);
        builderF.f = cornerSizeUnaryOperator.b(this.f);
        builderF.f19438h = cornerSizeUnaryOperator.b(this.f19431h);
        builderF.g = cornerSizeUnaryOperator.b(this.g);
        return builderF.a();
    }
}
