package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class uw {
    public static com.bytedance.adsdk.ud.lnr.ud.tvp qdl(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ud.lnr.ud.tvp.qdl qdlVarQdl = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    qdlVarQdl = com.bytedance.adsdk.ud.lnr.ud.tvp.qdl.qdl(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ud.lnr.ud.tvp(strNextString, qdlVarQdl, zNextBoolean);
    }
}
