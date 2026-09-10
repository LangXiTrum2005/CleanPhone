package com.bytedance.adsdk.ud.mzz;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean lnr(com.bytedance.adsdk.ud.lnr.qdl.ud udVar) {
        if (udVar != null) {
            return udVar.ud() && ((Float) ((com.bytedance.adsdk.ud.wd.qdl) udVar.lnr().get(0)).qdl).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    public static com.bytedance.adsdk.ud.lnr.qdl.fs qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl;
        com.bytedance.adsdk.ud.wd wdVar2 = wdVar;
        boolean z2 = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z2) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.ud.lnr.qdl.ud udVar = null;
        com.bytedance.adsdk.ud.lnr.qdl.mzz mzzVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> exuVarUd = null;
        com.bytedance.adsdk.ud.lnr.qdl.wd wdVarMml = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl2 = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl3 = null;
        com.bytedance.adsdk.ud.lnr.qdl.mml mmlVarUd = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl4 = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl5 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("k")) {
                            mzzVarQdl = qdl.qdl(jsonReader, wdVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    wdVar2 = wdVar;
                    break;
                case "o":
                    mmlVarUd = mml.ud(jsonReader, wdVar);
                    wdVar2 = wdVar;
                    break;
                case "p":
                    exuVarUd = qdl.ud(jsonReader, wdVar);
                    wdVar2 = wdVar;
                    break;
                case "r":
                    udVarQdl = mml.qdl(jsonReader, wdVar2, false);
                    if (udVarQdl.lnr().isEmpty()) {
                        if (((com.bytedance.adsdk.ud.wd.qdl) udVarQdl.lnr().get(0)).qdl == 0) {
                            udVar = udVarQdl;
                            wdVar2 = wdVar;
                        } else {
                            udVarQdl.lnr().set(0, new com.bytedance.adsdk.ud.wd.qdl(wdVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(wdVar.wd())));
                        }
                        break;
                    } else {
                        udVarQdl.lnr().add(new com.bytedance.adsdk.ud.wd.qdl(wdVar2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(wdVar2.wd())));
                    }
                    wdVar2 = wdVar;
                    udVar = udVarQdl;
                    break;
                case "s":
                    wdVarMml = mml.mml(jsonReader, wdVar);
                    break;
                case "eo":
                    udVarQdl5 = mml.qdl(jsonReader, wdVar2, false);
                    break;
                case "rz":
                    wdVar2.qdl("Lottie doesn't support 3D layers.");
                    udVarQdl = mml.qdl(jsonReader, wdVar2, false);
                    if (udVarQdl.lnr().isEmpty()) {
                        if (((com.bytedance.adsdk.ud.wd.qdl) udVarQdl.lnr().get(0)).qdl == 0) {
                            udVar = udVarQdl;
                            wdVar2 = wdVar;
                        } else {
                            udVarQdl.lnr().set(0, new com.bytedance.adsdk.ud.wd.qdl(wdVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(wdVar.wd())));
                        }
                        break;
                    } else {
                        udVarQdl.lnr().add(new com.bytedance.adsdk.ud.wd.qdl(wdVar2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(wdVar2.wd())));
                    }
                    wdVar2 = wdVar;
                    udVar = udVarQdl;
                    break;
                case "sa":
                    udVarQdl3 = mml.qdl(jsonReader, wdVar2, false);
                    break;
                case "sk":
                    udVarQdl2 = mml.qdl(jsonReader, wdVar2, false);
                    break;
                case "so":
                    udVarQdl4 = mml.qdl(jsonReader, wdVar2, false);
                    break;
                default:
                    jsonReader.skipValue();
                    wdVar2 = wdVar;
                    break;
            }
        }
        if (z2) {
            jsonReader.endObject();
        }
        return new com.bytedance.adsdk.ud.lnr.qdl.fs(qdl(mzzVarQdl) ? null : mzzVarQdl, qdl(exuVarUd) ? null : exuVarUd, qdl(wdVarMml) ? null : wdVarMml, qdl(udVar) ? null : udVar, mmlVarUd, udVarQdl4, udVarQdl5, ud(udVarQdl2) ? null : udVarQdl2, lnr(udVarQdl3) ? null : udVarQdl3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean ud(com.bytedance.adsdk.ud.lnr.qdl.ud udVar) {
        if (udVar != null) {
            return udVar.ud() && ((Float) ((com.bytedance.adsdk.ud.wd.qdl) udVar.lnr().get(0)).qdl).floatValue() == 0.0f;
        }
        return true;
    }

    private static boolean qdl(com.bytedance.adsdk.ud.lnr.qdl.mzz mzzVar) {
        if (mzzVar != null) {
            return mzzVar.ud() && mzzVar.lnr().get(0).qdl.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean qdl(com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> exuVar) {
        if (exuVar != null) {
            return !(exuVar instanceof com.bytedance.adsdk.ud.lnr.qdl.tvp) && exuVar.ud() && exuVar.lnr().get(0).qdl.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean qdl(com.bytedance.adsdk.ud.lnr.qdl.ud udVar) {
        if (udVar != null) {
            return udVar.ud() && ((Float) ((com.bytedance.adsdk.ud.wd.qdl) udVar.lnr().get(0)).qdl).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean qdl(com.bytedance.adsdk.ud.lnr.qdl.wd wdVar) {
        if (wdVar != null) {
            return wdVar.ud() && ((com.bytedance.adsdk.ud.wd.lnr) ((com.bytedance.adsdk.ud.wd.qdl) wdVar.lnr().get(0)).qdl).ud(1.0f, 1.0f);
        }
        return true;
    }
}
