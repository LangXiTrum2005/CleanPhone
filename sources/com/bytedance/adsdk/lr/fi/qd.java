package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class qd {
    public static com.bytedance.adsdk.lr.ik.lr.bu ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.ri.mj mjVarFi = null;
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
                    mjVarFi = ka.fi(jsonReader, xhaVar);
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
        return new com.bytedance.adsdk.lr.ik.lr.bu(strNextString, iNextInt, mjVarFi, zNextBoolean);
    }
}
