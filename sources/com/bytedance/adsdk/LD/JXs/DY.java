package com.bytedance.adsdk.LD.JXs;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class DY {
    private static SparseArray<WeakReference<Interpolator>> LD;
    private static final Interpolator Lxb = new LinearInterpolator();

    /* JADX WARN: Code duplicated, block: B:128:0x0291  */
    private static <T> com.bytedance.adsdk.LD.ebl.Lxb<T> LD(com.bytedance.adsdk.LD.ebl eblVar, JsonReader jsonReader, float f, NDz<T> nDz) throws IOException {
        Interpolator interpolatorLxb;
        Interpolator interpolatorLxb2;
        T t;
        Interpolator interpolatorLxb3;
        com.bytedance.adsdk.LD.ebl.Lxb<T> lxb;
        PointF pointF;
        T t2;
        PointF pointF2;
        float f2;
        PointF pointF3;
        T t3;
        jsonReader.beginObject();
        PointF pointFLD = null;
        boolean z = false;
        PointF pointFLD2 = null;
        PointF pointFLD3 = null;
        PointF pointF4 = null;
        T tLD = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        float fNextDouble = 0.0f;
        PointF pointFLD4 = null;
        T tLD2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tLD2 = nDz.LD(jsonReader, f);
                    continue;
                    break;
                case "h":
                    pointF = pointFLD;
                    t2 = tLD;
                    pointF2 = pointF7;
                    f2 = fNextDouble;
                    pointF3 = pointFLD4;
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "i":
                    pointF = pointFLD;
                    t2 = tLD;
                    pointF2 = pointF7;
                    f2 = fNextDouble;
                    pointF3 = pointFLD4;
                    if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                        pointFLD3 = tD.LD(jsonReader, f);
                        break;
                    } else {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
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
                        PointF pointF8 = new PointF(fNextDouble2, fNextDouble3);
                        PointF pointF9 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF7 = pointF9;
                        pointF6 = pointF8;
                        pointFLD4 = pointF3;
                        pointFLD = pointF;
                        fNextDouble = f2;
                        tLD = t2;
                    }
                    break;
                case "o":
                    PointF pointF10 = pointFLD4;
                    PointF pointF11 = pointFLD;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        while (jsonReader.hasNext()) {
                            fNextDouble = fNextDouble;
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals("x")) {
                                t3 = tLD;
                                JsonToken jsonTokenPeek3 = jsonReader.peek();
                                JsonToken jsonToken3 = JsonToken.NUMBER;
                                if (jsonTokenPeek3 == jsonToken3) {
                                    fNextDouble8 = (float) jsonReader.nextDouble();
                                    fNextDouble6 = fNextDouble8;
                                    tLD = t3;
                                } else {
                                    jsonReader.beginArray();
                                    PointF pointF12 = pointF7;
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = jsonReader.peek() == jsonToken3 ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                    tLD = t3;
                                    pointF7 = pointF12;
                                }
                            } else if (strNextName3.equals("y")) {
                                JsonToken jsonTokenPeek4 = jsonReader.peek();
                                JsonToken jsonToken4 = JsonToken.NUMBER;
                                if (jsonTokenPeek4 == jsonToken4) {
                                    fNextDouble9 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    jsonReader.beginArray();
                                    t3 = tLD;
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble9 = jsonReader.peek() == jsonToken4 ? (float) jsonReader.nextDouble() : fNextDouble7;
                                    jsonReader.endArray();
                                    tLD = t3;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        PointF pointF13 = new PointF(fNextDouble6, fNextDouble7);
                        PointF pointF14 = new PointF(fNextDouble8, fNextDouble9);
                        jsonReader.endObject();
                        pointF5 = pointF14;
                        pointF4 = pointF13;
                    } else {
                        pointFLD2 = tD.LD(jsonReader, f);
                    }
                    pointFLD4 = pointF10;
                    pointFLD = pointF11;
                    continue;
                    break;
                case "s":
                    tLD = nDz.LD(jsonReader, f);
                    continue;
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "ti":
                    pointFLD = tD.LD(jsonReader, f);
                    continue;
                    break;
                case "to":
                    pointFLD4 = tD.LD(jsonReader, f);
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
                    break;
            }
            pointFLD4 = pointF3;
            pointFLD = pointF;
            fNextDouble = f2;
            tLD = t2;
            pointF7 = pointF2;
        }
        PointF pointF15 = pointFLD;
        T t4 = tLD;
        PointF pointF16 = pointF7;
        float f3 = fNextDouble;
        PointF pointF17 = pointFLD4;
        jsonReader.endObject();
        if (!z) {
            if (pointFLD2 != null && pointFLD3 != null) {
                interpolatorLxb3 = Lxb(pointFLD2, pointFLD3);
                t = tLD2;
                interpolatorLxb = null;
                interpolatorLxb2 = null;
            } else if (pointF4 != null && pointF5 != null && pointF6 != null && pointF16 != null) {
                interpolatorLxb = Lxb(pointF4, pointF6);
                interpolatorLxb2 = Lxb(pointF5, pointF16);
                t = tLD2;
                interpolatorLxb3 = null;
            }
            if (interpolatorLxb != null || interpolatorLxb2 == null) {
                lxb = new com.bytedance.adsdk.LD.ebl.Lxb<>(eblVar, t4, t, interpolatorLxb3, f3, null);
            } else {
                lxb = new com.bytedance.adsdk.LD.ebl.Lxb<>(eblVar, t4, t, interpolatorLxb, interpolatorLxb2, f3, null);
            }
            lxb.OY = pointF17;
            lxb.QAg = pointF15;
            return lxb;
        }
        tLD2 = t4;
        interpolatorLxb3 = Lxb;
        t = tLD2;
        interpolatorLxb = null;
        interpolatorLxb2 = null;
        if (interpolatorLxb != null) {
            lxb = new com.bytedance.adsdk.LD.ebl.Lxb<>(eblVar, t4, t, interpolatorLxb3, f3, null);
        } else {
            lxb = new com.bytedance.adsdk.LD.ebl.Lxb<>(eblVar, t4, t, interpolatorLxb3, f3, null);
        }
        lxb.OY = pointF17;
        lxb.QAg = pointF15;
        return lxb;
    }

    private static SparseArray<WeakReference<Interpolator>> Lxb() {
        if (LD == null) {
            LD = new SparseArray<>();
        }
        return LD;
    }

    private static WeakReference<Interpolator> Lxb(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (DY.class) {
            weakReference = Lxb().get(i);
        }
        return weakReference;
    }

    private static void Lxb(int i, WeakReference<Interpolator> weakReference) {
        synchronized (DY.class) {
            LD.put(i, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.LD.ebl.Lxb<T> Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar, float f, NDz<T> nDz, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return LD(eblVar, jsonReader, f, nDz);
        }
        if (z) {
            return Lxb(eblVar, jsonReader, f, nDz);
        }
        return Lxb(jsonReader, f, nDz);
    }

    private static <T> com.bytedance.adsdk.LD.ebl.Lxb<T> Lxb(com.bytedance.adsdk.LD.ebl eblVar, JsonReader jsonReader, float f, NDz<T> nDz) throws IOException {
        Interpolator interpolatorLxb;
        jsonReader.beginObject();
        PointF pointFLD = null;
        PointF pointFLD2 = null;
        T tLD = null;
        T tLD2 = null;
        PointF pointFLD3 = null;
        PointF pointFLD4 = null;
        boolean z = false;
        float fNextDouble = 0.0f;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tLD = nDz.LD(jsonReader, f);
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
                    pointFLD2 = tD.LD(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFLD = tD.LD(jsonReader, 1.0f);
                    break;
                case "s":
                    tLD2 = nDz.LD(jsonReader, f);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFLD4 = tD.LD(jsonReader, f);
                    break;
                case "to":
                    pointFLD3 = tD.LD(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z) {
            if (pointFLD != null && pointFLD2 != null) {
                interpolatorLxb = Lxb(pointFLD, pointFLD2);
            }
            com.bytedance.adsdk.LD.ebl.Lxb<T> lxb = new com.bytedance.adsdk.LD.ebl.Lxb<>(eblVar, tLD2, tLD, interpolatorLxb, fNextDouble, null);
            lxb.OY = pointFLD3;
            lxb.QAg = pointFLD4;
            return lxb;
        }
        tLD = tLD2;
        interpolatorLxb = Lxb;
        com.bytedance.adsdk.LD.ebl.Lxb<T> lxb2 = new com.bytedance.adsdk.LD.ebl.Lxb<>(eblVar, tLD2, tLD, interpolatorLxb, fNextDouble, null);
        lxb2.OY = pointFLD3;
        lxb2.QAg = pointFLD4;
        return lxb2;
    }

    private static Interpolator Lxb(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.LD.lc.JXs.LD(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.LD.lc.JXs.LD(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.LD.lc.JXs.LD(pointF2.x, -1.0f, 1.0f);
        float fLD = com.bytedance.adsdk.LD.lc.JXs.LD(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fLD;
        int iLxb = com.bytedance.adsdk.LD.lc.lc.Lxb(pointF.x, pointF.y, pointF2.x, fLD);
        WeakReference<Interpolator> weakReferenceLxb = com.bytedance.adsdk.LD.JXs.Lxb() ? null : Lxb(iLxb);
        Interpolator interpolator = weakReferenceLxb != null ? weakReferenceLxb.get() : null;
        if (weakReferenceLxb == null || interpolator == null) {
            try {
                linearInterpolator = com.bytedance.adsdk.LD.kqm.Lxb(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = com.bytedance.adsdk.LD.kqm.Lxb(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!com.bytedance.adsdk.LD.JXs.Lxb()) {
                try {
                    Lxb(iLxb, (WeakReference<Interpolator>) new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    private static <T> com.bytedance.adsdk.LD.ebl.Lxb<T> Lxb(JsonReader jsonReader, float f, NDz<T> nDz) throws IOException {
        return new com.bytedance.adsdk.LD.ebl.Lxb<>(nDz.LD(jsonReader, f));
    }
}
