package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import com.umeng.analytics.pro.bc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class Pw {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    public static com.bytedance.adsdk.LD.lk.LD.brP Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ld = null;
        com.bytedance.adsdk.LD.lk.Lxb.Lxb lxbEbl = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb = null;
        com.bytedance.adsdk.LD.lk.LD.brP.Lxb lxb = null;
        com.bytedance.adsdk.LD.lk.LD.brP.LD ld2 = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.LD.lk.Lxb.ZU zu = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    lxbEbl = ZU.ebl(jsonReader, eblVar);
                    continue;
                    break;
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb2 = null;
                        String strNextString2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals(bc.aK)) {
                                ldLxb2 = ZU.Lxb(jsonReader, eblVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        strNextString2.getClass();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                eblVar.Lxb(true);
                                arrayList.add(ldLxb2);
                                break;
                            case "o":
                                ld = ldLxb2;
                                break;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                    }
                    break;
                case "o":
                    zu = ZU.LD(jsonReader, eblVar);
                    continue;
                    break;
                case "w":
                    ldLxb = ZU.Lxb(jsonReader, eblVar);
                    continue;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    continue;
                    break;
                case "lc":
                    lxb = com.bytedance.adsdk.LD.lk.LD.brP.Lxb.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "lj":
                    ld2 = com.bytedance.adsdk.LD.lk.LD.brP.LD.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (zu == null) {
            zu = new com.bytedance.adsdk.LD.lk.Lxb.ZU(Collections.singletonList(new com.bytedance.adsdk.LD.ebl.Lxb(100)));
        }
        return new com.bytedance.adsdk.LD.lk.LD.brP(strNextString, ld, arrayList, lxbEbl, zu, ldLxb, lxb, ld2, fNextDouble, zNextBoolean);
    }
}
