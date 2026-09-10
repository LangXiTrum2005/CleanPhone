package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class sf {
    private com.bytedance.adsdk.lr.ik.ri.lr fi;
    private com.bytedance.adsdk.lr.ik.ri.lr ik;
    private com.bytedance.adsdk.lr.ik.ri.lr ka;
    private com.bytedance.adsdk.lr.ik.ri.lr lr;
    private com.bytedance.adsdk.lr.ik.ri.ri ri;

    private void lr(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("v")) {
                strNextString.getClass();
                switch (strNextString) {
                    case "Distance":
                        this.ka = ka.ri(jsonReader, xhaVar);
                        break;
                    case "Opacity":
                        this.lr = ka.ri(jsonReader, xhaVar, false);
                        break;
                    case "Direction":
                        this.ik = ka.ri(jsonReader, xhaVar, false);
                        break;
                    case "Shadow Color":
                        this.ri = ka.xha(jsonReader, xhaVar);
                        break;
                    case "Softness":
                        this.fi = ka.ri(jsonReader, xhaVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    public qt ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        com.bytedance.adsdk.lr.ik.ri.lr lrVar;
        com.bytedance.adsdk.lr.ik.ri.lr lrVar2;
        com.bytedance.adsdk.lr.ik.ri.lr lrVar3;
        com.bytedance.adsdk.lr.ik.ri.lr lrVar4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    lr(jsonReader, xhaVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.lr.ik.ri.ri riVar = this.ri;
        if (riVar == null || (lrVar = this.lr) == null || (lrVar2 = this.ik) == null || (lrVar3 = this.ka) == null || (lrVar4 = this.fi) == null) {
            return null;
        }
        return new qt(riVar, lrVar, lrVar2, lrVar3, lrVar4);
    }
}
