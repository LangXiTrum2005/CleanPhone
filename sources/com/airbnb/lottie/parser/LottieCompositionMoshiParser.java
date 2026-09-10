package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.smartdigimkt.d2.a;
import com.smartdigimkt.m3.h;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class LottieCompositionMoshiParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f9915a = JsonReader.Options.a("w", h.f36614b, "ip", "op", a.W, "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.Options f9916b = JsonReader.Options.a("id", "layers", "w", h.f36614b, "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonReader.Options f9917c = JsonReader.Options.a("list");
    public static final JsonReader.Options d = JsonReader.Options.a("cm", "tm", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE);

    public static LottieComposition a(JsonReader jsonReader) {
        float f;
        ArrayList arrayList;
        float f2;
        int i2;
        float f3;
        int i3;
        float fC = Utils.c();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        LottieComposition lottieComposition = new LottieComposition();
        jsonReader.h();
        float fQ = 0.0f;
        int iR = 0;
        int iR2 = 0;
        float fQ2 = 0.0f;
        float fQ3 = 0.0f;
        while (jsonReader.m()) {
            switch (jsonReader.J(f9915a)) {
                case 0:
                    iR = jsonReader.r();
                    break;
                case 1:
                    iR2 = jsonReader.r();
                    break;
                case 2:
                    fQ2 = (float) jsonReader.q();
                    fC = fC;
                    break;
                case 3:
                    fQ = ((float) jsonReader.q()) - 0.01f;
                    fC = fC;
                    break;
                case 4:
                    fQ3 = (float) jsonReader.q();
                    fC = fC;
                    break;
                case 5:
                    f = fC;
                    map3 = map3;
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    f2 = fQ;
                    i2 = iR2;
                    f3 = fQ2;
                    String[] strArrSplit = jsonReader.t().split("\\.");
                    int i4 = Integer.parseInt(strArrSplit[0]);
                    int i5 = Integer.parseInt(strArrSplit[1]);
                    int i6 = Integer.parseInt(strArrSplit[2]);
                    if (i4 < 4 || (i4 <= 4 && (i5 < 4 || (i5 <= 4 && i6 < 0)))) {
                        lottieComposition.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    iR2 = i2;
                    fQ = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    sparseArrayCompat = sparseArrayCompat;
                    fQ2 = f3;
                    break;
                case 6:
                    f = fC;
                    map3 = map3;
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    f2 = fQ;
                    i2 = iR2;
                    f3 = fQ2;
                    jsonReader.d();
                    int i7 = 0;
                    while (jsonReader.m()) {
                        Layer layerA = LayerParser.a(jsonReader, lottieComposition);
                        if (layerA.f9843e == Layer.LayerType.f9851Y) {
                            i7++;
                        }
                        arrayList2.add(layerA);
                        longSparseArray.h(layerA.d, layerA);
                        if (i7 > 4) {
                            Logger.b("You have " + i7 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    jsonReader.k();
                    iR2 = i2;
                    fQ = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    sparseArrayCompat = sparseArrayCompat;
                    fQ2 = f3;
                    break;
                case 7:
                    f = fC;
                    arrayList = arrayList3;
                    f2 = fQ;
                    jsonReader.d();
                    while (jsonReader.m()) {
                        ArrayList arrayList4 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray();
                        jsonReader.h();
                        HashMap map4 = map3;
                        String strT = null;
                        String strT2 = null;
                        int iR3 = 0;
                        int iR4 = 0;
                        while (jsonReader.m()) {
                            sparseArrayCompat = sparseArrayCompat;
                            int iJ = jsonReader.J(f9916b);
                            if (iJ != 0) {
                                float f4 = fQ2;
                                if (iJ != 1) {
                                    if (iJ == 2) {
                                        iR3 = jsonReader.r();
                                    } else if (iJ == 3) {
                                        iR4 = jsonReader.r();
                                    } else if (iJ == 4) {
                                        strT2 = jsonReader.t();
                                    } else if (iJ != 5) {
                                        jsonReader.K();
                                        jsonReader.P();
                                        i3 = iR2;
                                    } else {
                                        jsonReader.t();
                                    }
                                    fQ2 = f4;
                                } else {
                                    jsonReader.d();
                                    while (jsonReader.m()) {
                                        Layer layerA2 = LayerParser.a(jsonReader, lottieComposition);
                                        longSparseArray2.h(layerA2.d, layerA2);
                                        arrayList4.add(layerA2);
                                        iR2 = iR2;
                                    }
                                    i3 = iR2;
                                    jsonReader.k();
                                }
                                iR2 = i3;
                                fQ2 = f4;
                            } else {
                                strT = jsonReader.t();
                            }
                        }
                        SparseArrayCompat sparseArrayCompat2 = sparseArrayCompat;
                        int i8 = iR2;
                        float f5 = fQ2;
                        jsonReader.l();
                        if (strT2 != null) {
                            map2.put(strT, new LottieImageAsset(iR3, iR4, strT, strT2));
                        } else {
                            map.put(strT, arrayList4);
                        }
                        iR2 = i8;
                        map3 = map4;
                        sparseArrayCompat = sparseArrayCompat2;
                        fQ2 = f5;
                    }
                    map3 = map3;
                    sparseArrayCompat = sparseArrayCompat;
                    i2 = iR2;
                    f3 = fQ2;
                    jsonReader.k();
                    iR2 = i2;
                    fQ = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    sparseArrayCompat = sparseArrayCompat;
                    fQ2 = f3;
                    break;
                case 8:
                    f = fC;
                    f2 = fQ;
                    jsonReader.h();
                    while (jsonReader.m()) {
                        if (jsonReader.J(f9917c) != 0) {
                            jsonReader.K();
                            jsonReader.P();
                        } else {
                            jsonReader.d();
                            while (jsonReader.m()) {
                                JsonReader.Options options = FontParser.f9897a;
                                jsonReader.h();
                                String strT3 = null;
                                String strT4 = null;
                                String strT5 = null;
                                while (jsonReader.m()) {
                                    int iJ2 = jsonReader.J(FontParser.f9897a);
                                    if (iJ2 != 0) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (iJ2 == 1) {
                                            strT4 = jsonReader.t();
                                        } else if (iJ2 == 2) {
                                            strT5 = jsonReader.t();
                                        } else if (iJ2 != 3) {
                                            jsonReader.K();
                                            jsonReader.P();
                                        } else {
                                            jsonReader.q();
                                        }
                                        arrayList3 = arrayList5;
                                    } else {
                                        strT3 = jsonReader.t();
                                    }
                                }
                                jsonReader.l();
                                map3.put(strT4, new Font(strT3, strT4, strT5));
                                arrayList3 = arrayList3;
                            }
                            jsonReader.k();
                        }
                    }
                    arrayList = arrayList3;
                    jsonReader.l();
                    i2 = iR2;
                    f3 = fQ2;
                    iR2 = i2;
                    fQ = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    sparseArrayCompat = sparseArrayCompat;
                    fQ2 = f3;
                    break;
                case 9:
                    f = fC;
                    f2 = fQ;
                    jsonReader.d();
                    while (jsonReader.m()) {
                        JsonReader.Options options2 = FontCharacterParser.f9895a;
                        ArrayList arrayList6 = new ArrayList();
                        jsonReader.h();
                        double dQ = 0.0d;
                        String strT6 = null;
                        String strT7 = null;
                        char cCharAt = 0;
                        while (jsonReader.m()) {
                            int iJ3 = jsonReader.J(FontCharacterParser.f9895a);
                            if (iJ3 == 0) {
                                cCharAt = jsonReader.t().charAt(0);
                            } else if (iJ3 == 1) {
                                jsonReader.q();
                            } else if (iJ3 == 2) {
                                dQ = jsonReader.q();
                            } else if (iJ3 == 3) {
                                strT6 = jsonReader.t();
                            } else if (iJ3 == 4) {
                                strT7 = jsonReader.t();
                            } else if (iJ3 != 5) {
                                jsonReader.K();
                                jsonReader.P();
                            } else {
                                jsonReader.h();
                                while (jsonReader.m()) {
                                    if (jsonReader.J(FontCharacterParser.f9896b) != 0) {
                                        jsonReader.K();
                                        jsonReader.P();
                                    } else {
                                        jsonReader.d();
                                        while (jsonReader.m()) {
                                            arrayList6.add((ShapeGroup) ContentModelParser.a(jsonReader, lottieComposition));
                                        }
                                        jsonReader.k();
                                    }
                                }
                                jsonReader.l();
                            }
                        }
                        jsonReader.l();
                        FontCharacter fontCharacter = new FontCharacter(arrayList6, cCharAt, dQ, strT6, strT7);
                        sparseArrayCompat.e(fontCharacter.hashCode(), fontCharacter);
                    }
                    jsonReader.k();
                    arrayList = arrayList3;
                    i2 = iR2;
                    f3 = fQ2;
                    iR2 = i2;
                    fQ = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    sparseArrayCompat = sparseArrayCompat;
                    fQ2 = f3;
                    break;
                case 10:
                    jsonReader.d();
                    while (jsonReader.m()) {
                        jsonReader.h();
                        String strT8 = null;
                        float fQ4 = 0.0f;
                        float fQ5 = 0.0f;
                        while (jsonReader.m()) {
                            int iJ4 = jsonReader.J(d);
                            if (iJ4 != 0) {
                                float f6 = fC;
                                if (iJ4 == 1) {
                                    fQ4 = (float) jsonReader.q();
                                } else if (iJ4 != 2) {
                                    jsonReader.K();
                                    jsonReader.P();
                                } else {
                                    fQ5 = (float) jsonReader.q();
                                }
                                fC = f6;
                            } else {
                                strT8 = jsonReader.t();
                            }
                        }
                        float f7 = fC;
                        jsonReader.l();
                        arrayList3.add(new Marker(strT8, fQ4, fQ5));
                        fQ = fQ;
                        fC = f7;
                    }
                    f = fC;
                    f2 = fQ;
                    jsonReader.k();
                    arrayList = arrayList3;
                    i2 = iR2;
                    f3 = fQ2;
                    iR2 = i2;
                    fQ = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    sparseArrayCompat = sparseArrayCompat;
                    fQ2 = f3;
                    break;
                default:
                    jsonReader.K();
                    jsonReader.P();
                    f = fC;
                    map3 = map3;
                    arrayList = arrayList3;
                    f2 = fQ;
                    i2 = iR2;
                    f3 = fQ2;
                    iR2 = i2;
                    fQ = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    sparseArrayCompat = sparseArrayCompat;
                    fQ2 = f3;
                    break;
            }
        }
        float f8 = fC;
        lottieComposition.j = new Rect(0, 0, (int) (iR * f8), (int) (iR2 * f8));
        lottieComposition.k = fQ2;
        lottieComposition.f9520l = fQ;
        lottieComposition.m = fQ3;
        lottieComposition.f9519i = arrayList2;
        lottieComposition.f9518h = longSparseArray;
        lottieComposition.f9516c = map;
        lottieComposition.d = map2;
        lottieComposition.g = sparseArrayCompat;
        lottieComposition.f9517e = map3;
        lottieComposition.f = arrayList3;
        return lottieComposition;
    }
}
