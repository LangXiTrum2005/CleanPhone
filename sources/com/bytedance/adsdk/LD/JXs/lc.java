package com.bytedance.adsdk.LD.JXs;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class lc {
    public static com.bytedance.adsdk.LD.lk.LD.LD Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar, int i) throws IOException {
        boolean z = i == 3;
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> nxrLD = null;
        com.bytedance.adsdk.LD.lk.Lxb.lc lcVarLk = null;
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
        return new com.bytedance.adsdk.LD.lk.LD.LD(strNextString, nxrLD, lcVarLk, z, zNextBoolean);
    }
}
