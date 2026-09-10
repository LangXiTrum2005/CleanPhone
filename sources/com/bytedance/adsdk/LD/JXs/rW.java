package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class rW {
    public static com.bytedance.adsdk.LD.lk.LD.kqm Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.Lxb.OY oyJXs = null;
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
                    oyJXs = ZU.JXs(jsonReader, eblVar);
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
        return new com.bytedance.adsdk.LD.lk.LD.kqm(strNextString, iNextInt, oyJXs, zNextBoolean);
    }
}
