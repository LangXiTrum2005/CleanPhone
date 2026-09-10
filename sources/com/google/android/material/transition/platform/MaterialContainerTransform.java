package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialContainerTransform extends Transition {
    public static final String[] X = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ProgressThresholdsGroup f19613Y = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));
    public static final ProgressThresholdsGroup Z = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));
    public static final ProgressThresholdsGroup e0 = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));
    public static final ProgressThresholdsGroup f0 = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));

    @Retention(RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    public static class ProgressThresholds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f19618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f19619b;

        public ProgressThresholds(float f, float f2) {
            this.f19618a = f;
            this.f19619b = f2;
        }
    }

    public static class ProgressThresholdsGroup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProgressThresholds f19620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProgressThresholds f19621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ProgressThresholds f19622c;
        public final ProgressThresholds d;

        public ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f19620a = progressThresholds;
            this.f19621b = progressThresholds2;
            this.f19622c = progressThresholds3;
            this.d = progressThresholds4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    public static final class TransitionDrawable extends Drawable {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public final FitModeEvaluator f19623A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public FadeModeResult f19624B;
        public FitModeResult C;
        public RectF D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f19625E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f19626F;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f19627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RectF f19628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ShapeAppearanceModel f19629c;
        public final float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f19630e;
        public final RectF f;
        public final ShapeAppearanceModel g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f19631h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Paint f19632i;
        public final Paint j;
        public final Paint k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Paint f19633l;
        public final Paint m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final MaskEvaluator f19634n;
        public final PathMeasure o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final float f19635p;
        public final float[] q;
        public final boolean r;
        public final float s;
        public final float t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final RectF f19636u;
        public final RectF v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final RectF f19637w;
        public final RectF x;
        public final ProgressThresholdsGroup y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final FadeModeEvaluator f19638z;

        public TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup) {
            Paint paint = new Paint();
            this.f19632i = paint;
            Paint paint2 = new Paint();
            this.j = paint2;
            Paint paint3 = new Paint();
            this.k = paint3;
            this.f19633l = new Paint();
            Paint paint4 = new Paint();
            this.m = paint4;
            this.f19634n = new MaskEvaluator();
            this.q = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            Paint paint5 = new Paint();
            new Path();
            this.f19627a = view;
            this.f19628b = rectF;
            this.f19629c = shapeAppearanceModel;
            this.d = f;
            this.f19630e = view2;
            this.f = rectF2;
            this.g = shapeAppearanceModel2;
            this.f19631h = f2;
            this.r = z2;
            this.f19638z = fadeModeEvaluator;
            this.f19623A = fitModeEvaluator;
            this.y = progressThresholdsGroup;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.s = displayMetrics.widthPixels;
            this.t = displayMetrics.heightPixels;
            paint.setColor(0);
            paint2.setColor(0);
            paint3.setColor(0);
            materialShapeDrawable.l(ColorStateList.valueOf(0));
            materialShapeDrawable.o();
            materialShapeDrawable.x0 = false;
            materialShapeDrawable.n(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f19636u = rectF3;
            this.v = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f19637w = rectF4;
            this.x = new RectF(rectF4);
            PointF pointF = new PointF(rectF.centerX(), rectF.top);
            PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
            this.o = pathMeasure;
            this.f19635p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = TransitionUtils.f19644a;
            paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, 0, 0, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            d(0.0f);
        }

        public final void a(Canvas canvas) {
            c(canvas, this.k);
            Rect bounds = getBounds();
            RectF rectF = this.f19637w;
            TransitionUtils.f(canvas, bounds, rectF.left, rectF.top, this.C.f19606b, this.f19624B.f19601b, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public final void a(Canvas canvas2) {
                    TransitionDrawable.this.f19630e.draw(canvas2);
                }
            });
        }

        public final void b(Canvas canvas) {
            c(canvas, this.j);
            Rect bounds = getBounds();
            RectF rectF = this.f19636u;
            TransitionUtils.f(canvas, bounds, rectF.left, rectF.top, this.C.f19605a, this.f19624B.f19600a, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public final void a(Canvas canvas2) {
                    TransitionDrawable.this.f19627a.draw(canvas2);
                }
            });
        }

        public final void c(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX WARN: Code duplicated, block: B:45:0x0206  */
        /* JADX WARN: Code duplicated, block: B:48:0x0215  */
        public final void d(float f) {
            float f2;
            float f3;
            ShapeAppearanceModel shapeAppearanceModel;
            RectF rectF;
            float f4;
            Paint paint;
            Paint paint2;
            this.f19626F = f;
            this.m.setAlpha((int) (this.r ? TransitionUtils.c(0.0f, 255.0f, f) : TransitionUtils.c(255.0f, 0.0f, f)));
            float f5 = this.f19635p;
            PathMeasure pathMeasure = this.o;
            float[] fArr = this.q;
            pathMeasure.getPosTan(f5 * f, fArr, null);
            float fA = fArr[0];
            float fA2 = fArr[1];
            if (f > 1.0f || f < 0.0f) {
                if (f > 1.0f) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                pathMeasure.getPosTan(f5 * f2, fArr, null);
                float f6 = fArr[0];
                float f7 = fArr[1];
                fA = android.support.v4.media.a.a(fA, f6, f3, fA);
                fA2 = android.support.v4.media.a.a(fA2, f7, f3, fA2);
            }
            float f8 = fA2;
            float f9 = fA;
            ProgressThresholdsGroup progressThresholdsGroup = this.y;
            ProgressThresholds progressThresholds = progressThresholdsGroup.f19621b;
            ProgressThresholds progressThresholds2 = progressThresholdsGroup.f19621b;
            RectF rectF2 = this.f19628b;
            float fWidth = rectF2.width();
            float fHeight = rectF2.height();
            RectF rectF3 = this.f;
            FitModeResult fitModeResultA = this.f19623A.a(f, progressThresholds.f19618a, progressThresholds2.f19619b, fWidth, fHeight, rectF3.width(), rectF3.height());
            this.C = fitModeResultA;
            float f10 = fitModeResultA.f19607c / 2.0f;
            float f11 = fitModeResultA.d + f8;
            RectF rectF4 = this.f19636u;
            rectF4.set(f9 - f10, f8, f10 + f9, f11);
            FitModeResult fitModeResult = this.C;
            float f12 = fitModeResult.f19608e / 2.0f;
            float f13 = fitModeResult.f + f8;
            RectF rectF5 = this.f19637w;
            rectF5.set(f9 - f12, f8, f12 + f9, f13);
            RectF rectF6 = this.v;
            rectF6.set(rectF4);
            RectF rectF7 = this.x;
            rectF7.set(rectF5);
            ProgressThresholds progressThresholds3 = progressThresholdsGroup.f19622c;
            FitModeResult fitModeResult2 = this.C;
            FitModeEvaluator fitModeEvaluator = this.f19623A;
            boolean zB = fitModeEvaluator.b(fitModeResult2);
            RectF rectF8 = zB ? rectF6 : rectF7;
            float fD = TransitionUtils.d(0.0f, 1.0f, progressThresholds3.f19618a, progressThresholds3.f19619b, f, false);
            if (!zB) {
                fD = 1.0f - fD;
            }
            fitModeEvaluator.c(rectF8, fD, this.C);
            this.D = new RectF(Math.min(rectF6.left, rectF7.left), Math.min(rectF6.top, rectF7.top), Math.max(rectF6.right, rectF7.right), Math.max(rectF6.bottom, rectF7.bottom));
            ProgressThresholds progressThresholds4 = progressThresholdsGroup.d;
            MaskEvaluator maskEvaluator = this.f19634n;
            maskEvaluator.getClass();
            float f14 = progressThresholds4.f19618a;
            ShapeAppearanceModel shapeAppearanceModelA = this.f19629c;
            if (f >= f14) {
                float f15 = progressThresholds4.f19619b;
                shapeAppearanceModel = this.g;
                if (f > f15) {
                    f4 = f;
                    rectF = rectF7;
                } else {
                    rectF = rectF7;
                    TransitionUtils.AnonymousClass1 anonymousClass1 = new TransitionUtils.CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.platform.TransitionUtils.1

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ RectF f19645a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ RectF f19646b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ float f19647c;
                        public final /* synthetic */ float d;

                        /* JADX INFO: renamed from: e */
                        public final /* synthetic */ float f19648e;

                        public AnonymousClass1() {
                            rectF = rectF4;
                            rectF = rectF;
                            f = f14;
                            f = f15;
                            f = f;
                        }

                        public final AbsoluteCornerSize a(CornerSize cornerSize, CornerSize cornerSize2) {
                            return new AbsoluteCornerSize(TransitionUtils.d(cornerSize.a(rectF), cornerSize2.a(rectF), f, f, f, false));
                        }
                    };
                    f4 = f;
                    float fA3 = shapeAppearanceModelA.f19430e.a(rectF4);
                    CornerSize cornerSize = shapeAppearanceModelA.f19431h;
                    CornerSize cornerSize2 = shapeAppearanceModelA.g;
                    CornerSize cornerSize3 = shapeAppearanceModelA.f;
                    ShapeAppearanceModel.Builder builderF = ((fA3 == 0.0f && cornerSize3.a(rectF4) == 0.0f && cornerSize2.a(rectF4) == 0.0f && cornerSize.a(rectF4) == 0.0f) ? shapeAppearanceModel : shapeAppearanceModelA).f();
                    builderF.f19437e = anonymousClass1.a(shapeAppearanceModelA.f19430e, shapeAppearanceModel.f19430e);
                    builderF.f = anonymousClass1.a(cornerSize3, shapeAppearanceModel.f);
                    builderF.f19438h = anonymousClass1.a(cornerSize, shapeAppearanceModel.f19431h);
                    builderF.g = anonymousClass1.a(cornerSize2, shapeAppearanceModel.g);
                    shapeAppearanceModelA = builderF.a();
                }
                maskEvaluator.f19612e = shapeAppearanceModel;
                Path path = maskEvaluator.f19610b;
                maskEvaluator.d.a(shapeAppearanceModel, 1.0f, rectF6, null, path);
                ShapeAppearanceModel shapeAppearanceModel2 = maskEvaluator.f19612e;
                Path path2 = maskEvaluator.f19611c;
                maskEvaluator.d.a(shapeAppearanceModel2, 1.0f, rectF, null, path2);
                maskEvaluator.f19609a.op(path, path2, Path.Op.UNION);
                this.f19625E = TransitionUtils.c(this.d, this.f19631h, f4);
                float fCenterX = ((this.D.centerX() / (this.s / 2.0f)) - 1.0f) * 0.3f;
                float fCenterY = (this.D.centerY() / this.t) * 1.5f;
                float f16 = this.f19625E;
                this.f19633l.setShadowLayer(f16, (int) (fCenterX * f16), (int) (fCenterY * f16), 754974720);
                ProgressThresholds progressThresholds5 = progressThresholdsGroup.f19620a;
                this.f19624B = this.f19638z.a(f4, progressThresholds5.f19618a, progressThresholds5.f19619b);
                paint = this.j;
                if (paint.getColor() != 0) {
                    paint.setAlpha(this.f19624B.f19600a);
                }
                paint2 = this.k;
                if (paint2.getColor() != 0) {
                    paint2.setAlpha(this.f19624B.f19601b);
                }
                invalidateSelf();
            }
            f4 = f;
            rectF = rectF7;
            shapeAppearanceModel = shapeAppearanceModelA;
            maskEvaluator.f19612e = shapeAppearanceModel;
            Path path3 = maskEvaluator.f19610b;
            maskEvaluator.d.a(shapeAppearanceModel, 1.0f, rectF6, null, path3);
            ShapeAppearanceModel shapeAppearanceModel3 = maskEvaluator.f19612e;
            Path path4 = maskEvaluator.f19611c;
            maskEvaluator.d.a(shapeAppearanceModel3, 1.0f, rectF, null, path4);
            maskEvaluator.f19609a.op(path3, path4, Path.Op.UNION);
            this.f19625E = TransitionUtils.c(this.d, this.f19631h, f4);
            float fCenterX2 = ((this.D.centerX() / (this.s / 2.0f)) - 1.0f) * 0.3f;
            float fCenterY2 = (this.D.centerY() / this.t) * 1.5f;
            float f17 = this.f19625E;
            this.f19633l.setShadowLayer(f17, (int) (fCenterX2 * f17), (int) (fCenterY2 * f17), 754974720);
            ProgressThresholds progressThresholds6 = progressThresholdsGroup.f19620a;
            this.f19624B = this.f19638z.a(f4, progressThresholds6.f19618a, progressThresholds6.f19619b);
            paint = this.j;
            if (paint.getColor() != 0) {
                paint.setAlpha(this.f19624B.f19600a);
            }
            paint2 = this.k;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(this.f19624B.f19601b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            Paint paint = this.m;
            if (paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
            canvas.clipPath(this.f19634n.f19609a);
            c(canvas, this.f19632i);
            if (this.f19624B.f19602c) {
                b(canvas);
                a(canvas);
            } else {
                a(canvas);
                b(canvas);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i2) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(TransitionValues transitionValues) {
        ShapeAppearanceModel shapeAppearanceModel;
        View view = transitionValues.view;
        RectF rectF = TransitionUtils.f19644a;
        View viewFindViewById = view.findViewById(0);
        View viewA = viewFindViewById;
        if (viewFindViewById == null) {
            viewA = TransitionUtils.a(view);
        }
        transitionValues.view = viewA;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (!viewA.isLaidOut() && viewA.getWidth() == 0 && viewA.getHeight() == 0) {
            return;
        }
        final RectF rectF2 = viewA.getParent() == null ? new RectF(viewA.getLeft(), viewA.getTop(), viewA.getRight(), viewA.getBottom()) : TransitionUtils.b(viewA);
        transitionValues.values.put("materialContainerTransition:bounds", rectF2);
        Map map = transitionValues.values;
        if (viewA.getTag(R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
            shapeAppearanceModel = (ShapeAppearanceModel) viewA.getTag(R.id.mtrl_motion_snapshot_view);
        } else {
            Context context = viewA.getContext();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId != -1) {
                shapeAppearanceModel = ShapeAppearanceModel.a(context, resourceId, 0).a();
            } else {
                shapeAppearanceModel = viewA instanceof Shapeable ? ((Shapeable) viewA).getShapeAppearanceModel() : new ShapeAppearanceModel.Builder().a();
            }
        }
        map.put("materialContainerTransition:shapeAppearance", shapeAppearanceModel.g(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.platform.a
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize b(CornerSize cornerSize) {
                RectF rectF3 = TransitionUtils.f19644a;
                RectF rectF4 = rectF2;
                return cornerSize instanceof RelativeCornerSize ? (RelativeCornerSize) cornerSize : new RelativeCornerSize(cornerSize.a(rectF4) / Math.min(rectF4.width(), rectF4.height()));
            }
        }));
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        b(transitionValues);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        b(transitionValues);
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        final View viewA;
        RectF rectF;
        ProgressThresholdsGroup progressThresholdsGroup;
        int iC;
        View view = null;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF2 = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF2 != null && shapeAppearanceModel != null) {
                RectF rectF3 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF3 == null || shapeAppearanceModel2 == null) {
                    Log.w("MaterialContainerTransform", "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                final View view2 = transitionValues.view;
                final View view3 = transitionValues2.view;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (view4.getId() == 0) {
                    viewA = (View) view4.getParent();
                    view = view4;
                } else {
                    viewA = TransitionUtils.a(view4);
                }
                RectF rectFB = TransitionUtils.b(viewA);
                float f = -rectFB.left;
                float f2 = -rectFB.top;
                if (view != null) {
                    rectF = TransitionUtils.b(view);
                    rectF.offset(f, f2);
                } else {
                    rectF = new RectF(0.0f, 0.0f, viewA.getWidth(), viewA.getHeight());
                }
                rectF2.offset(f, f2);
                rectF3.offset(f, f2);
                boolean z2 = rectF3.height() * rectF3.width() > rectF2.height() * rectF2.width();
                Context context = view4.getContext();
                FastOutSlowInInterpolator fastOutSlowInInterpolator = AnimationUtils.f19079b;
                if (getInterpolator() == null) {
                    setInterpolator(MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, fastOutSlowInInterpolator));
                }
                int i2 = z2 ? R.attr.motionDurationLong2 : R.attr.motionDurationMedium4;
                if (i2 != 0 && getDuration() == -1 && (iC = MotionUtils.c(context, i2, -1)) != -1) {
                    setDuration(iC);
                }
                PathMotion pathMotion = getPathMotion();
                FadeModeEvaluator fadeModeEvaluator = z2 ? FadeModeEvaluators.f19598a : FadeModeEvaluators.f19599b;
                FitModeEvaluators.AnonymousClass1 anonymousClass1 = FitModeEvaluators.f19603a;
                FitModeEvaluators.AnonymousClass2 anonymousClass2 = FitModeEvaluators.f19604b;
                float fWidth = rectF2.width();
                float fHeight = rectF2.height();
                float fWidth2 = rectF3.width();
                float fHeight2 = rectF3.height();
                FitModeEvaluator fitModeEvaluator = (!z2 ? (fWidth2 * fHeight) / fWidth >= fHeight2 : (fHeight2 * fWidth) / fWidth2 >= fHeight) ? anonymousClass2 : anonymousClass1;
                PathMotion pathMotion2 = getPathMotion();
                if ((pathMotion2 instanceof ArcMotion) || (pathMotion2 instanceof MaterialArcMotion)) {
                    ProgressThresholdsGroup progressThresholdsGroup2 = e0;
                    ProgressThresholdsGroup progressThresholdsGroup3 = f0;
                    if (!z2) {
                        progressThresholdsGroup2 = progressThresholdsGroup3;
                    }
                    progressThresholdsGroup = new ProgressThresholdsGroup(progressThresholdsGroup2.f19620a, progressThresholdsGroup2.f19621b, progressThresholdsGroup2.f19622c, progressThresholdsGroup2.d);
                } else {
                    ProgressThresholdsGroup progressThresholdsGroup4 = f19613Y;
                    ProgressThresholdsGroup progressThresholdsGroup5 = Z;
                    if (!z2) {
                        progressThresholdsGroup4 = progressThresholdsGroup5;
                    }
                    progressThresholdsGroup = new ProgressThresholdsGroup(progressThresholdsGroup4.f19620a, progressThresholdsGroup4.f19621b, progressThresholdsGroup4.f19622c, progressThresholdsGroup4.d);
                }
                final TransitionDrawable transitionDrawable = new TransitionDrawable(pathMotion, view2, rectF2, shapeAppearanceModel, 0.0f, view3, rectF3, shapeAppearanceModel2, 0.0f, z2, fadeModeEvaluator, fitModeEvaluator, progressThresholdsGroup);
                transitionDrawable.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        TransitionDrawable transitionDrawable2 = transitionDrawable;
                        if (transitionDrawable2.f19626F != animatedFraction) {
                            transitionDrawable2.d(animatedFraction);
                        }
                    }
                });
                addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.2
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public final void onTransitionEnd(Transition transition) {
                        MaterialContainerTransform.this.removeListener(this);
                    }

                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public final void onTransitionStart(Transition transition) {
                        ViewUtils.d(viewA).a(transitionDrawable);
                        view2.setAlpha(0.0f);
                        view3.setAlpha(0.0f);
                    }
                });
                return valueAnimatorOfFloat;
            }
            Log.w("MaterialContainerTransform", "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return X;
    }
}
