package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.IndexBasedArrayIterator;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.PerformanceTracker;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.utils.MeanCalculator;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f9819A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BlurMaskFilter f9820B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f9821a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f9822b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f9823c = new Matrix();
    public final LPaint d = new LPaint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LPaint f9824e;
    public final LPaint f;
    public final LPaint g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LPaint f9825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f9826i;
    public final RectF j;
    public final RectF k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f9827l;
    public final RectF m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f9828n;
    public final LottieDrawable o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Layer f9829p;
    public final MaskKeyframeAnimation q;
    public final FloatKeyframeAnimation r;
    public BaseLayer s;
    public BaseLayer t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f9830u;
    public final ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TransformKeyframeAnimation f9831w;
    public boolean x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LPaint f9832z;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.BaseLayer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9834b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f9834b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9834b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9834b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9834b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f9833a = iArr2;
            try {
                iArr2[4] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9833a[0] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9833a[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9833a[2] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9833a[3] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9833a[5] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9833a[6] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public BaseLayer(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f9824e = new LPaint(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new LPaint(mode2);
        LPaint lPaint = new LPaint(1);
        this.g = lPaint;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        LPaint lPaint2 = new LPaint();
        lPaint2.setXfermode(new PorterDuffXfermode(mode3));
        this.f9825h = lPaint2;
        this.f9826i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.f9827l = new RectF();
        this.m = new RectF();
        this.f9828n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.f9819A = 0.0f;
        this.o = lottieDrawable;
        this.f9829p = layer;
        layer.f9842c.concat("#draw");
        if (layer.f9849u == Layer.MatteType.f9852Y) {
            lPaint.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            lPaint.setXfermode(new PorterDuffXfermode(mode));
        }
        AnimatableTransform animatableTransform = layer.f9845i;
        animatableTransform.getClass();
        TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
        this.f9831w = transformKeyframeAnimation;
        transformKeyframeAnimation.b(this);
        List list = layer.f9844h;
        if (list != null && !list.isEmpty()) {
            MaskKeyframeAnimation maskKeyframeAnimation = new MaskKeyframeAnimation(list);
            this.q = maskKeyframeAnimation;
            Iterator it = maskKeyframeAnimation.f9659a.iterator();
            while (it.hasNext()) {
                ((BaseKeyframeAnimation) it.next()).a(this);
            }
            for (BaseKeyframeAnimation baseKeyframeAnimation : this.q.f9660b) {
                g(baseKeyframeAnimation);
                baseKeyframeAnimation.a(this);
            }
        }
        Layer layer2 = this.f9829p;
        if (layer2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        FloatKeyframeAnimation floatKeyframeAnimation = new FloatKeyframeAnimation(layer2.t);
        this.r = floatKeyframeAnimation;
        floatKeyframeAnimation.f9644b = true;
        floatKeyframeAnimation.a(new BaseKeyframeAnimation.AnimationListener() { // from class: com.airbnb.lottie.model.layer.a
            @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
            public final void a() {
                BaseLayer baseLayer = this.f9866a;
                boolean z2 = baseLayer.r.l() == 1.0f;
                if (z2 != baseLayer.x) {
                    baseLayer.x = z2;
                    baseLayer.o.invalidateSelf();
                }
            }
        });
        boolean z2 = ((Float) this.r.f()).floatValue() == 1.0f;
        if (z2 != this.x) {
            this.x = z2;
            this.o.invalidateSelf();
        }
        g(this.r);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        this.f9831w.c(colorFilter, lottieValueCallback);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void e(KeyPath keyPath, int i2, ArrayList arrayList, KeyPath keyPath2) {
        BaseLayer baseLayer = this.s;
        Layer layer = this.f9829p;
        if (baseLayer != null) {
            String str = baseLayer.f9829p.f9842c;
            KeyPath keyPath3 = new KeyPath(keyPath2);
            keyPath3.f9728a.add(str);
            if (keyPath.a(i2, this.s.f9829p.f9842c)) {
                BaseLayer baseLayer2 = this.s;
                KeyPath keyPath4 = new KeyPath(keyPath3);
                keyPath4.f9729b = baseLayer2;
                arrayList.add(keyPath4);
            }
            if (keyPath.d(i2, layer.f9842c)) {
                this.s.q(keyPath, keyPath.b(i2, this.s.f9829p.f9842c) + i2, arrayList, keyPath3);
            }
        }
        if (keyPath.c(i2, layer.f9842c)) {
            String str2 = layer.f9842c;
            if (!"__container".equals(str2)) {
                KeyPath keyPath5 = new KeyPath(keyPath2);
                keyPath5.f9728a.add(str2);
                if (keyPath.a(i2, str2)) {
                    KeyPath keyPath6 = new KeyPath(keyPath5);
                    keyPath6.f9729b = this;
                    arrayList.add(keyPath6);
                }
                keyPath2 = keyPath5;
            }
            if (keyPath.d(i2, str2)) {
                q(keyPath, keyPath.b(i2, str2) + i2, arrayList, keyPath2);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void f(RectF rectF, Matrix matrix, boolean z2) {
        this.f9826i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f9828n;
        matrix2.set(matrix);
        if (z2) {
            List list = this.f9830u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((BaseLayer) this.f9830u.get(size)).f9831w.e());
                }
            } else {
                BaseLayer baseLayer = this.t;
                if (baseLayer != null) {
                    matrix2.preConcat(baseLayer.f9831w.e());
                }
            }
        }
        matrix2.preConcat(this.f9831w.e());
    }

    public final void g(BaseKeyframeAnimation baseKeyframeAnimation) {
        if (baseKeyframeAnimation == null) {
            return;
        }
        this.v.add(baseKeyframeAnimation);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void h(Canvas canvas, Matrix matrix, int i2) {
        int i3;
        float f;
        RectF rectF;
        LPaint lPaint;
        MaskKeyframeAnimation maskKeyframeAnimation;
        int i4 = 1;
        if (this.x) {
            Layer layer = this.f9829p;
            if (!layer.v) {
                i();
                Matrix matrix2 = this.f9822b;
                matrix2.reset();
                matrix2.set(matrix);
                for (int size = this.f9830u.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((BaseLayer) this.f9830u.get(size)).f9831w.e());
                }
                L.a();
                TransformKeyframeAnimation transformKeyframeAnimation = this.f9831w;
                BaseKeyframeAnimation baseKeyframeAnimation = transformKeyframeAnimation.j;
                int iIntValue = (int) ((((i2 / 255.0f) * (baseKeyframeAnimation == null ? 100 : ((Integer) baseKeyframeAnimation.f()).intValue())) / 100.0f) * 255.0f);
                if (!(this.s != null) && !n()) {
                    matrix2.preConcat(transformKeyframeAnimation.e());
                    k(canvas, matrix2, iIntValue);
                    L.a();
                    L.a();
                    o();
                    return;
                }
                RectF rectF2 = this.f9826i;
                f(rectF2, matrix2, false);
                if (this.s != null && layer.f9849u != Layer.MatteType.f9852Y) {
                    RectF rectF3 = this.f9827l;
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.s.f(rectF3, matrix, true);
                    if (!rectF2.intersect(rectF3)) {
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                matrix2.preConcat(transformKeyframeAnimation.e());
                RectF rectF4 = this.k;
                rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
                boolean zN = n();
                Path path = this.f9821a;
                MaskKeyframeAnimation maskKeyframeAnimation2 = this.q;
                int i5 = 3;
                int i6 = 2;
                if (zN) {
                    int size2 = maskKeyframeAnimation2.f9661c.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size2) {
                            Mask mask = (Mask) maskKeyframeAnimation2.f9661c.get(i7);
                            Path path2 = (Path) ((BaseKeyframeAnimation) maskKeyframeAnimation2.f9659a.get(i7)).f();
                            if (path2 != null) {
                                path.set(path2);
                                path.transform(matrix2);
                                int iOrdinal = mask.f9770a.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal != i4) {
                                        if (iOrdinal != i6) {
                                            if (iOrdinal == i5) {
                                            }
                                            rectF = this.m;
                                            path.computeBounds(rectF, false);
                                            if (i7 == 0) {
                                                rectF4.set(rectF);
                                            } else {
                                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                            }
                                        }
                                    }
                                    i3 = i4;
                                }
                                if (mask.d) {
                                    i3 = i4;
                                }
                                rectF = this.m;
                                path.computeBounds(rectF, false);
                                if (i7 == 0) {
                                    rectF4.set(rectF);
                                } else {
                                    rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                }
                            }
                            i7++;
                            i4 = i4;
                            i5 = 3;
                            i6 = 2;
                        } else {
                            i3 = i4;
                            if (!rectF2.intersect(rectF4)) {
                                f = 0.0f;
                                rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                        }
                        f = 0.0f;
                    }
                } else {
                    i3 = 1;
                    f = 0.0f;
                }
                RectF rectF5 = this.j;
                rectF5.set(f, f, canvas.getWidth(), canvas.getHeight());
                Matrix matrix3 = this.f9823c;
                canvas.getMatrix(matrix3);
                if (!matrix3.isIdentity()) {
                    matrix3.invert(matrix3);
                    matrix3.mapRect(rectF5);
                }
                if (!rectF2.intersect(rectF5)) {
                    rectF2.set(f, f, f, f);
                }
                L.a();
                if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                    LPaint lPaint2 = this.d;
                    lPaint2.setAlpha(255);
                    ThreadLocal threadLocal = Utils.f9946a;
                    canvas.saveLayer(rectF2, lPaint2);
                    L.a();
                    L.a();
                    j(canvas);
                    k(canvas, matrix2, iIntValue);
                    L.a();
                    if (n()) {
                        LPaint lPaint3 = this.f9824e;
                        canvas.saveLayer(rectF2, lPaint3);
                        L.a();
                        if (Build.VERSION.SDK_INT < 28) {
                            j(canvas);
                        }
                        L.a();
                        int i8 = 0;
                        while (i8 < maskKeyframeAnimation2.f9661c.size()) {
                            List list = maskKeyframeAnimation2.f9661c;
                            Mask mask2 = (Mask) list.get(i8);
                            ArrayList arrayList = maskKeyframeAnimation2.f9659a;
                            BaseKeyframeAnimation baseKeyframeAnimation2 = (BaseKeyframeAnimation) arrayList.get(i8);
                            BaseKeyframeAnimation baseKeyframeAnimation3 = (BaseKeyframeAnimation) maskKeyframeAnimation2.f9660b.get(i8);
                            int iOrdinal2 = mask2.f9770a.ordinal();
                            int i9 = i8;
                            LPaint lPaint4 = this.f;
                            boolean z2 = mask2.d;
                            if (iOrdinal2 != 0) {
                                maskKeyframeAnimation = maskKeyframeAnimation2;
                                if (iOrdinal2 == i3) {
                                    if (i9 == 0) {
                                        lPaint2.setColor(-16777216);
                                        lPaint2.setAlpha(255);
                                        canvas.drawRect(rectF2, lPaint2);
                                    }
                                    if (z2) {
                                        canvas.saveLayer(rectF2, lPaint4);
                                        L.a();
                                        canvas.drawRect(rectF2, lPaint2);
                                        lPaint4.setAlpha((int) (((Integer) baseKeyframeAnimation3.f()).intValue() * 2.55f));
                                        path.set((Path) baseKeyframeAnimation2.f());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, lPaint4);
                                        canvas.restore();
                                    } else {
                                        path.set((Path) baseKeyframeAnimation2.f());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, lPaint4);
                                    }
                                } else if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3 && !arrayList.isEmpty()) {
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= list.size()) {
                                                lPaint2.setAlpha(255);
                                                canvas.drawRect(rectF2, lPaint2);
                                                break;
                                            } else if (((Mask) list.get(i10)).f9770a != Mask.MaskMode.e0) {
                                                break;
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                } else if (z2) {
                                    canvas.saveLayer(rectF2, lPaint3);
                                    L.a();
                                    canvas.drawRect(rectF2, lPaint2);
                                    lPaint4.setAlpha((int) (((Integer) baseKeyframeAnimation3.f()).intValue() * 2.55f));
                                    path.set((Path) baseKeyframeAnimation2.f());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, lPaint4);
                                    canvas.restore();
                                } else {
                                    canvas.saveLayer(rectF2, lPaint3);
                                    L.a();
                                    path.set((Path) baseKeyframeAnimation2.f());
                                    path.transform(matrix2);
                                    lPaint2.setAlpha((int) (((Integer) baseKeyframeAnimation3.f()).intValue() * 2.55f));
                                    canvas.drawPath(path, lPaint2);
                                    canvas.restore();
                                }
                            } else {
                                maskKeyframeAnimation = maskKeyframeAnimation2;
                                if (z2) {
                                    canvas.saveLayer(rectF2, lPaint2);
                                    L.a();
                                    canvas.drawRect(rectF2, lPaint2);
                                    path.set((Path) baseKeyframeAnimation2.f());
                                    path.transform(matrix2);
                                    lPaint2.setAlpha((int) (((Integer) baseKeyframeAnimation3.f()).intValue() * 2.55f));
                                    canvas.drawPath(path, lPaint4);
                                    canvas.restore();
                                } else {
                                    path.set((Path) baseKeyframeAnimation2.f());
                                    path.transform(matrix2);
                                    lPaint2.setAlpha((int) (((Integer) baseKeyframeAnimation3.f()).intValue() * 2.55f));
                                    canvas.drawPath(path, lPaint2);
                                }
                            }
                            i3 = 1;
                            i8 = i9 + 1;
                            maskKeyframeAnimation2 = maskKeyframeAnimation;
                        }
                        canvas.restore();
                        L.a();
                    }
                    if (this.s != null) {
                        canvas.saveLayer(rectF2, this.g);
                        L.a();
                        L.a();
                        j(canvas);
                        this.s.h(canvas, matrix, iIntValue);
                        canvas.restore();
                        L.a();
                        L.a();
                    }
                    canvas.restore();
                    L.a();
                }
                if (this.y && (lPaint = this.f9832z) != null) {
                    lPaint.setStyle(Paint.Style.STROKE);
                    this.f9832z.setColor(-251901);
                    this.f9832z.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF2, this.f9832z);
                    this.f9832z.setStyle(Paint.Style.FILL);
                    this.f9832z.setColor(1357638635);
                    canvas.drawRect(rectF2, this.f9832z);
                }
                L.a();
                o();
                return;
            }
        }
        L.a();
    }

    public final void i() {
        if (this.f9830u != null) {
            return;
        }
        if (this.t == null) {
            this.f9830u = Collections.EMPTY_LIST;
            return;
        }
        this.f9830u = new ArrayList();
        for (BaseLayer baseLayer = this.t; baseLayer != null; baseLayer = baseLayer.t) {
            this.f9830u.add(baseLayer);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.f9826i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f9825h);
        L.a();
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i2);

    public BlurEffect l() {
        return this.f9829p.f9850w;
    }

    public DropShadowEffect m() {
        return this.f9829p.x;
    }

    public final boolean n() {
        MaskKeyframeAnimation maskKeyframeAnimation = this.q;
        return (maskKeyframeAnimation == null || maskKeyframeAnimation.f9659a.isEmpty()) ? false : true;
    }

    public final void o() {
        PerformanceTracker performanceTracker = this.o.X.f9514a;
        String str = this.f9829p.f9842c;
        if (!performanceTracker.f9553a) {
            return;
        }
        HashMap map = performanceTracker.f9555c;
        MeanCalculator meanCalculator = (MeanCalculator) map.get(str);
        if (meanCalculator == null) {
            meanCalculator = new MeanCalculator();
            map.put(str, meanCalculator);
        }
        int i2 = meanCalculator.f9944a + 1;
        meanCalculator.f9944a = i2;
        if (i2 == Integer.MAX_VALUE) {
            meanCalculator.f9944a = i2 / 2;
        }
        if (!str.equals("__container")) {
            return;
        }
        Iterator it = performanceTracker.f9554b.iterator();
        while (true) {
            IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
            if (!indexBasedArrayIterator.hasNext()) {
                return;
            } else {
                ((PerformanceTracker.FrameListener) indexBasedArrayIterator.next()).a();
            }
        }
    }

    public final void p(BaseKeyframeAnimation baseKeyframeAnimation) {
        this.v.remove(baseKeyframeAnimation);
    }

    public void r(boolean z2) {
        if (z2 && this.f9832z == null) {
            this.f9832z = new LPaint();
        }
        this.y = z2;
    }

    public void s(float f) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.f9831w;
        BaseKeyframeAnimation baseKeyframeAnimation = transformKeyframeAnimation.j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.j(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = transformKeyframeAnimation.m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.j(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = transformKeyframeAnimation.f9679n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.j(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = transformKeyframeAnimation.f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.j(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation5 = transformKeyframeAnimation.g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.j(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation6 = transformKeyframeAnimation.f9676h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.j(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation7 = transformKeyframeAnimation.f9677i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.j(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = transformKeyframeAnimation.k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.j(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = transformKeyframeAnimation.f9678l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.j(f);
        }
        MaskKeyframeAnimation maskKeyframeAnimation = this.q;
        int i2 = 0;
        if (maskKeyframeAnimation != null) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = maskKeyframeAnimation.f9659a;
                if (i3 >= arrayList.size()) {
                    break;
                }
                ((BaseKeyframeAnimation) arrayList.get(i3)).j(f);
                i3++;
            }
        }
        FloatKeyframeAnimation floatKeyframeAnimation3 = this.r;
        if (floatKeyframeAnimation3 != null) {
            floatKeyframeAnimation3.j(f);
        }
        BaseLayer baseLayer = this.s;
        if (baseLayer != null) {
            baseLayer.s(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((BaseKeyframeAnimation) arrayList2.get(i2)).j(f);
            i2++;
        }
    }

    public void q(KeyPath keyPath, int i2, ArrayList arrayList, KeyPath keyPath2) {
    }
}
