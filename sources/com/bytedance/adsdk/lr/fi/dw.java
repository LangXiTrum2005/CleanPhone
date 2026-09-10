package com.bytedance.adsdk.lr.fi;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class dw {
    public static com.bytedance.adsdk.lr.ik.lr.qt ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar, int i) throws IOException {
        boolean zNextBoolean = false;
        boolean z = i == 3;
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.lr.qt.ri riVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> awVarLr = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi2 = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi3 = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi4 = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi5 = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi6 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "p":
                    awVarLr = ri.lr(jsonReader, xhaVar);
                    break;
                case "r":
                    lrVarRi2 = ka.ri(jsonReader, xhaVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    lrVarRi3 = ka.ri(jsonReader, xhaVar);
                    break;
                case "is":
                    lrVarRi5 = ka.ri(jsonReader, xhaVar, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    lrVarRi4 = ka.ri(jsonReader, xhaVar);
                    break;
                case "os":
                    lrVarRi6 = ka.ri(jsonReader, xhaVar, false);
                    break;
                case "pt":
                    lrVarRi = ka.ri(jsonReader, xhaVar, false);
                    break;
                case "sy":
                    riVarRi = com.bytedance.adsdk.lr.ik.lr.qt.ri.ri(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lr.ik.lr.qt(strNextString, riVarRi, lrVarRi, awVarLr, lrVarRi2, lrVarRi3, lrVarRi4, lrVarRi5, lrVarRi6, zNextBoolean, z);
    }
}
