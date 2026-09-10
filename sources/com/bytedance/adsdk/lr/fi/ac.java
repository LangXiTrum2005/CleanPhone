package com.bytedance.adsdk.lr.fi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
class ac {
    private static SparseArray<WeakReference<Interpolator>> lr;
    private static final Interpolator ri = new LinearInterpolator();

    /* JADX WARN: Code duplicated, block: B:129:0x0276  */
    private static <T> com.bytedance.adsdk.lr.xha.ri<T> lr(com.bytedance.adsdk.lr.xha xhaVar, JsonReader jsonReader, float f, kt<T> ktVar) throws IOException {
        Interpolator interpolatorRi;
        Interpolator interpolatorRi2;
        T t;
        Interpolator interpolator;
        Interpolator interpolatorRi3;
        com.bytedance.adsdk.lr.xha.ri<T> riVar;
        T t2;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        jsonReader.beginObject();
        boolean z = false;
        PointF pointFLr = null;
        PointF pointFLr2 = null;
        PointF pointF5 = null;
        T tLr = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointFLr3 = null;
        PointF pointFLr4 = null;
        float fNextDouble = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        T tLr2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tLr2 = ktVar.lr(jsonReader, f);
                    continue;
                    break;
                case "h":
                    t2 = tLr;
                    pointF = pointFLr3;
                    pointF2 = pointFLr4;
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "i":
                    boolean z2 = z;
                    t2 = tLr;
                    pointF = pointFLr3;
                    pointF2 = pointFLr4;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("x")) {
                                JsonToken jsonTokenPeek = jsonReader.peek();
                                JsonToken jsonToken = JsonToken.NUMBER;
                                if (jsonTokenPeek == jsonToken) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == jsonToken ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName2.equals("y")) {
                                JsonToken jsonTokenPeek2 = jsonReader.peek();
                                JsonToken jsonToken2 = JsonToken.NUMBER;
                                if (jsonTokenPeek2 == jsonToken2) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == jsonToken2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        PointF pointF9 = new PointF(fNextDouble2, fNextDouble3);
                        pointF8 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF7 = pointF9;
                    } else {
                        pointFLr2 = tan.lr(jsonReader, f);
                    }
                    z = z2;
                    break;
                case "o":
                    boolean z3 = z;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.hasNext()) {
                            tLr = tLr;
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals("x")) {
                                pointF3 = pointFLr3;
                                pointF4 = pointFLr4;
                                JsonToken jsonTokenPeek3 = jsonReader.peek();
                                JsonToken jsonToken3 = JsonToken.NUMBER;
                                if (jsonTokenPeek3 == jsonToken3) {
                                    fNextDouble8 = (float) jsonReader.nextDouble();
                                    fNextDouble6 = fNextDouble8;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = jsonReader.peek() == jsonToken3 ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName3.equals("y")) {
                                JsonToken jsonTokenPeek4 = jsonReader.peek();
                                JsonToken jsonToken4 = JsonToken.NUMBER;
                                if (jsonTokenPeek4 == jsonToken4) {
                                    fNextDouble9 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    jsonReader.beginArray();
                                    pointF3 = pointFLr3;
                                    pointF4 = pointFLr4;
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble9 = jsonReader.peek() == jsonToken4 ? (float) jsonReader.nextDouble() : fNextDouble7;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            pointFLr3 = pointF3;
                            pointFLr4 = pointF4;
                        }
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        PointF pointF11 = new PointF(fNextDouble8, fNextDouble9);
                        jsonReader.endObject();
                        pointF5 = pointF10;
                        pointF6 = pointF11;
                    } else {
                        pointFLr = tan.lr(jsonReader, f);
                    }
                    z = z3;
                    continue;
                    break;
                case "s":
                    tLr = ktVar.lr(jsonReader, f);
                    continue;
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "ti":
                    pointFLr4 = tan.lr(jsonReader, f);
                    continue;
                    break;
                case "to":
                    pointFLr3 = tan.lr(jsonReader, f);
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
                    break;
            }
            tLr = t2;
            pointFLr3 = pointF;
            pointFLr4 = pointF2;
        }
        boolean z4 = z;
        T t3 = tLr;
        PointF pointF12 = pointFLr3;
        PointF pointF13 = pointFLr4;
        jsonReader.endObject();
        if (!z4) {
            if (pointFLr != null && pointFLr2 != null) {
                interpolatorRi3 = ri(pointFLr, pointFLr2);
                interpolator = interpolatorRi3;
                t = tLr2;
                interpolatorRi = null;
                interpolatorRi2 = null;
            } else if (pointF5 != null && pointF6 != null && pointF7 != null && pointF8 != null) {
                interpolatorRi = ri(pointF5, pointF7);
                interpolatorRi2 = ri(pointF6, pointF8);
                t = tLr2;
                interpolator = null;
            }
            if (interpolatorRi != null || interpolatorRi2 == null) {
                riVar = new com.bytedance.adsdk.lr.xha.ri<>(xhaVar, t3, t, interpolator, fNextDouble, null);
            } else {
                riVar = new com.bytedance.adsdk.lr.xha.ri<>(xhaVar, t3, t, interpolatorRi, interpolatorRi2, fNextDouble, null);
            }
            riVar.mj = pointF12;
            riVar.jbs = pointF13;
            return riVar;
        }
        tLr2 = t3;
        interpolatorRi3 = ri;
        interpolator = interpolatorRi3;
        t = tLr2;
        interpolatorRi = null;
        interpolatorRi2 = null;
        if (interpolatorRi != null) {
            riVar = new com.bytedance.adsdk.lr.xha.ri<>(xhaVar, t3, t, interpolator, fNextDouble, null);
        } else {
            riVar = new com.bytedance.adsdk.lr.xha.ri<>(xhaVar, t3, t, interpolator, fNextDouble, null);
        }
        riVar.mj = pointF12;
        riVar.jbs = pointF13;
        return riVar;
    }

    private static SparseArray<WeakReference<Interpolator>> ri() {
        if (lr == null) {
            lr = new SparseArray<>();
        }
        return lr;
    }

    private static WeakReference<Interpolator> ri(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (ac.class) {
            weakReference = ri().get(i);
        }
        return weakReference;
    }

    private static void ri(int i, WeakReference<Interpolator> weakReference) {
        synchronized (ac.class) {
            lr.put(i, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.lr.xha.ri<T> ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar, float f, kt<T> ktVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return lr(xhaVar, jsonReader, f, ktVar);
        }
        if (z) {
            return ri(xhaVar, jsonReader, f, ktVar);
        }
        return ri(jsonReader, f, ktVar);
    }

    private static <T> com.bytedance.adsdk.lr.xha.ri<T> ri(com.bytedance.adsdk.lr.xha xhaVar, JsonReader jsonReader, float f, kt<T> ktVar) throws IOException {
        Interpolator interpolatorRi;
        jsonReader.beginObject();
        PointF pointFLr = null;
        T tLr = null;
        T tLr2 = null;
        PointF pointFLr2 = null;
        PointF pointFLr3 = null;
        float fNextDouble = 0.0f;
        boolean z = false;
        PointF pointFLr4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tLr = ktVar.lr(jsonReader, f);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "i":
                    pointFLr4 = tan.lr(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFLr = tan.lr(jsonReader, 1.0f);
                    break;
                case "s":
                    tLr2 = ktVar.lr(jsonReader, f);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFLr3 = tan.lr(jsonReader, f);
                    break;
                case "to":
                    pointFLr2 = tan.lr(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z) {
            if (pointFLr != null && pointFLr4 != null) {
                interpolatorRi = ri(pointFLr, pointFLr4);
            }
            com.bytedance.adsdk.lr.xha.ri<T> riVar = new com.bytedance.adsdk.lr.xha.ri<>(xhaVar, tLr2, tLr, interpolatorRi, fNextDouble, null);
            riVar.mj = pointFLr2;
            riVar.jbs = pointFLr3;
            return riVar;
        }
        tLr = tLr2;
        interpolatorRi = ri;
        com.bytedance.adsdk.lr.xha.ri<T> riVar2 = new com.bytedance.adsdk.lr.xha.ri<>(xhaVar, tLr2, tLr, interpolatorRi, fNextDouble, null);
        riVar2.mj = pointFLr2;
        riVar2.jbs = pointFLr3;
        return riVar2;
    }

    private static Interpolator ri(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.lr.di.fi.lr(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.lr.di.fi.lr(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.lr.di.fi.lr(pointF2.x, -1.0f, 1.0f);
        float fLr = com.bytedance.adsdk.lr.di.fi.lr(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fLr;
        int iRi = com.bytedance.adsdk.lr.di.di.ri(pointF.x, pointF.y, pointF2.x, fLr);
        WeakReference<Interpolator> weakReferenceRi = com.bytedance.adsdk.lr.fi.ri() ? null : ri(iRi);
        Interpolator interpolator = weakReferenceRi != null ? weakReferenceRi.get() : null;
        if (weakReferenceRi != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.lr.bu.ri(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.lr.bu.ri(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.lr.fi.ri()) {
            try {
                ri(iRi, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.lr.xha.ri<T> ri(JsonReader jsonReader, float f, kt<T> ktVar) throws IOException {
        return new com.bytedance.adsdk.lr.xha.ri<>(ktVar.lr(jsonReader, f));
    }
}
