package com.bytedance.adsdk.ud.mzz;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    public static com.bytedance.adsdk.ud.lnr.qdl.mzz qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(xmv.qdl(jsonReader, wdVar));
            }
            jsonReader.endArray();
            jyq.qdl(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.ud.wd.qdl(exc.ud(jsonReader, com.bytedance.adsdk.ud.mo.mo.qdl())));
        }
        return new com.bytedance.adsdk.ud.lnr.qdl.mzz(arrayList);
    }

    public static com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> ud(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ud.lnr.qdl.mzz mzzVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl2 = null;
        boolean z2 = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "k":
                    mzzVarQdl = qdl(jsonReader, wdVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        udVarQdl = mml.qdl(jsonReader, wdVar);
                        break;
                    } else {
                        z2 = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        udVarQdl2 = mml.qdl(jsonReader, wdVar);
                        break;
                    } else {
                        z2 = true;
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
        if (z2) {
            wdVar.qdl("Lottie doesn't support expressions.");
        }
        return mzzVarQdl != null ? mzzVarQdl : new com.bytedance.adsdk.ud.lnr.qdl.tvp(udVarQdl, udVarQdl2);
    }
}
