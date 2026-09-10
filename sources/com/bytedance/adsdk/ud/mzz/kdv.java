package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class kdv {
    public static com.bytedance.adsdk.ud.lnr.ud.fs qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl2 = null;
        com.bytedance.adsdk.ud.lnr.qdl.fs fsVarQdl = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    udVarQdl = mml.qdl(jsonReader, wdVar, false);
                    break;
                case "o":
                    udVarQdl2 = mml.qdl(jsonReader, wdVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    fsVarQdl = lnr.qdl(jsonReader, wdVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ud.lnr.ud.fs(strNextString, udVarQdl, udVarQdl2, fsVarQdl, zNextBoolean);
    }
}
