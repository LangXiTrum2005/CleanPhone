package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class hcw {
    public static com.bytedance.adsdk.lr.ik.lr.co ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi2 = null;
        com.bytedance.adsdk.lr.ik.ri.co coVarRi = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    lrVarRi = ka.ri(jsonReader, xhaVar, false);
                    break;
                case "o":
                    lrVarRi2 = ka.ri(jsonReader, xhaVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    coVarRi = ik.ri(jsonReader, xhaVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lr.ik.lr.co(strNextString, lrVarRi, lrVarRi2, coVarRi, zNextBoolean);
    }
}
