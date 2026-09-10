package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import com.umeng.analytics.pro.bc;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class JXs {
    private static com.bytedance.adsdk.LD.lk.LD.Lxb LD(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.LD.lk.LD.Lxb lxb = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (!jsonReader.hasNext()) {
                    jsonReader.endObject();
                    return lxb;
                }
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(bc.aK)) {
                    if (z) {
                        lxb = new com.bytedance.adsdk.LD.lk.LD.Lxb(ZU.Lxb(jsonReader, eblVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (!strNextName.equals("ty")) {
                    jsonReader.skipValue();
                } else if (jsonReader.nextInt() == 0) {
                    z = true;
                }
            }
        }
    }

    public static com.bytedance.adsdk.LD.lk.LD.Lxb Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        com.bytedance.adsdk.LD.lk.LD.Lxb lxb = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.LD.lk.LD.Lxb lxbLD = LD(jsonReader, eblVar);
                    if (lxbLD != null) {
                        lxb = lxbLD;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return lxb;
    }
}
