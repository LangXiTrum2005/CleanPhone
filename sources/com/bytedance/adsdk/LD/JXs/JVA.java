package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import com.umeng.analytics.pro.bc;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class JVA {
    private com.bytedance.adsdk.LD.lk.Lxb.LD JXs;
    private com.bytedance.adsdk.LD.lk.Lxb.LD LD;
    private com.bytedance.adsdk.LD.lk.Lxb.Lxb Lxb;
    private com.bytedance.adsdk.LD.lk.Lxb.LD ZU;
    private com.bytedance.adsdk.LD.lk.Lxb.LD lk;

    private void LD(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals(bc.aK)) {
                strNextString.getClass();
                switch (strNextString) {
                    case "Distance":
                        this.ZU = ZU.Lxb(jsonReader, eblVar);
                        break;
                    case "Opacity":
                        this.LD = ZU.Lxb(jsonReader, eblVar, false);
                        break;
                    case "Direction":
                        this.lk = ZU.Lxb(jsonReader, eblVar, false);
                        break;
                    case "Shadow Color":
                        this.Lxb = ZU.ebl(jsonReader, eblVar);
                        break;
                    case "Softness":
                        this.JXs = ZU.Lxb(jsonReader, eblVar);
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

    public nBu Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        com.bytedance.adsdk.LD.lk.Lxb.LD ld;
        com.bytedance.adsdk.LD.lk.Lxb.LD ld2;
        com.bytedance.adsdk.LD.lk.Lxb.LD ld3;
        com.bytedance.adsdk.LD.lk.Lxb.LD ld4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    LD(jsonReader, eblVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.LD.lk.Lxb.Lxb lxb = this.Lxb;
        if (lxb == null || (ld = this.LD) == null || (ld2 = this.lk) == null || (ld3 = this.ZU) == null || (ld4 = this.JXs) == null) {
            return null;
        }
        return new nBu(lxb, ld, ld2, ld3, ld4);
    }
}
