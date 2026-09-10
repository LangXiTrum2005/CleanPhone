package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.bc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class kqm {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    public static com.bytedance.adsdk.LD.lk.LD.lc Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        com.bytedance.adsdk.LD.lk.LD.brP.Lxb lxb;
        com.bytedance.adsdk.LD.lk.LD.brP.LD ld;
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.LD.ebl eblVar2 = null;
        com.bytedance.adsdk.LD.lk.Lxb.lk lkVarLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.lc lcVarLk = null;
        com.bytedance.adsdk.LD.lk.Lxb.lc lcVarLk2 = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb = null;
        com.bytedance.adsdk.LD.lk.LD.brP.Lxb lxb2 = null;
        com.bytedance.adsdk.LD.lk.LD.brP.LD ld2 = null;
        float fNextDouble = 0.0f;
        com.bytedance.adsdk.LD.lk.Lxb.LD ld3 = null;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.LD.lk.Lxb.ZU zu = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            zNextBoolean = zNextBoolean;
            com.bytedance.adsdk.LD.lk.Lxb.LD ld4 = ld3;
            float f = fNextDouble;
            switch (strNextName) {
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb2 = null;
                        String strNextString2 = null;
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.LD.lk.LD.brP.LD ld5 = ld2;
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            com.bytedance.adsdk.LD.lk.LD.brP.Lxb lxb3 = lxb2;
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals(bc.aK)) {
                                ldLxb2 = ZU.Lxb(jsonReader, eblVar);
                            } else {
                                jsonReader.skipValue();
                            }
                            ld2 = ld5;
                            lxb2 = lxb3;
                        }
                        com.bytedance.adsdk.LD.lk.LD.brP.Lxb lxb4 = lxb2;
                        com.bytedance.adsdk.LD.lk.LD.brP.LD ld6 = ld2;
                        jsonReader.endObject();
                        if (strNextString2.equals("o")) {
                            ld4 = ldLxb2;
                        } else if (strNextString2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D) || strNextString2.equals("g")) {
                            eblVar.Lxb(true);
                            arrayList.add(ldLxb2);
                        }
                        ld2 = ld6;
                        lxb2 = lxb4;
                    }
                    lxb = lxb2;
                    ld = ld2;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                        ld3 = ld4;
                    } else {
                        ld3 = ld4;
                    }
                    ld2 = ld;
                    fNextDouble = f;
                    lxb2 = lxb;
                    break;
                case "e":
                    lcVarLk2 = ZU.lk(jsonReader, eblVar);
                    zNextBoolean = zNextBoolean;
                    ld3 = ld4;
                    fNextDouble = f;
                    break;
                case "g":
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals(CampaignEx.JSON_KEY_AD_K)) {
                            lkVarLxb = ZU.Lxb(jsonReader, eblVar, iNextInt);
                        } else if (strNextName3.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    zNextBoolean = zNextBoolean;
                    ld3 = ld4;
                    fNextDouble = f;
                    break;
                case "o":
                    zu = ZU.LD(jsonReader, eblVar);
                    zNextBoolean = zNextBoolean;
                    ld3 = ld4;
                    fNextDouble = f;
                    break;
                case "s":
                    lcVarLk = ZU.lk(jsonReader, eblVar);
                    zNextBoolean = zNextBoolean;
                    ld3 = ld4;
                    fNextDouble = f;
                    break;
                case "t":
                    eblVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.LD.lk.LD.ebl.LINEAR : com.bytedance.adsdk.LD.lk.LD.ebl.RADIAL;
                    zNextBoolean = zNextBoolean;
                    ld3 = ld4;
                    fNextDouble = f;
                    break;
                case "w":
                    ldLxb = ZU.Lxb(jsonReader, eblVar);
                    zNextBoolean = zNextBoolean;
                    ld3 = ld4;
                    fNextDouble = f;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    ld3 = ld4;
                    fNextDouble = f;
                    break;
                case "lc":
                    lxb2 = com.bytedance.adsdk.LD.lk.LD.brP.Lxb.values()[jsonReader.nextInt() - 1];
                    zNextBoolean = zNextBoolean;
                    ld3 = ld4;
                    fNextDouble = f;
                    break;
                case "lj":
                    ld2 = com.bytedance.adsdk.LD.lk.LD.brP.LD.values()[jsonReader.nextInt() - 1];
                    zNextBoolean = zNextBoolean;
                    ld3 = ld4;
                    fNextDouble = f;
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    zNextBoolean = zNextBoolean;
                    ld3 = ld4;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    zNextBoolean = zNextBoolean;
                    ld3 = ld4;
                    fNextDouble = f;
                    break;
                default:
                    jsonReader.skipValue();
                    lxb = lxb2;
                    ld = ld2;
                    ld3 = ld4;
                    ld2 = ld;
                    fNextDouble = f;
                    lxb2 = lxb;
                    break;
            }
        }
        com.bytedance.adsdk.LD.lk.LD.brP.Lxb lxb5 = lxb2;
        com.bytedance.adsdk.LD.lk.LD.brP.LD ld7 = ld2;
        float f2 = fNextDouble;
        com.bytedance.adsdk.LD.lk.Lxb.LD ld8 = ld3;
        boolean z = zNextBoolean;
        if (zu == null) {
            zu = new com.bytedance.adsdk.LD.lk.Lxb.ZU(Collections.singletonList(new com.bytedance.adsdk.LD.ebl.Lxb(100)));
        }
        return new com.bytedance.adsdk.LD.lk.LD.lc(strNextString, eblVar2, lkVarLxb, zu, lcVarLk, lcVarLk2, ldLxb, lxb5, ld7, f2, arrayList, ld8, z);
    }
}
