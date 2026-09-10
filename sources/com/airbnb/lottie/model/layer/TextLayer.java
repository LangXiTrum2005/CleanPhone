package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TextLayer extends BaseLayer {
    public final StringBuilder C;
    public final RectF D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Matrix f9855E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Paint f9856F;
    public final Paint G;
    public final HashMap H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final LongSparseArray f9857I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final TextKeyframeAnimation f9858J;
    public final LottieDrawable K;
    public final LottieComposition L;
    public final ColorKeyframeAnimation M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ValueCallbackKeyframeAnimation f9859N;
    public final ColorKeyframeAnimation O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ValueCallbackKeyframeAnimation f9860P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final FloatKeyframeAnimation f9861Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ValueCallbackKeyframeAnimation f9862R;
    public final FloatKeyframeAnimation S;
    public ValueCallbackKeyframeAnimation T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ValueCallbackKeyframeAnimation f9863U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ValueCallbackKeyframeAnimation f9864V;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.TextLayer$1, reason: invalid class name */
    public class AnonymousClass1 extends Paint {
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.TextLayer$2, reason: invalid class name */
    public class AnonymousClass2 extends Paint {
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.TextLayer$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9865a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f9865a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9865a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9865a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TextLayer(LottieDrawable lottieDrawable, Layer layer) {
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableColorValue animatableColorValue;
        AnimatableColorValue animatableColorValue2;
        super(lottieDrawable, layer);
        this.C = new StringBuilder(2);
        this.D = new RectF();
        this.f9855E = new Matrix();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(1);
        anonymousClass1.setStyle(Paint.Style.FILL);
        this.f9856F = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(1);
        anonymousClass2.setStyle(Paint.Style.STROKE);
        this.G = anonymousClass2;
        this.H = new HashMap();
        this.f9857I = new LongSparseArray();
        this.K = lottieDrawable;
        this.L = layer.f9841b;
        TextKeyframeAnimation textKeyframeAnimationG = layer.q.g();
        this.f9858J = textKeyframeAnimationG;
        textKeyframeAnimationG.a(this);
        g(textKeyframeAnimationG);
        AnimatableTextProperties animatableTextProperties = layer.r;
        if (animatableTextProperties != null && (animatableColorValue2 = animatableTextProperties.f9740a) != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG = animatableColorValue2.g();
            this.M = (ColorKeyframeAnimation) baseKeyframeAnimationG;
            baseKeyframeAnimationG.a(this);
            g(baseKeyframeAnimationG);
        }
        if (animatableTextProperties != null && (animatableColorValue = animatableTextProperties.f9741b) != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG2 = animatableColorValue.g();
            this.O = (ColorKeyframeAnimation) baseKeyframeAnimationG2;
            baseKeyframeAnimationG2.a(this);
            g(baseKeyframeAnimationG2);
        }
        if (animatableTextProperties != null && (animatableFloatValue2 = animatableTextProperties.f9742c) != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG3 = animatableFloatValue2.g();
            this.f9861Q = (FloatKeyframeAnimation) baseKeyframeAnimationG3;
            baseKeyframeAnimationG3.a(this);
            g(baseKeyframeAnimationG3);
        }
        if (animatableTextProperties == null || (animatableFloatValue = animatableTextProperties.d) == null) {
            return;
        }
        BaseKeyframeAnimation baseKeyframeAnimationG4 = animatableFloatValue.g();
        this.S = (FloatKeyframeAnimation) baseKeyframeAnimationG4;
        baseKeyframeAnimationG4.a(this);
        g(baseKeyframeAnimationG4);
    }

    public static void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        super.d(colorFilter, lottieValueCallback);
        PointF pointF = LottieProperty.f9535a;
        if (colorFilter == 1) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f9859N;
            if (valueCallbackKeyframeAnimation != null) {
                p(valueCallbackKeyframeAnimation);
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f9859N = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            g(this.f9859N);
            return;
        }
        if (colorFilter == 2) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = this.f9860P;
            if (valueCallbackKeyframeAnimation3 != null) {
                p(valueCallbackKeyframeAnimation3);
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f9860P = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.a(this);
            g(this.f9860P);
            return;
        }
        if (colorFilter == LottieProperty.f9542n) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = this.f9862R;
            if (valueCallbackKeyframeAnimation5 != null) {
                p(valueCallbackKeyframeAnimation5);
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation6 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f9862R = valueCallbackKeyframeAnimation6;
            valueCallbackKeyframeAnimation6.a(this);
            g(this.f9862R);
            return;
        }
        if (colorFilter == LottieProperty.o) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation7 = this.T;
            if (valueCallbackKeyframeAnimation7 != null) {
                p(valueCallbackKeyframeAnimation7);
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation8 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.T = valueCallbackKeyframeAnimation8;
            valueCallbackKeyframeAnimation8.a(this);
            g(this.T);
            return;
        }
        if (colorFilter == LottieProperty.f9529A) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation9 = this.f9863U;
            if (valueCallbackKeyframeAnimation9 != null) {
                p(valueCallbackKeyframeAnimation9);
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation10 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f9863U = valueCallbackKeyframeAnimation10;
            valueCallbackKeyframeAnimation10.a(this);
            g(this.f9863U);
            return;
        }
        if (colorFilter != LottieProperty.H) {
            if (colorFilter == LottieProperty.f9534J) {
                this.f9858J.l(lottieValueCallback);
                return;
            }
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation11 = this.f9864V;
        if (valueCallbackKeyframeAnimation11 != null) {
            p(valueCallbackKeyframeAnimation11);
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation12 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
        this.f9864V = valueCallbackKeyframeAnimation12;
        valueCallbackKeyframeAnimation12.a(this);
        g(this.f9864V);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public final void f(RectF rectF, Matrix matrix, boolean z2) {
        super.f(rectF, matrix, z2);
        LottieComposition lottieComposition = this.L;
        rectF.set(0.0f, 0.0f, lottieComposition.j.width(), lottieComposition.j.height());
    }

    /* JADX WARN: Code duplicated, block: B:152:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:154:0x0404  */
    /* JADX WARN: Code duplicated, block: B:156:0x0407  */
    /* JADX WARN: Code duplicated, block: B:157:0x040b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0415  */
    /* JADX WARN: Code duplicated, block: B:162:0x0430  */
    /* JADX WARN: Code duplicated, block: B:165:0x043f  */
    /* JADX WARN: Code duplicated, block: B:181:0x048b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0494  */
    /* JADX WARN: Code duplicated, block: B:184:0x049d A[LOOP:8: B:183:0x049b->B:184:0x049d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:189:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:209:0x0480 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void k(Canvas canvas, Matrix matrix, int i2) {
        FontAssetManager fontAssetManager;
        Typeface typeface;
        Typeface typefaceCreateFromAsset;
        int i3;
        float fFloatValue;
        float fC;
        List listAsList;
        int size;
        int i4;
        String str;
        float length;
        int iOrdinal;
        Canvas canvas2;
        float f;
        int length2;
        int iCodePointAt;
        int iCharCount;
        List list;
        long j;
        LongSparseArray longSparseArray;
        StringBuilder sb;
        int iCharCount2;
        int i5;
        String str2;
        int iCodePointAt2;
        Canvas canvas3;
        float f2;
        List list2;
        Paint paint;
        Paint paint2;
        float fFloatValue2;
        Paint paint3;
        Paint paint4;
        TextLayer textLayer = this;
        canvas.save();
        LottieDrawable lottieDrawable = textLayer.K;
        if (lottieDrawable.n0 != null || lottieDrawable.X.g.Z <= 0) {
            canvas.concat(matrix);
        }
        DocumentData documentData = (DocumentData) textLayer.f9858J.f();
        LottieComposition lottieComposition = textLayer.L;
        Font font = (Font) lottieComposition.f9517e.get(documentData.f9715b);
        if (font == null) {
            canvas.restore();
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = textLayer.f9859N;
        Paint paint5 = textLayer.f9856F;
        if (valueCallbackKeyframeAnimation != null) {
            paint5.setColor(((Integer) valueCallbackKeyframeAnimation.f()).intValue());
        } else {
            ColorKeyframeAnimation colorKeyframeAnimation = textLayer.M;
            if (colorKeyframeAnimation != null) {
                paint5.setColor(((Integer) colorKeyframeAnimation.f()).intValue());
            } else {
                paint5.setColor(documentData.f9718h);
            }
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = textLayer.f9860P;
        Paint paint6 = textLayer.G;
        if (valueCallbackKeyframeAnimation2 != null) {
            paint6.setColor(((Integer) valueCallbackKeyframeAnimation2.f()).intValue());
        } else {
            ColorKeyframeAnimation colorKeyframeAnimation2 = textLayer.O;
            if (colorKeyframeAnimation2 != null) {
                paint6.setColor(((Integer) colorKeyframeAnimation2.f()).intValue());
            } else {
                paint6.setColor(documentData.f9719i);
            }
        }
        BaseKeyframeAnimation baseKeyframeAnimation = textLayer.f9831w.j;
        int iIntValue = ((baseKeyframeAnimation == null ? 100 : ((Integer) baseKeyframeAnimation.f()).intValue()) * 255) / 100;
        paint5.setAlpha(iIntValue);
        paint6.setAlpha(iIntValue);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = textLayer.f9862R;
        if (valueCallbackKeyframeAnimation3 != null) {
            paint6.setStrokeWidth(((Float) valueCallbackKeyframeAnimation3.f()).floatValue());
        } else {
            FloatKeyframeAnimation floatKeyframeAnimation = textLayer.f9861Q;
            if (floatKeyframeAnimation != null) {
                paint6.setStrokeWidth(((Float) floatKeyframeAnimation.f()).floatValue());
            } else {
                paint6.setStrokeWidth(Utils.c() * documentData.j * Utils.d(matrix));
            }
        }
        boolean z2 = lottieDrawable.n0 == null && lottieDrawable.X.g.Z > 0;
        FloatKeyframeAnimation floatKeyframeAnimation2 = textLayer.S;
        String str3 = font.f9722b;
        String str4 = font.f9721a;
        if (z2) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = textLayer.f9863U;
            float fFloatValue3 = (valueCallbackKeyframeAnimation4 != null ? ((Float) valueCallbackKeyframeAnimation4.f()).floatValue() : documentData.f9716c) / 100.0f;
            float fD = Utils.d(matrix);
            String str5 = documentData.f9714a;
            float fC2 = Utils.c() * documentData.f;
            List listAsList2 = Arrays.asList(str5.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, "\r").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "\r").split("\r"));
            int size2 = listAsList2.size();
            int i6 = 0;
            while (i6 < size2) {
                String str6 = (String) listAsList2.get(i6);
                List list3 = listAsList2;
                int i7 = size2;
                float fC3 = 0.0f;
                int i8 = 0;
                while (i8 < str6.length()) {
                    int i9 = i8;
                    FontCharacter fontCharacter = (FontCharacter) lottieComposition.g.d(FontCharacter.a(str6.charAt(i8), str4, str3));
                    if (fontCharacter != null) {
                        fC3 = (float) ((fontCharacter.f9725c * ((double) fFloatValue3) * ((double) Utils.c()) * ((double) fD)) + ((double) fC3));
                    }
                    i8 = i9 + 1;
                    paint5 = paint5;
                    paint6 = paint6;
                }
                Paint paint7 = paint5;
                Paint paint8 = paint6;
                canvas.save();
                int iOrdinal2 = documentData.d.ordinal();
                if (iOrdinal2 == 1) {
                    f2 = 0.0f;
                    canvas.translate(-fC3, 0.0f);
                } else if (iOrdinal2 != 2) {
                    f2 = 0.0f;
                } else {
                    f2 = 0.0f;
                    canvas.translate((-fC3) / 2.0f, 0.0f);
                }
                canvas.translate(f2, (i6 * fC2) - (((i7 - 1) * fC2) / 2.0f));
                int i10 = 0;
                while (i10 < str6.length()) {
                    FontCharacter fontCharacter2 = (FontCharacter) lottieComposition.g.d(FontCharacter.a(str6.charAt(i10), str4, str3));
                    if (fontCharacter2 == null) {
                        lottieComposition = lottieComposition;
                        i10 = i10;
                        paint = paint7;
                        paint2 = paint8;
                    } else {
                        HashMap map = textLayer.H;
                        if (map.containsKey(fontCharacter2)) {
                            list2 = (List) map.get(fontCharacter2);
                        } else {
                            ArrayList arrayList = fontCharacter2.f9723a;
                            int size3 = arrayList.size();
                            ArrayList arrayList2 = new ArrayList(size3);
                            int i11 = 0;
                            while (i11 < size3) {
                                arrayList2.add(new ContentGroup(lottieDrawable, textLayer, (ShapeGroup) arrayList.get(i11)));
                                i11++;
                                arrayList = arrayList;
                            }
                            map.put(fontCharacter2, arrayList2);
                            list2 = arrayList2;
                        }
                        int i12 = 0;
                        while (i12 < list2.size()) {
                            Path pathU = ((ContentGroup) list2.get(i12)).u();
                            pathU.computeBounds(textLayer.D, false);
                            Matrix matrix2 = textLayer.f9855E;
                            matrix2.set(matrix);
                            int i13 = i12;
                            List list4 = list2;
                            matrix2.preTranslate(0.0f, (-documentData.g) * Utils.c());
                            matrix2.preScale(fFloatValue3, fFloatValue3);
                            pathU.transform(matrix2);
                            if (documentData.k) {
                                paint3 = paint7;
                                v(pathU, paint3, canvas);
                                paint4 = paint8;
                                v(pathU, paint4, canvas);
                            } else {
                                paint3 = paint7;
                                paint4 = paint8;
                                v(pathU, paint4, canvas);
                                v(pathU, paint3, canvas);
                            }
                            paint7 = paint3;
                            i12 = i13 + 1;
                            paint8 = paint4;
                            list2 = list4;
                        }
                        paint = paint7;
                        paint2 = paint8;
                        float fC4 = Utils.c() * ((float) fontCharacter2.f9725c) * fFloatValue3 * fD;
                        float f3 = documentData.f9717e / 10.0f;
                        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = textLayer.T;
                        if (valueCallbackKeyframeAnimation5 != null) {
                            fFloatValue2 = ((Float) valueCallbackKeyframeAnimation5.f()).floatValue();
                        } else {
                            if (floatKeyframeAnimation2 != null) {
                                fFloatValue2 = ((Float) floatKeyframeAnimation2.f()).floatValue();
                            }
                            canvas.translate((f3 * fD) + fC4, 0.0f);
                        }
                        f3 += fFloatValue2;
                        canvas.translate((f3 * fD) + fC4, 0.0f);
                    }
                    i10++;
                    paint7 = paint;
                    paint8 = paint2;
                    lottieComposition = lottieComposition;
                }
                canvas.restore();
                i6++;
                paint5 = paint7;
                paint6 = paint8;
                listAsList2 = list3;
                size2 = i7;
                lottieComposition = lottieComposition;
            }
            canvas3 = canvas;
        } else {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation6 = textLayer.f9864V;
            if (valueCallbackKeyframeAnimation6 == null || (typeface = (Typeface) valueCallbackKeyframeAnimation6.f()) == null) {
                if (lottieDrawable.getCallback() == null) {
                    fontAssetManager = null;
                } else {
                    if (lottieDrawable.l0 == null) {
                        lottieDrawable.l0 = new FontAssetManager(lottieDrawable.getCallback(), lottieDrawable.m0);
                    }
                    fontAssetManager = lottieDrawable.l0;
                }
                if (fontAssetManager != null) {
                    MutablePair mutablePair = fontAssetManager.f9703a;
                    mutablePair.f9735a = str4;
                    mutablePair.f9736b = str3;
                    HashMap map2 = fontAssetManager.f9704b;
                    Typeface typeface2 = (Typeface) map2.get(mutablePair);
                    if (typeface2 != null) {
                        typeface = typeface2;
                    } else {
                        HashMap map3 = fontAssetManager.f9705c;
                        Typeface typeface3 = (Typeface) map3.get(str4);
                        if (typeface3 != null) {
                            typefaceCreateFromAsset = typeface3;
                        } else {
                            typefaceCreateFromAsset = Typeface.createFromAsset(fontAssetManager.d, "fonts/" + str4 + fontAssetManager.f9706e);
                            map3.put(str4, typefaceCreateFromAsset);
                        }
                        boolean zContains = str3.contains("Italic");
                        boolean zContains2 = str3.contains("Bold");
                        if (zContains && zContains2) {
                            i3 = 3;
                        } else if (zContains) {
                            i3 = 2;
                        } else {
                            i3 = zContains2 ? 1 : 0;
                        }
                        if (typefaceCreateFromAsset.getStyle() != i3) {
                            typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                        }
                        map2.put(mutablePair, typefaceCreateFromAsset);
                        typeface = typefaceCreateFromAsset;
                    }
                } else {
                    typeface = null;
                }
                if (typeface == null) {
                    typeface = null;
                }
            }
            if (typeface != null) {
                String str7 = documentData.f9714a;
                if (lottieDrawable.n0 != null) {
                    String str8 = textLayer.f9829p.f9842c;
                }
                paint5.setTypeface(typeface);
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation7 = textLayer.f9863U;
                float fFloatValue4 = valueCallbackKeyframeAnimation7 != null ? ((Float) valueCallbackKeyframeAnimation7.f()).floatValue() : documentData.f9716c;
                paint5.setTextSize(Utils.c() * fFloatValue4);
                paint6.setTypeface(paint5.getTypeface());
                paint6.setTextSize(paint5.getTextSize());
                float fC5 = Utils.c() * documentData.f;
                float f4 = documentData.f9717e / 10.0f;
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation8 = textLayer.T;
                if (valueCallbackKeyframeAnimation8 != null) {
                    fFloatValue = ((Float) valueCallbackKeyframeAnimation8.f()).floatValue();
                } else {
                    if (floatKeyframeAnimation2 != null) {
                        fFloatValue = ((Float) floatKeyframeAnimation2.f()).floatValue();
                    }
                    fC = ((Utils.c() * f4) * fFloatValue4) / 100.0f;
                    listAsList = Arrays.asList(str7.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, "\r").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "\r").split("\r"));
                    size = listAsList.size();
                    i4 = 0;
                    while (i4 < size) {
                        str = (String) listAsList.get(i4);
                        length = ((str.length() - 1) * fC) + paint6.measureText(str);
                        canvas.save();
                        iOrdinal = documentData.d.ordinal();
                        if (iOrdinal != 1) {
                            canvas2 = canvas;
                            f = 0.0f;
                            canvas2.translate(-length, 0.0f);
                        } else if (iOrdinal != 2) {
                            canvas2 = canvas;
                            f = 0.0f;
                        } else {
                            canvas2 = canvas;
                            f = 0.0f;
                            canvas2.translate((-length) / 2.0f, 0.0f);
                        }
                        canvas2.translate(f, (i4 * fC5) - (((size - 1) * fC5) / 2.0f));
                        length2 = 0;
                        while (length2 < str.length()) {
                            iCodePointAt = str.codePointAt(length2);
                            iCharCount = Character.charCount(iCodePointAt) + length2;
                            while (true) {
                                if (iCharCount < str.length()) {
                                    list = listAsList;
                                    break;
                                }
                                iCodePointAt2 = str.codePointAt(iCharCount);
                                list = listAsList;
                                if (Character.getType(iCodePointAt2) == 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                    break;
                                }
                                iCharCount += Character.charCount(iCodePointAt2);
                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                listAsList = list;
                            }
                            j = iCodePointAt;
                            longSparseArray = textLayer.f9857I;
                            if (longSparseArray.f(j) >= 0) {
                                str2 = (String) longSparseArray.d(j);
                                i5 = size;
                            } else {
                                sb = textLayer.C;
                                sb.setLength(0);
                                iCharCount2 = length2;
                                while (iCharCount2 < iCharCount) {
                                    int i14 = size;
                                    int iCodePointAt3 = str.codePointAt(iCharCount2);
                                    sb.appendCodePoint(iCodePointAt3);
                                    iCharCount2 += Character.charCount(iCodePointAt3);
                                    size = i14;
                                }
                                i5 = size;
                                String string = sb.toString();
                                longSparseArray.h(j, string);
                                str2 = string;
                            }
                            length2 += str2.length();
                            if (documentData.k) {
                                t(str2, paint5, canvas2);
                                t(str2, paint6, canvas2);
                            } else {
                                t(str2, paint6, canvas2);
                                t(str2, paint5, canvas2);
                            }
                            canvas2.translate(paint5.measureText(str2) + fC, 0.0f);
                            textLayer = this;
                            listAsList = list;
                            size = i5;
                        }
                        canvas2.restore();
                        i4++;
                        textLayer = this;
                    }
                }
                f4 += fFloatValue;
                fC = ((Utils.c() * f4) * fFloatValue4) / 100.0f;
                listAsList = Arrays.asList(str7.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, "\r").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "\r").split("\r"));
                size = listAsList.size();
                i4 = 0;
                while (i4 < size) {
                    str = (String) listAsList.get(i4);
                    length = ((str.length() - 1) * fC) + paint6.measureText(str);
                    canvas.save();
                    iOrdinal = documentData.d.ordinal();
                    if (iOrdinal != 1) {
                        canvas2 = canvas;
                        f = 0.0f;
                        canvas2.translate(-length, 0.0f);
                    } else if (iOrdinal != 2) {
                        canvas2 = canvas;
                        f = 0.0f;
                    } else {
                        canvas2 = canvas;
                        f = 0.0f;
                        canvas2.translate((-length) / 2.0f, 0.0f);
                    }
                    canvas2.translate(f, (i4 * fC5) - (((size - 1) * fC5) / 2.0f));
                    length2 = 0;
                    while (length2 < str.length()) {
                        iCodePointAt = str.codePointAt(length2);
                        iCharCount = Character.charCount(iCodePointAt) + length2;
                        while (true) {
                            if (iCharCount < str.length()) {
                                list = listAsList;
                                break;
                            }
                            iCodePointAt2 = str.codePointAt(iCharCount);
                            list = listAsList;
                            if (Character.getType(iCodePointAt2) == 16) {
                            }
                            iCharCount += Character.charCount(iCodePointAt2);
                            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                            listAsList = list;
                        }
                        j = iCodePointAt;
                        longSparseArray = textLayer.f9857I;
                        if (longSparseArray.f(j) >= 0) {
                            str2 = (String) longSparseArray.d(j);
                            i5 = size;
                        } else {
                            sb = textLayer.C;
                            sb.setLength(0);
                            iCharCount2 = length2;
                            while (iCharCount2 < iCharCount) {
                                int i15 = size;
                                int iCodePointAt4 = str.codePointAt(iCharCount2);
                                sb.appendCodePoint(iCodePointAt4);
                                iCharCount2 += Character.charCount(iCodePointAt4);
                                size = i15;
                            }
                            i5 = size;
                            String string2 = sb.toString();
                            longSparseArray.h(j, string2);
                            str2 = string2;
                        }
                        length2 += str2.length();
                        if (documentData.k) {
                            t(str2, paint5, canvas2);
                            t(str2, paint6, canvas2);
                        } else {
                            t(str2, paint6, canvas2);
                            t(str2, paint5, canvas2);
                        }
                        canvas2.translate(paint5.measureText(str2) + fC, 0.0f);
                        textLayer = this;
                        listAsList = list;
                        size = i5;
                    }
                    canvas2.restore();
                    i4++;
                    textLayer = this;
                }
            }
            canvas3 = canvas;
        }
        canvas3.restore();
    }
}
