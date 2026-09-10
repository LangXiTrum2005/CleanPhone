package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import com.p004ironsource.dc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class ax {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:70:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    public static com.bytedance.adsdk.ud.lnr.ud.jl qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        com.bytedance.adsdk.ud.lnr.qdl.mml mmlVarUd = null;
        String strNextString = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVar = null;
        com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVarWd = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl = null;
        com.bytedance.adsdk.ud.lnr.ud.jl.qdl qdlVar = null;
        com.bytedance.adsdk.ud.lnr.ud.jl.ud udVar2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    qdlVarWd = mml.wd(jsonReader, wdVar);
                    break;
                case "d":
                    mmlVar = mmlVarUd;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals(dc.q)) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                udVarQdl2 = mml.qdl(jsonReader, wdVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        strNextString2.getClass();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                wdVar.qdl(true);
                                arrayList.add(udVarQdl2);
                                break;
                            case "o":
                                udVar = udVarQdl2;
                                break;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    mmlVarUd = mmlVar;
                    break;
                case "o":
                    mmlVarUd = mml.ud(jsonReader, wdVar);
                    break;
                case "w":
                    udVarQdl = mml.qdl(jsonReader, wdVar);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "lc":
                    mmlVar = mmlVarUd;
                    qdlVar = com.bytedance.adsdk.ud.lnr.ud.jl.qdl.values()[jsonReader.nextInt() - 1];
                    mmlVarUd = mmlVar;
                    break;
                case "lj":
                    mmlVar = mmlVarUd;
                    udVar2 = com.bytedance.adsdk.ud.lnr.ud.jl.ud.values()[jsonReader.nextInt() - 1];
                    mmlVarUd = mmlVar;
                    break;
                case "ml":
                    mmlVar = mmlVarUd;
                    fNextDouble = (float) jsonReader.nextDouble();
                    mmlVarUd = mmlVar;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    mmlVar = mmlVarUd;
                    mmlVarUd = mmlVar;
                    break;
            }
        }
        com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar2 = mmlVarUd;
        return new com.bytedance.adsdk.ud.lnr.ud.jl(strNextString, udVar, arrayList, qdlVarWd, mmlVar2 == null ? new com.bytedance.adsdk.ud.lnr.qdl.mml(Collections.singletonList(new com.bytedance.adsdk.ud.wd.qdl(100))) : mmlVar2, udVarQdl, qdlVar, udVar2, fNextDouble, zNextBoolean);
    }
}
