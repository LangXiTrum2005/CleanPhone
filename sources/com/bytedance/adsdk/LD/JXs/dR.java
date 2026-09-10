package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class dR {
    public static com.bytedance.adsdk.LD.lk.LD.tD Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.LD.tD.Lxb Lxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb2 = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    ldLxb2 = ZU.Lxb(jsonReader, eblVar, false);
                    break;
                case "m":
                    Lxb = com.bytedance.adsdk.LD.lk.LD.tD.Lxb.Lxb(jsonReader.nextInt());
                    break;
                case "o":
                    ldLxb3 = ZU.Lxb(jsonReader, eblVar, false);
                    break;
                case "s":
                    ldLxb = ZU.Lxb(jsonReader, eblVar, false);
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
        return new com.bytedance.adsdk.LD.lk.LD.tD(strNextString, Lxb, ldLxb, ldLxb2, ldLxb3, zNextBoolean);
    }
}
