package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class BcA {
    public static com.bytedance.adsdk.LD.lk.LD.VVE Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
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
                        com.bytedance.adsdk.LD.lk.LD.lk lkVarLxb = OY.Lxb(jsonReader, eblVar);
                        if (lkVarLxb != null) {
                            arrayList.add(lkVarLxb);
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
        return new com.bytedance.adsdk.LD.lk.LD.VVE(strNextString, arrayList, zNextBoolean);
    }
}
