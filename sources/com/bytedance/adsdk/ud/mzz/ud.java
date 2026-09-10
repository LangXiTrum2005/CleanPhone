package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    public static com.bytedance.adsdk.ud.lnr.qdl.rq qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ud.lnr.qdl.rq rqVarUd = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("a")) {
                rqVarUd = ud(jsonReader, wdVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return rqVarUd == null ? new com.bytedance.adsdk.ud.lnr.qdl.rq(null, null, null, null) : rqVarUd;
    }

    private static com.bytedance.adsdk.ud.lnr.qdl.rq ud(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVarWd = null;
        com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVarWd2 = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "t":
                    udVarQdl2 = mml.qdl(jsonReader, wdVar);
                    break;
                case "fc":
                    qdlVarWd = mml.wd(jsonReader, wdVar);
                    break;
                case "sc":
                    qdlVarWd2 = mml.wd(jsonReader, wdVar);
                    break;
                case "sw":
                    udVarQdl = mml.qdl(jsonReader, wdVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.ud.lnr.qdl.rq(qdlVarWd, qdlVarWd2, udVarQdl, udVarQdl2);
    }
}
