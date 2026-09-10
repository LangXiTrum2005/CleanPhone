package com.bytedance.adsdk.ud.mzz;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class mo {
    public static com.bytedance.adsdk.ud.lnr.ud.ud qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, int i2) throws IOException {
        boolean z2 = i2 == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> exuVarUd = null;
        com.bytedance.adsdk.ud.lnr.qdl.mo moVarLnr = null;
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
                case "s":
                    moVarLnr = mml.lnr(jsonReader, wdVar);
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
        return new com.bytedance.adsdk.ud.lnr.ud.ud(strNextString, exuVarUd, moVarLnr, z2, zNextBoolean);
    }
}
