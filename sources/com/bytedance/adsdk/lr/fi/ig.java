package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class ig {
    public static com.bytedance.adsdk.lr.ik.lr.slm ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "it":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.lr.ik.lr.ik ikVarRi = mj.ri(jsonReader, xhaVar);
                        if (ikVarRi != null) {
                            arrayList.add(ikVarRi);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lr.ik.lr.slm(strNextString, arrayList, zNextBoolean);
    }
}
