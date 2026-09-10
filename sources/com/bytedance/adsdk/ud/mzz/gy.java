package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class gy {
    public static com.bytedance.adsdk.ud.lnr.ud.yt qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ud.lnr.qdl.jpc jpcVarMzz = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ks":
                    jpcVarMzz = mml.mzz(jsonReader, wdVar);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "ind":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ud.lnr.ud.yt(strNextString, iNextInt, jpcVarMzz, zNextBoolean);
    }
}
