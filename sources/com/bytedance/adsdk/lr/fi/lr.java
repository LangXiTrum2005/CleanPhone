package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static com.bytedance.adsdk.lr.ik.ri.sf lr(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lr.ik.ri.ri riVarXha = null;
        com.bytedance.adsdk.lr.ik.ri.ri riVarXha2 = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "t":
                    lrVarRi2 = ka.ri(jsonReader, xhaVar);
                    break;
                case "fc":
                    riVarXha = ka.xha(jsonReader, xhaVar);
                    break;
                case "sc":
                    riVarXha2 = ka.xha(jsonReader, xhaVar);
                    break;
                case "sw":
                    lrVarRi = ka.ri(jsonReader, xhaVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lr.ik.ri.sf(riVarXha, riVarXha2, lrVarRi, lrVarRi2);
    }

    public static com.bytedance.adsdk.lr.ik.ri.sf ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lr.ik.ri.sf sfVarLr = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("a")) {
                sfVarLr = lr(jsonReader, xhaVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return sfVarLr == null ? new com.bytedance.adsdk.lr.ik.ri.sf(null, null, null, null) : sfVarLr;
    }
}
