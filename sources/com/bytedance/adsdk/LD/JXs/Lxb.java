package com.bytedance.adsdk.LD.JXs;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Lxb {
    public static com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> LD(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.LD.lk.Lxb.JXs jXsLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "k":
                    jXsLxb = Lxb(jsonReader, eblVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        ldLxb = ZU.Lxb(jsonReader, eblVar);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        ldLxb2 = ZU.Lxb(jsonReader, eblVar);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            eblVar.Lxb("Lottie doesn't support expressions.");
        }
        return jXsLxb != null ? jXsLxb : new com.bytedance.adsdk.LD.lk.Lxb.QAg(ldLxb, ldLxb2);
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.JXs Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(id.Lxb(jsonReader, eblVar));
            }
            jsonReader.endArray();
            Sfi.Lxb(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.LD.ebl.Lxb(tD.LD(jsonReader, com.bytedance.adsdk.LD.lc.lc.Lxb())));
        }
        return new com.bytedance.adsdk.LD.lk.Lxb.JXs(arrayList);
    }
}
