package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class fi {
    private static com.bytedance.adsdk.lr.ik.lr.ri lr(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lr.ik.lr.ri riVar = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (!jsonReader.hasNext()) {
                    jsonReader.endObject();
                    return riVar;
                }
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("v")) {
                    if (z) {
                        riVar = new com.bytedance.adsdk.lr.ik.lr.ri(ka.ri(jsonReader, xhaVar));
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

    public static com.bytedance.adsdk.lr.ik.lr.ri ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        com.bytedance.adsdk.lr.ik.lr.ri riVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.lr.ik.lr.ri riVarLr = lr(jsonReader, xhaVar);
                    if (riVarLr != null) {
                        riVar = riVarLr;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return riVar;
    }
}
