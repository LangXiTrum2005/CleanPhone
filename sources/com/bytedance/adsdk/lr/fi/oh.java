package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class oh {
    public static com.bytedance.adsdk.lr.ik.lr.aw ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "r":
                    lrVarRi = ka.ri(jsonReader, xhaVar, true);
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
        if (zNextBoolean) {
            return null;
        }
        return new com.bytedance.adsdk.lr.ik.lr.aw(strNextString, lrVarRi);
    }
}
