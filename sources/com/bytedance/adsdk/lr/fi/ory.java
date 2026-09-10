package com.bytedance.adsdk.lr.fi;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class ory {
    public static com.bytedance.adsdk.lr.ik.lr.sf ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> awVarLr = null;
        com.bytedance.adsdk.lr.ik.ri.di diVarIk = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "p":
                    awVarLr = ri.lr(jsonReader, xhaVar);
                    break;
                case "r":
                    lrVarRi = ka.ri(jsonReader, xhaVar);
                    break;
                case "s":
                    diVarIk = ka.ik(jsonReader, xhaVar);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lr.ik.lr.sf(strNextString, awVarLr, diVarIk, lrVarRi, zNextBoolean);
    }
}
