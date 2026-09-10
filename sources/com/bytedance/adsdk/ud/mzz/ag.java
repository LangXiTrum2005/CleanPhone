package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class ag {
    public static com.bytedance.adsdk.ud.lnr.ud.exc qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ud.lnr.ud.exc.qdl qdlVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl2 = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    udVarQdl2 = mml.qdl(jsonReader, wdVar, false);
                    break;
                case "m":
                    qdlVarQdl = com.bytedance.adsdk.ud.lnr.ud.exc.qdl.qdl(jsonReader.nextInt());
                    break;
                case "o":
                    udVarQdl3 = mml.qdl(jsonReader, wdVar, false);
                    break;
                case "s":
                    udVarQdl = mml.qdl(jsonReader, wdVar, false);
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
        return new com.bytedance.adsdk.ud.lnr.ud.exc(strNextString, qdlVarQdl, udVarQdl, udVarQdl2, udVarQdl3, zNextBoolean);
    }
}
