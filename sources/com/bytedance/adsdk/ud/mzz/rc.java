package com.bytedance.adsdk.ud.mzz;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class rc {
    public static com.bytedance.adsdk.ud.lnr.ud.rq qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> exuVarUd = null;
        com.bytedance.adsdk.ud.lnr.qdl.mo moVarLnr = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "p":
                    exuVarUd = qdl.ud(jsonReader, wdVar);
                    break;
                case "r":
                    udVarQdl = mml.qdl(jsonReader, wdVar);
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
        return new com.bytedance.adsdk.ud.lnr.ud.rq(strNextString, exuVarUd, moVarLnr, udVarQdl, zNextBoolean);
    }
}
