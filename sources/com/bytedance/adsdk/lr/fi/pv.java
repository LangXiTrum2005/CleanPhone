package com.bytedance.adsdk.lr.fi;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
class pv {
    public static com.bytedance.adsdk.lr.ik.lr.vr ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        com.bytedance.adsdk.lr.ik.ri.ka kaVar = null;
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.ri.ri riVarXha = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    riVarXha = ka.xha(jsonReader, xhaVar);
                    break;
                case "o":
                    kaVar = ka.lr(jsonReader, xhaVar);
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
        if (kaVar == null) {
            kaVar = new com.bytedance.adsdk.lr.ik.ri.ka(Collections.singletonList(new com.bytedance.adsdk.lr.xha.ri(100)));
        }
        return new com.bytedance.adsdk.lr.ik.lr.vr(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, riVarXha, kaVar, zNextBoolean2);
    }
}
