package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class CSn {
    public static com.bytedance.adsdk.LD.lk.LD.QAg Lxb(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.LD.QAg.Lxb Lxb = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    Lxb = com.bytedance.adsdk.LD.lk.LD.QAg.Lxb.Lxb(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.LD.lk.LD.QAg(strNextString, Lxb, zNextBoolean);
    }
}
