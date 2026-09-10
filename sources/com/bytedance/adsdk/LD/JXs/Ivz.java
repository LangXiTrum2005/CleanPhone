package com.bytedance.adsdk.LD.JXs;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class Ivz {
    public static com.bytedance.adsdk.LD.lk.LD.nBu Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar, int i) throws IOException {
        boolean z = i == 3;
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.LD.nBu.Lxb Lxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> nxrLD = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb2 = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb3 = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb4 = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb5 = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb6 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "p":
                    nxrLD = Lxb.LD(jsonReader, eblVar);
                    break;
                case "r":
                    ldLxb2 = ZU.Lxb(jsonReader, eblVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    ldLxb3 = ZU.Lxb(jsonReader, eblVar);
                    break;
                case "is":
                    ldLxb5 = ZU.Lxb(jsonReader, eblVar, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    ldLxb4 = ZU.Lxb(jsonReader, eblVar);
                    break;
                case "os":
                    ldLxb6 = ZU.Lxb(jsonReader, eblVar, false);
                    break;
                case "pt":
                    ldLxb = ZU.Lxb(jsonReader, eblVar, false);
                    break;
                case "sy":
                    Lxb = com.bytedance.adsdk.LD.lk.LD.nBu.Lxb.Lxb(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.LD.lk.LD.nBu(strNextString, Lxb, ldLxb, nxrLD, ldLxb2, ldLxb3, ldLxb4, ldLxb5, ldLxb6, zNextBoolean, z);
    }
}
