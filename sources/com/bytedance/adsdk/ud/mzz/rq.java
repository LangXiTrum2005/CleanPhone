package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class rq {
    private com.bytedance.adsdk.ud.lnr.qdl.ud lnr;
    private com.bytedance.adsdk.ud.lnr.qdl.ud mml;
    private com.bytedance.adsdk.ud.lnr.qdl.ud mzz;
    private com.bytedance.adsdk.ud.lnr.qdl.qdl qdl;
    private com.bytedance.adsdk.ud.lnr.qdl.ud ud;

    private void ud(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("v")) {
                strNextString.getClass();
                switch (strNextString) {
                    case "Distance":
                        this.mml = mml.qdl(jsonReader, wdVar);
                        break;
                    case "Opacity":
                        this.ud = mml.qdl(jsonReader, wdVar, false);
                        break;
                    case "Direction":
                        this.lnr = mml.qdl(jsonReader, wdVar, false);
                        break;
                    case "Shadow Color":
                        this.qdl = mml.wd(jsonReader, wdVar);
                        break;
                    case "Softness":
                        this.mzz = mml.qdl(jsonReader, wdVar);
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

    public to qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        com.bytedance.adsdk.ud.lnr.qdl.ud udVar;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVar2;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVar3;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVar4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ud(jsonReader, wdVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVar = this.qdl;
        if (qdlVar == null || (udVar = this.ud) == null || (udVar2 = this.lnr) == null || (udVar3 = this.mml) == null || (udVar4 = this.mzz) == null) {
            return null;
        }
        return new to(qdlVar, udVar, udVar2, udVar3, udVar4);
    }
}
