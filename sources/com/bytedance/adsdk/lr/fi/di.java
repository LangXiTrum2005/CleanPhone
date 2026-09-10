package com.bytedance.adsdk.lr.fi;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class di {
    public static com.bytedance.adsdk.lr.ik.lr.lr ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar, int i) throws IOException {
        boolean z = i == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> awVarLr = null;
        com.bytedance.adsdk.lr.ik.ri.di diVarIk = null;
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
                    awVarLr = ri.lr(jsonReader, xhaVar);
                    break;
                case "s":
                    diVarIk = ka.ik(jsonReader, xhaVar);
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
        return new com.bytedance.adsdk.lr.ik.lr.lr(strNextString, awVarLr, diVarIk, z, zNextBoolean);
    }
}
