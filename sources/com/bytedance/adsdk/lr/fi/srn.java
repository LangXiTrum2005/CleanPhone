package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import com.ironsource.A5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
class srn {
    public static com.bytedance.adsdk.lr.ik.lr.nr ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        int i;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        com.bytedance.adsdk.lr.ik.ri.ka kaVar = null;
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVar = null;
        com.bytedance.adsdk.lr.ik.ri.ri riVarXha = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi = null;
        com.bytedance.adsdk.lr.ik.lr.nr.ri riVar = null;
        com.bytedance.adsdk.lr.ik.lr.nr.lr lrVar2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i2 = 1;
            switch (strNextName) {
                case "c":
                    riVarXha = ka.xha(jsonReader, xhaVar);
                    continue;
                    break;
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals(A5.q)) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                lrVarRi2 = ka.ri(jsonReader, xhaVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        strNextString2.getClass();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                i = 1;
                                xhaVar.ri(true);
                                arrayList.add(lrVarRi2);
                                i2 = i;
                                break;
                            case "o":
                                lrVar = lrVarRi2;
                                i2 = 1;
                                break;
                            default:
                                i = 1;
                                i2 = i;
                                break;
                        }
                    }
                    int i3 = i2;
                    jsonReader.endArray();
                    if (arrayList.size() != i3) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                    }
                    break;
                case "o":
                    kaVar = ka.lr(jsonReader, xhaVar);
                    continue;
                    break;
                case "w":
                    lrVarRi = ka.ri(jsonReader, xhaVar);
                    continue;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    continue;
                    break;
                case "lc":
                    riVar = com.bytedance.adsdk.lr.ik.lr.nr.ri.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "lj":
                    lrVar2 = com.bytedance.adsdk.lr.ik.lr.nr.lr.values()[jsonReader.nextInt() - 1];
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
        if (kaVar == null) {
            kaVar = new com.bytedance.adsdk.lr.ik.ri.ka(Collections.singletonList(new com.bytedance.adsdk.lr.xha.ri(100)));
        }
        return new com.bytedance.adsdk.lr.ik.lr.nr(strNextString, lrVar, arrayList, riVarXha, kaVar, lrVarRi, riVar, lrVar2, fNextDouble, zNextBoolean);
    }
}
