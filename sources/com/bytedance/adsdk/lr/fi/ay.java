package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class ay {
    public static com.bytedance.adsdk.lr.ik.lr.mj ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lr.ik.lr.mj.ri riVar = null;
        com.bytedance.adsdk.lr.ik.ri.mj mjVarFi = null;
        com.bytedance.adsdk.lr.ik.ri.ka kaVarLr = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "o":
                    kaVarLr = ka.lr(jsonReader, xhaVar);
                    break;
                case "pt":
                    mjVarFi = ka.fi(jsonReader, xhaVar);
                    break;
                case "inv":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mode":
                    String strNextString = jsonReader.nextString();
                    strNextString.getClass();
                    switch (strNextString) {
                        case "a":
                            riVar = com.bytedance.adsdk.lr.ik.lr.mj.ri.MASK_MODE_ADD;
                            break;
                        case "i":
                            xhaVar.ri("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            riVar = com.bytedance.adsdk.lr.ik.lr.mj.ri.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            riVar = com.bytedance.adsdk.lr.ik.lr.mj.ri.MASK_MODE_NONE;
                            break;
                        case "s":
                            riVar = com.bytedance.adsdk.lr.ik.lr.mj.ri.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            riVar = com.bytedance.adsdk.lr.ik.lr.mj.ri.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lr.ik.lr.mj(riVar, mjVarFi, kaVarLr, zNextBoolean);
    }
}
