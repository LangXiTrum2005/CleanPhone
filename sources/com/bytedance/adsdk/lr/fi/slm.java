package com.bytedance.adsdk.lr.fi;

import android.graphics.Path;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
class slm {
    public static com.bytedance.adsdk.lr.ik.lr.fi ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        com.bytedance.adsdk.lr.ik.ri.ka kaVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.lr.xha xhaVar2 = null;
        com.bytedance.adsdk.lr.ik.ri.ik ikVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.di diVarIk = null;
        com.bytedance.adsdk.lr.ik.ri.di diVarIk2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int iNextInt = -1;
            switch (strNextName) {
                case "e":
                    diVarIk2 = ka.ik(jsonReader, xhaVar);
                    break;
                case "g":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            ikVarRi = ka.ri(jsonReader, xhaVar, iNextInt);
                        } else if (strNextName2.equals(TtmlNode.TAG_P)) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "o":
                    kaVar = ka.lr(jsonReader, xhaVar);
                    break;
                case "r":
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case "s":
                    diVarIk = ka.ik(jsonReader, xhaVar);
                    break;
                case "t":
                    xhaVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.lr.ik.lr.xha.LINEAR : com.bytedance.adsdk.lr.ik.lr.xha.RADIAL;
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
        if (kaVar == null) {
            kaVar = new com.bytedance.adsdk.lr.ik.ri.ka(Collections.singletonList(new com.bytedance.adsdk.lr.xha.ri(100)));
        }
        return new com.bytedance.adsdk.lr.ik.lr.fi(strNextString, xhaVar2, fillType, ikVarRi, kaVar, diVarIk, diVarIk2, null, null, zNextBoolean);
    }
}
