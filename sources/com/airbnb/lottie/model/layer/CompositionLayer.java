package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CompositionLayer extends BaseLayer {
    public BaseKeyframeAnimation C;
    public final ArrayList D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final RectF f9835E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final RectF f9836F;
    public final Paint G;
    public boolean H;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.CompositionLayer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9837a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f9837a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9837a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CompositionLayer(LottieDrawable lottieDrawable, Layer layer, List list, LottieComposition lottieComposition) {
        int i2;
        BaseLayer baseLayer;
        BaseLayer compositionLayer;
        super(lottieDrawable, layer);
        this.D = new ArrayList();
        this.f9835E = new RectF();
        this.f9836F = new RectF();
        this.G = new Paint();
        this.H = true;
        AnimatableFloatValue animatableFloatValue = layer.s;
        if (animatableFloatValue != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG = animatableFloatValue.g();
            this.C = baseKeyframeAnimationG;
            g(baseKeyframeAnimationG);
            this.C.a(this);
        } else {
            this.C = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(lottieComposition.f9519i.size());
        int size = list.size() - 1;
        BaseLayer baseLayer2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = (Layer) list.get(size);
            int iOrdinal = layer2.f9843e.ordinal();
            if (iOrdinal == 0) {
                compositionLayer = new CompositionLayer(lottieDrawable, layer2, (List) lottieComposition.f9516c.get(layer2.g), lottieComposition);
            } else if (iOrdinal == 1) {
                compositionLayer = new SolidLayer(lottieDrawable, layer2);
            } else if (iOrdinal == 2) {
                compositionLayer = new ImageLayer(lottieDrawable, layer2);
            } else if (iOrdinal == 3) {
                compositionLayer = new NullLayer(lottieDrawable, layer2);
            } else if (iOrdinal == 4) {
                compositionLayer = new ShapeLayer(lottieDrawable, layer2, this);
            } else if (iOrdinal != 5) {
                Logger.b("Unknown layer type " + layer2.f9843e);
                compositionLayer = null;
            } else {
                compositionLayer = new TextLayer(lottieDrawable, layer2);
            }
            if (compositionLayer != null) {
                longSparseArray.h(compositionLayer.f9829p.d, compositionLayer);
                if (baseLayer2 != null) {
                    baseLayer2.s = compositionLayer;
                    baseLayer2 = null;
                } else {
                    this.D.add(0, compositionLayer);
                    int iOrdinal2 = layer2.f9849u.ordinal();
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        baseLayer2 = compositionLayer;
                    }
                }
            }
            size--;
        }
        for (i2 = 0; i2 < longSparseArray.i(); i2++) {
            BaseLayer baseLayer3 = (BaseLayer) longSparseArray.d(longSparseArray.g(i2));
            if (baseLayer3 != null && (baseLayer = (BaseLayer) longSparseArray.d(baseLayer3.f9829p.f)) != null) {
                baseLayer3.t = baseLayer;
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        super.d(colorFilter, lottieValueCallback);
        if (colorFilter == LottieProperty.f9546z) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.C = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.a(this);
            g(this.C);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public final void f(RectF rectF, Matrix matrix, boolean z2) {
        super.f(rectF, matrix, z2);
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f9835E;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((BaseLayer) arrayList.get(size)).f(rectF2, this.f9828n, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void k(Canvas canvas, Matrix matrix, int i2) {
        RectF rectF = this.f9836F;
        Layer layer = this.f9829p;
        rectF.set(0.0f, 0.0f, layer.o, layer.f9848p);
        matrix.mapRect(rectF);
        boolean z2 = this.o.v0;
        ArrayList arrayList = this.D;
        boolean z3 = z2 && arrayList.size() > 1 && i2 != 255;
        if (z3) {
            Paint paint = this.G;
            paint.setAlpha(i2);
            Utils.e(canvas, rectF, paint);
        } else {
            canvas.save();
        }
        if (z3) {
            i2 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.H || !"__container".equals(layer.f9842c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((BaseLayer) arrayList.get(size)).h(canvas, matrix, i2);
            }
        }
        canvas.restore();
        L.a();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void q(KeyPath keyPath, int i2, ArrayList arrayList, KeyPath keyPath2) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.D;
            if (i3 >= arrayList2.size()) {
                return;
            }
            ((BaseLayer) arrayList2.get(i3)).e(keyPath, i2, arrayList, keyPath2);
            i3++;
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void r(boolean z2) {
        super.r(z2);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((BaseLayer) it.next()).r(z2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void s(float f) {
        super.s(f);
        BaseKeyframeAnimation baseKeyframeAnimation = this.C;
        Layer layer = this.f9829p;
        if (baseKeyframeAnimation != null) {
            LottieComposition lottieComposition = this.o.X;
            f = ((((Float) baseKeyframeAnimation.f()).floatValue() * layer.f9841b.m) - layer.f9841b.k) / ((lottieComposition.f9520l - lottieComposition.k) + 0.01f);
        }
        if (this.C == null) {
            LottieComposition lottieComposition2 = layer.f9841b;
            f -= layer.f9847n / (lottieComposition2.f9520l - lottieComposition2.k);
        }
        if (layer.m != 0.0f && !"__container".equals(layer.f9842c)) {
            f /= layer.m;
        }
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((BaseLayer) arrayList.get(size)).s(f);
        }
    }
}
