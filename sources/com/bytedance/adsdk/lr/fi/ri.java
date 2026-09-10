package com.bytedance.adsdk.lr.fi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> lr(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lr.ik.ri.fi fiVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "k":
                    fiVarRi = ri(jsonReader, xhaVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        lrVarRi = ka.ri(jsonReader, xhaVar);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        lrVarRi2 = ka.ri(jsonReader, xhaVar);
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
            xhaVar.ri("Lottie doesn't support expressions.");
        }
        return fiVarRi != null ? fiVarRi : new com.bytedance.adsdk.lr.ik.ri.jbs(lrVarRi, lrVarRi2);
    }

    public static com.bytedance.adsdk.lr.ik.ri.fi ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(su.ri(jsonReader, xhaVar));
            }
            jsonReader.endArray();
            ihz.ri(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.lr.xha.ri(tan.lr(jsonReader, com.bytedance.adsdk.lr.di.di.ri())));
        }
        return new com.bytedance.adsdk.lr.ik.ri.fi(arrayList);
    }
}
