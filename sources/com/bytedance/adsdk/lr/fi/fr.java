package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class fr {
    public static com.bytedance.adsdk.lr.ik.lr.jbs ri(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.lr.jbs.ri riVarRi = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    riVarRi = com.bytedance.adsdk.lr.ik.lr.jbs.ri.ri(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lr.ik.lr.jbs(strNextString, riVarRi, zNextBoolean);
    }
}
