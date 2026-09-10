package com.bytedance.adsdk.LD.JXs;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class le {
    public static com.bytedance.adsdk.LD.lk.LD.IeN Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        com.bytedance.adsdk.LD.lk.Lxb.ZU zu = null;
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.Lxb.Lxb lxbEbl = null;
        int iNextInt = 1;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    lxbEbl = ZU.ebl(jsonReader, eblVar);
                    break;
                case "o":
                    zu = ZU.LD(jsonReader, eblVar);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (zu == null) {
            zu = new com.bytedance.adsdk.LD.lk.Lxb.ZU(Collections.singletonList(new com.bytedance.adsdk.LD.ebl.Lxb(100)));
        }
        return new com.bytedance.adsdk.LD.lk.LD.IeN(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, lxbEbl, zu, zNextBoolean2);
    }
}
