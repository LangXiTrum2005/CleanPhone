package com.bytedance.adsdk.ud.mzz;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.smartdigimkt.o1.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class oth {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.mzz.oth$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ud.lnr.lnr.mzz.ud.values().length];
            qdl = iArr;
            try {
                iArr[com.bytedance.adsdk.ud.lnr.lnr.mzz.ud.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[com.bytedance.adsdk.ud.lnr.lnr.mzz.ud.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.ud.lnr.lnr.mzz qdl(com.bytedance.adsdk.ud.wd wdVar) {
        Rect rectMml = wdVar.mml();
        List list = Collections.EMPTY_LIST;
        return new com.bytedance.adsdk.ud.lnr.lnr.mzz(list, wdVar, "__container", -1L, com.bytedance.adsdk.ud.lnr.lnr.mzz.qdl.PRE_COMP, -1L, null, list, new com.bytedance.adsdk.ud.lnr.qdl.fs(), 0, 0, 0, 0.0f, 0.0f, rectMml.width(), rectMml.height(), null, null, list, com.bytedance.adsdk.ud.lnr.lnr.mzz.ud.NONE, null, false, null, null);
    }

    public static com.bytedance.adsdk.ud.lnr.lnr.mzz qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        Float f;
        com.bytedance.adsdk.ud.lnr.lnr.mzz.ud udVar = com.bytedance.adsdk.ud.lnr.lnr.mzz.ud.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        String strNextString = "UNSET";
        String strNextString2 = null;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        com.bytedance.adsdk.ud.lnr.lnr.mzz.ud udVar2 = udVar;
        com.bytedance.adsdk.ud.lnr.qdl.rq rqVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl = null;
        com.bytedance.adsdk.ud.lnr.ud.qdl qdlVarQdl = null;
        to toVarQdl = null;
        float fNextDouble = 0.0f;
        float fWd = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        Float f2 = fValueOf;
        long jNextInt = -1;
        float fNextDouble5 = 1.0f;
        int color = 0;
        int iNextInt = 0;
        int iQdl = 0;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.ud.lnr.qdl.fs fsVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.to toVarMo = null;
        long jNextInt2 = 0;
        com.bytedance.adsdk.ud.lnr.lnr.mzz.qdl qdlVar = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parent":
                    jNextInt = jsonReader.nextInt();
                    break;
                case "shapes":
                    f = f2;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.ud.lnr.ud.lnr lnrVarQdl = jpc.qdl(jsonReader, wdVar);
                        if (lnrVarQdl != null) {
                            arrayList2.add(lnrVarQdl);
                        }
                    }
                    jsonReader.endArray();
                    f2 = f;
                    color = color;
                    break;
                case "h":
                    f = f2;
                    fNextDouble3 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.ud.mo.mo.qdl()));
                    f2 = f;
                    color = color;
                    break;
                case "t":
                    f = f2;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                rqVarQdl = ud.qdl(jsonReader, wdVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (!strNextName2.equals("d")) {
                            jsonReader.skipValue();
                        } else {
                            toVarMo = mml.mo(jsonReader, wdVar);
                        }
                    }
                    jsonReader.endObject();
                    f2 = f;
                    color = color;
                    break;
                case "w":
                    f = f2;
                    fNextDouble2 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.ud.mo.mo.qdl()));
                    f2 = f;
                    color = color;
                    break;
                case "cl":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "ef":
                    f = f2;
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (!strNextName3.equals("nm")) {
                                if (!strNextName3.equals("ty")) {
                                    jsonReader.skipValue();
                                } else {
                                    int iNextInt2 = jsonReader.nextInt();
                                    if (iNextInt2 == 29) {
                                        qdlVarQdl = mzz.qdl(jsonReader, wdVar);
                                    } else if (iNextInt2 == 25) {
                                        toVarQdl = new rq().qdl(jsonReader, wdVar);
                                    }
                                }
                            } else {
                                arrayList3.add(jsonReader.nextString());
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    wdVar.qdl("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    f2 = f;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ip":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    fsVarQdl = lnr.qdl(jsonReader, wdVar);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "op":
                    fWd = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    iQdl = (int) (com.bytedance.adsdk.ud.mo.mo.qdl() * jsonReader.nextInt());
                    break;
                case "sr":
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    f = f2;
                    iNextInt = (int) (jsonReader.nextInt() * com.bytedance.adsdk.ud.mo.mo.qdl());
                    f2 = f;
                    break;
                case "tm":
                    udVarQdl = mml.qdl(jsonReader, wdVar, false);
                    break;
                case "tt":
                    f = f2;
                    int iNextInt3 = jsonReader.nextInt();
                    if (iNextInt3 >= com.bytedance.adsdk.ud.lnr.lnr.mzz.ud.values().length) {
                        wdVar.qdl("Unsupported matte type: ".concat(String.valueOf(iNextInt3)));
                        f2 = f;
                        color = color;
                        break;
                    } else {
                        udVar2 = com.bytedance.adsdk.ud.lnr.lnr.mzz.ud.values()[iNextInt3];
                        int i2 = AnonymousClass1.qdl[udVar2.ordinal()];
                        if (i2 == 1) {
                            wdVar.qdl("Unsupported matte type: Luma");
                        } else if (i2 == 2) {
                            wdVar.qdl("Unsupported matte type: Luma Inverted");
                        }
                        wdVar.qdl(1);
                        f2 = f;
                        break;
                    }
                    break;
                case "ty":
                    f = f2;
                    int iNextInt4 = jsonReader.nextInt();
                    qdlVar = com.bytedance.adsdk.ud.lnr.lnr.mzz.qdl.UNKNOWN;
                    if (iNextInt4 < qdlVar.ordinal()) {
                        qdlVar = com.bytedance.adsdk.ud.lnr.lnr.mzz.qdl.values()[iNextInt4];
                    }
                    f2 = f;
                    break;
                case "ind":
                    f = f2;
                    jNextInt2 = jsonReader.nextInt();
                    f2 = f;
                    break;
                case "refId":
                    strNextString3 = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(bch.qdl(jsonReader, wdVar));
                    }
                    wdVar.qdl(arrayList.size());
                    jsonReader.endArray();
                    f = f2;
                    f2 = f;
                    color = color;
                    break;
                default:
                    jsonReader.skipValue();
                    f = f2;
                    f2 = f;
                    color = color;
                    break;
            }
        }
        Float f3 = f2;
        int i3 = color;
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            arrayList4.add(new com.bytedance.adsdk.ud.wd.qdl(wdVar, f3, f3, null, 0.0f, Float.valueOf(fNextDouble)));
        }
        if (fWd <= 0.0f) {
            fWd = wdVar.wd();
        }
        arrayList4.add(new com.bytedance.adsdk.ud.wd.qdl(wdVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(fWd)));
        arrayList4.add(new com.bytedance.adsdk.ud.wd.qdl(wdVar, f3, f3, null, fWd, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString.endsWith(".ai") || b.a3.equals(strNextString2)) {
            wdVar.qdl("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.ud.lnr.lnr.mzz(arrayList2, wdVar, strNextString, jNextInt2, qdlVar, jNextInt, strNextString3, arrayList, fsVarQdl, iNextInt, iQdl, i3, fNextDouble5, fNextDouble4, fNextDouble2, fNextDouble3, toVarMo, rqVarQdl, arrayList4, udVar2, udVarQdl, zNextBoolean, qdlVarQdl, toVarQdl);
    }
}
