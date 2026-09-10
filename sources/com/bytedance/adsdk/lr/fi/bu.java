package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import com.ironsource.A5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
class bu {
    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[PHI: r17
  0x00dd: PHI (r17v12 int) = 
  (r17v1 int)
  (r17v2 int)
  (r17v3 int)
  (r17v4 int)
  (r17v5 int)
  (r17v6 int)
  (r17v7 int)
  (r17v8 int)
  (r17v9 int)
  (r17v10 int)
  (r17v11 int)
  (r17v13 int)
 binds: [B:53:0x00db, B:49:0x00cf, B:45:0x00c2, B:41:0x00b7, B:37:0x00ac, B:33:0x009f, B:29:0x0092, B:25:0x0085, B:21:0x0075, B:17:0x0065, B:13:0x0055, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    public static com.bytedance.adsdk.lr.ik.lr.di ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        int i;
        byte b;
        com.bytedance.adsdk.lr.ik.ri.ik ikVar;
        com.bytedance.adsdk.lr.ik.ri.di diVar;
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.lr.xha xhaVar2 = null;
        com.bytedance.adsdk.lr.ik.ri.ik ikVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.di diVarIk = null;
        com.bytedance.adsdk.lr.ik.ri.di diVarIk2 = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi = null;
        com.bytedance.adsdk.lr.ik.lr.nr.ri riVar = null;
        com.bytedance.adsdk.lr.ik.lr.nr.lr lrVar = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVar2 = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.lr.ik.ri.ka kaVarLr = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            String str = strNextString;
            com.bytedance.adsdk.lr.ik.ri.ka kaVar = kaVarLr;
            com.bytedance.adsdk.lr.ik.lr.xha xhaVar3 = xhaVar2;
            switch (strNextName.hashCode()) {
                case 100:
                    i = 1;
                    if (!strNextName.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 101:
                    i = 1;
                    if (!strNextName.equals("e")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 103:
                    i = 1;
                    if (!strNextName.equals("g")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 111:
                    i = 1;
                    if (!strNextName.equals("o")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 115:
                    i = 1;
                    if (!strNextName.equals("s")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 116:
                    i = 1;
                    if (!strNextName.equals("t")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 119:
                    i = 1;
                    if (!strNextName.equals("w")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 3324:
                    i = 1;
                    if (!strNextName.equals("hd")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 3447:
                    i = 1;
                    if (!strNextName.equals("lc")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 3454:
                    i = 1;
                    if (!strNextName.equals("lj")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 3487:
                    i = 1;
                    if (!strNextName.equals("ml")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 3519:
                    i = 1;
                    if (!strNextName.equals("nm")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                default:
                    b = -1;
                    i = 1;
                    break;
            }
            switch (b) {
                case 0:
                    jsonReader = jsonReader;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi2 = null;
                        String strNextString2 = null;
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.lr.ik.ri.ik ikVar2 = ikVarRi;
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            com.bytedance.adsdk.lr.ik.ri.di diVar2 = diVarIk;
                            if (strNextName2.equals(A5.q)) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                lrVarRi2 = ka.ri(jsonReader, xhaVar);
                            } else {
                                jsonReader.skipValue();
                            }
                            ikVarRi = ikVar2;
                            diVarIk = diVar2;
                        }
                        ikVarRi = ikVarRi;
                        diVarIk = diVarIk;
                        jsonReader.endObject();
                        if (strNextString2.equals("o")) {
                            lrVar2 = lrVarRi2;
                        } else if (strNextString2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D) || strNextString2.equals("g")) {
                            xhaVar.ri(true);
                            arrayList.add(lrVarRi2);
                        }
                    }
                    ikVar = ikVarRi;
                    diVar = diVarIk;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    strNextString = str;
                    kaVarLr = kaVar;
                    ikVarRi = ikVar;
                    xhaVar2 = xhaVar3;
                    diVarIk = diVar;
                    break;
                case 1:
                    diVarIk2 = ka.ik(jsonReader, xhaVar);
                    strNextString = str;
                    kaVarLr = kaVar;
                    xhaVar2 = xhaVar3;
                    break;
                case 2:
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals(CampaignEx.JSON_KEY_AD_K)) {
                            ikVarRi = ka.ri(jsonReader, xhaVar, iNextInt);
                        } else if (strNextName3.equals(TtmlNode.TAG_P)) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strNextString = str;
                    kaVarLr = kaVar;
                    xhaVar2 = xhaVar3;
                    break;
                case 3:
                    kaVarLr = ka.lr(jsonReader, xhaVar);
                    strNextString = str;
                    xhaVar2 = xhaVar3;
                    break;
                case 4:
                    diVarIk = ka.ik(jsonReader, xhaVar);
                    strNextString = str;
                    kaVarLr = kaVar;
                    xhaVar2 = xhaVar3;
                    break;
                case 5:
                    xhaVar2 = jsonReader.nextInt() == i ? com.bytedance.adsdk.lr.ik.lr.xha.LINEAR : com.bytedance.adsdk.lr.ik.lr.xha.RADIAL;
                    strNextString = str;
                    kaVarLr = kaVar;
                    break;
                case 6:
                    lrVarRi = ka.ri(jsonReader, xhaVar);
                    strNextString = str;
                    kaVarLr = kaVar;
                    xhaVar2 = xhaVar3;
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    strNextString = str;
                    kaVarLr = kaVar;
                    xhaVar2 = xhaVar3;
                    break;
                case 8:
                    riVar = com.bytedance.adsdk.lr.ik.lr.nr.ri.values()[jsonReader.nextInt() - 1];
                    strNextString = str;
                    kaVarLr = kaVar;
                    xhaVar2 = xhaVar3;
                    break;
                case 9:
                    lrVar = com.bytedance.adsdk.lr.ik.lr.nr.lr.values()[jsonReader.nextInt() - 1];
                    strNextString = str;
                    kaVarLr = kaVar;
                    xhaVar2 = xhaVar3;
                    break;
                case 10:
                    fNextDouble = (float) jsonReader.nextDouble();
                    strNextString = str;
                    kaVarLr = kaVar;
                    xhaVar2 = xhaVar3;
                    break;
                case 11:
                    strNextString = jsonReader.nextString();
                    kaVarLr = kaVar;
                    xhaVar2 = xhaVar3;
                    break;
                default:
                    jsonReader.skipValue();
                    ikVar = ikVarRi;
                    diVar = diVarIk;
                    strNextString = str;
                    kaVarLr = kaVar;
                    ikVarRi = ikVar;
                    xhaVar2 = xhaVar3;
                    diVarIk = diVar;
                    break;
            }
        }
        com.bytedance.adsdk.lr.ik.ri.ka kaVar2 = kaVarLr;
        return new com.bytedance.adsdk.lr.ik.lr.di(strNextString, xhaVar2, ikVarRi, kaVar2 == null ? new com.bytedance.adsdk.lr.ik.ri.ka(Collections.singletonList(new com.bytedance.adsdk.lr.xha.ri(100))) : kaVar2, diVarIk, diVarIk2, lrVarRi, riVar, lrVar, fNextDouble, arrayList, lrVar2, zNextBoolean);
    }
}
