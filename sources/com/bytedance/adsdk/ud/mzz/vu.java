package com.bytedance.adsdk.ud.mzz;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class vu {
    public static com.bytedance.adsdk.ud.lnr.ud.to qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, int i2) throws IOException {
        boolean zNextBoolean = false;
        boolean z2 = i2 == 3;
        String strNextString = null;
        com.bytedance.adsdk.ud.lnr.ud.to.qdl qdlVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> exuVarUd = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl2 = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl3 = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl4 = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl5 = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl6 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                    break;
                case "p":
                    exuVarUd = qdl.ud(jsonReader, wdVar);
                    break;
                case "r":
                    udVarQdl2 = mml.qdl(jsonReader, wdVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    udVarQdl3 = mml.qdl(jsonReader, wdVar);
                    break;
                case "is":
                    udVarQdl5 = mml.qdl(jsonReader, wdVar, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    udVarQdl4 = mml.qdl(jsonReader, wdVar);
                    break;
                case "os":
                    udVarQdl6 = mml.qdl(jsonReader, wdVar, false);
                    break;
                case "pt":
                    udVarQdl = mml.qdl(jsonReader, wdVar, false);
                    break;
                case "sy":
                    qdlVarQdl = com.bytedance.adsdk.ud.lnr.ud.to.qdl.qdl(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ud.lnr.ud.to(strNextString, qdlVarQdl, udVarQdl, exuVarUd, udVarQdl2, udVarQdl3, udVarQdl4, udVarQdl5, udVarQdl6, zNextBoolean, z2);
    }
}
