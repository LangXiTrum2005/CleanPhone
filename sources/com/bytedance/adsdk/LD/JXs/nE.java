package com.bytedance.adsdk.LD.JXs;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class nE {
    public static com.bytedance.adsdk.LD.lk.LD.JVA Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> nxrLD = null;
        com.bytedance.adsdk.LD.lk.Lxb.lc lcVarLk = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "p":
                    nxrLD = Lxb.LD(jsonReader, eblVar);
                    break;
                case "r":
                    ldLxb = ZU.Lxb(jsonReader, eblVar);
                    break;
                case "s":
                    lcVarLk = ZU.lk(jsonReader, eblVar);
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
        return new com.bytedance.adsdk.LD.lk.LD.JVA(strNextString, nxrLD, lcVarLk, ldLxb, zNextBoolean);
    }
}
