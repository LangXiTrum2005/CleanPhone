package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class LD {
    private static com.bytedance.adsdk.LD.lk.Lxb.JVA LD(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.LD.lk.Lxb.Lxb lxbEbl = null;
        com.bytedance.adsdk.LD.lk.Lxb.Lxb lxbEbl2 = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "t":
                    ldLxb2 = ZU.Lxb(jsonReader, eblVar);
                    break;
                case "fc":
                    lxbEbl = ZU.ebl(jsonReader, eblVar);
                    break;
                case "sc":
                    lxbEbl2 = ZU.ebl(jsonReader, eblVar);
                    break;
                case "sw":
                    ldLxb = ZU.Lxb(jsonReader, eblVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.LD.lk.Lxb.JVA(lxbEbl, lxbEbl2, ldLxb, ldLxb2);
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.JVA Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.LD.lk.Lxb.JVA jvaLD = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("a")) {
                jvaLD = LD(jsonReader, eblVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return jvaLD == null ? new com.bytedance.adsdk.LD.lk.Lxb.JVA(null, null, null, null) : jvaLD;
    }
}
