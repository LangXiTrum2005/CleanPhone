package com.bytedance.adsdk.ud.mzz;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class fco {
    public static com.bytedance.adsdk.ud.lnr.ud.bjy qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar = null;
        String strNextString = null;
        com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVarWd = null;
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
                    qdlVarWd = mml.wd(jsonReader, wdVar);
                    break;
                case "o":
                    mmlVar = mml.ud(jsonReader, wdVar);
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
        if (mmlVar == null) {
            mmlVar = new com.bytedance.adsdk.ud.lnr.qdl.mml(Collections.singletonList(new com.bytedance.adsdk.ud.wd.qdl(100)));
        }
        return new com.bytedance.adsdk.ud.lnr.ud.bjy(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, qdlVarWd, mmlVar, zNextBoolean2);
    }
}
