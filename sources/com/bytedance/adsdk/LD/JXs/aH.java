package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class aH {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static com.bytedance.adsdk.LD.lk.LD.OY Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.LD.lk.LD.OY.Lxb lxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.OY oyJXs = null;
        com.bytedance.adsdk.LD.lk.Lxb.ZU zuLD = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "o":
                    zuLD = ZU.LD(jsonReader, eblVar);
                    break;
                case "pt":
                    oyJXs = ZU.JXs(jsonReader, eblVar);
                    break;
                case "inv":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mode":
                    String strNextString = jsonReader.nextString();
                    strNextString.getClass();
                    switch (strNextString) {
                        case "a":
                            lxb = com.bytedance.adsdk.LD.lk.LD.OY.Lxb.MASK_MODE_ADD;
                            break;
                        case "i":
                            eblVar.Lxb("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            lxb = com.bytedance.adsdk.LD.lk.LD.OY.Lxb.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            lxb = com.bytedance.adsdk.LD.lk.LD.OY.Lxb.MASK_MODE_NONE;
                            break;
                        case "s":
                            lxb = com.bytedance.adsdk.LD.lk.LD.OY.Lxb.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            lxb = com.bytedance.adsdk.LD.lk.LD.OY.Lxb.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.LD.lk.LD.OY(lxb, oyJXs, zuLD, zNextBoolean);
    }
}
