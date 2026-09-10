package com.bytedance.adsdk.ud.mzz;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class aaj {
    private static final Interpolator qdl = new LinearInterpolator();
    private static SparseArray<WeakReference<Interpolator>> ud;

    private static SparseArray<WeakReference<Interpolator>> qdl() {
        if (ud == null) {
            ud = new SparseArray<>();
        }
        return ud;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02bb  */
    private static <T> com.bytedance.adsdk.ud.wd.qdl<T> ud(com.bytedance.adsdk.ud.wd wdVar, JsonReader jsonReader, float f, wc<T> wcVar) throws IOException {
        Interpolator interpolatorQdl;
        Interpolator interpolatorQdl2;
        T t;
        Interpolator interpolator;
        Interpolator interpolatorQdl3;
        com.bytedance.adsdk.ud.wd.qdl<T> qdlVar;
        boolean z2;
        String str;
        String str2;
        T t2;
        String str3;
        String str4;
        String str5 = "y";
        String str6 = "x";
        jsonReader.beginObject();
        PointF pointF = null;
        PointF pointFUd = null;
        PointF pointFUd2 = null;
        boolean z3 = false;
        PointF pointFUd3 = null;
        PointF pointFUd4 = null;
        PointF pointF2 = null;
        T tUd = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        float fNextDouble = 0.0f;
        T tUd2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b2 = -1;
            switch (strNextName.hashCode()) {
                case 101:
                    z2 = z3;
                    if (strNextName.equals("e")) {
                        b2 = 0;
                    }
                    break;
                case 104:
                    z2 = z3;
                    if (strNextName.equals(h.f36614b)) {
                        b2 = 1;
                    }
                    break;
                case 105:
                    z2 = z3;
                    if (strNextName.equals(i.f37957c)) {
                        b2 = 2;
                    }
                    break;
                case 111:
                    z2 = z3;
                    if (strNextName.equals("o")) {
                        b2 = 3;
                    }
                    break;
                case 115:
                    z2 = z3;
                    if (strNextName.equals("s")) {
                        b2 = 4;
                    }
                    break;
                case 116:
                    z2 = z3;
                    if (strNextName.equals("t")) {
                        b2 = 5;
                    }
                    break;
                case 3701:
                    z2 = z3;
                    if (strNextName.equals("ti")) {
                        b2 = 6;
                    }
                    break;
                case 3707:
                    z2 = z3;
                    if (strNextName.equals("to")) {
                        b2 = 7;
                    }
                    break;
                default:
                    z2 = z3;
                    break;
            }
            switch (b2) {
                case 0:
                    str = str6;
                    tUd2 = wcVar.ud(jsonReader, f);
                    tUd = tUd;
                    str5 = str5;
                    z3 = z2;
                    str6 = str;
                    break;
                case 1:
                    T t3 = tUd;
                    String str7 = str5;
                    str = str6;
                    PointF pointF5 = pointFUd2;
                    z3 = jsonReader.nextInt() == 1;
                    tUd = t3;
                    str5 = str7;
                    pointFUd2 = pointF5;
                    pointFUd = pointFUd;
                    str6 = str;
                    break;
                case 2:
                    PointF pointF6 = pointFUd2;
                    T t4 = tUd;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals(str6)) {
                                str3 = str5;
                                str4 = str6;
                                JsonToken jsonTokenPeek = jsonReader.peek();
                                JsonToken jsonToken = JsonToken.NUMBER;
                                if (jsonTokenPeek == jsonToken) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    T t5 = t4;
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == jsonToken ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                    t4 = t5;
                                }
                            } else if (strNextName2.equals(str5)) {
                                JsonToken jsonTokenPeek2 = jsonReader.peek();
                                JsonToken jsonToken2 = JsonToken.NUMBER;
                                if (jsonTokenPeek2 == jsonToken2) {
                                    str3 = str5;
                                    str4 = str6;
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    str3 = str5;
                                    str4 = str6;
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == jsonToken2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            str5 = str3;
                            str6 = str4;
                        }
                        str2 = str5;
                        str = str6;
                        t2 = t4;
                        pointF4 = new PointF(fNextDouble2, fNextDouble3);
                        pointF = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                    } else {
                        str2 = str5;
                        str = str6;
                        t2 = t4;
                        pointFUd4 = exc.ud(jsonReader, f);
                    }
                    String str8 = str2;
                    tUd = t2;
                    str5 = str8;
                    pointFUd2 = pointF6;
                    z3 = z2;
                    pointFUd = pointFUd;
                    str6 = str;
                    break;
                case 3:
                    PointF pointF7 = pointFUd2;
                    if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                        pointFUd3 = exc.ud(jsonReader, f);
                        pointFUd2 = pointF7;
                        z3 = z2;
                    } else {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float f2 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        while (jsonReader.hasNext()) {
                            pointF7 = pointF7;
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals(str6)) {
                                T t6 = tUd;
                                JsonToken jsonTokenPeek3 = jsonReader.peek();
                                JsonToken jsonToken3 = JsonToken.NUMBER;
                                if (jsonTokenPeek3 == jsonToken3) {
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    tUd = t6;
                                    fNextDouble6 = fNextDouble7;
                                } else {
                                    jsonReader.beginArray();
                                    PointF pointF8 = pointFUd;
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = jsonReader.peek() == jsonToken3 ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                    tUd = t6;
                                    pointFUd = pointF8;
                                }
                            } else if (strNextName3.equals(str5)) {
                                JsonToken jsonTokenPeek4 = jsonReader.peek();
                                JsonToken jsonToken4 = JsonToken.NUMBER;
                                if (jsonTokenPeek4 == jsonToken4) {
                                    fNextDouble8 = (float) jsonReader.nextDouble();
                                    tUd = tUd;
                                    f2 = fNextDouble8;
                                } else {
                                    T t7 = tUd;
                                    jsonReader.beginArray();
                                    float fNextDouble9 = (float) jsonReader.nextDouble();
                                    if (jsonReader.peek() == jsonToken4) {
                                        f2 = fNextDouble9;
                                        fNextDouble8 = (float) jsonReader.nextDouble();
                                    } else {
                                        f2 = fNextDouble9;
                                        fNextDouble8 = f2;
                                    }
                                    jsonReader.endArray();
                                    tUd = t7;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        PointF pointF9 = pointFUd;
                        PointF pointF10 = new PointF(fNextDouble6, f2);
                        PointF pointF11 = new PointF(fNextDouble7, fNextDouble8);
                        jsonReader.endObject();
                        pointF2 = pointF10;
                        pointF3 = pointF11;
                        pointFUd2 = pointF7;
                        z3 = z2;
                        pointFUd = pointF9;
                    }
                    break;
                case 4:
                    tUd = wcVar.ud(jsonReader, f);
                    z3 = z2;
                    break;
                case 5:
                    fNextDouble = (float) jsonReader.nextDouble();
                    z3 = z2;
                    pointFUd2 = pointFUd2;
                    break;
                case 6:
                    pointFUd2 = exc.ud(jsonReader, f);
                    z3 = z2;
                    break;
                case 7:
                    pointFUd = exc.ud(jsonReader, f);
                    z3 = z2;
                    break;
                default:
                    jsonReader.skipValue();
                    z3 = z2;
                    break;
            }
        }
        PointF pointF12 = pointFUd;
        PointF pointF13 = pointFUd2;
        boolean z4 = z3;
        T t8 = tUd;
        jsonReader.endObject();
        if (!z4) {
            if (pointFUd3 != null && pointFUd4 != null) {
                interpolatorQdl3 = qdl(pointFUd3, pointFUd4);
                interpolator = interpolatorQdl3;
                t = tUd2;
                interpolatorQdl = null;
                interpolatorQdl2 = null;
            } else if (pointF2 != null && pointF3 != null && pointF4 != null && pointF != null) {
                interpolatorQdl = qdl(pointF2, pointF4);
                interpolatorQdl2 = qdl(pointF3, pointF);
                t = tUd2;
                interpolator = null;
            }
            if (interpolatorQdl != null || interpolatorQdl2 == null) {
                qdlVar = new com.bytedance.adsdk.ud.wd.qdl<>(wdVar, t8, t, interpolator, fNextDouble, null);
            } else {
                qdlVar = new com.bytedance.adsdk.ud.wd.qdl<>(wdVar, t8, t, interpolatorQdl, interpolatorQdl2, fNextDouble, null);
            }
            qdlVar.jpc = pointF12;
            qdlVar.tvp = pointF13;
            return qdlVar;
        }
        tUd2 = t8;
        interpolatorQdl3 = qdl;
        interpolator = interpolatorQdl3;
        t = tUd2;
        interpolatorQdl = null;
        interpolatorQdl2 = null;
        if (interpolatorQdl != null) {
            qdlVar = new com.bytedance.adsdk.ud.wd.qdl<>(wdVar, t8, t, interpolator, fNextDouble, null);
        } else {
            qdlVar = new com.bytedance.adsdk.ud.wd.qdl<>(wdVar, t8, t, interpolator, fNextDouble, null);
        }
        qdlVar.jpc = pointF12;
        qdlVar.tvp = pointF13;
        return qdlVar;
    }

    private static WeakReference<Interpolator> qdl(int i2) {
        WeakReference<Interpolator> weakReference;
        synchronized (aaj.class) {
            weakReference = qdl().get(i2);
        }
        return weakReference;
    }

    private static void qdl(int i2, WeakReference<Interpolator> weakReference) {
        synchronized (aaj.class) {
            ud.put(i2, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.ud.wd.qdl<T> qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, float f, wc<T> wcVar, boolean z2, boolean z3) throws IOException {
        if (z2 && z3) {
            return ud(wdVar, jsonReader, f, wcVar);
        }
        if (z2) {
            return qdl(wdVar, jsonReader, f, wcVar);
        }
        return qdl(jsonReader, f, wcVar);
    }

    private static <T> com.bytedance.adsdk.ud.wd.qdl<T> qdl(com.bytedance.adsdk.ud.wd wdVar, JsonReader jsonReader, float f, wc<T> wcVar) throws IOException {
        Interpolator interpolatorQdl;
        jsonReader.beginObject();
        PointF pointFUd = null;
        T tUd = null;
        T tUd2 = null;
        PointF pointFUd2 = null;
        PointF pointFUd3 = null;
        float fNextDouble = 0.0f;
        boolean z2 = false;
        PointF pointFUd4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tUd = wcVar.ud(jsonReader, f);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                    break;
                case "i":
                    pointFUd4 = exc.ud(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFUd = exc.ud(jsonReader, 1.0f);
                    break;
                case "s":
                    tUd2 = wcVar.ud(jsonReader, f);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFUd3 = exc.ud(jsonReader, f);
                    break;
                case "to":
                    pointFUd2 = exc.ud(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z2) {
            if (pointFUd != null && pointFUd4 != null) {
                interpolatorQdl = qdl(pointFUd, pointFUd4);
            }
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar = new com.bytedance.adsdk.ud.wd.qdl<>(wdVar, tUd2, tUd, interpolatorQdl, fNextDouble, null);
            qdlVar.jpc = pointFUd2;
            qdlVar.tvp = pointFUd3;
            return qdlVar;
        }
        tUd = tUd2;
        interpolatorQdl = qdl;
        com.bytedance.adsdk.ud.wd.qdl<T> qdlVar2 = new com.bytedance.adsdk.ud.wd.qdl<>(wdVar, tUd2, tUd, interpolatorQdl, fNextDouble, null);
        qdlVar2.jpc = pointFUd2;
        qdlVar2.tvp = pointFUd3;
        return qdlVar2;
    }

    private static Interpolator qdl(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.ud.mo.mzz.ud(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.ud.mo.mzz.ud(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.ud.mo.mzz.ud(pointF2.x, -1.0f, 1.0f);
        float fUd = com.bytedance.adsdk.ud.mo.mzz.ud(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fUd;
        int iQdl = com.bytedance.adsdk.ud.mo.mo.qdl(pointF.x, pointF.y, pointF2.x, fUd);
        WeakReference<Interpolator> weakReferenceQdl = com.bytedance.adsdk.ud.mzz.qdl() ? null : qdl(iQdl);
        Interpolator interpolator = weakReferenceQdl != null ? weakReferenceQdl.get() : null;
        if (weakReferenceQdl != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.ud.yt.qdl(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e2) {
            if ("The Path cannot loop back on itself.".equals(e2.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.ud.yt.qdl(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.ud.mzz.qdl()) {
            try {
                qdl(iQdl, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.ud.wd.qdl<T> qdl(JsonReader jsonReader, float f, wc<T> wcVar) throws IOException {
        return new com.bytedance.adsdk.ud.wd.qdl<>(wcVar.ud(jsonReader, f));
    }
}
