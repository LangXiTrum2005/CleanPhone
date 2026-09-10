package com.bytedance.adsdk.LD.JXs;

import android.graphics.Path;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class VVE {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public static com.bytedance.adsdk.LD.lk.LD.JXs Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        com.bytedance.adsdk.LD.lk.Lxb.ZU zuLD = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.LD.ebl eblVar2 = null;
        com.bytedance.adsdk.LD.lk.Lxb.lk lkVarLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.lc lcVarLk = null;
        com.bytedance.adsdk.LD.lk.Lxb.lc lcVarLk2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int iNextInt = -1;
            switch (strNextName) {
                case "e":
                    lcVarLk2 = ZU.lk(jsonReader, eblVar);
                    break;
                case "g":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            lkVarLxb = ZU.Lxb(jsonReader, eblVar, iNextInt);
                        } else if (strNextName2.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "o":
                    zuLD = ZU.LD(jsonReader, eblVar);
                    break;
                case "r":
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case "s":
                    lcVarLk = ZU.lk(jsonReader, eblVar);
                    break;
                case "t":
                    eblVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.LD.lk.LD.ebl.LINEAR : com.bytedance.adsdk.LD.lk.LD.ebl.RADIAL;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.LD.lk.LD.JXs(strNextString, eblVar2, fillType, lkVarLxb, zuLD == null ? new com.bytedance.adsdk.LD.lk.Lxb.ZU(Collections.singletonList(new com.bytedance.adsdk.LD.ebl.Lxb(100))) : zuLD, lcVarLk, lcVarLk2, null, null, zNextBoolean);
    }
}
