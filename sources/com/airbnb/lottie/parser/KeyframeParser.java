package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class KeyframeParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SparseArrayCompat f9908b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f9907a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonReader.Options f9909c = JsonReader.Options.a("t", "s", "e", "o", i.f37957c, h.f36614b, "to", "ti");
    public static final JsonReader.Options d = JsonReader.Options.a("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator interpolatorA;
        pointF.x = MiscUtils.b(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = MiscUtils.b(pointF2.x, -1.0f, 1.0f);
        float fB = MiscUtils.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        ThreadLocal threadLocal = Utils.f9946a;
        int i2 = f != 0.0f ? (int) (IronSourceError.ERROR_NON_EXISTENT_INSTANCE * f) : 17;
        if (f2 != 0.0f) {
            i2 = (int) (i2 * 31 * f2);
        }
        if (f3 != 0.0f) {
            i2 = (int) (i2 * 31 * f3);
        }
        if (fB != 0.0f) {
            i2 = (int) (i2 * 31 * fB);
        }
        synchronized (KeyframeParser.class) {
            if (f9908b == null) {
                f9908b = new SparseArrayCompat();
            }
            weakReference = (WeakReference) f9908b.d(i2);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorA = PathInterpolatorCompat.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e2) {
            interpolatorA = "The Path cannot loop back on itself.".equals(e2.getMessage()) ? PathInterpolatorCompat.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            WeakReference weakReference2 = new WeakReference(interpolatorA);
            synchronized (KeyframeParser.class) {
                f9908b.e(i2, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return interpolatorA;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020a  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0033. Please report as an issue. */
    public static Keyframe b(JsonReader jsonReader, LottieComposition lottieComposition, float f, ValueParser valueParser, boolean z2, boolean z3) {
        Object obj;
        Interpolator interpolatorA;
        Object obj2;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        Interpolator interpolatorA4;
        Keyframe keyframe;
        PointF pointF;
        PointF pointF2;
        JsonReader.Options options;
        PointF pointF3;
        PointF pointF4;
        LinearInterpolator linearInterpolator = f9907a;
        JsonReader.Options options2 = f9909c;
        if (!z2 || !z3) {
            JsonReader.Options options3 = options2;
            if (!z2) {
                return new Keyframe(valueParser.a(jsonReader, f));
            }
            jsonReader.h();
            PointF pointFB = null;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            boolean z4 = false;
            PointF pointFB4 = null;
            Object objA = null;
            float fQ = 0.0f;
            Object objA2 = null;
            while (jsonReader.m()) {
                options3 = options3;
                switch (jsonReader.J(options3)) {
                    case 0:
                        fQ = (float) jsonReader.q();
                        continue;
                    case 1:
                        objA = valueParser.a(jsonReader, f);
                        break;
                    case 2:
                        objA2 = valueParser.a(jsonReader, f);
                        break;
                    case 3:
                        pointFB4 = JsonUtils.b(jsonReader, 1.0f);
                        break;
                    case 4:
                        pointFB = JsonUtils.b(jsonReader, 1.0f);
                        break;
                    case 5:
                        z4 = jsonReader.r() == 1;
                        break;
                    case 6:
                        pointFB2 = JsonUtils.b(jsonReader, f);
                        break;
                    case 7:
                        pointFB3 = JsonUtils.b(jsonReader, f);
                        break;
                    default:
                        jsonReader.P();
                        break;
                }
            }
            jsonReader.l();
            if (!z4) {
                if (pointFB4 == null || pointFB == null) {
                    obj = objA2;
                } else {
                    interpolatorA = a(pointFB4, pointFB);
                    obj = objA2;
                }
                Keyframe keyframe2 = new Keyframe(lottieComposition, objA, obj, interpolatorA, fQ, (Float) null);
                keyframe2.o = pointFB2;
                keyframe2.f9958p = pointFB3;
                return keyframe2;
            }
            obj = objA;
            interpolatorA = linearInterpolator;
            Keyframe keyframe3 = new Keyframe(lottieComposition, objA, obj, interpolatorA, fQ, (Float) null);
            keyframe3.o = pointFB2;
            keyframe3.f9958p = pointFB3;
            return keyframe3;
        }
        jsonReader.h();
        PointF pointF5 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z5 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF6 = null;
        Object objA3 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        float fQ2 = 0.0f;
        Object objA4 = null;
        while (jsonReader.m()) {
            int iJ = jsonReader.J(options2);
            JsonReader.Token token = JsonReader.Token.Z;
            linearInterpolator = linearInterpolator;
            JsonReader.Token token2 = JsonReader.Token.h0;
            z5 = z5;
            JsonReader.Options options4 = d;
            switch (iJ) {
                case 0:
                    options = options2;
                    pointF3 = pointFB5;
                    pointF4 = pointFB6;
                    fQ2 = (float) jsonReader.q();
                    pointFB5 = pointF3;
                    options2 = options;
                    pointFB6 = pointF4;
                    break;
                case 1:
                    objA3 = valueParser.a(jsonReader, f);
                    options2 = options2;
                    break;
                case 2:
                    objA4 = valueParser.a(jsonReader, f);
                    options2 = options2;
                    break;
                case 3:
                    options = options2;
                    pointF3 = pointFB5;
                    pointF4 = pointFB6;
                    Object obj3 = objA3;
                    if (jsonReader.H() == token) {
                        jsonReader.h();
                        float fQ3 = 0.0f;
                        float fQ4 = 0.0f;
                        float fQ5 = 0.0f;
                        float fQ6 = 0.0f;
                        while (jsonReader.m()) {
                            int iJ2 = jsonReader.J(options4);
                            if (iJ2 != 0) {
                                if (iJ2 != 1) {
                                    jsonReader.P();
                                } else if (jsonReader.H() == token2) {
                                    fQ6 = (float) jsonReader.q();
                                    fQ4 = fQ6;
                                } else {
                                    jsonReader.d();
                                    fQ4 = (float) jsonReader.q();
                                    fQ6 = jsonReader.H() == token2 ? (float) jsonReader.q() : fQ4;
                                    jsonReader.k();
                                }
                            } else if (jsonReader.H() == token2) {
                                fQ5 = (float) jsonReader.q();
                                fQ3 = fQ5;
                            } else {
                                jsonReader.d();
                                fQ3 = (float) jsonReader.q();
                                fQ5 = jsonReader.H() == token2 ? (float) jsonReader.q() : fQ3;
                                jsonReader.k();
                            }
                        }
                        PointF pointF9 = new PointF(fQ3, fQ4);
                        pointF7 = new PointF(fQ5, fQ6);
                        jsonReader.l();
                        objA3 = obj3;
                        pointF6 = pointF9;
                    } else {
                        pointFB7 = JsonUtils.b(jsonReader, f);
                        objA3 = obj3;
                    }
                    pointFB5 = pointF3;
                    options2 = options;
                    pointFB6 = pointF4;
                    break;
                case 4:
                    Object obj4 = objA3;
                    if (jsonReader.H() == token) {
                        jsonReader.h();
                        float fQ7 = 0.0f;
                        float fQ8 = 0.0f;
                        float fQ9 = 0.0f;
                        float fQ10 = 0.0f;
                        while (jsonReader.m()) {
                            JsonReader.Options options5 = options2;
                            int iJ3 = jsonReader.J(options4);
                            if (iJ3 != 0) {
                                pointF2 = pointFB6;
                                if (iJ3 != 1) {
                                    jsonReader.P();
                                } else if (jsonReader.H() == token2) {
                                    fQ10 = (float) jsonReader.q();
                                    pointFB5 = pointFB5;
                                    fQ8 = fQ10;
                                } else {
                                    pointF = pointFB5;
                                    jsonReader.d();
                                    fQ8 = (float) jsonReader.q();
                                    fQ10 = jsonReader.H() == token2 ? (float) jsonReader.q() : fQ8;
                                    jsonReader.k();
                                    pointFB5 = pointF;
                                }
                            } else {
                                pointF = pointFB5;
                                pointF2 = pointFB6;
                                if (jsonReader.H() == token2) {
                                    fQ9 = (float) jsonReader.q();
                                    pointFB5 = pointF;
                                    fQ7 = fQ9;
                                } else {
                                    jsonReader.d();
                                    fQ7 = (float) jsonReader.q();
                                    fQ9 = jsonReader.H() == token2 ? (float) jsonReader.q() : fQ7;
                                    jsonReader.k();
                                    pointFB5 = pointF;
                                }
                            }
                            options2 = options5;
                            pointFB6 = pointF2;
                        }
                        options2 = options2;
                        PointF pointF10 = new PointF(fQ7, fQ8);
                        pointF5 = new PointF(fQ9, fQ10);
                        jsonReader.l();
                        objA3 = obj4;
                        pointF8 = pointF10;
                    } else {
                        options2 = options2;
                        pointFB8 = JsonUtils.b(jsonReader, f);
                        objA3 = obj4;
                    }
                    options2 = options2;
                    break;
                case 5:
                    z5 = jsonReader.r() == 1;
                    break;
                case 6:
                    pointFB5 = JsonUtils.b(jsonReader, f);
                    z5 = z5;
                    break;
                case 7:
                    pointFB6 = JsonUtils.b(jsonReader, f);
                    z5 = z5;
                    break;
                default:
                    jsonReader.P();
                    z5 = z5;
                    break;
            }
        }
        LinearInterpolator linearInterpolator2 = linearInterpolator;
        PointF pointF11 = pointFB5;
        PointF pointF12 = pointFB6;
        boolean z6 = z5;
        Object obj5 = objA3;
        jsonReader.l();
        if (!z6) {
            if (pointFB7 != null && pointFB8 != null) {
                interpolatorA4 = a(pointFB7, pointFB8);
                obj2 = objA4;
                interpolatorA2 = null;
                interpolatorA3 = null;
            } else if (pointF6 == null || pointF7 == null || pointF8 == null || pointF5 == null) {
                obj2 = objA4;
            } else {
                interpolatorA2 = a(pointF6, pointF8);
                interpolatorA3 = a(pointF7, pointF5);
                obj2 = objA4;
                interpolatorA4 = null;
            }
            if (interpolatorA2 != null || interpolatorA3 == null) {
                keyframe = new Keyframe(lottieComposition, obj5, obj2, interpolatorA4, fQ2, (Float) null);
            } else {
                keyframe = new Keyframe(lottieComposition, obj5, obj2, interpolatorA2, interpolatorA3, fQ2);
            }
            keyframe.o = pointF11;
            keyframe.f9958p = pointF12;
            return keyframe;
        }
        obj2 = obj5;
        interpolatorA4 = linearInterpolator2;
        interpolatorA2 = null;
        interpolatorA3 = null;
        if (interpolatorA2 != null) {
            keyframe = new Keyframe(lottieComposition, obj5, obj2, interpolatorA4, fQ2, (Float) null);
        } else {
            keyframe = new Keyframe(lottieComposition, obj5, obj2, interpolatorA4, fQ2, (Float) null);
        }
        keyframe.o = pointF11;
        keyframe.f9958p = pointF12;
        return keyframe;
    }
}
