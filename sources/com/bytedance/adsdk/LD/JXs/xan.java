package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class xan {
    public static com.bytedance.adsdk.LD.lk.LD.sLN Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb2 = null;
        com.bytedance.adsdk.LD.lk.Lxb.sLN slnLxb = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    ldLxb = ZU.Lxb(jsonReader, eblVar, false);
                    break;
                case "o":
                    ldLxb2 = ZU.Lxb(jsonReader, eblVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    slnLxb = lk.Lxb(jsonReader, eblVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.LD.lk.LD.sLN(strNextString, ldLxb, ldLxb2, slnLxb, zNextBoolean);
    }
}
