package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class bch {
    public static com.bytedance.adsdk.ud.lnr.ud.jpc qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ud.lnr.ud.jpc.qdl qdlVar = null;
        com.bytedance.adsdk.ud.lnr.qdl.jpc jpcVarMzz = null;
        com.bytedance.adsdk.ud.lnr.qdl.mml mmlVarUd = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "o":
                    mmlVarUd = mml.ud(jsonReader, wdVar);
                    break;
                case "pt":
                    jpcVarMzz = mml.mzz(jsonReader, wdVar);
                    break;
                case "inv":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mode":
                    String strNextString = jsonReader.nextString();
                    strNextString.getClass();
                    switch (strNextString) {
                        case "a":
                            qdlVar = com.bytedance.adsdk.ud.lnr.ud.jpc.qdl.MASK_MODE_ADD;
                            break;
                        case "i":
                            wdVar.qdl("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            qdlVar = com.bytedance.adsdk.ud.lnr.ud.jpc.qdl.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            qdlVar = com.bytedance.adsdk.ud.lnr.ud.jpc.qdl.MASK_MODE_NONE;
                            break;
                        case "s":
                            qdlVar = com.bytedance.adsdk.ud.lnr.ud.jpc.qdl.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            qdlVar = com.bytedance.adsdk.ud.lnr.ud.jpc.qdl.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.ud.lnr.ud.jpc(qdlVar, jpcVarMzz, mmlVarUd, zNextBoolean);
    }
}
