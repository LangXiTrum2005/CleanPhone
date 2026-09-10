package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class jc {
    public static com.bytedance.adsdk.lr.ik.lr.tan ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.lr.tan.ri riVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi2 = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    lrVarRi2 = ka.ri(jsonReader, xhaVar, false);
                    break;
                case "m":
                    riVarRi = com.bytedance.adsdk.lr.ik.lr.tan.ri.ri(jsonReader.nextInt());
                    break;
                case "o":
                    lrVarRi3 = ka.ri(jsonReader, xhaVar, false);
                    break;
                case "s":
                    lrVarRi = ka.ri(jsonReader, xhaVar, false);
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
        return new com.bytedance.adsdk.lr.ik.lr.tan(strNextString, riVarRi, lrVarRi, lrVarRi2, lrVarRi3, zNextBoolean);
    }
}
